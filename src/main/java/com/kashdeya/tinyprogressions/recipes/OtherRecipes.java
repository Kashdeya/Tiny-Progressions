package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.util.RecipeRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OtherRecipes
{
	public static void init()
	{
		// Pouch
		if (ConfigHandler.pouch) {
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.pouch), new Object[] {
		            "lsl",
		            "clc",
		            "lsl",
		                Character.valueOf('s'), Items.STRING,
		                Character.valueOf('l'), Items.LEATHER,
		                Character.valueOf('c'), Blocks.CHEST
		    });
		}
		
		// MISC Flint Recipe
		if (ConfigHandler.FlintRecipe){
			RecipeRegistry.addShapedRecipe(new ItemStack(Items.FLINT), new Object[] {
					"gg ",
					"g  ",
						Character.valueOf('g'), "blockGravel"
			});
		}
		
		// Lava Bucket
		if (ConfigHandler.lava_block_recipe) {
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.LAVA_BUCKET), new Object[] {
					TechBlocks.lava_block, Items.BUCKET
			});
		}
		
		// Water Bucket
		if (ConfigHandler.water_block_recipe) {
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.WATER_BUCKET), new Object[] {
					TechBlocks.water_block, Items.BUCKET
			});
		}
		
		// Old Reed
		if (ConfigHandler.old_reed) {
			RecipeRegistry.addShapelessRecipe(new ItemStack(Items.SUGAR), new Object[] {
					TechItems.dead_reed
			});
		}
		
		// Quartz Items
		if (ConfigHandler.QuartzKnife) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.quartz_knife), new Object[] {
					"  s",
					" s ",
					"q  ",
						Character.valueOf('s'), "stickWood",
						Character.valueOf('q'), "gemQuartz"
			});
						
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.quartz_dust), new Object[] {
					"k",
					"q",
						Character.valueOf('k'), TechItems.quartz_knife,
						Character.valueOf('q'), "gemQuartz"
			});
		}
					
		// Mycelium Seeds
		if (ConfigHandler.MyceliumSeeds) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.mycelium_seeds), new Object[] {
					"sss",
					"ses",
					"sss",
						Character.valueOf('s'), Items.WHEAT_SEEDS,
						Character.valueOf('e'), Items.SPIDER_EYE
			});
		}
		
		// Flint Ingot WIP
		if (ArmorHandler.FlintArmor) {
			GameRegistry.addSmelting(TechBlocks.flint_block, new ItemStack(TechItems.flint_ingot), 1.0F);
		}
		
		// Reinforced Obsidian Ingot
		if (ConfigHandler.ReinforcedObsidian) {
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechItems.reinforced_obsidian_ingot, 9), new Object[] {
					TechBlocks.reinforced_obsidian
			});
			RecipeRegistry.addShapedRecipe(new ItemStack(TechBlocks.reinforced_obsidian), new Object[] {
					"sss",
					"sss",
					"sss",
						Character.valueOf('s'), TechItems.reinforced_obsidian_ingot
			});
		}
		
		// Flint Knife
		if (ConfigHandler.FlintKnife) {
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechItems.flint_knife), new Object[] {
					"flint", "flint", "stickWood"
			});
		}
	}
}
