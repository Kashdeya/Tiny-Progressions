package com.kashdeya.tinyprogressions.inits;

import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.blocks.DirtyGlass;
import com.kashdeya.tinyprogressions.blocks.EnderOre;
import com.kashdeya.tinyprogressions.blocks.LavaOre;
import com.kashdeya.tinyprogressions.blocks.Slabs;
import com.kashdeya.tinyprogressions.blocks.Stairs;
import com.kashdeya.tinyprogressions.blocks.StandardBlock;
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
import com.kashdeya.tinyprogressions.blocks.decorations.HardenedBlocks;
import com.kashdeya.tinyprogressions.blocks.decorations.LampBase;
import com.kashdeya.tinyprogressions.blocks.decorations.OldReed;
import com.kashdeya.tinyprogressions.blocks.decorations.SmoothEndStone;
import com.kashdeya.tinyprogressions.blocks.decorations.StoneTorch;
import com.kashdeya.tinyprogressions.blocks.glowstone.Black;
import com.kashdeya.tinyprogressions.blocks.glowstone.Blue;
import com.kashdeya.tinyprogressions.blocks.glowstone.Brown;
import com.kashdeya.tinyprogressions.blocks.glowstone.Cyan;
import com.kashdeya.tinyprogressions.blocks.glowstone.Gray;
import com.kashdeya.tinyprogressions.blocks.glowstone.Green;
import com.kashdeya.tinyprogressions.blocks.glowstone.LightBlue;
import com.kashdeya.tinyprogressions.blocks.glowstone.Lime;
import com.kashdeya.tinyprogressions.blocks.glowstone.Magneta;
import com.kashdeya.tinyprogressions.blocks.glowstone.Orange;
import com.kashdeya.tinyprogressions.blocks.glowstone.Pink;
import com.kashdeya.tinyprogressions.blocks.glowstone.Purple;
import com.kashdeya.tinyprogressions.blocks.glowstone.Red;
import com.kashdeya.tinyprogressions.blocks.glowstone.Silver;
import com.kashdeya.tinyprogressions.blocks.glowstone.White;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowth;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowthUpgrade;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowthUpgradeTwo;
import com.kashdeya.tinyprogressions.blocks.reinforced.ReinforcedGlass;
import com.kashdeya.tinyprogressions.blocks.reinforced.ReinforcedObsidian;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.block.AngelItemBlock;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
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
	public static Block old_reed;
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
	// Hardened Stone
	public static Block hardened_stone;
	public static Block hardened_stone_bricks;
	public static Block hardened_stone_smallbricks;
	
	public static Block hardened_stone_stairs;
	public static Block hardened_stone_bricks_stairs;
	public static Block hardened_stone_smallbricks_stairs;
	
	public static Block hardened_stone_slab_half;
	public static Block hardened_stone_slab_double;
	
	public static Block hardened_stone_bricks_slab_half;
	public static Block hardened_stone_bricks_slab_double;
	
	public static Block hardened_stone_smallbricks_slab_half;
    public static Block hardened_stone_smallbricks_slab_double;
    // Angel
    public static Block fmf_block;
    // Lamp Blocks
 	public static Block black_lamp;
 	public static Block blue_lamp;
 	public static Block brown_lamp;
 	public static Block cyan_lamp;
 	public static Block green_lamp;
 	public static Block gray_lamp;
 	public static Block lightblue_lamp;
 	public static Block lime_lamp;
 	public static Block magenta_lamp;
 	public static Block orange_lamp;
 	public static Block pink_lamp;
 	public static Block purple_lamp;
 	public static Block red_lamp;
 	public static Block silver_lamp;
 	public static Block white_lamp;
 	public static Block yellow_lamp;
 	public static Block base_lamp;
	// Glowstone Blocks
	public static Block black_glowstone;
	public static Block blue_glowstone;
	public static Block brown_glowstone;
	public static Block cyan_glowstone;
	public static Block green_glowstone;
	public static Block gray_glowstone;
	public static Block lightblue_glowstone;
	public static Block lime_glowstone;
	public static Block magenta_glowstone;
	public static Block orange_glowstone;
	public static Block pink_glowstone;
	public static Block purple_glowstone;
	public static Block red_glowstone;
	public static Block silver_glowstone;
	public static Block white_glowstone;
    
	public static void init() {

		// Tech Blocks
		if (ConfigHandler.BlockGrowth) {
			growth_block = new BlockGrowth();
			registerBlock(growth_block, "growth_block", true);
		}
		if (ConfigHandler.BlockGrowthUpgrade) {
			growth_upgrade = new BlockGrowthUpgrade();
			registerBlock(growth_upgrade, "growth_upgrade", true);
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo) {
			growth_upgrade_two = new BlockGrowthUpgradeTwo();
			registerBlock(growth_upgrade_two, "growth_upgrade_two", true);
		}
		if (ConfigHandler.Cobblegen) {
			cobblegen_block = new Cobblegen();
			registerBlock(cobblegen_block, "cobblegen_block", true);
		}
		if (ConfigHandler.IronCobblegen) {
			iron_cobblegen_block = new IronCobblegen();
			registerBlock(iron_cobblegen_block, "iron_cobblegen_block", true);
		}
		if (ConfigHandler.DiamondCobblegen) {
			diamond_cobblegen_block = new DiamondCobblegen();
			registerBlock(diamond_cobblegen_block, "diamond_cobblegen_block", true);
		}
		if (ConfigHandler.BlazeCobblegen) {
			blaze_cobblegen_block = new BlazeCobblegen();
			registerBlock(blaze_cobblegen_block, "blaze_cobblegen_block", true);
		}
		if (ConfigHandler.EmeraldCobblegen) {
			emerald_cobblegen_block = new EmeraldCobblegen();
			registerBlock(emerald_cobblegen_block, "emerald_cobblegen_block", true);
		}

		// Deco Blocks
		if (ConfigHandler.StoneTorch) {
			stone_torch = new StoneTorch();
			registerBlock(stone_torch, "stone_torch", true);
		}
		if (ConfigHandler.CharcoalBlock) {
			charcoal_block = new CharcoalBlock();
			registerBlock(charcoal_block, "charcoal_block", true);
		}
		if (ConfigHandler.ReinforcedGlass) {
			reinforced_glass = new ReinforcedGlass();
			registerBlock(reinforced_glass, "reinforced_glass", true);
		}
		if (ConfigHandler.ReinforcedObsidian) {
			reinforced_obsidian = new ReinforcedObsidian();
			registerBlock(reinforced_obsidian, "reinforced_obsidian", true);
		}
		if (ConfigHandler.DirtyGlass) {
			dirty_glass = new DirtyGlass();
			registerBlock(dirty_glass, "dirty_glass", true);
		}
		if (ConfigHandler.hardened_stone) {
			hardened_stone = new HardenedBlocks("hardened_stone", Material.ROCK, TechBlocks.hardened_stone, 1, 1);
			registerBlock(hardened_stone, "hardened_stone", true);
			hardened_stone_bricks = new HardenedBlocks("hardened_stone_bricks", Material.ROCK, TechBlocks.hardened_stone, 1, 1);
			registerBlock(hardened_stone_bricks, "hardened_stone_bricks", true);
			hardened_stone_smallbricks = new HardenedBlocks("hardened_stone_smallbricks", Material.ROCK, TechBlocks.hardened_stone, 1, 1);
			registerBlock(hardened_stone_smallbricks, "hardened_stone_smallbricks", true);
			
			hardened_stone_stairs = new Stairs(hardened_stone).setUnlocalizedName("hardened_stone_stairs");
			registerBlock(hardened_stone_stairs, "hardened_stone_stairs", true);
			
            hardened_stone_bricks_stairs = new Stairs(hardened_stone_bricks).setUnlocalizedName("hardened_stone_bricks_stairs");
            registerBlock(hardened_stone_bricks_stairs, "hardened_stone_bricks_stairs", true);
            
            hardened_stone_smallbricks_stairs = new Stairs(hardened_stone_smallbricks).setUnlocalizedName("hardened_stone_smallbricks_stairs");
            registerBlock(hardened_stone_smallbricks_stairs, "hardened_stone_smallbricks_stairs", true);
            
            hardened_stone_slab_half = new Slabs(false).setUnlocalizedName("hardened_stone_slab_half");
            hardened_stone_slab_double = new Slabs(true).setDropped(hardened_stone_slab_half).setUnlocalizedName("hardened_stone_slab_double");
            registerBlock(hardened_stone_slab_half, "hardened_stone_slab_half", new ItemSlab(hardened_stone_slab_half, (BlockSlab)hardened_stone_slab_half, (BlockSlab)hardened_stone_slab_double));
            registerBlock(hardened_stone_slab_double, "hardened_stone_slab_double", true);
            
            hardened_stone_bricks_slab_half = new Slabs(false).setUnlocalizedName("hardened_stone_bricks_slab_half");
            hardened_stone_bricks_slab_double = new Slabs(true).setDropped(hardened_stone_bricks_slab_half).setUnlocalizedName("hardened_stone_bricks_slab_double");
            registerBlock(hardened_stone_bricks_slab_half, "hardened_stone_bricks_slab_half", new ItemSlab(hardened_stone_bricks_slab_half, (BlockSlab)hardened_stone_bricks_slab_half, (BlockSlab)hardened_stone_bricks_slab_double));
            registerBlock(hardened_stone_bricks_slab_double, "hardened_stone_bricks_slab_double", true);
            
            hardened_stone_smallbricks_slab_half = new Slabs(false).setUnlocalizedName("hardened_stone_smallbricks_slab_half");
            hardened_stone_smallbricks_slab_double = new Slabs(true).setDropped(hardened_stone_smallbricks_slab_half).setUnlocalizedName("hardened_stone_smallbricks_slab_double");
            registerBlock(hardened_stone_smallbricks_slab_half, "hardened_stone_smallbricks_slab_half", new ItemSlab(hardened_stone_smallbricks_slab_half, (BlockSlab)hardened_stone_smallbricks_slab_half, (BlockSlab)hardened_stone_smallbricks_slab_double));
            registerBlock(hardened_stone_smallbricks_slab_double, "hardened_stone_smallbricks_slab_double", true);
		}
		if (ConfigHandler.old_reed) {
			old_reed = new OldReed();
			registerBlock(old_reed, "old_reed", true);
		}
		// Lamps
		if (ConfigHandler.ColorLamps){
			base_lamp = new LampBase("base_lamp", Material.GLASS, TechBlocks.base_lamp, 1, 1);
			registerBlock(base_lamp, "base_lamp", true);
			black_lamp = new LampBase("black_lamp", Material.GLASS, TechBlocks.black_lamp, 1, 1);
			registerBlock(black_lamp, "black_lamp", true);
			blue_lamp = new LampBase("blue_lamp", Material.GLASS, TechBlocks.blue_lamp, 1, 1);
			registerBlock(blue_lamp, "blue_lamp", true);
			brown_lamp = new LampBase("brown_lamp", Material.GLASS, TechBlocks.brown_lamp, 1, 1);
			registerBlock(brown_lamp, "brown_lamp", true);
			cyan_lamp = new LampBase("cyan_lamp", Material.GLASS, TechBlocks.cyan_lamp, 1, 1);
			registerBlock(cyan_lamp, "cyan_lamp", true);
			green_lamp = new LampBase("green_lamp", Material.GLASS, TechBlocks.green_lamp, 1, 1);
			registerBlock(green_lamp, "green_lamp", true);
			gray_lamp = new LampBase("gray_lamp", Material.GLASS, TechBlocks.gray_lamp, 1, 1);
			registerBlock(gray_lamp, "gray_lamp", true);
			lightblue_lamp = new LampBase("lightblue_lamp", Material.GLASS, TechBlocks.lightblue_lamp, 1, 1);
			registerBlock(lightblue_lamp, "lightblue_lamp", true);
			lime_lamp = new LampBase("lime_lamp", Material.GLASS, TechBlocks.lime_lamp, 1, 1);
			registerBlock(lime_lamp, "lime_lamp", true);
			magenta_lamp = new LampBase("magenta_lamp", Material.GLASS, TechBlocks.magenta_lamp, 1, 1);
			registerBlock(magenta_lamp, "magenta_lamp", true);
			orange_lamp = new LampBase("orange_lamp", Material.GLASS, TechBlocks.orange_lamp, 1, 1);
			registerBlock(orange_lamp, "orange_lamp", true);
			pink_lamp = new LampBase("pink_lamp", Material.GLASS, TechBlocks.pink_lamp, 1, 1);
			registerBlock(pink_lamp, "pink_lamp", true);
			purple_lamp = new LampBase("purple_lamp", Material.GLASS, TechBlocks.purple_lamp, 1, 1);
			registerBlock(purple_lamp, "purple_lamp", true);
			red_lamp = new LampBase("red_lamp", Material.GLASS, TechBlocks.red_lamp, 1, 1);
			registerBlock(red_lamp, "red_lamp", true);
			silver_lamp = new LampBase("silver_lamp", Material.GLASS, TechBlocks.silver_lamp, 1, 1);
			registerBlock(silver_lamp, "silver_lamp", true);
			white_lamp = new LampBase("white_lamp", Material.GLASS, TechBlocks.white_lamp, 1, 1);
			registerBlock(white_lamp, "white_lamp", true);
			yellow_lamp = new LampBase("yellow_lamp", Material.GLASS, TechBlocks.yellow_lamp, 1, 1);
			registerBlock(yellow_lamp, "yellow_lamp", true);
		}
		// Glowstone
		if (ConfigHandler.ColorGlowstone){
			black_glowstone = new Black();
			registerBlock(black_glowstone, "black_glowstone", true);
			blue_glowstone = new Blue();
			registerBlock(blue_glowstone, "blue_glowstone", true);
			brown_glowstone = new Brown();
			registerBlock(brown_glowstone, "brown_glowstone", true);
			cyan_glowstone = new Cyan();
			registerBlock(cyan_glowstone, "cyan_glowstone", true);
			green_glowstone = new Green();
			registerBlock(green_glowstone, "green_glowstone", true);
			gray_glowstone = new Gray();
			registerBlock(gray_glowstone, "gray_glowstone", true);
			lightblue_glowstone = new LightBlue();
			registerBlock(lightblue_glowstone, "lightblue_glowstone", true);
			lime_glowstone = new Lime();
			registerBlock(lime_glowstone, "lime_glowstone", true);
			magenta_glowstone = new Magneta();
			registerBlock(magenta_glowstone, "magenta_glowstone", true);
			orange_glowstone = new Orange();
			registerBlock(orange_glowstone, "orange_glowstone", true);
			pink_glowstone = new Pink();
			registerBlock(pink_glowstone, "pink_glowstone", true);
			purple_glowstone = new Purple();
			registerBlock(purple_glowstone, "purple_glowstone", true);
			red_glowstone = new Red();
			registerBlock(red_glowstone, "red_glowstone", true);
			silver_glowstone = new Silver();
			registerBlock(silver_glowstone, "silver_glowstone", true);
			white_glowstone = new White();
			registerBlock(white_glowstone, "white_glowstone", true);
		}
		

		// Compressed Blocks
		if (ConfigHandler.FleshBlock) {
			flesh_block = new FleshBlock();
			registerBlock(flesh_block, "flesh_block", true);
		}
		if (ConfigHandler.BoneBlock) {
			bone_block = new BoneBlock();
			registerBlock(bone_block, "bone_block", true);
		}
		if (ConfigHandler.NetherStarBlock) {
			netherstar_block = new NetherStarBlock();
			registerBlock(netherstar_block, "netherstar_block", true);
		}
		if (ConfigHandler.DioriteBrick) {
			diorite_brick = new DioriteBrick();
			registerBlock(diorite_brick, "diorite_brick", true);
		}
		if (ConfigHandler.GraniteBrick) {
			granite_brick = new GraniteBrick();
			registerBlock(granite_brick, "granite_brick", true);
		}
		if (ConfigHandler.AndesiteBrick) {
			andesite_brick = new AndesiteBrick();
			registerBlock(andesite_brick, "andesite_brick", true);
		}

		// Flint Block
		if (ConfigHandler.FlintBlock) {
			flint_block = new FlintBlock();
			registerBlock(flint_block, "flint_block", true);
		}

		// Smooth EndStone
		if (ConfigHandler.SmoothEndStone) {
			smooth_endstone = new SmoothEndStone();
			registerBlock(smooth_endstone, "smooth_endstone", true);
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
		
		if(ConfigHandler.angel_block) {
			fmf_block = new StandardBlock(Material.ROCK).setUnlocalName("fmf_block")
					.setSound(SoundType.STONE).setHarvestLvl("pickaxe", 0).setHardness(25F).setResistance(1000F);
			registerBlock(fmf_block, "fmf_block", new AngelItemBlock(fmf_block));
		}
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
	    registerBlock(block, name, itemblock ? new ItemBlock(block) : null);
	}
	
	public static void registerBlock(Block block, String name, ItemBlock itemblock) {
        block.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + name));
        blocks.add(block);

        if (itemblock != null) {
            itemblock.setRegistryName(block.getRegistryName());
            itemblocks.add(itemblock);
        }
    }

}
