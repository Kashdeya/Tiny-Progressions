package com.kashdeya.tinyprogressions.tabs;

import com.kashdeya.tinyprogressions.inits.TechItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabTP extends CreativeTabs {
	public TabTP(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(TechItems.WateringCan);
	}
}
