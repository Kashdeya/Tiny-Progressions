package com.kashdeya.tinyprogressions.armor;

import java.util.List;

import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class StoneArmor extends ItemArmor {

    public StoneArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn) {
        super(material, renderIndex, equipmentSlotIn);
        this.setMaxStackSize(1);
        this.setCreativeTab(TinyProgressions.tabTP);
    }

    /**
     * Return whether this item is repairable in an anvil.
     */
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(Blocks.STONE, 1, 0);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
        ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
        ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        if (!head.isEmpty() && head.getItem() == TechArmor.stone_helmet || entity.capabilities.isCreativeMode || entity.isSpectator()) {
            entity.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 180, 0, false, false));
        }
        if (!chest.isEmpty() && chest.getItem() == TechArmor.stone_chestplate || entity.capabilities.isCreativeMode || entity.isSpectator()) {
            entity.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 180, 0, false, false));
        }
        if (!legs.isEmpty() && legs.getItem() == TechArmor.stone_leggings || entity.capabilities.isCreativeMode || entity.isSpectator()) {
            entity.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 180, 0, false, false));
        }
        if (!feet.isEmpty() && feet.getItem() == TechArmor.stone_boots || entity.capabilities.isCreativeMode || entity.isSpectator()) {
            entity.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 180, 0, false, false));
        }
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.armor_1").getFormattedText());
    }
}
