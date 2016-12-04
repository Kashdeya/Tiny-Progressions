package com.kashdeya.tinyprogressions.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class BlockGrowthUpgrade extends Block{

	public BlockGrowthUpgrade(){
	// Turns block into a water source.	
    super(Material.WATER);
    this.setTickRandomly(true);
    this.setHardness(1.25F);
    this.setHarvestLevel("pickaxe", 1);
    this.setLightLevel(1.0F);
    this.setResistance(2000.0F);
	this.setLightOpacity(1);
	this.setCreativeTab(tinyprogressions.tabTP);
	this.setSoundType(blockSoundType.METAL);
	this.setUnlocalizedName("growth_upgrade");
	}
    
    @SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT_MIPPED;
	}
	
	@Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
    }
	
	@Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random par5Random) {

        this.growCropsNearby(world, pos, state);
    }
    
    // Get the Item that this Block should drop when harvested.
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	return Item.getItemFromBlock(TechBlocks.growth_upgrade);
    }
	
	public void growCropsNearby(World world, BlockPos pos, IBlockState state) {        
        int xO = pos.getX();
        int yO = pos.getY();
        int zO = pos.getZ();

        for (int xD = -10; xD <= 10; xD++) {
            for (int yD = -2; yD <= 5; yD++) {
                for (int zD = -10; zD <= 10; zD++) {
                    int x = xO + xD;
                    int y = yO + yD;
                    int z = zO + zD;

                    double distance = Math.sqrt(Math.pow(x-xO,2) + Math.pow(y - yO,2) + Math.pow(z - zO,2));
                    distance = Math.min(1D, distance);
                    double distanceCoefficient = 1D - (distance / 5);

                    IBlockState cropState = world.getBlockState(new BlockPos(x, y, z));
                    Block cropBlock = cropState.getBlock();

                    if (cropBlock instanceof IPlantable || cropBlock instanceof IGrowable) {
                        if (!(cropBlock instanceof BlockGrowth)) {
                            world.scheduleBlockUpdate(new BlockPos(x, y, z), cropBlock, (int) (distanceCoefficient * ConfigHandler.BlockGrowthUpgradeTicks * 2), 1);
                            cropBlock.updateTick(world, new BlockPos(x, y, z), cropState, world.rand);
                        }
                    }
                }
            }
        }
        world.scheduleBlockUpdate(pos, state.getBlock(), ConfigHandler.BlockGrowthUpgradeTicks * 2, 1);
    }
	
	public int quantityDropped(Random random)
    {
        return 1;
    }
	
	public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }

	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState worldIn, World pos, BlockPos state, Random rand)
    {
        super.randomDisplayTick(worldIn, pos, state, rand);

        for (int i = -2; i <= 2; ++i)
        {
            for (int j = -2; j <= 2; ++j)
            {
                if (i > -2 && i < 2 && j == -1)
                {
                    j = 2;
                }

                if (rand.nextInt(16) == 0)
                {
                    for (int k = 0; k <= 1; ++k)
                    {
                        BlockPos blockpos = state.add(i, k, j);

                        if (pos.getBlockState(blockpos).getBlock() == Blocks.AIR)
                        {

                            pos.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, (double)state.getX() + 0.5D, (double)state.getY() + 2.0D, (double)state.getZ() + 0.5D, (double)((float)i + rand.nextFloat()) - 0.5D, (double)((float)k - rand.nextFloat() - 0.5F), (double)((float)j + rand.nextFloat()) - 0.5D, new int[0]);
                            pos.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, (double)state.getX() + 0.5D + rand.nextGaussian() / 4, (double)state.getY() +1.0D, (double)state.getZ() + 0.5D + rand.nextGaussian() / 4, 0.0D, 0.9D, 0.5D, new int[0]);
                        }
                    }
                }
            }
        }
    }
	
	/**
     * Whether this Block can be replaced directly by other blocks (true for e.g. tall grass)
     */
	@Override
    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
    {
        return false;
    }
	
	/**
     * Whether this Block is solid on the given Side
     */
	@Override
    public boolean isBlockSolid(IBlockAccess worldIn, BlockPos pos, EnumFacing side)
    {
        return worldIn.getBlockState(pos).getMaterial().isSolid();
    }
	
	/**
     * Check whether this Block can be placed on the given side
     */
	@Override
    public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side)
    {
        return this.canPlaceBlockAt(worldIn, pos);
    }
    
	protected static void addCollisionBoxToList(BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable AxisAlignedBB blockBox)
    {
        if (blockBox != NULL_AABB)
        {
            AxisAlignedBB axisalignedbb = blockBox.offset(pos);

            if (entityBox.intersectsWith(axisalignedbb))
            {
                collidingBoxes.add(axisalignedbb);
            }
        }
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced)
    {
      tooltip.add("Can be used as a water source");
      tooltip.add("for a 9x9 farm!");
      tooltip.add("");
      tooltip.add("Can also be used under Blocks!");
      super.addInformation(stack, player, tooltip, advanced);
    }

}
