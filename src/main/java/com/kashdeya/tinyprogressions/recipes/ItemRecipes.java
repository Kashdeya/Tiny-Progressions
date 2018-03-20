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

	public static IRecipe SMALL_BANDAGE, LARGE_BANDAGE, SMALL_MEDKIT, LARGE_MEDKIT;
	public static IRecipe ENDERPEARL;
	public static IRecipe REPAIR_TABLET;
	
	public static IRecipe TINY_CHARCOAL, TINY_COAL, CHARCOAL1, COAL, STEEL_INGOT, STEEL_INGOT1;
	
	public static IRecipe CHAINMAIL_PART;
	public static IRecipe STONE_HAMMER, OBSIDIAN_DUST;
	
		public static void init() {
			// Nether
			if (ConfigHandler.nether_rod){
				NETHER_ROD = new ShapedRecipe(new ItemStack(TechItems.nether_rod, 4), 
						"i",
						"i",
						'i', new ItemStack(TechBlocks.soul_sandstone));
			}
			// bsc
			if (ConfigHandler.bsc_rod) {
				BSC_ROD = new ShapedRecipe(new ItemStack(TechItems.bsc_rod, 4), 
						"i",
						"i",
						'i', new ItemStack(TechBlocks.compressed_sugar_cane));
			}
			
			// Glowstone Dust
			if (ConfigHandler.ColorGlowstone)
			{
				COLORED_DUST = new IRecipe[EnumDustColor.values().length];
				for(int i = 0; i < EnumDustColor.values().length; i++)
				{
					COLORED_DUST[i] = new ShapedRecipe(new ItemStack(TechItems.colored_dust, 8, i), 
							"ddd",
							"dgd",
							"ddd",
							'g', new ItemStack(Items.GLOWSTONE_DUST),
							'd', EnumDustColor.values()[i].getCraftingOredict());
				}
			}
			
			// Watering Cans
			if (ConfigHandler.WateringCan) {
				WATERING_CAN = new ShapedRecipe(new ItemStack(TechItems.watering_can), 
						"id ",
						"iwi",
						" i ",
						'i', "ingotIron",
						'd', "dyeWhite",
						'w', new ItemStack(Items.WATER_BUCKET));
			}
			if (ConfigHandler.WateringCanUpgrade && ConfigHandler.WateringCan) {
				WATERING_CAN_UPGRADE = new ShapedRecipe(new ItemStack(TechItems.watering_can_upgrade), 
						"on ",
						"owo",
						" o ",
						'o', "ingotReinforcedObsidian",
						'n', new ItemStack(Items.NETHER_STAR),
						'w', new ItemStack(TechItems.watering_can));
			}
			
			// Medkit
			if (ConfigHandler.medical_kits) {
				// Small bandage
				SMALL_BANDAGE = new ShapedRecipe(new ItemStack(TechItems.small_bandage, 4), 
						" p ",
						"psp",
						" p ",
						'p', new ItemStack(Items.PAPER),
						's', new ItemStack(Items.SLIME_BALL));
				// Large Bandage
				LARGE_BANDAGE = new ShapedRecipe(new ItemStack(TechItems.large_bandage, 4), 
						"bsb",
						"sls",
						"bsb",
						'l', "leather",
						's', "string",
						'b', new ItemStack(TechItems.small_bandage));
				// Small Med Kit
				SMALL_MEDKIT = new ShapedRecipe(new ItemStack(TechItems.small_med_kit, 2), 
						"bb",
						"bb",
						'b', new ItemStack(TechItems.large_bandage));				
				// Large Med Kit
				LARGE_MEDKIT = new ShapedRecipe(new ItemStack(TechItems.large_med_kit), 
						"mm",
						"mm",
						'm', new ItemStack(TechItems.small_med_kit));
			}
			
			// Ender Dust
			if (ConfigHandler.ender_ore) {
				ENDERPEARL = new ShapedRecipe(new ItemStack(Items.ENDER_PEARL), 
						"ee",
						"ee",
						'e', "dustEnder");
			}
			
			// repair kit
			if (ConfigHandler.repair_tablet) {
				REPAIR_TABLET = new ShapedRecipe(new ItemStack(TechItems.repair_tablet), 
						"plp",
						"rgr",
						"prp",
						'p', new ItemStack(TechBlocks.hardened_stone),
						'r', new ItemStack(Items.GHAST_TEAR),
						'l', new ItemStack(Items.NETHER_STAR),
						'g', new ItemStack(TechItems.redstone_ingot));
			}
			
			// Tiny Coal & Charcoal
			if (ConfigHandler.tiny_charcoal) {
				TINY_CHARCOAL = new ShapelessRecipe(new ItemStack(TechItems.tiny_charcoal, 8), new ItemStack(Items.COAL, 1, 1), new ItemStack(TechItems.stone_hammer));
				CHARCOAL1 = new ShapedRecipe(new ItemStack(Items.COAL, 1, 1),
						
						"sss",
						"s s",
						"sss",
						's', new ItemStack(TechItems.tiny_charcoal));
			}
			if (ConfigHandler.tiny_coal) {
				TINY_COAL = new ShapelessRecipe(new ItemStack(TechItems.tiny_coal, 8), new ItemStack(Items.COAL, 1, 0), new ItemStack(TechItems.stone_hammer));
				COAL = new ShapedRecipe(new ItemStack(Items.COAL, 1, 0), 
						"sss",
						"s s",
						"sss",
						's', new ItemStack(TechItems.tiny_coal));
			}
			
			// Chainmail part
			if (ArmorHandler.chain_armor){
				CHAINMAIL_PART = new ShapelessRecipe(new ItemStack(TechItems.chainmail_part, 2), new ItemStack(Items.IRON_INGOT), new ItemStack(TechItems.stone_hammer));
			}
			
			// Steel
			if (ConfigHandler.steel_ingot){
				STEEL_INGOT = new ShapedRecipe(new ItemStack(TechItems.steel_ingot, 2), 
						"sss",
						"ihi",
						"sss",
						'h', new ItemStack(TechItems.stone_hammer),
						'i', new ItemStack(Items.IRON_INGOT),
						's', new ItemStack(Items.COAL, 1, 0));
				STEEL_INGOT1 = new ShapedRecipe(new ItemStack(TechItems.steel_ingot, 2), 
						"sss",
						"ihi",
						"sss",
						'h', new ItemStack(TechItems.stone_hammer),
						'i', new ItemStack(Items.IRON_INGOT),
						's', new ItemStack(Items.COAL, 1, 1));
			}
			
			// Can not be turned off.
				OBSIDIAN_DUST = new ShapelessRecipe(new ItemStack(TechItems.obsidian_dust), new ItemStack(Blocks.OBSIDIAN), new ItemStack(TechItems.stone_hammer));
				STONE_HAMMER = new ShapedRecipe(new ItemStack(TechItems.stone_hammer),					
						"cic",
						"isi",
						" s ",
						'i', new ItemStack(Items.STRING),
						's', new ItemStack(Items.STICK),
						'c', new ItemStack(TechBlocks.hardened_stone));
			
		}

}
