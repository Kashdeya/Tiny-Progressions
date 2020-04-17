package com.kashdeya.tinyprogressions.inits;

import java.util.function.Supplier;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.items.ItemStay;
import com.kashdeya.tinyprogressions.items.medkits.LargeBandage;
import com.kashdeya.tinyprogressions.items.medkits.LargeMedKit;
import com.kashdeya.tinyprogressions.items.medkits.SmallBandage;
import com.kashdeya.tinyprogressions.items.medkits.SmallMedkit;
import com.kashdeya.tinyprogressions.items.misc.FlintKnife;
import com.kashdeya.tinyprogressions.items.misc.InfinBucket;
import com.kashdeya.tinyprogressions.items.misc.ItemRib;
import com.kashdeya.tinyprogressions.items.misc.ItemScale;
import com.kashdeya.tinyprogressions.items.misc.MyceliumSeeds;
import com.kashdeya.tinyprogressions.items.misc.QuartzKnife;
import com.kashdeya.tinyprogressions.items.misc.RepairTablet;
import com.kashdeya.tinyprogressions.items.wateringcan.WateringCanBase;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class TechItems {
	

	// Watering Cans
	public static RegistryObject<Item> watering_can =         registerItem("watering_can", () -> new WateringCanBase(new Properties()).setWateringRange(1).setWateringChance(ConfigHandler.WateringCanChance));
	public static RegistryObject<Item> watering_can_upgrade = registerItem("watering_can_upgrade", () -> new WateringCanBase(new Properties()).setWateringRange(2).setWateringChance(ConfigHandler.WateringCanUpgradeChance));
	// Quartz Items
	public static RegistryObject<Item> quartz_knife = registerItem("quartz_knife", () -> new QuartzKnife()); 
	public static RegistryObject<Item> quartz_dust =  registerItem("quartz_dust", () -> new ItemBase(new Properties()).setOreDictName("dustQuartz"));
	// Misc Items 
	public static RegistryObject<Item> mycelium_seeds = registerItem("mycelium_seeds", () -> new MyceliumSeeds());
	// Stone Dust
	public static RegistryObject<Item> stone_dust = registerItem("stone_dust", () -> new ItemBase(new Properties()).setOreDictName("dustStone"));
	// Ingots
	public static RegistryObject<Item> flint_ingot =    registerItem("flint_ingot", () -> new ItemBase(new Properties()).setOreDictName("ingotFlint"));
	public static RegistryObject<Item> reinforced_obsidian_ingot = registerItem("reinforced_obsidian_ingot", () -> new ItemBase(new Properties()).setOreDictName("ingotObsidian"));
	public static RegistryObject<Item> lapis_ingot =    registerItem("lapis_ingot", () -> new ItemBase(new Properties()).setOreDictName("ingotLapis"));
	public static RegistryObject<Item> redstone_ingot = registerItem("redstone_ingot", () -> new ItemBase(new Properties()).setOreDictName("ingotRedstone"));
	public static RegistryObject<Item> quartz_ingot =   registerItem("quartz_ingot", () -> new ItemBase(new Properties()).setOreDictName("ingotQuartz"));
	// Flint Knife
	public static RegistryObject<Item> flint_knife = registerItem("flint_knife", () -> new FlintKnife()); ;
	// Stone Stick
	public static RegistryObject<Item> stone_stick = registerItem("stone_stick", () -> new ItemBase(new Properties()).setOreDictName("stickStone"));
	// Ender
	public static RegistryObject<Item> ender_dust  = registerItem("ender_dust", () -> new ItemBase(new Properties()).setOreDictName("dustEnder"));
	// Drops
	public static RegistryObject<Item> wither_rib = registerItem("wither_rib", () -> new ItemRib(new Properties()).setOreDictName("witherRib"));
	
	public static RegistryObject<Item> dragon_scale = registerItem("dragon_scale", () -> new ItemScale(new Properties()).setOreDictName("dragonScale"));
	// Pouch
	public static RegistryObject<Item> pouch;
	// Glowstone Dust
	public static RegistryObject<Item> colored_dust;
	// Repair Tablet
	public static RegistryObject<Item> repair_tablet = registerItem("repair_tablet", () -> new RepairTablet());
	// nether rod
	public static RegistryObject<Item> nether_rod = registerItem("nether_rod", () -> new ItemBase(new Properties()).setOreDictName("stickNether"));
	
	public static RegistryObject<Item> bsc_rod = registerItem("bsc_rod", () -> new ItemBase(new Properties()).setOreDictName("stickCane"));
	// tiny coal & charcoal
	public static RegistryObject<Item> tiny_coal =     registerItem("tiny_coal", () -> new ItemBase(new Properties()).setOreDictName("oreCoalTiny"));
	public static RegistryObject<Item> tiny_charcoal = registerItem("tiny_charcoal", () -> new ItemBase(new Properties()).setOreDictName("oreCharcoalTiny"));
	// chainmail
	
	public static RegistryObject<Item> chainmail_part = registerItem("chainmail_part", () -> new ItemBase(new Properties()).setOreDictName("chainmail"));
	public static RegistryObject<Item> stone_hammer   = registerItem("stone_hammer", () -> new ItemStay(new Properties()));
	// Steel 
	public static RegistryObject<Item> steel_ingot = registerItem("steel_ingot", () -> new ItemBase(new Properties()).setOreDictName("ingotSteel"));
	// Infin Water Bucket
	public static RegistryObject<Item> infin_bucket = registerItem("infin_bucket", () -> new InfinBucket());
	// Dust
	public static RegistryObject<Item> obsidian_dust = registerItem("obsidian_dust", () -> new ItemBase(new Properties()).setOreDictName("dustObsidian"));
	// Wub Gem
	public static RegistryObject<Item> wub_gem   = registerItem("wub_gem",   () -> new ItemBase(new Properties()).setOreDictName("gemWub"));
	public static RegistryObject<Item> wub_ingot = registerItem("wub_ingot", () -> new ItemBase(new Properties()).setOreDictName("ingotWub"));
	// Healing Items
	public static RegistryObject<Item> small_bandage = registerItem("small_bandage",   () -> new SmallBandage());
	public static RegistryObject<Item> large_bandage = registerItem("large_bandage",   () -> new LargeBandage());
	public static RegistryObject<Item> small_med_kit = registerItem("small_med_kit",   () -> new SmallMedkit());
	public static RegistryObject<Item> large_med_kit = registerItem("large_med_kit",   () -> new LargeMedKit());
	
    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<? extends T> sup) {
        return TinyProgressions.ITEMS.register(name, sup);
    }
	
	
//	public static void init() {
//		// Wub Gem
//		if (ConfigHandler.vasholine){
//			wub_gem = new ItemBase().setOreDictName("gemWub").setTranslationKey("wub_gem");
//		}
//		if (ConfigHandler.wub_juice_tools && ConfigHandler.vasholine){
//			wub_ingot = new ItemBase().setOreDictName("ingotWub").setTranslationKey("wub_ingot");
//		}
//		// Infin Water Bucket
//		if (ConfigHandler.infin_bucket){
//			infin_bucket = new InfinBucket().setTranslationKey("infin_bucket");
//		}
//		// Steel
//		if (ConfigHandler.steel_ingot) {
//			steel_ingot = new ItemBase().setOreDictName("ingotSteel").setTranslationKey("steel_ingot");
//		}
//		// nether rod
//		if (ConfigHandler.nether_rod){
//			nether_rod = new ItemBase().setOreDictName("stickNether").setTranslationKey("nether_rod");
//		}
//		// Chainmail
//		if (ArmorHandler.chain_armor){
//			chainmail_part = new ItemBase().setOreDictName("chainmail").setTranslationKey("chainmail_part");
//		}
//		// bsc rod
//		if (ConfigHandler.bsc_rod){
//			bsc_rod = new ItemBase().setOreDictName("stickCane").setTranslationKey("bsc_rod");
//		}
//		
//		// Watering Cans
//		if (ConfigHandler.WateringCan) {
//			watering_can = new WateringCan();
//		}
//		if (ConfigHandler.WateringCanUpgrade) {
//			watering_can_upgrade = new WateringCanUpgrade();
//		}
//		
//		// Quartz Items
//		if (ConfigHandler.QuartzKnife) {
//			quartz_knife = new QuartzKnife();
//			quartz_dust = new ItemBase().setTranslationKey("quartz_dust");
//		}
//		
//	    // Drops
//	    if (ArmorHandler.dragon_armor){
//		    dragon_scale = new ItemScale().setOreDictName("dragonScale").setTranslationKey("dragon_scale");
//	    }
//	    if (ArmorHandler.wither_armor || ConfigHandler.wither_rib){
//		    wither_rib = new ItemRib().setOreDictName("witherRib").setTranslationKey("wither_rib");
//	    }
//	    
//		// Misc Items
//		if (ConfigHandler.StoneTorch) {
//			stone_stick = new ItemBase().setOreDictName("stickStone").setTranslationKey("stone_stick");
//		}
//		if (ConfigHandler.MyceliumSeeds) {
//			mycelium_seeds = new MyceliumSeeds();
//		}
//		if (ConfigHandler.old_reed){
//	    		dead_reed = new FoodBase(1, 0.15F, false).setOreDictName("sugarcane").setTranslationKey("dead_reed");
//	    }
//		
//		// Medkit
//		if (ConfigHandler.medical_kits){
//			small_bandage = new SmallBandage();
//			large_bandage = new LargeBandage();
//			small_med_kit = new SmallMedkit();
//			large_med_kit = new LargeMedKit();
//		}
//		
//		// Tiny Coal & Charcoal
//		if (ConfigHandler.tiny_charcoal){
//			tiny_charcoal = new ItemBase().setOreDictName("dustCharcoal").setTranslationKey("tiny_charcoal");
//		}
//		if (ConfigHandler.tiny_coal){
//			tiny_coal = new ItemBase().setOreDictName("dustCoal").setTranslationKey("tiny_coal");
//		}
//		
//		// Stone Dust
//		if (ConfigHandler.StoneDust) {
//			stone_dust = new ItemBase().setTranslationKey("stone_dust");
//		}
//		
//		// Ingot
//		if (ArmorHandler.FlintArmor) {
//			flint_ingot = new ItemBase().setOreDictName("ingotFlint").setTranslationKey("flint_ingot");
//		}
//		if (ConfigHandler.ReinforcedObsidian) {
//			reinforced_obsidian_ingot = new ItemBase().setOreDictName("ingotReinforcedObsidian").setTranslationKey("reinforced_obsidian_ingot");
//		}
//		
//		// Flint Knife
//		if (ConfigHandler.FlintKnife) {
//			flint_knife = new FlintKnife();
//		}
//		
//		// Ender Dust
//		if (ConfigHandler.ender_ore) {
//			ender_dust = new ItemBase().setOreDictName("dustEnder").setTranslationKey("ender_dust");
//		}
//		
//		// Pouch
//		if (ConfigHandler.pouch) {
//			pouch = new Pouch().setTranslationKey("pouch");
//		}
//		
//	    // Glowstone Dust
//	    if (ConfigHandler.ColorGlowstone){
//	    	colored_dust = new ItemBaseMeta(EnumDustColor.getNames());
//	    }
//	    
//	    // Lapis armor
//	    if (ArmorHandler.lapis_armor){
//	    	lapis_ingot = new ItemBase().setOreDictName("ingotLapis").setTranslationKey("lapis_ingot");
//	    }
//	    
//	    // Redstone Amor
//	    if (ArmorHandler.redstone_armor){
//	    	redstone_ingot = new ItemBase().setOreDictName("ingotRedstone").setTranslationKey("redstone_ingot");
//	    }
//	    
//	    // Quartz Amor
//	    if (ArmorHandler.quartz_armor){
//	    	quartz_ingot = new ItemBase().setOreDictName("ingotQuartz").setTranslationKey("quartz_ingot");
//	    }
//	    
//	    // Repair Tablet
//	    if (ConfigHandler.repair_tablet){
//	    	repair_tablet = new RepairTablet().setTranslationKey("repair_tablet");
//	    }
//	    
//	    // Can not be turned off
//	    obsidian_dust = new ItemBase().setOreDictName("dustObsidian").setTranslationKey("obsidian_dust");
//	    stone_hammer = new ItemStay().setTranslationKey("stone_hammer");
//	}
}
