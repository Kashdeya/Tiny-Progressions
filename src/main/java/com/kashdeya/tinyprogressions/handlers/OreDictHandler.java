package com.kashdeya.tinyprogressions.handlers;

import net.minecraftforge.oredict.OreDictionary;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;

public class OreDictHandler {
	
	public static void init(){
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
		OreDictionary.registerOre("stickStone", TechItems.stone_stick);
		OreDictionary.registerOre("torch", TechBlocks.stone_torch);
		OreDictionary.registerOre("dustEnder", TechItems.ender_dust);
		OreDictionary.registerOre("gemAmethyst", TechItems.amethyst_gem);
		OreDictionary.registerOre("chain", TechItems.chain_links);
		OreDictionary.registerOre("dragonScale", TechItems.dragon_scale);
		OreDictionary.registerOre("ingotLapis", TechItems.lapis_ingot);
		OreDictionary.registerOre("gemLava", TechItems.lava_crystal);
		OreDictionary.registerOre("ingotRedstone", TechItems.redstone_ingot);
		OreDictionary.registerOre("ingotReinforcedDiamond", TechItems.reinforced_diamond);
		OreDictionary.registerOre("witherRib", TechItems.witherRib);
		OreDictionary.registerOre("gemRuby", TechItems.ruby_gem);
		OreDictionary.registerOre("gemSapphire", TechItems.sapphire_gem);
	}

}
