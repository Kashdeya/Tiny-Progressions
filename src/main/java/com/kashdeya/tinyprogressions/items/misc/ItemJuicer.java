package com.kashdeya.tinyprogressions.items.misc;

import com.kashdeya.tinyprogressions.items.ItemStay;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

public class ItemJuicer extends ItemStay implements IOreDictEntry {
	
	public ItemJuicer(Properties prop) {
		super(prop);
	}

	@Override
	public String getOreDictName() {
		return "juicer";
	}
	
}
