package com.kashdeya.tinyprogressions.recipes;

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
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {
	
	public static void registerRecipes(){
		
		// Armor
		if (ConfigHandler.WoodArmor){
			GameRegistry.addRecipe(new ItemStack(TechArmor.wooden_helmet), "fff", "f f", 'f', new ItemStack(Blocks.LOG, 1, 0));
			GameRegistry.addRecipe(new ItemStack(TechArmor.wooden_chestplate), "f f", "fff", "fff", 'f', new ItemStack(Blocks.LOG, 1, 0));
			GameRegistry.addRecipe(new ItemStack(TechArmor.wooden_leggings), "fff", "f f", "f f", 'f', new ItemStack(Blocks.LOG, 1, 0));
			GameRegistry.addRecipe(new ItemStack(TechArmor.wooden_boots), "f f", "f f", 'f', new ItemStack(Blocks.LOG, 1, 0));
		}
		if (ConfigHandler.StoneArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.stone_boots), "s s", "s s", 's', "stone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.stone_chestplate), "s s", "sss", "sss", 's', "stone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.stone_helmet), "sss", "s s", 's', "stone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.stone_leggings), "sss","s s", "s s", 's', "stone"));
		}
		if (ConfigHandler.FlintArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.flint_boots), "s s", "s s", 's', new ItemStack(Items.FLINT)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.flint_chestplate), "s s", "sss", "sss", 's', new ItemStack(Items.FLINT)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.flint_helmet), "sss", "s s", 's', new ItemStack(Items.FLINT)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.flint_leggings), "sss","s s", "s s", 's', new ItemStack(Items.FLINT)));
		}
		if (ConfigHandler.BoneArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.bone_boots), "s s", "s s", 's', "bone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.bone_chestplate), "s s", "sss", "sss", 's', "bone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.bone_helmet), "sss", "s s", 's', "bone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.bone_leggings), "sss","s s", "s s", 's', "bone"));
		}
		
		// Flint Recipe
		if (ConfigHandler.FlintRecipe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.FLINT), "ss ","s  ", 's', "gravel"));
		}
		
		// Smooth End Stone
		if (ConfigHandler.SmoothEndStone){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.smooth_endstone, 4), "nn", "nn", 'n', "endstone"));
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.END_BRICKS, 4), new Object[] {"CC", "CC", 'C', new ItemStack(TechBlocks.smooth_endstone)});			
		}
		
		// Scythes
		if (ConfigHandler.wooden_scythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.wooden_scythe), "ppp", " s ", "s  ", 'p', "logWood", 's', "stickWood"));
		}
		if (ConfigHandler.stone_scythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.stone_scythe), "sss", " t ", "t  ", 's', "stone", 't', "stickWood"));
		}
		if (ConfigHandler.golden_scythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.golden_scythe), "ggg", " s ", "s  ", 'g', "ingotGold", 's', "stickWood"));
		}
		if (ConfigHandler.iron_scythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.iron_scythe), "iii", " s ", "s  ", 'i', "ingotIron", 's', "stickWood"));
		}
		if (ConfigHandler.diamond_scythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.diamond_scythe), "ddd", " s ", "s  ", 'd', "gemDiamond", 's', "stickWood"));
		}
		if (ConfigHandler.emerald_scythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_scythe), "ddd", " s ", "s  ", 'd', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.obsidian_scythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_scythe), "ddd", " s ", "s  ", 'd', "obsidian", 's', "stickWood"));
		}
		
		// Multi
		if (ConfigHandler.wooden_multi){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.wooden_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(Items.WOODEN_AXE), 's', new ItemStack(Items.WOODEN_SHOVEL), 'p', new ItemStack(Items.WOODEN_PICKAXE), 'd', new ItemStack(Items.STICK)});
		}
		if (ConfigHandler.stone_multi){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.stone_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(Items.STONE_AXE), 's', new ItemStack(Items.STONE_SHOVEL), 'p', new ItemStack(Items.STONE_PICKAXE), 'd', new ItemStack(Items.STICK)});
		}
		if (ConfigHandler.golden_multi){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.golden_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(Items.GOLDEN_AXE), 's', new ItemStack(Items.GOLDEN_SHOVEL), 'p', new ItemStack(Items.GOLDEN_PICKAXE), 'd', new ItemStack(Items.STICK)});
		}
		if (ConfigHandler.iron_multi){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.iron_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(Items.IRON_AXE), 's', new ItemStack(Items.IRON_SHOVEL), 'p', new ItemStack(Items.IRON_PICKAXE), 'd', new ItemStack(Items.STICK)});
		}
		if (ConfigHandler.diamond_multi){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.diamond_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(Items.DIAMOND_AXE), 's', new ItemStack(Items.DIAMOND_SHOVEL), 'p', new ItemStack(Items.DIAMOND_PICKAXE), 'd', new ItemStack(Items.STICK)});
		}
		if (ConfigHandler.emerald_multi){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(TechTools.emerald_axe), 's', new ItemStack(TechTools.emerald_spade), 'p', new ItemStack(TechTools.emerald_pickaxe), 'd', new ItemStack(Items.STICK)});
		}
		if (ConfigHandler.obsidian_multi){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(TechTools.obsidian_axe), 's', new ItemStack(TechTools.obsidian_spade), 'p', new ItemStack(TechTools.obsidian_pickaxe), 'd', new ItemStack(Items.STICK)});
		}
		
		// Battle
		if (ConfigHandler.wooden_battle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.wooden_battle), "psp", "psp", " s ", 'p', "logWood", 's', "stickWood"));
		}
		if (ConfigHandler.stone_battle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.stone_battle), "sts", "sts", " t ", 's', "stone", 't', "stickWood"));
		}
		if (ConfigHandler.golden_battle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.golden_battle), "gsg", "gsg", " s ", 'g', "ingotGold", 's', "stickWood"));
		}
		if (ConfigHandler.iron_battle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.iron_battle), "isi", "isi", " s ", 'i', "ingotIron", 's', "stickWood"));
		}
		if (ConfigHandler.diamond_battle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.diamond_battle), "dsd", "dsd", " s ", 'd', "gemDiamond", 's', "stickWood"));
		}
		if (ConfigHandler.emerald_battle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_battle), "dsd", "dsd", " s ", 'd', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.obsidian_battle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_battle), "dsd", "dsd", " s ", 'd', "obsidian", 's', "stickWood"));
		}
		
		// Spear
		if (ConfigHandler.wooden_spear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.wooden_spear), "p  ", " s ", "  s", 'p', "logWood", 's', "stickWood"));
		}
		if (ConfigHandler.stone_spear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.stone_spear), "s  ", " t ", "  t", 's', "stone", 't', "stickWood"));
		}
		if (ConfigHandler.golden_spear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.golden_spear), "g  ", " s ", "  s", 'g', "ingotGold", 's', "stickWood"));
		}
		if (ConfigHandler.iron_spear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.iron_spear), "i  ", " s ", "  s", 'i', "ingotIron", 's', "stickWood"));
		}
		if (ConfigHandler.diamond_spear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.diamond_spear), "d  ", " s ", "  s", 'd', "gemDiamond", 's', "stickWood"));
		}
		if (ConfigHandler.emerald_spear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_spear), "d  ", " s ", "  s", 'd', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.obsidian_spear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_spear), "d  ", " s ", "  s", 'd', "obsidian", 's', "stickWood"));
		}
		
		// Emerald
		if (ConfigHandler.emerald_axe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_axe), "ff ", "fs ", " s ", 'f', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.emerald_hoe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_hoe), "ff ", " s ", " s ", 'f', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.emerald_sword){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_sword), "f", "f", "s", 'f', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.emerald_spade){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_spade), "f", "s", "s", 'f', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.emerald_pickaxe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_pickaxe), "fff", " s ", " s ", 'f', "gemEmerald", 's', "stickWood"));
		}
		
		// Obsidian
		if (ConfigHandler.obsidian_axe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_axe), "ff ", "fs ", " s ", 'f', "obsidian", 's', "stickWood"));
		}
		if (ConfigHandler.obsidian_hoe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_hoe), "ff ", " s ", " s ", 'f', "obsidian", 's', "stickWood"));
		}
		if (ConfigHandler.obsidian_sword){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_sword), "f", "f", "s", 'f', "obsidian", 's', "stickWood"));
		}
		if (ConfigHandler.obsidian_spade){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_spade), "f", "s", "s", 'f', "obsidian", 's', "stickWood"));
		}
		if (ConfigHandler.obsidian_pickaxe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_pickaxe), "fff", " s ", " s ", 'f', "obsidian", 's', "stickWood"));
		}
		
		// Compressed Blocks
		if (ConfigHandler.FlintBlock){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.flint_block), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.FLINT)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.FLINT, 9), new Object[] {new ItemStack(TechBlocks.flint_block)});
		}
		if (ConfigHandler.NetherStarBlock){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.netherstar_block), "nnn", "nnn", "nnn", 'n', "netherStar"));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_STAR, 9), new Object[] {new ItemStack(TechBlocks.netherstar_block)});
		}
		if (ConfigHandler.BoneBlock){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.bone_block), "bbb", "bbb", "bbb", 'b', "bone"));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.BONE, 9), new Object[] {new ItemStack(TechBlocks.bone_block)});
		}
		if (ConfigHandler.FleshBlock){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.flesh_block), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.ROTTEN_FLESH)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 9), new Object[] {new ItemStack(TechBlocks.flesh_block)});
		}
		if (ConfigHandler.CharcoalBlock){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.charcoal_block), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.COAL, 1, 1)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 9, 1), new Object[] {new ItemStack(TechBlocks.charcoal_block)});
		}
		
		// Medkit
		if (ConfigHandler.MedKit){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.med_kit), "prp", "rgr", "lrl", 'p', "paper", 'r', "dyeRed", 'g', new ItemStack(Items.SPECKLED_MELON), 'l', "leather"));
		}
		
		// Stone Torch
		if (ConfigHandler.StoneTorch){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.stone_stick, 4), "d", "d", 'd', "cobblestone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.stone_torch, 4), "c", "d", 'd', "stickStone", 'c', new ItemStack(Items.COAL, 1, 0)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.stone_torch, 4), "c", "d", 'd', "stickStone", 'c', new ItemStack(Items.COAL, 1, 1)));
		}
		
		// Ender Dust
		if (ConfigHandler.ender_ore){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ENDER_PEARL), "ddd", "d d", "ddd", 'd', "dustEnder"));
		}
		
		// Apples
		if (ConfigHandler.DiamondApple){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.diamond_apple), "ddd", "dad", "ddd", 'd', "gemDiamond", 'a', new ItemStack(Items.APPLE)));
		}
		if (ConfigHandler.EmeraldApple){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.emerald_apple), "ddd", "dad", "ddd", 'd', "gemEmerald", 'a', new ItemStack(Items.APPLE)));
		}
		if (ConfigHandler.NotchApple){
			GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[] {"ggg", "gag", "ggg", 'a', new ItemStack(Items.APPLE), 'g', new ItemStack(Blocks.GOLD_BLOCK)});
		}
		if (ConfigHandler.ApplePro){
			GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 0), new Object[] {"ggg", "gag", "ggg", 'a', new ItemStack(Items.APPLE), 'g', new ItemStack(Items.GOLD_NUGGET)});
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.golden_apple), new Object[] {"ggg", "gag", "ggg", 'a', new ItemStack(Items.APPLE), 'g', new ItemStack(Items.GOLD_INGOT)});
			GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[] {"ggg", "gag", "ggg", 'a', new ItemStack(Items.APPLE), 'g', new ItemStack(Blocks.GOLD_BLOCK)});
		}
		
		// Bricks
		if (ConfigHandler.AndesiteBrick){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.andesite_brick, 4), "cc", "cc", 'c', "stoneAndesitePolished"));
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 6), new Object[] {new ItemStack(TechBlocks.andesite_brick)});
		}
		if (ConfigHandler.DioriteBrick){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.diorite_brick, 4), "cc", "cc", 'c', "stoneDioritePolished"));
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 4), new Object[] {new ItemStack(TechBlocks.diorite_brick)});
		}
		if (ConfigHandler.GraniteBrick){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.granite_brick, 4), "cc", "cc", 'c', "stoneGranitePolished"));
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 2), new Object[] {new ItemStack(TechBlocks.granite_brick)});
		}
		
		// Glass
		if (ConfigHandler.DirtyGlass){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.dirty_glass, 4), "sgs", "gsg", "sgs", 'g', "blockGlass", 's', new ItemStack(Blocks.SOUL_SAND)));
		}
		
		// Seeds
		if (ConfigHandler.MyceliumSeeds){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.mycelium_seeds), new Object[] {"bbb", "bsb", "bbb", 'b', new ItemStack(Items.SPIDER_EYE), 's', new ItemStack(Items.WHEAT_SEEDS)});
		}
		
		// Flint
		if (ConfigHandler.FlintTools){
			GameRegistry.addRecipe(new ItemStack(TechTools.flint_axe), "ff ", "fs ", " s ", 'f', new ItemStack(Items.FLINT), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.flint_hoe), "ff ", " s ", " s ", 'f', new ItemStack(Items.FLINT), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.flint_sword), "f", "f", "s", 'f', new ItemStack(Items.FLINT), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.flint_spade), "f", "s", "s", 'f', new ItemStack(Items.FLINT), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.flint_pickaxe), "fff", " s ", " s ", 'f', new ItemStack(Items.FLINT), 's', new ItemStack(Items.STICK));
		}
		if (ConfigHandler.FlintKnife){
			GameRegistry.addShapelessRecipe(new ItemStack(TechItems.flint_knife), new Object[] {new ItemStack(Items.FLINT), new ItemStack(Items.STRING), new ItemStack(Items.STICK)});
		}
		
		// Bone
		if (ConfigHandler.BoneTools){
			GameRegistry.addRecipe(new ItemStack(TechTools.bone_axe), "bb ", "bs ", " s ", 'b', new ItemStack(Items.BONE), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.bone_hoe), "bb ", " s ", " s ", 'b', new ItemStack(Items.BONE), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.bone_sword), "b", "b", "s", 'b', new ItemStack(Items.BONE), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.bone_spade), "b", "s", "s", 'b', new ItemStack(Items.BONE), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.bone_pickaxe), "bbb", " s ", " s ", 'b', new ItemStack(Items.BONE), 's', new ItemStack(Items.STICK));
		}
		
		// Birthday
		if (ConfigHandler.BirthdayPickaxe){
			ItemStack BirthdayPickaxe;
			BirthdayPickaxe  = new ItemStack(TechTools.birthday_pickaxe);
			BirthdayPickaxe.addEnchantment(Enchantments.MENDING, 2);
			GameRegistry.addRecipe(new ShapedOreRecipe(BirthdayPickaxe, "rdr", " i ", " i ", 'r', "blockReinforcedObsidian", 'i', "stickWood", 'd', "gemDiamond"));
		}
		
		// Reinforced
		if (ConfigHandler.ReinforcedGlass){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.reinforced_glass, 4), "ogo", "gog", "ogo", 'g', "blockGlassDirty", 'o', "obsidian"));
		}
		if (ConfigHandler.ReinforcedObsidian){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.reinforced_obsidian, 4), "ioi", "oio", "ioi", 'i', new ItemStack(Blocks.IRON_BARS), 'o', "obsidian"));
		}
		
		// Quartz
		if (ConfigHandler.QuartzKnife){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.quartz_knife), "  s", " s ", "q  ", 's', "stickWood", 'q', "gemQuartz"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.quartz_dust), "s", "q",  's', new ItemStack(TechItems.quartz_knife), 'q', "gemQuartz"));
		}
		
		// Watering Can
		if (ConfigHandler.WateringCan){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.watering_can), "id ", "iwi", " i ", 'i', "ingotIron", 'o', "dyeWhite", 'w', new ItemStack(Items.WATER_BUCKET)));
		}
		if (ConfigHandler.WateringCanUpgrade){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.watering_can_upgrade), "on ", "owo", " o ", 'o', "obsidian", 'w', new ItemStack(TechItems.watering_can), 'n', "netherStar"));
		}
		
		// Growth Blocks
		if (ConfigHandler.BlockGrowth){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.growth_block), "ibi", "ded", "ibi", 'i', "ingotIron", 'b', "blockBone", 'e', new ItemStack(Blocks.SEA_LANTERN), 'd', "blockGlassDirty"));
		}
		if (ConfigHandler.BlockGrowthUpgrade){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.growth_upgrade), new Object[] {"CWC", "SES", "CNC", 'W', new ItemStack(TechItems.watering_can_upgrade), 'N', new ItemStack(TechBlocks.netherstar_block), 'C', new ItemStack(TechBlocks.reinforced_obsidian), 'S', new ItemStack(Items.END_CRYSTAL), 'E', new ItemStack(TechBlocks.growth_block)});
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.growth_upgrade_two), new Object[] {"ab ", 'a', new ItemStack(TechBlocks.growth_upgrade), 'b', new ItemStack(Blocks.DRAGON_EGG)});
		}
		
		// Cobblegens
		if (ConfigHandler.Cobblegen){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.cobblegen_block), "ccc", "wgl", "ccc", 'c', "cobblestone", 'g', "blockGlass", 'w', new ItemStack(Items.WATER_BUCKET), 'l', new ItemStack(Items.LAVA_BUCKET)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.cobblegen_block), "ccc", "lgw", "ccc", 'c', "cobblestone", 'g', "blockGlass", 'w', new ItemStack(Items.WATER_BUCKET), 'l', new ItemStack(Items.LAVA_BUCKET)));
		}
		if (ConfigHandler.IronCobblegen){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.iron_cobblegen_block), "iii", "igi", "iii", 'i', "ingotIron", 'g', new ItemStack(TechBlocks.cobblegen_block)));
		}
		if (ConfigHandler.DiamondCobblegen){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.diamond_cobblegen_block), "ddd", "dgd", "ddd", 'd', "gemDiamond", 'g', new ItemStack(TechBlocks.iron_cobblegen_block)));
		}
		if (ConfigHandler.BlazeCobblegen){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.blaze_cobblegen_block), new Object[] {"bbb", "bgb", "bbb", 'b', new ItemStack(Items.BLAZE_ROD), 'g', new ItemStack(TechBlocks.diamond_cobblegen_block)});
		}
		if (ConfigHandler.EmeraldCobblegen){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.emerald_cobblegen_block), "eee", "ebe", "eee", 'e', "gemEmerald", 'b', new ItemStack(TechBlocks.blaze_cobblegen_block)));
		}
	}

}
