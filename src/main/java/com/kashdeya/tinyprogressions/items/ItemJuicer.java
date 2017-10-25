package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.Registry.IOreDictEntry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemJuicer extends Item implements IOreDictEntry {
	
	public ItemJuicer() {
		super();
		super.setMaxStackSize(1);
		super.setContainerItem(this);
		this.setCreativeTab(TinyProgressions.tabTP);
	}
	
	@Override
	public String getOreDictName() {
		return "juicer";
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack)
	{
			return false;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
	{
		ItemStack stack = itemStack.copy();
		stack.setCount(1);

		return stack;
	}
}
