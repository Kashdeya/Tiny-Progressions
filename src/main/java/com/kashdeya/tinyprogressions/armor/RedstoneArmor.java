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

public class RedstoneArmor extends ItemArmor {
	
	public RedstoneArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn) {
		super(material, renderIndex, equipmentSlotIn);
		this.maxStackSize = 1;
		this.setCreativeTab(TinyProgressions.tabTP);
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.REDSTONE);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
    
	@Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
    	ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
    	ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
    	ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
    	ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
    	if (((head != null) && (head.getItem() == TechArmor.redstone_helmet) && 
    		(chest != null) && (chest.getItem() == TechArmor.redstone_chestplate) && 
    		(legs != null) && (legs.getItem() == TechArmor.redstone_leggings) && 
    		(feet != null) && (feet.getItem() == TechArmor.redstone_boots)) || (entity.capabilities.isCreativeMode) || (entity.isSpectator())){
    		if (ArmorHandler.redstone_armor && ArmorHandler.redstone_armor_speed){
    			entity.addPotionEffect(new PotionEffect(MobEffects.SPEED, 180, ArmorHandler.redstone_armor_speed_lvl, true, false));
    		}
    	}
    }
	
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
    	if (ArmorHandler.redstone_armor && ArmorHandler.redstone_armor_speed){
    		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.redstonearmor_1").getFormattedText());
    	}
    }
    
}