package com.kashdeya.tinyprogressions.items.tools;

import net.minecraft.item.ItemHoe;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

public class HoeMain extends ItemHoe {
	
	public HoeMain(ToolMaterial material){
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
}