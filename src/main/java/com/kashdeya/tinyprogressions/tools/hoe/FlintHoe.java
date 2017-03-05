package com.kashdeya.tinyprogressions.tools.hoe;

import com.kashdeya.tinyprogressions.main.tinyprogressions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class FlintHoe extends ItemHoe {
	
	public FlintHoe(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("flint_hoe");
		this.setMaxStackSize(1);
	}
}
