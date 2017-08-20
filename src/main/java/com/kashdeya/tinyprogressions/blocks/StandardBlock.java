package com.kashdeya.tinyprogressions.blocks;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

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
}
