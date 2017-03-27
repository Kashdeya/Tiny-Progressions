package com.kashdeya.tinyprogressions.items.tools;

import net.minecraft.item.ItemPickaxe;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

public class PickaxeMain extends ItemPickaxe {
	
	public PickaxeMain(ToolMaterial material){
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
}