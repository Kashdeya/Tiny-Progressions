package com.kashdeya.tinyprogressions.items.tools;

import net.minecraft.item.ItemAxe;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class AxeMain extends ItemAxe{
	
	public AxeMain(ToolMaterial material, float damage, float speed){
		super(material, damage, speed);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setMaxStackSize(1);
	}
}
