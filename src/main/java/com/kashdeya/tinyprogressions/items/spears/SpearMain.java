package com.kashdeya.tinyprogressions.items.spears;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.IExtendedReach;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

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
