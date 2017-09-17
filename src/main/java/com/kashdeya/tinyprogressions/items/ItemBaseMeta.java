package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemBaseMeta extends ItemBase
{
	protected String[] unlocalNames;
	
	public ItemBaseMeta(String[] unlocalNames)
	{
		setHasSubtypes(true);
		this.unlocalNames = unlocalNames;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return "item." + unlocalNames[stack.getItemDamage()];
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		for(int i = 0; i < unlocalNames.length; i++)
			items.add(new ItemStack(this, 1, i));
	}
}
