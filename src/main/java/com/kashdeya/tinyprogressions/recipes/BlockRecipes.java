package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;

public class BlockRecipes {
	
	
	public static void init() {
//		exportJson.addShapedRecipe(new ItemStack(TechBlocks.iron_furnace_block.get()), 
//				"ifi",
//                "fif",
//                "ifi",
//				'i', "forge:ingots/iron",
//				'f', new ItemStack(Blocks.FURNACE));
//		exportJson.addShapedRecipe(new ItemStack(TechBlocks.glowstone_glass.get()),
//				"ggg",
//                "glg",
//                "ggg",
//				'g', new ItemStack(Items.GLOWSTONE_DUST),
//				'l', "forge:glass");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.steel_block.get()), 
				"aaa",
                "aaa",
                "aaa",
				'a', new ItemStack(TechItems.steel_ingot.get()));
		
		exportJson.addShapelessRecipe(new ItemStack(TechItems.steel_ingot.get(), 9), new ItemStack(TechBlocks.steel_block.get()));

		exportJson.addShapedRecipe(new ItemStack(TechBlocks.lava_infused_stone.get()), 
				"h h",
                " w ",
                "h h",
				'h', new ItemStack(TechBlocks.hardened_stone.get()),
				'w', new ItemStack(Items.LAVA_BUCKET));

		exportJson.addShapedRecipe(new ItemStack(TechBlocks.asphalt_block.get(), 8), 
				"gsg",
				"clc",
				"gsg",
				'c', new ItemStack(Blocks.CLAY),
				'g', new ItemStack(Blocks.GRAVEL),
				's', new ItemStack(Blocks.SAND),
				'l', new ItemStack(Items.LAVA_BUCKET));
	// Nether
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.soul_sandstone.get()), 
				"cc",
				"cc",
				'c', new ItemStack(Blocks.SOUL_SAND));
		exportJson.addShapelessRecipe(new ItemStack(Blocks.SOUL_SAND, 4), new ItemStack(TechBlocks.soul_sandstone.get()));
		exportJson.addShapelessRecipe(new ItemStack(Blocks.NETHERRACK, 9), new ItemStack(TechBlocks.compressed_nether_block.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.compressed_nether_block.get()), 
				"ccc",
				"ccc",
				"ccc",
				'c', new ItemStack(Blocks.NETHERRACK));
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.compressed_nether_block.get(), 9), new ItemStack(TechBlocks.double_compressed_nether_block.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.double_compressed_nether_block.get()), 
				"ccc",
				"ccc",
				"ccc",
				'c', new ItemStack(TechBlocks.compressed_nether_block.get()));
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.double_compressed_nether_block.get(), 9), new ItemStack(TechBlocks.triple_compressed_nether_block.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.triple_compressed_nether_block.get()), 
				"ccc",
				"ccc",
				"ccc",
				'c', new ItemStack(TechBlocks.double_compressed_nether_block.get()));
		
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.triple_compressed_nether_block.get(), 9), new ItemStack(TechBlocks.quadruple_compressed_nether_block.get()));
		
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.quadruple_compressed_nether_block.get()), 
				"ccc",
				"ccc",
				"ccc",
				'c', TechBlocks.triple_compressed_nether_block.get());
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.quadruple_compressed_nether_block.get(), 9), new ItemStack(TechBlocks.quintuple_compressed_nether_block.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.quintuple_compressed_nether_block.get()), 
				"ccc",
				"ccc",
				"ccc",
				'c', new ItemStack(TechBlocks.quadruple_compressed_nether_block.get()));
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.quintuple_compressed_nether_block.get(), 9), new ItemStack(TechBlocks.sextuple_compressed_nether_block.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.sextuple_compressed_nether_block.get()), 
				"ccc",
				"ccc",
				"ccc",
				'c', new ItemStack(TechBlocks.quintuple_compressed_nether_block.get()));
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.sextuple_compressed_nether_block.get(), 9), new ItemStack(TechBlocks.septuple_compressed_nether_block.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.septuple_compressed_nether_block.get()), 
				"ccc",
				"ccc",
				"ccc",
				'c', new ItemStack(TechBlocks.sextuple_compressed_nether_block.get()));
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.septuple_compressed_nether_block.get(), 9), new ItemStack(TechBlocks.octuple_compressed_nether_block.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.octuple_compressed_nether_block.get()), 
				"ccc",
				"ccc",
				"ccc",
				'c', new ItemStack(TechBlocks.septuple_compressed_nether_block.get()));
	// bsc
		exportJson.addShapelessRecipe(new ItemStack(Items.SUGAR, 9), new ItemStack(TechBlocks.compressed_sugar.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.compressed_sugar.get()), 
				"ccc",
				"ccc",
            	"ccc",
				'c', new ItemStack(Items.SUGAR));
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.compressed_sugar.get(), 9), new ItemStack(TechBlocks.double_compressed_sugar.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.double_compressed_sugar.get()), 
				"ccc",
				"ccc",
            	"ccc",
				'c', new ItemStack(TechBlocks.compressed_sugar.get()));
		exportJson.addShapelessRecipe(new ItemStack(Items.SUGAR_CANE, 9), new ItemStack(TechBlocks.compressed_sugar_cane.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.compressed_sugar_cane.get()), 
				"ccc",
				"ccc",
            	"ccc",
				'c', new ItemStack(Items.SUGAR_CANE));
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.compressed_sugar_cane.get(), 9), new ItemStack(TechBlocks.double_compressed_sugar_cane.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.double_compressed_sugar_cane.get()), ""
				+ "ccc",
				"ccc",
            	"ccc",
				'c', new ItemStack(TechBlocks.compressed_sugar_cane.get()));
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.double_compressed_sugar_cane.get(), 9), new ItemStack(TechBlocks.triple_compressed_sugar_cane.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.triple_compressed_sugar_cane.get()), 
				"ccc",
				"ccc",
				"ccc",
				'c', new ItemStack(TechBlocks.double_compressed_sugar_cane.get()));
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.triple_compressed_sugar_cane.get(), 9), new ItemStack(TechBlocks.quadruple_compressed_sugar_cane.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.quadruple_compressed_sugar_cane.get()), 
				"ccc",
				"ccc",
            	"ccc",
				'c', new ItemStack(TechBlocks.triple_compressed_sugar_cane.get()));
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.quadruple_compressed_sugar_cane.get(), 9), new ItemStack(TechBlocks.quintuple_compressed_sugar_cane.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.quintuple_compressed_sugar_cane.get()), 
				"ccc",
				"ccc",
            	"ccc",
				'c', new ItemStack(TechBlocks.quadruple_compressed_sugar_cane.get()));
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.quintuple_compressed_sugar_cane.get(), 9), new ItemStack(TechBlocks.sextuple_compressed_sugar_cane.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.sextuple_compressed_sugar_cane.get()), 
				"ccc",
				"ccc",
            	"ccc",
				'c', new ItemStack(TechBlocks.quintuple_compressed_sugar_cane.get()));
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.sextuple_compressed_sugar_cane.get(), 9), new ItemStack(TechBlocks.septuple_compressed_sugar_cane.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.septuple_compressed_sugar_cane.get()), 
				"ccc",
				"ccc",
            	"ccc",
				'c', new ItemStack(TechBlocks.sextuple_compressed_sugar_cane.get()));
		exportJson.addShapelessRecipe(new ItemStack(TechBlocks.septuple_compressed_sugar_cane.get(), 9), new ItemStack(TechBlocks.octuple_compressed_sugar_cane.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.octuple_compressed_sugar_cane.get()), 
				"ccc",
				"ccc",
				"ccc",
				'c', new ItemStack(TechBlocks.septuple_compressed_sugar_cane.get()));
	
	// Stone Torch
		exportJson.addShapedRecipe(new ItemStack(TechItems.stone_stick.get(), 4), 
				"c",
				"c",
				'c', "forge:cobblestone");
	
	// Growth Crystals
		exportJson.addShapedNBTRecipe(new ItemStack(TechBlocks.growth_block.get()), 
				"ibi",
				"ded",
            	"ibi",
				'i', "forge:ingots/iron",
				'b', new ItemStack(Items.BONE_BLOCK),
				'd', PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.SWIFTNESS),
				'e', new ItemStack(Blocks.SEA_LANTERN));
		
		exportJson.addShapedNBTRecipe(new ItemStack(TechBlocks.growth_upgrade.get()), 
				"cnc",
            	"wew",
            	"cnc",
				'e', "forge:glass",
				'w', PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_SWIFTNESS),
				'c', new ItemStack(TechBlocks.growth_block.get()),
				'n', new ItemStack(Items.NETHER_STAR));
		
		exportJson.addShapedNBTRecipe(new ItemStack(TechBlocks.growth_upgrade_two.get()), 
				"cgc",
				"scs",
				"cgc",
				's', PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_SWIFTNESS),
				'g', new ItemStack(TechBlocks.growth_upgrade.get()),
				'c', new ItemStack(Items.END_CRYSTAL));
	
	// Cobble Generators
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.cobblegen_block.get()), 
				"ccc",
            	"wgl",
            	"ccc",
				'c', "forge:cobblestone",
				'w', new ItemStack(Items.WATER_BUCKET),
				'l', new ItemStack(Items.LAVA_BUCKET),
				'g', "forge:glass");
		
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.cobblegen_block.get()), 
				"ccc",
				"lgw",
            	"ccc",
				'c', "forge:cobblestone",
				'w', new ItemStack(Items.WATER_BUCKET),
				'l', new ItemStack(Items.LAVA_BUCKET),
				'g', "forge:glass");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.iron_cobblegen_block.get()), 
				"iii",
				"igi",
				"iii",
				'i', "forge:ingots/iron",
				'g', new ItemStack(TechBlocks.cobblegen_block.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.diamond_cobblegen_block.get()), 
				"ddd",
				"did",
            	"ddd",
				'd', "forge:gems/diamond",
				'i', new ItemStack(TechBlocks.iron_cobblegen_block.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.blaze_cobblegen_block.get()), 
				"bbb",
				"bdb",
				"bbb",
				'b', new ItemStack(Items.BLAZE_ROD),
				'd', new ItemStack(TechBlocks.diamond_cobblegen_block.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.emerald_cobblegen_block.get()), 
				"eee",
				"ebe",
            	"eee",
				'e', "forge:gems/emerald",
				'b', new ItemStack(TechBlocks.blaze_cobblegen_block.get()));
	
	// Reinforced Blocks
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.reinforced_glass.get(), 4), 
				"ogo",
				"gog",
            	"ogo",
				'o', "forge:obsidian",
				'g', new ItemStack(TechBlocks.dirty_glass.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.reinforced_obsidian.get(), 4), 
				"ioi",
				"oio",
				"ioi",
				'o', "forge:obsidian",
				'i', new ItemStack(Blocks.IRON_BARS));
	
	// Dirty Glass
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.dirty_glass.get(), 4), 
				"sgs",
				"gsg",
            	"sgs",
				'g', "forge:glass",
				's', new ItemStack(Blocks.SOUL_SAND));

	// Compressed Blocks
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.flesh_block.get()), 
				"rrr",
				"rrr",
            	"rrr",
				'r', new ItemStack(Items.ROTTEN_FLESH));
		
		exportJson.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 9), TechBlocks.flesh_block.get());
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.bone_block.get()), 
				"bbb",
				"bbb",
            	"bbb",
				'b', "forge:bones");
		
		exportJson.addShapelessRecipe(new ItemStack(Items.BONE, 9), TechBlocks.bone_block.get());
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.netherstar_block.get()), 
				"nnn",
				"nnn",
				"nnn",
				'n', new ItemStack(Items.NETHER_STAR));
		
		 exportJson.addShapelessRecipe(new ItemStack(Items.NETHER_STAR, 9), TechBlocks.netherstar_block.get());
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.flint_block.get()), 
				"fff",
				"fff",
				"fff",
				'f', new ItemStack(Items.FLINT));
				
		exportJson.addShapelessRecipe(new ItemStack(Items.FLINT, 9), TechBlocks.flint_block.get());
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.charcoal_block.get()), 
				"ccc",
				"ccc",
            	"ccc",
				'c', new ItemStack(Items.COAL, 1));
		
		exportJson.addShapelessRecipe(new ItemStack(Items.COAL, 9), TechBlocks.charcoal_block.get());
	
	// Vanilla Bricks
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.diorite_brick.get(), 4), 
				"ss",
				"ss",
				's', new ItemStack(Blocks.POLISHED_DIORITE));
		
		exportJson.addShapelessRecipe(new ItemStack(Blocks.DIORITE, 4), TechBlocks.diorite_brick.get());
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.granite_brick.get(), 4), 
				"ss",
				"ss",
				's', new ItemStack(Blocks.POLISHED_GRANITE));
		
		exportJson.addShapelessRecipe(new ItemStack(Blocks.GRANITE, 4), TechBlocks.granite_brick.get());
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.andesite_brick.get(), 4), 
				"ss",
				"ss",
				's', new ItemStack(Blocks.POLISHED_ANDESITE));
		
//		exportJson.addShapelessRecipe(new ItemStack(Blocks.STONE, 4, 6), TechBlocks.andesite_brick);

	// Hardened Stone
//		GameRegistry.addSmelting(new ItemStack(TechBlocks.unhardened_stone.get()), new ItemStack(TechBlocks.hardened_stone.get()), 1.0F);
		
		exportJson.addSmeltingRecipe(new ItemStack(TechBlocks.hardened_stone.get()), 0, 200, new ItemStack(TechBlocks.unhardened_stone.get()));
		
		
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.unhardened_stone.get(), 4), 
				"csc",
				"yiy",
				"csc",
				'c', new ItemStack(Blocks.COBBLESTONE),
				's', new ItemStack(Blocks.SAND),
				'y', new ItemStack(Items.CLAY_BALL),
				'i', new ItemStack(Items.IRON_INGOT));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks.get()), 
				"ss",
				"ss",
				's', new ItemStack(TechBlocks.hardened_stone.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks.get()), 
				"ss",
				"ss",
				's', new ItemStack(TechBlocks.hardened_stone_bricks.get()));
		
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_stairs.get(), 4), 
				"  s",
				" ss",
            	"sss",
				's', new ItemStack(TechBlocks.hardened_stone.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks_stairs.get(), 4), 
				"  s",
				" ss",
            	"sss",
				's', new ItemStack(TechBlocks.hardened_stone_bricks.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks_stairs.get(), 4), 
				"  s",
				" ss",
            	"sss",
				's', new ItemStack(TechBlocks.hardened_stone_smallbricks.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks_slab.get(), 6), 
				"sss",
				's', new ItemStack(TechBlocks.hardened_stone.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_slab.get(), 6), 
				"sss",
				's', new ItemStack(TechBlocks.hardened_stone_bricks.get()));
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks_slab.get(), 6), 
				"sss",
				's', new ItemStack(TechBlocks.hardened_stone_smallbricks.get()));
	
	// Floaty Block
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.fmf_block.get()), 
				"ifi",
				"fif",
				"ifi",
				'i', "forge:ingots/iron",
				'f', "forge:feathers");
	

//		exportJson.addShapedRecipe(new ItemStack(TechBlocks.glowstone_glass.get(), 1), 
//			"dd",
//			"dd",
//			'd', "forge:dust/glowstone");

/*		exportJson.addShapedRecipe(new ItemStack(TechBlocks.white_glowstone.get(), 1),
				"dd",
				"dd",
				'd', "forge:dust/white_glowstone");
		
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.silver_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/silver_glowstone");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.red_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/red_glowstone");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.purple_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/purple_glowstone");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.pink_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/pink_glowstone");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.orange_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/orange_glowstone");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.magenta_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/magenta_glowstone");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.lime_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/lime_glowstone");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.lightblue_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/light_blue_glowstone");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.green_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/green_glowstone");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.gray_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/gray_glowstone");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.cyan_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/cyan_glowstone");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.brown_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/brown_glowstone");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.blue_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/blue_glowstone");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.black_glowstone.get(), 1), 
				"dd",
				"dd",
				'd', "forge:dust/black_glowstone");
		
		*/
	// Lamps
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.lamp.get()), 
				"dt",
				'd', "forge:glass/colorless",
				't', "forge:torches");

		exportJson.addShapedRecipe(new ItemStack(TechBlocks.yellow_lamp.get(), 1), 
					"dt",
					'd', new ItemStack(Blocks.YELLOW_STAINED_GLASS, 1),
					't', "forge:torches");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.white_lamp.get(), 1), 
				"dt",
				'd', new ItemStack(Blocks.WHITE_STAINED_GLASS, 1),
				't', "forge:torches");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.red_lamp.get(), 1), 
				"dt",
				'd', new ItemStack(Blocks.RED_STAINED_GLASS, 1),
				't', "forge:torches");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.pink_lamp.get(), 1), 
				"dt",
				'd', new ItemStack(Blocks.PINK_STAINED_GLASS, 1),
				't', "forge:torches");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.orange_lamp.get(), 1), 
				"dt",
				'd', new ItemStack(Blocks.ORANGE_STAINED_GLASS, 1),
				't', "forge:torches");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.magenta_lamp.get(), 1), 
				"dt",
				'd', new ItemStack(Blocks.MAGENTA_STAINED_GLASS, 1),
				't', "forge:torches");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.lime_lamp.get(), 1), 
				"dt",
				'd', new ItemStack(Blocks.LIME_STAINED_GLASS, 1),
				't', "forge:torches");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.lightblue_lamp.get(), 1), 
				"dt",
				'd', new ItemStack(Blocks.LIGHT_BLUE_STAINED_GLASS, 1),
				't', "forge:torches");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.green_lamp.get(), 1), 
				"dt",
				'd', new ItemStack(Blocks.GREEN_STAINED_GLASS, 1),
				't', "forge:torches");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.gray_lamp.get(), 1), 
				"dt",
				'd', new ItemStack(Blocks.GRAY_STAINED_GLASS, 1),
				't', "forge:torches");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.cyan_lamp.get(), 1), 
				"dt",
				'd', new ItemStack(Blocks.CYAN_STAINED_GLASS, 1),
				't', "forge:torches");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.blue_lamp.get(), 1), 
				"dt",
				'd', new ItemStack(Blocks.BLUE_STAINED_GLASS, 1),
				't', "forge:torches");
		exportJson.addShapedRecipe(new ItemStack(TechBlocks.black_lamp.get(), 1), 
				"dt",
				'd', new ItemStack(Blocks.BLACK_STAINED_GLASS, 1),
				't', "forge:torches");
		
		
	
	exportJson.addShapedRecipe(new ItemStack(TechBlocks.ghost_block.get(), 4), 
			"cgc",
			"ghg",
			"cgc",
			'h', TechItems.stone_hammer.get(),
			'g', "forge:glass/colorless",
			'c', "forge:cobblestone");
}
}
