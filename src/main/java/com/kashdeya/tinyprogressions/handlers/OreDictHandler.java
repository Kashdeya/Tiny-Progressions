package com.kashdeya.tinyprogressions.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;

public class OreDictHandler {
	
	public static void init(){
		OreDictionary.registerOre("blockCharcoal", new ItemStack(TechBlocks.CharcoalBlock));
		OreDictionary.registerOre("blockGlassDirty", new ItemStack(TechBlocks.DirtyGlass));
		OreDictionary.registerOre("blockReinforcedGlass", new ItemStack(TechBlocks.ReinforcedGlass));
		OreDictionary.registerOre("blockReinforcedObsidian", new ItemStack(TechBlocks.ReinforcedObsidian));
		OreDictionary.registerOre("stoneAndesiteBrick", new ItemStack(TechBlocks.AndesiteBrick));
		OreDictionary.registerOre("stoneDioriteBrick", new ItemStack(TechBlocks.DioriteBrick));
		OreDictionary.registerOre("stoneGraniteBrick", new ItemStack(TechBlocks.GraniteBrick));
		OreDictionary.registerOre("blockFlint", new ItemStack(TechBlocks.FlintBlock));
		OreDictionary.registerOre("blockBone", new ItemStack(TechBlocks.BoneBlock));
		OreDictionary.registerOre("smoothEndstone", new ItemStack(TechBlocks.SmoothEndStone));
		OreDictionary.registerOre("ingotFlint", new ItemStack(TechItems.FlintIngot));
	}

}
