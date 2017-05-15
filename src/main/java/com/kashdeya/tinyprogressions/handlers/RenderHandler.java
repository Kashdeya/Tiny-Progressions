package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthRenderer;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeRenderer;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeTwoRenderer;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechFoods;
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
	    InventoryBlockRender(TechBlocks.charcoal_block, "charcoal_block");
	    InventoryBlockRender(TechBlocks.flesh_block, "flesh_block");
	    InventoryBlockRender(TechBlocks.reinforced_glass, "reinforced_glass");
	    InventoryBlockRender(TechBlocks.reinforced_obsidian, "reinforced_obsidian");
	    InventoryBlockRender(TechBlocks.bone_block, "bone_block");
	    InventoryBlockRender(TechBlocks.dirty_glass, "dirty_glass");
	    InventoryBlockRender(TechBlocks.granite_brick, "granite_brick");
	    InventoryBlockRender(TechBlocks.diorite_brick, "diorite_brick");
	    InventoryBlockRender(TechBlocks.andesite_brick, "andesite_brick");
	    InventoryBlockRender(TechBlocks.netherstar_block, "netherstar_block");
	    InventoryBlockRender(TechBlocks.flint_block, "flint_block");
	    InventoryBlockRender(TechBlocks.smooth_endstone, "smooth_endstone");
	    InventoryBlockRender(TechBlocks.stone_torch, "stone_torch");
	    InventoryBlockRender(TechBlocks.ender_ore, "ender_ore");
	    InventoryBlockRender(TechBlocks.black_lamp, "black_lamp");
	    InventoryBlockRender(TechBlocks.blue_lamp, "blue_lamp");
	    InventoryBlockRender(TechBlocks.brown_lamp, "brown_lamp");
	    InventoryBlockRender(TechBlocks.cyan_lamp, "cyan_lamp");
	    InventoryBlockRender(TechBlocks.green_lamp, "green_lamp");
	    InventoryBlockRender(TechBlocks.gray_lamp, "gray_lamp");
	    InventoryBlockRender(TechBlocks.lightblue_lamp, "lightblue_lamp");
	    InventoryBlockRender(TechBlocks.lime_lamp, "lime_lamp");
	    InventoryBlockRender(TechBlocks.magenta_lamp, "magenta_lamp");
	    InventoryBlockRender(TechBlocks.orange_lamp, "orange_lamp");
	    InventoryBlockRender(TechBlocks.pink_lamp, "pink_lamp");
	    InventoryBlockRender(TechBlocks.purple_lamp, "purple_lamp");
	    InventoryBlockRender(TechBlocks.red_lamp, "red_lamp");
	    InventoryBlockRender(TechBlocks.silver_lamp, "silver_lamp");
	    InventoryBlockRender(TechBlocks.white_lamp, "white_lamp");
	    InventoryBlockRender(TechBlocks.yellow_lamp, "yellow_lamp");
	    InventoryBlockRender(TechBlocks.base_lamp, "base_lamp");
	    InventoryBlockRender(TechBlocks.black_glowstone, "black_glowstone");
	    InventoryBlockRender(TechBlocks.blue_glowstone, "blue_glowstone");
	    InventoryBlockRender(TechBlocks.brown_glowstone, "brown_glowstone");
	    InventoryBlockRender(TechBlocks.cyan_glowstone, "cyan_glowstone");
	    InventoryBlockRender(TechBlocks.green_glowstone, "green_glowstone");
	    InventoryBlockRender(TechBlocks.gray_glowstone, "gray_glowstone");
	    InventoryBlockRender(TechBlocks.lightblue_glowstone, "lightblue_glowstone");
	    InventoryBlockRender(TechBlocks.lime_glowstone, "lime_glowstone");
	    InventoryBlockRender(TechBlocks.magenta_glowstone, "magenta_glowstone");
	    InventoryBlockRender(TechBlocks.orange_glowstone, "orange_glowstone");
	    InventoryBlockRender(TechBlocks.pink_glowstone, "pink_glowstone");
	    InventoryBlockRender(TechBlocks.purple_glowstone, "purple_glowstone");
	    InventoryBlockRender(TechBlocks.red_glowstone, "red_glowstone");
	    InventoryBlockRender(TechBlocks.silver_glowstone, "silver_glowstone");
	    InventoryBlockRender(TechBlocks.white_glowstone, "white_glowstone");
	    InventoryBlockRender(TechBlocks.lava_block, "lava_block");
	    InventoryBlockRender(TechBlocks.nether_lava_block, "nether_lava_block");
	    InventoryBlockRender(TechBlocks.lava_crystal_ore, "lava_crystal_ore");
	    InventoryBlockRender(TechBlocks.water_block, "water_block");
	    InventoryBlockRender(TechBlocks.lit_redstone_lamp, "lit_redstone_lamp");
	    InventoryBlockRender(TechBlocks.sapphire_block, "sapphire_block");
	    InventoryBlockRender(TechBlocks.ruby_block, "ruby_block");
	    InventoryBlockRender(TechBlocks.amethyst_block, "amethyst_block");
	    InventoryBlockRender(TechBlocks.crying_obsidian, "crying_obsidian");
	    InventoryBlockRender(TechBlocks.broken_reed, "broken_reed");
	    InventoryBlockRender(TechBlocks.antimatter_block, "antimatter_block");
	    InventoryBlockRender(TechBlocks.blood_block, "blood_block");
	    InventoryBlockRender(TechBlocks.coralium_block, "coralium_block");
	    InventoryBlockRender(TechBlocks.moltendirt_block, "moltendirt_block");
	    InventoryBlockRender(TechBlocks.moltendirt_nether_block, "moltendirt_nether_block");
	    InventoryBlockRender(TechBlocks.sapphire_ore, "sapphire_ore");
	    InventoryBlockRender(TechBlocks.ruby_ore, "ruby_ore");
	    InventoryBlockRender(TechBlocks.amethyst_ore, "amethyst_ore");
	    InventoryBlockRender(TechBlocks.coal_gravel, "coal_gravel");
	    InventoryBlockRender(TechBlocks.diamond_gravel, "diamond_gravel");
	    InventoryBlockRender(TechBlocks.emerald_gravel, "emerald_gravel");
	    InventoryBlockRender(TechBlocks.gold_gravel, "gold_gravel");
	    InventoryBlockRender(TechBlocks.iron_gravel, "iron_gravel");
	    InventoryBlockRender(TechBlocks.lapis_gravel, "lapis_gravel");
	    InventoryBlockRender(TechBlocks.quartz_gravel, "quartz_gravel");
	    InventoryBlockRender(TechBlocks.redstone_gravel, "redstone_gravel");
	    InventoryBlockRender(TechBlocks.water_source, "water_source");
	}
	
	public static void initBlockRenders(){
	    //Tile Entity Render
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowth.class, new TileEntityGrowthRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowthUpgrade.class, new TileEntityGrowthUpgradeRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowthUpgradeTwo.class, new TileEntityGrowthUpgradeTwoRenderer());
	}
	
	public static void initItems(){
		InventoryItemRender(TechItems.watering_can, "watering_can");
		InventoryItemRender(TechItems.watering_can_upgrade, "watering_can_upgrade");
		InventoryItemRender(TechItems.quartz_dust, "quartz_dust");
		InventoryItemRender(TechItems.quartz_knife, "quartz_knife");
		InventoryItemRender(TechItems.mycelium_seeds, "mycelium_seeds");
		InventoryItemRender(TechItems.med_kit, "med_kit");	
		InventoryItemRender(TechItems.stone_dust, "stone_dust");
		InventoryItemRender(TechItems.flint_knife, "flint_knife");
		InventoryItemRender(TechItems.stone_stick, "stone_stick");
		InventoryItemRender(TechItems.ender_dust, "ender_dust");
		InventoryItemRender(TechItems.rotten_leather, "rotten_leather");
		InventoryItemRender(TechItems.old_reed, "old_reed");
		InventoryItemRender(TechItems.stone_juicer, "stone_juicer");
		InventoryItemRender(TechItems.black_dust, "black_dust");
		InventoryItemRender(TechItems.blue_dust, "blue_dust");
		InventoryItemRender(TechItems.brown_dust, "brown_dust");
		InventoryItemRender(TechItems.cyan_dust, "cyan_dust");
		InventoryItemRender(TechItems.gray_dust, "gray_dust");
		InventoryItemRender(TechItems.green_dust, "green_dust");
		InventoryItemRender(TechItems.white_dust, "white_dust");
		InventoryItemRender(TechItems.lightblue_dust, "lightblue_dust");
		InventoryItemRender(TechItems.lime_dust, "lime_dust");
		InventoryItemRender(TechItems.magenta_dust, "magenta_dust");
		InventoryItemRender(TechItems.orange_dust, "orange_dust");
		InventoryItemRender(TechItems.pink_dust, "pink_dust");
		InventoryItemRender(TechItems.purple_dust, "purple_dust");
		InventoryItemRender(TechItems.red_dust, "red_dust");
		InventoryItemRender(TechItems.silver_dust, "silver_dust");
		InventoryItemRender(TechItems.reinforced_diamond, "reinforced_diamond");
		InventoryItemRender(TechItems.redstone_ingot, "redstone_ingot");
		InventoryItemRender(TechItems.lapis_ingot, "lapis_ingot");
		InventoryItemRender(TechItems.amethyst_gem, "amethyst_gem");
		InventoryItemRender(TechItems.sapphire_gem, "sapphire_gem");
		InventoryItemRender(TechItems.ruby_gem, "ruby_gem");
		InventoryItemRender(TechItems.chain_links, "chain_links");
		InventoryItemRender(TechItems.witherRib, "witherRib");
		InventoryItemRender(TechItems.dragon_scale, "dragon_scale");
		InventoryItemRender(TechItems.lava_crystal, "lava_crystal");
		InventoryItemRender(TechItems.diamond_apple, "diamond_apple");
		InventoryItemRender(TechItems.emerald_apple, "emerald_apple");
		InventoryItemRender(TechItems.golden_apple, "golden_apple");
		InventoryItemRender(TechItems.diamond_saw, "diamond_saw");
	}
	
	public static void initFoods(){
		InventoryItemRender(TechFoods.apple_juice, "apple_juice");
		InventoryItemRender(TechFoods.carrot_juice, "carrot_juice");
		InventoryItemRender(TechFoods.cactus_juice, "cactus_juice");
		InventoryItemRender(TechFoods.slim_juice, "slim_juice");
		InventoryItemRender(TechFoods.watermelon_juice, "watermelon_juice");
		InventoryItemRender(TechFoods.beet_juice, "beet_juice");
		InventoryItemRender(TechFoods.raw_bacon, "raw_bacon");
		InventoryItemRender(TechFoods.cooked_bacon, "cooked_bacon");
		InventoryItemRender(TechFoods.monster_jerky, "monster_jerky");
		InventoryItemRender(TechFoods.toasted_bread, "toasted_bread");
		InventoryItemRender(TechFoods.fried_egg, "fried_egg");
		InventoryItemRender(TechFoods.cooked_mushroom_brown, "cooked_mushroom_brown");
		InventoryItemRender(TechFoods.cooked_mushroom_red, "cooked_mushroom_red");
		InventoryItemRender(TechFoods.bacon_eggs, "bacon_eggs");
		InventoryItemRender(TechFoods.little_candy, "little_candy");
		InventoryItemRender(TechFoods.bacon_sandwhich, "bacon_sandwhich");
		InventoryItemRender(TechFoods.beef_sandwhich, "beef_sandwhich");
		InventoryItemRender(TechFoods.bread_slice, "bread_slice");
		InventoryItemRender(TechFoods.chicken_sandwhich, "chicken_sandwhich");
		InventoryItemRender(TechFoods.cooked_apple, "cooked_apple");
		InventoryItemRender(TechFoods.french_fries, "french_fries");
		InventoryItemRender(TechFoods.rabbit_sandwhich, "rabbit_sandwhich");
		InventoryItemRender(TechFoods.bacon_eggs_sandwhich, "bacon_eggs_sandwhich");
	}
	
	public static void initTools(){
		// Bone
		InventoryItemRender(TechTools.bone_axe, "bone_axe");
		InventoryItemRender(TechTools.bone_hoe, "bone_hoe");
		InventoryItemRender(TechTools.bone_pickaxe, "bone_pickaxe");
		InventoryItemRender(TechTools.bone_spade, "bone_spade");
		InventoryItemRender(TechTools.bone_sword, "bone_sword");
		// Flint
		InventoryItemRender(TechTools.flint_axe, "flint_axe");
		InventoryItemRender(TechTools.flint_hoe, "flint_hoe");
		InventoryItemRender(TechTools.flint_pickaxe, "flint_pickaxe");
		InventoryItemRender(TechTools.flint_spade, "flint_spade");
		InventoryItemRender(TechTools.flint_sword, "flint_sword");
		// Birthday
		InventoryItemRender(TechTools.birthday_pickaxe, "birthday_pickaxe");
		// Emerald
		InventoryItemRender(TechTools.emerald_axe, "emerald_axe");
		InventoryItemRender(TechTools.emerald_hoe, "emerald_hoe");
		InventoryItemRender(TechTools.emerald_pickaxe, "emerald_pickaxe");
		InventoryItemRender(TechTools.emerald_spade, "emerald_spade");
		InventoryItemRender(TechTools.emerald_sword, "emerald_sword");
		// Obsidian
		InventoryItemRender(TechTools.obsidian_axe, "obsidian_axe");
		InventoryItemRender(TechTools.obsidian_hoe, "obsidian_hoe");
		InventoryItemRender(TechTools.obsidian_pickaxe, "obsidian_pickaxe");
		InventoryItemRender(TechTools.obsidian_spade, "obsidian_spade");
		InventoryItemRender(TechTools.obsidian_sword, "obsidian_sword");
		// Scythe
		InventoryItemRender(TechTools.wooden_scythe, "wooden_scythe");
		InventoryItemRender(TechTools.diamond_scythe, "diamond_scythe");
		InventoryItemRender(TechTools.emerald_scythe, "emerald_scythe");
		InventoryItemRender(TechTools.golden_scythe, "golden_scythe");
		InventoryItemRender(TechTools.iron_scythe, "iron_scythe");
		InventoryItemRender(TechTools.obsidian_scythe, "obsidian_scythe");
		InventoryItemRender(TechTools.stone_scythe, "stone_scythe");
		// Multi
		InventoryItemRender(TechTools.wooden_multi, "wooden_multi");
		InventoryItemRender(TechTools.diamond_multi, "diamond_multi");
		InventoryItemRender(TechTools.emerald_multi, "emerald_multi");
		InventoryItemRender(TechTools.golden_multi, "golden_multi");
		InventoryItemRender(TechTools.iron_multi, "iron_multi");
		InventoryItemRender(TechTools.obsidian_multi, "obsidian_multi");
		InventoryItemRender(TechTools.stone_multi, "stone_multi");
		// Battle
		InventoryItemRender(TechTools.wooden_battle, "wooden_battle");
		InventoryItemRender(TechTools.diamond_battle, "diamond_battle");
		InventoryItemRender(TechTools.emerald_battle, "emerald_battle");
		InventoryItemRender(TechTools.golden_battle, "golden_battle");
		InventoryItemRender(TechTools.iron_battle, "iron_battle");
		InventoryItemRender(TechTools.obsidian_battle, "obsidian_battle");
		InventoryItemRender(TechTools.stone_battle, "stone_battle");
		// Spear
		InventoryItemRender(TechTools.wooden_spear, "wooden_spear");
		InventoryItemRender(TechTools.diamond_spear, "diamond_spear");
		InventoryItemRender(TechTools.emerald_spear, "emerald_spear");
		InventoryItemRender(TechTools.golden_spear, "golden_spear");
		InventoryItemRender(TechTools.iron_spear, "iron_spear");
		InventoryItemRender(TechTools.obsidian_spear, "obsidian_spear");
		InventoryItemRender(TechTools.stone_spear, "stone_spear");
	}
	
	public static void initArmor(){
		InventoryItemRender(TechArmor.stone_helmet, "stone_helmet");
		InventoryItemRender(TechArmor.stone_chestplate, "stone_chestplate");
		InventoryItemRender(TechArmor.stone_leggings, "stone_leggings");
		InventoryItemRender(TechArmor.stone_boots, "stone_boots");
		InventoryItemRender(TechArmor.flint_helmet, "flint_helmet");
		InventoryItemRender(TechArmor.flint_chestplate, "flint_chestplate");
		InventoryItemRender(TechArmor.flint_leggings, "flint_leggings");
		InventoryItemRender(TechArmor.flint_boots, "flint_boots");
		InventoryItemRender(TechArmor.bone_helmet, "bone_helmet");
		InventoryItemRender(TechArmor.bone_chestplate, "bone_chestplate");
		InventoryItemRender(TechArmor.bone_leggings, "bone_leggings");
		InventoryItemRender(TechArmor.bone_boots, "bone_boots");
		InventoryItemRender(TechArmor.wooden_helmet, "wooden_helmet");
		InventoryItemRender(TechArmor.wooden_chestplate, "wooden_chestplate");
		InventoryItemRender(TechArmor.wooden_leggings, "wooden_leggings");
		InventoryItemRender(TechArmor.wooden_boots, "wooden_boots");
		InventoryItemRender(TechArmor.emerald_helmet, "emerald_helmet");
		InventoryItemRender(TechArmor.emerald_chestplate, "emerald_chestplate");
		InventoryItemRender(TechArmor.emerald_leggings, "emerald_leggings");
		InventoryItemRender(TechArmor.emerald_boots, "emerald_boots");
		InventoryItemRender(TechArmor.redstone_helmet, "redstone_helmet");
		InventoryItemRender(TechArmor.redstone_chestplate, "redstone_chestplate");
		InventoryItemRender(TechArmor.redstone_leggings, "redstone_leggings");
		InventoryItemRender(TechArmor.redstone_boots, "redstone_boots");
		InventoryItemRender(TechArmor.lapis_helmet, "lapis_helmet");
		InventoryItemRender(TechArmor.lapis_chestplate, "lapis_chestplate");
		InventoryItemRender(TechArmor.lapis_leggings, "lapis_leggings");
		InventoryItemRender(TechArmor.lapis_boots, "lapis_boots");
		InventoryItemRender(TechArmor.obsidian_helmet, "obsidian_helmet");
		InventoryItemRender(TechArmor.obsidian_chestplate, "obsidian_chestplate");
		InventoryItemRender(TechArmor.obsidian_leggings, "obsidian_leggings");
		InventoryItemRender(TechArmor.obsidian_boots, "obsidian_boots");
		InventoryItemRender(TechArmor.reinforced_helmet, "reinforced_helmet");
		InventoryItemRender(TechArmor.reinforced_chestplate, "reinforced_chestplate");
		InventoryItemRender(TechArmor.reinforced_leggings, "reinforced_leggings");
		InventoryItemRender(TechArmor.reinforced_boots, "reinforced_boots");
		InventoryItemRender(TechArmor.lava_helmet, "lava_helmet");
		InventoryItemRender(TechArmor.lava_chestplate, "lava_chestplate");
		InventoryItemRender(TechArmor.lava_leggings, "lava_leggings");
		InventoryItemRender(TechArmor.lava_boots, "lava_boots");
		InventoryItemRender(TechArmor.wither_helmet, "wither_helmet");
		InventoryItemRender(TechArmor.wither_chestplate, "wither_chestplate");
		InventoryItemRender(TechArmor.wither_leggings, "wither_leggings");
		InventoryItemRender(TechArmor.wither_boots, "wither_boots");
		InventoryItemRender(TechArmor.dragon_helmet, "dragon_helmet");
		InventoryItemRender(TechArmor.dragon_chestplate, "dragon_chestplate");
		InventoryItemRender(TechArmor.dragon_leggings, "dragon_leggings");
		InventoryItemRender(TechArmor.dragon_boots, "dragon_boots");
		InventoryItemRender(TechArmor.amethyst_helmet, "amethyst_helmet");
		InventoryItemRender(TechArmor.amethyst_chestplate, "amethyst_chestplate");
		InventoryItemRender(TechArmor.amethyst_leggings, "amethyst_leggings");
		InventoryItemRender(TechArmor.amethyst_boots, "amethyst_boots");
		InventoryItemRender(TechArmor.ruby_helmet, "ruby_helmet");
		InventoryItemRender(TechArmor.ruby_chestplate, "ruby_chestplate");
		InventoryItemRender(TechArmor.ruby_leggings, "ruby_leggings");
		InventoryItemRender(TechArmor.ruby_boots, "ruby_boots");
		InventoryItemRender(TechArmor.sapphire_helmet, "sapphire_helmet");
		InventoryItemRender(TechArmor.sapphire_chestplate, "sapphire_chestplate");
		InventoryItemRender(TechArmor.sapphire_leggings, "sapphire_leggings");
		InventoryItemRender(TechArmor.sapphire_boots, "sapphire_boots");
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
