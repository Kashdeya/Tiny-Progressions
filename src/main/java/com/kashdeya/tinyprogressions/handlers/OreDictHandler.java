package com.kashdeya.tinyprogressions.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.kashdeya.tinyprogressions.inits.TechBlocks;

public class OreDictHandler {
	
	public static void init(){
		OreDictionary.registerOre("blockCharcoal", new ItemStack(TechBlocks.CharcoalBlock));
		OreDictionary.registerOre("blockGlass", new ItemStack(TechBlocks.DirtyGlass));
		OreDictionary.registerOre("blockReinforcedGlass", new ItemStack(TechBlocks.ReinforcedGlass));
		OreDictionary.registerOre("stoneAndesiteBrick", new ItemStack(TechBlocks.AndesiteBrick));
		OreDictionary.registerOre("stoneDioriteBrick", new ItemStack(TechBlocks.DioriteBrick));
		OreDictionary.registerOre("stoneGraniteBrick", new ItemStack(TechBlocks.GraniteBrick));
	}

}
