package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.BlockTorch;

public class StoneTorch extends BlockTorch {
	
	public StoneTorch()
    {
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setUnlocalizedName("stone_torch");
        this.setLightLevel(1.0F);
    }
}
