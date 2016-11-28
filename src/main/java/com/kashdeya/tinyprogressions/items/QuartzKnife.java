package com.kashdeya.tinyprogressions.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class QuartzKnife extends Item {
	
	public QuartzKnife() {
		super();
		super.setMaxStackSize(1);
		this.setMaxDamage(ConfigHandler.QuartzKnifeDamage);
		super.setContainerItem(this);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("QuartzKnife");
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
	{
		ItemStack stack = itemStack.copy();
		stack.stackSize = 1;

		return stack;
	}
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);
        if (stack.getItem() instanceof QuartzKnife) {
            tooltip.add("Very sharp, Handle with care.");
        }
    }
}

