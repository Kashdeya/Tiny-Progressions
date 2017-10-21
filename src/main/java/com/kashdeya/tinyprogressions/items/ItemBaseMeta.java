package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.IMetadata;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemBaseMeta extends ItemBase implements IMetadata
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
	
	@Override
	public int getCount()
	{
		return unlocalNames.length;
	}
	
	@Override
	public String getTexture(int index)
	{
		return unlocalNames[index];
	}
	
	@Override
	public String[] getUnlocalizedNames()
	{
		return unlocalNames;
	}
}
