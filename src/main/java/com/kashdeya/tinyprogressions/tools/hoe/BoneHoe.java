package com.kashdeya.tinyprogressions.tools.hoe;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class BoneHoe extends ItemHoe {
	
	public BoneHoe(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("BoneHoe");
		this.setMaxStackSize(1);
	}
}