package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;

import net.minecraft.block.SoundType;

public class LampColored extends StandardBlock
{
//	public static final PropertyEnum<EnumLampColor> COLOR = PropertyEnum.create("color", EnumLampColor.class);
	
	public LampColored(Properties prop)
	{
		super(prop.sound(SoundType.GLASS).hardnessAndResistance(0.5f).lightValue(1));
//		setLightLevel(1.0F);
//		setLightOpacity(1);

	}
	
//	@SideOnly(Side.CLIENT)
//	public BlockRenderLayer getBlockLayer()
//	{
//		return BlockRenderLayer.CUTOUT_MIPPED;
//	}
//	
//	@Override
//    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
//    {
//		return false;
//    }
//	
//	@Override
//	public boolean isFullCube(IBlockState state)
//    {
//        return false;
//    }
//
//	@Override
//    protected boolean canSilkHarvest()
//    {
//        return true;
//    }
//
//	@Override
//	public boolean isOpaqueCube(IBlockState state)
//    {
//        return false;
//    }
//	
//	@Override
//	public BlockStateContainer createBlockState()
//	{
//		return new BlockStateContainer(this, COLOR);
//	}
//	
//	@Override
//	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
//    {
//        return MapColor.getBlockColor(EnumDyeColor.values()[state.getValue(COLOR).ordinal()]);
//    }
//	
//	@Override
//	public int damageDropped(IBlockState state)
//	{
//		return getMetaFromState(state);
//	}
//	
//	@Override
//	public IBlockState getStateFromMeta(int meta)
//    {
//        return this.getDefaultState().withProperty(COLOR, EnumLampColor.values()[meta]);
//    }
//	
//	@Override
//    public int getMetaFromState(IBlockState state)
//    {
//		EnumLampColor metaValue = state.getValue(COLOR);
//		return metaValue.ordinal();
//    }
}
