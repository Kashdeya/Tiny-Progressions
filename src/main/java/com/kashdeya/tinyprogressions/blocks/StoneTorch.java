package com.kashdeya.tinyprogressions.blocks;

import net.minecraft.block.BlockTorch;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class StoneTorch extends BlockTorch {
	
	public StoneTorch()
    {
        this.setCreativeTab(tinyprogressions.tabTP);
        this.setUnlocalizedName("stone_torch");
        this.setLightLevel(1.0F);
    }
}
