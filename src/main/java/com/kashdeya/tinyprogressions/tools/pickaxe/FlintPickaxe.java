package com.kashdeya.tinyprogressions.tools.pickaxe;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class FlintPickaxe extends ItemPickaxe {
	
	public FlintPickaxe(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("FlintPickaxe");
		this.setMaxStackSize(1);
	}
}
