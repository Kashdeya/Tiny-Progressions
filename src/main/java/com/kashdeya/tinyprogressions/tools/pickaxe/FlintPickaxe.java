package com.kashdeya.tinyprogressions.tools.pickaxe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class FlintPickaxe extends ItemPickaxe {
	
	public FlintPickaxe(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("flint_pickaxe");
		this.setMaxStackSize(1);
	}
}
