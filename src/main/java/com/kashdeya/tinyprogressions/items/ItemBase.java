package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.inits.Registry.IOreDictEntry;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IOreDictEntry{
	String oredictName;
	
	public ItemBase() {
		super();
		this.setCreativeTab(TinyProgressions.tabTP);
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
