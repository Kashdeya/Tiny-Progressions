package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.blocks.DirtyGlass;
import com.kashdeya.tinyprogressions.blocks.EnderOre;
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
import com.kashdeya.tinyprogressions.blocks.decorations.WitheredBlock;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowth;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowthUpgrade;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowthUpgradeTwo;
import com.kashdeya.tinyprogressions.blocks.reinforced.ReinforcedGlass;
import com.kashdeya.tinyprogressions.blocks.reinforced.ReinforcedObsidian;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
	// WitherBlock
	public static Block withered_block;
	
	public static void init(){
		
		// Tech Blocks
		if (ConfigHandler.BlockGrowth){
			growth_block = new BlockGrowth();
			registerBlock(growth_block, "growth_block", true);
		}
		if (ConfigHandler.BlockGrowthUpgrade){
			growth_upgrade = new BlockGrowthUpgrade();
			registerBlock(growth_upgrade, "growth_upgrade", true);
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo){
			growth_upgrade_two = new BlockGrowthUpgradeTwo();
			registerBlock(growth_upgrade_two, "growth_upgrade_two", true);
		}
		if (ConfigHandler.Cobblegen){
			cobblegen_block = new Cobblegen();
			registerBlock(cobblegen_block, "cobblegen_block", true);
		}
		if (ConfigHandler.IronCobblegen){
			iron_cobblegen_block = new IronCobblegen();
			registerBlock(iron_cobblegen_block, "iron_cobblegen_block", true);
		}
		if (ConfigHandler.DiamondCobblegen){
			diamond_cobblegen_block = new DiamondCobblegen();
			registerBlock(diamond_cobblegen_block, "diamond_cobblegen_block", true);
		}
		if (ConfigHandler.BlazeCobblegen){
			blaze_cobblegen_block = new BlazeCobblegen();
			registerBlock(blaze_cobblegen_block, "blaze_cobblegen_block", true);
		}
		if (ConfigHandler.EmeraldCobblegen){
			emerald_cobblegen_block = new EmeraldCobblegen();
			registerBlock(emerald_cobblegen_block, "emerald_cobblegen_block", true);
		}
		
		// Deco Blocks
		if (ConfigHandler.StoneTorch){
			stone_torch = new StoneTorch();
	    	registerBlock(stone_torch, "stone_torch", true);
	    }
		if (ConfigHandler.CharcoalBlock){
			charcoal_block = new CharcoalBlock();
			registerBlock(charcoal_block, "charcoal_block", true);
		}
		if (ConfigHandler.ReinforcedGlass){
			reinforced_glass = new ReinforcedGlass();
			registerBlock(reinforced_glass, "reinforced_glass", true);
		}
		if (ConfigHandler.ReinforcedObsidian){
			reinforced_obsidian = new ReinforcedObsidian();
			registerBlock(reinforced_obsidian, "reinforced_obsidian", true);
		}
		if (ConfigHandler.DirtyGlass){
			dirty_glass = new DirtyGlass();
			registerBlock(dirty_glass, "dirty_glass", true);
		}
		
		// Compressed Blocks
		if (ConfigHandler.FleshBlock){
			flesh_block = new FleshBlock();
			registerBlock(flesh_block, "flesh_block", true);
		}
		if (ConfigHandler.BoneBlock){
			bone_block = new BoneBlock();
			registerBlock(bone_block, "bone_block", true);
		}
		if (ConfigHandler.NetherStarBlock){
			netherstar_block = new NetherStarBlock();
			registerBlock(netherstar_block, "netherstar_block", true);
		}
		if (ConfigHandler.DioriteBrick){
			diorite_brick = new DioriteBrick();
			registerBlock(diorite_brick, "diorite_brick", true);
		}
		if (ConfigHandler.GraniteBrick){
			granite_brick = new GraniteBrick();
			registerBlock(granite_brick, "granite_brick", true);
		}
		if (ConfigHandler.AndesiteBrick){
			andesite_brick = new AndesiteBrick();
			registerBlock(andesite_brick, "andesite_brick", true);
		}
		
		// Flint Block
		if (ConfigHandler.FlintBlock){
			flint_block = new FlintBlock();
			registerBlock(flint_block, "flint_block", true);
		}
		
		// Smooth EndStone
		if (ConfigHandler.SmoothEndStone){
			smooth_endstone = new SmoothEndStone();
			registerBlock(smooth_endstone, "smooth_endstone", true);
		}
		
		// Ender Ore
		if (ConfigHandler.ender_ore){
			ender_ore = new EnderOre();
			registerBlock(ender_ore, "ender_ore", true);
		}
		
		// Withered Block
		if (ConfigHandler.WitheredBlock){
			withered_block = new WitheredBlock();
			registerBlock(withered_block, "withered_block", true);
		}
	}
	
	public static void registerBlock(Block block, String name, boolean itemblock){
		GameRegistry.register(block, new ResourceLocation(Reference.MOD_ID + ":" + name));
		if (itemblock){
			GameRegistry.register(new ItemBlock(block), new ResourceLocation(Reference.MOD_ID + ":" + name));
		}
	}

}
