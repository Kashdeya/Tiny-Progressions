package com.kashdeya.tinyprogressions.inits;

import net.minecraft.item.ArmorItem;

public class TechArmor {
	// Stone Armor
	public static ArmorItem stone_helmet;
	public static ArmorItem stone_chestplate;
	public static ArmorItem stone_leggings;
	public static ArmorItem stone_boots;
	
	// Flint Armor
	public static ArmorItem flint_helmet;
	public static ArmorItem flint_chestplate;
	public static ArmorItem flint_leggings;
	public static ArmorItem flint_boots;
	
	// Bone Armor
	public static ArmorItem bone_helmet;
	public static ArmorItem bone_chestplate;
	public static ArmorItem bone_leggings;
	public static ArmorItem bone_boots;
	
	// Wood Armor
	public static ArmorItem wooden_helmet;
	public static ArmorItem wooden_chestplate;
	public static ArmorItem wooden_leggings;
	public static ArmorItem wooden_boots;
	
	// Lava
	public static ArmorItem lava_helmet;
	public static ArmorItem lava_chestplate;
	public static ArmorItem lava_leggings;
	public static ArmorItem lava_boots;
	
	// Wither
	public static ArmorItem wither_helmet;
	public static ArmorItem wither_chestplate;
	public static ArmorItem wither_leggings;
	public static ArmorItem wither_boots;
	
	// Dragon
	public static ArmorItem dragon_helmet;
	public static ArmorItem dragon_chestplate;
	public static ArmorItem dragon_leggings;
	public static ArmorItem dragon_boots;
	
	// Obsidian
	public static ArmorItem obsidian_helmet;
	public static ArmorItem obsidian_chestplate;
	public static ArmorItem obsidian_leggings;
	public static ArmorItem obsidian_boots;
	
	// Lapis
	public static ArmorItem lapis_helmet;
	public static ArmorItem lapis_chestplate;
	public static ArmorItem lapis_leggings;
	public static ArmorItem lapis_boots;
	
	// Quartz
	public static ArmorItem quartz_helmet;
	public static ArmorItem quartz_chestplate;
	public static ArmorItem quartz_leggings;
	public static ArmorItem quartz_boots;
	
	// Redstone
	public static ArmorItem redstone_helmet;
	public static ArmorItem redstone_chestplate;
	public static ArmorItem redstone_leggings;
	public static ArmorItem redstone_boots;
	
	// Emerald
	public static ArmorItem emerald_helmet;
	public static ArmorItem emerald_chestplate;
	public static ArmorItem emerald_leggings;
	public static ArmorItem emerald_boots;
	
	// bam t-shirt
	public static ArmorItem bam_tshirt;
	
	//TODO change how its initialized. 
	public static void init(){
		
//		// bam t-shirt
//		if (ArmorHandler.emerald_amor && ArmorHandler.bam_tshirt) {
//			bam_tshirt = (ArmorItem) new BamShirt(MaterialHandler.bamArmourMaterial, 1, EquipmentSlotType.CHEST).setTranslationKey("bam_tshirt");
//		}
//		
//		// Emerald Armor
//		if (ArmorHandler.emerald_amor){
//			emerald_helmet = (ArmorItem) new EmeraldArmor(MaterialHandler.emeraldArmourMaterial, 1, EquipmentSlotType.HEAD).setTranslationKey("emerald_helmet");
//			emerald_chestplate = (ArmorItem) new EmeraldArmor(MaterialHandler.emeraldArmourMaterial, 1, EquipmentSlotType.CHEST).setTranslationKey("emerald_chestplate");
//			emerald_leggings = (ArmorItem) new EmeraldArmor(MaterialHandler.emeraldArmourMaterial, 2, EquipmentSlotType.LEGS).setTranslationKey("emerald_leggings");
//			emerald_boots = (ArmorItem) new EmeraldArmor(MaterialHandler.emeraldArmourMaterial, 1, EquipmentSlotType.FEET).setTranslationKey("emerald_boots");
//		}
//		
//		// Stone Armor
//		if (ArmorHandler.StoneArmor){
//			stone_helmet = (ArmorItem) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EquipmentSlotType.HEAD).setTranslationKey("stone_helmet");
//			stone_chestplate = (ArmorItem) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EquipmentSlotType.CHEST).setTranslationKey("stone_chestplate");
//			stone_leggings = (ArmorItem) new StoneArmor(MaterialHandler.stoneArmourMaterial, 2, EquipmentSlotType.LEGS).setTranslationKey("stone_leggings");
//			stone_boots = (ArmorItem) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EquipmentSlotType.FEET).setTranslationKey("stone_boots");
//		}
//		
//		// Flint Armor
//		if (ArmorHandler.FlintArmor){
//			flint_helmet = (ArmorItem) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EquipmentSlotType.HEAD).setTranslationKey("flint_helmet");
//			flint_chestplate = (ArmorItem) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EquipmentSlotType.CHEST).setTranslationKey("flint_chestplate");
//			flint_leggings = (ArmorItem) new FlintArmor(MaterialHandler.flintArmourMaterial, 2, EquipmentSlotType.LEGS).setTranslationKey("flint_leggings");
//			flint_boots = (ArmorItem) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EquipmentSlotType.FEET).setTranslationKey("flint_boots");
//		}
//		
//		// Bone Armor
//		if (ArmorHandler.BoneArmor){
//			bone_helmet = (ArmorItem) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EquipmentSlotType.HEAD).setTranslationKey("bone_helmet");
//			bone_chestplate = (ArmorItem) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EquipmentSlotType.CHEST).setTranslationKey("bone_chestplate");
//			bone_leggings = (ArmorItem) new BoneArmor(MaterialHandler.boneArmourMaterial, 2, EquipmentSlotType.LEGS).setTranslationKey("bone_leggings");
//			bone_boots = (ArmorItem) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EquipmentSlotType.FEET).setTranslationKey("bone_boots");
//		}
//		
//		// Wood Armor
//		if (ArmorHandler.WoodArmor){
//			wooden_helmet = (ArmorItem) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EquipmentSlotType.HEAD).setTranslationKey("wooden_helmet");
//			wooden_chestplate = (ArmorItem) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EquipmentSlotType.CHEST).setTranslationKey("wooden_chestplate");
//			wooden_leggings = (ArmorItem) new WoodArmor(MaterialHandler.woodArmourMaterial, 2, EquipmentSlotType.LEGS).setTranslationKey("wooden_leggings");
//			wooden_boots = (ArmorItem) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EquipmentSlotType.FEET).setTranslationKey("wooden_boots");
//		}
//		
//		// Lava
//		if (ArmorHandler.lava_armor){
//			lava_helmet = (ArmorItem) new LavaArmour(MaterialHandler.lavaArmorMaterial, 1, EquipmentSlotType.HEAD).setTranslationKey("lava_helmet");
//		   	lava_chestplate = (ArmorItem) new LavaArmour(MaterialHandler.lavaArmorMaterial, 1, EquipmentSlotType.CHEST).setTranslationKey("lava_chestplate");
//		   	lava_leggings = (ArmorItem) new LavaArmour(MaterialHandler.lavaArmorMaterial, 2, EquipmentSlotType.LEGS).setTranslationKey("lava_leggings");
//		   	lava_boots = (ArmorItem) new LavaArmour(MaterialHandler.lavaArmorMaterial, 1, EquipmentSlotType.FEET).setTranslationKey("lava_boots");
//		}
//		
//		// Wither
//		if (ArmorHandler.wither_armor){
//			wither_helmet = (ArmorItem) new WitherArmour(MaterialHandler.witherArmorMaterial, 1, EquipmentSlotType.HEAD).setTranslationKey("wither_helmet");
//		   	wither_chestplate = (ArmorItem) new WitherArmour(MaterialHandler.witherArmorMaterial, 1, EquipmentSlotType.CHEST).setTranslationKey("wither_chestplate");
//		   	wither_leggings = (ArmorItem) new WitherArmour(MaterialHandler.witherArmorMaterial, 2, EquipmentSlotType.LEGS).setTranslationKey("wither_leggings");
//		   	wither_boots = (ArmorItem) new WitherArmour(MaterialHandler.witherArmorMaterial, 1, EquipmentSlotType.FEET).setTranslationKey("wither_boots");
//		}
//		
//		// Dragon
//		if (ArmorHandler.dragon_armor){
//			dragon_helmet = (ArmorItem) new DragonArmour(MaterialHandler.dragonArmorMaterial, 1, EquipmentSlotType.HEAD).setTranslationKey("dragon_helmet");
//		   	dragon_chestplate = (ArmorItem) new DragonArmour(MaterialHandler.dragonArmorMaterial, 1, EquipmentSlotType.CHEST).setTranslationKey("dragon_chestplate");
//		   	dragon_leggings = (ArmorItem) new DragonArmour(MaterialHandler.dragonArmorMaterial, 2, EquipmentSlotType.LEGS).setTranslationKey("dragon_leggings");
//		   	dragon_boots = (ArmorItem) new DragonArmour(MaterialHandler.dragonArmorMaterial, 1, EquipmentSlotType.FEET).setTranslationKey("dragon_boots");
//		}
//		
//		// Obsidian
//		if (ArmorHandler.obsidian_armor){
//			obsidian_helmet = (ArmorItem) new ObsidianArmor(MaterialHandler.obsidianArmorMaterial, 1, EquipmentSlotType.HEAD).setTranslationKey("obsidian_helmet");
//		   	obsidian_chestplate = (ArmorItem) new ObsidianArmor(MaterialHandler.obsidianArmorMaterial, 1, EquipmentSlotType.CHEST).setTranslationKey("obsidian_chestplate");
//		   	obsidian_leggings = (ArmorItem) new ObsidianArmor(MaterialHandler.obsidianArmorMaterial, 2, EquipmentSlotType.LEGS).setTranslationKey("obsidian_leggings");
//		   	obsidian_boots = (ArmorItem) new ObsidianArmor(MaterialHandler.obsidianArmorMaterial, 1, EquipmentSlotType.FEET).setTranslationKey("obsidian_boots");
//		}
//		
//		// Lapis
//		if (ArmorHandler.lapis_armor){
//			lapis_helmet = (ArmorItem) new LapisArmor(MaterialHandler.lapisArmourMaterial, 1, EquipmentSlotType.HEAD).setTranslationKey("lapis_helmet");
//		   	lapis_chestplate = (ArmorItem) new LapisArmor(MaterialHandler.lapisArmourMaterial, 1, EquipmentSlotType.CHEST).setTranslationKey("lapis_chestplate");
//		   	lapis_leggings = (ArmorItem) new LapisArmor(MaterialHandler.lapisArmourMaterial, 2, EquipmentSlotType.LEGS).setTranslationKey("lapis_leggings");
//		   	lapis_boots = (ArmorItem) new LapisArmor(MaterialHandler.lapisArmourMaterial, 1, EquipmentSlotType.FEET).setTranslationKey("lapis_boots");
//		}
//		
//		// Quartz
//		if (ArmorHandler.quartz_armor){
//			quartz_helmet = (ArmorItem) new QuartzArmor(MaterialHandler.quartzArmourMaterial, 1, EquipmentSlotType.HEAD).setTranslationKey("quartz_helmet");
//		   	quartz_chestplate = (ArmorItem) new QuartzArmor(MaterialHandler.quartzArmourMaterial, 1, EquipmentSlotType.CHEST).setTranslationKey("quartz_chestplate");
//		   	quartz_leggings = (ArmorItem) new QuartzArmor(MaterialHandler.quartzArmourMaterial, 2, EquipmentSlotType.LEGS).setTranslationKey("quartz_leggings");
//		   	quartz_boots = (ArmorItem) new QuartzArmor(MaterialHandler.quartzArmourMaterial, 1, EquipmentSlotType.FEET).setTranslationKey("quartz_boots");
//		}
//		
//		// Redstone
//		if (ArmorHandler.redstone_armor){
//			redstone_helmet = (ArmorItem) new RedstoneArmor(MaterialHandler.redstoneArmourMaterial, 1, EquipmentSlotType.HEAD).setTranslationKey("redstone_helmet");
//		   	redstone_chestplate = (ArmorItem) new RedstoneArmor(MaterialHandler.redstoneArmourMaterial, 1, EquipmentSlotType.CHEST).setTranslationKey("redstone_chestplate");
//		   	redstone_leggings = (ArmorItem) new RedstoneArmor(MaterialHandler.redstoneArmourMaterial, 2, EquipmentSlotType.LEGS).setTranslationKey("redstone_leggings");
//		   	redstone_boots = (ArmorItem) new RedstoneArmor(MaterialHandler.redstoneArmourMaterial, 1, EquipmentSlotType.FEET).setTranslationKey("redstone_boots");
//		}
	}
}
