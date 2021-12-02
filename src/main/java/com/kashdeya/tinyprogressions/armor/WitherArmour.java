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

public class WitherArmour extends BaseArmor {

    public WitherArmour(EquipmentSlotType slot, Properties prop) {
		super(ArmorMaterialTier.WITHER, slot, prop);
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
		
        ItemStack chest = living.getItemBySlot(EquipmentSlotType.CHEST);
        ItemStack feet =  living.getItemBySlot(EquipmentSlotType.FEET);
        ItemStack head =  living.getItemBySlot(EquipmentSlotType.HEAD);
        ItemStack legs =  living.getItemBySlot(EquipmentSlotType.LEGS);
        
        if (((!head.isEmpty()) && (head.getItem() == TechArmor.wither_helmet.get()) &&
            (!chest.isEmpty()) && (chest.getItem() == TechArmor.wither_chestplate.get()) &&
            (!legs.isEmpty()) && (legs.getItem() == TechArmor.wither_leggings.get()) &&
            (!feet.isEmpty()) && (feet.getItem() == TechArmor.wither_boots.get()))) {
            if (ArmorHandler.wither_armor && ArmorHandler.wither_strength) {
            	living.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 180, ArmorHandler.wither_strength_lvl, false, false));
            }
            if (ArmorHandler.wither_armor && ArmorHandler.wither_fire) {
            	living.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 180, ArmorHandler.wither_fire_lvl, false, false));
            }
            if (ArmorHandler.wither_armor && ArmorHandler.wither_resistance) {
            	living.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 180, ArmorHandler.wither_resistance_lvl, false, false));
            }
        }
    }

	@Override
	public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (ArmorHandler.wither_armor && (ArmorHandler.wither_strength || ArmorHandler.wither_fire || ArmorHandler.wither_resistance)) {
        	tooltip.add(new TranslationTextComponent("tooltip.witherarmor_1"));
        }
        if (ArmorHandler.wither_armor && ArmorHandler.wither_strength) {
        	tooltip.add(new TranslationTextComponent("tooltip.witherarmor_2"));
        }
        if (ArmorHandler.wither_armor && ArmorHandler.wither_fire) {
        	tooltip.add(new TranslationTextComponent("tooltip.witherarmor_3"));
        }
        if (ArmorHandler.wither_armor && ArmorHandler.wither_resistance) {
        	tooltip.add(new TranslationTextComponent("tooltip.witherarmor_4"));
        }
    }
}