package com.kashdeya.tinyprogressions.blocks.misc;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Bridge extends Block {
	
	public Bridge()
    {
        super(Material.WOOD);// needs changed!
        this.setHardness(1.5F);// needs changed!
        this.setHarvestLevel("pickaxe", 0);// needs changed!
        this.setResistance(10.0F);// needs changed!
        this.setSoundType(SoundType.WOOD);// needs changed!
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setUnlocalizedName("bridge_block");
    }
}
