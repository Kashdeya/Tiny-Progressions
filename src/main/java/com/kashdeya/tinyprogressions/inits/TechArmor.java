package com.kashdeya.tinyprogressions.inits;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.armor.BoneArmor;
import com.kashdeya.tinyprogressions.armor.FlintArmor;
import com.kashdeya.tinyprogressions.armor.StoneArmor;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.FlintIngot;
import com.kashdeya.tinyprogressions.main.Reference;

public class TechArmor {
	
	public static final ArmorMaterial stoneArmourMaterial = EnumHelper.addArmorMaterial("stoneArmourMaterial", "tp:stoneArmor", 15, new int[]{1, 3, 4, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial flintArmourMaterial = EnumHelper.addArmorMaterial("flintArmourMaterial", "tp:flint", 5, new int[]{1, 3, 2, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial boneArmourMaterial = EnumHelper.addArmorMaterial("flintArmourMaterial", "tp:bone", 5, new int[]{1, 1, 1, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);

	// Stone Armor
	public static ItemArmor stoneHelmet;
	public static ItemArmor stoneChestplate;
	public static ItemArmor stoneLeggings;
	public static ItemArmor stoneBoots;
	
	// Flint Armor
	public static ItemArmor flintHelmet;
	public static ItemArmor flintChestplate;
	public static ItemArmor flintLeggings;
	public static ItemArmor flintBoots;
	
	// Bone Armor
	public static ItemArmor boneHelmet;
	public static ItemArmor boneChestplate;
	public static ItemArmor boneLeggings;
	public static ItemArmor boneBoots;
	
	public static void init(){
		// Stone Armor
		if (ConfigHandler.StoneArmor){
			stoneHelmet = (ItemArmor) new StoneArmor(stoneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("stoneHelmet");
			registerItem(stoneHelmet, "stoneHelmet");
			stoneChestplate = (ItemArmor) new StoneArmor(stoneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("stoneChestplate");
			registerItem(stoneChestplate, "stoneChestplate");
			stoneLeggings = (ItemArmor) new StoneArmor(stoneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("stoneLeggings");
			registerItem(stoneLeggings, "stoneLeggings");
			stoneBoots = (ItemArmor) new StoneArmor(stoneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("stoneBoots");
			registerItem(stoneBoots, "stoneBoots");
		}
		
		// Flint Armor
		if (ConfigHandler.FlintArmor){
			flintHelmet = (ItemArmor) new FlintArmor(flintArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("flintHelmet");
			registerItem(flintHelmet, "flintHelmet");
			flintChestplate = (ItemArmor) new FlintArmor(flintArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("flintChestplate");
			registerItem(flintChestplate, "flintChestplate");
			flintLeggings = (ItemArmor) new FlintArmor(flintArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("flintLeggings");
			registerItem(flintLeggings, "flintLeggings");
			flintBoots = (ItemArmor) new FlintArmor(flintArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("flintBoots");
			registerItem(flintBoots, "flintBoots");
		}
		
		// Flint Armor
		if (ConfigHandler.BoneArmor){
			boneHelmet = (ItemArmor) new BoneArmor(boneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("boneHelmet");
			registerItem(boneHelmet, "boneHelmet");
			boneChestplate = (ItemArmor) new BoneArmor(boneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("boneChestplate");
			registerItem(boneChestplate, "boneChestplate");
			boneLeggings = (ItemArmor) new BoneArmor(boneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("boneLeggings");
			registerItem(boneLeggings, "boneLeggings");
			boneBoots = (ItemArmor) new BoneArmor(boneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("boneBoots");
			registerItem(boneBoots, "boneBoots");
		}
	}
	
	static void registerItem(ItemArmor item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}
}
