package com.kashdeya.tinyprogressions.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TabTP extends CreativeTabs {

	public TabTP(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Items.NETHER_STAR;
	}

}
