package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeRenderer;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeTwoRenderer;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.Reference;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgrade;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgradeTwo;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class RenderHandler {
	
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

	    //Tile Entity Render
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowthUpgrade.class, new TileEntityGrowthUpgradeRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowthUpgradeTwo.class, new TileEntityGrowthUpgradeTwoRenderer());
	}
	
	public static void preInitBlocks(){
		if (ConfigHandler.BlockGrowthUpgradeTwo == true){
			setCustomStateMap(TechBlocks.growth_upgrade_two, new StateMap.Builder().ignore(new IProperty[] { BlockLiquid.LEVEL }).build());
		}
	}
	
	public static void initItems(){
		InventoryItemRender(TechItems.WateringCan, "WateringCan");
		InventoryItemRender(TechItems.WateringCanUpgrade, "WateringCanUpgrade");
		InventoryItemRender(TechItems.QuartzDust, "QuartzDust");
		InventoryItemRender(TechItems.QuartzKnife, "QuartzKnife");
		InventoryItemRender(TechItems.BirthdayPickaxe, "BirthdayPickaxe");
		InventoryItemRender(TechItems.MyceliumSeeds, "MyceliumSeeds");
		InventoryItemRender(TechItems.DiamondApple, "DiamondApple");
		InventoryItemRender(TechItems.MedKit, "MedKit");	
	}
	
	public static void initArmor(){
		InventoryItemRender(TechArmor.stoneHelmet, "stoneHelmet");
		InventoryItemRender(TechArmor.stoneChestplate, "stoneChestplate");
		InventoryItemRender(TechArmor.stoneLeggings, "stoneLeggings");
		InventoryItemRender(TechArmor.stoneBoots, "stoneBoots");
	}
	
	public static void InventoryBlockRender(Block block, String blockName){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + blockName, "inventory"));
	}
	  
	public static void InventoryItemRender(Item item, String itemName){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + itemName, "inventory"));
	}
	
	public static void setCustomStateMap(Block block, StateMap stateMap){
		ModelLoader.setCustomStateMapper(block, stateMap);
	}

}
