package com.kashdeya.tinyprogressions.inits;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.SimpleHandler;
import com.kashdeya.tinyprogressions.items.BirthdayPickaxe;
import com.kashdeya.tinyprogressions.items.DiamondApple;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.items.ItemHammer;
import com.kashdeya.tinyprogressions.items.ItemJuicer;
import com.kashdeya.tinyprogressions.items.ItemKnife;
import com.kashdeya.tinyprogressions.items.MedKit;
import com.kashdeya.tinyprogressions.items.MixingBowl;
import com.kashdeya.tinyprogressions.items.MortarPestle;
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
	// Pickaxe
	public static Item BirthdayPickaxe;
	// Misc Items
	public static Item MyceliumSeeds;
	public static Item DiamondApple;
	public static Item MedKit;
	// Stone Dust
	public static Item StoneDust;
	// Flint Armor Ingot
	public static Item FlintIngot;
	// Basic Items
	public static Item ItemKnife;
	public static Item ItemJuicer;
	public static Item ItemHammer;
	public static Item UnfiredMortar;
	public static Item FiredMortar;
	public static Item MortarPestle;
	public static Item MixingBowl;
	
	public static final Item.ToolMaterial BIRTHDAY = EnumHelper.addToolMaterial("birthdayToolMaterial", 4, 3061, 45.0F, 4.0F, 25);
	
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
	    	QuartzDust = new ItemBase().setUnlocalizedName("QuartzDust");;
	    	registerItem(QuartzDust, "QuartzDust");
	    }
	    // Pickaxe
	    if (ConfigHandler.BirthdayPickaxe){
	    	BirthdayPickaxe = new BirthdayPickaxe(BIRTHDAY);
			registerItem(BirthdayPickaxe, "BirthdayPickaxe");
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
	    if (ConfigHandler.MedKit){
	    	MedKit = new MedKit();
	    	registerItem(MedKit, "MedKit");
	    }
	    // Stone Dust
	    if (ConfigHandler.StoneDust){
	    	StoneDust = new ItemBase().setUnlocalizedName("StoneDust");;
			registerItem(StoneDust, "StoneDust");
		}
	    // Flint Armor Ingot
	    if (ConfigHandler.FlintArmor){
	    	FlintIngot = new ItemBase().setUnlocalizedName("FlintIngot");;
			registerItem(FlintIngot, "FlintIngot");
		}
	    // Simple Upgrades
	    if (SimpleHandler.ItemKnife){
	    	ItemKnife = new ItemKnife();
	    	registerItem(ItemKnife, "ItemKnife");
	    }
	    if (SimpleHandler.ItemJuicer){
	    	ItemJuicer = new ItemJuicer();
	    	registerItem(ItemJuicer, "ItemJuicer");
	    }
	    if (SimpleHandler.ItemHammer){
	    	ItemHammer = new ItemHammer();
	    	registerItem(ItemHammer, "ItemHammer");
	    }
	    if (SimpleHandler.MortarPestle){
	    	UnfiredMortar = new ItemBase().setUnlocalizedName("UnfiredMortar");
	    	registerItem(UnfiredMortar, "UnfiredMortar");
	    	FiredMortar = new ItemBase().setUnlocalizedName("FiredMortar");
	    	registerItem(FiredMortar, "FiredMortar");
	    	MortarPestle = new MortarPestle();
	    	registerItem(MortarPestle, "MortarPestle");
	    }
	    if (SimpleHandler.MixingBowl){
	    	MixingBowl = new MixingBowl();
	    	registerItem(MixingBowl, "MixingBowl");
	    }

	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}

}
