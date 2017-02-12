package com.kashdeya.tinyprogressions.tools.sword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class BoneSword extends ItemSword {
	
	public BoneSword(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("BoneSword");
		this.setMaxStackSize(1);
	}
}