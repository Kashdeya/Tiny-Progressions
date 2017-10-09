package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.armor.BoneArmor;
import com.kashdeya.tinyprogressions.armor.DragonArmour;
import com.kashdeya.tinyprogressions.armor.FlintArmor;
import com.kashdeya.tinyprogressions.armor.LavaArmour;
import com.kashdeya.tinyprogressions.armor.ObsidianArmor;
import com.kashdeya.tinyprogressions.armor.StoneArmor;
import com.kashdeya.tinyprogressions.armor.WitherArmour;
import com.kashdeya.tinyprogressions.armor.WoodArmor;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.MaterialHandler;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

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
	
	// Lava
	public static ItemArmor lava_helmet;
	public static ItemArmor lava_chestplate;
	public static ItemArmor lava_leggings;
	public static ItemArmor lava_boots;
	
	// Wither
	public static ItemArmor wither_helmet;
	public static ItemArmor wither_chestplate;
	public static ItemArmor wither_leggings;
	public static ItemArmor wither_boots;
	
	// Dragon
	public static ItemArmor dragon_helmet;
	public static ItemArmor dragon_chestplate;
	public static ItemArmor dragon_leggings;
	public static ItemArmor dragon_boots;
	
	// Dragon
	public static ItemArmor obsidian_helmet;
	public static ItemArmor obsidian_chestplate;
	public static ItemArmor obsidian_leggings;
	public static ItemArmor obsidian_boots;
	
	public static void init(){
		// Stone Armor
		if (ConfigHandler.StoneArmor){
			stone_helmet = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("stone_helmet");
			TechItems.registerItem(stone_helmet, "stone_helmet");
			stone_chestplate = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("stone_chestplate");
			TechItems.registerItem(stone_chestplate, "stone_chestplate");
			stone_leggings = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("stone_leggings");
			TechItems.registerItem(stone_leggings, "stone_leggings");
			stone_boots = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("stone_boots");
			TechItems.registerItem(stone_boots, "stone_boots");
		}
		
		// Flint Armor
		if (ConfigHandler.FlintArmor){
			flint_helmet = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("flint_helmet");
			TechItems.registerItem(flint_helmet, "flint_helmet");
			flint_chestplate = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("flint_chestplate");
			TechItems.registerItem(flint_chestplate, "flint_chestplate");
			flint_leggings = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("flint_leggings");
			TechItems.registerItem(flint_leggings, "flint_leggings");
			flint_boots = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("flint_boots");
			TechItems.registerItem(flint_boots, "flint_boots");
		}
		
		// Bone Armor
		if (ConfigHandler.BoneArmor){
			bone_helmet = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("bone_helmet");
			TechItems.registerItem(bone_helmet, "bone_helmet");
			bone_chestplate = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("bone_chestplate");
			TechItems.registerItem(bone_chestplate, "bone_chestplate");
			bone_leggings = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("bone_leggings");
			TechItems.registerItem(bone_leggings, "bone_leggings");
			bone_boots = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("bone_boots");
			TechItems.registerItem(bone_boots, "bone_boots");
		}
		
		// Wood Armor
		if (ConfigHandler.WoodArmor){
			wooden_helmet = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("wooden_helmet");
			TechItems.registerItem(wooden_helmet, "wooden_helmet");
			wooden_chestplate = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("wooden_chestplate");
			TechItems.registerItem(wooden_chestplate, "wooden_chestplate");
			wooden_leggings = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("wooden_leggings");
			TechItems.registerItem(wooden_leggings, "wooden_leggings");
			wooden_boots = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("wooden_boots");
			TechItems.registerItem(wooden_boots, "wooden_boots");
		}
		
		// Lava
		if (ConfigHandler.lava_ore){
			lava_helmet = (ItemArmor) new LavaArmour(MaterialHandler.lavaArmorMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("lava_helmet");
		   	TechItems.registerItem(lava_helmet, "lava_helmet");
		   	lava_chestplate = (ItemArmor) new LavaArmour(MaterialHandler.lavaArmorMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("lava_chestplate");
		   	TechItems.registerItem(lava_chestplate, "lava_chestplate");
		   	lava_leggings = (ItemArmor) new LavaArmour(MaterialHandler.lavaArmorMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("lava_leggings");
		   	TechItems.registerItem(lava_leggings, "lava_leggings");
		   	lava_boots = (ItemArmor) new LavaArmour(MaterialHandler.lavaArmorMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("lava_boots");
		   	TechItems.registerItem(lava_boots, "lava_boots");
		}
		
		// Wither
		if (ConfigHandler.wither_armor){
			wither_helmet = (ItemArmor) new WitherArmour(MaterialHandler.witherArmorMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("wither_helmet");
		   	TechItems.registerItem(wither_helmet, "wither_helmet");
		   	wither_chestplate = (ItemArmor) new WitherArmour(MaterialHandler.witherArmorMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("wither_chestplate");
		   	TechItems.registerItem(wither_chestplate, "wither_chestplate");
		   	wither_leggings = (ItemArmor) new WitherArmour(MaterialHandler.witherArmorMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("wither_leggings");
		   	TechItems.registerItem(wither_leggings, "wither_leggings");
		   	wither_boots = (ItemArmor) new WitherArmour(MaterialHandler.witherArmorMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("wither_boots");
		   	TechItems.registerItem(wither_boots, "wither_boots");
		}
		
		// Dragon
		if (ConfigHandler.dragon_armor){
			dragon_helmet = (ItemArmor) new DragonArmour(MaterialHandler.dragonArmorMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("dragon_helmet");
		   	TechItems.registerItem(dragon_helmet, "dragon_helmet");
		   	dragon_chestplate = (ItemArmor) new DragonArmour(MaterialHandler.dragonArmorMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("dragon_chestplate");
		   	TechItems.registerItem(dragon_chestplate, "dragon_chestplate");
		   	dragon_leggings = (ItemArmor) new DragonArmour(MaterialHandler.dragonArmorMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("dragon_leggings");
		   	TechItems.registerItem(dragon_leggings, "dragon_leggings");
		   	dragon_boots = (ItemArmor) new DragonArmour(MaterialHandler.dragonArmorMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("dragon_boots");
		   	TechItems.registerItem(dragon_boots, "dragon_boots");
		}
		
		// Dragon
		if (ConfigHandler.obsidian_armor){
			obsidian_helmet = (ItemArmor) new ObsidianArmor(MaterialHandler.obsidianArmorMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("obsidian_helmet");
		   	TechItems.registerItem(obsidian_helmet, "obsidian_helmet");
		   	obsidian_chestplate = (ItemArmor) new ObsidianArmor(MaterialHandler.obsidianArmorMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("obsidian_chestplate");
		   	TechItems.registerItem(obsidian_chestplate, "obsidian_chestplate");
		   	obsidian_leggings = (ItemArmor) new ObsidianArmor(MaterialHandler.obsidianArmorMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("obsidian_leggings");
		   	TechItems.registerItem(obsidian_leggings, "obsidian_leggings");
		   	obsidian_boots = (ItemArmor) new ObsidianArmor(MaterialHandler.obsidianArmorMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("obsidian_boots");
		   	TechItems.registerItem(obsidian_boots, "obsidian_boots");
		}
	}
	
	public static void render(){
		// Stone Armor
		if (ConfigHandler.StoneArmor){
			TechItems.renderItem(stone_helmet, "stone_helmet");
			TechItems.renderItem(stone_chestplate, "stone_chestplate");
			TechItems.renderItem(stone_leggings, "stone_leggings");
			TechItems.renderItem(stone_boots, "stone_boots");
		}
		
		// Flint Armor
		if (ConfigHandler.FlintArmor){
			TechItems.renderItem(flint_helmet, "flint_helmet");
			TechItems.renderItem(flint_chestplate, "flint_chestplate");
			TechItems.renderItem(flint_leggings, "flint_leggings");
			TechItems.renderItem(flint_boots, "flint_boots");
		}
		
		// Bone Armor
		if (ConfigHandler.BoneArmor){
			TechItems.renderItem(bone_helmet, "bone_helmet");
			TechItems.renderItem(bone_chestplate, "bone_chestplate");
			TechItems.renderItem(bone_leggings, "bone_leggings");
			TechItems.renderItem(bone_boots, "bone_boots");
		}
		
		// Wood Armor
		if (ConfigHandler.WoodArmor){
			TechItems.renderItem(wooden_helmet, "wooden_helmet");
			TechItems.renderItem(wooden_chestplate, "wooden_chestplate");
			TechItems.renderItem(wooden_leggings, "wooden_leggings");
			TechItems.renderItem(wooden_boots, "wooden_boots");
		}
		
		// Lava
		if (ConfigHandler.lava_ore){
		   	TechItems.renderItem(lava_helmet, "lava_helmet");
		   	TechItems.renderItem(lava_chestplate, "lava_chestplate");
		   	TechItems.renderItem(lava_leggings, "lava_leggings");
		   	TechItems.renderItem(lava_boots, "lava_boots");
		}
		
		// Wither
		if (ConfigHandler.wither_armor){
		   	TechItems.renderItem(wither_helmet, "wither_helmet");
		   	TechItems.renderItem(wither_chestplate, "wither_chestplate");
		   	TechItems.renderItem(wither_leggings, "wither_leggings");
		   	TechItems.renderItem(wither_boots, "wither_boots");
		}
		
		// Dragon
		if (ConfigHandler.dragon_armor){
		   	TechItems.renderItem(dragon_helmet, "dragon_helmet");
		   	TechItems.renderItem(dragon_chestplate, "dragon_chestplate");
		   	TechItems.renderItem(dragon_leggings, "dragon_leggings");
		   	TechItems.renderItem(dragon_boots, "dragon_boots");
		}
		
		// Dragon
		if (ConfigHandler.obsidian_armor){
		   	TechItems.renderItem(obsidian_helmet, "obsidian_helmet");
		   	TechItems.renderItem(obsidian_chestplate, "obsidian_chestplate");
		   	TechItems.renderItem(obsidian_leggings, "obsidian_leggings");
		   	TechItems.renderItem(obsidian_boots, "obsidian_boots");
		}
	}
}
