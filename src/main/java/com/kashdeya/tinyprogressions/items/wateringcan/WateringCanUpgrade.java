package com.kashdeya.tinyprogressions.items.wateringcan;

import java.util.List;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WateringCanUpgrade extends WateringCanBase
{
    public WateringCanUpgrade()
    {
        super();
        this.setUnlocalizedName("watering_can_upgrade");
        this.setWateringEffectRange(2);
        this.setWateringEffectChance(ConfigHandler.WateringCanUpgradeChance);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced)
    {
        tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.canupgrade_1").getFormattedText());
        tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.canupgrade_2").getFormattedText());
        tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.canupgrade_3").getFormattedText());
    }
}