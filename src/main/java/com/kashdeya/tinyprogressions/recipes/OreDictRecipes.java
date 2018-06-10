package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.inits.TechTools;
import com.kashdeya.tinyprogressions.registry.recipes.ShapedRecipe;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictRecipes {
	
	public static IRecipe COPPER_SHEARS;
	
	public static void init()
	{
		if (OreDictionary.doesOreNameExist("ingotCopper"))
			COPPER_SHEARS = new ShapedRecipe(new ItemStack(TechTools.wooden_shears), 
					"sp",
			        "ps",
					's', "stickWood",
					'p', "ingotCopper");
	}
}
