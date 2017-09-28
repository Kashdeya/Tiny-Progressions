package com.kashdeya.tinyprogressions.inits;

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
import com.kashdeya.tinyprogressions.blocks.decorations.DirtyGlass;
import com.kashdeya.tinyprogressions.blocks.decorations.GlowstoneColored;
import com.kashdeya.tinyprogressions.blocks.decorations.GraniteBrick;
import com.kashdeya.tinyprogressions.blocks.decorations.HardenedBlocks;
import com.kashdeya.tinyprogressions.blocks.decorations.Lamp;
import com.kashdeya.tinyprogressions.blocks.decorations.LampColored;
import com.kashdeya.tinyprogressions.blocks.decorations.LavaBlock;
import com.kashdeya.tinyprogressions.blocks.decorations.OldReed;
import com.kashdeya.tinyprogressions.blocks.decorations.Slabs;
import com.kashdeya.tinyprogressions.blocks.decorations.SmoothEndStone;
import com.kashdeya.tinyprogressions.blocks.decorations.Stairs;
import com.kashdeya.tinyprogressions.blocks.decorations.StoneTorch;
import com.kashdeya.tinyprogressions.blocks.decorations.WaterBlock;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowth;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowthUpgrade;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowthUpgradeTwo;
import com.kashdeya.tinyprogressions.blocks.ores.EnderOre;
import com.kashdeya.tinyprogressions.blocks.ores.LavaOre;
import com.kashdeya.tinyprogressions.blocks.reinforced.ReinforcedGlass;
import com.kashdeya.tinyprogressions.blocks.reinforced.ReinforcedObsidian;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthRenderer;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeRenderer;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeTwoRenderer;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.block.AngelItemBlock;
import com.kashdeya.tinyprogressions.items.block.MetaItemBlock;
import com.kashdeya.tinyprogressions.main.Reference;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.properties.EnumGlowstoneColor;
import com.kashdeya.tinyprogressions.properties.EnumLampColor;
import com.kashdeya.tinyprogressions.tiles.TileEntityBlazeCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityDiamondCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityEmeraldCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowth;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgrade;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgradeTwo;
import com.kashdeya.tinyprogressions.tiles.TileEntityIronCobblegen;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;

public class TechBlocks {
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
	// Lava Blocks
	public static Block lava_ore;
	public static Block lava_block;
	// Water Block
	public static Block water_block;
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
    public static Block lamp;
    public static Block colored_lamp;
	// Glowstone Blocks
    public static Block colored_glowstone;
    // Life Force
    public static Block spirit_ore;
    public static Block spirit_torch;
    
	public static void init() {

		// Tech Blocks
		if (ConfigHandler.BlockGrowth) {
			growth_block = new BlockGrowth();
			registerBlock(growth_block, "growth_block", true);
			
			TinyProgressions.REGISTRY.register(TileEntityGrowth.class, "tileEntityGrowth");
			TinyProgressions.REGISTRY.render(TileEntityGrowth.class, new TileEntityGrowthRenderer());
		}
		if (ConfigHandler.BlockGrowthUpgrade) {
			growth_upgrade = new BlockGrowthUpgrade();
			registerBlock(growth_upgrade, "growth_upgrade", true);
			
			TinyProgressions.REGISTRY.register(TileEntityGrowthUpgrade.class, "tileEntityGrowthUpgrade");
		    TinyProgressions.REGISTRY.render(TileEntityGrowthUpgrade.class, new TileEntityGrowthUpgradeRenderer());
		    TinyProgressions.REGISTRY.setCustomStateMap(growth_upgrade, new StateMap.Builder().ignore(new IProperty[] { BlockLiquid.LEVEL }).build());
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo) {
			growth_upgrade_two = new BlockGrowthUpgradeTwo();
			registerBlock(growth_upgrade_two, "growth_upgrade_two", true);
			
			TinyProgressions.REGISTRY.register(TileEntityGrowthUpgradeTwo.class, "tileEntityGrowthUpgradeTwo");
			TinyProgressions.REGISTRY.render(TileEntityGrowthUpgradeTwo.class, new TileEntityGrowthUpgradeTwoRenderer());
			TinyProgressions.REGISTRY.setCustomStateMap(growth_upgrade_two, new StateMap.Builder().ignore(new IProperty[] { BlockLiquid.LEVEL }).build());
		}
		if (ConfigHandler.Cobblegen) {
			cobblegen_block = new Cobblegen();
			registerBlock(cobblegen_block, "cobblegen_block", true);
			
			TinyProgressions.REGISTRY.register(TileEntityCobblegen.class, "tileEntityCobblegen");
		}
		if (ConfigHandler.IronCobblegen) {
			iron_cobblegen_block = new IronCobblegen();
			registerBlock(iron_cobblegen_block, "iron_cobblegen_block", true);
			
			TinyProgressions.REGISTRY.register(TileEntityIronCobblegen.class, "tileEntityIronCobblegen");
		}
		if (ConfigHandler.DiamondCobblegen) {
			diamond_cobblegen_block = new DiamondCobblegen();
			registerBlock(diamond_cobblegen_block, "diamond_cobblegen_block", true);
			
			TinyProgressions.REGISTRY.register(TileEntityDiamondCobblegen.class, "tileEntityDiamondCobblegen");
		}
		if (ConfigHandler.BlazeCobblegen) {
			blaze_cobblegen_block = new BlazeCobblegen();
			registerBlock(blaze_cobblegen_block, "blaze_cobblegen_block", true);
			
			TinyProgressions.REGISTRY.register(TileEntityBlazeCobblegen.class, "tileEntityBlazeCobblegen");
		}
		if (ConfigHandler.EmeraldCobblegen) {
			emerald_cobblegen_block = new EmeraldCobblegen();
			registerBlock(emerald_cobblegen_block, "emerald_cobblegen_block", true);
			
			TinyProgressions.REGISTRY.register(TileEntityEmeraldCobblegen.class, "tileEntityEmeraldCobblegen");
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
			lamp = new Lamp().setUnlocalizedName("lamp");
			registerBlock(lamp, "lamp", true);
			
			colored_lamp = new LampColored();
			registerBlock(colored_lamp, "colored_lamp", new MetaItemBlock(colored_lamp));
			
			for(int i = 0; i < EnumLampColor.values().length; i++)
				TinyProgressions.REGISTRY.render(colored_lamp, i, EnumLampColor.values()[i].getName());
		}
		// Glowstone
		if (ConfigHandler.ColorGlowstone){
			colored_glowstone = new GlowstoneColored();
			registerBlock(colored_glowstone, "colored_glowstone", new MetaItemBlock(colored_glowstone));
			
			for(int i = 0; i < EnumGlowstoneColor.values().length; i++)
				TinyProgressions.REGISTRY.render(colored_glowstone, i, EnumGlowstoneColor.values()[i].getName());
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

		// Ore
		if (ConfigHandler.ender_ore) {
			ender_ore = new EnderOre();
			registerBlock(ender_ore, "ender_ore", true);
		}
		if (ConfigHandler.lava_ore) {
			lava_ore = new LavaOre();
			registerBlock(lava_ore, "lava_ore", true);
		}
		
		// FMF Block
		if(ConfigHandler.angel_block) {
			fmf_block = new StandardBlock(Material.ROCK).setUnlocalName("fmf_block")
					.setSound(SoundType.STONE).setHarvestLvl("pickaxe", 0).setHardness(25F).setResistance(1000F);
			registerBlock(fmf_block, "fmf_block", new AngelItemBlock(fmf_block));
		}
		
		// Lava & Water Blocks
		if (ConfigHandler.lava_block) {
			lava_block = new LavaBlock();
			registerBlock(lava_block, "lava_block", true);
		}
		if (ConfigHandler.water_block) {
			water_block = new WaterBlock();
			registerBlock(water_block, "water_block", true);
		}
		
		/*
		// Spirit Ore
		if (ConfigHandler.spirit_ore) {
			spirit_ore = new SpiritOre();
			registerBlock(spirit_ore, "spirit_ore", true);
			
			spirit_torch = new SpiritTorch();
			registerBlock(spirit_torch, "spirit_torch", true);
		}
		*/
	}

	public static void registerBlock(Block block, String name, boolean itemblock) {
	    registerBlock(block, name, itemblock ? new ItemBlock(block) : null);
	}
	
	public static void registerBlock(Block block, String name, ItemBlock itemblock) {
        block.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + name));
        TinyProgressions.REGISTRY.register(block);
		TinyProgressions.REGISTRY.render(block);

        if (itemblock != null) {
            itemblock.setRegistryName(block.getRegistryName());
            TinyProgressions.REGISTRY.register(itemblock);
        }
    }

}
