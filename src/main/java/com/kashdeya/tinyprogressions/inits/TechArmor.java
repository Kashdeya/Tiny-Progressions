package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.armor.BaseArmor;
import com.kashdeya.tinyprogressions.armor.DragonArmour;
import com.kashdeya.tinyprogressions.armor.LapisArmor;
import com.kashdeya.tinyprogressions.armor.LavaArmour;
import com.kashdeya.tinyprogressions.armor.ObsidianArmor;
import com.kashdeya.tinyprogressions.armor.QuartzArmor;
import com.kashdeya.tinyprogressions.armor.RedstoneArmor;
import com.kashdeya.tinyprogressions.armor.StoneArmor;
import com.kashdeya.tinyprogressions.armor.WitherArmour;
import com.kashdeya.tinyprogressions.items.materials.ArmorMaterialTier;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TechArmor {
	
	// Wood Armor
	public static RegistryObject<Item> wooden_helmet =     TinyProgressions.ITEMS.register("wooden_helmet",     () -> new BaseArmor(ArmorMaterialTier.WOOD, EquipmentSlotType.HEAD, new Properties()));
	public static RegistryObject<Item> wooden_chestplate = TinyProgressions.ITEMS.register("wooden_chestplate", () -> new BaseArmor(ArmorMaterialTier.WOOD, EquipmentSlotType.CHEST, new Properties()));
	public static RegistryObject<Item> wooden_leggings =   TinyProgressions.ITEMS.register("wooden_leggings",   () -> new BaseArmor(ArmorMaterialTier.WOOD, EquipmentSlotType.LEGS, new Properties()));
	public static RegistryObject<Item> wooden_boots =      TinyProgressions.ITEMS.register("wooden_boots",      () -> new BaseArmor(ArmorMaterialTier.WOOD, EquipmentSlotType.FEET, new Properties()));
	
	// Bone Armor
	public static RegistryObject<Item> bone_helmet =     TinyProgressions.ITEMS.register("bone_helmet",     () -> new BaseArmor(ArmorMaterialTier.BONE, EquipmentSlotType.HEAD, new Properties()));
	public static RegistryObject<Item> bone_chestplate = TinyProgressions.ITEMS.register("bone_chestplate", () -> new BaseArmor(ArmorMaterialTier.BONE, EquipmentSlotType.CHEST, new Properties()));
	public static RegistryObject<Item> bone_leggings =   TinyProgressions.ITEMS.register("bone_leggings",   () -> new BaseArmor(ArmorMaterialTier.BONE, EquipmentSlotType.LEGS, new Properties()));
	public static RegistryObject<Item> bone_boots =      TinyProgressions.ITEMS.register("bone_boots",      () -> new BaseArmor(ArmorMaterialTier.BONE, EquipmentSlotType.FEET, new Properties()));
		
	// Flint Armor
	public static RegistryObject<Item> flint_helmet =    TinyProgressions.ITEMS.register("flint_helmet",     () -> new BaseArmor(ArmorMaterialTier.FLINT, EquipmentSlotType.HEAD, new Properties()));
	public static RegistryObject<Item> flint_chestplate= TinyProgressions.ITEMS.register("flint_chestplate", () -> new BaseArmor(ArmorMaterialTier.FLINT, EquipmentSlotType.CHEST, new Properties()));
	public static RegistryObject<Item> flint_leggings=   TinyProgressions.ITEMS.register("flint_leggings",   () -> new BaseArmor(ArmorMaterialTier.FLINT, EquipmentSlotType.LEGS, new Properties()));
	public static RegistryObject<Item> flint_boots=      TinyProgressions.ITEMS.register("flint_boots",      () -> new BaseArmor(ArmorMaterialTier.FLINT, EquipmentSlotType.LEGS, new Properties()));
	
	// Stone Armor
	public static RegistryObject<Item> stone_helmet =     TinyProgressions.ITEMS.register("stone_helmet",     () -> new StoneArmor(EquipmentSlotType.HEAD, new Properties()));
	public static RegistryObject<Item> stone_chestplate = TinyProgressions.ITEMS.register("stone_chestplate", () -> new StoneArmor(EquipmentSlotType.CHEST, new Properties()));
	public static RegistryObject<Item> stone_leggings =   TinyProgressions.ITEMS.register("stone_leggings",   () -> new StoneArmor(EquipmentSlotType.LEGS, new Properties()));
	public static RegistryObject<Item> stone_boots =      TinyProgressions.ITEMS.register("stone_boots",      () -> new StoneArmor(EquipmentSlotType.FEET, new Properties()));
	
	// Obsidian
	public static RegistryObject<Item> obsidian_helmet=     TinyProgressions.ITEMS.register("obsidian_helmet",     () -> new ObsidianArmor(EquipmentSlotType.HEAD, new Properties()));
	public static RegistryObject<Item> obsidian_chestplate= TinyProgressions.ITEMS.register("obsidian_chestplate", () -> new ObsidianArmor(EquipmentSlotType.CHEST, new Properties()));
	public static RegistryObject<Item> obsidian_leggings=   TinyProgressions.ITEMS.register("obsidian_leggings",   () -> new ObsidianArmor(EquipmentSlotType.LEGS, new Properties()));
	public static RegistryObject<Item> obsidian_boots=      TinyProgressions.ITEMS.register("obsidian_boots",      () -> new ObsidianArmor(EquipmentSlotType.FEET, new Properties()));
	
	// Lapis
	public static RegistryObject<Item> lapis_helmet=     TinyProgressions.ITEMS.register("lapis_helmet",     () -> new LapisArmor(EquipmentSlotType.HEAD, new Properties()));
	public static RegistryObject<Item> lapis_chestplate= TinyProgressions.ITEMS.register("lapis_chestplate", () -> new LapisArmor(EquipmentSlotType.CHEST, new Properties()));
	public static RegistryObject<Item> lapis_leggings=   TinyProgressions.ITEMS.register("lapis_leggings",   () -> new LapisArmor(EquipmentSlotType.LEGS, new Properties()));
	public static RegistryObject<Item> lapis_boots=      TinyProgressions.ITEMS.register("lapis_boots",      () -> new LapisArmor(EquipmentSlotType.FEET, new Properties()));
	
	// Quartz
	public static RegistryObject<Item> quartz_helmet=     TinyProgressions.ITEMS.register("quartz_helmet",     () ->  new QuartzArmor(EquipmentSlotType.HEAD, new Properties()));
	public static RegistryObject<Item> quartz_chestplate= TinyProgressions.ITEMS.register("quartz_chestplate", () -> new QuartzArmor(EquipmentSlotType.CHEST, new Properties()));
	public static RegistryObject<Item> quartz_leggings=   TinyProgressions.ITEMS.register("quartz_leggings",   () -> new QuartzArmor(EquipmentSlotType.LEGS, new Properties()));
	public static RegistryObject<Item> quartz_boots=      TinyProgressions.ITEMS.register("quartz_boots",      () -> new QuartzArmor(EquipmentSlotType.FEET, new Properties()));
	
	// Redstone
	public static RegistryObject<Item> redstone_helmet=     TinyProgressions.ITEMS.register("redstone_helmet",     () -> new RedstoneArmor(EquipmentSlotType.HEAD, new Properties()));
	public static RegistryObject<Item> redstone_chestplate= TinyProgressions.ITEMS.register("redstone_chestplate", () -> new RedstoneArmor(EquipmentSlotType.CHEST, new Properties()));
	public static RegistryObject<Item> redstone_leggings=   TinyProgressions.ITEMS.register("redstone_leggings",   () -> new RedstoneArmor(EquipmentSlotType.LEGS, new Properties()));
	public static RegistryObject<Item> redstone_boots=      TinyProgressions.ITEMS.register("redstone_boots",      () ->  new RedstoneArmor(EquipmentSlotType.FEET, new Properties()));
	
	// Emerald
	public static RegistryObject<Item> emerald_helmet=     TinyProgressions.ITEMS.register("emerald_helmet",     () -> new BaseArmor(ArmorMaterialTier.EMERALD, EquipmentSlotType.HEAD, new Properties()));
	public static RegistryObject<Item> emerald_chestplate= TinyProgressions.ITEMS.register("emerald_chestplate", () -> new BaseArmor(ArmorMaterialTier.EMERALD, EquipmentSlotType.CHEST, new Properties()));
	public static RegistryObject<Item> emerald_leggings=   TinyProgressions.ITEMS.register("emerald_leggings",   () -> new BaseArmor(ArmorMaterialTier.EMERALD, EquipmentSlotType.LEGS, new Properties()));
	public static RegistryObject<Item> emerald_boots=      TinyProgressions.ITEMS.register("emerald_boots",      () -> new BaseArmor(ArmorMaterialTier.EMERALD, EquipmentSlotType.FEET, new Properties()));
	
	// Lava
	public static RegistryObject<Item> lava_helmet =     TinyProgressions.ITEMS.register("lava_helmet",     () -> new LavaArmour(EquipmentSlotType.HEAD, new Properties()));
	public static RegistryObject<Item> lava_chestplate = TinyProgressions.ITEMS.register("lava_chestplate", () -> new LavaArmour(EquipmentSlotType.CHEST, new Properties()));
	public static RegistryObject<Item> lava_leggings =   TinyProgressions.ITEMS.register("lava_leggings",   () -> new LavaArmour(EquipmentSlotType.LEGS, new Properties()));
	public static RegistryObject<Item> lava_boots =      TinyProgressions.ITEMS.register("lava_boots",      () -> new LavaArmour(EquipmentSlotType.LEGS, new Properties()));
	
	// Wither
	public static RegistryObject<Item> wither_helmet =    TinyProgressions.ITEMS.register("wither_helmet",     () -> new WitherArmour(EquipmentSlotType.HEAD, new Properties()));
	public static RegistryObject<Item> wither_chestplate= TinyProgressions.ITEMS.register("wither_chestplate", () -> new WitherArmour(EquipmentSlotType.CHEST, new Properties()));
	public static RegistryObject<Item> wither_leggings=   TinyProgressions.ITEMS.register("wither_leggings",   () -> new WitherArmour(EquipmentSlotType.LEGS, new Properties()));
	public static RegistryObject<Item> wither_boots=      TinyProgressions.ITEMS.register("wither_boots",      () -> new WitherArmour(EquipmentSlotType.FEET, new Properties()));
	
	// Dragon
	//TODOD Fix Dragon
	public static RegistryObject<Item> dragon_helmet=     TinyProgressions.ITEMS.register("dragon_helmet",    () -> new DragonArmour(EquipmentSlotType.HEAD, new Properties()));
	public static RegistryObject<Item> dragon_chestplate= TinyProgressions.ITEMS.register("dragon_chestplate",() -> new DragonArmour(EquipmentSlotType.CHEST, new Properties()));
	public static RegistryObject<Item> dragon_leggings=   TinyProgressions.ITEMS.register("dragon_leggings",  () -> new DragonArmour(EquipmentSlotType.LEGS, new Properties()));
	public static RegistryObject<Item> dragon_boots=      TinyProgressions.ITEMS.register("dragon_boots",     () -> new DragonArmour(EquipmentSlotType.FEET, new Properties()));
	
	
	// bam t-shirt
	public static RegistryObject<Item> bam_tshirt = TinyProgressions.ITEMS.register("bam_tshirt", () -> new BaseArmor(ArmorMaterialTier.BAM, EquipmentSlotType.CHEST, "tooltip.bamsarmor_1", new Properties()));
	
}
