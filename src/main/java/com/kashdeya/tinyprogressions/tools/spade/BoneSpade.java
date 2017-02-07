package com.kashdeya.tinyprogressions.tools.spade;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class BoneSpade extends ItemSpade {
	
	public BoneSpade(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("BoneSpade");
		this.setMaxStackSize(1);
	}
}