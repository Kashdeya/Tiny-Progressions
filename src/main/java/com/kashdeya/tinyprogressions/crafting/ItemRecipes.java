package com.kashdeya.tinyprogressions.crafting;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechFoods;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.properties.EnumDustColor;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemRecipes {
	
		public static void init() {
			// Glowstone Dust
			if (ConfigHandler.ColorGlowstone)
			{
				for(int i = 0; i < EnumDustColor.values().length; i++)
				{
					RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.colored_dust, 8, i), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('g'), Items.GLOWSTONE_DUST,
							Character.valueOf('d'), EnumDustColor.values()[i].getCraftingOredict()
					});
				}
			}
			// Juices
			if (ConfigHandler.all_juices){
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.juicer), new Object[] {
						"l",
						"s",
							Character.valueOf('s'), "stone",
							Character.valueOf('l'), Blocks.STONE_BUTTON
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.apple_juice), new Object[] {
						"ja",
							Character.valueOf('j'), "juicer",
							Character.valueOf('a'), Items.APPLE
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.carrot_juice), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Items.CARROT
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.potatoe_juice), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Items.POTATO
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.beet_juice), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Items.BEETROOT
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.cactus_juice, 2), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Blocks.CACTUS
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.slime_juice), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Items.SLIME_BALL
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.wheat_juice), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Items.WHEAT
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.melon_juice), new Object[] {
						"ja",
						Character.valueOf('j'), "juicer",
						Character.valueOf('a'), Items.MELON
				});
				
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.pumpkin_juice, 2), new Object[] {
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
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.diamond_apple), new Object[] {
						"ddd",
						"dad",
						"ddd",
							Character.valueOf('d'), "gemDiamond",
							Character.valueOf('a'), Items.APPLE
				});
			}
			if (ConfigHandler.EmeraldApple) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.emerald_apple), new Object[] {
						"eee",
						"eae",
						"eee",
							Character.valueOf('e'), "gemEmerald",
							Character.valueOf('a'), Items.APPLE
				});
			}
			if (ConfigHandler.iron_apple) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.iron_apple), new Object[] {
						"iii",
						"iai",
						"iii",
							Character.valueOf('i'), "ingotIron",
							Character.valueOf('a'), Items.APPLE
				});
			}
	 		if (ConfigHandler.redstone_apple) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.redstone_apple), new Object[] {
						"rrr",
						"rar",
						"rrr",
							Character.valueOf('r'), "dustRedstone",
							Character.valueOf('a'), Items.APPLE
				});
			}
			if (ConfigHandler.ApplePro) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.golden_apple), new Object[] {
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
