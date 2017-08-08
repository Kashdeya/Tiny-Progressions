package com.kashdeya.tinyprogressions.inits;

import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.crafting.Recipes;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.FlintKnife;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.items.MedKit;
import com.kashdeya.tinyprogressions.items.MyceliumSeeds;
import com.kashdeya.tinyprogressions.items.QuartzKnife;
import com.kashdeya.tinyprogressions.items.apple.DiamondApple;
import com.kashdeya.tinyprogressions.items.apple.EmeraldApple;
import com.kashdeya.tinyprogressions.items.apple.GoldenApple;
import com.kashdeya.tinyprogressions.items.apple.IronApple;
import com.kashdeya.tinyprogressions.items.apple.RedstoneApple;
import com.kashdeya.tinyprogressions.items.wateringcan.WateringCan;
import com.kashdeya.tinyprogressions.items.wateringcan.WateringCanUpgrade;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TechItems {

	static Set<Item> items = Sets.newHashSet();

	// Watering Cans
	public static Item watering_can;
	public static Item watering_can_upgrade;
	// Quartz Items
	public static Item quartz_knife;
	public static Item quartz_dust;
	// Misc Items
	public static Item mycelium_seeds;
	public static Item golden_apple;
	public static Item diamond_apple;
	public static Item emerald_apple;
	public static Item iron_apple;
	public static Item redstone_apple;
	public static Item med_kit;
	// Stone Dust
	public static Item stone_dust;
	// Ingots
	public static Item flint_ingot;
	public static Item reinforced_obsidian_ingot;
	// Flint Knife
	public static Item flint_knife;
	// Stone Stick
	public static Item stone_stick;
	// Ender
	public static Item ender_dust;
	// Lava Crystal
	public static Item lava_crystal;
	// Drops
	public static Item wither_rib;
	public static Item dragon_scale;
		
	public static void init() {

		// Watering Cans
		if (ConfigHandler.WateringCan) {
			watering_can = new WateringCan();
			registerItem(watering_can, "watering_can");
			
			Recipes.addShapedRecipe("watering_can", new ItemStack(watering_can), new Object[] {
					"id ",
					"iwi",
					" i ",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('d'), "dyeWhite",
						Character.valueOf('w'), Items.WATER_BUCKET
			});
		}
		if (ConfigHandler.WateringCanUpgrade) {
			watering_can_upgrade = new WateringCanUpgrade();
			registerItem(watering_can_upgrade, "watering_can_upgrade");
			
			Recipes.addShapedRecipe("watering_can_upgrade", new ItemStack(watering_can_upgrade), new Object[] {
					"on ",
					"owo",
					" o ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('n'), "netherStar",
						Character.valueOf('w'), watering_can
			});
		}
		// Quartz Items
		if (ConfigHandler.QuartzKnife) {
			quartz_knife = new QuartzKnife();
			registerItem(quartz_knife, "quartz_knife");
			
			Recipes.addShapedRecipe("quartz_knife", new ItemStack(quartz_knife), new Object[] {
					"  s",
					" s ",
					"q  ",
						Character.valueOf('s'), "stickWood",
						Character.valueOf('q'), "gemQuartz"
			});
			
			quartz_dust = new ItemBase().setUnlocalizedName("quartz_dust");
			registerItem(quartz_dust, "quartz_dust");
			
			Recipes.addShapedRecipe("quartz_dust", new ItemStack(quartz_dust), new Object[] {
					"k",
					"q",
						Character.valueOf('k'), quartz_knife,
						Character.valueOf('q'), "gemQuartz"
			});
		}
	    // Drops
	    if (ConfigHandler.dragon_armor){
		    dragon_scale = new ItemBase().setUnlocalizedName("dragon_scale");
		    registerItem(dragon_scale, "dragon_scale");
	    }
	    if (ConfigHandler.wither_armor){
		    wither_rib = new ItemBase().setUnlocalizedName("wither_rib");
		    registerItem(wither_rib, "wither_rib");
	    }
		// Misc Items
		if (ConfigHandler.StoneTorch) {
			stone_stick = new ItemBase().setUnlocalizedName("stone_stick");
			registerItem(stone_stick, "stone_stick");
			
			Recipes.addShapedRecipe("stone_stick", new ItemStack(stone_stick, 4), new Object[] {
					"c",
					"c",
						Character.valueOf('c'), "cobblestone"
			});
		}
		if (ConfigHandler.MyceliumSeeds) {
			mycelium_seeds = new MyceliumSeeds();
			registerItem(mycelium_seeds, "mycelium_seeds");
			
			Recipes.addShapedRecipe("mycelium_seeds", new ItemStack(mycelium_seeds), new Object[] {
					"sss",
					"ses",
					"sss",
						Character.valueOf('s'), Items.WHEAT_SEEDS,
						Character.valueOf('e'), Items.SPIDER_EYE
			});
		}
		if (ConfigHandler.DiamondApple) {
			diamond_apple = new DiamondApple(4, 1.2F, false);
			registerItem(diamond_apple, "diamond_apple");
			
			Recipes.addShapedRecipe("diamond_apple", new ItemStack(diamond_apple), new Object[] {
					"ddd",
					"dad",
					"ddd",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.EmeraldApple) {
			emerald_apple = new EmeraldApple(4, 1.2F, false);
			registerItem(emerald_apple, "emerald_apple");
			
			Recipes.addShapedRecipe("emerald_apple", new ItemStack(emerald_apple), new Object[] {
					"eee",
					"eae",
					"eee",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.iron_apple) {
			iron_apple = new IronApple(4, 1.2F, false);
			registerItem(iron_apple, "iron_apple");
			
			Recipes.addShapedRecipe("iron_apple", new ItemStack(iron_apple), new Object[] {
					"iii",
					"iai",
					"iii",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('a'), Items.APPLE
			});
		}
 		if (ConfigHandler.redstone_apple) {
			redstone_apple = new RedstoneApple(4, 1.2F, false);
			registerItem(redstone_apple, "redstone_apple");
			
			Recipes.addShapedRecipe("redstone_apple", new ItemStack(redstone_apple), new Object[] {
					"rrr",
					"rar",
					"rrr",
						Character.valueOf('r'), "dustRedstone",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.ApplePro) {
			golden_apple = new GoldenApple(4, 1.2F, false);
			registerItem(golden_apple, "golden_apple");
			
			Recipes.addShapedRecipe("golden_apple", new ItemStack(golden_apple), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "ingotGold",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.MedKit) {
			med_kit = new MedKit();
			registerItem(med_kit, "med_kit");
			
			Recipes.addShapedRecipe("med_kit", new ItemStack(med_kit), new Object[] {
					"prp",
					"rgr",
					"lrl",
						Character.valueOf('p'), "paper",
						Character.valueOf('r'), "dyeRed",
						Character.valueOf('l'), "leather",
						Character.valueOf('g'), Items.SPECKLED_MELON
			});
		}
		// Stone Dust
		if (ConfigHandler.StoneDust) {
			stone_dust = new ItemBase().setUnlocalizedName("stone_dust");
			registerItem(stone_dust, "stone_dust");
		}
		// Ingot
		if (ConfigHandler.FlintArmor) {
			flint_ingot = new ItemBase().setUnlocalizedName("flint_ingot");
			registerItem(flint_ingot, "flint_ingot");
			
			GameRegistry.addSmelting(TechBlocks.flint_block, new ItemStack(flint_ingot), 1.0F);
		}
		if (ConfigHandler.ReinforcedObsidian) {
			reinforced_obsidian_ingot = new ItemBase().setUnlocalizedName("reinforced_obsidian_ingot");
			registerItem(reinforced_obsidian_ingot, "reinforced_obsidian_ingot");
			
			GameRegistry.addSmelting(TechBlocks.reinforced_obsidian, new ItemStack(reinforced_obsidian_ingot), 1.0F);
		}
		// Flint Knife
		if (ConfigHandler.FlintKnife) {
			flint_knife = new FlintKnife();
			registerItem(flint_knife, "flint_knife");
			
			Recipes.addShapelessRecipe("flint_knife", new ItemStack(flint_knife), new Object[] {
					"flint", "flint", "stickWood"
			});
		}
		// Ender Dust
		if (ConfigHandler.ender_ore) {
			ender_dust = new ItemBase().setUnlocalizedName("ender_dust");
			registerItem(ender_dust, "ender_dust");
			
			Recipes.addShapedRecipe("ender_pearl", new ItemStack(Items.ENDER_PEARL), new Object[] {
					"eee",
					"e e",
					"eee",
						Character.valueOf('e'), "enderDust"
			});
		}
		if (ConfigHandler.lava_ore) {
			lava_crystal = new ItemBase().setUnlocalizedName("lava_crystal");
			registerItem(lava_crystal, "lava_crystal");
		}
	}

	public static void registerItems(RegistryEvent.Register<Item> event) {
		Iterator<Item> i = items.iterator();

		while (i.hasNext()) {
			event.getRegistry().register(i.next());
		}
	}

	static void registerItem(Item item, String name) {
		item.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + name));
		items.add(item);
	}

}
