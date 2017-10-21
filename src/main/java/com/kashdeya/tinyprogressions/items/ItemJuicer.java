package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemJuicer extends Item {
	
	public ItemJuicer() {
		super();
		super.setMaxStackSize(1);
		super.setContainerItem(this);
		this.setCreativeTab(TinyProgressions.tabTP);
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
