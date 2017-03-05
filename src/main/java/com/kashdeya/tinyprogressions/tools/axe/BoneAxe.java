package com.kashdeya.tinyprogressions.tools.axe;

import com.kashdeya.tinyprogressions.main.tinyprogressions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class BoneAxe extends ItemAxe{
	
	public BoneAxe(Item.ToolMaterial material, float damage, float speed){
		super(material, damage, speed);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("bone_axe");
		this.setMaxStackSize(1);
	}

}
