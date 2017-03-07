package com.kashdeya.tinyprogressions.tools.spade;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class FlintSpade extends ItemSpade {
	
	public FlintSpade(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("flint_spade");
		this.setMaxStackSize(1);
	}
}
