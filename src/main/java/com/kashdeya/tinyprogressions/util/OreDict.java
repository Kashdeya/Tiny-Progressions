package com.kashdeya.tinyprogressions.util;

import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.properties.EnumDustColor;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {
	
	public static void init()
	{
		// Vanilla Ore Dicts
		OreDictionary.registerOre("flint", Items.FLINT);
		OreDictionary.registerOre("blockGravel", Blocks.GRAVEL);
		OreDictionary.registerOre("glassBottle", Items.GLASS_BOTTLE);
		OreDictionary.registerOre("dragonEgg", Blocks.DRAGON_EGG);
		// Glowstone Dust
		for(int i = 0; i < EnumDustColor.values().length; i++)
			OreDictionary.registerOre(EnumDustColor.values()[i].getOredict(), new ItemStack(TechItems.colored_dust, 1, i));
	}
}
