package com.kashdeya.tinyprogressions.util;

import java.util.Set;

import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.ResourceLocation;

public class RemoveItems {
	
	public static Set<ResourceLocation> recipes = Sets.newHashSet();
	
	public static void initRemove() {
		
		if (ConfigHandler.RemoveItems){
			removeRecipe(new ItemStack(Items.WOODEN_AXE));
			removeRecipe(new ItemStack(Items.WOODEN_HOE));
			removeRecipe(new ItemStack(Items.WOODEN_SWORD));
			removeRecipe(new ItemStack(Items.WOODEN_SHOVEL));
			removeRecipe(new ItemStack(Items.WOODEN_PICKAXE));	
		}
		
		if (ConfigHandler.ApplePro){
			removeRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 0));
		}
		
	}
	
	private static void removeRecipe(ItemStack resultItem){
		CraftingManager.REGISTRY.forEach((recipe) -> {
			if(ItemStack.areItemsEqual(recipe.getRecipeOutput(), resultItem))
			{
				recipes.add(recipe.getRegistryName());
			}
		});
	}

}
