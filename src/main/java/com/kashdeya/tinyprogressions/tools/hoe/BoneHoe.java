package com.kashdeya.tinyprogressions.tools.hoe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class BoneHoe extends ItemHoe {
	
	public BoneHoe(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("bone_hoe");
		this.setMaxStackSize(1);
	}
}