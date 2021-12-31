package com.kashdeya.tinyprogressions.items.misc;

import com.kashdeya.tinyprogressions.items.ItemStay;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

public class ItemJuicer extends ItemStay implements IOreDictEntry {
	
	public ItemJuicer(Properties prop) {
		super(prop.stacksTo(1).tab(TinyProgressions.FoodGroup));
	}

	@Override
	public String getOreDictName() {
		return "juicer";
	}
	
}
