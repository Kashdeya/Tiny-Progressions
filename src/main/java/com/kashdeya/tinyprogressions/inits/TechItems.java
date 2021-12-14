package com.kashdeya.tinyprogressions.inits;

import java.util.function.Supplier;

import com.kashdeya.tinyprogressions.items.misc.FlintKnife;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class TechItems {
	

//	// Watering Cans
//	public static RegistryObject<Item> watering_can 		= registerItem("watering_can",         () -> new WateringCanBase(new Properties().tab(TinyProgressions.ToolsGroup)).setWateringRange(1).setWateringChance(ConfigHandler.WateringCanChance));
//	public static RegistryObject<Item> watering_can_upgrade = registerItem("watering_can_upgrade", () -> new WateringCanBase(new Properties().tab(TinyProgressions.ToolsGroup)).setWateringRange(2).setWateringChance(ConfigHandler.WateringCanUpgradeChance));
//	public static RegistryObject<Item> infin_bucket 		= registerItem("infin_bucket",         () -> new InfinBucket());
//	// Quartz Items
//	public static RegistryObject<Item> quartz_knife = registerItem("quartz_knife", () -> new QuartzKnife()); 
	public static RegistryObject<Item> flint_knife  = registerItem("flint_knife",  () -> new FlintKnife());
//	
//	// Misc Items 
//	public static RegistryObject<Item> mycelium_seeds = registerItem("mycelium_seeds", () -> new MyceliumSeeds());
//	// Stone Dust
//
//	// Ingots
//	public static RegistryObject<Item> flint_ingot 	   = registerItem("flint_ingot",    () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("ingotFlint"));
//	public static RegistryObject<Item> reinforced_obsidian_ingot = registerItem("reinforced_obsidian_ingot", () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("ingotObsidian"));
//	public static RegistryObject<Item> lapis_ingot     = registerItem("lapis_ingot",    () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("ingotLapis"));
//	public static RegistryObject<Item> steel_ingot	   = registerItem("steel_ingot", 	() -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("ingotSteel"));
//	public static RegistryObject<Item> redstone_ingot  = registerItem("redstone_ingot", () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("ingotRedstone"));
//	public static RegistryObject<Item> quartz_ingot    = registerItem("quartz_ingot",   () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("ingotQuartz"));
//	public static RegistryObject<Item> wub_ingot 	   = registerItem("wub_ingot", 	 	() -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("ingotWub"));
//	public static RegistryObject<Item> wub_gem   	   = registerItem("wub_gem",   	 	() -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("gemWub"));
//	// Flint Knife
//
//	// Drops
//	public static RegistryObject<Item> wither_rib    = registerItem("wither_rib", () -> new ItemRib(new Properties().tab(TinyProgressions.TAB)).setOreDictName("witherRib"));
//	public static RegistryObject<Item> dragon_scale  = registerItem("dragon_scale", () -> new ItemScale(new Properties().tab(TinyProgressions.TAB)).setOreDictName("dragonScale"));
//	
//	public static RegistryObject<Item> repair_tablet = registerItem("repair_tablet", () -> new RepairTablet());
//	
//	public static RegistryObject<Item> pouch = registerItem("pouch", () -> new Pouch());;
////	public static RegistryObject<ContainerType<?>> pouch_container = TinyProgressions.CONTAINERS.register("pouch_container", () -> IForgeContainerType.create((windowId, inv, data) -> {	return new PouchContainer(windowId, inv, Minecraft.getInstance().player);}));   
//
//
//	public static RegistryObject<Item> quartz_dust    = registerItem("quartz_dust", () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("dustQuartz"));
//	public static RegistryObject<Item> stone_dust     = registerItem("stone_dust", () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("dustStone"));
//	public static RegistryObject<Item> obsidian_dust  = registerItem("obsidian_dust", () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("dustObsidian"));
//	public static RegistryObject<Item> ender_dust     = registerItem("ender_dust", () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("dustEnder"));
//
//	// Glowstone Dust
//    public static RegistryObject<Item> white_dust     = registerItem("white_dust",    () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> silver_dust    = registerItem("silver_dust",   () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> red_dust       = registerItem("red_dust",      () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> purple_dust    = registerItem("purple_dust",   () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> pink_dust      = registerItem("pink_dust",     () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> orange_dust    = registerItem("orange_dust",   () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> magenta_dust   = registerItem("magenta_dust",  () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> lime_dust      = registerItem("lime_dust",     () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> lightblue_dust = registerItem("lightblue_dust",() -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> green_dust     = registerItem("green_dust",    () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> gray_dust      = registerItem("gray_dust",     () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> cyan_dust      = registerItem("cyan_dust",     () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> brown_dust     = registerItem("brown_dust",    () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> blue_dust      = registerItem("blue_dust",     () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//    public static RegistryObject<Item> black_dust     = registerItem("black_dust",    () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)));
//	
//	// nether rod
//	public static RegistryObject<Item> stone_stick = registerItem("stone_stick",() -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("stickStone"));
//	public static RegistryObject<Item> nether_rod  = registerItem("nether_rod", () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("stickNether"));
//	public static RegistryObject<Item> bsc_rod     = registerItem("bsc_rod",    () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("stickCane"));
//
//	
//	// tiny coal & charcoal
//	public static RegistryObject<Item> tiny_coal 	 = registerItem("tiny_coal",     () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("oreCoalTiny"));
//	public static RegistryObject<Item> tiny_charcoal = registerItem("tiny_charcoal", () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("oreCharcoalTiny"));
//	// chainmail
//	
//	public static RegistryObject<Item> chainmail_part = registerItem("chainmail_part", () -> new ItemBase(new Properties().tab(TinyProgressions.TAB)).setOreDictName("chainmail"));
//	public static RegistryObject<Item> stone_hammer   = registerItem("stone_hammer",   () -> new ItemStay(new Properties().tab(TinyProgressions.TAB)));
//
//	// Healing Items
//	public static RegistryObject<Item> small_bandage = registerItem("small_bandage",   () -> new SmallBandage());
//	public static RegistryObject<Item> large_bandage = registerItem("large_bandage",   () -> new LargeBandage());
//	public static RegistryObject<Item> small_med_kit = registerItem("small_med_kit",   () -> new SmallMedkit());
//	public static RegistryObject<Item> large_med_kit = registerItem("large_med_kit",   () -> new LargeMedKit());
	
    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<? extends T> sup) {
        return TinyProgressions.ITEMS.register(name, sup);
    }
	
	
}
