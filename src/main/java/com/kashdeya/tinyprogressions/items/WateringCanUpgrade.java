package com.kashdeya.tinyprogressions.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class WateringCanUpgrade extends WateringCanBase {
	
	public WateringCanUpgrade(){
		super();
		this.setUnlocalizedName("watering_can_upgrade");
		this.setWateringRange(2);
		this.setWateringChance(75);
	}

    @Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag) {
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.canupgrade_1").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.canupgrade_2").getFormattedText());
	}
}