package com.kashdeya.tinyprogressions.crafting;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;

import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void init()
	{
		if (ConfigHandler.all_juices){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.juicer), new Object[] {
					"l",
					"s",
						Character.valueOf('s'), "stone",
						Character.valueOf('l'), Blocks.STONE_BUTTON
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.apple_juice), new Object[] {
					"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Items.APPLE
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.carrot_juice), new Object[] {
					"ja",
					Character.valueOf('j'), "juicer",
					Character.valueOf('a'), Items.CARROT
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.potatoe_juice), new Object[] {
					"ja",
					Character.valueOf('j'), "juicer",
					Character.valueOf('a'), Items.POTATO
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.beet_juice), new Object[] {
					"ja",
					Character.valueOf('j'), "juicer",
					Character.valueOf('a'), Items.BEETROOT
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.cactus_juice, 2), new Object[] {
					"ja",
					Character.valueOf('j'), "juicer",
					Character.valueOf('a'), Blocks.CACTUS
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.slime_juice), new Object[] {
					"ja",
					Character.valueOf('j'), "juicer",
					Character.valueOf('a'), Items.SLIME_BALL
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.wheat_juice), new Object[] {
					"ja",
					Character.valueOf('j'), "juicer",
					Character.valueOf('a'), Items.WHEAT
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.melon_juice), new Object[] {
					"ja",
					Character.valueOf('j'), "juicer",
					Character.valueOf('a'), Items.MELON
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.pumpkin_juice, 2), new Object[] {
					"ja",
					Character.valueOf('j'), "juicer",
					Character.valueOf('a'), Blocks.PUMPKIN
			});
		}
		
		if (ConfigHandler.StoneArmor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.stone_helmet), new Object[] {
					"sss",
					"s s",
						Character.valueOf('s'), "stone"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.stone_chestplate), new Object[] {
					"s s",
					"sss",
					"sss",
						Character.valueOf('s'), "stone"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.stone_leggings), new Object[] {
					"sss",
					"s s",
					"s s",
						Character.valueOf('s'), "stone"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.stone_boots), new Object[] {
					"s s",
					"s s",
						Character.valueOf('s'), "stone"
			});
		}
		
		if (ConfigHandler.obsidian_armor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.obsidian_helmet), new Object[] {
					"sss",
					"s s",
						Character.valueOf('s'), "obsidian"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.obsidian_chestplate), new Object[] {
					"s s",
					"sss",
					"sss",
						Character.valueOf('s'), "obsidian"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.obsidian_leggings), new Object[] {
					"sss",
					"s s",
					"s s",
						Character.valueOf('s'), "obsidian"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.obsidian_boots), new Object[] {
					"s s",
					"s s",
						Character.valueOf('s'), "obsidian"
			});
		}
		
		if (ConfigHandler.FlintArmor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.flint_helmet), new Object[] {
					"fff",
					"f f",
						Character.valueOf('f'), "flint"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.flint_chestplate), new Object[] {
					"f f",
					"fff",
					"fff",
						Character.valueOf('f'), "flint"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.flint_leggings), new Object[] {
					"fff",
					"f f",
					"f f",
						Character.valueOf('f'), "flint"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.flint_boots), new Object[] {
					"f f",
					"f f",
						Character.valueOf('f'), "flint"
			});
		}
		
		if (ConfigHandler.BoneArmor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.bone_helmet), new Object[] {
					"bbb",
					"b b",
						Character.valueOf('b'), "bone"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.bone_chestplate), new Object[] {
					"b b",
					"bbb",
					"bbb",
						Character.valueOf('b'), "bone"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.bone_leggings), new Object[] {
					"bbb",
					"b b",
					"b b",
						Character.valueOf('b'), "bone"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.bone_boots), new Object[] {
					"b b",
					"b b",
						Character.valueOf('b'), "bone"
			});
		}
		
		if (ConfigHandler.WoodArmor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wooden_helmet), new Object[] {
					"lll",
					"l l",
						Character.valueOf('l'), Blocks.LOG
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wooden_chestplate), new Object[] {
					"l l",
					"lll",
					"lll",
						Character.valueOf('l'), Blocks.LOG
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wooden_leggings), new Object[] {
					"lll",
					"l l",
					"l l",
						Character.valueOf('l'), Blocks.LOG
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wooden_boots), new Object[] {
					"l l",
					"l l",
						Character.valueOf('l'), Blocks.LOG
			});
		}
		
		if (ConfigHandler.lava_ore){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.lava_helmet), new Object[] {
					"lll",
					"l l",
						Character.valueOf('l'), TechItems.lava_crystal
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.lava_chestplate), new Object[] {
					"l l",
					"lll",
					"lll",
						Character.valueOf('l'), TechItems.lava_crystal
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.lava_leggings), new Object[] {
					"lll",
					"l l",
					"l l",
						Character.valueOf('l'), TechItems.lava_crystal
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.lava_boots), new Object[] {
					"l l",
					"l l",
						Character.valueOf('l'), TechItems.lava_crystal
			});
		}
		
		if (ConfigHandler.wither_armor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wither_helmet), new Object[] {
					"www",
					"w w",
						Character.valueOf('w'), TechItems.wither_rib
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wither_chestplate), new Object[] {
					"w w",
					"www",
					"www",
						Character.valueOf('w'), TechItems.wither_rib
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wither_leggings), new Object[] {
					"www",
					"w w",
					"w w",
						Character.valueOf('w'), TechItems.wither_rib
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.wither_boots), new Object[] {
					"w w",
					"w w",
						Character.valueOf('w'), TechItems.wither_rib
			});
		}
		
		if (ConfigHandler.dragon_armor){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.dragon_helmet), new Object[] {
					"ddd",
					"d d",
						Character.valueOf('d'), TechItems.dragon_scale
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.dragon_chestplate), new Object[] {
					"d d",
					"ddd",
					"ddd",
						Character.valueOf('d'), TechItems.dragon_scale
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.dragon_leggings), new Object[] {
					"ddd",
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.dragon_scale
			});
			
		   	RecipeRegistry.addShapedRecipe(new ItemStack(TechArmor.dragon_boots), new Object[] {
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.dragon_scale
			});
		}
		
		if (ConfigHandler.FlintTools){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.flint_pickaxe), new Object[] {
					"fff",
					" s ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.flint_axe), new Object[] {
					"ff ",
					"fs ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.flint_spade), new Object[] {
					" f ",
					" s ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.flint_sword), new Object[] {
					" f ",
					" f ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.flint_hoe), new Object[] {
					"ff ",
					" s ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Bone
		if (ConfigHandler.BoneTools){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.bone_pickaxe), new Object[] {
					"bbb",
					" s ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.bone_axe), new Object[] {
					"bb ",
					"bs ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.bone_spade), new Object[] {
					" b ",
					" s ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.bone_sword), new Object[] {
					" b ",
					" b ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.bone_hoe), new Object[] {
					"bb ",
					" s ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Birthday
	    if (ConfigHandler.BirthdayPickaxe && ConfigHandler.ReinforcedObsidian){
			ItemStack BirthdayPickaxe = new ItemStack(TechTools.birthday_pickaxe);
			BirthdayPickaxe.addEnchantment(Enchantments.MENDING, 2);
			
			RecipeRegistry.addShapedRecipe(BirthdayPickaxe, new Object[] {
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
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.wooden_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "logWood",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.stone_scythe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.stone_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "stone",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.golden_scythe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.golden_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "ingotGold",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.iron_scythe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.iron_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.diamond_scythe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.diamond_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
	    }
		if (ConfigHandler.emerald_scythe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_scythe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Emerald
		if (ConfigHandler.emerald_axe){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_axe), new Object[] {
					"ee ",
					"es ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_pickaxe){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_pickaxe), new Object[] {
					"eee",
					" s ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_spade){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_spade), new Object[] {
					" e ",
					" s ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_hoe){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_hoe), new Object[] {
					"ee ",
					" s ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_sword){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_sword), new Object[] {
					" e ",
					" e ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Obsidian
		if (ConfigHandler.obsidian_axe){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_axe), new Object[] {
					"oo ",
					"os ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_pickaxe){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_pickaxe), new Object[] {
					"ooo",
					" s ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_spade){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_spade), new Object[] {
					" o ",
					" s ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_hoe){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_hoe), new Object[] {
					"oo ",
					" s ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_sword){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_sword), new Object[] {
					" o ",
					" o ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Multi
		if (ConfigHandler.wooden_multi){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.wooden_multi), new Object[] {
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
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.stone_multi), new Object[] {
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
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.golden_multi), new Object[] {
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
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.iron_multi), new Object[] {
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
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.diamond_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), Items.DIAMOND_AXE,
						Character.valueOf('S'), Items.DIAMOND_SHOVEL,
						Character.valueOf('P'), Items.DIAMOND_PICKAXE,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_multi && ConfigHandler.emerald_axe && ConfigHandler.emerald_spade && ConfigHandler.emerald_pickaxe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), TechTools.emerald_axe,
						Character.valueOf('S'), TechTools.emerald_spade,
						Character.valueOf('P'), TechTools.emerald_pickaxe,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_multi && ConfigHandler.obsidian_axe && ConfigHandler.obsidian_spade && ConfigHandler.obsidian_pickaxe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_multi), new Object[] {
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
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.wooden_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "logWood",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.stone_battle){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.stone_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "stone",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.golden_battle){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.golden_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "ingotGold",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.iron_battle){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.iron_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.diamond_battle){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.diamond_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_battle){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_battle){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Spear
		if (ConfigHandler.wooden_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.wooden_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "logWood",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.stone_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.stone_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "stone",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.golden_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.golden_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "ingotGold",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.iron_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.iron_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.diamond_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.diamond_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		
		// Watering Cans
		if (ConfigHandler.WateringCan) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.watering_can), new Object[] {
					"id ",
					"iwi",
					" i ",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('d'), "dyeWhite",
						Character.valueOf('w'), Items.WATER_BUCKET
			});
		}
		if (ConfigHandler.WateringCanUpgrade && ConfigHandler.WateringCan) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.watering_can_upgrade), new Object[] {
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
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.quartz_knife), new Object[] {
					"  s",
					" s ",
					"q  ",
						Character.valueOf('s'), "stickWood",
						Character.valueOf('q'), "gemQuartz"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.quartz_dust), new Object[] {
					"k",
					"q",
						Character.valueOf('k'), TechItems.quartz_knife,
						Character.valueOf('q'), "gemQuartz"
			});
		}
		// Misc Items
		if (ConfigHandler.StoneTorch) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.stone_stick, 4), new Object[] {
					"c",
					"c",
						Character.valueOf('c'), "cobblestone"
			});
		}
		if (ConfigHandler.MyceliumSeeds) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.mycelium_seeds), new Object[] {
					"sss",
					"ses",
					"sss",
						Character.valueOf('s'), Items.WHEAT_SEEDS,
						Character.valueOf('e'), Items.SPIDER_EYE
			});
		}
		if (ConfigHandler.DiamondApple) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.diamond_apple), new Object[] {
					"ddd",
					"dad",
					"ddd",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.EmeraldApple) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.emerald_apple), new Object[] {
					"eee",
					"eae",
					"eee",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.iron_apple) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.iron_apple), new Object[] {
					"iii",
					"iai",
					"iii",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('a'), Items.APPLE
			});
		}
 		if (ConfigHandler.redstone_apple) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.redstone_apple), new Object[] {
					"rrr",
					"rar",
					"rrr",
						Character.valueOf('r'), "dustRedstone",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.ApplePro) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.golden_apple), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "ingotGold",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.MedKit) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.med_kit), new Object[] {
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
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechItems.flint_knife), new Object[] {
					"flint", "flint", "stickWood"
			});
		}
		// Ender Dust
		if (ConfigHandler.ender_ore) {
			RecipeRegistry.addShapedRecipe(new ItemStack(Items.ENDER_PEARL), new Object[] {
					"eee",
					"e e",
					"eee",
						Character.valueOf('e'), "dustEnder"
			});
		}
		
		// Tech Blocks
		if (ConfigHandler.BlockGrowth) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.growth_block), new Object[] {
					"ibi",
					"ded",
					"ibi",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('b'), "blockBone",
						Character.valueOf('d'), "blockGlassDirty",
						Character.valueOf('e'), Blocks.SEA_LANTERN
			});
		}
		if (ConfigHandler.BlockGrowthUpgrade && ConfigHandler.WateringCanUpgrade && ConfigHandler.BlockGrowth && ConfigHandler.NetherStarBlock) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.growth_upgrade), new Object[] {
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
		if (ConfigHandler.BlockGrowthUpgradeTwo && ConfigHandler.BlockGrowthUpgrade) {
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechBlocks.growth_upgrade_two), new Object[] {
					TechBlocks.growth_upgrade, Blocks.DRAGON_EGG
			});
		}
		if (ConfigHandler.Cobblegen) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.cobblegen_block), new Object[] {
					"ccc",
					"wgl",
					"ccc",
						Character.valueOf('c'), "cobblestone",
						Character.valueOf('w'), Items.WATER_BUCKET,
						Character.valueOf('l'), Items.LAVA_BUCKET,
						Character.valueOf('g'), "blockGlass"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.cobblegen_block), new Object[] {
					"ccc",
					"lgw",
					"ccc",
						Character.valueOf('c'), "cobblestone",
						Character.valueOf('w'), Items.WATER_BUCKET,
						Character.valueOf('l'), Items.LAVA_BUCKET,
						Character.valueOf('g'), "blockGlass"
			});
		}
		if (ConfigHandler.IronCobblegen && ConfigHandler.Cobblegen) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.iron_cobblegen_block), new Object[] {
					"iii",
					"igi",
					"iii",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('g'), TechBlocks.cobblegen_block
			});
		}
		if (ConfigHandler.DiamondCobblegen && ConfigHandler.IronCobblegen) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.diamond_cobblegen_block), new Object[] {
					"ddd",
					"did",
					"ddd",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('i'), TechBlocks.iron_cobblegen_block
			});
		}
		if (ConfigHandler.BlazeCobblegen && ConfigHandler.DiamondCobblegen) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.blaze_cobblegen_block), new Object[] {
					"bbb",
					"bdb",
					"bbb",
						Character.valueOf('b'), Items.BLAZE_ROD,
						Character.valueOf('d'), TechBlocks.diamond_cobblegen_block
			});
		}
		if (ConfigHandler.EmeraldCobblegen && ConfigHandler.BlazeCobblegen) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.emerald_cobblegen_block), new Object[] {
					"eee",
					"ebe",
					"eee",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('b'), TechBlocks.blaze_cobblegen_block
			});
		}

		// Deco Blocks
		if (ConfigHandler.StoneTorch) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.stone_torch), new Object[] {
					"c",
					"s",
						Character.valueOf('c'), Items.COAL,
						Character.valueOf('s'), "stickStone"
			});
		}
		if (ConfigHandler.CharcoalBlock) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.charcoal_block), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), new ItemStack(Items.COAL, 1, 1)
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 9, 1), new Object[] {
					TechBlocks.charcoal_block
			});
		}
		if (ConfigHandler.ReinforcedGlass) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.reinforced_glass, 4), new Object[] {
					"ogo",
					"gog",
					"ogo",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('g'), "blockGlassDirty"
			});
		}
		if (ConfigHandler.ReinforcedObsidian) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.reinforced_obsidian, 4), new Object[] {
					"ioi",
					"oio",
					"ioi",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('i'), Blocks.IRON_BARS
			});
		}
		if (ConfigHandler.DirtyGlass) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.dirty_glass, 4), new Object[] {
					"sgs",
					"gsg",
					"sgs",
						Character.valueOf('g'), "blockGlass",
						Character.valueOf('s'), Blocks.SOUL_SAND
			});
		}

		// Compressed Blocks
		if (ConfigHandler.FleshBlock) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.flesh_block), new Object[] {
					"rrr",
					"rrr",
					"rrr",
						Character.valueOf('r'), Items.ROTTEN_FLESH
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 9), new Object[] {
					TechBlocks.flesh_block
			});
		}
		if (ConfigHandler.BoneBlock) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.bone_block), new Object[] {
					"bbb",
					"bbb",
					"bbb",
						Character.valueOf('b'), "bone"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.BONE, 9), new Object[] {
					TechBlocks.bone_block
			});
		}
		if (ConfigHandler.NetherStarBlock) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.netherstar_block), new Object[] {
					"nnn",
					"nnn",
					"nnn",
						Character.valueOf('n'), Items.NETHER_STAR
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_STAR, 9), new Object[] {
					TechBlocks.netherstar_block
			});
		}
		if (ConfigHandler.DioriteBrick) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.diorite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneDioritePolished"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 4, 4), new Object[] {
					TechBlocks.diorite_brick
			});
		}
		if (ConfigHandler.GraniteBrick) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.granite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneGranitePolished"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 4, 2), new Object[] {
					TechBlocks.granite_brick
			});
		}
		if (ConfigHandler.AndesiteBrick) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.andesite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneAndesitePolished"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 4, 6), new Object[] {
					TechBlocks.andesite_brick
			});
		}

		// Flint Block
		if (ConfigHandler.FlintBlock) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.flint_block), new Object[] {
					"fff",
					"fff",
					"fff",
						Character.valueOf('f'), "flint"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.FLINT, 9), new Object[] {
					TechBlocks.flint_block
			});
		}

		// Smooth EndStone
		if (ConfigHandler.SmoothEndStone) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.smooth_endstone, 4), new Object[] {
					"ee",
					"ee",
						Character.valueOf('e'), Blocks.END_STONE
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(Blocks.END_BRICKS, 4), new Object[] {
					"ee",
					"ee",
						Character.valueOf('e'), "smoothEndstone"
			});
		}
		
		if (ConfigHandler.hardened_stone) {
			GameRegistry.addSmelting(Blocks.STONE, new ItemStack(TechBlocks.hardened_stone), 1.0F);
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks), new Object[] {
		            "ss",
		            "ss",
		                Character.valueOf('s'), TechBlocks.hardened_stone
		    });
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks), new Object[] {
		            "ss",
		            "ss",
		                Character.valueOf('s'), TechBlocks.hardened_stone_bricks
		    });
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_stairs, 4), new Object[] {
			        "  s",
			        " ss",
			        "sss",
			            Character.valueOf('s'), TechBlocks.hardened_stone
			});
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks_stairs, 4), new Object[] {
                    "  s",
                    " ss",
                    "sss",
                        Character.valueOf('s'), TechBlocks.hardened_stone_bricks
            });
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks_stairs, 4), new Object[] {
                    "  s",
                    " ss",
                    "sss",
                        Character.valueOf('s'), TechBlocks.hardened_stone_smallbricks
            });
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_slab_half, 6), new Object[] {
			  "sss",
			      Character.valueOf('s'), TechBlocks.hardened_stone
			});
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks_slab_half, 6), new Object[] {
		              "sss",
		                  Character.valueOf('s'), TechBlocks.hardened_stone_bricks
		            });
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks_slab_half, 6), new Object[] {
		              "sss",
		                  Character.valueOf('s'), TechBlocks.hardened_stone_smallbricks
		            });
		}
		
		// Pouch
		if (ConfigHandler.pouch) {
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.pouch), new Object[] {
		            "lcl",
		            "scs",
		            "lll",
		                Character.valueOf('s'), Items.STRING,
		                Character.valueOf('l'), Items.LEATHER,
		                Character.valueOf('c'), Blocks.CHEST
		    });
		}
		
		if (ConfigHandler.FlintRecipe){
			RecipeRegistry.addShapedRecipe(new ItemStack(Items.FLINT), new Object[] {
					"gg ",
					"g  ",
						Character.valueOf('g'), "blockGravel"
			});
		}
		
		if (ConfigHandler.old_reed) {
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.SUGAR), new Object[] {
					TechItems.dead_reed
			});
		}
		
		if (ConfigHandler.angel_block) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.fmf_block), new Object[] {
		            "ifi",
		            "f f",
		            "ifi",
		                Character.valueOf('i'), "ingotIron",
		                Character.valueOf('f'), "feather"
		    });
		}
	}
}
