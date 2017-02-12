package com.kashdeya.tinyprogressions.items;

import net.minecraft.item.Item;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class Itembase extends Item {

	public Itembase() {
		super();
		this.setMaxStackSize(1);
		this.setCreativeTab(tinyprogressions.tabTP);
	}
}
