package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.properties.EnumDustColor;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ItemRecipes {
	
	public static void init() {
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.nether_rod.get(), 4), 
					"i",
					"i",
					'i', new ItemStack(TechBlocks.soul_sandstone.get()));
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.bsc_rod.get(), 4), 
					"i",
					"i",
					'i', new ItemStack(TechBlocks.compressed_sugar_cane.get()));
		

		exportJson.addShapedRecipe(new ItemStack(TechItems.white_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/white");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.silver_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/light_gray");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.red_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/red");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.purple_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/purple");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.pink_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/pink");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.orange_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/orange");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.magenta_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/magenta");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.lime_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/lime");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.lightblue_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/light_blue");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.green_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/green");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.gray_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/gray");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.cyan_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/cyan");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.brown_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/brown");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.blue_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/blue");
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.black_dust.get(), 8), 
				"ddd",
				"dgd",
				"ddd",
				'g', new ItemStack(Items.GLOWSTONE_DUST),
				'd', "forge:dyes/black");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.watering_can.get()), 
					"id ",
					"iwi",
					" i ",
					'i', "forge:ingots/iron",
					'd', "forge:dyes/white",
					'w', new ItemStack(Items.WATER_BUCKET));
		
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.watering_can_upgrade.get()), 
					"on ",
					"owo",
					" o ",
					'o', "forge:ingots/reinforced_obsidian",
					'n', new ItemStack(Items.NETHER_STAR),
					'w', new ItemStack(TechItems.watering_can.get()));
		
		
		// Medkit
		
			// Small bandage
		exportJson.addShapedRecipe(new ItemStack(TechItems.small_bandage.get(), 4), 
					" p ",
					"psp",
					" p ",
					'p', new ItemStack(Items.PAPER),
					's', new ItemStack(Items.SLIME_BALL));
			// Large Bandage
		exportJson.addShapedRecipe(new ItemStack(TechItems.large_bandage.get(), 4), 
					"bsb",
					"sls",
					"bsb",
					'l', "forge:leather",
					's', "forge:string",
					'b', new ItemStack(TechItems.small_bandage.get()));
			// Small Med Kit
		exportJson.addShapedRecipe(new ItemStack(TechItems.small_med_kit.get(), 2), 
					"bb",
					"bb",
					'b', new ItemStack(TechItems.large_bandage.get()));				
			// Large Med Kit
		exportJson.addShapedRecipe(new ItemStack(TechItems.large_med_kit.get()), 
					"mm",
					"mm",
					'm', new ItemStack(TechItems.small_med_kit.get()));
		
		
		// Ender Dust
		
		exportJson.addShapedRecipe(new ItemStack(Items.ENDER_PEARL), 
					"ee",
					"ee",
					'e', "forge:dusts/ender");
		
		
		// repair kit
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.repair_tablet.get()), 
					"plp",
					"rgr",
					"prp",
					'p', new ItemStack(TechBlocks.hardened_stone.get()),
					'r', new ItemStack(Items.GHAST_TEAR),
					'l', new ItemStack(Items.NETHER_STAR),
					'g', new ItemStack(TechItems.redstone_ingot.get()));
		
					// Tiny Coal & Charcoal
		
		exportJson.addShapelessRecipe(new ItemStack(TechItems.tiny_charcoal.get(), 8), new ItemStack(Items.CHARCOAL, 1), new ItemStack(TechItems.stone_hammer.get()));
		exportJson.addShapedRecipe(new ItemStack(Items.CHARCOAL, 1),
					"sss",
					"s s",
					"sss",
					's', new ItemStack(TechItems.tiny_charcoal.get()));
		exportJson.addShapelessRecipe(new ItemStack(TechItems.tiny_coal.get(), 8), new ItemStack(Items.COAL, 1), new ItemStack(TechItems.stone_hammer.get()));
		exportJson.addShapedRecipe(new ItemStack(Items.COAL, 1), 
					"sss",
					"s s",
					"sss",
					's', new ItemStack(TechItems.tiny_coal.get()));
		
		
		
		
		exportJson.addShapelessRecipe(new ItemStack(TechItems.chainmail_part.get(), 2), new ItemStack(Items.IRON_INGOT), new ItemStack(TechItems.stone_hammer.get()));
		
		
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.steel_ingot.get(), 2), 
					"sss",
					"ihi",
					"sss",
					'h', new ItemStack(TechItems.stone_hammer.get()),
					'i', new ItemStack(Items.IRON_INGOT),
					's', new ItemStack(Items.COAL, 1));
		exportJson.addShapedRecipe(new ItemStack(TechItems.steel_ingot.get(), 2), 
					"sss",
					"ihi",
					"sss",
					'h', new ItemStack(TechItems.stone_hammer.get()),
					'i', new ItemStack(Items.IRON_INGOT),
					's', new ItemStack(Items.CHARCOAL, 1));
		
		
		// Can not be turned off.
		exportJson.addShapelessRecipe(new ItemStack(TechItems.obsidian_dust.get()), new ItemStack(Blocks.OBSIDIAN), new ItemStack(TechItems.stone_hammer.get()));
		exportJson.addShapedRecipe(new ItemStack(TechItems.stone_hammer.get()),					
					"cic",
					"isi",
					" s ",
					'i', new ItemStack(Items.STRING),
					's', new ItemStack(Items.STICK),
					'c', new ItemStack(TechBlocks.hardened_stone.get()));
		
	}
}
