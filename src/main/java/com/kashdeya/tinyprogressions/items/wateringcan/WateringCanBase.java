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
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraft.block.AbstractBlock.AbstractBlockState;

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
    	super(prop.stacksTo(1));
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
                ItemStack offhand = player.getItemInHand(Hand.OFF_HAND);
                
                if(offhand.getItem() != TechItems.watering_can.get() && offhand.getItem() != TechItems.watering_can_upgrade.get())
                    forceActive = false;
            }
            
            RayTraceResult raytrace = getPlayerPOVHitResult(worldIn, player, FluidMode.NONE);
            if(raytrace != null && raytrace.getType() == Type.BLOCK)
            {
            	BlockRayTraceResult blockraytraceresult = (BlockRayTraceResult)raytrace;
            	
                attemptWaterParticles(worldIn, blockraytraceresult.getBlockPos());
                attemptWater(worldIn, blockraytraceresult.getBlockPos());
            }
        }
    }

    
	@Override
	public UseAction getUseAnimation(ItemStack stack) {
        return UseAction.NONE;
    }


	@Override
	public Rarity getRarity(ItemStack stack) {
        return isFoil(stack) ? Rarity.UNCOMMON : Rarity.COMMON;
    }

    @Override
    public boolean isFoil(ItemStack stack)
    {
        return forceActive;
    }

    int clicks = 0;

    @Override
    public ActionResultType useOn(ItemUseContext context) 
    {
    	World world = context.getLevel();
    	PlayerEntity player = context.getPlayer();
    	BlockPos pos = context.getClickedPos();
    	Hand hand = context.getHand();
    	Direction facing = context.getClickedFace();
    	
        if(!world.isClientSide() && player.isCrouching())
        {
            int wateringcanCount = (int) IntStream.range(0, player.inventory.getContainerSize()).mapToObj(i -> player.inventory.getItem(i)).filter(itemstack -> itemstack != ItemStack.EMPTY).map(ItemStack::getItem).filter(item -> item == TechItems.watering_can.get() || item == TechItems.watering_can_upgrade.get()).count();

            if(wateringcanCount <= 1)
            {
                if(wateringcanCount == 1)   // This should always be true given the above check (we should never get a count of 0)
                    forceActive = !forceActive;
                
                return ActionResultType.FAIL;
            }
            
            forceActive = false;
            player.sendMessage(new TranslationTextComponent("item.watering_can.invalidusage"), player.getUUID());
        }

        if(!player.mayUseItemAt(pos.relative(facing), facing, player.getItemInHand(hand)))
        {
            return ActionResultType.FAIL;
        }

        attemptWaterParticles(world, pos);
        return attemptWater(world, pos);
    }

    private ActionResultType attemptWater(World world, BlockPos pos)
    {
        if(!world.isClientSide() && canWater)
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
                            BlockState checkBlock = world.getBlockState(pos.offset(xAxis, yAxis, zAxis));
                         	
                            if(checkBlock.getBlock() instanceof IGrowable || checkBlock.getBlock() == Blocks.MYCELIUM
                                    || checkBlock.getBlock() == Blocks.CACTUS || checkBlock.getBlock() == Blocks.SUGAR_CANE
                                    || checkBlock.getBlock() == Blocks.CHORUS_FLOWER)
                            {
                            	if(checkBlock.getBlock() instanceof CropsBlock)
                            		checkBlock.tick((ServerWorld) world, pos.offset(xAxis, yAxis, zAxis), world.random);
                            	else
                            		world.sendBlockUpdated(pos.offset(xAxis, yAxis, zAxis), checkBlock, checkBlock, 2);
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
                    double d0 = pos.offset(x, 0, z).getX() + rand.nextFloat();
                    double d1 = pos.offset(x, 0, z).getY() + 1.0D;
                    double d2 = pos.offset(x, 0, z).getZ() + rand.nextFloat();

                    BlockState checkSolidState = world.getBlockState(pos);
                    Block checkSolid = checkSolidState.getBlock();
                    // if(checkSolid.isNormalCube(checkSolidState, world, pos) || (checkSolid instanceof FarmlandBlock))
                    // {
                       // d1 += 1.0D;
                    //}

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

            if(igrowable.isValidBonemealTarget(worldIn, target, iblockstate, worldIn.isClientSide()))
            {
                if(!worldIn.isClientSide())
                {
                    if(igrowable.isBonemealSuccess(worldIn, worldIn.random, target, iblockstate))
                    {
                        igrowable.performBonemeal((ServerWorld) worldIn, worldIn.random, target, iblockstate);
                    }

                    stack.setCount(stack.getCount() - 1);
                }

                return true;
            }
        }
        return false;
    }
    
    
    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
    	if(stack.getItem() == TechItems.watering_can.get()) { 
    		tooltip.add(new TranslationTextComponent("tooltip.can_1"));
    		tooltip.add(new TranslationTextComponent("tooltip.can_1"));
    		tooltip.add(new TranslationTextComponent("tooltip.can_1"));
    	}else {
    		tooltip.add(new TranslationTextComponent("tooltip.canupgrade_1"));
    		tooltip.add(new TranslationTextComponent("tooltip.canupgrade_2"));
    		tooltip.add(new TranslationTextComponent("tooltip.canupgrade_3"));
    	}
	}
}
