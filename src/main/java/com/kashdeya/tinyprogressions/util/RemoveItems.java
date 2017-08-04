package com.kashdeya.tinyprogressions.util;

import java.util.Set;

import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.ResourceLocation;

public class RemoveItems {
	
	public static Set<ResourceLocation> recipes = Sets.newHashSet();
	
	public static void initRemove() {
		
		if (!ConfigHandler.WoodArmor)
		{
			removeRecipe(new ItemStack(TechArmor.wooden_helmet));
			removeRecipe(new ItemStack(TechArmor.wooden_chestplate));
			removeRecipe(new ItemStack(TechArmor.wooden_leggings));
			removeRecipe(new ItemStack(TechArmor.wooden_boots));
		}
		if (!ConfigHandler.StoneArmor)
		{
			removeRecipe(new ItemStack(TechArmor.stone_helmet));
			removeRecipe(new ItemStack(TechArmor.stone_chestplate));
			removeRecipe(new ItemStack(TechArmor.stone_leggings));
			removeRecipe(new ItemStack(TechArmor.stone_boots));
		}
		if (!ConfigHandler.FlintArmor)
		{
			removeRecipe(new ItemStack(TechArmor.flint_helmet));
			removeRecipe(new ItemStack(TechArmor.flint_chestplate));
			removeRecipe(new ItemStack(TechArmor.flint_leggings));
			removeRecipe(new ItemStack(TechArmor.flint_boots));
		}
		if (!ConfigHandler.BoneArmor)
		{
			removeRecipe(new ItemStack(TechArmor.bone_helmet));
			removeRecipe(new ItemStack(TechArmor.bone_chestplate));
			removeRecipe(new ItemStack(TechArmor.bone_leggings));
			removeRecipe(new ItemStack(TechArmor.bone_boots));
		}
		
		if (!ConfigHandler.FlintRecipe)
		{
			removeRecipe(new ItemStack(Items.FLINT));
		}
		
		if (!ConfigHandler.BlockGrowth)
		{
			removeRecipe(new ItemStack(TechBlocks.growth_block));
		}
		if (!ConfigHandler.BlockGrowthUpgrade)
		{
			removeRecipe(new ItemStack(TechBlocks.growth_upgrade));
		}
		if (!ConfigHandler.BlockGrowthUpgradeTwo)
		{
			removeRecipe(new ItemStack(TechBlocks.growth_upgrade_two));
		}
		
		if (!ConfigHandler.SmoothEndStone)
		{
			removeRecipe(new ItemStack(TechBlocks.smooth_endstone, 4));
			removeRecipe(new ItemStack(Blocks.END_BRICKS, 4));
		}
		
		if (!ConfigHandler.Cobblegen)
		{
			removeRecipe(new ItemStack(TechBlocks.cobblegen_block));
		}
		if (!ConfigHandler.IronCobblegen)
		{
			removeRecipe(new ItemStack(TechBlocks.iron_cobblegen_block));
		}
		if (!ConfigHandler.DiamondCobblegen)
		{
			removeRecipe(new ItemStack(TechBlocks.diamond_cobblegen_block));
		}
		if (!ConfigHandler.BlazeCobblegen)
		{
			removeRecipe(new ItemStack(TechBlocks.blaze_cobblegen_block));
		}
		if (!ConfigHandler.EmeraldCobblegen)
		{
			removeRecipe(new ItemStack(TechBlocks.emerald_cobblegen_block));
		}
		
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
		CraftingManager.REGISTRY.forEach((recipe) -> {
			if(ItemStack.areItemsEqual(recipe.getRecipeOutput(), resultItem))
			{
				recipes.add(recipe.getRegistryName());
			}
		});
		
//		Iterator<ResourceLocation> iterator = recipes.iterator();
//		
//		while(iterator.hasNext())
//		{
//			CraftingManager.REGISTRY.putObject(iterator.next(), null);
//		}
	}

}
