package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
		if (tab == TinyProgressions.tabTP)
		for(int i = 0; i < unlocalNames.length; i++)
			items.add(new ItemStack(this, 1, i));
	}
}
