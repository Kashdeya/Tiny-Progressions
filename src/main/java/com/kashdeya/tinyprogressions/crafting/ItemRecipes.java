package com.kashdeya.tinyprogressions.crafting;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRecipes {
	
		public static void init() {
			// Glowstone Dust
			if (ConfigHandler.ColorGlowstone){
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.black_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "Black",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.blue_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "Blue",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.brown_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "Brown",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.cyan_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "Cyan",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.gray_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "Gray",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.green_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "Green",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.lightblue_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "LightBlue",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.lime_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "Lime",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.magenta_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "Magenta",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.orange_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "Orange",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.pink_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "Pink",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.purple_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "Purple",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.red_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "Red",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.silver_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "LightGray",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.white_dust, 8), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('d'), "White",
							Character.valueOf('g'), Items.GLOWSTONE_DUST
				});
			}
			
			// Juices
			if (ConfigHandler.all_juices){
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.juicer), new Object[] {
						"l",
						"s",
							Character.valueOf('s'), "stone",
							Character.valueOf('l'), Blocks.STONE_BUTTON
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.apple_juice), new Object[] {
						"ja",
							Character.valueOf('j'), "juicer",
							Character.valueOf('a'), Items.APPLE
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.carrot_juice), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Items.CARROT
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.potatoe_juice), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Items.POTATO
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.beet_juice), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Items.BEETROOT
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.cactus_juice, 2), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Blocks.CACTUS
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.slime_juice), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Items.SLIME_BALL
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.wheat_juice), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Items.WHEAT
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.melon_juice), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Items.MELON
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.pumpkin_juice, 2), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Blocks.PUMPKIN
				});
			}
			
			// Watering Cans
			if (ConfigHandler.WateringCan) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.watering_can), new Object[] {
						"id ",
						"iwi",
						" i ",
							Character.valueOf('i'), "ingotIron",
							Character.valueOf('d'), "dyeWhite",
							Character.valueOf('w'), Items.WATER_BUCKET
				});
			}
			if (ConfigHandler.WateringCanUpgrade && ConfigHandler.WateringCan) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.watering_can_upgrade), new Object[] {
						"on ",
						"owo",
						" o ",
							Character.valueOf('o'), "obsidian",
							Character.valueOf('n'), "netherStar",
							Character.valueOf('w'), TechItems.watering_can
				});
			}
			
			// Apples
			if (ConfigHandler.DiamondApple) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.diamond_apple), new Object[] {
						"ddd",
						"dad",
						"ddd",
							Character.valueOf('d'), "gemDiamond",
							Character.valueOf('a'), Items.APPLE
				});
			}
			if (ConfigHandler.EmeraldApple) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.emerald_apple), new Object[] {
						"eee",
						"eae",
						"eee",
							Character.valueOf('e'), "gemEmerald",
							Character.valueOf('a'), Items.APPLE
				});
			}
			if (ConfigHandler.iron_apple) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.iron_apple), new Object[] {
						"iii",
						"iai",
						"iii",
							Character.valueOf('i'), "ingotIron",
							Character.valueOf('a'), Items.APPLE
				});
			}
	 		if (ConfigHandler.redstone_apple) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.redstone_apple), new Object[] {
						"rrr",
						"rar",
						"rrr",
							Character.valueOf('r'), "dustRedstone",
							Character.valueOf('a'), Items.APPLE
				});
			}
			if (ConfigHandler.ApplePro) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.golden_apple), new Object[] {
						"ggg",
						"gag",
						"ggg",
							Character.valueOf('g'), "ingotGold",
							Character.valueOf('a'), Items.APPLE
				});
			}
			
			// Medkit
			if (ConfigHandler.MedKit) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.med_kit), new Object[] {
						"prp",
						"rgr",
						"lrl",
							Character.valueOf('p'), "paper",
							Character.valueOf('r'), "dyeRed",
							Character.valueOf('l'), "leather",
							Character.valueOf('g'), Items.SPECKLED_MELON
				});
			}
			
			// Ender Dust
			if (ConfigHandler.ender_ore) {
				RecipeRegistry.addShapedRecipe(new ItemStack(Items.ENDER_PEARL), new Object[] {
						"eee",
						"e e",
						"eee",
							Character.valueOf('e'), "dustEnder"
				});
			}
			
			
		}

}
