package com.kashdeya.tinyprogressions.util;

import java.util.ArrayList;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

public class RemoveItems {
	
	public static void initRemove() {
		
		if (ConfigHandler.RemoveItems){
			removeRecipe(new ItemStack(Items.WOODEN_AXE));
			removeRecipe(new ItemStack(Items.WOODEN_HOE));
			removeRecipe(new ItemStack(Items.WOODEN_SWORD));
			removeRecipe(new ItemStack(Items.WOODEN_SHOVEL));
			removeRecipe(new ItemStack(Items.WOODEN_PICKAXE));	
		}
		
		if (ConfigHandler.SmoothEndStone == true){
			removeRecipe(new ItemStack(Blocks.END_BRICKS));			
		}
		
	}
	
	private static void removeRecipe(ItemStack resultItem){
		ItemStack recipeResult;
		ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();
		for(int scan = 0;scan < recipes.size();scan++){
			IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
			recipeResult = tmpRecipe.getRecipeOutput();
			if(recipeResult != null){
				if(recipeResult.getItem() == resultItem.getItem() && recipeResult.getItemDamage() == resultItem.getItemDamage()){
					recipes.remove(scan);
					scan--;
				}
			}
		}
	}

}
