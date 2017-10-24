package com.kashdeya.tinyprogressions.crafting;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.properties.EnumDustColor;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemRecipes {
	
		public static void init() {
			
			System.out.println("load item init");
			// Glowstone Dust
			if (ConfigHandler.ColorGlowstone)
			{
				System.out.println("load item init");
				for(int i = 0; i < EnumDustColor.values().length; i++)
				{
					RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.colored_dust, 8, i), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('g'), Items.GLOWSTONE_DUST,
							Character.valueOf('d'), EnumDustColor.values()[i].getCraftingOredict()
					});
					
					System.out.println("= TP LOGGING =");
					System.out.println("" + EnumDustColor.values()[i].getCraftingOredict());
					System.out.println("==============");
				}
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
							Character.valueOf('o'), "ingotReinforcedObsidian",
							Character.valueOf('n'), "netherStar",
							Character.valueOf('w'), TechItems.watering_can
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
