package com.kashdeya.tinyprogressions.inits;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.blocks.AndesiteBrick;
import com.kashdeya.tinyprogressions.blocks.BlazeCobblegen;
import com.kashdeya.tinyprogressions.blocks.BlockGrowth;
import com.kashdeya.tinyprogressions.blocks.BlockGrowthUpgrade;
import com.kashdeya.tinyprogressions.blocks.BlockGrowthUpgradeTwo;
import com.kashdeya.tinyprogressions.blocks.BoneBlock;
import com.kashdeya.tinyprogressions.blocks.CharcoalBlock;
import com.kashdeya.tinyprogressions.blocks.Cobblegen;
import com.kashdeya.tinyprogressions.blocks.DiamondCobblegen;
import com.kashdeya.tinyprogressions.blocks.DioriteBrick;
import com.kashdeya.tinyprogressions.blocks.DirtyGlass;
import com.kashdeya.tinyprogressions.blocks.EmeraldCobblegen;
import com.kashdeya.tinyprogressions.blocks.EnderOre;
import com.kashdeya.tinyprogressions.blocks.FleshBlock;
import com.kashdeya.tinyprogressions.blocks.FlintBlock;
import com.kashdeya.tinyprogressions.blocks.GraniteBrick;
import com.kashdeya.tinyprogressions.blocks.IronCobblegen;
import com.kashdeya.tinyprogressions.blocks.NetherStarBlock;
import com.kashdeya.tinyprogressions.blocks.ReinforcedGlass;
import com.kashdeya.tinyprogressions.blocks.ReinforcedObsidian;
import com.kashdeya.tinyprogressions.blocks.SmoothEndStone;
import com.kashdeya.tinyprogressions.blocks.StoneTorch;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.Reference;

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
	}
	
	public static void registerBlock(Block block, String name, boolean itemblock){
		GameRegistry.register(block, new ResourceLocation(Reference.MOD_ID + ":" + name));
		if (itemblock){
			GameRegistry.register(new ItemBlock(block), new ResourceLocation(Reference.MOD_ID + ":" + name));
		}
	}

}
