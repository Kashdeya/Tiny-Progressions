package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.armor.BamShirt;
import com.kashdeya.tinyprogressions.armor.BoneArmor;
import com.kashdeya.tinyprogressions.armor.DragonArmour;
import com.kashdeya.tinyprogressions.armor.EmeraldArmor;
import com.kashdeya.tinyprogressions.armor.FlintArmor;
import com.kashdeya.tinyprogressions.armor.LapisArmor;
import com.kashdeya.tinyprogressions.armor.LavaArmour;
import com.kashdeya.tinyprogressions.armor.ObsidianArmor;
import com.kashdeya.tinyprogressions.armor.QuartzArmor;
import com.kashdeya.tinyprogressions.armor.RedstoneArmor;
import com.kashdeya.tinyprogressions.armor.StoneArmor;
import com.kashdeya.tinyprogressions.armor.WitherArmour;
import com.kashdeya.tinyprogressions.armor.WoodArmor;
import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
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
	
	// Obsidian
	public static ItemArmor obsidian_helmet;
	public static ItemArmor obsidian_chestplate;
	public static ItemArmor obsidian_leggings;
	public static ItemArmor obsidian_boots;
	
	// Lapis
	public static ItemArmor lapis_helmet;
	public static ItemArmor lapis_chestplate;
	public static ItemArmor lapis_leggings;
	public static ItemArmor lapis_boots;
	
	// Quartz
	public static ItemArmor quartz_helmet;
	public static ItemArmor quartz_chestplate;
	public static ItemArmor quartz_leggings;
	public static ItemArmor quartz_boots;
	
	// Redstone
	public static ItemArmor redstone_helmet;
	public static ItemArmor redstone_chestplate;
	public static ItemArmor redstone_leggings;
	public static ItemArmor redstone_boots;
	
	// Emerald
	public static ItemArmor emerald_helmet;
	public static ItemArmor emerald_chestplate;
	public static ItemArmor emerald_leggings;
	public static ItemArmor emerald_boots;
	
	// bam t-shirt
	public static ItemArmor bam_tshirt;
	
	public static void init(){
		
		// bam t-shirt
		if (ArmorHandler.emerald_amor && ArmorHandler.bam_tshirt) {
			bam_tshirt = (ItemArmor) new BamShirt(MaterialHandler.bamArmourMaterial, 1, EntityEquipmentSlot.CHEST).setTranslationKey("bam_tshirt");
		}
		
		// Emerald Armor
		if (ArmorHandler.emerald_amor){
			emerald_helmet = (ItemArmor) new EmeraldArmor(MaterialHandler.emeraldArmourMaterial, 1, EntityEquipmentSlot.HEAD).setTranslationKey("emerald_helmet");
			emerald_chestplate = (ItemArmor) new EmeraldArmor(MaterialHandler.emeraldArmourMaterial, 1, EntityEquipmentSlot.CHEST).setTranslationKey("emerald_chestplate");
			emerald_leggings = (ItemArmor) new EmeraldArmor(MaterialHandler.emeraldArmourMaterial, 2, EntityEquipmentSlot.LEGS).setTranslationKey("emerald_leggings");
			emerald_boots = (ItemArmor) new EmeraldArmor(MaterialHandler.emeraldArmourMaterial, 1, EntityEquipmentSlot.FEET).setTranslationKey("emerald_boots");
		}
		
		// Stone Armor
		if (ArmorHandler.StoneArmor){
			stone_helmet = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setTranslationKey("stone_helmet");
			stone_chestplate = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setTranslationKey("stone_chestplate");
			stone_leggings = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setTranslationKey("stone_leggings");
			stone_boots = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.FEET).setTranslationKey("stone_boots");
		}
		
		// Flint Armor
		if (ArmorHandler.FlintArmor){
			flint_helmet = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.HEAD).setTranslationKey("flint_helmet");
			flint_chestplate = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.CHEST).setTranslationKey("flint_chestplate");
			flint_leggings = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 2, EntityEquipmentSlot.LEGS).setTranslationKey("flint_leggings");
			flint_boots = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.FEET).setTranslationKey("flint_boots");
		}
		
		// Bone Armor
		if (ArmorHandler.BoneArmor){
			bone_helmet = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setTranslationKey("bone_helmet");
			bone_chestplate = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setTranslationKey("bone_chestplate");
			bone_leggings = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setTranslationKey("bone_leggings");
			bone_boots = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.FEET).setTranslationKey("bone_boots");
		}
		
		// Wood Armor
		if (ArmorHandler.WoodArmor){
			wooden_helmet = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.HEAD).setTranslationKey("wooden_helmet");
			wooden_chestplate = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.CHEST).setTranslationKey("wooden_chestplate");
			wooden_leggings = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 2, EntityEquipmentSlot.LEGS).setTranslationKey("wooden_leggings");
			wooden_boots = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.FEET).setTranslationKey("wooden_boots");
		}
		
		// Lava
		if (ArmorHandler.lava_armor){
			lava_helmet = (ItemArmor) new LavaArmour(MaterialHandler.lavaArmorMaterial, 1, EntityEquipmentSlot.HEAD).setTranslationKey("lava_helmet");
		   	lava_chestplate = (ItemArmor) new LavaArmour(MaterialHandler.lavaArmorMaterial, 1, EntityEquipmentSlot.CHEST).setTranslationKey("lava_chestplate");
		   	lava_leggings = (ItemArmor) new LavaArmour(MaterialHandler.lavaArmorMaterial, 2, EntityEquipmentSlot.LEGS).setTranslationKey("lava_leggings");
		   	lava_boots = (ItemArmor) new LavaArmour(MaterialHandler.lavaArmorMaterial, 1, EntityEquipmentSlot.FEET).setTranslationKey("lava_boots");
		}
		
		// Wither
		if (ArmorHandler.wither_armor){
			wither_helmet = (ItemArmor) new WitherArmour(MaterialHandler.witherArmorMaterial, 1, EntityEquipmentSlot.HEAD).setTranslationKey("wither_helmet");
		   	wither_chestplate = (ItemArmor) new WitherArmour(MaterialHandler.witherArmorMaterial, 1, EntityEquipmentSlot.CHEST).setTranslationKey("wither_chestplate");
		   	wither_leggings = (ItemArmor) new WitherArmour(MaterialHandler.witherArmorMaterial, 2, EntityEquipmentSlot.LEGS).setTranslationKey("wither_leggings");
		   	wither_boots = (ItemArmor) new WitherArmour(MaterialHandler.witherArmorMaterial, 1, EntityEquipmentSlot.FEET).setTranslationKey("wither_boots");
		}
		
		// Dragon
		if (ArmorHandler.dragon_armor){
			dragon_helmet = (ItemArmor) new DragonArmour(MaterialHandler.dragonArmorMaterial, 1, EntityEquipmentSlot.HEAD).setTranslationKey("dragon_helmet");
		   	dragon_chestplate = (ItemArmor) new DragonArmour(MaterialHandler.dragonArmorMaterial, 1, EntityEquipmentSlot.CHEST).setTranslationKey("dragon_chestplate");
		   	dragon_leggings = (ItemArmor) new DragonArmour(MaterialHandler.dragonArmorMaterial, 2, EntityEquipmentSlot.LEGS).setTranslationKey("dragon_leggings");
		   	dragon_boots = (ItemArmor) new DragonArmour(MaterialHandler.dragonArmorMaterial, 1, EntityEquipmentSlot.FEET).setTranslationKey("dragon_boots");
		}
		
		// Obsidian
		if (ArmorHandler.obsidian_armor){
			obsidian_helmet = (ItemArmor) new ObsidianArmor(MaterialHandler.obsidianArmorMaterial, 1, EntityEquipmentSlot.HEAD).setTranslationKey("obsidian_helmet");
		   	obsidian_chestplate = (ItemArmor) new ObsidianArmor(MaterialHandler.obsidianArmorMaterial, 1, EntityEquipmentSlot.CHEST).setTranslationKey("obsidian_chestplate");
		   	obsidian_leggings = (ItemArmor) new ObsidianArmor(MaterialHandler.obsidianArmorMaterial, 2, EntityEquipmentSlot.LEGS).setTranslationKey("obsidian_leggings");
		   	obsidian_boots = (ItemArmor) new ObsidianArmor(MaterialHandler.obsidianArmorMaterial, 1, EntityEquipmentSlot.FEET).setTranslationKey("obsidian_boots");
		}
		
		// Lapis
		if (ArmorHandler.lapis_armor){
			lapis_helmet = (ItemArmor) new LapisArmor(MaterialHandler.lapisArmourMaterial, 1, EntityEquipmentSlot.HEAD).setTranslationKey("lapis_helmet");
		   	lapis_chestplate = (ItemArmor) new LapisArmor(MaterialHandler.lapisArmourMaterial, 1, EntityEquipmentSlot.CHEST).setTranslationKey("lapis_chestplate");
		   	lapis_leggings = (ItemArmor) new LapisArmor(MaterialHandler.lapisArmourMaterial, 2, EntityEquipmentSlot.LEGS).setTranslationKey("lapis_leggings");
		   	lapis_boots = (ItemArmor) new LapisArmor(MaterialHandler.lapisArmourMaterial, 1, EntityEquipmentSlot.FEET).setTranslationKey("lapis_boots");
		}
		
		// Quartz
		if (ArmorHandler.quartz_armor){
			quartz_helmet = (ItemArmor) new QuartzArmor(MaterialHandler.quartzArmourMaterial, 1, EntityEquipmentSlot.HEAD).setTranslationKey("quartz_helmet");
		   	quartz_chestplate = (ItemArmor) new QuartzArmor(MaterialHandler.quartzArmourMaterial, 1, EntityEquipmentSlot.CHEST).setTranslationKey("quartz_chestplate");
		   	quartz_leggings = (ItemArmor) new QuartzArmor(MaterialHandler.quartzArmourMaterial, 2, EntityEquipmentSlot.LEGS).setTranslationKey("quartz_leggings");
		   	quartz_boots = (ItemArmor) new QuartzArmor(MaterialHandler.quartzArmourMaterial, 1, EntityEquipmentSlot.FEET).setTranslationKey("quartz_boots");
		}
		
		// Redstone
		if (ArmorHandler.redstone_armor){
			redstone_helmet = (ItemArmor) new RedstoneArmor(MaterialHandler.redstoneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setTranslationKey("redstone_helmet");
		   	redstone_chestplate = (ItemArmor) new RedstoneArmor(MaterialHandler.redstoneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setTranslationKey("redstone_chestplate");
		   	redstone_leggings = (ItemArmor) new RedstoneArmor(MaterialHandler.redstoneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setTranslationKey("redstone_leggings");
		   	redstone_boots = (ItemArmor) new RedstoneArmor(MaterialHandler.redstoneArmourMaterial, 1, EntityEquipmentSlot.FEET).setTranslationKey("redstone_boots");
		}
	}
}
