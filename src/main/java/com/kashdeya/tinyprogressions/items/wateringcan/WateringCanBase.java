package com.kashdeya.tinyprogressions.items.wateringcan;

import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.CanUtil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class WateringCanBase extends Item
{
    private int effectRange = 1;
    private int effectChance = 100;
    private int effectCoolDownTicks = 4;

    private boolean waterParticlesEnabled = true;
    private int waterParticleCoolDownTicks = 2;

    private int ticksUsedCount = 0;

    public WateringCanBase()
    {
        this.setMaxStackSize(1);
        this.setCreativeTab(TinyProgressions.tabTP);
    }

    protected int getWateringEffectRange()
    {
        return this.effectRange;
    }

    protected void setWateringEffectRange(int value)
    {
        this.effectRange = value;
    }

    protected int getWateringEffectChance()
    {
        return this.effectChance;
    }

    protected void setWateringEffectChance(int value)
    {
        this.effectChance = value;
    }

    protected boolean getWaterParticlesEnabled()
    {
        return this.waterParticlesEnabled;
    }

    protected void setWaterParticlesEnabled(boolean value)
    {
        this.waterParticlesEnabled = value;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.NONE;
    }

    @Override
    public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.UNCOMMON;
    }

    @Override
    public boolean doesSneakBypassUse(ItemStack stack, IBlockAccess world, BlockPos pos, EntityPlayer player)
    {
        return false;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack mainhand = player.getHeldItemMainhand();
        ItemStack offhand = player.getHeldItemOffhand();

        // Ensure the player is actually holding a watering can and can use it.
        if ((!isWateringCanStack(mainhand) || !player.canPlayerEdit(pos, facing, mainhand)) &&
            (!isWateringCanStack(offhand) || !player.canPlayerEdit(pos, facing, offhand)))
            return EnumActionResult.FAIL;

        if (!worldIn.isRemote)
        {
            ticksUsedCount++;

            // Ensure that we're following effect cool down.
            if (ticksUsedCount % effectCoolDownTicks != 0)
                return EnumActionResult.FAIL;

            attemptWaterTick(worldIn, pos);
            return EnumActionResult.FAIL;
        }
        else
        {
            // Ensure that we're following particle cool down.
            if (ticksUsedCount % waterParticleCoolDownTicks != 0)
                return EnumActionResult.FAIL;


            attemptWaterParticleTick(worldIn, pos);
            return EnumActionResult.FAIL;
        }
    }

    private EnumActionResult attemptWaterTick(World world, BlockPos position)
    {
        if (!world.isRemote)
        {
            int chance = CanUtil.randInt(1, 100);
            if (chance <= getWateringEffectChance())
            {
                int range = getWateringEffectRange();
                for (int x = -range; x <= range; x++)
                {
                    for (int z = -range; z <= range; z++)
                    {
                        for (int y = -range; y <= range; y++)
                        {
                            BlockPos offsetPosition = position.add(x, y, z);
                            Block block = world.getBlockState(offsetPosition).getBlock();

                            if (isGrowableBlock(block))
                            {
                                world.scheduleBlockUpdate(offsetPosition, block, 0, 1);
                            }
                        }
                    }
                }

                return EnumActionResult.FAIL;
            }
        }

        return EnumActionResult.FAIL;
    }

    private void attemptWaterParticleTick(World world, BlockPos position)
    {
        if (world.isRemote && getWaterParticlesEnabled())
        {
            Random rand = new Random();
            int range = getWateringEffectRange();
            for (int x = -range; x <= range; x++)
            {
                for (int z = -range; z <= range; z++)
                {
                    double xPos = position.add(x, 0, z).getX() + rand.nextFloat();
                    double yPos = position.add(x, 0, z).getY() + 1.0D;
                    double zPos = position.add(x, 0, z).getZ() + rand.nextFloat();

                    IBlockState blockState = world.getBlockState(position);
                    Block block = blockState.getBlock();

                    if (blockState.isFullCube() || block instanceof BlockFarmland)
                    {
                        yPos += 1.0D;
                    }

                    world.spawnParticle(EnumParticleTypes.WATER_DROP, xPos, yPos, zPos, 0.0D, 0.0D, 0.0D, new int[5]);
                }
            }
        }
    }

    private boolean isGrowableBlock(Block block)
    {
        return block instanceof IGrowable ||
               block == Blocks.MYCELIUM ||
               block == Blocks.CACTUS ||
               block == Blocks.REEDS ||
               block == Blocks.CHORUS_FLOWER;
    }

    private boolean isWateringCanStack(ItemStack stack)
    {
        return !stack.isEmpty() &&
               (stack.getItem() == TechItems.watering_can ||
                stack.getItem() == TechItems.watering_can_upgrade);
    }
}
