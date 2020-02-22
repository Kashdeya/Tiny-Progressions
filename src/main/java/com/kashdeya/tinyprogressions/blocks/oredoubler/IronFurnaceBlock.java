package com.kashdeya.tinyprogressions.blocks.oredoubler;

import java.util.Random;

import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.tiles.TileEntityOreDoubler;

import javafx.geometry.Side;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IProperty;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.chunk.BlockStateContainer;
import net.minecraftforge.fml.relauncher.SideOnly;

public class IronFurnaceBlock extends BlockHorizontal implements ITileEntityProvider{

	public static final PropertyBool ISBURNING = PropertyBool.create("isburning");
	private int cookSpeedInTicks = 100;
	
	public IronFurnaceBlock(int cookSpeedInTicksIn) {
		
		super(Material.ROCK);
		this.setHardness(1F);
		this.setHarvestLevel("pickaxe", 1);
		this.setResistance(1000.0F);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setSoundType(SoundType.STONE);
		this.setTranslationKey("iron_furnace_block");
		this.cookSpeedInTicks = cookSpeedInTicksIn;
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityOreDoubler().setCookSpeed(this.cookSpeedInTicks);
	}

	@Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		playerIn.openGui(TinyProgressions.INSTANCE, 1, worldIn, pos.getX(), pos.getY(), pos.getZ());
			
		return true;
    }
	
	@SideOnly(Side.CLIENT)
    @SuppressWarnings("incomplete-switch")
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        if (IronFurnaceBlock.isBurning(stateIn))
        {
            EnumFacing enumfacing = (EnumFacing)stateIn.getValue(FACING);
            double d0 = (double)pos.getX() + 0.5D;
            double d1 = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
            double d2 = (double)pos.getZ() + 0.5D;
            double d3 = 0.52D;
            double d4 = rand.nextDouble() * 0.6D - 0.3D;

            if (rand.nextDouble() < 0.1D)
            {
                worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
            }

            switch (enumfacing)
            {
                case WEST:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    break;
                case EAST:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    break;
                case NORTH:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - 0.52D, 0.0D, 0.0D, 0.0D);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 - 0.52D, 0.0D, 0.0D, 0.0D);
                    break;
                case SOUTH:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D);
            }
        }
    }
	
	@Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
    {
    		TileEntity te = worldIn.getTileEntity(pos);
    		if(te instanceof TileEntityOreDoubler) {
    			((TileEntityOreDoubler) te).inputInventory.dropInventory(worldIn, pos);
    			((TileEntityOreDoubler) te).outputInventory.dropInventory(worldIn, pos);
    			((TileEntityOreDoubler) te).fuelInventory.dropInventory(worldIn, pos);
    		}
    		super.breakBlock(worldIn, pos, state);
    }
    
	
	public static EnumFacing getFacing(IBlockState blockStateContainer)
	{
		return (EnumFacing)blockStateContainer.getValue(FACING);
	}
    
    /**
     * Called by ItemBlocks after a block is set in the world, to allow post-place logic
     */
	@Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
        
        if(!worldIn.isRemote)
       	 worldIn.notifyBlockUpdate(pos, worldIn.getBlockState(pos), worldIn.getBlockState(pos), 2); 
    }
    
	/** Is the Shredder turned on? */
	public static boolean isBurning(IBlockState blockStateContainer)
	{
		return blockStateContainer.getValue(ISBURNING);
	}
	
	/** Update shredding */
	public static void setBurning(World worldIn, BlockPos pos, boolean isBurningIn)
	{
		worldIn.checkLightFor(EnumSkyBlock.BLOCK, pos);
		worldIn.setBlockState(pos, worldIn.getBlockState(pos).withProperty(FACING, getFacing(worldIn.getBlockState(pos))).withProperty(ISBURNING, isBurningIn), 3);
	}
	
	@Override
	public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos) {
		if(isBurning(state))
				return 15;
		return 0;
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		 return this.getDefaultState().withProperty(FACING, EnumFacing.byHorizontalIndex(meta)).withProperty(ISBURNING, (meta >> 2) == 1 ? true : false);
	}

	/**
	 * Convert the BlockState into the correct metadata value
	 */
	@Override
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;
		i |= ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
		i |= (state.getValue(ISBURNING) ? 1 : 0 ) << 2;
	    	
		return i  ;
	}

	@Override
	public IBlockState withRotation(IBlockState state, Rotation rot)
	{
		return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
	}

	@Override
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
	{
		return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {FACING, ISBURNING});
	}
	
}
