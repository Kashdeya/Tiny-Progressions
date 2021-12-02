package com.kashdeya.tinyprogressions.armor;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.items.materials.ArmorMaterialTier;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class BaseArmor extends ArmorItem {
	 
	private String tooltipString = null;
	
	public BaseArmor(ArmorMaterialTier tier, EquipmentSlotType slot, Item.Properties prop) {
		this(tier, slot, null, prop);
	}
	
	public BaseArmor(ArmorMaterialTier tier, EquipmentSlotType slot, String tooltipTranslation, Item.Properties prop) {
		super(tier, slot, prop.tab(TinyProgressions.combatGroup).stacksTo(1));
		this.tooltipString = tooltipTranslation;
	}
	
	@Override
	public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(tooltipString != null)
			tooltip.add(new TranslationTextComponent(this.tooltipString));
    }
}
