package com.kashdeya.tinyprogressions.inits;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.BirthdayPickaxe;
import com.kashdeya.tinyprogressions.items.DiamondApple;
import com.kashdeya.tinyprogressions.items.MedKit;
import com.kashdeya.tinyprogressions.items.MyceliumSeeds;
import com.kashdeya.tinyprogressions.items.QuartzDust;
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
	// Flint Items
	public static Item FlintIngot;
	// Flint Tool & Weapon Heads
	public static Item FlintPickaxeHead;
	public static Item FlintAxeHead;
	public static Item FlintSpadeHead;
	public static Item FlintSwordHead;
	public static Item FlintHoeHead;
	
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
	    }
	    if (ConfigHandler.QuartzDust){
	    	QuartzDust = new QuartzDust();
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
	    // Flint Items

	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}

}
