package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthRenderer;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeRenderer;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeTwoRenderer;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;
import com.kashdeya.tinyprogressions.main.Reference;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowth;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgrade;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgradeTwo;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderHandler {
	
	public static void preInitBlocks(){
		if (ConfigHandler.BlockGrowthUpgrade){
			setCustomStateMap(TechBlocks.growth_upgrade, new StateMap.Builder().ignore(new IProperty[] { BlockLiquid.LEVEL }).build());
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo){
			setCustomStateMap(TechBlocks.growth_upgrade_two, new StateMap.Builder().ignore(new IProperty[] { BlockLiquid.LEVEL }).build());
		}
	}
	
	public static void initBlocks(){
	    InventoryBlockRender(TechBlocks.growth_block, "growth_block");
	    InventoryBlockRender(TechBlocks.growth_upgrade, "growth_upgrade");
	    InventoryBlockRender(TechBlocks.growth_upgrade_two, "growth_upgrade_two");
	    InventoryBlockRender(TechBlocks.cobblegen_block, "cobblegen_block");
	    InventoryBlockRender(TechBlocks.iron_cobblegen_block, "iron_cobblegen_block");
	    InventoryBlockRender(TechBlocks.diamond_cobblegen_block, "diamond_cobblegen_block");
	    InventoryBlockRender(TechBlocks.emerald_cobblegen_block, "emerald_cobblegen_block");
	    InventoryBlockRender(TechBlocks.blaze_cobblegen_block, "blaze_cobblegen_block");
	    InventoryBlockRender(TechBlocks.CharcoalBlock, "charcoal_block");
	    InventoryBlockRender(TechBlocks.FleshBlock, "flesh_block");
	    InventoryBlockRender(TechBlocks.ReinforcedGlass, "reinforced_glass");
	    InventoryBlockRender(TechBlocks.ReinforcedObsidian, "reinforced_obsidian");
	    InventoryBlockRender(TechBlocks.BoneBlock, "bone_block");
	    InventoryBlockRender(TechBlocks.DirtyGlass, "dirty_glass");
	    InventoryBlockRender(TechBlocks.GraniteBrick, "granite_brick");
	    InventoryBlockRender(TechBlocks.DioriteBrick, "diorite_brick");
	    InventoryBlockRender(TechBlocks.AndesiteBrick, "andesite_brick");
	    InventoryBlockRender(TechBlocks.NetherStarBlock, "nether_star_block");
	    InventoryBlockRender(TechBlocks.FlintBlock, "flint_block");
	    InventoryBlockRender(TechBlocks.SmoothEndStone, "smooth_end_stone");
	}
	
	public static void initBlockRenders(){
	    //Tile Entity Render
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowth.class, new TileEntityGrowthRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowthUpgrade.class, new TileEntityGrowthUpgradeRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowthUpgradeTwo.class, new TileEntityGrowthUpgradeTwoRenderer());
	}
	
	public static void initItems(){
		InventoryItemRender(TechItems.WateringCan, "WateringCan");
		InventoryItemRender(TechItems.WateringCanUpgrade, "WateringCanUpgrade");
		InventoryItemRender(TechItems.QuartzDust, "QuartzDust");
		InventoryItemRender(TechItems.QuartzKnife, "QuartzKnife");
		InventoryItemRender(TechItems.BirthdayPickaxe, "BirthdayPickaxe");
		InventoryItemRender(TechItems.MyceliumSeeds, "MyceliumSeeds");
		InventoryItemRender(TechItems.DiamondApple, "DiamondApple");
		InventoryItemRender(TechItems.EmeraldApple, "EmeraldApple");
		InventoryItemRender(TechItems.MedKit, "MedKit");	
		InventoryItemRender(TechItems.StoneDust, "StoneDust");
		InventoryItemRender(TechItems.FlintIngot, "FlintIngot");
		InventoryItemRender(TechItems.FlintKnife, "FlintKnife");
	}
	
	public static void initTools(){
		InventoryItemRender(TechTools.BoneAxe, "BoneAxe");
		//InventoryItemRender(TechTools.BoneAxeHead, "BoneAxeHead");
		InventoryItemRender(TechTools.BoneHoe, "BoneHoe");
		//InventoryItemRender(TechTools.BoneHoeHead, "BoneHoeHead");
		InventoryItemRender(TechTools.BonePickaxe, "BonePickaxe");
		//InventoryItemRender(TechTools.BonePickaxeHead, "BonePickaxeHead");
		InventoryItemRender(TechTools.BoneSpade, "BoneSpade");
		//InventoryItemRender(TechTools.BoneSpadeHead, "BoneSpadeHead");
		InventoryItemRender(TechTools.BoneSword, "BoneSword");
		//InventoryItemRender(TechTools.BoneSwordHead, "BoneSwordHead");
		InventoryItemRender(TechTools.FlintAxe, "FlintAxe");
		//InventoryItemRender(TechTools.FlintAxeHead, "FlintAxeHead");
		InventoryItemRender(TechTools.FlintHoe, "FlintHoe");
		//InventoryItemRender(TechTools.FlintHoeHead, "FlintHoeHead");
		InventoryItemRender(TechTools.FlintPickaxe, "FlintPickaxe");
		//InventoryItemRender(TechTools.FlintPickaxeHead, "FlintPickaxeHead");
		InventoryItemRender(TechTools.FlintSpade, "FlintSpade");
		//InventoryItemRender(TechTools.FlintSpadeHead, "FlintSpadeHead");
		InventoryItemRender(TechTools.FlintSword, "FlintSword");
		//InventoryItemRender(TechTools.FlintSwordHead, "FlintSwordHead");
		InventoryItemRender(TechTools.WoodenPaxel, "WoodenPaxel");
		InventoryItemRender(TechTools.StonePaxel, "StonePaxel");
		InventoryItemRender(TechTools.GoldenPaxel, "GoldenPaxel");
		InventoryItemRender(TechTools.IronPaxel, "IronPaxel");
		InventoryItemRender(TechTools.DiamondPaxel, "DiamondPaxel");
	}
	
	public static void initArmor(){
		InventoryItemRender(TechArmor.stoneHelmet, "stoneHelmet");
		InventoryItemRender(TechArmor.stoneChestplate, "stoneChestplate");
		InventoryItemRender(TechArmor.stoneLeggings, "stoneLeggings");
		InventoryItemRender(TechArmor.stoneBoots, "stoneBoots");
		InventoryItemRender(TechArmor.flintHelmet, "flintHelmet");
		InventoryItemRender(TechArmor.flintChestplate, "flintChestplate");
		InventoryItemRender(TechArmor.flintLeggings, "flintLeggings");
		InventoryItemRender(TechArmor.flintBoots, "flintBoots");
		InventoryItemRender(TechArmor.boneHelmet, "boneHelmet");
		InventoryItemRender(TechArmor.boneChestplate, "boneChestplate");
		InventoryItemRender(TechArmor.boneLeggings, "boneLeggings");
		InventoryItemRender(TechArmor.boneBoots, "boneBoots");
	}
	
	public static void InventoryBlockRender(Block block, String blockName) {
		if(block != null)
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + blockName, "inventory"));
	}
	  
	public static void InventoryItemRender(Item item, String itemName) {
		if(item != null)
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + itemName, "inventory"));
	}
	
	public static void setCustomStateMap(Block block, StateMap stateMap){
		ModelLoader.setCustomStateMapper(block, stateMap);
	}

}
