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
import com.kashdeya.tinyprogressions.blocks.FleshBlock;
import com.kashdeya.tinyprogressions.blocks.FlintBlock;
import com.kashdeya.tinyprogressions.blocks.GraniteBrick;
import com.kashdeya.tinyprogressions.blocks.IronCobblegen;
import com.kashdeya.tinyprogressions.blocks.NetherStarBlock;
import com.kashdeya.tinyprogressions.blocks.ReinforcedGlass;
import com.kashdeya.tinyprogressions.blocks.ReinforcedObsidian;
import com.kashdeya.tinyprogressions.blocks.SmoothEndStone;
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
	public static Block CharcoalBlock;
	public static Block ReinforcedGlass;
	public static Block ReinforcedObsidian;
	public static Block DirtyGlass;
	public static Block DioriteBrick;
	public static Block GraniteBrick;
	public static Block AndesiteBrick;
	// Compressed Blocks
	public static Block FleshBlock;
	public static Block BoneBlock;
	public static Block NetherStarBlock;
	// Flint Block
	public static Block FlintBlock;
	// End Stones
	public static Block SmoothEndStone;
	
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
		if (ConfigHandler.CharcoalBlock){
			CharcoalBlock = new CharcoalBlock();
			registerBlock(CharcoalBlock, "charcoal_block", true);
		}
		if (ConfigHandler.ReinforcedGlass){
			ReinforcedGlass = new ReinforcedGlass();
			registerBlock(ReinforcedGlass, "reinforced_glass", true);
		}
		if (ConfigHandler.ReinforcedObsidian){
			ReinforcedObsidian = new ReinforcedObsidian();
			registerBlock(ReinforcedObsidian, "reinforced_obsidian", true);
		}
		if (ConfigHandler.DirtyGlass){
			DirtyGlass = new DirtyGlass();
			registerBlock(DirtyGlass, "dirty_glass", true);
		}
		
		// Compressed Blocks
		if (ConfigHandler.FleshBlock){
			FleshBlock = new FleshBlock();
			registerBlock(FleshBlock, "flesh_block", true);
		}
		if (ConfigHandler.BoneBlock){
			BoneBlock = new BoneBlock();
			registerBlock(BoneBlock, "bone_block", true);
		}
		if (ConfigHandler.NetherStarBlock){
			NetherStarBlock = new NetherStarBlock();
			registerBlock(NetherStarBlock, "nether_star_block", true);
		}
		if (ConfigHandler.DioriteBrick){
			DioriteBrick = new DioriteBrick();
			registerBlock(DioriteBrick, "diorite_brick", true);
		}
		if (ConfigHandler.GraniteBrick){
			GraniteBrick = new GraniteBrick();
			registerBlock(GraniteBrick, "granite_brick", true);
		}
		if (ConfigHandler.AndesiteBrick){
			AndesiteBrick = new AndesiteBrick();
			registerBlock(AndesiteBrick, "andesite_brick", true);
		}
		
		// Flint Block
		if (ConfigHandler.FlintBlock){
			FlintBlock = new FlintBlock();
			registerBlock(FlintBlock, "flint_block", true);
		}
		
		// Smooth EndStone
		if (ConfigHandler.SmoothEndStone){
			SmoothEndStone = new SmoothEndStone();
			registerBlock(SmoothEndStone, "smooth_end_stone", true);
		}
	}
	
	public static void registerBlock(Block block, String name, boolean itemblock){
		GameRegistry.register(block, new ResourceLocation(Reference.MOD_ID + ":" + name));
		if (itemblock){
			GameRegistry.register(new ItemBlock(block), new ResourceLocation(Reference.MOD_ID + ":" + name));
		}

		TPMigration.addUnderscoreNameToMapUnderscorelessName(name);
	}

}
