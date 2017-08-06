package com.kashdeya.tinyprogressions.util;

import java.util.Set;

import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;

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
		
		if (!ConfigHandler.wooden_scythe)
		{
			removeRecipe(new ItemStack(TechTools.wooden_scythe));
		}
		if (!ConfigHandler.stone_scythe)
		{
			removeRecipe(new ItemStack(TechTools.stone_scythe));
		}
		if (!ConfigHandler.golden_scythe)
		{
			removeRecipe(new ItemStack(TechTools.golden_scythe));
		}
		if (!ConfigHandler.iron_scythe)
		{
			removeRecipe(new ItemStack(TechTools.iron_scythe));
		}
		if (!ConfigHandler.diamond_scythe)
		{
			removeRecipe(new ItemStack(TechTools.diamond_scythe));
		}
		if (!ConfigHandler.emerald_scythe)
		{
			removeRecipe(new ItemStack(TechTools.emerald_scythe));
		}
		if (!ConfigHandler.obsidian_scythe)
		{
			removeRecipe(new ItemStack(TechTools.obsidian_scythe));
		}
		
		if (!ConfigHandler.wooden_multi){
			removeRecipe(new ItemStack(TechTools.wooden_multi));
		}
		if (!ConfigHandler.stone_multi){
			removeRecipe(new ItemStack(TechTools.stone_multi));
		}
		if (!ConfigHandler.golden_multi){
			removeRecipe(new ItemStack(TechTools.golden_multi));
		}
		if (!ConfigHandler.iron_multi){
			removeRecipe(new ItemStack(TechTools.iron_multi));
		}
		if (!ConfigHandler.diamond_multi){
			removeRecipe(new ItemStack(TechTools.diamond_multi));
		}
		if (!ConfigHandler.emerald_multi){
			removeRecipe(new ItemStack(TechTools.emerald_multi));
		}
		if (!ConfigHandler.obsidian_multi){
			removeRecipe(new ItemStack(TechTools.obsidian_multi));
		}
		
		if (!ConfigHandler.wooden_battle){
			removeRecipe(new ItemStack(TechTools.wooden_battle));
		}
		if (!ConfigHandler.stone_battle){
			removeRecipe(new ItemStack(TechTools.stone_battle));
		}
		if (!ConfigHandler.golden_battle){
			removeRecipe(new ItemStack(TechTools.golden_battle));
		}
		if (!ConfigHandler.iron_battle){
			removeRecipe(new ItemStack(TechTools.iron_battle));
		}
		if (!ConfigHandler.diamond_battle){
			removeRecipe(new ItemStack(TechTools.diamond_battle));
		}
		if (!ConfigHandler.emerald_battle){
			removeRecipe(new ItemStack(TechTools.emerald_battle));
		}
		if (!ConfigHandler.obsidian_battle){
			removeRecipe(new ItemStack(TechTools.obsidian_battle));
		}
		
		if (!ConfigHandler.wooden_spear){
			removeRecipe(new ItemStack(TechTools.wooden_spear));
		}
		if (!ConfigHandler.stone_spear){
			removeRecipe(new ItemStack(TechTools.stone_spear));
		}
		if (!ConfigHandler.golden_spear){
			removeRecipe(new ItemStack(TechTools.golden_spear));
		}
		if (!ConfigHandler.iron_spear){
			removeRecipe(new ItemStack(TechTools.iron_spear));
		}
		if (!ConfigHandler.diamond_spear){
			removeRecipe(new ItemStack(TechTools.diamond_spear));
		}
		if (!ConfigHandler.emerald_spear){
			removeRecipe(new ItemStack(TechTools.emerald_spear));
		}
		if (!ConfigHandler.obsidian_spear){
			removeRecipe(new ItemStack(TechTools.obsidian_spear));
		}
		
		if (!ConfigHandler.emerald_axe){
			removeRecipe(new ItemStack(TechTools.emerald_axe));
		}
		if (!ConfigHandler.emerald_hoe){
			removeRecipe(new ItemStack(TechTools.emerald_hoe));
		}
		if (!ConfigHandler.emerald_sword){
			removeRecipe(new ItemStack(TechTools.emerald_sword));
		}
		if (!ConfigHandler.emerald_spade){
			removeRecipe(new ItemStack(TechTools.emerald_spade));
		}
		if (!ConfigHandler.emerald_pickaxe){
			removeRecipe(new ItemStack(TechTools.emerald_pickaxe));
		}
		
		if (!ConfigHandler.obsidian_axe){
			removeRecipe(new ItemStack(TechTools.obsidian_axe));
		}
		if (!ConfigHandler.obsidian_hoe){
			removeRecipe(new ItemStack(TechTools.obsidian_hoe));
		}
		if (!ConfigHandler.obsidian_sword){
			removeRecipe(new ItemStack(TechTools.obsidian_sword));
		}
		if (!ConfigHandler.obsidian_spade){
			removeRecipe(new ItemStack(TechTools.obsidian_spade));
		}
		if (!ConfigHandler.obsidian_pickaxe){
			removeRecipe(new ItemStack(TechTools.obsidian_pickaxe));
		}
		
		if (!ConfigHandler.MedKit){
			removeRecipe(new ItemStack(TechItems.med_kit));
		}
		
		if (!ConfigHandler.StoneTorch){
			removeRecipe(new ItemStack(TechItems.stone_stick));
			removeRecipe(new ItemStack(TechBlocks.stone_torch));
			removeRecipe(new ItemStack(TechBlocks.stone_torch));
		}
		
		if (!ConfigHandler.ender_ore){
			removeRecipe(new ItemStack(Items.ENDER_PEARL));
		}
		
		if (!ConfigHandler.DiamondApple){
			removeRecipe(new ItemStack(TechItems.diamond_apple));
		}
		if (!ConfigHandler.EmeraldApple){
			removeRecipe(new ItemStack(TechItems.emerald_apple));
		}
		if (!ConfigHandler.NotchApple){
			removeRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1));
		}
		if (!ConfigHandler.ApplePro){
			removeRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 0));
			removeRecipe(new ItemStack(TechItems.golden_apple));
			removeRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1));
		}
		
		if (!ConfigHandler.DirtyGlass){
			removeRecipe(new ItemStack(TechBlocks.dirty_glass, 4));
		}
		
		if (!ConfigHandler.MyceliumSeeds){
			removeRecipe(new ItemStack(TechItems.mycelium_seeds));
		}
		
		if (!ConfigHandler.FlintTools){
			removeRecipe(new ItemStack(TechTools.flint_axe));
			removeRecipe(new ItemStack(TechTools.flint_hoe));
			removeRecipe(new ItemStack(TechTools.flint_sword));
			removeRecipe(new ItemStack(TechTools.flint_spade));
			removeRecipe(new ItemStack(TechTools.flint_pickaxe));
		}
		if (!ConfigHandler.FlintKnife){
			removeRecipe(new ItemStack(TechItems.flint_knife));
		}
		
		if (!ConfigHandler.BoneTools){
			removeRecipe(new ItemStack(TechTools.bone_axe));
			removeRecipe(new ItemStack(TechTools.bone_hoe));
			removeRecipe(new ItemStack(TechTools.bone_sword));
			removeRecipe(new ItemStack(TechTools.bone_spade));
			removeRecipe(new ItemStack(TechTools.bone_pickaxe));
		}
		
		if (!ConfigHandler.BirthdayPickaxe){
			removeRecipe(new ItemStack(TechTools.birthday_pickaxe));
		}
		
		if (!ConfigHandler.ReinforcedGlass){
			removeRecipe(new ItemStack(TechBlocks.reinforced_glass, 4));
		}
		if (!ConfigHandler.ReinforcedObsidian){
			removeRecipe(new ItemStack(TechBlocks.reinforced_obsidian, 4));
		}
		
		if (!ConfigHandler.QuartzKnife){
			removeRecipe(new ItemStack(TechItems.quartz_knife));
			removeRecipe(new ItemStack(TechItems.quartz_dust));
		}
		
		if (!ConfigHandler.WateringCan){
			removeRecipe(new ItemStack(TechItems.watering_can));
		}
		if (!ConfigHandler.WateringCanUpgrade){
			removeRecipe(new ItemStack(TechItems.watering_can_upgrade));
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
	}

}
