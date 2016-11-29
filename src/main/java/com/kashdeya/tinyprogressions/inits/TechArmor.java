package com.kashdeya.tinyprogressions.inits;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.armor.StoneArmor;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.Reference;

public class TechArmor {
	
	public static final ArmorMaterial stoneArmourMaterial = EnumHelper.addArmorMaterial("stoneArmourMaterial", "tp:stoneArmor", 30, new int[]{2, 2, 2, 2}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);

	// Stone Armor
	public static ItemArmor stoneHelmet;
	public static ItemArmor stoneChestplate;
	public static ItemArmor stoneLeggings;
	public static ItemArmor stoneBoots;
	
	public static void init(){
		// Stone Armor
		if (ConfigHandler.StoneArmor == true){
		stoneHelmet = (ItemArmor) new StoneArmor(stoneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("stoneHelmet");
		registerItem(stoneHelmet, "stoneHelmet");
		stoneChestplate = (ItemArmor) new StoneArmor(stoneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("stoneChestplate");
		registerItem(stoneChestplate, "stoneChestplate");
		stoneLeggings = (ItemArmor) new StoneArmor(stoneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("stoneLeggings");
		registerItem(stoneLeggings, "stoneLeggings");
		stoneBoots = (ItemArmor) new StoneArmor(stoneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("stoneBoots");
		registerItem(stoneBoots, "stoneBoots");
		}
	}
	
	static void registerItem(ItemArmor item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}
}
