package com.kashdeya.tinyprogressions.items.misc;

import java.util.List;

import com.kashdeya.tinyprogressions.items.ItemBase;

import javafx.geometry.Side;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemRib extends ItemBase {
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced)
	{
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.rib_1").getFormattedText());
	}
	
}
