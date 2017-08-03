package com.kashdeya.tinyprogressions.util;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RemoveItems {
	
	public static void initRemove() {
		
		if (ConfigHandler.RemoveItems){
			removeRecipe(new ItemStack(Items.WOODEN_AXE));
			removeRecipe(new ItemStack(Items.WOODEN_HOE));
			removeRecipe(new ItemStack(Items.WOODEN_SWORD));
			removeRecipe(new ItemStack(Items.WOODEN_SHOVEL));
			removeRecipe(new ItemStack(Items.WOODEN_PICKAXE));	
		}
		
		if (ConfigHandler.SmoothEndStone){
			removeRecipe(new ItemStack(Blocks.END_BRICKS));			
		}
		
		if (ConfigHandler.ApplePro){
			removeRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 0));
		}
		
	}
	
	private static void removeRecipe(ItemStack resultItem){
		/* TODO
		ItemStack recipeResult;
		List<IRecipe> recipes = (List) CraftingManager.getInstance().getRecipeList();
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
		*/
	}

}
