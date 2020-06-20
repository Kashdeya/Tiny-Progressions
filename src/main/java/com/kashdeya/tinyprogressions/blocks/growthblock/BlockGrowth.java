package com.kashdeya.tinyprogressions.blocks.growthblock;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.FarmlandWaterManager;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.ticket.AABBTicket;

public class BlockGrowth extends Block {

    private final int range;
    private final int rangeY;
    private final int growthLvl;
    private AABBTicket waterRegion;

    public BlockGrowth(Properties prop, int level, int rangeX, int rangeY) {
        super(prop
                .tickRandomly()
                .hardnessAndResistance(8, 1000)
                .lightValue(7)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.METAL)
                .func_226896_b_());

        this.range = rangeX;
        this.rangeY = rangeY;
        this.growthLvl = level;
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        makeWaterRegion(worldIn, pos);
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        removeWaterRegion();
    }

    @Override
    public void onExplosionDestroy(World worldIn, BlockPos pos, Explosion explosionIn) {
        removeWaterRegion();
    }

    private void makeWaterRegion(World worldIn, BlockPos pos) {
        if (this.growthLvl > 1 && !worldIn.isRemote) {
            waterRegion = FarmlandWaterManager.addAABBTicket(worldIn, new AxisAlignedBB(pos).expand(range * 2, rangeY * 2, range * 2).offset(-range, -range, -range));
        }
    }

    private void removeWaterRegion() {
        if (waterRegion != null)
            waterRegion.invalidate();
    }

    @Override
    public void func_225534_a_(BlockState state, ServerWorld world, BlockPos pos, Random rand) {
        if (this.waterRegion == null)
            makeWaterRegion(world, pos);
        this.growCropsNearby(world, pos, state);
    }


    private int getGrowthCrystalTickRate() {
        int tickRate = this.growthLvl == 1 ? ConfigHandler.BlockGrowthTicks :
                this.growthLvl == 2 ? ConfigHandler.BlockGrowthUpgradeTicks :
                        this.growthLvl == 3 ? ConfigHandler.BlockGrowthUpgradeTwoTicks : 40;

        return tickRate * 40;
    }

    private int getGrowthCrystalTickRate(double distanceCoefficient) {
        int tickRate = this.growthLvl == 1 ? ConfigHandler.BlockGrowthTicks :
                this.growthLvl == 2 ? ConfigHandler.BlockGrowthUpgradeTicks :
                        this.growthLvl == 3 ? ConfigHandler.BlockGrowthUpgradeTwoTicks : 40;

        return (int) (distanceCoefficient * tickRate * 40);
    }

    public void growCropsNearby(ServerWorld world, BlockPos pos, BlockState state) {
        int xO = pos.getX();
        int yO = pos.getY();
        int zO = pos.getZ();

        for (int xD = -range; xD <= range; xD++) {
            for (int yD = -rangeY; yD <= rangeY; yD++) {
                for (int zD = -range; zD <= range; zD++) {
                    int x = xO + xD;
                    int y = yO + yD;
                    int z = zO + zD;

                    double distance = Math.sqrt(Math.pow(x - xO, 2) + Math.pow(y - yO, 2) + Math.pow(z - zO, 2));
                    distance = Math.max(1D, distance);
                    double distanceCoefficient = 1D - (1D / distance);
                    BlockPos curPos = new BlockPos(x, y, z);
                    BlockState cropState = world.getBlockState(curPos);
                    Block cropBlock = cropState.getBlock();

                    if (cropBlock instanceof IPlantable || cropBlock instanceof IGrowable) {
                        if (!(cropBlock instanceof BlockGrowth)) {

                            cropBlock.func_225534_a_(cropState, world, curPos, RANDOM);
                            //Make sure you dont already have a pending block tick
                            if (!world.getPendingBlockTicks().isTickPending(pos, this))
                                world.getPendingBlockTicks().scheduleTick(pos, this, getGrowthCrystalTickRate(distanceCoefficient));
                        }
                    }
                }
            }
        }
        if (!world.getPendingBlockTicks().isTickPending(pos, this))
            world.getPendingBlockTicks().scheduleTick(pos, state.getBlock(), getGrowthCrystalTickRate());
    }

    @Override
    public boolean canDropFromExplosion(Explosion explosionIn) {
        return false;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        {
            if (ConfigHandler.ParticalTicks) {
                super.animateTick(stateIn, worldIn, pos, rand);

                for (int i = -4; i <= 4; ++i) {
                    for (int j = -4; j <= 4; ++j) {
                        if (i > -4 && i < 4 && j == -2) {
                            j = 4;
                        }

                        if (rand.nextInt(ConfigHandler.GrowthParticalTicks) == 0) {
                            for (int k = 0; k <= 1; ++k) {
                                for (int xAxis = -range; xAxis <= range; xAxis++) {
                                    for (int zAxis = -range; zAxis <= range; zAxis++) {
                                        for (int yAxis = -rangeY; yAxis <= rangeY; yAxis++) {
                                            BlockPos blockpos = pos.add(i, k, j);
                                            Block checkBlock = worldIn.getBlockState(blockpos.add(xAxis, yAxis, zAxis)).getBlock();

                                            if (checkBlock instanceof IGrowable || checkBlock == Blocks.MYCELIUM || checkBlock == Blocks.CACTUS || checkBlock == Blocks.SUGAR_CANE || checkBlock == Blocks.CHORUS_FLOWER) {
                                                worldIn.addParticle(ParticleTypes.ENCHANT, (double) pos.getX() + 0.5D, (double) pos.getY() + 2.0D, (double) pos.getZ() + 0.5D, (double) ((float) i + rand.nextFloat()) - 0.5D, (float) k - rand.nextFloat() - 1.0F, (double) ((float) j + rand.nextFloat()) - 0.5D);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

//	@Override
//    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
//    {
//        return false;
//    }
//	
//	@Override
//	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos)
//	{
//	    return true;
//	}
//	
//	@Override
//	public boolean isSideSolid(IBlockState base_state, IBlockAccess world, BlockPos pos, EnumFacing side)
//	{
//		return world.getBlockState(pos).getMaterial().isSolid();
//	}
//	
//	@Override
//	public boolean isTopSolid(IBlockState state)
//	{
//		return state.getMaterial().isSolid();
//	}
//	
//	@Override
//    public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side)
//    {
//        return this.canPlaceBlockAt(worldIn, pos);
//    }
//
//	protected static void addCollisionBoxToList(BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable AxisAlignedBB blockBox)
//    {
//        if (blockBox != NULL_AABB)
//        {
//            AxisAlignedBB axisalignedbb = blockBox.offset(pos);
//
//            if (entityBox.intersects(axisalignedbb))
//            {
//                collidingBoxes.add(axisalignedbb);
//            }
//        }
//    }
//	

    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        switch (growthLvl) {
            case 1:
                tooltip.add(new TranslationTextComponent("tooltip.growth_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
                tooltip.add(new TranslationTextComponent("tooltip.growth_2", range + 1).setStyle(new Style().setColor(TextFormatting.YELLOW)));
                tooltip.add(new TranslationTextComponent("tooltip.growth_3", rangeY).setStyle(new Style().setColor(TextFormatting.YELLOW)));
                break;
            case 2:
                tooltip.add(new TranslationTextComponent("tooltip.growthupgrade_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
                tooltip.add(new TranslationTextComponent("tooltip.growth_2", range + 1).setStyle(new Style().setColor(TextFormatting.YELLOW)));
                tooltip.add(new TranslationTextComponent("tooltip.growth_3", rangeY).setStyle(new Style().setColor(TextFormatting.YELLOW)));
                tooltip.add(new TranslationTextComponent("tooltip.growthupgrade_4").setStyle(new Style().setColor(TextFormatting.YELLOW)));
                tooltip.add(new TranslationTextComponent("tooltip.growthupgrade_5").setStyle(new Style().setColor(TextFormatting.YELLOW)));
                break;
            case 3:
                tooltip.add(new TranslationTextComponent("tooltip.growthupgrade2_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
                tooltip.add(new TranslationTextComponent("tooltip.growth_2", range + 1).setStyle(new Style().setColor(TextFormatting.YELLOW)));
                tooltip.add(new TranslationTextComponent("tooltip.growth_3", rangeY).setStyle(new Style().setColor(TextFormatting.YELLOW)));
                tooltip.add(new TranslationTextComponent("tooltip.growthupgrade_4").setStyle(new Style().setColor(TextFormatting.YELLOW)));
                tooltip.add(new TranslationTextComponent("tooltip.growthupgrade_5").setStyle(new Style().setColor(TextFormatting.YELLOW)));
                break;
        }
    }
}
