package com.kashdeya.tinyprogressions.blocks.growthblock;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.tiles.cobblegen.TileEntityCobblegen;
import com.kashdeya.tinyprogressions.tiles.growthblock.TileEntityGrowthBlock;
import com.mojang.authlib.GameProfile;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
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
import net.minecraftforge.common.util.FakePlayer;

public class BlockGrowth extends Block {

    private final int range;
    private final int rangeY;
    private final int growthLvl;
    private AABBTicket waterRegion;

    public BlockGrowth(Properties prop, int level, int rangeX, int rangeY) {
        super(prop
                .randomTicks()
                .strength(8, 1000)
                .lightLevel((p) -> 7)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.METAL)
                .air());

        this.range = rangeX;
        this.rangeY = rangeY;
        this.growthLvl = level;
    }

     @Override
    public void playerWillDestroy(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
    	TileEntity tile = worldIn.getBlockEntity(pos);
    	
    	if(tile instanceof TileEntityGrowthBlock)
    		((TileEntityGrowthBlock)tile).removeWaterRegion();
    }

    @Override
    public void wasExploded(World worldIn, BlockPos pos, Explosion explosionIn) {
    	TileEntity tile = worldIn.getBlockEntity(pos);
    	
    	if(tile instanceof TileEntityGrowthBlock)
      		((TileEntityGrowthBlock)tile).removeWaterRegion();
    }

    @Override
    public void tick(BlockState state, ServerWorld world, BlockPos pos, Random rand) {
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

                    hoeGround(world, pos, curPos, state);
                    
                    if (cropBlock instanceof IPlantable || cropBlock instanceof IGrowable) {
                        if (!(cropBlock instanceof BlockGrowth)) {

                            cropBlock.randomTick(cropState, world, curPos, RANDOM);
                            //Make sure you dont already have a pending block tick
                            if (!world.getBlockTicks().willTickThisTick(pos, this))
                                world.getBlockTicks().scheduleTick(pos, this, getGrowthCrystalTickRate(distanceCoefficient));
                        }
                    }
                }
            }
        }
        if (!world.getBlockTicks().willTickThisTick(pos, this))
            world.getBlockTicks().scheduleTick(pos, state.getBlock(), getGrowthCrystalTickRate());
    }

    private FakePlayer fakeplayer = null;
    private ItemStack hoe = new ItemStack(Items.DIAMOND_HOE);
    		
    		
    public void hoeGround(ServerWorld world, BlockPos blockpos, BlockPos targetpos,  BlockState state)
    {
    	 if(this.growthLvl < 3) return;
    	 if(world.getBlockState(targetpos.below()).getBlock() instanceof FarmlandBlock) return;
    	 if(fakeplayer == null) {
    		 fakeplayer = new FakePlayer(world, new GameProfile(UUID.randomUUID(), "growthblock"));
    		 fakeplayer.setPos((double)blockpos.getX(), (double)blockpos.getY(), (double)blockpos.getZ());
    	 }
    	 BlockState newstate = world.getBlockState(targetpos.below()).getToolModifiedState(world,  targetpos.below(), fakeplayer, hoe, ToolType.HOE);
    	 if (newstate != null) 
    	 {
             world.playSound(fakeplayer, targetpos.below(), SoundEvents.HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
             if (!world.isClientSide) {
                world.setBlock(targetpos.below(), newstate, 11);
             }
         }
 
    }
    
    @Override
    public boolean canDropFromExplosion(BlockState state, IBlockReader world, BlockPos pos, Explosion explosionIn)
    {
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
                                            BlockPos blockpos = pos.offset(i, k, j);
                                            Block checkBlock = worldIn.getBlockState(blockpos.offset(xAxis, yAxis, zAxis)).getBlock();

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
	public boolean hasTileEntity(BlockState state){
		return true;
	}
	
	@Nullable
	@Override
	public TileEntity createTileEntity(final BlockState state, final IBlockReader world) {
		return new TileEntityGrowthBlock().setStats(this.growthLvl, this.range, this.rangeY);
	}
	

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        switch (growthLvl) {
            case 1:
                tooltip.add(new TranslationTextComponent("tooltip.growth_1"));
                tooltip.add(new TranslationTextComponent("tooltip.growth_2", range + 1));
                tooltip.add(new TranslationTextComponent("tooltip.growth_3", rangeY));
                break;
            case 2:
                tooltip.add(new TranslationTextComponent("tooltip.growthupgrade_1"));
                tooltip.add(new TranslationTextComponent("tooltip.growth_2", range + 1));
                tooltip.add(new TranslationTextComponent("tooltip.growth_3", rangeY));
                tooltip.add(new TranslationTextComponent("tooltip.growthupgrade_4"));
                tooltip.add(new TranslationTextComponent("tooltip.growthupgrade_5"));
                break;
            case 3:
                tooltip.add(new TranslationTextComponent("tooltip.growthupgrade2_1"));
                tooltip.add(new TranslationTextComponent("tooltip.growth_2", range + 1));
                tooltip.add(new TranslationTextComponent("tooltip.growth_3", rangeY));
                tooltip.add(new TranslationTextComponent("tooltip.growthupgrade_4"));
                tooltip.add(new TranslationTextComponent("tooltip.growthupgrade_5"));
                break;
        }
    }
}
