package com.kashdeya.tinyprogressions.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.IGrowable;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.tinyprogressions;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgrade;

public class BlockGrowthUpgrade extends Block implements ITileEntityProvider {
	
	private int range = 4;
	private int rangeY = 5;

	public BlockGrowthUpgrade(){
		// Turns block into a water source.
		super(Material.WATER);
		this.setTickRandomly(true);
		this.setHardness(1.25F);
		this.setHarvestLevel("pickaxe", 0);
		this.setLightLevel(1.0F);
		this.setResistance(2000.0F);
		this.setLightOpacity(1);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setSoundType(blockSoundType.METAL);
		setDefaultState(this.blockState.getBaseState().withProperty(BlockLiquid.LEVEL, Integer.valueOf(0)));
		this.setUnlocalizedName("growth_upgrade");
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityGrowthUpgrade();
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { BlockLiquid.LEVEL });
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(BlockLiquid.LEVEL, Integer.valueOf(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((Integer) state.getValue(BlockLiquid.LEVEL)).intValue();
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}
	
	@Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    
    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
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
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	return Item.getItemFromBlock(TechBlocks.growth_upgrade);
    }
	
	public void growCropsNearby(World world, BlockPos pos, IBlockState state) {        
        int xO = pos.getX();
        int yO = pos.getY();
        int zO = pos.getZ();

        for (int xD = -4; xD <= 4; xD++) {
            for (int yD = -5; yD <= 5; yD++) {
                for (int zD = -4; zD <= 4; zD++) {
                    int x = xO + xD;
                    int y = yO + yD;
                    int z = zO + zD;

                    double distance = Math.sqrt(Math.pow(x-xO,2) + Math.pow(y - yO,2) + Math.pow(z - zO,2));
                    distance = Math.max(1D, distance);
                    double distanceCoefficient = 1D - (1D/distance);

                    IBlockState cropState = world.getBlockState(new BlockPos(x, y, z));
                    Block cropBlock = cropState.getBlock();

                    if (cropBlock instanceof IPlantable || cropBlock instanceof IGrowable) {
                        if (!(cropBlock instanceof BlockGrowth)) {
                            world.scheduleBlockUpdate(new BlockPos(x, y, z), cropBlock, (int) (distanceCoefficient * ConfigHandler.BlockGrowthUpgradeTicks * 20), 1);
                            cropBlock.updateTick(world, new BlockPos(x, y, z), cropState, world.rand);
                        }
                    }
                }
            }
        }
        world.scheduleBlockUpdate(pos, state.getBlock(), ConfigHandler.BlockGrowthUpgradeTicks * 20, 1);
    }
	
	@Override
	public int quantityDropped(Random random)
    {
        return 1;
    }
	
	@Override
	public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }

	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState worldIn, World pos, BlockPos state, Random rand)
    {
        super.randomDisplayTick(worldIn, pos, state, rand);

        for (int i = -4; i <= 4; ++i)
        {
            for (int j = -4; j <= 4; ++j)
            {
                if (i > -4 && i < 4 && j == -2)
                {
                    j = 4;
                }

                if (rand.nextInt(16) == 0)
                {
                    for (int k = 0; k <= 1; ++k){
                    	for (int xAxis = -range; xAxis <= range; xAxis++) {
        		            for (int zAxis = -range; zAxis <= range; zAxis++) {
        		            	for (int yAxis = -rangeY; yAxis <= rangeY; yAxis++)
        		            	{
        		            		BlockPos blockpos = state.add(i, k, j);
        		            		Block checkBlock = pos.getBlockState(blockpos.add(xAxis, yAxis, zAxis)).getBlock();

        		            		if (checkBlock instanceof IGrowable || checkBlock == Blocks.MYCELIUM || checkBlock == Blocks.CACTUS || checkBlock == Blocks.REEDS || checkBlock == Blocks.CHORUS_FLOWER)
        		            		{
        		            			pos.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, (double)state.getX() + 0.5D, (double)state.getY() + 3.0D, (double)state.getZ() + 0.5D, (double)((float)i + rand.nextFloat()) - 0.5D, (double)((float)k - rand.nextFloat() - 1.0F), (double)((float)j + rand.nextFloat()) - 0.5D, new int[0]);
        		            		}
        		            	}
        		            }
                    	}
                    }
                }
            }
        }
    }
	
	@Override
    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
    {
        return false;
    }
	
	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos)
	{
	    return true;
	}
	
	@Override
    public boolean isBlockSolid(IBlockAccess worldIn, BlockPos pos, EnumFacing side)
    {
        return worldIn.getBlockState(pos).getMaterial().isSolid();
    }
	
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
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag)
    {
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.growthupgrade_1").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.growthupgrade_2").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.growthupgrade_3").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.growthupgrade_4").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.growthupgrade_5").getFormattedText());
    }

}
