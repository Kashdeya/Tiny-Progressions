package com.kashdeya.tinyprogressions.tools.hoe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class FlintHoe extends ItemHoe {
	
	public FlintHoe(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("FlintHoe");
		this.setMaxStackSize(1);
	}
}
