package com.kashdeya.tinyprogressions.tools.pickaxe;

import com.kashdeya.tinyprogressions.main.tinyprogressions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class BonePickaxe extends ItemPickaxe {
	
	public BonePickaxe(Item.ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("bone_pickaxe");
		this.setMaxStackSize(1);
	}
}
