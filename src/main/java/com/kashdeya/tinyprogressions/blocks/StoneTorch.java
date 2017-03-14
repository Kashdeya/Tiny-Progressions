package com.kashdeya.tinyprogressions.blocks;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;

public class StoneTorch extends BlockTorch {
	
	public StoneTorch()
    {
        this.setCreativeTab(tinyprogressions.tabTP);
        this.setUnlocalizedName("StoneTorch");
    }
}
