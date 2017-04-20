package com.kashdeya.tinyprogressions.items.tools;

import net.minecraft.item.ItemSword;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class SwordMain extends ItemSword {
	
	public SwordMain(ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setMaxStackSize(1);
	}
}