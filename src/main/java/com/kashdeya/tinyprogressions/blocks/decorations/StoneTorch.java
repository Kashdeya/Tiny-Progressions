package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.TorchBlock;
import net.minecraft.block.material.Material;

public class StoneTorch extends TorchBlock implements IOreDictEntry{
	
	public StoneTorch()
    {
		super(Properties
				.create(Material.FIRE)
				.lightValue(1));
    }
	
	@Override
	public String getOreDictName() {
		return "torch";
	}
}
