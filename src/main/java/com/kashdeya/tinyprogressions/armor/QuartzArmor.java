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

public class QuartzArmor extends BaseArmor {

    public QuartzArmor(EquipmentSlotType slot, Properties prop) {
		super(ArmorMaterialTier.QUARTZ, slot, prop);
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
        
        if (((!head.isEmpty()) && (head.getItem() == TechArmor.quartz_helmet) &&
            (!chest.isEmpty()) && (chest.getItem() == TechArmor.quartz_chestplate) &&
            (!legs.isEmpty()) && (legs.getItem() == TechArmor.quartz_leggings) &&
            (!feet.isEmpty()) && (feet.getItem() == TechArmor.quartz_boots))) {
            if (ArmorHandler.quartz_armor && ArmorHandler.quartz_armor_strength) {
            	living.addPotionEffect(new EffectInstance(Effects.STRENGTH, 180, ArmorHandler.quartz_armor_strength_lvl, false, false));
            }
        }
    }
	
//  @Override
//  public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {


    @Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (ArmorHandler.quartz_armor && ArmorHandler.quartz_armor_strength) {
			tooltip.add(new TranslationTextComponent("tooltip.quartzarmor_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
        }
    }

}