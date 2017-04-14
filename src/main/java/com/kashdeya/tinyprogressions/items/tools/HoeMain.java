package com.kashdeya.tinyprogressions.items.tools;

import net.minecraft.item.ItemHoe;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class HoeMain extends ItemHoe {
	
	public HoeMain(ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setMaxStackSize(1);
	}
}