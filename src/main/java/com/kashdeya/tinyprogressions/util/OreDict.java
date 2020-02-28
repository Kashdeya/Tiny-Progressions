package com.kashdeya.tinyprogressions.util;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

//TODO  committed this out.. but addd new itemhasTag // OREDIC to TAGS
public class OreDict {
	
	public static void init()
	{
		// Vanilla Ore Dicts
//		OreDictionary.registerOre("flint", Items.FLINT);
//		OreDictionary.registerOre("blockGravel", Blocks.GRAVEL);
//		OreDictionary.registerOre("glassBottle", Items.GLASS_BOTTLE);
//		OreDictionary.registerOre("dragonEgg", Blocks.DRAGON_EGG);
		// Glowstone Dust
//		for(int i = 0; i < EnumDustColor.values().length; i++)
//			OreDictionary.registerOre(EnumDustColor.values()[i].getOredict(), new ItemStack(TechItems.colored_dust, 1, i));
	}
	
	public static boolean hasTag(String tag, ItemStack stack) {
		ResourceLocation myTagId = new ResourceLocation(tag);
		return ItemTags.getCollection().getOrCreate(myTagId).contains(stack.getItem());
	}

	public static boolean hasTag(String tag, Block target) {
		ResourceLocation myTagId = new ResourceLocation(tag);
		return BlockTags.getCollection().getOrCreate(myTagId).contains(target);
	}
}
