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

public class RedstoneArmor extends BaseArmor {

	public RedstoneArmor(EquipmentSlotType slot, Properties prop) {
		super(ArmorMaterialTier.REDSTONE, slot, prop);
	}

	// TODO reduce redundent code.
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
        
        
		if (((!head.isEmpty()) && (head.getItem() == TechArmor.redstone_helmet) && (!chest.isEmpty())
				&& (chest.getItem() == TechArmor.redstone_chestplate) && (!legs.isEmpty())
				&& (legs.getItem() == TechArmor.redstone_leggings) && (!feet.isEmpty())
				&& (feet.getItem() == TechArmor.redstone_boots))) {
			if (ArmorHandler.redstone_armor && ArmorHandler.redstone_armor_speed) {
				living.addPotionEffect(new EffectInstance(Effects.SPEED, 180, ArmorHandler.redstone_armor_speed_lvl, false, false));
			}
		}
	}

	// @Override
	// public void onArmorTick(World world, EntityPlayer entity, ItemStack
	// itemStack) {
	// ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
	// ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
	// ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
	// ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
	// if (((!head.isEmpty()) && (head.getItem() == TechArmor.redstone_helmet) &&
	// (!chest.isEmpty()) && (chest.getItem() == TechArmor.redstone_chestplate) &&
	// (!legs.isEmpty()) && (legs.getItem() == TechArmor.redstone_leggings) &&
	// (!feet.isEmpty()) && (feet.getItem() == TechArmor.redstone_boots)) ||
	// (entity.capabilities.isCreativeMode) || (entity.isSpectator())) {
	// if (ArmorHandler.redstone_armor && ArmorHandler.redstone_armor_speed) {
	// entity.addPotionEffect(new PotionEffect(MobEffects.SPEED, 180,
	// ArmorHandler.redstone_armor_speed_lvl, false, false));
	// }
	// }
	// }

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if (ArmorHandler.redstone_armor && ArmorHandler.redstone_armor_speed) {
			tooltip.add(new TranslationTextComponent("tooltip.redstonearmor_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
		}
	}

}