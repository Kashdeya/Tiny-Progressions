package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;

public class GlowstoneColored extends StandardBlock
{
//	public static final PropertyEnum<EnumGlowstoneColor> COLOR = PropertyEnum.create("color", EnumGlowstoneColor.class);
	
	public GlowstoneColored(Properties prop)
	{
		super(prop
				.hardnessAndResistance(0.3F)
				.lightValue(1));
	}
	
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
//	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
//	{
//		drops.clear();
//		
//		Random random = new Random();
//		int quantity = 2 + random.nextInt(3);
//		
//		drops.add(new ItemStack(TechItems.colored_dust, quantity, getMetaFromState(state)));
//	}
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
//        return this.getDefaultState().withProperty(COLOR, EnumGlowstoneColor.values()[meta]);
//    }
//	
//	@Override
//    public int getMetaFromState(IBlockState state)
//    {
//		EnumGlowstoneColor metaValue = state.getValue(COLOR);
//		return metaValue.ordinal();
//    }
}
