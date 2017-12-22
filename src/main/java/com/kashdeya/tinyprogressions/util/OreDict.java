package com.kashdeya.tinyprogressions.util;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.properties.EnumDustColor;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {
	public static void init()
	{
		// Vanilla Ore Dicts
		OreDictionary.registerOre("flint", Items.FLINT);
		OreDictionary.registerOre("blockGravel", Blocks.GRAVEL);
		OreDictionary.registerOre("glassBottle", Items.GLASS_BOTTLE);
		// Glowstone Dust
		for(int i = 0; i < EnumDustColor.values().length; i++)
			OreDictionary.registerOre(EnumDustColor.values()[i].getOredict(), new ItemStack(TechItems.colored_dust, 1, i));
	}
}
