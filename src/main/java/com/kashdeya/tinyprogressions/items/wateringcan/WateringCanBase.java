package com.kashdeya.tinyprogressions.items.wateringcan;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.util.CanUtil;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Rarity;
import net.minecraft.item.UseAction;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext.FluidMode;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.ForgeEventFactory;

public class WateringCanBase extends ItemBase
{

    private int     range            = 1;
    private int     waterChance      = 100;

    private boolean canWater         = false;
    private boolean showParticlTicks = false;

    private boolean forceActive      = false;

    private long    ticksInUse;

    public WateringCanBase(Properties prop)
    {
    	super(prop.maxStackSize(1));
    }

    public WateringCanBase setWateringRange(int newRange)
    {
        this.range = newRange;
        return this;
    }

    public WateringCanBase setWateringChance(int newChance)
    {
        this.waterChance = newChance;
        return this;
    }
    
    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
    {
        ticksInUse++;

        if(ticksInUse % 4 == 0)
        {
            showParticlTicks = true;
            canWater = true;
        }
        
        if(forceActive && entityIn instanceof PlayerEntity)
        {
        	PlayerEntity player = (PlayerEntity)entityIn;
            
            if(!isSelected)
            {
                ItemStack offhand = player.getHeldItem(Hand.OFF_HAND);
                
                if(offhand.getItem() != TechItems.watering_can.get() && offhand.getItem() != TechItems.watering_can_upgrade.get())
                    forceActive = false;
            }
            
            RayTraceResult raytrace = rayTrace(worldIn, player, FluidMode.NONE);
            if(raytrace != null && raytrace.getType() == Type.BLOCK)
            {
            	BlockRayTraceResult blockraytraceresult = (BlockRayTraceResult)raytrace;
            	
                attemptWaterParticles(worldIn, blockraytraceresult.getPos());
                attemptWater(worldIn, blockraytraceresult.getPos());
            }
        }
    }

    
	@Override
	public UseAction getUseAction(ItemStack stack) {
        return UseAction.NONE;
    }


	@Override
	public Rarity getRarity(ItemStack stack) {
        return hasEffect(stack) ? Rarity.UNCOMMON : Rarity.COMMON;
    }

    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return forceActive;
    }

    int clicks = 0;

    @Override
    public ActionResultType onItemUse(ItemUseContext context) 
    {
    	World world = context.getWorld();
    	PlayerEntity player = context.getPlayer();
    	BlockPos pos = context.getPos();
    	Hand hand = context.getHand();
    	Direction facing = context.getFace();
    	
        if(!world.isRemote && player.isCrouching())
        {
            int wateringcanCount = (int) IntStream.range(0, player.inventory.getSizeInventory()).mapToObj(i -> player.inventory.getStackInSlot(i)).filter(itemstack -> itemstack != ItemStack.EMPTY).map(ItemStack::getItem).filter(item -> item == TechItems.watering_can.get() || item == TechItems.watering_can_upgrade.get()).count();

            if(wateringcanCount <= 1)
            {
                if(wateringcanCount == 1)   // This should always be true given the above check (we should never get a count of 0)
                    forceActive = !forceActive;
                
                return ActionResultType.FAIL;
            }
            
            forceActive = false;
            player.sendMessage(new TranslationTextComponent("item.watering_can.invalidusage"));
        }

        if(!player.canPlayerEdit(pos.offset(facing), facing, player.getHeldItem(hand)))
        {
            return ActionResultType.FAIL;
        }

        attemptWaterParticles(world, pos);
        return attemptWater(world, pos);
    }

    private ActionResultType attemptWater(World world, BlockPos pos)
    {
        if(!world.isRemote && canWater)
        {

            canWater = false;
            int chance = CanUtil.randInt(1, 100);
            if(chance <= waterChance)
            {
                for(int xAxis = -range; xAxis <= range; xAxis++)
                {
                    for(int zAxis = -range; zAxis <= range; zAxis++)
                    {
                        for(int yAxis = -range; yAxis <= range; yAxis++)
                        {
                            BlockState checkBlock = world.getBlockState(pos.add(xAxis, yAxis, zAxis));
                         	
                            if(checkBlock.getBlock() instanceof IGrowable || checkBlock.getBlock() == Blocks.MYCELIUM
                                    || checkBlock.getBlock() == Blocks.CACTUS || checkBlock.getBlock() == Blocks.SUGAR_CANE
                                    || checkBlock.getBlock() == Blocks.CHORUS_FLOWER)
                            {
                            	if(checkBlock.getBlock() instanceof CropsBlock)
                            		checkBlock.getBlock().func_225534_a_(checkBlock, (ServerWorld) world, pos.add(xAxis, yAxis, zAxis), world.rand);
                            	else
                            		world.notifyBlockUpdate(pos.add(xAxis, yAxis, zAxis), checkBlock, checkBlock, 2);
                            }
                        }
                    }
                }
                return ActionResultType.FAIL;
            }
        }
        return ActionResultType.FAIL;
    }
    
	private void attemptWaterParticles(World world, BlockPos pos)
    {
        // Dont show particals if you cant water yet.
        if(this.showParticlTicks)
        {
            this.showParticlTicks = false;

            Random rand = new Random();
            for(int x = -range; x <= range; x++)
            {
                for(int z = -range; z <= range; z++)
                {
                    double d0 = pos.add(x, 0, z).getX() + rand.nextFloat();
                    double d1 = pos.add(x, 0, z).getY() + 1.0D;
                    double d2 = pos.add(x, 0, z).getZ() + rand.nextFloat();

                    BlockState checkSolidState = world.getBlockState(pos);
                    Block checkSolid = checkSolidState.getBlock();
                    if(checkSolid.isNormalCube(checkSolidState, world, pos) || (checkSolid instanceof FarmlandBlock))
                    {
                        d1 += 1.0D;
                    }

                    world.addParticle(ParticleTypes.RAIN, d0, d1, d2, 0.0D, 0.0D, 0.0D);
                }
            }
        }
    }

    public static boolean applyBonemeal(ItemStack stack, World worldIn, BlockPos target, PlayerEntity player, Hand hand)
    {

        BlockState iblockstate = worldIn.getBlockState(target);
        int hook = ForgeEventFactory.onApplyBonemeal(player, worldIn, target, iblockstate, stack);
        if(hook != 0)
            return hook > 0;
        if((iblockstate.getBlock() instanceof IGrowable && iblockstate.getBlock() != Blocks.GRASS))
        {
            IGrowable igrowable = (IGrowable)iblockstate.getBlock();

            if(igrowable.canGrow(worldIn, target, iblockstate, worldIn.isRemote))
            {
                if(!worldIn.isRemote)
                {
                    if(igrowable.canUseBonemeal(worldIn, worldIn.rand, target, iblockstate))
                    {
                        igrowable.func_225535_a_((ServerWorld) worldIn, worldIn.rand, target, iblockstate);
                    }

                    stack.setCount(stack.getCount() - 1);
                }

                return true;
            }
        }
        return false;
    }
    
    
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
    	if(stack.getItem() == TechItems.watering_can.get()) { 
    		tooltip.add(new TranslationTextComponent("tooltip.can_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    		tooltip.add(new TranslationTextComponent("tooltip.can_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    		tooltip.add(new TranslationTextComponent("tooltip.can_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    	}else {
    		tooltip.add(new TranslationTextComponent("tooltip.canupgrade_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    		tooltip.add(new TranslationTextComponent("tooltip.canupgrade_2").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    		tooltip.add(new TranslationTextComponent("tooltip.canupgrade_3").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    	}
	}
}
