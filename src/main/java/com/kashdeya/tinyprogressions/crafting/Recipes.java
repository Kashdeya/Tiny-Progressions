package com.kashdeya.tinyprogressions.crafting;

import java.util.List;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class Recipes
{
	public static void init()
	{
		if (ConfigHandler.StoneArmor){
			Recipes.addShapedRecipe("stone_helmet", new ItemStack(TechArmor.stone_helmet), new Object[] {
					"sss",
					"s s",
						Character.valueOf('s'), "stone"
			});
			
			Recipes.addShapedRecipe("stone_chestplate", new ItemStack(TechArmor.stone_chestplate), new Object[] {
					"s s",
					"sss",
					"sss",
						Character.valueOf('s'), "stone"
			});
			
			Recipes.addShapedRecipe("stone_leggings", new ItemStack(TechArmor.stone_leggings), new Object[] {
					"sss",
					"s s",
					"s s",
						Character.valueOf('s'), "stone"
			});
			
			Recipes.addShapedRecipe("stone_boots", new ItemStack(TechArmor.stone_boots), new Object[] {
					"s s",
					"s s",
						Character.valueOf('s'), "stone"
			});
		}
		
		if (ConfigHandler.obsidian_armor){
			Recipes.addShapedRecipe("obsidian_helmet", new ItemStack(TechArmor.obsidian_helmet), new Object[] {
					"sss",
					"s s",
						Character.valueOf('s'), "obsidian"
			});
			
			Recipes.addShapedRecipe("obsidian_chestplate", new ItemStack(TechArmor.obsidian_chestplate), new Object[] {
					"s s",
					"sss",
					"sss",
						Character.valueOf('s'), "obsidian"
			});
			
			Recipes.addShapedRecipe("obsidian_leggings", new ItemStack(TechArmor.obsidian_leggings), new Object[] {
					"sss",
					"s s",
					"s s",
						Character.valueOf('s'), "obsidian"
			});
			
			Recipes.addShapedRecipe("obsidian_boots", new ItemStack(TechArmor.obsidian_boots), new Object[] {
					"s s",
					"s s",
						Character.valueOf('s'), "obsidian"
			});
		}
		
		if (ConfigHandler.FlintArmor){
			Recipes.addShapedRecipe("flint_helmet", new ItemStack(TechArmor.flint_helmet), new Object[] {
					"fff",
					"f f",
						Character.valueOf('f'), "ingotFlint"
			});
			
			Recipes.addShapedRecipe("flint_chestplate", new ItemStack(TechArmor.flint_chestplate), new Object[] {
					"f f",
					"fff",
					"fff",
						Character.valueOf('f'), "ingotFlint"
			});
			
			Recipes.addShapedRecipe("flint_leggings", new ItemStack(TechArmor.flint_leggings), new Object[] {
					"fff",
					"f f",
					"f f",
						Character.valueOf('f'), "ingotFlint"
			});
			
			Recipes.addShapedRecipe("flint_boots", new ItemStack(TechArmor.flint_boots), new Object[] {
					"f f",
					"f f",
						Character.valueOf('f'), "ingotFlint"
			});
		}
		
		if (ConfigHandler.BoneArmor){
			Recipes.addShapedRecipe("bone_helmet", new ItemStack(TechArmor.bone_helmet), new Object[] {
					"bbb",
					"b b",
						Character.valueOf('b'), "bone"
			});
			
			Recipes.addShapedRecipe("bone_chestplate", new ItemStack(TechArmor.bone_chestplate), new Object[] {
					"b b",
					"bbb",
					"bbb",
						Character.valueOf('b'), "bone"
			});
			
			Recipes.addShapedRecipe("bone_leggings", new ItemStack(TechArmor.bone_leggings), new Object[] {
					"bbb",
					"b b",
					"b b",
						Character.valueOf('b'), "bone"
			});
			
			Recipes.addShapedRecipe("bone_boots", new ItemStack(TechArmor.bone_boots), new Object[] {
					"b b",
					"b b",
						Character.valueOf('b'), "bone"
			});
		}
		
		if (ConfigHandler.WoodArmor){
			Recipes.addShapedRecipe("wooden_helmet", new ItemStack(TechArmor.wooden_helmet), new Object[] {
					"lll",
					"l l",
						Character.valueOf('l'), Blocks.LOG
			});
			
			Recipes.addShapedRecipe("wooden_chestplate", new ItemStack(TechArmor.wooden_chestplate), new Object[] {
					"l l",
					"lll",
					"lll",
						Character.valueOf('l'), Blocks.LOG
			});
			
			Recipes.addShapedRecipe("wooden_leggings", new ItemStack(TechArmor.wooden_leggings), new Object[] {
					"lll",
					"l l",
					"l l",
						Character.valueOf('l'), Blocks.LOG
			});
			
			Recipes.addShapedRecipe("wooden_boots", new ItemStack(TechArmor.wooden_boots), new Object[] {
					"l l",
					"l l",
						Character.valueOf('l'), Blocks.LOG
			});
		}
		
		if (ConfigHandler.lava_ore){
			Recipes.addShapedRecipe("lava_helmet", new ItemStack(TechArmor.lava_helmet), new Object[] {
					"lll",
					"l l",
						Character.valueOf('l'), TechItems.lava_crystal
			});
			
			Recipes.addShapedRecipe("lava_chestplate", new ItemStack(TechArmor.lava_chestplate), new Object[] {
					"l l",
					"lll",
					"lll",
						Character.valueOf('l'), TechItems.lava_crystal
			});
			
			Recipes.addShapedRecipe("lava_leggings", new ItemStack(TechArmor.lava_leggings), new Object[] {
					"lll",
					"l l",
					"l l",
						Character.valueOf('l'), TechItems.lava_crystal
			});
			
			Recipes.addShapedRecipe("lava_boots", new ItemStack(TechArmor.lava_boots), new Object[] {
					"l l",
					"l l",
						Character.valueOf('l'), TechItems.lava_crystal
			});
		}
		
		if (ConfigHandler.wither_armor){
			Recipes.addShapedRecipe("wither_helmet", new ItemStack(TechArmor.wither_helmet), new Object[] {
					"www",
					"w w",
						Character.valueOf('w'), TechItems.wither_rib
			});
			
			Recipes.addShapedRecipe("wither_chestplate", new ItemStack(TechArmor.wither_chestplate), new Object[] {
					"w w",
					"www",
					"www",
						Character.valueOf('w'), TechItems.wither_rib
			});
			
			Recipes.addShapedRecipe("wither_leggings", new ItemStack(TechArmor.wither_leggings), new Object[] {
					"www",
					"w w",
					"w w",
						Character.valueOf('w'), TechItems.wither_rib
			});
			
			Recipes.addShapedRecipe("wither_boots", new ItemStack(TechArmor.wither_boots), new Object[] {
					"w w",
					"w w",
						Character.valueOf('w'), TechItems.wither_rib
			});
		}
		
		if (ConfigHandler.dragon_armor){
			Recipes.addShapedRecipe("dragon_helmet", new ItemStack(TechArmor.dragon_helmet), new Object[] {
					"ddd",
					"d d",
						Character.valueOf('d'), TechItems.dragon_scale
			});
			
			Recipes.addShapedRecipe("dragon_chestplate", new ItemStack(TechArmor.dragon_chestplate), new Object[] {
					"d d",
					"ddd",
					"ddd",
						Character.valueOf('d'), TechItems.dragon_scale
			});
			
			Recipes.addShapedRecipe("dragon_leggings", new ItemStack(TechArmor.dragon_leggings), new Object[] {
					"ddd",
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.dragon_scale
			});
			
		   	Recipes.addShapedRecipe("dragon_boots", new ItemStack(TechArmor.dragon_boots), new Object[] {
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.dragon_scale
			});
		}
		
		if (ConfigHandler.FlintTools){
			Recipes.addShapedRecipe("flint_pickaxe", new ItemStack(TechTools.flint_pickaxe), new Object[] {
					"fff",
					" s ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			Recipes.addShapedRecipe("flint_axe", new ItemStack(TechTools.flint_axe), new Object[] {
					"ff ",
					"fs ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			Recipes.addShapedRecipe("flint_spade", new ItemStack(TechTools.flint_spade), new Object[] {
					" f ",
					" s ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			Recipes.addShapedRecipe("flint_sword", new ItemStack(TechTools.flint_sword), new Object[] {
					" f ",
					" f ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			Recipes.addShapedRecipe("flint_hoe", new ItemStack(TechTools.flint_hoe), new Object[] {
					"ff ",
					" s ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Bone
		if (ConfigHandler.BoneTools){
			Recipes.addShapedRecipe("bone_pickaxe", new ItemStack(TechTools.bone_pickaxe), new Object[] {
					"bbb",
					" s ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			Recipes.addShapedRecipe("bone_axe", new ItemStack(TechTools.bone_axe), new Object[] {
					"bb ",
					"bs ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			Recipes.addShapedRecipe("bone_spade", new ItemStack(TechTools.bone_spade), new Object[] {
					" b ",
					" s ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			Recipes.addShapedRecipe("bone_sword", new ItemStack(TechTools.bone_sword), new Object[] {
					" b ",
					" b ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			Recipes.addShapedRecipe("bone_hoe", new ItemStack(TechTools.bone_hoe), new Object[] {
					"bb ",
					" s ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Birthday
	    if (ConfigHandler.BirthdayPickaxe){
			ItemStack BirthdayPickaxe = new ItemStack(TechTools.birthday_pickaxe);
			BirthdayPickaxe.addEnchantment(Enchantments.MENDING, 2);
			
			Recipes.addShapedRecipe("birthday_pickaxe", BirthdayPickaxe, new Object[] {
					"rdr",
					" s ",
					" s ",
						Character.valueOf('r'), "blockReinforcedObsidian",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
		}
	    // Scythe
	    if (ConfigHandler.wooden_scythe){
			Recipes.addShapedRecipe("wooden_scythe", new ItemStack(TechTools.wooden_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "logWood",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.stone_scythe){
			Recipes.addShapedRecipe("stone_scythe", new ItemStack(TechTools.stone_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "stone",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.golden_scythe){
			Recipes.addShapedRecipe("golden_scythe", new ItemStack(TechTools.golden_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "ingotGold",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.iron_scythe){
			Recipes.addShapedRecipe("iron_scythe", new ItemStack(TechTools.iron_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.diamond_scythe){
			Recipes.addShapedRecipe("diamond_scythe", new ItemStack(TechTools.diamond_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
	    }
		if (ConfigHandler.emerald_scythe){
			Recipes.addShapedRecipe("emerald_scythe", new ItemStack(TechTools.emerald_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_scythe){
			Recipes.addShapedRecipe("obsidian_scythe", new ItemStack(TechTools.obsidian_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Emerald
		if (ConfigHandler.emerald_axe){
		    Recipes.addShapedRecipe("emerald_axe", new ItemStack(TechTools.emerald_axe), new Object[] {
					"ee ",
					"es ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_pickaxe){
		    Recipes.addShapedRecipe("emerald_pickaxe", new ItemStack(TechTools.emerald_pickaxe), new Object[] {
					"eee",
					" s ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_spade){
		    Recipes.addShapedRecipe("emerald_spade", new ItemStack(TechTools.emerald_spade), new Object[] {
					" e ",
					" s ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_hoe){
		    Recipes.addShapedRecipe("emerald_hoe", new ItemStack(TechTools.emerald_hoe), new Object[] {
					"ee ",
					" s ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_sword){
		    Recipes.addShapedRecipe("emerald_sword", new ItemStack(TechTools.emerald_sword), new Object[] {
					" e ",
					" e ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Obsidian
		if (ConfigHandler.obsidian_axe){
		    Recipes.addShapedRecipe("obsidian_axe", new ItemStack(TechTools.obsidian_axe), new Object[] {
					"oo ",
					"os ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_pickaxe){
		    Recipes.addShapedRecipe("obsidian_pickaxe", new ItemStack(TechTools.obsidian_pickaxe), new Object[] {
					"ooo",
					" s ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_spade){
		    Recipes.addShapedRecipe("obsidian_spade", new ItemStack(TechTools.obsidian_spade), new Object[] {
					" o ",
					" s ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_hoe){
		    Recipes.addShapedRecipe("obsidian_hoe", new ItemStack(TechTools.obsidian_hoe), new Object[] {
					"oo ",
					" s ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_sword){
		    Recipes.addShapedRecipe("obsidian_sword", new ItemStack(TechTools.obsidian_sword), new Object[] {
					" o ",
					" o ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Multi
		if (ConfigHandler.wooden_multi){
		    Recipes.addShapedRecipe("wooden_multi", new ItemStack(TechTools.wooden_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), Items.WOODEN_AXE,
						Character.valueOf('S'), Items.WOODEN_SHOVEL,
						Character.valueOf('P'), Items.WOODEN_PICKAXE,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.stone_multi){
			Recipes.addShapedRecipe("stone_multi", new ItemStack(TechTools.stone_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), Items.STONE_AXE,
						Character.valueOf('S'), Items.STONE_SHOVEL,
						Character.valueOf('P'), Items.STONE_PICKAXE,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.golden_multi){
			Recipes.addShapedRecipe("golden_multi", new ItemStack(TechTools.golden_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), Items.GOLDEN_AXE,
						Character.valueOf('S'), Items.GOLDEN_SHOVEL,
						Character.valueOf('P'), Items.GOLDEN_PICKAXE,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.iron_multi){
			Recipes.addShapedRecipe("iron_multi", new ItemStack(TechTools.iron_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), Items.IRON_AXE,
						Character.valueOf('S'), Items.IRON_SHOVEL,
						Character.valueOf('P'), Items.IRON_PICKAXE,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.diamond_multi){
			Recipes.addShapedRecipe("diamond_multi", new ItemStack(TechTools.diamond_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), Items.DIAMOND_AXE,
						Character.valueOf('S'), Items.DIAMOND_SHOVEL,
						Character.valueOf('P'), Items.DIAMOND_PICKAXE,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_multi){
			Recipes.addShapedRecipe("emerald_multi", new ItemStack(TechTools.emerald_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), TechTools.emerald_axe,
						Character.valueOf('S'), TechTools.emerald_spade,
						Character.valueOf('P'), TechTools.emerald_pickaxe,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_multi){
			Recipes.addShapedRecipe("obsidian_multi", new ItemStack(TechTools.obsidian_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), TechTools.obsidian_axe,
						Character.valueOf('S'), TechTools.obsidian_spade,
						Character.valueOf('P'), TechTools.obsidian_pickaxe,
						Character.valueOf('s'), "stickWood"
			});
		}
		// Battle
		if (ConfigHandler.wooden_battle){
			Recipes.addShapedRecipe("wooden_battle", new ItemStack(TechTools.wooden_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "logWood",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.stone_battle){
			Recipes.addShapedRecipe("stone_battle", new ItemStack(TechTools.stone_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "stone",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.golden_battle){
			Recipes.addShapedRecipe("golden_battle", new ItemStack(TechTools.golden_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "ingotGold",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.iron_battle){
			Recipes.addShapedRecipe("iron_battle", new ItemStack(TechTools.iron_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.diamond_battle){
			Recipes.addShapedRecipe("diamond_battle", new ItemStack(TechTools.diamond_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_battle){
			Recipes.addShapedRecipe("emerald_battle", new ItemStack(TechTools.emerald_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_battle){
			Recipes.addShapedRecipe("obsidian_battle", new ItemStack(TechTools.obsidian_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Spear
		if (ConfigHandler.wooden_spear){
			Recipes.addShapedRecipe("wooden_spear", new ItemStack(TechTools.wooden_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "logWood",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.stone_spear){
			Recipes.addShapedRecipe("stone_spear", new ItemStack(TechTools.stone_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "stone",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.golden_spear){
			Recipes.addShapedRecipe("golden_spear", new ItemStack(TechTools.golden_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "ingotGold",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.iron_spear){
			Recipes.addShapedRecipe("iron_spear", new ItemStack(TechTools.iron_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.diamond_spear){
			Recipes.addShapedRecipe("diamond_spear", new ItemStack(TechTools.diamond_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_spear){
			Recipes.addShapedRecipe("emerald_spear", new ItemStack(TechTools.emerald_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_spear){
			Recipes.addShapedRecipe("obsidian_spear", new ItemStack(TechTools.obsidian_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		
		// Watering Cans
		if (ConfigHandler.WateringCan) {
			Recipes.addShapedRecipe("watering_can", new ItemStack(TechItems.watering_can), new Object[] {
					"id ",
					"iwi",
					" i ",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('d'), "dyeWhite",
						Character.valueOf('w'), Items.WATER_BUCKET
			});
		}
		if (ConfigHandler.WateringCanUpgrade) {
			Recipes.addShapedRecipe("watering_can_upgrade", new ItemStack(TechItems.watering_can_upgrade), new Object[] {
					"on ",
					"owo",
					" o ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('n'), "netherStar",
						Character.valueOf('w'), TechItems.watering_can
			});
		}
		// Quartz Items
		if (ConfigHandler.QuartzKnife) {
			Recipes.addShapedRecipe("quartz_knife", new ItemStack(TechItems.quartz_knife), new Object[] {
					"  s",
					" s ",
					"q  ",
						Character.valueOf('s'), "stickWood",
						Character.valueOf('q'), "gemQuartz"
			});
			
			Recipes.addShapedRecipe("quartz_dust", new ItemStack(TechItems.quartz_dust), new Object[] {
					"k",
					"q",
						Character.valueOf('k'), TechItems.quartz_knife,
						Character.valueOf('q'), "gemQuartz"
			});
		}
		// Misc Items
		if (ConfigHandler.StoneTorch) {
			Recipes.addShapedRecipe("stone_stick", new ItemStack(TechItems.stone_stick, 4), new Object[] {
					"c",
					"c",
						Character.valueOf('c'), "cobblestone"
			});
		}
		if (ConfigHandler.MyceliumSeeds) {
			Recipes.addShapedRecipe("mycelium_seeds", new ItemStack(TechItems.mycelium_seeds), new Object[] {
					"sss",
					"ses",
					"sss",
						Character.valueOf('s'), Items.WHEAT_SEEDS,
						Character.valueOf('e'), Items.SPIDER_EYE
			});
		}
		if (ConfigHandler.DiamondApple) {
			Recipes.addShapedRecipe("diamond_apple", new ItemStack(TechItems.diamond_apple), new Object[] {
					"ddd",
					"dad",
					"ddd",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.EmeraldApple) {
			Recipes.addShapedRecipe("emerald_apple", new ItemStack(TechItems.emerald_apple), new Object[] {
					"eee",
					"eae",
					"eee",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.iron_apple) {
			Recipes.addShapedRecipe("iron_apple", new ItemStack(TechItems.iron_apple), new Object[] {
					"iii",
					"iai",
					"iii",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('a'), Items.APPLE
			});
		}
 		if (ConfigHandler.redstone_apple) {
			Recipes.addShapedRecipe("redstone_apple", new ItemStack(TechItems.redstone_apple), new Object[] {
					"rrr",
					"rar",
					"rrr",
						Character.valueOf('r'), "dustRedstone",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.ApplePro) {
			Recipes.addShapedRecipe("golden_apple", new ItemStack(TechItems.golden_apple), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "ingotGold",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.MedKit) {
			Recipes.addShapedRecipe("med_kit", new ItemStack(TechItems.med_kit), new Object[] {
					"prp",
					"rgr",
					"lrl",
						Character.valueOf('p'), "paper",
						Character.valueOf('r'), "dyeRed",
						Character.valueOf('l'), "leather",
						Character.valueOf('g'), Items.SPECKLED_MELON
			});
		}
		// Ingot
		if (ConfigHandler.FlintArmor) {
			GameRegistry.addSmelting(TechBlocks.flint_block, new ItemStack(TechItems.flint_ingot), 1.0F);
		}
		if (ConfigHandler.ReinforcedObsidian) {
			GameRegistry.addSmelting(TechBlocks.reinforced_obsidian, new ItemStack(TechItems.reinforced_obsidian_ingot), 1.0F);
		}
		// Flint Knife
		if (ConfigHandler.FlintKnife) {
			Recipes.addShapelessRecipe("flint_knife", new ItemStack(TechItems.flint_knife), new Object[] {
					"flint", "flint", "stickWood"
			});
		}
		// Ender Dust
		if (ConfigHandler.ender_ore) {
			Recipes.addShapedRecipe("ender_pearl", new ItemStack(Items.ENDER_PEARL), new Object[] {
					"eee",
					"e e",
					"eee",
						Character.valueOf('e'), "dustEnder"
			});
		}
		
		// Tech Blocks
		if (ConfigHandler.BlockGrowth) {
			Recipes.addShapedRecipe("growth_block", new ItemStack(TechBlocks.growth_block), new Object[] {
					"ibi",
					"ded",
					"ibi",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('b'), "blockBone",
						Character.valueOf('d'), "blockGlassDirty",
						Character.valueOf('e'), Blocks.SEA_LANTERN
			});
		}
		if (ConfigHandler.BlockGrowthUpgrade) {
			Recipes.addShapedRecipe("growth_upgrade", new ItemStack(TechBlocks.growth_upgrade), new Object[] {
					"cwc",
					"ses",
					"cnc",
						Character.valueOf('c'), "blockReinforcedObsidian",
						Character.valueOf('w'), TechItems.watering_can_upgrade,
						Character.valueOf('s'), Items.END_CRYSTAL,
						Character.valueOf('e'), TechBlocks.growth_block,
						Character.valueOf('n'), TechBlocks.netherstar_block
			});
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo) {
			Recipes.addShapelessRecipe("growth_upgrade_two", new ItemStack(TechBlocks.growth_upgrade_two), new Object[] {
					TechBlocks.growth_upgrade, Blocks.DRAGON_EGG
			});
		}
		if (ConfigHandler.Cobblegen) {
			Recipes.addShapedRecipe("cobblegen_block", new ItemStack(TechBlocks.cobblegen_block), new Object[] {
					"ccc",
					"wgl",
					"ccc",
						Character.valueOf('c'), "cobblestone",
						Character.valueOf('w'), Items.WATER_BUCKET,
						Character.valueOf('l'), Items.LAVA_BUCKET,
						Character.valueOf('g'), "blockGlass"
			});
			
			Recipes.addShapedRecipe("cobblegen_block", new ItemStack(TechBlocks.cobblegen_block), new Object[] {
					"ccc",
					"lgw",
					"ccc",
						Character.valueOf('c'), "cobblestone",
						Character.valueOf('w'), Items.WATER_BUCKET,
						Character.valueOf('l'), Items.LAVA_BUCKET,
						Character.valueOf('g'), "blockGlass"
			});
		}
		if (ConfigHandler.IronCobblegen) {
			Recipes.addShapedRecipe("iron_cobblegen_block", new ItemStack(TechBlocks.iron_cobblegen_block), new Object[] {
					"iii",
					"igi",
					"iii",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('g'), TechBlocks.cobblegen_block
			});
		}
		if (ConfigHandler.DiamondCobblegen) {
			Recipes.addShapedRecipe("diamond_cobblegen_block", new ItemStack(TechBlocks.diamond_cobblegen_block), new Object[] {
					"ddd",
					"did",
					"ddd",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('i'), TechBlocks.iron_cobblegen_block
			});
		}
		if (ConfigHandler.BlazeCobblegen) {
			Recipes.addShapedRecipe("blaze_cobblegen_block", new ItemStack(TechBlocks.blaze_cobblegen_block), new Object[] {
					"bbb",
					"bdb",
					"bbb",
						Character.valueOf('b'), Items.BLAZE_ROD,
						Character.valueOf('d'), TechBlocks.diamond_cobblegen_block
			});
		}
		if (ConfigHandler.EmeraldCobblegen) {
			Recipes.addShapedRecipe("emerald_cobblegen_block", new ItemStack(TechBlocks.emerald_cobblegen_block), new Object[] {
					"eee",
					"ebe",
					"eee",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('b'), TechBlocks.blaze_cobblegen_block
			});
		}

		// Deco Blocks
		if (ConfigHandler.StoneTorch) {
			Recipes.addShapedRecipe("stone_torch", new ItemStack(TechBlocks.stone_torch), new Object[] {
					"c",
					"s",
						Character.valueOf('c'), Items.COAL,
						Character.valueOf('s'), "stickStone"
			});
		}
		if (ConfigHandler.CharcoalBlock) {
			Recipes.addShapedRecipe("charcoal_block", new ItemStack(TechBlocks.charcoal_block), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), new ItemStack(Items.COAL, 1, 1)
			});
			
			Recipes.addShapelessRecipe("charcoal", new ItemStack(Items.COAL, 9, 1), new Object[] {
					TechBlocks.charcoal_block
			});
		}
		if (ConfigHandler.ReinforcedGlass) {
			Recipes.addShapedRecipe("reinforced_glass", new ItemStack(TechBlocks.reinforced_glass, 4), new Object[] {
					"ogo",
					"gog",
					"ogo",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('g'), "blockGlassDirty"
			});
		}
		if (ConfigHandler.ReinforcedObsidian) {
			Recipes.addShapedRecipe("reinforced_obsidian", new ItemStack(TechBlocks.reinforced_obsidian, 4), new Object[] {
					"ioi",
					"oio",
					"ioi",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('i'), Blocks.IRON_BARS
			});
		}
		if (ConfigHandler.DirtyGlass) {
			Recipes.addShapedRecipe("dirty_glass", new ItemStack(TechBlocks.dirty_glass, 4), new Object[] {
					"sgs",
					"gsg",
					"sgs",
						Character.valueOf('g'), "blockGlass",
						Character.valueOf('s'), Blocks.SOUL_SAND
			});
		}

		// Compressed Blocks
		if (ConfigHandler.FleshBlock) {
			Recipes.addShapedRecipe("flesh_block", new ItemStack(TechBlocks.flesh_block), new Object[] {
					"rrr",
					"rrr",
					"rrr",
						Character.valueOf('r'), Items.ROTTEN_FLESH
			});
			
			Recipes.addShapelessRecipe("rotten_flesh", new ItemStack(Items.ROTTEN_FLESH, 9), new Object[] {
					TechBlocks.flesh_block
			});
		}
		if (ConfigHandler.BoneBlock) {
			Recipes.addShapedRecipe("bone_block", new ItemStack(TechBlocks.bone_block), new Object[] {
					"bbb",
					"bbb",
					"bbb",
						Character.valueOf('b'), "bone"
			});
			
			Recipes.addShapelessRecipe("bone", new ItemStack(Items.BONE, 9), new Object[] {
					TechBlocks.bone_block
			});
		}
		if (ConfigHandler.NetherStarBlock) {
			Recipes.addShapedRecipe("netherstar_block", new ItemStack(TechBlocks.netherstar_block), new Object[] {
					"nnn",
					"nnn",
					"nnn",
						Character.valueOf('n'), Items.NETHER_STAR
			});
			
			Recipes.addShapelessRecipe("nether_star", new ItemStack(Items.NETHER_STAR, 9), new Object[] {
					TechBlocks.netherstar_block
			});
		}
		if (ConfigHandler.DioriteBrick) {
			Recipes.addShapedRecipe("diorite_brick", new ItemStack(TechBlocks.diorite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneDioritePolished"
			});
			
			Recipes.addShapelessRecipe("diorite", new ItemStack(Blocks.STONE, 1, 4), new Object[] {
					TechBlocks.diorite_brick
			});
		}
		if (ConfigHandler.GraniteBrick) {
			Recipes.addShapedRecipe("granite_brick", new ItemStack(TechBlocks.granite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneGranitePolished"
			});
			
			Recipes.addShapelessRecipe("granite", new ItemStack(Blocks.STONE, 1, 2), new Object[] {
					TechBlocks.granite_brick
			});
		}
		if (ConfigHandler.AndesiteBrick) {
			Recipes.addShapedRecipe("andesite_brick", new ItemStack(TechBlocks.andesite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneAndesitePolished"
			});
			
			Recipes.addShapelessRecipe("andesite", new ItemStack(Blocks.STONE, 1, 6), new Object[] {
					TechBlocks.andesite_brick
			});
		}

		// Flint Block
		if (ConfigHandler.FlintBlock) {
			Recipes.addShapedRecipe("flint_block", new ItemStack(TechBlocks.flint_block), new Object[] {
					"fff",
					"fff",
					"fff",
						Character.valueOf('f'), "flint"
			});
			
			Recipes.addShapelessRecipe("flint", new ItemStack(Items.FLINT, 9), new Object[] {
					TechBlocks.flint_block
			});
		}

		// Smooth EndStone
		if (ConfigHandler.SmoothEndStone) {
			Recipes.addShapedRecipe("smooth_endstone", new ItemStack(TechBlocks.smooth_endstone, 4), new Object[] {
					"ee",
					"ee",
						Character.valueOf('e'), Blocks.END_STONE
			});
			
			Recipes.addShapedRecipe("end_bricks", new ItemStack(Blocks.END_BRICKS, 4), new Object[] {
					"ee",
					"ee",
						Character.valueOf('e'), "smoothEndstone"
			});
		}

		Recipes.addShapedRecipe("flint", new ItemStack(Items.FLINT), new Object[] {
				"gg ",
				"g  ",
					Character.valueOf('g'), "blockGravel"
		});
	}
	
	public static void addShapedRecipe(String name, ItemStack output, Object... inputs)
	{
		addShapedRecipe(name, name, output, inputs);
	}
	
	public static void addShapedRecipe(String name, String group, ItemStack output, Object... inputs)
	{
		if(name != null)
			name = String.format("%s:%s", Reference.MOD_ID, name);
		
		if(group != null)
			group = String.format("%s:%s", Reference.MOD_ID, group);
		
		GameRegistry.addShapedRecipe(new ResourceLocation(name), new ResourceLocation(group), output, inputs);
	}
	
	public static void addShapelessRecipe(String name, ItemStack output, Object... inputs)
	{
		addShapelessRecipe(name, name, output, inputs);
	}
	
	public static void addShapelessRecipe(String name, String group, ItemStack output, Object... inputs)
	{
		if(name != null)
			name = String.format("%s:%s", Reference.MOD_ID, name);
		
		if(group != null)
			group = String.format("%s:%s", Reference.MOD_ID, group);
		
		Ingredient[] ingredients = new Ingredient[inputs.length];
		
		for(int i = 0; i < inputs.length; i++)
		{
			ItemStack itemstack = ItemStack.EMPTY;
			Object input = inputs[i];
			
			if(input instanceof ItemStack)
			{
				itemstack = (ItemStack)input;
			}
			else if(input instanceof Block)
			{
				itemstack = new ItemStack((Block)input);
			}
			else if(input instanceof Item)
			{
				itemstack = new ItemStack((Item)input);
			}
			
			if(itemstack == ItemStack.EMPTY)
			{
				if(input instanceof String)
				{
					List<ItemStack> oreDictList = OreDictionary.getOres((String)input);
					ingredients[i] = Ingredient.fromStacks(oreDictList.toArray(new ItemStack[oreDictList.size()]));
				}
			}
			else
			{
				ingredients[i] = Ingredient.fromStacks(itemstack);
			}
		}
		
		GameRegistry.addShapelessRecipe(new ResourceLocation(name), new ResourceLocation(group), output, ingredients);
	}
}
