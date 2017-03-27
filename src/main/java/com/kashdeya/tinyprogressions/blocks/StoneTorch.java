package com.kashdeya.tinyprogressions.blocks;

import net.minecraft.block.BlockTorch;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

public class StoneTorch extends BlockTorch {
	
	public StoneTorch()
    {
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setUnlocalizedName("stone_torch");
    }
}
