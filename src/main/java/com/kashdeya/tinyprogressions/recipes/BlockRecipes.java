package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.properties.EnumDustColor;
import com.kashdeya.tinyprogressions.properties.EnumGlowstoneColor;
import com.kashdeya.tinyprogressions.properties.EnumLampColor;
import com.kashdeya.tinyprogressions.registry.recipes.ShapedRecipe;
import com.kashdeya.tinyprogressions.registry.recipes.ShapelessRecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRecipes {
	public static IRecipe SOUL_SANDSTONE, SOUL_SAND;
	public static IRecipe STONE_STICK, STONE_TORCH, STONE_TORCH2;
	public static IRecipe GROWTH_BLOCK, GROWTH_UPGRADE, GROWTH_UPGRADE_TWO;
	public static IRecipe COBBLE_GEN, COBBLE_GEN2, IRON_COBBLE_GEN, DIAMOND_COBBLE_GEN, BLAZE_COBBLE_GEN, EMERALD_COBBLE_GEN;
	public static IRecipe OBSIDIAN, GLASS, DIRTY_GLASS;
	public static IRecipe FLESH_BLOCK, ROTTEN_FLESH;
	public static IRecipe BONE_BLOCK, BONE;
	public static IRecipe NETHERSTAR_BLOCK, NETHERSTAR;
	public static IRecipe FLINT_BLOCK, FLINT;
	public static IRecipe CHARCOAL_BLOCK, CHARCOAL;
	public static IRecipe DIORITE_BRICK, DIORITE, ANDESITE_BRICK, ANDESITE, GRANITE_BRICK, GRANITE;
	public static IRecipe UNHARDENED_STONE, HARDENED_STONE, HARDENED_STONEBRICKS, HARDENED_STONESMALLBRICKS;
	public static IRecipe HARDENED_STONE_STAIRS, HARDENED_STONEBRICKS_STAIRS, HARDENED_STONESMALLBRICKS_STAIRS;
	public static IRecipe HARDENED_STONE_SLAB, HARDENED_STONEBRICKS_SLAB, HARDENED_STONESMALLBRICKS_SLAB;
	public static IRecipe FMF_BLOCK;
	public static IRecipe LAMP;
	public static IRecipe[] COLORED_GLOWSTONE, COLORED_LAMPS;
	public static IRecipe LAVA_CRYSTAL, LAVA_CRYSTAL_BLOCK;
	public static IRecipe NETHERRACK, COMPRESSED_NETHER, COMPRESSED_NETHER2, COMPRESSED_2_NETHER, COMPRESSED_2_NETHER2, COMPRESSED_3_NETHER, COMPRESSED_3_NETHER2, COMPRESSED_4_NETHER, COMPRESSED_4_NETHER2;
	public static IRecipe COMPRESSED_5_NETHER, COMPRESSED_5_NETHER2, COMPRESSED_6_NETHER, COMPRESSED_6_NETHER2, COMPRESSED_7_NETHER, COMPRESSED_7_NETHER2, COMPRESSED_8_NETHER;
	public static IRecipe SUGAR, COMPRESSED_SUGAR, COMPRESSED_SUGAR2, COMPRESSED_2_SUGAR;
	public static IRecipe CANE, COMPRESSED_CANE, COMPRESSED_CANE2, COMPRESSED_2_CANE, COMPRESSED_2_CANE2, COMPRESSED_3_CANE, COMPRESSED_3_CANE2, COMPRESSED_4_CANE, COMPRESSED_4_CANE2;
	public static IRecipe COMPRESSED_5_CANE, COMPRESSED_5_CANE2, COMPRESSED_6_CANE, COMPRESSED_6_CANE2, COMPRESSED_7_CANE, COMPRESSED_7_CANE2, COMPRESSED_8_CANE;
	public static IRecipe ASPHALT;
	
	public static void init() {
		if (ConfigHandler.asphalt){
			ASPHALT = new ShapedRecipe(new ItemStack(TechBlocks.asphalt_block, 8), "gsg",
                "clc",
                "gsg",
				'c', Blocks.CLAY,
				'g', Blocks.GRAVEL,
				's', Blocks.SAND,
				'l', Items.LAVA_BUCKET);
		}
		// Nether
		if (ConfigHandler.nether_rod){
			SOUL_SANDSTONE = new ShapedRecipe(new ItemStack(TechBlocks.soul_sandstone), "cc",
                "cc",
				'c', Blocks.SOUL_SAND);
			SOUL_SAND = new ShapelessRecipe(new ItemStack(Blocks.SOUL_SAND, 9), TechBlocks.soul_sandstone);
		}
		if (ConfigHandler.nether_compressed_blocks){
			NETHERRACK = new ShapelessRecipe(new ItemStack(Blocks.NETHERRACK, 9), TechBlocks.compressed_nether_block);
			COMPRESSED_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.compressed_nether_block), "ccc",
                "ccc",
                "ccc",
				'c', Blocks.NETHERRACK);
			COMPRESSED_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.compressed_nether_block, 9), TechBlocks.double_compressed_nether_block);
			COMPRESSED_2_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.double_compressed_nether_block), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.compressed_nether_block);
			COMPRESSED_2_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.double_compressed_nether_block, 9), TechBlocks.triple_compressed_nether_block);
			COMPRESSED_3_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.triple_compressed_nether_block), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.double_compressed_nether_block);
			COMPRESSED_3_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.triple_compressed_nether_block, 9), TechBlocks.quadruple_compressed_nether_block);
			COMPRESSED_4_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.quadruple_compressed_nether_block), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.triple_compressed_nether_block);
			COMPRESSED_4_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.quadruple_compressed_nether_block, 9), TechBlocks.quintuple_compressed_nether_block);
			COMPRESSED_5_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.quintuple_compressed_nether_block), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.quadruple_compressed_nether_block);
			COMPRESSED_5_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.quintuple_compressed_nether_block, 9), TechBlocks.sextuple_compressed_nether_block);
			COMPRESSED_6_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.sextuple_compressed_nether_block), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.quintuple_compressed_nether_block);
			COMPRESSED_6_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.sextuple_compressed_nether_block, 9), TechBlocks.septuple_compressed_nether_block);
			COMPRESSED_7_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.septuple_compressed_nether_block), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.sextuple_compressed_nether_block);
			COMPRESSED_7_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.septuple_compressed_nether_block, 9), TechBlocks.octuple_compressed_nether_block);
			COMPRESSED_8_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.octuple_compressed_nether_block), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.septuple_compressed_nether_block);
		}
		// bsc
		if (ConfigHandler.bsc_sugar_compressed_blocks){
			SUGAR = new ShapelessRecipe(new ItemStack(Items.SUGAR, 9), TechBlocks.compressed_sugar);
			COMPRESSED_SUGAR = new ShapedRecipe(new ItemStack(TechBlocks.compressed_sugar), "ccc",
                "ccc",
                "ccc",
				'c', Items.SUGAR);
			COMPRESSED_SUGAR2 = new ShapelessRecipe(new ItemStack(TechBlocks.compressed_sugar, 9), TechBlocks.double_compressed_sugar);
			COMPRESSED_2_SUGAR = new ShapedRecipe(new ItemStack(TechBlocks.double_compressed_sugar), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.compressed_sugar);
		}
		if (ConfigHandler.bsc_sugarcane_compressed_blocks){
			CANE = new ShapelessRecipe(new ItemStack(Items.REEDS, 9), TechBlocks.compressed_sugar_cane);
			COMPRESSED_CANE = new ShapedRecipe(new ItemStack(TechBlocks.compressed_sugar_cane), "ccc",
                "ccc",
                "ccc",
				'c', Items.REEDS);
			COMPRESSED_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.compressed_sugar_cane, 9), TechBlocks.double_compressed_sugar_cane);
			COMPRESSED_2_CANE = new ShapedRecipe(new ItemStack(TechBlocks.double_compressed_sugar_cane), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.compressed_sugar_cane);
			COMPRESSED_2_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.double_compressed_sugar_cane, 9), TechBlocks.triple_compressed_sugar_cane);
			COMPRESSED_3_CANE = new ShapedRecipe(new ItemStack(TechBlocks.triple_compressed_sugar_cane), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.double_compressed_sugar_cane);
			COMPRESSED_3_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.triple_compressed_sugar_cane, 9), TechBlocks.quadruple_compressed_sugar_cane);
			COMPRESSED_4_CANE = new ShapedRecipe(new ItemStack(TechBlocks.quadruple_compressed_sugar_cane), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.triple_compressed_sugar_cane);
			COMPRESSED_4_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.quadruple_compressed_sugar_cane, 9), TechBlocks.quintuple_compressed_sugar_cane);
			COMPRESSED_5_CANE = new ShapedRecipe(new ItemStack(TechBlocks.quintuple_compressed_sugar_cane), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.quadruple_compressed_sugar_cane);
			COMPRESSED_5_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.quintuple_compressed_sugar_cane, 9), TechBlocks.sextuple_compressed_sugar_cane);
			COMPRESSED_6_CANE = new ShapedRecipe(new ItemStack(TechBlocks.sextuple_compressed_sugar_cane), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.quintuple_compressed_sugar_cane);
			COMPRESSED_6_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.sextuple_compressed_sugar_cane, 9), TechBlocks.septuple_compressed_sugar_cane);
			COMPRESSED_7_CANE = new ShapedRecipe(new ItemStack(TechBlocks.septuple_compressed_sugar_cane), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.sextuple_compressed_sugar_cane);
			COMPRESSED_7_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.septuple_compressed_sugar_cane, 9), TechBlocks.octuple_compressed_sugar_cane);
			COMPRESSED_8_CANE = new ShapedRecipe(new ItemStack(TechBlocks.octuple_compressed_sugar_cane), "ccc",
                "ccc",
                "ccc",
				'c', TechBlocks.septuple_compressed_sugar_cane);
		}
		
		// Stone Torch
		if (ConfigHandler.StoneTorch) {
			STONE_STICK = new ShapedRecipe(new ItemStack(TechItems.stone_stick, 4), "c",
                "c",
				'c', "cobblestone");
		}
		
		// Growth Crystals
		if (ConfigHandler.BlockGrowth) {
			GROWTH_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.growth_block), "ibi",
                "ded",
                "ibi",
				'i', "ingotIron",
				'b', TechBlocks.bone_block,
				'd', TechBlocks.dirty_glass,
				'e', Blocks.SEA_LANTERN);
		}
		if (ConfigHandler.BlockGrowthUpgrade && ConfigHandler.WateringCanUpgrade && ConfigHandler.BlockGrowth && ConfigHandler.NetherStarBlock) {
			GROWTH_UPGRADE = new ShapedRecipe(new ItemStack(TechBlocks.growth_upgrade), "cwc",
                "ses",
                "cnc",
				'c', TechBlocks.reinforced_glass,
				'w', TechItems.watering_can_upgrade,
				's', Items.END_CRYSTAL,
				'e', TechBlocks.growth_block,
				'n', TechBlocks.netherstar_block);
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo && ConfigHandler.BlockGrowthUpgrade) {
			GROWTH_UPGRADE_TWO = new ShapelessRecipe(new ItemStack(TechBlocks.growth_upgrade_two), TechBlocks.growth_upgrade, Blocks.DRAGON_EGG);
		}
		
		// Cobble Generators
		if (ConfigHandler.Cobblegen) {
			COBBLE_GEN = new ShapedRecipe(new ItemStack(TechBlocks.cobblegen_block), "ccc",
                "wgl",
                "ccc",
				'c', "cobblestone",
				'w', Items.WATER_BUCKET,
				'l', Items.LAVA_BUCKET,
				'g', "blockGlass");
			
			COBBLE_GEN2 = new ShapedRecipe(new ItemStack(TechBlocks.cobblegen_block), "ccc",
                "lgw",
                "ccc",
				'c', "cobblestone",
				'w', Items.WATER_BUCKET,
				'l', Items.LAVA_BUCKET,
				'g', "blockGlass");
		}
		if (ConfigHandler.IronCobblegen && ConfigHandler.Cobblegen) {
			IRON_COBBLE_GEN = new ShapedRecipe(new ItemStack(TechBlocks.iron_cobblegen_block), "iii",
                "igi",
                "iii",
				'i', "ingotIron",
				'g', TechBlocks.cobblegen_block);
		}
		if (ConfigHandler.DiamondCobblegen && ConfigHandler.IronCobblegen) {
			DIAMOND_COBBLE_GEN = new ShapedRecipe(new ItemStack(TechBlocks.diamond_cobblegen_block), "ddd",
                "did",
                "ddd",
				'd', "gemDiamond",
				'i', TechBlocks.iron_cobblegen_block);
		}
		if (ConfigHandler.BlazeCobblegen && ConfigHandler.DiamondCobblegen) {
			BLAZE_COBBLE_GEN = new ShapedRecipe(new ItemStack(TechBlocks.blaze_cobblegen_block), "bbb",
                "bdb",
                "bbb",
				'b', Items.BLAZE_ROD,
				'd', TechBlocks.diamond_cobblegen_block);
		}
		if (ConfigHandler.EmeraldCobblegen && ConfigHandler.BlazeCobblegen) {
			EMERALD_COBBLE_GEN = new ShapedRecipe(new ItemStack(TechBlocks.emerald_cobblegen_block), "eee",
                "ebe",
                "eee",
				'e', "gemEmerald",
				'b', TechBlocks.blaze_cobblegen_block);
		}

		// Stone Torch
		if (ConfigHandler.StoneTorch) {
			STONE_TORCH = new ShapedRecipe(new ItemStack(TechBlocks.stone_torch, 4), "c",
                "s",
				'c', new ItemStack(Items.COAL,1,0),
				's', "stickStone");
			STONE_TORCH2 = new ShapedRecipe(new ItemStack(TechBlocks.stone_torch, 4), "c",
                "s",
				'c', new ItemStack(Items.COAL,1,1),
				's', "stickStone");
		}
		
		// Reinforced Blocks
		if (ConfigHandler.ReinforcedGlass) {
			GLASS = new ShapedRecipe(new ItemStack(TechBlocks.reinforced_glass, 4), "ogo",
                "gog",
                "ogo",
				'o', "obsidian",
				'g', TechBlocks.dirty_glass);
		}
		if (ConfigHandler.ReinforcedObsidian) {
			OBSIDIAN = new ShapedRecipe(new ItemStack(TechBlocks.reinforced_obsidian, 4), "ioi",
                "oio",
                "ioi",
				'o', "obsidian",
				'i', Blocks.IRON_BARS);
		}
		
		// Dirty Glass
		if (ConfigHandler.DirtyGlass) {
			DIRTY_GLASS = new ShapedRecipe(new ItemStack(TechBlocks.dirty_glass, 4), "sgs",
                "gsg",
                "sgs",
				'g', "blockGlass",
				's', Blocks.SOUL_SAND);
		}

		// Compressed Blocks
		if (ConfigHandler.FleshBlock) {
			FLESH_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.flesh_block), "rrr",
                "rrr",
                "rrr",
				'r', Items.ROTTEN_FLESH);
			
			ROTTEN_FLESH = new ShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 9), TechBlocks.flesh_block);
		}
		if (ConfigHandler.BoneBlock) {
			BONE_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.bone_block), "bbb",
                "bbb",
                "bbb",
				'b', "bone");
			
			BONE = new ShapelessRecipe(new ItemStack(Items.BONE, 9), TechBlocks.bone_block);
		}
		if (ConfigHandler.NetherStarBlock) {
			NETHERSTAR_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.netherstar_block), "nnn",
                "nnn",
                "nnn",
				'n', Items.NETHER_STAR);
			
			NETHERSTAR = new ShapelessRecipe(new ItemStack(Items.NETHER_STAR, 9), TechBlocks.netherstar_block);
		}
		if (ConfigHandler.FlintBlock) {
			FLINT_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.flint_block), "fff",
                "fff",
                "fff",
				'f', "flint");
					
			FLINT = new ShapelessRecipe(new ItemStack(Items.FLINT, 9), TechBlocks.flint_block);
		}
		if (ConfigHandler.CharcoalBlock) {
			CHARCOAL_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.charcoal_block), "ccc",
                "ccc",
                "ccc",
				'c', new ItemStack(Items.COAL, 1, 1));
			
			CHARCOAL = new ShapelessRecipe(new ItemStack(Items.COAL, 9, 1), TechBlocks.charcoal_block);
		}
		
		// Vanilla Bricks
		if (ConfigHandler.DioriteBrick) {
			DIORITE_BRICK = new ShapedRecipe(new ItemStack(TechBlocks.diorite_brick, 4), "ss",
                "ss",
				's', "stoneDioritePolished");
			
			DIORITE = new ShapelessRecipe(new ItemStack(Blocks.STONE, 4, 4), TechBlocks.diorite_brick);
		}
		if (ConfigHandler.GraniteBrick) {
			GRANITE_BRICK = new ShapedRecipe(new ItemStack(TechBlocks.granite_brick, 4), "ss",
                "ss",
				's', "stoneGranitePolished");
			
			GRANITE = new ShapelessRecipe(new ItemStack(Blocks.STONE, 4, 2), TechBlocks.granite_brick);
		}
		if (ConfigHandler.AndesiteBrick) {
			ANDESITE_BRICK = new ShapedRecipe(new ItemStack(TechBlocks.andesite_brick, 4), "ss",
                "ss",
				's', "stoneAndesitePolished");
			
			ANDESITE = new ShapelessRecipe(new ItemStack(Blocks.STONE, 4, 6), TechBlocks.andesite_brick);
		}

		// Hardened Stone
		if (ConfigHandler.hardened_stone) {
			GameRegistry.addSmelting(new ItemStack(TechBlocks.unhardened_stone), new ItemStack(TechBlocks.hardened_stone), 1.0F);
			UNHARDENED_STONE = new ShapedRecipe(new ItemStack(TechBlocks.unhardened_stone, 4), "csc",
                "yiy",
                "csc",
				'c', Blocks.COBBLESTONE,
				's', Blocks.SAND,
				'y', Items.CLAY_BALL,
				'i', Items.IRON_INGOT);
			HARDENED_STONEBRICKS = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks), "ss",
                "ss",
				's', TechBlocks.hardened_stone);
			HARDENED_STONESMALLBRICKS = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks), "ss",
                "ss",
				's', TechBlocks.hardened_stone_bricks);
			
			HARDENED_STONE_STAIRS = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_stairs, 4), "  s",
                " ss",
                "sss",
				's', TechBlocks.hardened_stone);
			HARDENED_STONEBRICKS_STAIRS = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks_stairs, 4), "  s",
                " ss",
                "sss",
				's', TechBlocks.hardened_stone_bricks);
			HARDENED_STONESMALLBRICKS_STAIRS = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks_stairs, 4), "  s",
                " ss",
                "sss",
				's', TechBlocks.hardened_stone_smallbricks);
			HARDENED_STONE_SLAB = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_slab_half, 6), "sss",
				's', TechBlocks.hardened_stone);
			HARDENED_STONEBRICKS_SLAB = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks_slab_half, 6), "sss",
				's', TechBlocks.hardened_stone_bricks);
			HARDENED_STONESMALLBRICKS_SLAB = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks_slab_half, 6), "sss",
				's', TechBlocks.hardened_stone_smallbricks);
		}
		
		// Floaty Block
		if (ConfigHandler.angel_block) {
			FMF_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.fmf_block), "ifi",
                "fif",
                "ifi",
				'i', "ingotIron",
				'f', "feather");
		}
		
		// Glowstone Dust
		if (ConfigHandler.ColorGlowstone){
			COLORED_GLOWSTONE = new IRecipe[EnumGlowstoneColor.values().length];
			for(int i = 0; i < EnumGlowstoneColor.values().length; i++)
			{
				COLORED_GLOWSTONE[i] = new ShapedRecipe(new ItemStack(TechBlocks.colored_glowstone, 1, i), "dd",
                    "dd",
					'd', EnumDustColor.values()[i].getOredict());
			}
		}
		
		// Lamps
		if (ConfigHandler.ColorLamps){
			LAMP = new ShapedRecipe(new ItemStack(TechBlocks.lamp), "dt",
				'd', "blockGlassColorless",
				't', "torch");
			
			COLORED_LAMPS = new IRecipe[EnumLampColor.values().length];
			for(int i = 0; i < EnumLampColor.values().length; i++)
			{
				COLORED_LAMPS[i] = new ShapedRecipe(new ItemStack(TechBlocks.colored_lamp, 1, i), "dt",
					'd', new ItemStack(Blocks.STAINED_GLASS, 1, i),
					't', "torch");
			}
		}
		
		// Lava Crystal Block
		if (ArmorHandler.lapis_armor) {
			LAVA_CRYSTAL_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.lava_crystal_block), "ii",
                "ii",
				'i', TechItems.lava_crystal);
			
			LAVA_CRYSTAL = new ShapelessRecipe(new ItemStack(TechItems.lava_crystal, 4), new ItemStack(TechBlocks.lava_crystal_block));
		}
	}
}
