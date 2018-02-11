package com.kashdeya.tinyprogressions.armor;

import java.util.List;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class DragonArmour extends ItemArmor {

    public DragonArmour(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn) {
        super(material, renderIndex, equipmentSlotIn);
        this.setMaxStackSize(1);
        this.setCreativeTab(TinyProgressions.tabTP);
    }

    /**
     * Return whether this item is repairable in an anvil.
     */
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(Items.END_CRYSTAL);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
        ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
        ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        if (((!head.isEmpty()) && (head.getItem() == TechArmor.dragon_helmet) &&
            (!chest.isEmpty()) && (chest.getItem() == TechArmor.dragon_chestplate) &&
            (!legs.isEmpty()) && (legs.getItem() == TechArmor.dragon_leggings) &&
            (!feet.isEmpty()) && (feet.getItem() == TechArmor.dragon_boots)) ||
            (entity.capabilities.isCreativeMode) || (entity.isSpectator())) {
            if (ArmorHandler.dragon_armor && ArmorHandler.dragon_resistance) {
                entity.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 180, ArmorHandler.dragon_resistance_lvl, true, false));
            }
            if (ArmorHandler.dragon_armor && ArmorHandler.dragon_fire) {
                entity.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 180, ArmorHandler.dragon_fire_lvl, true, false));
            }
            if (ArmorHandler.dragon_armor && ArmorHandler.dragon_strength) {
                entity.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 180, ArmorHandler.dragon_strength_lvl, true, false));
            }
            if (ArmorHandler.dragon_armor && ArmorHandler.dragon_fly) {
                entity.capabilities.allowFlying = true;
            }
        } else {
            entity.capabilities.allowFlying = false;
            entity.capabilities.isFlying = false;
        }
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if (ArmorHandler.dragon_armor && ArmorHandler.dragon_fly) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.dragonarmor_1").getFormattedText());
        }
        if (ArmorHandler.dragon_armor && ArmorHandler.dragon_strength) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.dragonarmor_2").getFormattedText());
        }
        if (ArmorHandler.dragon_armor && ArmorHandler.dragon_fire) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.dragonarmor_3").getFormattedText());
        }
        if (ArmorHandler.dragon_armor && ArmorHandler.dragon_resistance) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.dragonarmor_4").getFormattedText());
        }
    }
}