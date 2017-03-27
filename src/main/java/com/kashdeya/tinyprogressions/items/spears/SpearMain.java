package com.kashdeya.tinyprogressions.items.spears;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;

import com.google.common.collect.Multimap;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.IExtendedReach;

public class SpearMain extends ItemSword implements IExtendedReach {

	public SpearMain(ToolMaterial material) {
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
	
	@Override	
	public float getReach() {
		return ConfigHandler.spear_reach;
	}
}
