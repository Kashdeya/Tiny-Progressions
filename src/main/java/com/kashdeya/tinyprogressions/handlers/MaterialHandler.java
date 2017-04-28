package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialHandler {

	// Tools
	public static final Item.ToolMaterial BONE = EnumHelper.addToolMaterial("boneToolMaterial", ConfigHandler.BoneLevel, 29, 1.0F, 0.0F, 10).setRepairItem(new ItemStack(Items.BONE));
	public static final Item.ToolMaterial FLINT = EnumHelper.addToolMaterial("flintToolMaterial", ConfigHandler.FlintLevel, 100, 3.0F, 0.5F, 15).setRepairItem(new ItemStack(Items.FLINT));
	public static final Item.ToolMaterial BIRTHDAY = EnumHelper.addToolMaterial("birthdayToolMaterial", 4, 3061, 45.0F, 4.0F, 25).setRepairItem(new ItemStack(TechBlocks.reinforced_obsidian));
	public static final Item.ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("obsidianToolMaterial", 4, 3561, 100.0F, 6.0F, 25).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
	public static final Item.ToolMaterial EMERALD = EnumHelper.addToolMaterial("emeraldToolMaterial", 3, 1961, 50.0F, 5.0F, 10).setRepairItem(new ItemStack(Items.EMERALD));
	// Armor
	public static final ArmorMaterial stoneArmourMaterial = EnumHelper.addArmorMaterial("stoneArmourMaterial", "tp:stone", 15, new int[]{1, 3, 4, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial flintArmourMaterial = EnumHelper.addArmorMaterial("flintArmourMaterial", "tp:flint", 12, new int[]{2, 3, 2, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial boneArmourMaterial = EnumHelper.addArmorMaterial("boneArmourMaterial", "tp:bone", 8, new int[]{1, 1, 1, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial woodArmourMaterial = EnumHelper.addArmorMaterial("woodArmourMaterial", "tp:wood", 5, new int[]{1, 2, 1, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial emeraldArmourMaterial = EnumHelper.addArmorMaterial("emeraldArmourMaterial", "tp:emerald", 22, new int[]{1, 4, 5, 1}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial obsidianArmorMaterial = EnumHelper.addArmorMaterial("obsidianArmorMaterial", "tp:obsidian", 35, new int[] { 2, 5, 6, 3 }, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial reinforcedArmorMaterial = EnumHelper.addArmorMaterial("reinforcedArmorMaterial", "tp:reinforced", 40, new int[] { 3, 6, 8, 3 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial lavaArmorMaterial = EnumHelper.addArmorMaterial("lavaArmorMaterial", "tp:lava", 50, new int[] { 3, 6, 8, 3 }, 35, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial redstoneArmourMaterial = EnumHelper.addArmorMaterial("redstoneArmourMaterial", "tp:redstone", 20, new int[]{1, 4, 5, 1}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial lapisArmourMaterial = EnumHelper.addArmorMaterial("lapisArmourMaterial", "tp:lapis", 20, new int[]{1, 4, 5, 1}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial witherArmourMaterial = EnumHelper.addArmorMaterial("witherArmourMaterial", "tp:wither", 60, new int[]{3, 6, 8, 3}, 40, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial dragonArmourMaterial = EnumHelper.addArmorMaterial("dragonArmourMaterial", "tp:dragon", 200, new int[]{10, 10, 10, 10}, 75, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial amethystArmourMaterial = EnumHelper.addArmorMaterial("amethystArmourMaterial", "tp:amethyst", 25, new int[] {1, 3, 2, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial rubyArmourMaterial = EnumHelper.addArmorMaterial("rubyArmourMaterial", "tp:ruby", 30, new int[] {3, 7, 6, 3}, 31, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial sapphireArmourMaterial = EnumHelper.addArmorMaterial("sapphireArmourMaterial", "tp:sapphire", 31, new int[] {3, 6, 6, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
}
