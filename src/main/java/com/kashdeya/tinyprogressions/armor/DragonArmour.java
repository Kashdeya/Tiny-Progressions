package com.kashdeya.tinyprogressions.armor;

import java.util.List;

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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class DragonArmour extends ItemArmor {
	
	public DragonArmour(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn) {
		super(material, renderIndex, equipmentSlotIn);
		this.maxStackSize = 1;
		this.setCreativeTab(tinyprogressions.tabTP);
	}
	
    /**
     * Return whether this item is repairable in an anvil.
     */
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.END_CRYSTAL);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
    	ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
    	ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
    	ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
    	ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
    	if (((head != null) && (head.getItem() == TechArmor.dragon_helmet) && 
    			(chest != null) && (chest.getItem() == TechArmor.dragon_chestplate) && 
    			(legs != null) && (legs.getItem() == TechArmor.dragon_leggings) && 
    			(feet != null) && (feet.getItem() == TechArmor.dragon_boots)) || (entity.capabilities.isCreativeMode) || (entity.isSpectator())){
    		entity.capabilities.allowFlying = true;
    		entity.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 180, 5, true, false));
    		entity.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 180, 5, true, false));
    		entity.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 180, 1, true, false));
    		entity.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 180, 1, true, false));
    		}
    	else{
    		entity.capabilities.allowFlying = false;
    		entity.capabilities.isFlying = false;
    	}
    }
    
    @Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag)
    {
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.dragonarmor_1").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.dragonarmor_2").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.dragonarmor_3").getFormattedText());
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.dragonarmor_4").getFormattedText());
    }
}