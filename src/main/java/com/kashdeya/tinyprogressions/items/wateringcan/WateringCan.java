package com.kashdeya.tinyprogressions.items.wateringcan;

import java.util.List;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import javafx.geometry.Side;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WateringCan extends WateringCanBase {
	
	public WateringCan(){
		super();
		this.setTranslationKey("watering_can");
		this.setWateringRange(1);
		this.setWateringChance(ConfigHandler.WateringCanChance);
	}

    @Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.can_1").getFormattedText());
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.can_2").getFormattedText());
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.can_3").getFormattedText());
	}
}