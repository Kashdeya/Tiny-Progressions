package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.*;
import com.kashdeya.tinyprogressions.main.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TechItems {
	
	// Watering Cans
	public static Item WateringCan;
	public static Item WateringCanUpgrade;
	// Quartz Items
	public static Item QuartzKnife;
	public static Item QuartzDust;
	// Misc Items
	public static Item MyceliumSeeds;
	public static Item DiamondApple;
	public static Item EmeraldApple;
	public static Item MedKit;
	// Stone Dust
	public static Item StoneDust;
	// Flint Armor Ingot
	public static Item FlintIngot;
	// Flint Knife
	public static Item FlintKnife;

	public static void init(){
		
		// Watering Cans
		if (ConfigHandler.WateringCan){
			WateringCan = new WateringCan();
			registerItem(WateringCan, "watering_can");
		}
		if (ConfigHandler.WateringCanUpgrade){
			WateringCanUpgrade = new WateringCanUpgrade();
			registerItem(WateringCanUpgrade, "watering_can_upgrade");
		}
		// Quartz Items
	    if (ConfigHandler.QuartzKnife){
	    	QuartzKnife = new QuartzKnife();
	    	registerItem(QuartzKnife, "quartz_knife");
	    	QuartzDust = new ItemBase().setUnlocalizedName("quartz_dust");
	    	registerItem(QuartzDust, "quartz_dust");
	    }
	    // Misc Items
	    if (ConfigHandler.MyceliumSeeds){
	    	MyceliumSeeds = new MyceliumSeeds();
	    	registerItem(MyceliumSeeds, "mycelium_seeds");
	    }
	    if (ConfigHandler.DiamondApple){
	    	DiamondApple = new DiamondApple(4, 1.2F, false);
	    	registerItem(DiamondApple, "diamond_apple");
	    }
	    if (ConfigHandler.EmeraldApple){
	    	EmeraldApple = new EmeraldApple(4, 1.2F, false);
	    	registerItem(EmeraldApple, "emerald_apple");
	    }
	    if (ConfigHandler.MedKit){
	    	MedKit = new MedKit();
	    	registerItem(MedKit, "med_kit");
	    }
	    // Stone Dust
	    if (ConfigHandler.StoneDust){
	    	StoneDust = new ItemBase().setUnlocalizedName("stone_dust");
			registerItem(StoneDust, "stone_dust");
		}
	    // Flint Armor Ingot
	    if (ConfigHandler.FlintArmor){
	    	FlintIngot = new ItemBase().setUnlocalizedName("flint_ingot");
			registerItem(FlintIngot, "flint_ingot");
		}
	    // Flint Knife
	    if (ConfigHandler.FlintKnife){
			FlintKnife = new FlintKnife();
			registerItem(FlintKnife, "flint_knife");
	    }
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));

	    TPMigration.addUnderscoreNameToMapUnderscorelessName(name);
	}

}
