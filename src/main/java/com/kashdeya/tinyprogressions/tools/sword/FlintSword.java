package com.kashdeya.tinyprogressions.tools.sword;

import com.kashdeya.tinyprogressions.main.tinyprogressions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class FlintSword extends ItemSword {
	
	public FlintSword(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("flint_sword");
		this.setMaxStackSize(1);
	}
}
