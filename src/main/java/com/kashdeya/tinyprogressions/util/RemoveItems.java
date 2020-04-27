package com.kashdeya.tinyprogressions.util;

import java.util.Set;

import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class RemoveItems {
	
	public static Set<ResourceLocation> recipes = Sets.newHashSet();
	
	public static void initRemove() {
		
		if (ConfigHandler.ApplePro){
			removeRecipe(new ItemStack(Items.GOLDEN_APPLE, 1));
		}
		
	}

	//TODO
	private static void removeRecipe(ItemStack resultItem){

//		Recipe.forEach((recipe) -> {
//			if(ItemStack.areItemsEqual(recipe.getRecipeOutput(), resultItem))
//			{
//				recipes.add(recipe.getRegistryName());
//			}
//		});
	}

}
