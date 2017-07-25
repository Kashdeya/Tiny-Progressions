package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.FlintKnife;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.items.MedKit;
import com.kashdeya.tinyprogressions.items.MyceliumSeeds;
import com.kashdeya.tinyprogressions.items.QuartzKnife;
import com.kashdeya.tinyprogressions.items.apple.DiamondApple;
import com.kashdeya.tinyprogressions.items.apple.EmeraldApple;
import com.kashdeya.tinyprogressions.items.apple.GoldenApple;
import com.kashdeya.tinyprogressions.items.wateringcan.WateringCan;
import com.kashdeya.tinyprogressions.items.wateringcan.WateringCanUpgrade;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TechItems {
	
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
	
	public static void init(){
		
		// Watering Cans
		if (ConfigHandler.WateringCan){
			watering_can = new WateringCan();
			registerItem(watering_can, "watering_can");
		}
		if (ConfigHandler.WateringCanUpgrade){
			watering_can_upgrade = new WateringCanUpgrade();
			registerItem(watering_can_upgrade, "watering_can_upgrade");
		}
		// Quartz Items
	    if (ConfigHandler.QuartzKnife){
	    	quartz_knife = new QuartzKnife();
	    	registerItem(quartz_knife, "quartz_knife");
	    	quartz_dust = new ItemBase().setUnlocalizedName("quartz_dust");
	    	registerItem(quartz_dust, "quartz_dust");
	    }
	    // Misc Items
	    if (ConfigHandler.StoneTorch){
	    	stone_stick = new ItemBase().setUnlocalizedName("stone_stick");
	    	registerItem(stone_stick, "stone_stick");
	    }	    	
	    if (ConfigHandler.MyceliumSeeds){
	    	mycelium_seeds = new MyceliumSeeds();
	    	registerItem(mycelium_seeds, "mycelium_seeds");
	    }
	    if (ConfigHandler.DiamondApple){
	    	diamond_apple = new DiamondApple(4, 1.2F, false);
	    	registerItem(diamond_apple, "diamond_apple");
	    }
	    if (ConfigHandler.EmeraldApple){
	    	emerald_apple = new EmeraldApple(4, 1.2F, false);
	    	registerItem(emerald_apple, "emerald_apple");
	    }
	    if (ConfigHandler.ApplePro){
	    	golden_apple = new GoldenApple(4, 1.2F, false);
	    	registerItem(golden_apple, "golden_apple");
	    }
	    if (ConfigHandler.MedKit){
	    	med_kit = new MedKit();
	    	registerItem(med_kit, "med_kit");
	    }
	    // Stone Dust
	    if (ConfigHandler.StoneDust){
	    	stone_dust = new ItemBase().setUnlocalizedName("stone_dust");
			registerItem(stone_dust, "stone_dust");
		}
	    // Ingot
	    if (ConfigHandler.FlintArmor){
	    	flint_ingot = new ItemBase().setUnlocalizedName("flint_ingot");
			registerItem(flint_ingot, "flint_ingot");
		}
	    if (ConfigHandler.ReinforcedObsidian){
	    	reinforced_obsidian_ingot = new ItemBase().setUnlocalizedName("reinforced_obsidian_ingot");
			registerItem(reinforced_obsidian_ingot, "reinforced_obsidian_ingot");
		}
	    // Flint Knife
	    if (ConfigHandler.FlintKnife){
	    	flint_knife = new FlintKnife();
			registerItem(flint_knife, "flint_knife");
	    }
	    // Ender Dust
	    if (ConfigHandler.ender_ore){
			ender_dust = new ItemBase().setUnlocalizedName("ender_dust");
		    registerItem(ender_dust, "ender_dust");
		}
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}

}
