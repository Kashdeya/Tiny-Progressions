package com.kashdeya.tinyprogressions.items.tools;

import net.minecraft.item.ItemSword;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

public class SwordMain extends ItemSword {
	
	public SwordMain(ToolMaterial material){
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
}