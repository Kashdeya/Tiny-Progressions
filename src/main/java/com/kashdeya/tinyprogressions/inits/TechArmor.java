package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.armor.BoneArmor;
import com.kashdeya.tinyprogressions.armor.FlintArmor;
import com.kashdeya.tinyprogressions.armor.StoneArmor;
import com.kashdeya.tinyprogressions.armor.WoodArmor;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.MaterialHandler;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TechArmor {
	
	// Stone Armor
	public static ItemArmor stone_helmet;
	public static ItemArmor stone_chestplate;
	public static ItemArmor stone_leggings;
	public static ItemArmor stone_boots;
	
	// Flint Armor
	public static ItemArmor flint_helmet;
	public static ItemArmor flint_chestplate;
	public static ItemArmor flint_leggings;
	public static ItemArmor flint_boots;
	
	// Bone Armor
	public static ItemArmor bone_helmet;
	public static ItemArmor bone_chestplate;
	public static ItemArmor bone_leggings;
	public static ItemArmor bone_boots;
	
	// Wood Armor
	public static ItemArmor wooden_helmet;
	public static ItemArmor wooden_chestplate;
	public static ItemArmor wooden_leggings;
	public static ItemArmor wooden_boots;
	
	public static void init(){
		// Stone Armor
		if (ConfigHandler.StoneArmor){
			stone_helmet = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("stone_helmet");
			registerItem(stone_helmet, "stone_helmet");
			stone_chestplate = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("stone_chestplate");
			registerItem(stone_chestplate, "stone_chestplate");
			stone_leggings = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("stone_leggings");
			registerItem(stone_leggings, "stone_leggings");
			stone_boots = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("stone_boots");
			registerItem(stone_boots, "stone_boots");
		}
		
		// Flint Armor
		if (ConfigHandler.FlintArmor){
			flint_helmet = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("flint_helmet");
			registerItem(flint_helmet, "flint_helmet");
			flint_chestplate = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("flint_chestplate");
			registerItem(flint_chestplate, "flint_chestplate");
			flint_leggings = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("flint_leggings");
			registerItem(flint_leggings, "flint_leggings");
			flint_boots = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("flint_boots");
			registerItem(flint_boots, "flint_boots");
		}
		
		// Flint Armor
		if (ConfigHandler.BoneArmor){
			bone_helmet = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("bone_helmet");
			registerItem(bone_helmet, "bone_helmet");
			bone_chestplate = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("bone_chestplate");
			registerItem(bone_chestplate, "bone_chestplate");
			bone_leggings = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("bone_leggings");
			registerItem(bone_leggings, "bone_leggings");
			bone_boots = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("bone_boots");
			registerItem(bone_boots, "bone_boots");
		}
		
		// Flint Armor
		if (ConfigHandler.WoodArmor){
			wooden_helmet = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("wooden_helmet");
			registerItem(wooden_helmet, "wooden_helmet");
			wooden_chestplate = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("wooden_chestplate");
			registerItem(wooden_chestplate, "wooden_chestplate");
			wooden_leggings = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("wooden_leggings");
			registerItem(wooden_leggings, "wooden_leggings");
			wooden_boots = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("wooden_boots");
			registerItem(wooden_boots, "wooden_boots");
		}
	}
	
	static void registerItem(ItemArmor item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}
}
