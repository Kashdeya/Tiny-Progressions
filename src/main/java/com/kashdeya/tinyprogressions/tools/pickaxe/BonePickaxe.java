package com.kashdeya.tinyprogressions.tools.pickaxe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class BonePickaxe extends ItemPickaxe {
	
	public BonePickaxe(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("BonePickaxe");
		this.setMaxStackSize(1);
	}
}
