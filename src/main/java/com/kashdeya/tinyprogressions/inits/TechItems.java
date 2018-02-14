package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.FoodBase;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.items.ItemBaseMeta;
import com.kashdeya.tinyprogressions.items.ItemStay;
import com.kashdeya.tinyprogressions.items.misc.FlintKnife;
import com.kashdeya.tinyprogressions.items.misc.InfinBucket;
import com.kashdeya.tinyprogressions.items.misc.ItemRib;
import com.kashdeya.tinyprogressions.items.misc.ItemScale;
import com.kashdeya.tinyprogressions.items.misc.MedKit;
import com.kashdeya.tinyprogressions.items.misc.MyceliumSeeds;
import com.kashdeya.tinyprogressions.items.misc.Pouch;
import com.kashdeya.tinyprogressions.items.misc.QuartzKnife;
import com.kashdeya.tinyprogressions.items.misc.RepairTablet;
import com.kashdeya.tinyprogressions.items.wateringcan.WateringCan;
import com.kashdeya.tinyprogressions.items.wateringcan.WateringCanUpgrade;
import com.kashdeya.tinyprogressions.properties.EnumDustColor;

import net.minecraft.item.Item;

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
	// Drops
	public static Item wither_rib;
	public static Item dragon_scale;
	// Pouch
	public static Item pouch;
	// Glowstone Dust
	public static Item colored_dust;
	// Repair Tablet
	public static Item repair_tablet;
	// nether rod
	public static Item nether_rod;
	// bsc rod
	public static Item bsc_rod;
	// tiny coal & charcoal
	public static Item tiny_coal;
	public static Item tiny_charcoal;
	// chainmail
	public static Item chainmail_part;
	public static Item stone_hammer;
	// Steel
	public static Item steel_ingot;
	// Infin Water Bucket
	public static Item infin_bucket;
	// Dust
	public static Item obsidian_dust;
		
	public static void init() {
		// Infin Water Bucket
		if (ConfigHandler.infin_bucket){
			infin_bucket = new InfinBucket().setUnlocalizedName("infin_bucket");
		}
		
		// Steel
		if (ConfigHandler.steel_ingot) {
			steel_ingot = new ItemBase().setOreDictName("ingotSteel").setUnlocalizedName("steel_ingot");
		}
		// nether rod
		if (ConfigHandler.nether_rod){
			nether_rod = new ItemBase().setOreDictName("stickNether").setUnlocalizedName("nether_rod");
		}
		// Chainmail
		if (ArmorHandler.chain_armor){
			chainmail_part = new ItemBase().setOreDictName("chainmail").setUnlocalizedName("chainmail_part");
		}
		// bsc rod
		if (ConfigHandler.bsc_rod){
			bsc_rod = new ItemBase().setOreDictName("stickCane").setUnlocalizedName("bsc_rod");
		}
		
		// Watering Cans
		if (ConfigHandler.WateringCan) {
			watering_can = new WateringCan();
		}
		if (ConfigHandler.WateringCanUpgrade) {
			watering_can_upgrade = new WateringCanUpgrade();
		}
		
		// Quartz Items
		if (ConfigHandler.QuartzKnife) {
			quartz_knife = new QuartzKnife();
			quartz_dust = new ItemBase().setUnlocalizedName("quartz_dust");
		}
		
	    // Drops
	    if (ArmorHandler.dragon_armor){
		    dragon_scale = new ItemScale().setOreDictName("dragonScale").setUnlocalizedName("dragon_scale");
	    }
	    if (ArmorHandler.wither_armor || ConfigHandler.wither_rib){
		    wither_rib = new ItemRib().setOreDictName("witherRib").setUnlocalizedName("wither_rib");
	    }
	    
		// Misc Items
		if (ConfigHandler.StoneTorch) {
			stone_stick = new ItemBase().setOreDictName("stickStone").setUnlocalizedName("stone_stick");
		}
		if (ConfigHandler.MyceliumSeeds) {
			mycelium_seeds = new MyceliumSeeds();
		}
		if (ConfigHandler.old_reed){
	    		dead_reed = new FoodBase(1, 0.15F, false).setOreDictName("sugarcane").setUnlocalizedName("dead_reed");
	    }
		
		// Medkit
		if (ConfigHandler.MedKit) {
			med_kit = new MedKit();
		}
		
		// Tiny Coal & Charcoal
		if (ConfigHandler.tiny_charcoal){
			tiny_charcoal = new ItemBase().setOreDictName("dustCharcoal").setUnlocalizedName("tiny_charcoal");
		}
		if (ConfigHandler.tiny_coal){
			tiny_coal = new ItemBase().setOreDictName("dustCoal").setUnlocalizedName("tiny_coal");
		}
		
		// Stone Dust
		if (ConfigHandler.StoneDust) {
			stone_dust = new ItemBase().setUnlocalizedName("stone_dust");
		}
		
		// Ingot
		if (ArmorHandler.FlintArmor) {
			flint_ingot = new ItemBase().setOreDictName("ingotFlint").setUnlocalizedName("flint_ingot");
		}
		if (ConfigHandler.ReinforcedObsidian) {
			reinforced_obsidian_ingot = new ItemBase().setOreDictName("ingotReinforcedObsidian").setUnlocalizedName("reinforced_obsidian_ingot");
		}
		
		// Flint Knife
		if (ConfigHandler.FlintKnife) {
			flint_knife = new FlintKnife();
		}
		
		// Ender Dust
		if (ConfigHandler.ender_ore) {
			ender_dust = new ItemBase().setOreDictName("dustEnder").setUnlocalizedName("ender_dust");
		}
		
		// Pouch
		if (ConfigHandler.pouch) {
			pouch = new Pouch().setUnlocalizedName("pouch");
		}
		
	    // Glowstone Dust
	    if (ConfigHandler.ColorGlowstone){
	    	colored_dust = new ItemBaseMeta(EnumDustColor.getNames());
	    }
	    
	    // Lapis armor
	    if (ArmorHandler.lapis_armor){
	    	lapis_ingot = new ItemBase().setOreDictName("ingotLapis").setUnlocalizedName("lapis_ingot");
	    }
	    
	    // Redstone Amor
	    if (ArmorHandler.redstone_armor){
	    	redstone_ingot = new ItemBase().setOreDictName("ingotRedstone").setUnlocalizedName("redstone_ingot");
	    }
	    
	    // Quartz Amor
	    if (ArmorHandler.quartz_armor){
	    	quartz_ingot = new ItemBase().setOreDictName("ingotQuartz").setUnlocalizedName("quartz_ingot");
	    }
	    
	    // Repair Tablet
	    if (ConfigHandler.repair_tablet){
	    	repair_tablet = new RepairTablet().setUnlocalizedName("repair_tablet");
	    }
	    
	    // Can not be turned off
	    obsidian_dust = new ItemBase().setOreDictName("dustObsidian").setUnlocalizedName("obsidian_dust");
	    stone_hammer = new ItemStay().setUnlocalizedName("stone_hammer");
	}
}
