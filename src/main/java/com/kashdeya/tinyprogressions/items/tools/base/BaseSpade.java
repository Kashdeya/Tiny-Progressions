package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class BaseSpade extends ItemSpade {
	
	public BaseSpade(ToolMaterial material){
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
}
