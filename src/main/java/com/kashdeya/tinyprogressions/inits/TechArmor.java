package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.armor.BoneArmor;
import com.kashdeya.tinyprogressions.armor.FlintArmor;
import com.kashdeya.tinyprogressions.armor.StoneArmor;
import com.kashdeya.tinyprogressions.armor.WoodArmor;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.MaterialHandler;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TechArmor {
	
	// Stone Armor
	public static Item stone_helmet;
	public static Item stone_chestplate;
	public static Item stone_leggings;
	public static Item stone_boots;
	
	// Flint Armor
	public static Item flint_helmet;
	public static Item flint_chestplate;
	public static Item flint_leggings;
	public static Item flint_boots;
	
	// Bone Armor
	public static Item bone_helmet;
	public static Item bone_chestplate;
	public static Item bone_leggings;
	public static Item bone_boots;
	
	// Wood Armor
	public static Item wooden_helmet;
	public static Item wooden_chestplate;
	public static Item wooden_leggings;
	public static Item wooden_boots;
	
	public static void init(){
		// Stone Armor
		if (ConfigHandler.StoneArmor){
			stone_helmet = new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("stone_helmet");
			registerItem(stone_helmet, "stone_helmet");
			stone_chestplate = new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("stone_chestplate");
			registerItem(stone_chestplate, "stone_chestplate");
			stone_leggings = new StoneArmor(MaterialHandler.stoneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("stone_leggings");
			registerItem(stone_leggings, "stone_leggings");
			stone_boots = new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("stone_boots");
			registerItem(stone_boots, "stone_boots");
		}
		
		// Flint Armor
		if (ConfigHandler.FlintArmor){
			flint_helmet = new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("flint_helmet");
			registerItem(flint_helmet, "flint_helmet");
			flint_chestplate = new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("flint_chestplate");
			registerItem(flint_chestplate, "flint_chestplate");
			flint_leggings = new FlintArmor(MaterialHandler.flintArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("flint_leggings");
			registerItem(flint_leggings, "flint_leggings");
			flint_boots = new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("flint_boots");
			registerItem(flint_boots, "flint_boots");
		}
		
		// Flint Armor
		if (ConfigHandler.BoneArmor){
			bone_helmet = new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("bone_helmet");
			registerItem(bone_helmet, "bone_helmet");
			bone_chestplate = new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("bone_chestplate");
			registerItem(bone_chestplate, "bone_chestplate");
			bone_leggings = new BoneArmor(MaterialHandler.boneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("bone_leggings");
			registerItem(bone_leggings, "bone_leggings");
			bone_boots = new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("bone_boots");
			registerItem(bone_boots, "bone_boots");
		}
		
		// Flint Armor
		if (ConfigHandler.WoodArmor){
			wooden_helmet = new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("wooden_helmet");
			registerItem(wooden_helmet, "wooden_helmet");
			wooden_chestplate = new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("wooden_chestplate");
			registerItem(wooden_chestplate, "wooden_chestplate");
			wooden_leggings = new WoodArmor(MaterialHandler.woodArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("wooden_leggings");
			registerItem(wooden_leggings, "wooden_leggings");
			wooden_boots = new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("wooden_boots");
			registerItem(wooden_boots, "wooden_boots");
		}
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}
}
