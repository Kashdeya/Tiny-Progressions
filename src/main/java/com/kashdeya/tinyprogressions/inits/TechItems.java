package com.kashdeya.tinyprogressions.inits;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.DiamondApple;
import com.kashdeya.tinyprogressions.items.EmeraldApple;
import com.kashdeya.tinyprogressions.items.FlintKnife;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.items.MedKit;
import com.kashdeya.tinyprogressions.items.MyceliumSeeds;
import com.kashdeya.tinyprogressions.items.QuartzKnife;
import com.kashdeya.tinyprogressions.items.WateringCan;
import com.kashdeya.tinyprogressions.items.WateringCanUpgrade;
import com.kashdeya.tinyprogressions.main.Reference;

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
			registerItem(WateringCan, "WateringCan");
		}
		if (ConfigHandler.WateringCanUpgrade){
			WateringCanUpgrade = new WateringCanUpgrade();
			registerItem(WateringCanUpgrade, "WateringCanUpgrade");
		}
		// Quartz Items
	    if (ConfigHandler.QuartzKnife){
	    	QuartzKnife = new QuartzKnife();
	    	registerItem(QuartzKnife, "QuartzKnife");
	    	QuartzDust = new ItemBase().setUnlocalizedName("QuartzDust");
	    	registerItem(QuartzDust, "QuartzDust");
	    }
	    // Misc Items
	    if (ConfigHandler.MyceliumSeeds){
	    	MyceliumSeeds = new MyceliumSeeds();
	    	registerItem(MyceliumSeeds, "MyceliumSeeds");
	    }
	    if (ConfigHandler.DiamondApple){
	    	DiamondApple = new DiamondApple(4, 1.2F, false);
	    	registerItem(DiamondApple, "DiamondApple");
	    }
	    if (ConfigHandler.EmeraldApple){
	    	EmeraldApple = new EmeraldApple(4, 1.2F, false);
	    	registerItem(EmeraldApple, "EmeraldApple");
	    }
	    if (ConfigHandler.MedKit){
	    	MedKit = new MedKit();
	    	registerItem(MedKit, "MedKit");
	    }
	    // Stone Dust
	    if (ConfigHandler.StoneDust){
	    	StoneDust = new ItemBase().setUnlocalizedName("StoneDust");
			registerItem(StoneDust, "StoneDust");
		}
	    // Flint Armor Ingot
	    if (ConfigHandler.FlintArmor){
	    	FlintIngot = new ItemBase().setUnlocalizedName("FlintIngot");
			registerItem(FlintIngot, "FlintIngot");
		}
	    // Flint Knife
	    if (ConfigHandler.FlintKnife){
			FlintKnife = new FlintKnife();
			registerItem(FlintKnife, "FlintKnife");
	    }
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}

}
