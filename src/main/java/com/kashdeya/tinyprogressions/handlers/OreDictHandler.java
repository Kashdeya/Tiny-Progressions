package com.kashdeya.tinyprogressions.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;

public class OreDictHandler {
	
	public static void init(){
		OreDictionary.registerOre("blockCharcoal", TechBlocks.CharcoalBlock);
		OreDictionary.registerOre("blockGlassDirty", TechBlocks.DirtyGlass);
		OreDictionary.registerOre("blockReinforcedGlass", TechBlocks.ReinforcedGlass);
		OreDictionary.registerOre("blockReinforcedObsidian", TechBlocks.ReinforcedObsidian);
		OreDictionary.registerOre("stoneAndesiteBrick", TechBlocks.AndesiteBrick);
		OreDictionary.registerOre("stoneDioriteBrick", TechBlocks.DioriteBrick);
		OreDictionary.registerOre("stoneGraniteBrick", TechBlocks.GraniteBrick);
		OreDictionary.registerOre("blockFlint", TechBlocks.FlintBlock);
		OreDictionary.registerOre("blockBone", TechBlocks.BoneBlock);
		OreDictionary.registerOre("smoothEndstone", TechBlocks.SmoothEndStone);
		OreDictionary.registerOre("ingotFlint", TechItems.FlintIngot);
	}

}
