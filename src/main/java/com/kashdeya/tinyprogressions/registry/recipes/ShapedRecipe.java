package com.kashdeya.tinyprogressions.registry.recipes;

//OLD
//public class ShapedRecipe extends ShapedOreRecipe
//{
//	public ShapedRecipe(Block result, Object... recipe) { this(new ItemStack(result), recipe); }
//	public ShapedRecipe(Item result, Object... recipe) { this(new ItemStack(result), recipe); }
//	public ShapedRecipe(@Nonnull ItemStack result, Object... recipe) { this(result.getItem().getRegistryName(), result, CraftingHelper.parseShaped(recipe)); }
//	
//	ShapedRecipe(ResourceLocation group, @Nonnull ItemStack result, ShapedPrimer primer)
//	{
//		super(group, result, primer);
//	}
//}