package com.kashdeya.tinyprogressions.items.tools;

import net.minecraft.item.ItemSpade;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class SpadeMain extends ItemSpade {
	
	public SpadeMain(ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setMaxStackSize(1);
	}
}