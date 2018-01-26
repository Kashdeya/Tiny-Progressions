package com.kashdeya.tinyprogressions.items.misc;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

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
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack)
    {
        return ConfigHandler.eat_timer;
    }
}
