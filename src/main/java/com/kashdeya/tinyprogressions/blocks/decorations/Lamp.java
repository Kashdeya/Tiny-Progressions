package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Lamp extends StandardBlock
{
	public Lamp()
	{
		super(Properties
				.create(Material.GLASS)
				.hardnessAndResistance(.5F, 1F)
				.lightValue(1)
				.sound(SoundType.GLASS));
	}
	
//	@SideOnly(Side.CLIENT)
//	public BlockRenderLayer getBlockLayer()
//	{
//		return BlockRenderLayer.CUTOUT_MIPPED;
//	}
	
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
}
