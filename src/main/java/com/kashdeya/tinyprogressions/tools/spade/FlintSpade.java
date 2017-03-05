package com.kashdeya.tinyprogressions.tools.spade;

import com.kashdeya.tinyprogressions.main.tinyprogressions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class FlintSpade extends ItemSpade {
	
	public FlintSpade(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("flint_spade");
		this.setMaxStackSize(1);
	}
}
