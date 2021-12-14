package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.items.DrinkBase;
import com.kashdeya.tinyprogressions.items.FoodBase;
import com.kashdeya.tinyprogressions.items.Foods;
import com.kashdeya.tinyprogressions.items.misc.ItemJuicer;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TechFoods {
//	// Juices
	public static RegistryObject<Item> Juicer           = TinyProgressions.FOOD.register("juicer", () -> new ItemJuicer(new Properties()));
//	
	public static RegistryObject<Item> apple_juice  	= TinyProgressions.FOOD.register("apple_juice",  () -> new DrinkBase(new Properties(), Foods.APPLE_JUICE));
	public static RegistryObject<Item> carrot_juice		= TinyProgressions.FOOD.register("carrot_juice",  () -> new DrinkBase(new Properties(), Foods.CARROT_JUICE));
	public static RegistryObject<Item> potatoe_juice	= TinyProgressions.FOOD.register("potatoe_juice",  () -> new DrinkBase(new Properties(), Foods.POTATOE_JUICE));
	public static RegistryObject<Item> beet_juice   	= TinyProgressions.FOOD.register("beet_juice",  () -> new DrinkBase(new Properties(), Foods.BEET_JUICE));
	public static RegistryObject<Item> cactus_juice 	= TinyProgressions.FOOD.register("cactus_juice",  () -> new DrinkBase(new Properties(), Foods.CACTUS_JUICE));
	public static RegistryObject<Item> slime_juice  	= TinyProgressions.FOOD.register("slime_juice",  () -> new DrinkBase(new Properties(), Foods.SLIME_JUICE));
	public static RegistryObject<Item> wheat_juice  	= TinyProgressions.FOOD.register("wheat_juice",  () -> new DrinkBase(new Properties(), Foods.WHEAT_JUICE));
	public static RegistryObject<Item> melon_juice  	= TinyProgressions.FOOD.register("melon_juice",  () -> new DrinkBase(new Properties(), Foods.MELON_JUICE));
	public static RegistryObject<Item> pumpkin_juice	= TinyProgressions.FOOD.register("pumpkin_juice",  () -> new DrinkBase(new Properties(), Foods.PUMPKIN_JUICE));
	public static RegistryObject<Item> peach_juice  	= TinyProgressions.FOOD.register("peach_juice",  () -> new DrinkBase(new Properties(), Foods.PEACH_JUICE));
	public static RegistryObject<Item> pear_juice   	= TinyProgressions.FOOD.register("pear_juice",  () -> new DrinkBase(new Properties(), Foods.PEAR_JUICE));
	public static RegistryObject<Item> raspberry_juice  = TinyProgressions.FOOD.register("raspberry_juice",  () -> new DrinkBase(new Properties(), Foods.RASPBERRY_JUICE));
	public static RegistryObject<Item> blueberry_juice  = TinyProgressions.FOOD.register("blueberry_juice",  () -> new DrinkBase(new Properties(), Foods.BLUEBERRY_JUICE));
	public static RegistryObject<Item> blackberry_juice = TinyProgressions.FOOD.register("blackberry_juice", () -> new DrinkBase(new Properties(), Foods.BLACBERRY_JUICE));
	public static RegistryObject<Item> maloberry_juice  = TinyProgressions.FOOD.register("maloberry_juice",  () -> new DrinkBase(new Properties(), Foods.MALOBERRY_JUICE));
	public static RegistryObject<Item> raspberry_berry  = TinyProgressions.FOOD.register("raspberry_berry",  () -> new FoodBase(new Properties(), Foods.RASPBERRY_BEERY));
	public static RegistryObject<Item> blueberry_berry  = TinyProgressions.FOOD.register("blueberry_berry",  () -> new FoodBase(new Properties(), Foods.BLUEBERRY_BEERY));
	public static RegistryObject<Item> blackberry_berry = TinyProgressions.FOOD.register("blackberry_berry", () -> new FoodBase(new Properties(), Foods.BLACKBEERY_BEERY));
	public static RegistryObject<Item> maloberry_berry  = TinyProgressions.FOOD.register("maloberry_berry",  () -> new FoodBase(new Properties(), Foods.MALOBERRY_BERRY));
//
	// Apples
	public static RegistryObject<Item> golden_apple   = TinyProgressions.FOOD.register("golden_apple", () -> new FoodBase(new Properties().rarity(Rarity.EPIC), Foods.GOLDEN_APPLE) );
    public static RegistryObject<Item> diamond_apple  = TinyProgressions.FOOD.register("diamond_apple", () -> new FoodBase(new Properties().rarity(Rarity.EPIC), Foods.DIAMOND_APPLE));
	public static RegistryObject<Item> emerald_apple  = TinyProgressions.FOOD.register("emerald_apple", () -> new FoodBase(new Properties().rarity(Rarity.EPIC), Foods.EMERALD_APPLE));
	public static RegistryObject<Item> iron_apple     = TinyProgressions.FOOD.register("iron_apple",    () -> new FoodBase(new Properties().rarity(Rarity.EPIC), Foods.IRON_APPLE));
	public static RegistryObject<Item> redstone_apple = TinyProgressions.FOOD.register("redstone_apple",() -> new FoodBase(new Properties().rarity(Rarity.EPIC), Foods.REDSTON_APPLE));
	public static RegistryObject<Item> cooked_apple	  = TinyProgressions.FOOD.register("cooked_apple",  () -> new FoodBase(new Properties(), Foods.COOKED_APPLE));
	public static RegistryObject<Item> plump_pear  	  = TinyProgressions.FOOD.register("plump_pear",    () -> new FoodBase(new Properties(), Foods.PLUMP_PEAR));
	public static RegistryObject<Item> plump_peach 	  = TinyProgressions.FOOD.register("plump_peach",   () -> new FoodBase(new Properties(), Foods.PLUMP_PEACH));
//	public static RegistryObject<Item> succ_pearls 	  = TinyProgressions.ITEMS.register("succ_pearls",   () -> new DrinkBase(new Properties(), Foods.SUCC_PEARLS).setSound(TechSounds.SUCULANT_DRINK));
////	
//	// MISC
	public static RegistryObject<Item> raw_bacon             = TinyProgressions.FOOD.register("raw_bacon",  () -> new FoodBase(new Properties(), Foods.RAW_BACON));
	public static RegistryObject<Item> cooked_bacon		 	 = TinyProgressions.FOOD.register("cooked_bacon",  () -> new FoodBase(new Properties(), Foods.COOKED_BACON));
	public static RegistryObject<Item> fried_egg		     = TinyProgressions.FOOD.register("fried_egg",  () -> new FoodBase(new Properties(), Foods.FRIED_EGG));
	public static RegistryObject<Item> bacon_eggs			 = TinyProgressions.FOOD.register("bacon_eggs",  () -> new FoodBase(new Properties(), Foods.BACON_EGGS));
//
	public static RegistryObject<Item> bread_slice 			 = TinyProgressions.FOOD.register("bread_slice",  () -> new FoodBase(new Properties(), Foods.BREAD_SLICE));
	public static RegistryObject<Item> toasted_bread		 = TinyProgressions.FOOD.register("toasted_bread",  () -> new FoodBase(new Properties(), Foods.TOASTED_BREAD));
	public static RegistryObject<Item> bacon_sandwhich		 = TinyProgressions.FOOD.register("bacon_sandwhich",  () -> new FoodBase(new Properties(), Foods.BACON_SANDWICH));
	public static RegistryObject<Item> bacon_eggs_sandwhich  = TinyProgressions.FOOD.register("bacon_eggs_sandwhich",  () -> new FoodBase(new Properties(), Foods.BACON_EGGS_SANDWICH));
	public static RegistryObject<Item> beef_sandwhich		 = TinyProgressions.FOOD.register("beef_sandwhich",  () -> new FoodBase(new Properties(), Foods.BEEF_SANDWICH));
	public static RegistryObject<Item> chicken_sandwhich	 = TinyProgressions.FOOD.register("chicken_sandwhich",  () -> new FoodBase(new Properties(), Foods.CHICKEN_SANDWICH));
	public static RegistryObject<Item> rabbit_sandwhich		 = TinyProgressions.FOOD.register("rabbit_sandwhich",  () -> new FoodBase(new Properties(), Foods.RABBIT_SANDWICH));
	public static RegistryObject<Item> monster_jerky		 = TinyProgressions.FOOD.register("monster_jerky",  () -> new FoodBase(new Properties(), Foods.MONSTER_JERKEY));
//	
	public static RegistryObject<Item> cooked_mushroom_brown = TinyProgressions.FOOD.register("cooked_mushroom_brown",  () -> new FoodBase(new Properties(), Foods.COOKED_MUSHROOM_BROWN));
	public static RegistryObject<Item> cooked_mushroom_red   = TinyProgressions.FOOD.register("cooked_mushroom_red",  () -> new FoodBase(new Properties(), Foods.COOKED_MUSHROOM_RED));
//	
	public static RegistryObject<Item> little_candy			 = TinyProgressions.FOOD.register("little_candy",  () -> new FoodBase(new Properties(), Foods.LITTLE_CANDYS));
	public static RegistryObject<Item> bsc_sugar_cookie = TinyProgressions.FOOD.register("bsc_sugar_cookie",  () -> new FoodBase(new Properties(), Foods.BSC_SUGAR_COOKIE));
//
//	// Bams Pizza
	public static RegistryObject<Item> bams_pizza = TinyProgressions.FOOD.register("bams_pizza",  () -> new FoodBase(new Properties(), Foods.BAMS_PIZZA));
//	
//	// Extra Drops
	public static RegistryObject<Item> dead_reed = TinyProgressions.FOOD.register("dead_reed",  () -> new FoodBase(new Properties(), Foods.DEAD_REEDS));
	
}
