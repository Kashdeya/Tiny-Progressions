package com.kashdeya.tinyprogressions.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class WateringCan extends WateringCanBase {
	
	public WateringCan(){
		super();
		this.setUnlocalizedName("watering_can");
		this.setWateringRange(1);
		this.setWateringChance(25);
	}

    @Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag) {
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.can_1").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.can_2").getFormattedText());
	}
}