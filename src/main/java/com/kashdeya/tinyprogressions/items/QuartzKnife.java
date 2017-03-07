package com.kashdeya.tinyprogressions.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class QuartzKnife extends Item {
	
	public QuartzKnife() {
		super();
		super.setMaxStackSize(1);
		this.setMaxDamage(ConfigHandler.QuartzKnifeDamage);
		super.setContainerItem(this);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("quartz_knife");
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
	{
		ItemStack stack = itemStack.copy();
		stack.setCount(1);

		return stack;
	}
	
    @Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag) {
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.knife").getFormattedText());
	}
}

