package com.kashdeya.tinyprogressions.armor;

import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.items.materials.ArmorMaterialTier;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class StoneArmor extends BaseArmor {


	public StoneArmor(EquipmentSlotType slot, Properties prop) {
        super(ArmorMaterialTier.STONE, slot,"tooltip.armor_1", prop);
    }

	
	@Override	
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		
			if(!(entityIn instanceof LivingEntity))
					return;

			if(entityIn instanceof PlayerEntity) {
				if(((PlayerEntity)entityIn).isCreative() || ((PlayerEntity)entityIn).isSpectator())
					return;
			}
			
			LivingEntity living = ((LivingEntity)entityIn);
		
	        ItemStack chest = living.getItemBySlot(EquipmentSlotType.CHEST);
	        ItemStack feet =  living.getItemBySlot(EquipmentSlotType.FEET);
	        ItemStack head =  living.getItemBySlot(EquipmentSlotType.HEAD);
	        ItemStack legs =  living.getItemBySlot(EquipmentSlotType.LEGS);
	         
	        if (!head.isEmpty() && head.getItem() == TechArmor.stone_helmet.get()) {
	        	living.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 180, 0, false, false));
	        }
	        if (!chest.isEmpty() && chest.getItem() == TechArmor.stone_chestplate.get()) {
	        	living.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 180, 0, false, false));
	        }
	        if (!legs.isEmpty() && legs.getItem() == TechArmor.stone_leggings.get()) {
	        	living.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 180, 0, false, false));
	        }
	        if (!feet.isEmpty() && feet.getItem() == TechArmor.stone_boots.get()) {
	        	living.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 180, 0, false, false));
	        }
	}
	
	
//    @Override
//    public void onArmorTick(World world, PlayerEntity entity, ItemStack itemStack) {
//        ItemStack chest = entity.getItemStackFromSlot(EquipmentSlotType.CHEST);
//        ItemStack feet = entity.getItemStackFromSlot(EquipmentSlotType.FEET);
//        ItemStack head = entity.getItemStackFromSlot(EquipmentSlotType.HEAD);
//        ItemStack legs = entity.getItemStackFromSlot(EquipmentSlotType.LEGS);
//        if (!head.isEmpty() && head.getItem() == TechArmor.stone_helmet || entity.capabilities.isCreativeMode || entity.isSpectator()) {
//            entity.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 180, 0, false, false));
//        }
//        if (!chest.isEmpty() && chest.getItem() == TechArmor.stone_chestplate || entity.capabilities.isCreativeMode || entity.isSpectator()) {
//            entity.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 180, 0, false, false));
//        }
//        if (!legs.isEmpty() && legs.getItem() == TechArmor.stone_leggings || entity.capabilities.isCreativeMode || entity.isSpectator()) {
//            entity.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 180, 0, false, false));
//        }
//        if (!feet.isEmpty() && feet.getItem() == TechArmor.stone_boots || entity.capabilities.isCreativeMode || entity.isSpectator()) {
//            entity.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 180, 0, false, false));
//        }
//    }


}
