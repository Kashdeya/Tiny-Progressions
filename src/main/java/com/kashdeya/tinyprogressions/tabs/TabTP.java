package com.kashdeya.tinyprogressions.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TabTP extends CreativeTabs {

	public TabTP(String label) {
		super(label);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.NETHER_STAR);
	}

}
