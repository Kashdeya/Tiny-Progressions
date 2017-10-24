package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.inits.Registry.IOreDictEntry;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FoodBase extends ItemFood implements IOreDictEntry{
	String oredictName;
	
	public FoodBase(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setCreativeTab(TinyProgressions.tabTP);
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
	
	@Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.EAT;
    }
}
