package com.kashdeya.tinyprogressions.inits;

import com.arclighttw.utilities.client.Renderer;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.FlintKnife;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.items.ItemBaseMeta;
import com.kashdeya.tinyprogressions.items.MedKit;
import com.kashdeya.tinyprogressions.items.MyceliumSeeds;
import com.kashdeya.tinyprogressions.items.Pouch;
import com.kashdeya.tinyprogressions.items.QuartzKnife;
import com.kashdeya.tinyprogressions.items.wateringcan.WateringCan;
import com.kashdeya.tinyprogressions.items.wateringcan.WateringCanUpgrade;
import com.kashdeya.tinyprogressions.main.Reference;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.properties.EnumDustColor;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class TechItems {
	// Watering Cans
	public static Item watering_can;
	public static Item watering_can_upgrade;
	// Quartz Items
	public static Item quartz_knife;
	public static Item quartz_dust;
	// Misc Items
	public static Item mycelium_seeds;
	public static Item med_kit;
	public static Item dead_reed;
	// Stone Dust
	public static Item stone_dust;
	// Ingots
	public static Item flint_ingot;
	public static Item reinforced_obsidian_ingot;
	public static Item lapis_ingot;
	public static Item redstone_ingot;
	public static Item quartz_ingot;
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
	// Pouch
	public static Item pouch;
	// Glowstone Dust
	public static Item colored_dust;
	
	public static void init() {

		// Watering Cans
		if (ConfigHandler.WateringCan) {
			watering_can = new WateringCan();
			registerItem(watering_can, "watering_can");
		}
		if (ConfigHandler.WateringCanUpgrade) {
			watering_can_upgrade = new WateringCanUpgrade();
			registerItem(watering_can_upgrade, "watering_can_upgrade");
		}
		
		// Quartz Items
		if (ConfigHandler.QuartzKnife) {
			quartz_knife = new QuartzKnife();
			registerItem(quartz_knife, "quartz_knife");
			quartz_dust = new ItemBase().setUnlocalizedName("quartz_dust");
			registerItem(quartz_dust, "quartz_dust");
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
		}
		if (ConfigHandler.MyceliumSeeds) {
			mycelium_seeds = new MyceliumSeeds();
			registerItem(mycelium_seeds, "mycelium_seeds");
		}
		if (ConfigHandler.old_reed){
	    		dead_reed = new ItemBase().setUnlocalizedName("dead_reed");
		    registerItem(dead_reed, "dead_reed");
	    }
		
		// Medkit
		if (ConfigHandler.MedKit) {
			med_kit = new MedKit();
			registerItem(med_kit, "med_kit");
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
		}
		if (ConfigHandler.ReinforcedObsidian) {
			reinforced_obsidian_ingot = new ItemBase().setUnlocalizedName("reinforced_obsidian_ingot");
			registerItem(reinforced_obsidian_ingot, "reinforced_obsidian_ingot");
		}
		
		// Flint Knife
		if (ConfigHandler.FlintKnife) {
			flint_knife = new FlintKnife();
			registerItem(flint_knife, "flint_knife");
		}
		
		// Ender Dust
		if (ConfigHandler.ender_ore) {
			ender_dust = new ItemBase().setUnlocalizedName("ender_dust");
			registerItem(ender_dust, "ender_dust");
		}
		if (ConfigHandler.lava_ore) {
			lava_crystal = new ItemBase().setUnlocalizedName("lava_crystal");
			registerItem(lava_crystal, "lava_crystal");
		}
		
		// Pouch
		if (ConfigHandler.pouch) {
			pouch = new Pouch().setUnlocalizedName("pouch");
		    registerItem(pouch, "pouch");
		}
		
	    // Glowstone Dust
	    if (ConfigHandler.ColorGlowstone){
	    	colored_dust = new ItemBaseMeta(EnumDustColor.getNames());
	    	registerItem(colored_dust, "coloured_dust");
	    }
	    
	    // Lapis armor
	    if (ConfigHandler.lapis_armor){
	    	lapis_ingot = new ItemBase().setUnlocalizedName("lapis_ingot");
	    	registerItem(lapis_ingot, "lapis_ingot");
	    }
	    
	    // Redstone Amor
	    if (ConfigHandler.redstone_armor){
	    	redstone_ingot = new ItemBase().setUnlocalizedName("redstone_ingot");
	    	registerItem(redstone_ingot, "redstone_ingot");
	    }
	    
	    // Quartz Amor
	    if (ConfigHandler.quartz_armor){
	    	quartz_ingot = new ItemBase().setUnlocalizedName("quartz_ingot");
	    	registerItem(quartz_ingot, "quartz_ingot");
	    }
	}
	
	public static void render() {

		// Watering Cans
		if (ConfigHandler.WateringCan) {
			renderItem(watering_can, "watering_can");
		}
		if (ConfigHandler.WateringCanUpgrade) {
			renderItem(watering_can_upgrade, "watering_can_upgrade");
		}
		
		// Armor
		if (ConfigHandler.lapis_armor) {
			renderItem(lapis_ingot, "lapis_ingot");
		}
		if (ConfigHandler.redstone_armor) {
			renderItem(redstone_ingot, "redstone_ingot");
		}
		if (ConfigHandler.quartz_armor) {
			renderItem(quartz_ingot, "quartz_ingot");
		}
		
		// Quartz Items
		if (ConfigHandler.QuartzKnife) {
			renderItem(quartz_knife, "quartz_knife");
			renderItem(quartz_dust, "quartz_dust");
		}
		
	    // Drops
	    if (ConfigHandler.dragon_armor){
	    		renderItem(dragon_scale, "dragon_scale");
	    }
	    if (ConfigHandler.wither_armor){
		    renderItem(wither_rib, "wither_rib");
	    }
	    
		// Misc Items
		if (ConfigHandler.StoneTorch) {
			renderItem(stone_stick, "stone_stick");
		}
		if (ConfigHandler.MyceliumSeeds) {
			renderItem(mycelium_seeds, "mycelium_seeds");
		}
		if (ConfigHandler.old_reed){
			renderItem(dead_reed, "dead_reed");
	    }
		
		// Medkit
		if (ConfigHandler.MedKit) {
			renderItem(med_kit, "med_kit");
		}
		
		// Stone Dust
		if (ConfigHandler.StoneDust) {
			renderItem(stone_dust, "stone_dust");
		}
		
		// Ingot
		if (ConfigHandler.FlintArmor) {
			renderItem(flint_ingot, "flint_ingot");
		}
		if (ConfigHandler.ReinforcedObsidian) {
			renderItem(reinforced_obsidian_ingot, "reinforced_obsidian_ingot");
		}
		
		// Flint Knife
		if (ConfigHandler.FlintKnife) {
			renderItem(flint_knife, "flint_knife");
		}
		
		// Ender Dust
		if (ConfigHandler.ender_ore) {
			renderItem(ender_dust, "ender_dust");
		}
		if (ConfigHandler.lava_ore) {
			renderItem(lava_crystal, "lava_crystal");
		}
		
		// Pouch
		if (ConfigHandler.pouch) {
			renderItem(pouch, "pouch");
		}
		
	    // Glowstone Dust
	    if (ConfigHandler.ColorGlowstone){
	    		for(int i = 0; i < EnumDustColor.getNames().length; i++)
	    			TinyProgressions.instance.render(new Renderer(colored_dust, i, new ResourceLocation(Reference.MOD_ID, EnumDustColor.getNames()[i])));
	    }
	}

	public static void registerItem(Item item, String name) {
		item.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + name));
		TinyProgressions.instance.register(item);
	}
	
	public static void renderItem(Item item, String unusedString)
	{
		TinyProgressions.instance.render(new Renderer(item));
	}

}
