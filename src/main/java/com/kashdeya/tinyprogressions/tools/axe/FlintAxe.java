package com.kashdeya.tinyprogressions.tools.axe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class FlintAxe extends ItemAxe{
	
	public FlintAxe(Item.ToolMaterial material, float damage, float speed){
		super(material, damage, speed);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("FlintAxe");
		this.setMaxStackSize(1);
	}
	
}
