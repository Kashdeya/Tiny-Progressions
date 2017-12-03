package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.registry.recipes.ShapedRecipe;
import com.kashdeya.tinyprogressions.registry.recipes.ShapelessRecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OtherRecipes
{
	public static IRecipe POUCH;
	public static IRecipe FLINT1, SUGAR1;
	public static IRecipe LAVA_BUCKET, WATER_BUCKET;
	public static IRecipe FLINT_KNIFE, QUARTZ_KNIFE, QUARTZ_DUST;
	public static IRecipe MYCELIUM_SEEDS;
	public static IRecipe OBSIDIAN_INGOT, OBSIDIAN1;
	
	public static void init()
	{
		// vasholine
		
		/**
		if (ConfigHandler.vasholine){
			RecipeRegistry.addShapedRecipe(new ItemStack(<forge:bucketfilled>.withTag({FluidName: "vasholine", Amount: 1000})), new Object[] {
		            "lll",
		            "lbl",
		            "lll",
		                Character.valueOf('b'), Items.BUCKET,
		                Character.valueOf('l'), TechItems.vasholine_gem
		    });
		}
		*/
		
		// Pouch
		if (ConfigHandler.pouch) {
		    POUCH = new ShapedRecipe(new ItemStack(TechItems.pouch), new Object[] {
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
			FLINT1 = new ShapedRecipe(new ItemStack(Items.FLINT), new Object[] {
					"gg ",
					"g  ",
						Character.valueOf('g'), "blockGravel"
			});
		}
		
		// Lava Bucket
		if (ConfigHandler.lava_block_recipe) {
			LAVA_BUCKET = new ShapelessRecipe(new ItemStack(Items.LAVA_BUCKET), new Object[] {
					TechBlocks.lava_block, Items.BUCKET
			});
		}
		
		// Water Bucket
		if (ConfigHandler.water_block_recipe) {
			WATER_BUCKET = new ShapelessRecipe(new ItemStack(Items.WATER_BUCKET), new Object[] {
					TechBlocks.water_block, Items.BUCKET
			});
		}
		
		// Old Reed
		if (ConfigHandler.old_reed) {
			SUGAR1 = new ShapelessRecipe(new ItemStack(Items.SUGAR), new Object[] {
					TechItems.dead_reed
			});
		}
		
		// Quartz Items
		if (ConfigHandler.QuartzKnife) {
			QUARTZ_KNIFE = new ShapedRecipe(new ItemStack(TechItems.quartz_knife), new Object[] {
					"  s",
					" s ",
					"q  ",
						Character.valueOf('s'), "stickWood",
						Character.valueOf('q'), "gemQuartz"
			});
						
			QUARTZ_DUST = new ShapedRecipe(new ItemStack(TechItems.quartz_dust), new Object[] {
					"k",
					"q",
						Character.valueOf('k'), TechItems.quartz_knife,
						Character.valueOf('q'), "gemQuartz"
			});
		}
					
		// Mycelium Seeds
		if (ConfigHandler.MyceliumSeeds) {
			MYCELIUM_SEEDS = new ShapedRecipe(new ItemStack(TechItems.mycelium_seeds), new Object[] {
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
			OBSIDIAN_INGOT = new ShapelessRecipe(new ItemStack(TechItems.reinforced_obsidian_ingot, 9), new Object[] {
					TechBlocks.reinforced_obsidian
			});
			OBSIDIAN1 = new ShapedRecipe(new ItemStack(TechBlocks.reinforced_obsidian), new Object[] {
					"sss",
					"sss",
					"sss",
						Character.valueOf('s'), TechItems.reinforced_obsidian_ingot
			});
		}
		
		// Flint Knife
		if (ConfigHandler.FlintKnife) {
			FLINT_KNIFE = new ShapelessRecipe(new ItemStack(TechItems.flint_knife), new Object[] {
					"flint", "flint", "stickWood"
			});
		}
	}
}
