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
import net.minecraft.client.Minecraft;
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
	    InventoryBlockRender(TechBlocks.lava_ore, "lava_ore");
	    InventoryBlockRender(TechBlocks.hardened_stone, "hardened_stone");
	    InventoryBlockRender(TechBlocks.hardened_stone_bricks, "hardened_stone_bricks");
	    InventoryBlockRender(TechBlocks.hardened_stone_smallbricks, "hardened_stone_smallbricks");
	    InventoryBlockRender(TechBlocks.old_reed, "old_reed");
	    // Lamps
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
	    // Glowstones
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
	    
	    InventoryBlockRender(TechBlocks.hardened_stone_stairs, "hardened_stone_stairs");
	    InventoryBlockRender(TechBlocks.hardened_stone_bricks_stairs, "hardened_stone_bricks_stairs");
	    InventoryBlockRender(TechBlocks.hardened_stone_smallbricks_stairs, "hardened_stone_smallbricks_stairs");
	    
	    InventoryBlockRender(TechBlocks.hardened_stone_slab_half, "hardened_stone_slab_half");
	    InventoryBlockRender(TechBlocks.hardened_stone_slab_double, "hardened_stone_slab_double");
	    
	    InventoryBlockRender(TechBlocks.hardened_stone_bricks_slab_half, "hardened_stone_bricks_slab_half");
        InventoryBlockRender(TechBlocks.hardened_stone_bricks_slab_double, "hardened_stone_bricks_slab_double");
	        
        InventoryBlockRender(TechBlocks.hardened_stone_smallbricks_slab_half, "hardened_stone_smallbricks_slab_half");
        InventoryBlockRender(TechBlocks.hardened_stone_smallbricks_slab_double, "hardened_stone_smallbricks_slab_double");
        
        InventoryBlockRender(TechBlocks.fmf_block, "fmf_block");
	}
	
	public static void initBlockRenders(){
	    //Tile Entity Render
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowth.class, new TileEntityGrowthRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowthUpgrade.class, new TileEntityGrowthUpgradeRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowthUpgradeTwo.class, new TileEntityGrowthUpgradeTwoRenderer());
	}
	
	public static void initBlockWorldRenders()
	{
		WorldBlockRender(TechBlocks.growth_block);
	    WorldBlockRender(TechBlocks.growth_upgrade);
	    WorldBlockRender(TechBlocks.growth_upgrade_two);
	    WorldBlockRender(TechBlocks.cobblegen_block);
	    WorldBlockRender(TechBlocks.iron_cobblegen_block);
	    WorldBlockRender(TechBlocks.diamond_cobblegen_block);
	    WorldBlockRender(TechBlocks.emerald_cobblegen_block);
	    WorldBlockRender(TechBlocks.blaze_cobblegen_block);
	    WorldBlockRender(TechBlocks.charcoal_block);
	    WorldBlockRender(TechBlocks.flesh_block);
	    WorldBlockRender(TechBlocks.reinforced_glass);
	    WorldBlockRender(TechBlocks.reinforced_obsidian);
	    WorldBlockRender(TechBlocks.bone_block);
	    WorldBlockRender(TechBlocks.dirty_glass);
	    WorldBlockRender(TechBlocks.granite_brick);
	    WorldBlockRender(TechBlocks.diorite_brick);
	    WorldBlockRender(TechBlocks.andesite_brick);
	    WorldBlockRender(TechBlocks.netherstar_block);
	    WorldBlockRender(TechBlocks.flint_block);
	    WorldBlockRender(TechBlocks.smooth_endstone);
	    WorldBlockRender(TechBlocks.stone_torch);
	    WorldBlockRender(TechBlocks.ender_ore);
	    WorldBlockRender(TechBlocks.lava_ore);
	    WorldBlockRender(TechBlocks.hardened_stone);
	    WorldBlockRender(TechBlocks.hardened_stone_bricks);
	    WorldBlockRender(TechBlocks.hardened_stone_smallbricks);
	    WorldBlockRender(TechBlocks.old_reed);
	    // Lamps
	    WorldBlockRender(TechBlocks.black_lamp);
	    WorldBlockRender(TechBlocks.blue_lamp);
	    WorldBlockRender(TechBlocks.brown_lamp);
	    WorldBlockRender(TechBlocks.cyan_lamp);
	    WorldBlockRender(TechBlocks.green_lamp);
	    WorldBlockRender(TechBlocks.gray_lamp);
	    WorldBlockRender(TechBlocks.lightblue_lamp);
	    WorldBlockRender(TechBlocks.lime_lamp);
	    WorldBlockRender(TechBlocks.magenta_lamp);
	    WorldBlockRender(TechBlocks.orange_lamp);
	    WorldBlockRender(TechBlocks.pink_lamp);
	    WorldBlockRender(TechBlocks.purple_lamp);
	    WorldBlockRender(TechBlocks.red_lamp);
	    WorldBlockRender(TechBlocks.silver_lamp);
	    WorldBlockRender(TechBlocks.white_lamp);
	    WorldBlockRender(TechBlocks.yellow_lamp);
	    WorldBlockRender(TechBlocks.base_lamp);
	    // Glowstones
	    WorldBlockRender(TechBlocks.black_glowstone);
	    WorldBlockRender(TechBlocks.blue_glowstone);
	    WorldBlockRender(TechBlocks.brown_glowstone);
	    WorldBlockRender(TechBlocks.cyan_glowstone);
	    WorldBlockRender(TechBlocks.green_glowstone);
	    WorldBlockRender(TechBlocks.gray_glowstone);
	    WorldBlockRender(TechBlocks.lightblue_glowstone);
	    WorldBlockRender(TechBlocks.lime_glowstone);
	    WorldBlockRender(TechBlocks.magenta_glowstone);
	    WorldBlockRender(TechBlocks.orange_glowstone);
	    WorldBlockRender(TechBlocks.pink_glowstone);
	    WorldBlockRender(TechBlocks.purple_glowstone);
	    WorldBlockRender(TechBlocks.red_glowstone);
	    WorldBlockRender(TechBlocks.silver_glowstone);
	    WorldBlockRender(TechBlocks.white_glowstone);
	    
	    WorldBlockRender(TechBlocks.hardened_stone_stairs);
	    WorldBlockRender(TechBlocks.hardened_stone_bricks_stairs);
        WorldBlockRender(TechBlocks.hardened_stone_smallbricks_stairs);
        
        WorldBlockRender(TechBlocks.hardened_stone_slab_half);
        WorldBlockRender(TechBlocks.hardened_stone_slab_double);  
        
        WorldBlockRender(TechBlocks.hardened_stone_bricks_slab_half);
        WorldBlockRender(TechBlocks.hardened_stone_bricks_slab_double);  
        
        WorldBlockRender(TechBlocks.hardened_stone_smallbricks_slab_half);
        WorldBlockRender(TechBlocks.hardened_stone_smallbricks_slab_double);  
        
        WorldBlockRender(TechBlocks.fmf_block);
	}
	
	public static void initItems(){
		// Watering Can
		InventoryItemRender(TechItems.watering_can, "watering_can");
		InventoryItemRender(TechItems.watering_can_upgrade, "watering_can_upgrade");
		// Apples
		InventoryItemRender(TechItems.iron_apple, "iron_apple");
		InventoryItemRender(TechItems.redstone_apple, "redstone_apple");
		InventoryItemRender(TechItems.diamond_apple, "diamond_apple");
		InventoryItemRender(TechItems.emerald_apple, "emerald_apple");
		InventoryItemRender(TechItems.golden_apple, "golden_apple");
		// Juices
		InventoryItemRender(TechItems.juicer, "juicer");
		InventoryItemRender(TechItems.apple_juice, "apple_juice");
		InventoryItemRender(TechItems.carrot_juice, "carrot_juice");
		InventoryItemRender(TechItems.potatoe_juice, "potatoe_juice");
		InventoryItemRender(TechItems.beet_juice, "beet_juice");
		InventoryItemRender(TechItems.cactus_juice, "cactus_juice");
		InventoryItemRender(TechItems.slime_juice, "slime_juice");
		InventoryItemRender(TechItems.wheat_juice, "wheat_juice");
		InventoryItemRender(TechItems.melon_juice, "melon_juice");
		InventoryItemRender(TechItems.pumpkin_juice, "pumpkin_juice");
		// Other Shit
		InventoryItemRender(TechItems.quartz_dust, "quartz_dust");
		InventoryItemRender(TechItems.quartz_knife, "quartz_knife");
		InventoryItemRender(TechItems.mycelium_seeds, "mycelium_seeds");
		InventoryItemRender(TechItems.med_kit, "med_kit");	
		InventoryItemRender(TechItems.stone_dust, "stone_dust");
		InventoryItemRender(TechItems.flint_ingot, "flint_ingot");
		InventoryItemRender(TechItems.flint_knife, "flint_knife");
		InventoryItemRender(TechItems.stone_stick, "stone_stick");
		InventoryItemRender(TechItems.ender_dust, "ender_dust");
		InventoryItemRender(TechItems.lava_crystal, "lava_crystal");
		InventoryItemRender(TechItems.reinforced_obsidian_ingot, "reinforced_obsidian_ingot");
		InventoryItemRender(TechItems.dragon_scale, "dragon_scale");
		InventoryItemRender(TechItems.wither_rib, "wither_rib");
		InventoryItemRender(TechItems.pouch, "pouch");
		InventoryItemRender(TechItems.dead_reed, "dead_reed");
		// Glowstone Dust
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
		InventoryItemRender(TechArmor.lava_helmet, "lava_helmet");
		InventoryItemRender(TechArmor.lava_chestplate, "lava_chestplate");
		InventoryItemRender(TechArmor.lava_leggings, "lava_leggings");
		InventoryItemRender(TechArmor.lava_boots, "lava_boots");
		InventoryItemRender(TechArmor.dragon_helmet, "dragon_helmet");
		InventoryItemRender(TechArmor.dragon_chestplate, "dragon_chestplate");
		InventoryItemRender(TechArmor.dragon_leggings, "dragon_leggings");
		InventoryItemRender(TechArmor.dragon_boots, "dragon_boots");
		InventoryItemRender(TechArmor.wither_helmet, "wither_helmet");
		InventoryItemRender(TechArmor.wither_chestplate, "wither_chestplate");
		InventoryItemRender(TechArmor.wither_leggings, "wither_leggings");
		InventoryItemRender(TechArmor.wither_boots, "wither_boots");
		InventoryItemRender(TechArmor.obsidian_helmet, "obsidian_helmet");
		InventoryItemRender(TechArmor.obsidian_chestplate, "obsidian_chestplate");
		InventoryItemRender(TechArmor.obsidian_leggings, "obsidian_leggings");
		InventoryItemRender(TechArmor.obsidian_boots, "obsidian_boots");
	}
	
	public static void initItemHandRenders()
	{
		HandItemRender(TechItems.watering_can, "watering_can");
		HandItemRender(TechItems.watering_can_upgrade, "watering_can_upgrade");
		HandItemRender(TechItems.quartz_dust, "quartz_dust");
		HandItemRender(TechItems.quartz_knife, "quartz_knife");
		HandItemRender(TechItems.mycelium_seeds, "mycelium_seeds");
		HandItemRender(TechItems.diamond_apple, "diamond_apple");
		HandItemRender(TechItems.emerald_apple, "emerald_apple");
		HandItemRender(TechItems.med_kit, "med_kit");	
		HandItemRender(TechItems.stone_dust, "stone_dust");
		HandItemRender(TechItems.flint_ingot, "flint_ingot");
		HandItemRender(TechItems.flint_knife, "flint_knife");
		HandItemRender(TechItems.stone_stick, "stone_stick");
		HandItemRender(TechItems.golden_apple, "golden_apple");
		HandItemRender(TechItems.ender_dust, "ender_dust");
		HandItemRender(TechItems.lava_crystal, "lava_crystal");
		HandItemRender(TechItems.reinforced_obsidian_ingot, "reinforced_obsidian_ingot");
		HandItemRender(TechItems.iron_apple, "iron_apple");
		HandItemRender(TechItems.redstone_apple, "redstone_apple");
		HandItemRender(TechItems.dragon_scale, "dragon_scale");
		HandItemRender(TechItems.wither_rib, "wither_rib");
		HandItemRender(TechItems.pouch, "pouch");
		HandItemRender(TechItems.dead_reed, "dead_reed");
		
		// Glowstone Dust
		HandItemRender(TechItems.black_dust, "black_dust");
		HandItemRender(TechItems.blue_dust, "blue_dust");
		HandItemRender(TechItems.brown_dust, "brown_dust");
		HandItemRender(TechItems.cyan_dust, "cyan_dust");
		HandItemRender(TechItems.gray_dust, "gray_dust");
		HandItemRender(TechItems.green_dust, "green_dust");
		HandItemRender(TechItems.white_dust, "white_dust");
		HandItemRender(TechItems.lightblue_dust, "lightblue_dust");
		HandItemRender(TechItems.lime_dust, "lime_dust");
		HandItemRender(TechItems.magenta_dust, "magenta_dust");
		HandItemRender(TechItems.orange_dust, "orange_dust");
		HandItemRender(TechItems.pink_dust, "pink_dust");
		HandItemRender(TechItems.purple_dust, "purple_dust");
		HandItemRender(TechItems.red_dust, "red_dust");
		HandItemRender(TechItems.silver_dust, "silver_dust");
		
		// Juices
		HandItemRender(TechItems.juicer, "juicer");
		HandItemRender(TechItems.apple_juice, "apple_juice");
		HandItemRender(TechItems.carrot_juice, "carrot_juice");
		HandItemRender(TechItems.potatoe_juice, "potatoe_juice");
		HandItemRender(TechItems.beet_juice, "beet_juice");
		HandItemRender(TechItems.cactus_juice, "cactus_juice");
		HandItemRender(TechItems.slime_juice, "slime_juice");
		HandItemRender(TechItems.wheat_juice, "wheat_juice");
		HandItemRender(TechItems.melon_juice, "melon_juice");
		HandItemRender(TechItems.pumpkin_juice, "pumpkin_juice");
		
		// Bone
		HandItemRender(TechTools.bone_axe, "bone_axe");
		HandItemRender(TechTools.bone_hoe, "bone_hoe");
		HandItemRender(TechTools.bone_pickaxe, "bone_pickaxe");
		HandItemRender(TechTools.bone_spade, "bone_spade");
		HandItemRender(TechTools.bone_sword, "bone_sword");
		// Flint
		HandItemRender(TechTools.flint_axe, "flint_axe");
		HandItemRender(TechTools.flint_hoe, "flint_hoe");
		HandItemRender(TechTools.flint_pickaxe, "flint_pickaxe");
		HandItemRender(TechTools.flint_spade, "flint_spade");
		HandItemRender(TechTools.flint_sword, "flint_sword");
		// Birthday
		HandItemRender(TechTools.birthday_pickaxe, "birthday_pickaxe");
		// Emerald
		HandItemRender(TechTools.emerald_axe, "emerald_axe");
		HandItemRender(TechTools.emerald_hoe, "emerald_hoe");
		HandItemRender(TechTools.emerald_pickaxe, "emerald_pickaxe");
		HandItemRender(TechTools.emerald_spade, "emerald_spade");
		HandItemRender(TechTools.emerald_sword, "emerald_sword");
		// Obsidian
		HandItemRender(TechTools.obsidian_axe, "obsidian_axe");
		HandItemRender(TechTools.obsidian_hoe, "obsidian_hoe");
		HandItemRender(TechTools.obsidian_pickaxe, "obsidian_pickaxe");
		HandItemRender(TechTools.obsidian_spade, "obsidian_spade");
		HandItemRender(TechTools.obsidian_sword, "obsidian_sword");
		// Scythe
		HandItemRender(TechTools.wooden_scythe, "wooden_scythe");
		HandItemRender(TechTools.diamond_scythe, "diamond_scythe");
		HandItemRender(TechTools.emerald_scythe, "emerald_scythe");
		HandItemRender(TechTools.golden_scythe, "golden_scythe");
		HandItemRender(TechTools.iron_scythe, "iron_scythe");
		HandItemRender(TechTools.obsidian_scythe, "obsidian_scythe");
		HandItemRender(TechTools.stone_scythe, "stone_scythe");
		// Multi
		HandItemRender(TechTools.wooden_multi, "wooden_multi");
		HandItemRender(TechTools.diamond_multi, "diamond_multi");
		HandItemRender(TechTools.emerald_multi, "emerald_multi");
		HandItemRender(TechTools.golden_multi, "golden_multi");
		HandItemRender(TechTools.iron_multi, "iron_multi");
		HandItemRender(TechTools.obsidian_multi, "obsidian_multi");
		HandItemRender(TechTools.stone_multi, "stone_multi");
		// Battle
		HandItemRender(TechTools.wooden_battle, "wooden_battle");
		HandItemRender(TechTools.diamond_battle, "diamond_battle");
		HandItemRender(TechTools.emerald_battle, "emerald_battle");
		HandItemRender(TechTools.golden_battle, "golden_battle");
		HandItemRender(TechTools.iron_battle, "iron_battle");
		HandItemRender(TechTools.obsidian_battle, "obsidian_battle");
		HandItemRender(TechTools.stone_battle, "stone_battle");
		// Spear
		HandItemRender(TechTools.wooden_spear, "wooden_spear");
		HandItemRender(TechTools.diamond_spear, "diamond_spear");
		HandItemRender(TechTools.emerald_spear, "emerald_spear");
		HandItemRender(TechTools.golden_spear, "golden_spear");
		HandItemRender(TechTools.iron_spear, "iron_spear");
		HandItemRender(TechTools.obsidian_spear, "obsidian_spear");
		HandItemRender(TechTools.stone_spear, "stone_spear");
		// Armor
		HandItemRender(TechArmor.stone_helmet, "stone_helmet");
		HandItemRender(TechArmor.stone_chestplate, "stone_chestplate");
		HandItemRender(TechArmor.stone_leggings, "stone_leggings");
		HandItemRender(TechArmor.stone_boots, "stone_boots");
		HandItemRender(TechArmor.flint_helmet, "flint_helmet");
		HandItemRender(TechArmor.flint_chestplate, "flint_chestplate");
		HandItemRender(TechArmor.flint_leggings, "flint_leggings");
		HandItemRender(TechArmor.flint_boots, "flint_boots");
		HandItemRender(TechArmor.bone_helmet, "bone_helmet");
		HandItemRender(TechArmor.bone_chestplate, "bone_chestplate");
		HandItemRender(TechArmor.bone_leggings, "bone_leggings");
		HandItemRender(TechArmor.bone_boots, "bone_boots");
		HandItemRender(TechArmor.wooden_helmet, "wooden_helmet");
		HandItemRender(TechArmor.wooden_chestplate, "wooden_chestplate");
		HandItemRender(TechArmor.wooden_leggings, "wooden_leggings");
		HandItemRender(TechArmor.wooden_boots, "wooden_boots");
		HandItemRender(TechArmor.lava_helmet, "lava_helmet");
		HandItemRender(TechArmor.lava_chestplate, "lava_chestplate");
		HandItemRender(TechArmor.lava_leggings, "lava_leggings");
		HandItemRender(TechArmor.lava_boots, "lava_boots");
		HandItemRender(TechArmor.dragon_helmet, "dragon_helmet");
		HandItemRender(TechArmor.dragon_chestplate, "dragon_chestplate");
		HandItemRender(TechArmor.dragon_leggings, "dragon_leggings");
		HandItemRender(TechArmor.dragon_boots, "dragon_boots");
		HandItemRender(TechArmor.wither_helmet, "wither_helmet");
		HandItemRender(TechArmor.wither_chestplate, "wither_chestplate");
		HandItemRender(TechArmor.wither_leggings, "wither_leggings");
		HandItemRender(TechArmor.wither_boots, "wither_boots");
		HandItemRender(TechArmor.obsidian_helmet, "obsidian_helmet");
		HandItemRender(TechArmor.obsidian_chestplate, "obsidian_chestplate");
		HandItemRender(TechArmor.obsidian_leggings, "obsidian_leggings");
		HandItemRender(TechArmor.obsidian_boots, "obsidian_boots");
	}
	
	public static void InventoryBlockRender(Block block, String blockName) {
		if(block != null)
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + blockName, "inventory"));
	}
	
	public static void WorldBlockRender(Block block)
	{
		if(block == null)
			return;	
		
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	  
	public static void InventoryItemRender(Item item, String itemName) {
		if(item != null)
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + itemName, "inventory"));
	}
	
	public static void HandItemRender(Item item, String unusedName)
	{
		if(item == null)
			return;
		
		if(item.getRegistryName() == null)
		{
			System.out.println("===== Tiny-Progressions Error =====");
			System.out.println(String.format("Unable to register ItemModelMesher for %s as it has no registry name!", item.getUnlocalizedName()));
			System.out.println("===== End Tiny-Progressions Error =====");
			return;
		}
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public static void setCustomStateMap(Block block, StateMap stateMap){
		ModelLoader.setCustomStateMapper(block, stateMap);
	}

}
