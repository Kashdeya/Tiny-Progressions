package com.kashdeya.tinyprogressions.crafting;

import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void addShapedRecipe(String name, ItemStack output, Object... inputs)
	{
		addShapedRecipe(name, name, output, inputs);
	}
	
	public static void addShapedRecipe(String name, String group, ItemStack output, Object... inputs)
	{
		if(name != null)
			name = String.format("%s:%s", Reference.MOD_ID, name);
		
		if(group != null)
			group = String.format("%s:%s", Reference.MOD_ID, group);
		
		GameRegistry.addShapedRecipe(new ResourceLocation(name), new ResourceLocation(group), output, inputs);
	}
	
	public static void addShapelessRecipe(String name, ItemStack output, Object... inputs)
	{
		addShapelessRecipe(name, name, output, inputs);
	}
	
	public static void addShapelessRecipe(String name, String group, ItemStack output, Object... inputs)
	{
		if(name != null)
			name = String.format("%s:%s", Reference.MOD_ID, name);
		
		if(group != null)
			group = String.format("%s:%s", Reference.MOD_ID, group);
		
		Ingredient[] ingredients = new Ingredient[inputs.length];
		
		for(int i = 0; i < inputs.length; i++)
		{
			ItemStack itemstack = ItemStack.EMPTY;
			Object input = inputs[i];
			
			if(input instanceof ItemStack)
			{
				itemstack = (ItemStack)input;
			}
			else if(input instanceof Block)
			{
				itemstack = new ItemStack((Block)input);
			}
			else if(input instanceof Item)
			{
				itemstack = new ItemStack((Item)input);
			}
			
			ingredients[i] = Ingredient.fromStacks(itemstack);
		}
		
		GameRegistry.addShapelessRecipe(new ResourceLocation(name), new ResourceLocation(group), output, ingredients);
	}
}
