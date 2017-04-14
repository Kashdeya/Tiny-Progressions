package com.kashdeya.tinyprogressions.inits;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.blocks.StoneTorch;
import com.kashdeya.tinyprogressions.blocks.bricks.AndesiteBrick;
import com.kashdeya.tinyprogressions.blocks.bricks.DioriteBrick;
import com.kashdeya.tinyprogressions.blocks.bricks.GraniteBrick;
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
import com.kashdeya.tinyprogressions.blocks.growth.BlockGrowth;
import com.kashdeya.tinyprogressions.blocks.growth.BlockGrowthUpgrade;
import com.kashdeya.tinyprogressions.blocks.growth.BlockGrowthUpgradeTwo;
import com.kashdeya.tinyprogressions.blocks.integration.AntimatterBlock;
import com.kashdeya.tinyprogressions.blocks.integration.BloodBlock;
import com.kashdeya.tinyprogressions.blocks.integration.CoraliumBlock;
import com.kashdeya.tinyprogressions.blocks.integration.MoltendirtBlock;
import com.kashdeya.tinyprogressions.blocks.misc.AmethystBlock;
import com.kashdeya.tinyprogressions.blocks.misc.BrokenReed;
import com.kashdeya.tinyprogressions.blocks.misc.CryingObsidian;
import com.kashdeya.tinyprogressions.blocks.misc.DirtyGlass;
import com.kashdeya.tinyprogressions.blocks.misc.LampBase;
import com.kashdeya.tinyprogressions.blocks.misc.LavaBlock;
import com.kashdeya.tinyprogressions.blocks.misc.LitRedstone;
import com.kashdeya.tinyprogressions.blocks.misc.RubyBlock;
import com.kashdeya.tinyprogressions.blocks.misc.SapphireBlock;
import com.kashdeya.tinyprogressions.blocks.misc.SmoothEndStone;
import com.kashdeya.tinyprogressions.blocks.misc.WaterBlock;
import com.kashdeya.tinyprogressions.blocks.ores.AmethystOre;
import com.kashdeya.tinyprogressions.blocks.ores.EnderOre;
import com.kashdeya.tinyprogressions.blocks.ores.LavaCrystalOre;
import com.kashdeya.tinyprogressions.blocks.ores.RubyOre;
import com.kashdeya.tinyprogressions.blocks.ores.SapphireOre;
import com.kashdeya.tinyprogressions.blocks.reinforced.ReinforcedGlass;
import com.kashdeya.tinyprogressions.blocks.reinforced.ReinforcedObsidian;
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
	public static Block lit_redstone_lamp;
	public static Block lava_block;
	public static Block nether_lava_block;
	public static Block lava_crystal_ore;
	public static Block water_block;
	public static Block broken_reed;
	public static Block sapphire_block;
	public static Block ruby_block;
	public static Block amethyst_block;
	public static Block crying_obsidian;
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
	// Integration Blocks
	public static Block antimatter_block;
	public static Block blood_block;
	public static Block coralium_block;
	public static Block moltendirt_block;
	public static Block moltendirt_nether_block;
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
	// Metals
	public static Block sapphire_ore;
	public static Block ruby_ore;
	public static Block amethyst_ore;
	
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
		if (ConfigHandler.LavaArmor){
			lava_crystal_ore = new LavaCrystalOre();
			registerBlock(lava_crystal_ore, "lava_crystal_ore", true);
		}
		if (ConfigHandler.LavaBlock){
			lava_block = new LavaBlock().setUnlocalizedName("lava_block");
			registerBlock(lava_block, "lava_block", true);
		}
		if (ConfigHandler.NetherLavaBlock){
			nether_lava_block = new LavaBlock().setUnlocalizedName("nether_lava_block");
			registerBlock(nether_lava_block, "nether_lava_block", true);
		}
		if (ConfigHandler.WaterBlock){
			water_block = new WaterBlock();
			registerBlock(water_block, "water_block", true);
		}
		if (ConfigHandler.LitRedstoneLamp){
			lit_redstone_lamp = new LitRedstone();
			registerBlock(lit_redstone_lamp, "lit_redstone_lamp", true);
		}
		if (ConfigHandler.CryingObsidian){
			crying_obsidian = new CryingObsidian();
			registerBlock(crying_obsidian, "crying_obsidian", true);
		}
		if (ConfigHandler.BrokenReed){
			broken_reed = new BrokenReed();
			registerBlock(broken_reed, "broken_reed", true);
		}
		if (ConfigHandler.AntimatterBlock){
			antimatter_block = new AntimatterBlock();
			registerBlock(antimatter_block, "antimatter_block", true);
		}
		if (ConfigHandler.BloodBlock){
			blood_block = new BloodBlock();
			registerBlock(blood_block, "blood_block", true);
		}
		if (ConfigHandler.CoraliumBlock){
			coralium_block = new CoraliumBlock();
			registerBlock(coralium_block, "coralium_block", true);
		}
		if (ConfigHandler.MoltenDirtBlock){
			moltendirt_block = new MoltendirtBlock().setUnlocalizedName("moltendirt_block");
			registerBlock(moltendirt_block, "moltendirt_block", true);
		}
		if (ConfigHandler.MoltenDirtNetherBlock){
			moltendirt_nether_block = new MoltendirtBlock().setUnlocalizedName("moltendirt_nether_block");
			registerBlock(moltendirt_nether_block, "moltendirt_nether_block", true);
		}
		if (ConfigHandler.SapphireOre){
			sapphire_ore = new SapphireOre();
			registerBlock(sapphire_ore, "sapphire_ore", true);
			sapphire_block = new SapphireBlock();
			registerBlock(sapphire_block, "sapphire_block", true);
		}
		if (ConfigHandler.RubyOre){
			ruby_ore = new RubyOre();
			registerBlock(ruby_ore, "ruby_ore", true);
			ruby_block = new RubyBlock();
			registerBlock(ruby_block, "ruby_block", true);
		}
		if (ConfigHandler.AmethystOre){
			amethyst_ore = new AmethystOre();
			registerBlock(amethyst_ore, "amethyst_ore", true);
			amethyst_block = new AmethystBlock();
			registerBlock(amethyst_block, "amethyst_block", true);
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
		if (ConfigHandler.EnderOre){
			ender_ore = new EnderOre();
			registerBlock(ender_ore, "ender_ore", true);
		}
		
		// Lamps
		if (ConfigHandler.ColorLamps){
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
	}
	
	public static void registerBlock(Block block, String name, boolean itemblock){
		GameRegistry.register(block, new ResourceLocation(Reference.MOD_ID + ":" + name));
		if (itemblock){
			GameRegistry.register(new ItemBlock(block), new ResourceLocation(Reference.MOD_ID + ":" + name));
		}
	}

}
