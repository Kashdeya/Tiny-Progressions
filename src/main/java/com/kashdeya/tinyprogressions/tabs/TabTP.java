package com.kashdeya.tinyprogressions.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.kashdeya.tinyprogressions.inits.TechItems;

public class TabTP extends CreativeTabs {
	public TabTP(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(TechItems.WateringCan);
	}
}
