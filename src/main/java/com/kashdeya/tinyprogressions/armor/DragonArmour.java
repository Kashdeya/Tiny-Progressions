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

public class DragonArmour extends BaseArmor {

    public DragonArmour(EquipmentSlotType slot, Properties prop) {
		super(ArmorMaterialTier.DRAGON, slot, prop);
	}

    @Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {

		if (!(entityIn instanceof LivingEntity))
			return;

		if (entityIn instanceof PlayerEntity) {
			if (((PlayerEntity) entityIn).isCreative() || ((PlayerEntity) entityIn).isSpectator())
				return;


			PlayerEntity living = ((PlayerEntity) entityIn);
	
			ItemStack chest = living.getItemStackFromSlot(EquipmentSlotType.CHEST);
			ItemStack feet = living.getItemStackFromSlot(EquipmentSlotType.FEET);
			ItemStack head = living.getItemStackFromSlot(EquipmentSlotType.HEAD);
			ItemStack legs = living.getItemStackFromSlot(EquipmentSlotType.LEGS);
	        if (((!head.isEmpty()) && (head.getItem() == TechArmor.dragon_helmet.get()) &&
	            (!chest.isEmpty()) && (chest.getItem() == TechArmor.dragon_chestplate.get()) &&
	            (!legs.isEmpty()) && (legs.getItem() == TechArmor.dragon_leggings.get()) &&
	            (!feet.isEmpty()) && (feet.getItem() == TechArmor.dragon_boots.get()))) {
	            if (ArmorHandler.dragon_armor && ArmorHandler.dragon_resistance) {
	            	living.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 180, ArmorHandler.dragon_resistance_lvl, false, false));
	            }
	            if (ArmorHandler.dragon_armor && ArmorHandler.dragon_fire) {
	            	living.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 180, ArmorHandler.dragon_fire_lvl, false, false));
	            }
	            if (ArmorHandler.dragon_armor && ArmorHandler.dragon_strength) {
	            	living.addPotionEffect(new EffectInstance(Effects.STRENGTH, 180, ArmorHandler.dragon_strength_lvl, false, false));
	            }
	            if (ArmorHandler.dragon_armor && ArmorHandler.dragon_fly) {
	            	living.abilities.allowFlying = true;
	            }
	        } else {
	        	((PlayerEntity)living).abilities.allowFlying = false;
	        	((PlayerEntity)living).abilities.isFlying = false;
	        }
        
		}
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (ArmorHandler.dragon_armor && ArmorHandler.dragon_fly) {
        	tooltip.add(new TranslationTextComponent("tooltip.dragonarmor_1"));
        }
        if (ArmorHandler.dragon_armor && ArmorHandler.dragon_strength) {
        	tooltip.add(new TranslationTextComponent("tooltip.dragonarmor_2"));
        }
        if (ArmorHandler.dragon_armor && ArmorHandler.dragon_fire) {
        	tooltip.add(new TranslationTextComponent("tooltip.dragonarmor_3"));
        }
        if (ArmorHandler.dragon_armor && ArmorHandler.dragon_resistance) {
        	tooltip.add(new TranslationTextComponent("tooltip.dragonarmor_4"));
        }
    }
}