package com.kashdeya.tinyprogressions.registry.recipes;

import javax.annotation.Nonnull;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.CraftingHelper.ShapedPrimer;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ShapedRecipe extends ShapedOreRecipe
{
	public ShapedRecipe(Block result, Object... recipe) { this(new ItemStack(result), recipe); }
	public ShapedRecipe(Item result, Object... recipe) { this(new ItemStack(result), recipe); }
	public ShapedRecipe(@Nonnull ItemStack result, Object... recipe) { this(result.getItem().getRegistryName(), result, CraftingHelper.parseShaped(recipe)); }
	
	ShapedRecipe(ResourceLocation group, @Nonnull ItemStack result, ShapedPrimer primer)
	{
		super(group, result, primer);
	}
}