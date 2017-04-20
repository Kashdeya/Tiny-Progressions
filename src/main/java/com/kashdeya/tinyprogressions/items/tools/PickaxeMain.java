package com.kashdeya.tinyprogressions.items.tools;

import net.minecraft.item.ItemPickaxe;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class PickaxeMain extends ItemPickaxe {
	
	public PickaxeMain(ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setMaxStackSize(1);
	}
}