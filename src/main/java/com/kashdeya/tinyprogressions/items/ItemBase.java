package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IOreDictEntry{
	String oredictName;
	
	public ItemBase(Properties properties) {
		super(properties);
	}
	
	public ItemBase setOreDictName(String oredictName)
	{
		this.oredictName = oredictName;
		return this;
	}
	
	@Override
	public String getOreDictName() {
		return oredictName;
	}
}
