package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {
	public static void init()
	{
		// Vanilla Ore Dicts
		OreDictionary.registerOre("flint", Items.FLINT);
		OreDictionary.registerOre("blockGravel", Blocks.GRAVEL);
		// Everything else Kappa
		OreDictionary.registerOre("juicer", TechItems.juicer);
		OreDictionary.registerOre("blockCharcoal", TechBlocks.charcoal_block);
		OreDictionary.registerOre("blockGlassDirty", TechBlocks.dirty_glass);
		OreDictionary.registerOre("blockReinforcedGlass", TechBlocks.reinforced_glass);
		OreDictionary.registerOre("blockReinforcedObsidian", TechBlocks.reinforced_obsidian);
		OreDictionary.registerOre("stoneAndesiteBrick", TechBlocks.andesite_brick);
		OreDictionary.registerOre("stoneDioriteBrick", TechBlocks.diorite_brick);
		OreDictionary.registerOre("stoneGraniteBrick", TechBlocks.granite_brick);
		OreDictionary.registerOre("blockFlint", TechBlocks.flint_block);
		OreDictionary.registerOre("blockBone", TechBlocks.bone_block);
		OreDictionary.registerOre("smoothEndstone", TechBlocks.smooth_endstone);
		OreDictionary.registerOre("ingotFlint", TechItems.flint_ingot);
		OreDictionary.registerOre("ingotReinforcedObsidian", TechItems.reinforced_obsidian_ingot);
		OreDictionary.registerOre("stickStone", TechItems.stone_stick);
		OreDictionary.registerOre("torch", TechBlocks.stone_torch);
		OreDictionary.registerOre("dustEnder", TechItems.ender_dust);
		// Glowstone Dust
		OreDictionary.registerOre("dustBlackGlowstone", TechItems.black_dust);
		OreDictionary.registerOre("dustBlueGlowstone", TechItems.blue_dust);
		OreDictionary.registerOre("dustBrownGlowstone", TechItems.brown_dust);
		OreDictionary.registerOre("dustCyanGlowstone", TechItems.cyan_dust);
		OreDictionary.registerOre("dustGrayGlowstone", TechItems.gray_dust);
		OreDictionary.registerOre("dustGreenGlowstone", TechItems.green_dust);
		OreDictionary.registerOre("dustLightBlueGlowstone", TechItems.lightblue_dust);
		OreDictionary.registerOre("dustLightGrayGlowstone", TechItems.silver_dust);
		OreDictionary.registerOre("dustLimeGlowstone", TechItems.lime_dust);
		OreDictionary.registerOre("dustMagentaGlowstone", TechItems.magenta_dust);
		OreDictionary.registerOre("dustOrangeGlowstone", TechItems.orange_dust);
		OreDictionary.registerOre("dustPinkGlowstone", TechItems.pink_dust);
		OreDictionary.registerOre("dustPurpleGlowstone", TechItems.purple_dust);
		OreDictionary.registerOre("dustRedGlowstone", TechItems.red_dust);
		OreDictionary.registerOre("dustWhiteGlowstone", TechItems.white_dust);
	}
}
