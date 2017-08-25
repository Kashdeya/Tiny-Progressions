package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Lamp extends Block
{
	public Lamp()
	{
		super(Material.GLASS);
		setHardness(0.5f);
		setLightLevel(1.0F);
		setLightOpacity(1);
		setSoundType(SoundType.GLASS);
		setCreativeTab(TinyProgressions.tabTP);
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
	public boolean isFullCube(IBlockState state)
    {
        return false;
    }

	@Override
    protected boolean canSilkHarvest()
    {
        return true;
    }

	@Override
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
}
