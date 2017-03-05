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
		InventoryItemRender(TechItems.WateringCan, "watering_can");
		InventoryItemRender(TechItems.WateringCanUpgrade, "watering_can_upgrade");
		InventoryItemRender(TechItems.QuartzDust, "quartz_dust");
		InventoryItemRender(TechItems.QuartzKnife, "quartz_knife");
		InventoryItemRender(TechItems.MyceliumSeeds, "mycelium_seeds");
		InventoryItemRender(TechItems.DiamondApple, "diamond_apple");
		InventoryItemRender(TechItems.EmeraldApple, "emerald_apple");
		InventoryItemRender(TechItems.MedKit, "med_kit");
		InventoryItemRender(TechItems.StoneDust, "stone_dust");
		InventoryItemRender(TechItems.FlintIngot, "flint_ingot");
		InventoryItemRender(TechItems.FlintKnife, "flint_knife");
	}
	
	public static void initTools(){
		InventoryItemRender(TechTools.BoneAxe, "bone_axe");
		InventoryItemRender(TechTools.BoneHoe, "bone_hoe");
		InventoryItemRender(TechTools.BonePickaxe, "bone_pickaxe");
		InventoryItemRender(TechTools.BoneSpade, "bone_spade");
		InventoryItemRender(TechTools.BoneSword, "bone_sword");
		InventoryItemRender(TechTools.FlintAxe, "flint_axe");
		InventoryItemRender(TechTools.FlintHoe, "flint_hoe");
		InventoryItemRender(TechTools.FlintPickaxe, "flint_pickaxe");
		InventoryItemRender(TechTools.FlintSpade, "flint_spade");
		InventoryItemRender(TechTools.FlintSword, "flint_sword");
		InventoryItemRender(TechTools.BirthdayPickaxe, "birthday_pickaxe");
	}
	
	public static void initArmor(){
		InventoryItemRender(TechArmor.stoneHelmet, "stone_helmet");
		InventoryItemRender(TechArmor.stoneChestplate, "stone_chestplate");
		InventoryItemRender(TechArmor.stoneLeggings, "stone_leggings");
		InventoryItemRender(TechArmor.stoneBoots, "stone_boots");
		InventoryItemRender(TechArmor.flintHelmet, "flint_helmet");
		InventoryItemRender(TechArmor.flintChestplate, "flint_chestplate");
		InventoryItemRender(TechArmor.flintLeggings, "flint_leggings");
		InventoryItemRender(TechArmor.flintBoots, "flint_boots");
		InventoryItemRender(TechArmor.boneHelmet, "bone_helmet");
		InventoryItemRender(TechArmor.boneChestplate, "bone_chestplate");
		InventoryItemRender(TechArmor.boneLeggings, "bone_leggings");
		InventoryItemRender(TechArmor.boneBoots, "bone_boots");
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
