package com.kashdeya.tinyprogressions.tools.sword;

import com.kashdeya.tinyprogressions.main.tinyprogressions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class BoneSword extends ItemSword {
	
	public BoneSword(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("bone_sword");
		this.setMaxStackSize(1);
	}
}