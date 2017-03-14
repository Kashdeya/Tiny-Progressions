package com.kashdeya.tinyprogressions.inits;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.armor.BoneArmor;
import com.kashdeya.tinyprogressions.armor.FlintArmor;
import com.kashdeya.tinyprogressions.armor.StoneArmor;
import com.kashdeya.tinyprogressions.armor.WoodArmor;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.MaterialHandler;
import com.kashdeya.tinyprogressions.main.Reference;

public class TechArmor {
	
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
	
	// Wood Armor
	public static ItemArmor woodHelmet;
	public static ItemArmor woodChestplate;
	public static ItemArmor woodLeggings;
	public static ItemArmor woodBoots;
	
	public static void init(){
		// Stone Armor
		if (ConfigHandler.StoneArmor){
			stoneHelmet = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("stoneHelmet");
			registerItem(stoneHelmet, "stoneHelmet");
			stoneChestplate = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("stoneChestplate");
			registerItem(stoneChestplate, "stoneChestplate");
			stoneLeggings = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("stoneLeggings");
			registerItem(stoneLeggings, "stoneLeggings");
			stoneBoots = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("stoneBoots");
			registerItem(stoneBoots, "stoneBoots");
		}
		
		// Flint Armor
		if (ConfigHandler.FlintArmor){
			flintHelmet = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("flintHelmet");
			registerItem(flintHelmet, "flintHelmet");
			flintChestplate = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("flintChestplate");
			registerItem(flintChestplate, "flintChestplate");
			flintLeggings = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("flintLeggings");
			registerItem(flintLeggings, "flintLeggings");
			flintBoots = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("flintBoots");
			registerItem(flintBoots, "flintBoots");
		}
		
		// Flint Armor
		if (ConfigHandler.BoneArmor){
			boneHelmet = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("boneHelmet");
			registerItem(boneHelmet, "boneHelmet");
			boneChestplate = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("boneChestplate");
			registerItem(boneChestplate, "boneChestplate");
			boneLeggings = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("boneLeggings");
			registerItem(boneLeggings, "boneLeggings");
			boneBoots = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("boneBoots");
			registerItem(boneBoots, "boneBoots");
		}
		
		// Flint Armor
		if (ConfigHandler.WoodArmor){
			woodHelmet = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("woodHelmet");
			registerItem(woodHelmet, "woodHelmet");
			woodChestplate = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("woodChestplate");
			registerItem(woodChestplate, "woodChestplate");
			woodLeggings = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("woodLeggings");
			registerItem(woodLeggings, "woodLeggings");
			woodBoots = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("woodBoots");
			registerItem(woodBoots, "woodBoots");
		}
	}
	
	static void registerItem(ItemArmor item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}
}
