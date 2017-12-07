package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.properties.EnumDustColor;
import com.kashdeya.tinyprogressions.registry.recipes.ShapedRecipe;
import com.kashdeya.tinyprogressions.registry.recipes.ShapelessRecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class ItemRecipes {
	
	public static IRecipe NETHER_ROD, BSC_ROD;
	public static IRecipe[] COLORED_DUST;
	
	public static IRecipe WATERING_CAN, WATERING_CAN_UPGRADE;

	public static IRecipe MEDKIT;
	public static IRecipe ENDERPEARL;
	public static IRecipe REPAIR_TABLET;
	
	public static IRecipe LAVA_CRYSTAL1, LAVA_BUCKET1;
	public static IRecipe TINY_CHARCOAL, TINY_COAL, CHARCOAL1, COAL;
	
	public static IRecipe CHAINMAIL_PART;
	public static IRecipe STONE_HAMMER;
	
		public static void init() {
			// Nether
			if (ConfigHandler.nether_rod){
				NETHER_ROD = new ShapedRecipe(new ItemStack(TechItems.nether_rod, 4), new Object[] {
						"i",
						"i",
							Character.valueOf('i'), TechBlocks.soul_sandstone
				});
			}
			// bsc
			if (ConfigHandler.bsc_rod) {
				BSC_ROD = new ShapedRecipe(new ItemStack(TechItems.bsc_rod, 4), new Object[] {
						"i",
						"i",
							Character.valueOf('i'), TechBlocks.compressed_sugar_cane
				});
			}
			
			// Glowstone Dust
			if (ConfigHandler.ColorGlowstone)
			{
				COLORED_DUST = new IRecipe[EnumDustColor.values().length];
				for(int i = 0; i < EnumDustColor.values().length; i++)
				{
					COLORED_DUST[i] = new ShapedRecipe(new ItemStack(TechItems.colored_dust, 8, i), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('g'), Items.GLOWSTONE_DUST,
							Character.valueOf('d'), EnumDustColor.values()[i].getCraftingOredict()
					});
				}
			}
			
			// Watering Cans
			if (ConfigHandler.WateringCan) {
				WATERING_CAN = new ShapedRecipe(new ItemStack(TechItems.watering_can), new Object[] {
						"id ",
						"iwi",
						" i ",
							Character.valueOf('i'), "ingotIron",
							Character.valueOf('d'), "dyeWhite",
							Character.valueOf('w'), Items.WATER_BUCKET
				});
			}
			if (ConfigHandler.WateringCanUpgrade && ConfigHandler.WateringCan) {
				WATERING_CAN_UPGRADE = new ShapedRecipe(new ItemStack(TechItems.watering_can_upgrade), new Object[] {
						"on ",
						"owo",
						" o ",
							Character.valueOf('o'), "ingotReinforcedObsidian",
							Character.valueOf('n'), Items.NETHER_STAR,
							Character.valueOf('w'), TechItems.watering_can
				});
			}
			
			// Medkit
			if (ConfigHandler.MedKit) {
				MEDKIT = new ShapedRecipe(new ItemStack(TechItems.med_kit), new Object[] {
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
				ENDERPEARL = new ShapedRecipe(new ItemStack(Items.ENDER_PEARL), new Object[] {
						"ee",
						"ee",
							Character.valueOf('e'), "dustEnder"
				});
			}
			
			// Medkit
			if (ConfigHandler.repair_tablet) {
				REPAIR_TABLET = new ShapedRecipe(new ItemStack(TechItems.repair_tablet), new Object[] {
						"plp",
						"rgr",
						"prp",
							Character.valueOf('p'), TechBlocks.hardened_stone,
							Character.valueOf('r'), Blocks.BROWN_GLAZED_TERRACOTTA,
							Character.valueOf('l'), Items.NETHER_STAR,
							Character.valueOf('g'), TechItems.redstone_ingot
				});
			}
			
			if (ArmorHandler.lava_armor) {
				LAVA_CRYSTAL1 = new ShapedRecipe(new ItemStack(TechItems.lava_crystal,  8), new Object[] {
						"sls",
						"lbl",
						"sls",
							Character.valueOf('s'), TechItems.reinforced_obsidian_ingot,
							Character.valueOf('l'), TechBlocks.lava_block,
							Character.valueOf('b'), Items.LAVA_BUCKET
				});
				LAVA_BUCKET1 = new ShapedRecipe(new ItemStack(Items.LAVA_BUCKET), new Object[] {
						"sss",
						"sbs",
						"sss",
							Character.valueOf('b'), Items.BUCKET,
							Character.valueOf('s'), TechItems.lava_crystal
				});
			}
			
			// Tiny Coal & Charcoal
			if (ConfigHandler.lava_block_recipe) {
				TINY_CHARCOAL = new ShapelessRecipe(new ItemStack(TechItems.tiny_charcoal, 8), new Object[] {
						new ItemStack(Items.COAL, 1, 1)
				});
				CHARCOAL1 = new ShapedRecipe(new ItemStack(Items.COAL, 1, 1), new Object[] {
						"sss",
						"s s",
						"sss",
							Character.valueOf('s'), TechItems.tiny_charcoal
				});
				TINY_COAL = new ShapelessRecipe(new ItemStack(TechItems.tiny_coal, 8), new Object[] {
						Items.COAL
				});
				COAL = new ShapedRecipe(new ItemStack(Items.COAL), new Object[] {
						"sss",
						"s s",
						"sss",
							Character.valueOf('s'), TechItems.tiny_coal
				});
			}
			
			// Chainmail part
			if (ArmorHandler.chain_armor){
				CHAINMAIL_PART = new ShapelessRecipe(new ItemStack(TechItems.chainmail_part, 2), new Object[] {
						Items.IRON_INGOT, TechItems.stone_hammer
				});
			}
			
			// Can not be turned off.
			STONE_HAMMER = new ShapedRecipe(new ItemStack(TechItems.stone_hammer), new Object[] {
					"ccc",
					"isi",
					" s ",
						Character.valueOf('i'), Items.STRING,
						Character.valueOf('s'), Items.STICK,
						Character.valueOf('c'), "stone"
			});
			
		}

}
