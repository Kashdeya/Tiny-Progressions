package com.kashdeya.tinyprogressions.inits;

import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.blocks.DirtyGlass;
import com.kashdeya.tinyprogressions.blocks.EnderOre;
import com.kashdeya.tinyprogressions.blocks.LavaOre;
import com.kashdeya.tinyprogressions.blocks.cobblegen.BlazeCobblegen;
import com.kashdeya.tinyprogressions.blocks.cobblegen.Cobblegen;
import com.kashdeya.tinyprogressions.blocks.cobblegen.DiamondCobblegen;
import com.kashdeya.tinyprogressions.blocks.cobblegen.EmeraldCobblegen;
import com.kashdeya.tinyprogressions.blocks.cobblegen.IronCobblegen;
import com.kashdeya.tinyprogressions.blocks.compressed.BoneBlock;
import com.kashdeya.tinyprogressions.blocks.compressed.CharcoalBlock;
import com.kashdeya.tinyprogressions.blocks.compressed.FleshBlock;
import com.kashdeya.tinyprogressions.blocks.compressed.FlintBlock;
import com.kashdeya.tinyprogressions.blocks.compressed.NetherStarBlock;
import com.kashdeya.tinyprogressions.blocks.decorations.AndesiteBrick;
import com.kashdeya.tinyprogressions.blocks.decorations.DioriteBrick;
import com.kashdeya.tinyprogressions.blocks.decorations.GraniteBrick;
import com.kashdeya.tinyprogressions.blocks.decorations.SmoothEndStone;
import com.kashdeya.tinyprogressions.blocks.decorations.StoneTorch;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowth;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowthUpgrade;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowthUpgradeTwo;
import com.kashdeya.tinyprogressions.blocks.reinforced.ReinforcedGlass;
import com.kashdeya.tinyprogressions.blocks.reinforced.ReinforcedObsidian;
import com.kashdeya.tinyprogressions.crafting.Recipes;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;

public class TechBlocks {

	static Set<Block> blocks = Sets.newHashSet();
	static Set<ItemBlock> itemblocks = Sets.newHashSet();

	// Tech Blocks
	public static Block growth_block;
	public static Block growth_upgrade;
	public static Block growth_upgrade_two;
	public static Block cobblegen_block;
	public static Block iron_cobblegen_block;
	public static Block diamond_cobblegen_block;
	public static Block emerald_cobblegen_block;
	public static Block blaze_cobblegen_block;
	// Deco Blocks
	public static Block charcoal_block;
	public static Block reinforced_glass;
	public static Block reinforced_obsidian;
	public static Block dirty_glass;
	public static Block diorite_brick;
	public static Block granite_brick;
	public static Block andesite_brick;
	// Compressed Blocks
	public static Block flesh_block;
	public static Block bone_block;
	public static Block netherstar_block;
	public static Block flint_block;
	// End Stones
	public static Block smooth_endstone;
	// Stone Torch
	public static Block stone_torch;
	// EnderOre
	public static Block ender_ore;
	// Lava Crystals
	public static Block lava_ore;

	public static void init() {

		// Tech Blocks
		if (ConfigHandler.BlockGrowth) {
			growth_block = new BlockGrowth();
			registerBlock(growth_block, "growth_block", true);
			
			Recipes.addShapedRecipe("growth_block", new ItemStack(growth_block), new Object[] {
					"ibi",
					"ded",
					"ibi",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('b'), "blockBone",
						Character.valueOf('d'), "blockGlassDirty",
						Character.valueOf('e'), Blocks.SEA_LANTERN
			});
		}
		if (ConfigHandler.BlockGrowthUpgrade) {
			growth_upgrade = new BlockGrowthUpgrade();
			registerBlock(growth_upgrade, "growth_upgrade", true);
			
			Recipes.addShapedRecipe("growth_upgrade", new ItemStack(growth_upgrade), new Object[] {
					"cwc",
					"ses",
					"cnc",
						Character.valueOf('c'), "blockReinforcedObsidian",
						Character.valueOf('w'), TechItems.watering_can_upgrade,
						Character.valueOf('s'), Items.END_CRYSTAL,
						Character.valueOf('e'), Items.NETHER_STAR,
						Character.valueOf('n'), Items.NETHER_STAR
			});
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo) {
			growth_upgrade_two = new BlockGrowthUpgradeTwo();
			registerBlock(growth_upgrade_two, "growth_upgrade_two", true);
			
			Recipes.addShapelessRecipe("growth_upgrade_two", new ItemStack(growth_upgrade_two), new Object[] {
					growth_upgrade, Blocks.DRAGON_EGG
			});
		}
		if (ConfigHandler.Cobblegen) {
			cobblegen_block = new Cobblegen();
			registerBlock(cobblegen_block, "cobblegen_block", true);
			
			Recipes.addShapedRecipe("cobblegen_block", new ItemStack(cobblegen_block), new Object[] {
					"ccc",
					"wgl",
					"ccc",
						Character.valueOf('c'), "cobblestone",
						Character.valueOf('w'), Items.WATER_BUCKET,
						Character.valueOf('l'), Items.LAVA_BUCKET,
						Character.valueOf('g'), "blockGlass"
			});
			
			Recipes.addShapedRecipe("cobblegen_block", new ItemStack(cobblegen_block), new Object[] {
					"ccc",
					"lgw",
					"ccc",
						Character.valueOf('c'), "cobblestone",
						Character.valueOf('w'), Items.WATER_BUCKET,
						Character.valueOf('l'), Items.LAVA_BUCKET,
						Character.valueOf('g'), "blockGlass"
			});
		}
		if (ConfigHandler.IronCobblegen) {
			iron_cobblegen_block = new IronCobblegen();
			registerBlock(iron_cobblegen_block, "iron_cobblegen_block", true);
			
			Recipes.addShapedRecipe("iron_cobblegen_block", new ItemStack(iron_cobblegen_block), new Object[] {
					"iii",
					"igi",
					"iii",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('g'), cobblegen_block
			});
		}
		if (ConfigHandler.DiamondCobblegen) {
			diamond_cobblegen_block = new DiamondCobblegen();
			registerBlock(diamond_cobblegen_block, "diamond_cobblegen_block", true);
			
			Recipes.addShapedRecipe("diamond_cobblegen_block", new ItemStack(diamond_cobblegen_block), new Object[] {
					"ddd",
					"did",
					"ddd",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('i'), iron_cobblegen_block
			});
		}
		if (ConfigHandler.BlazeCobblegen) {
			blaze_cobblegen_block = new BlazeCobblegen();
			registerBlock(blaze_cobblegen_block, "blaze_cobblegen_block", true);
			
			Recipes.addShapedRecipe("diamond_cobblegen_block", new ItemStack(diamond_cobblegen_block), new Object[] {
					"bbb",
					"bdb",
					"bbb",
						Character.valueOf('b'), Items.BLAZE_ROD,
						Character.valueOf('d'), diamond_cobblegen_block
			});
		}
		if (ConfigHandler.EmeraldCobblegen) {
			emerald_cobblegen_block = new EmeraldCobblegen();
			registerBlock(emerald_cobblegen_block, "emerald_cobblegen_block", true);
			
			Recipes.addShapedRecipe("diamond_cobblegen_block", new ItemStack(diamond_cobblegen_block), new Object[] {
					"eee",
					"ebe",
					"eee",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('b'), blaze_cobblegen_block
			});
		}

		// Deco Blocks
		if (ConfigHandler.StoneTorch) {
			stone_torch = new StoneTorch();
			registerBlock(stone_torch, "stone_torch", true);
			
			Recipes.addShapedRecipe("stone_torch", new ItemStack(stone_torch), new Object[] {
					"c",
					"s",
						Character.valueOf('c'), Items.COAL,
						Character.valueOf('s'), "stickStone"
			});
		}
		if (ConfigHandler.CharcoalBlock) {
			charcoal_block = new CharcoalBlock();
			registerBlock(charcoal_block, "charcoal_block", true);
			
			Recipes.addShapedRecipe("charcoal_block", new ItemStack(charcoal_block), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), new ItemStack(Items.COAL, 1, 1)
			});
			
			Recipes.addShapelessRecipe("charcoal", new ItemStack(Items.COAL, 9, 1), new Object[] {
					charcoal_block
			});
		}
		if (ConfigHandler.ReinforcedGlass) {
			reinforced_glass = new ReinforcedGlass();
			registerBlock(reinforced_glass, "reinforced_glass", true);
			
			Recipes.addShapedRecipe("reinforced_glass", new ItemStack(reinforced_glass, 4), new Object[] {
					"ogo",
					"gog",
					"ogo",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('g'), "blockGlassDirty"
			});
		}
		if (ConfigHandler.ReinforcedObsidian) {
			reinforced_obsidian = new ReinforcedObsidian();
			registerBlock(reinforced_obsidian, "reinforced_obsidian", true);
			
			Recipes.addShapedRecipe("reinforced_obsidian", new ItemStack(reinforced_obsidian, 4), new Object[] {
					"ioi",
					"oio",
					"ioi",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('i'), Blocks.IRON_BARS
			});
		}
		if (ConfigHandler.DirtyGlass) {
			dirty_glass = new DirtyGlass();
			registerBlock(dirty_glass, "dirty_glass", true);
			
			Recipes.addShapedRecipe("dirty_glass", new ItemStack(dirty_glass, 4), new Object[] {
					"sgs",
					"gsg",
					"sgs",
						Character.valueOf('g'), "blockGlass",
						Character.valueOf('s'), Blocks.SOUL_SAND
			});
		}

		// Compressed Blocks
		if (ConfigHandler.FleshBlock) {
			flesh_block = new FleshBlock();
			registerBlock(flesh_block, "flesh_block", true);
			
			Recipes.addShapedRecipe("flesh_block", new ItemStack(flesh_block), new Object[] {
					"rrr",
					"rrr",
					"rrr",
						Character.valueOf('r'), Items.ROTTEN_FLESH
			});
			
			Recipes.addShapelessRecipe("rotten_flesh", new ItemStack(Items.ROTTEN_FLESH, 9), new Object[] {
					flesh_block
			});
		}
		if (ConfigHandler.BoneBlock) {
			bone_block = new BoneBlock();
			registerBlock(bone_block, "bone_block", true);
			
			Recipes.addShapedRecipe("bone_block", new ItemStack(bone_block), new Object[] {
					"bbb",
					"bbb",
					"bbb",
						Character.valueOf('b'), "bone"
			});
			
			Recipes.addShapelessRecipe("bone", new ItemStack(Items.BONE, 9), new Object[] {
					bone_block
			});
		}
		if (ConfigHandler.NetherStarBlock) {
			netherstar_block = new NetherStarBlock();
			registerBlock(netherstar_block, "netherstar_block", true);
			
			Recipes.addShapedRecipe("netherstar_block", new ItemStack(netherstar_block), new Object[] {
					"nnn",
					"nnn",
					"nnn",
						Character.valueOf('n'), Items.NETHER_STAR
			});
			
			Recipes.addShapelessRecipe("nether_star", new ItemStack(Items.NETHER_STAR, 9), new Object[] {
					netherstar_block
			});
		}
		if (ConfigHandler.DioriteBrick) {
			diorite_brick = new DioriteBrick();
			registerBlock(diorite_brick, "diorite_brick", true);
			
			Recipes.addShapedRecipe("diorite_brick", new ItemStack(diorite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneDioritePolished"
			});
			
			Recipes.addShapelessRecipe("diorite", new ItemStack(Blocks.STONE, 1, 4), new Object[] {
					diorite_brick
			});
		}
		if (ConfigHandler.GraniteBrick) {
			granite_brick = new GraniteBrick();
			registerBlock(granite_brick, "granite_brick", true);
			
			Recipes.addShapedRecipe("granite_brick", new ItemStack(granite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneGranitePolished"
			});
			
			Recipes.addShapelessRecipe("granite", new ItemStack(Blocks.STONE, 1, 2), new Object[] {
					granite_brick
			});
		}
		if (ConfigHandler.AndesiteBrick) {
			andesite_brick = new AndesiteBrick();
			registerBlock(andesite_brick, "andesite_brick", true);
			
			Recipes.addShapedRecipe("andesite_brick", new ItemStack(andesite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneAndesitePolished"
			});
			
			Recipes.addShapelessRecipe("andesite", new ItemStack(Blocks.STONE, 1, 6), new Object[] {
					andesite_brick
			});
		}

		// Flint Block
		if (ConfigHandler.FlintBlock) {
			flint_block = new FlintBlock();
			registerBlock(flint_block, "flint_block", true);
			
			Recipes.addShapedRecipe("flint_block", new ItemStack(flint_block), new Object[] {
					"fff",
					"fff",
					"fff",
						Character.valueOf('f'), "flint"
			});
			
			Recipes.addShapelessRecipe("flint", new ItemStack(Items.FLINT, 9), new Object[] {
					flint_block
			});
		}

		// Smooth EndStone
		if (ConfigHandler.SmoothEndStone) {
			smooth_endstone = new SmoothEndStone();
			registerBlock(smooth_endstone, "smooth_endstone", true);
			
			Recipes.addShapedRecipe("smooth_endstone", new ItemStack(smooth_endstone, 4), new Object[] {
					"ee",
					"ee",
						Character.valueOf('e'), Blocks.END_STONE
			});
			
			Recipes.addShapedRecipe("end_bricks", new ItemStack(Blocks.END_BRICKS, 4), new Object[] {
					"ee",
					"ee",
						Character.valueOf('e'), "smoothEndstone"
			});
		}

		// Ender Ore
		if (ConfigHandler.ender_ore) {
			ender_ore = new EnderOre();
			registerBlock(ender_ore, "ender_ore", true);
		}
		if (ConfigHandler.lava_ore) {
			lava_ore = new LavaOre();
			registerBlock(lava_ore, "lava_ore", true);
		}
		
		Recipes.addShapedRecipe("flint", new ItemStack(Items.FLINT), new Object[] {
				"gg ",
				"g  ",
					Character.valueOf('g'), "blockGravel"
		});
	}

	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		Iterator<Block> b = blocks.iterator();

		while (b.hasNext()) {
			event.getRegistry().register(b.next());
		}
	}

	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		Iterator<ItemBlock> ib = itemblocks.iterator();

		while (ib.hasNext()) {
			event.getRegistry().register(ib.next());
		}
	}

	public static void registerBlock(Block block, String name, boolean itemblock) {
		block.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + name));
		blocks.add(block);

		if (itemblock) {
			itemblocks.add((ItemBlock) new ItemBlock(block).setRegistryName(block.getRegistryName()));
		}
	}

}
