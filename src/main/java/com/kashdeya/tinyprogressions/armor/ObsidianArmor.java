package com.kashdeya.tinyprogressions.armor;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.items.materials.ArmorMaterialTier;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class ObsidianArmor extends BaseArmor {

    public ObsidianArmor(EquipmentSlotType slot, Properties prop) {
		super(ArmorMaterialTier.OBSIDIAN, slot, prop);
    }

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (!(entityIn instanceof LivingEntity))
			return;

		if (entityIn instanceof PlayerEntity) {
			if (((PlayerEntity) entityIn).isCreative() || ((PlayerEntity) entityIn).isSpectator())
				return;
		}

		LivingEntity living = ((LivingEntity)entityIn);

        ItemStack chest = living.getItemStackFromSlot(EquipmentSlotType.CHEST);
        ItemStack feet =  living.getItemStackFromSlot(EquipmentSlotType.FEET);
        ItemStack head =  living.getItemStackFromSlot(EquipmentSlotType.HEAD);
        ItemStack legs =  living.getItemStackFromSlot(EquipmentSlotType.LEGS);
        if (((!head.isEmpty()) && (head.getItem() == TechArmor.obsidian_helmet.get()) &&
            (!chest.isEmpty()) && (chest.getItem() == TechArmor.obsidian_chestplate.get()) &&
            (!legs.isEmpty()) && (legs.getItem() == TechArmor.obsidian_leggings.get()) &&
            (!feet.isEmpty()) && (feet.getItem() == TechArmor.obsidian_boots.get()))) {
            if (ArmorHandler.obsidian_armor && ArmorHandler.obsidian_armor_resistance) {
            	living.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 180, ArmorHandler.obsidian_armor_resistance_lvl, false, false));
            }
        }
    }


	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (ArmorHandler.obsidian_armor && ArmorHandler.obsidian_armor_resistance) {
        	tooltip.add(new TranslationTextComponent("tooltip.obsidianarmor_1"));
        	tooltip.add(new TranslationTextComponent("tooltip.obsidianarmor_2"));
        }
    }
}