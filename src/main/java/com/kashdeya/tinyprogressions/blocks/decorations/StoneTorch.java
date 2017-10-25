package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.Registry.IOreDictEntry;

import net.minecraft.block.BlockTorch;

public class StoneTorch extends BlockTorch implements IOreDictEntry{
	
	public StoneTorch()
    {
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setUnlocalizedName("stone_torch");
        this.setLightLevel(1.0F);
    }
	
	@Override
	public String getOreDictName() {
		return "torch";
	}
}
