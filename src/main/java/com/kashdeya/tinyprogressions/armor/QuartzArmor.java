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

public class QuartzArmor extends ItemArmor {

    public QuartzArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn) {
        super(material, renderIndex, equipmentSlotIn);
        this.setMaxStackSize(1);
        this.setCreativeTab(TinyProgressions.tabTP);
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(Items.QUARTZ);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
        ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
        ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        if (((!head.isEmpty()) && (head.getItem() == TechArmor.quartz_helmet) &&
            (!chest.isEmpty()) && (chest.getItem() == TechArmor.quartz_chestplate) &&
            (!legs.isEmpty()) && (legs.getItem() == TechArmor.quartz_leggings) &&
            (!feet.isEmpty()) && (feet.getItem() == TechArmor.quartz_boots)) || (entity.capabilities.isCreativeMode) || (entity.isSpectator())) {
            if (ArmorHandler.quartz_armor && ArmorHandler.quartz_armor_strength) {
                entity.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 180, ArmorHandler.quartz_armor_strength_lvl, true, false));
            }
        }
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if (ArmorHandler.quartz_armor && ArmorHandler.quartz_armor_strength) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.quartzarmor_1").getFormattedText());
        }
    }

}