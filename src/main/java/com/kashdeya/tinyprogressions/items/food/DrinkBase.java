package com.kashdeya.tinyprogressions.items.food;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class DrinkBase extends ItemFood {
	
	public DrinkBase(int amount, boolean isWolfFood) {
		super(amount,  isWolfFood);
		this.setCreativeTab(tinyprogressions.tabTP);
	}
	
	@Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }
}