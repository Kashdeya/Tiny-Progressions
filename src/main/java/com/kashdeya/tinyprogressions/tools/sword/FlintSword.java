package com.kashdeya.tinyprogressions.tools.sword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class FlintSword extends ItemSword {
	
	public FlintSword(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("FlintSword");
		this.setMaxStackSize(1);
	}
}
