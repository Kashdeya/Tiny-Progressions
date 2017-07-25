package com.kashdeya.tinyprogressions.items.food;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

public class FoodBase extends ItemFood {
	
	public FoodBase(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setCreativeTab(TinyProgressions.tabTP);
	}
	
	@Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.EAT;
    }
}