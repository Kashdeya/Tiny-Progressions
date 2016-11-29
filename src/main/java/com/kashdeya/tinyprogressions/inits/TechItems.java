package com.kashdeya.tinyprogressions.inits;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.BirthdayPickaxe;
import com.kashdeya.tinyprogressions.items.QuartzDust;
import com.kashdeya.tinyprogressions.items.QuartzKnife;
import com.kashdeya.tinyprogressions.items.WateringCan;
import com.kashdeya.tinyprogressions.items.WateringCanUpgrade;
import com.kashdeya.tinyprogressions.main.Reference;

public class TechItems {
	
	// Tech Items
	public static Item WateringCan;
	public static Item WateringCanUpgrade;
	public static Item QuartzKnife;
	public static Item QuartzDust;
	public static Item BirthdayPickaxe;
	
	public static final Item.ToolMaterial BIRTHDAY = EnumHelper.addToolMaterial("birthdayToolMaterial", 3, 3061, 45.0F, 12.0F, 25);
	
	public static void init(){
		
		// Tech Items
		if (ConfigHandler.WateringCan = true){
			WateringCan = new WateringCan();
			registerItem(WateringCan, "WateringCan");
		}
		if (ConfigHandler.WateringCanUpgrade = true){
			WateringCanUpgrade = new WateringCanUpgrade();
			registerItem(WateringCanUpgrade, "WateringCanUpgrade");
		}
	    if (ConfigHandler.QuartzKnife = true){
	    	QuartzKnife = new QuartzKnife();
	    	registerItem(QuartzKnife, "QuartzKnife");
	    }
	    if (ConfigHandler.QuartzDust = true){
	    	QuartzDust = new QuartzDust();
	    	registerItem(QuartzDust, "QuartzDust");
	    }
	    if (ConfigHandler.BirthdayPickaxe = true){
	    	BirthdayPickaxe = new BirthdayPickaxe(BIRTHDAY);
			registerItem(BirthdayPickaxe, "BirthdayPickaxe");
		}
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}

}
