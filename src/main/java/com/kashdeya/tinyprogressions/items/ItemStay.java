package com.kashdeya.tinyprogressions.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemStay extends ItemBase {
	
	public ItemStay(Properties prop) {
		super(prop);
	}
	
//	
//	public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack)
//	{
//			return false;
//	}
//	
//	@Override
//	public ItemStack getContainerItem(ItemStack itemStack)
//	{
//		ItemStack stack = itemStack.copy();
//		stack.setCount(1);
//		return stack;
//	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip,	ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.stay_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    }
}