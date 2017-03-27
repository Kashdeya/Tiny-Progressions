package com.kashdeya.tinyprogressions.items.tools;

import net.minecraft.item.ItemSpade;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

public class SpadeMain extends ItemSpade {
	
	public SpadeMain(ToolMaterial material){
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
}