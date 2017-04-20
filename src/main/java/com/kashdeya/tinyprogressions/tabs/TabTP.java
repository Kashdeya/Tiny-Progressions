package com.kashdeya.tinyprogressions.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.kashdeya.tinyprogressions.inits.TechItems;

public class TabTP extends CreativeTabs {

	public TabTP(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return TechItems.watering_can;
	}

}
