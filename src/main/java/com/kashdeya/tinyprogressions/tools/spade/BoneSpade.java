package com.kashdeya.tinyprogressions.tools.spade;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class BoneSpade extends ItemSpade {
	
	public BoneSpade(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("BoneSpade");
		this.setMaxStackSize(1);
	}
}