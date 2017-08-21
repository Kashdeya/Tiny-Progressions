package com.kashdeya.tinyprogressions.blocks;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StandardBlock extends Block
{
	public StandardBlock(Material material)
	{
		super(material);
		setCreativeTab(TinyProgressions.tabTP);
	}
	
	public StandardBlock setUnlocalName(String name)
	{
		setUnlocalizedName(name);
		return this;
	}
	
	public StandardBlock setSound(SoundType sound)
	{
		setSoundType(sound);
		return this;
	}
	
	public StandardBlock setHarvestLvl(String toolClass, int level)
	{
		setHarvestLevel(toolClass, level);
		return this;
	}
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
		if (TechBlocks.fmf_block != null){
			return BlockRenderLayer.CUTOUT;
		}
		return null;
    }
	
	@Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
}
