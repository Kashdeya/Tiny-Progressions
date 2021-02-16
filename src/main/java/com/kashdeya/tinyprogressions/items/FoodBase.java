package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.item.Food;

public class FoodBase extends ItemBase implements IOreDictEntry{
	
	String oredictName;
	
	public FoodBase(Properties properties, Food food) {
		super(properties.food(food));
	}
	
	public FoodBase setOreDictName(String oredictName)
	{
		this.oredictName = oredictName;
		return this;
	}
	
	@Override
	public String getOreDictName() {
		return oredictName;
	}
	

}

