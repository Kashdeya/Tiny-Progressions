package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class BaseSword extends ItemSword {
	
	public BaseSword(ToolMaterial material){
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
}
