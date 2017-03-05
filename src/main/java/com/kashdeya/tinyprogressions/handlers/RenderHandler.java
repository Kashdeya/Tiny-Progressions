package com.kashdeya.tinyprogressions.handlers;

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
	    InventoryBlockRender(TechBlocks.CharcoalBlock, "CharcoalBlock");
	    InventoryBlockRender(TechBlocks.FleshBlock, "FleshBlock");
	    InventoryBlockRender(TechBlocks.ReinforcedGlass, "ReinforcedGlass");
	    InventoryBlockRender(TechBlocks.ReinforcedObsidian, "ReinforcedObsidian");
	    InventoryBlockRender(TechBlocks.BoneBlock, "BoneBlock");
	    InventoryBlockRender(TechBlocks.DirtyGlass, "DirtyGlass");
	    InventoryBlockRender(TechBlocks.GraniteBrick, "GraniteBrick");
	    InventoryBlockRender(TechBlocks.DioriteBrick, "DioriteBrick");
	    InventoryBlockRender(TechBlocks.AndesiteBrick, "AndesiteBrick");
	    InventoryBlockRender(TechBlocks.NetherStarBlock, "NetherStarBlock");
	    InventoryBlockRender(TechBlocks.FlintBlock, "FlintBlock");
	    InventoryBlockRender(TechBlocks.SmoothEndStone, "SmoothEndStone");
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
		InventoryItemRender(TechTools.BoneHoe, "BoneHoe");
		InventoryItemRender(TechTools.BonePickaxe, "BonePickaxe");
		InventoryItemRender(TechTools.BoneSpade, "BoneSpade");
		InventoryItemRender(TechTools.BoneSword, "BoneSword");
		InventoryItemRender(TechTools.FlintAxe, "FlintAxe");
		InventoryItemRender(TechTools.FlintHoe, "FlintHoe");
		InventoryItemRender(TechTools.FlintPickaxe, "FlintPickaxe");
		InventoryItemRender(TechTools.FlintSpade, "FlintSpade");
		InventoryItemRender(TechTools.FlintSword, "FlintSword");
		InventoryItemRender(TechTools.BirthdayPickaxe, "BirthdayPickaxe");
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
