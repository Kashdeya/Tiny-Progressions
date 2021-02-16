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
	// Juices
	public static RegistryObject<Item> Juicer           = TinyProgressions.ITEMS.register("juicer", () -> new ItemJuicer(new Properties().group(TinyProgressions.FoodGroup)));
	
	public static RegistryObject<Item> apple_juice  	= TinyProgressions.ITEMS.register("apple_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.APPLE_JUICE));
	public static RegistryObject<Item> carrot_juice		= TinyProgressions.ITEMS.register("carrot_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.CARROT_JUICE));
	public static RegistryObject<Item> potatoe_juice	= TinyProgressions.ITEMS.register("potatoe_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.POTATOE_JUICE));
	public static RegistryObject<Item> beet_juice   	= TinyProgressions.ITEMS.register("beet_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.BEET_JUICE));
	public static RegistryObject<Item> cactus_juice 	= TinyProgressions.ITEMS.register("cactus_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.CACTUS_JUICE));
	public static RegistryObject<Item> slime_juice  	= TinyProgressions.ITEMS.register("slime_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.SLIME_JUICE));
	public static RegistryObject<Item> wheat_juice  	= TinyProgressions.ITEMS.register("wheat_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.WHEAT_JUICE));
	public static RegistryObject<Item> melon_juice  	= TinyProgressions.ITEMS.register("melon_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.MELON_JUICE));
	public static RegistryObject<Item> pumpkin_juice	= TinyProgressions.ITEMS.register("pumpkin_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.PUMPKIN_JUICE));
	public static RegistryObject<Item> peach_juice  	= TinyProgressions.ITEMS.register("peach_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.PEACH_JUICE));
	public static RegistryObject<Item> pear_juice   	= TinyProgressions.ITEMS.register("pear_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.PEAR_JUICE));
	public static RegistryObject<Item> raspberry_juice  = TinyProgressions.ITEMS.register("raspberry_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.RASPBERRY_JUICE));
	public static RegistryObject<Item> blueberry_juice  = TinyProgressions.ITEMS.register("blueberry_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.BLUEBERRY_JUICE));
	public static RegistryObject<Item> blackberry_juice = TinyProgressions.ITEMS.register("blackberry_juice", () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.BLACBERRY_JUICE));
	public static RegistryObject<Item> maloberry_juice  = TinyProgressions.ITEMS.register("maloberry_juice",  () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.MALOBERRY_JUICE));
	public static RegistryObject<Item> raspberry_berry  = TinyProgressions.ITEMS.register("raspberry_berry",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.RASPBERRY_BEERY));
	public static RegistryObject<Item> blueberry_berry  = TinyProgressions.ITEMS.register("blueberry_berry",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.BLUEBERRY_BEERY));
	public static RegistryObject<Item> blackberry_berry = TinyProgressions.ITEMS.register("blackberry_berry", () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.BLACKBEERY_BEERY));
	public static RegistryObject<Item> maloberry_berry  = TinyProgressions.ITEMS.register("maloberry_berry",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.MALOBERRY_BERRY));

	// Apples
	public static RegistryObject<Item> golden_apple   = TinyProgressions.ITEMS.register("golden_apple",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup).rarity(Rarity.EPIC), Foods.GOLDEN_APPLE) );
	public static RegistryObject<Item> diamond_apple  = TinyProgressions.ITEMS.register("diamond_apple", () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup).rarity(Rarity.EPIC), Foods.DIAMOND_APPLE));
	public static RegistryObject<Item> emerald_apple  = TinyProgressions.ITEMS.register("emerald_apple", () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup).rarity(Rarity.EPIC), Foods.EMERALD_APPLE));
	public static RegistryObject<Item> iron_apple     = TinyProgressions.ITEMS.register("iron_apple",    () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup).rarity(Rarity.EPIC), Foods.IRON_APPLE));
	public static RegistryObject<Item> redstone_apple = TinyProgressions.ITEMS.register("redstone_apple",() -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup).rarity(Rarity.EPIC), Foods.REDSTON_APPLE));
	public static RegistryObject<Item> cooked_apple	  = TinyProgressions.ITEMS.register("cooked_apple",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.COOKED_APPLE));
	public static RegistryObject<Item> plump_pear  	  = TinyProgressions.ITEMS.register("plump_pear",    () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.PLUMP_PEAR));
	public static RegistryObject<Item> plump_peach 	  = TinyProgressions.ITEMS.register("plump_peach",   () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.PLUMP_PEACH));
	public static RegistryObject<Item> succ_pearls 	  = TinyProgressions.ITEMS.register("succ_pearls",   () -> new DrinkBase(new Properties().group(TinyProgressions.FoodGroup), Foods.SUCC_PEARLS).setSound(TechSounds.SUCULANT_DRINK));
	
	// MISC
	public static RegistryObject<Item> raw_bacon             = TinyProgressions.ITEMS.register("raw_bacon",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.RAW_BACON));
	public static RegistryObject<Item> cooked_bacon		 	 = TinyProgressions.ITEMS.register("cooked_bacon",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.COOKED_BACON));
	public static RegistryObject<Item> fried_egg		     = TinyProgressions.ITEMS.register("fried_egg",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.FRIED_EGG));
	public static RegistryObject<Item> bacon_eggs			 = TinyProgressions.ITEMS.register("bacon_eggs",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.BACON_EGGS));

	public static RegistryObject<Item> bread_slice 			 = TinyProgressions.ITEMS.register("bread_slice",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.BREAD_SLICE));
	public static RegistryObject<Item> toasted_bread		 = TinyProgressions.ITEMS.register("toasted_bread",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.TOASTED_BREAD));
	public static RegistryObject<Item> bacon_sandwhich		 = TinyProgressions.ITEMS.register("bacon_sandwhich",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.BACON_SANDWICH));
	public static RegistryObject<Item> bacon_eggs_sandwhich  = TinyProgressions.ITEMS.register("bacon_eggs_sandwhich",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.BACON_EGGS_SANDWICH));
	public static RegistryObject<Item> beef_sandwhich		 = TinyProgressions.ITEMS.register("beef_sandwhich",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.BEEF_SANDWICH));
	public static RegistryObject<Item> chicken_sandwhich	 = TinyProgressions.ITEMS.register("chicken_sandwhich",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.CHICKEN_SANDWICH));
	public static RegistryObject<Item> rabbit_sandwhich		 = TinyProgressions.ITEMS.register("rabbit_sandwhich",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.RABBIT_SANDWICH));
	public static RegistryObject<Item> monster_jerky		 = TinyProgressions.ITEMS.register("monster_jerky",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.MONSTER_JERKEY));
	
	public static RegistryObject<Item> cooked_mushroom_brown = TinyProgressions.ITEMS.register("cooked_mushroom_brown",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.COOKED_MUSHROOM_BROWN));
	public static RegistryObject<Item> cooked_mushroom_red   = TinyProgressions.ITEMS.register("cooked_mushroom_red",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.COOKED_MUSHROOM_RED));
	
	public static RegistryObject<Item> little_candy			 = TinyProgressions.ITEMS.register("little_candy",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.LITTLE_CANDYS));
	public static RegistryObject<Item> bsc_sugar_cookie = TinyProgressions.ITEMS.register("bsc_sugar_cookie",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.BSC_SUGAR_COOKIE));

	// Bams Pizza
	public static RegistryObject<Item> bams_pizza = TinyProgressions.ITEMS.register("bams_pizza",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.BAMS_PIZZA));
	
	// Extra Drops
	public static RegistryObject<Item> dead_reed = TinyProgressions.ITEMS.register("dead_reed",  () -> new FoodBase(new Properties().group(TinyProgressions.FoodGroup), Foods.DEAD_REEDS));
	
	//public static void init(){
//	// Succ Pearls
//	if (ConfigHandler.succ_juice){
//		succ_pearls = new SuccBase(5, 0.25F, true).setAlwaysEdible().setTranslationKey("succ_pearls");
//	}
//	// Extra Drops
//	if (ConfigHandler.extra_drops){
//		plump_pear = new FoodBase(3, 0.25F, true).setOreDictName("cropPear").setTranslationKey("plump_pear");
//		plump_peach = new FoodBase(3, 0.25F, true).setOreDictName("cropPeach").setTranslationKey("plump_peach");
//		pear_juice = new DrinkBase(ConfigHandler.pearAmount, ConfigHandler.pearSaturation, false).setTranslationKey("pear_juice");
//		peach_juice = new DrinkBase(ConfigHandler.peachAmount, ConfigHandler.peachSaturation, false).setTranslationKey("peach_juice");
//	}
//	// bsc cookie
//	if (ConfigHandler.bsc_sugar_cookie){
//		bsc_sugar_cookie = new FoodBase(1, 1.0F, true).setTranslationKey("bsc_sugar_cookie");
//	}
//	// Bams Pizza
//	if (ConfigHandler.bams_pizza){
//		bams_pizza = new FoodBase(ConfigHandler.bams_pizza_amount, ConfigHandler.bams_pizza_sat, true).setTranslationKey("bams_pizza");
//	}
//	
//	// Natura Juices
//	if (ConfigHandler.ExtraJuices || ConfigHandler.ExtraJuicesBottles){
//		raspberry_juice = new DrinkBase(ConfigHandler.RaspberryAmount, ConfigHandler.RaspberrySaturation, false).setTranslationKey("raspberry_juice");
//		blueberry_juice = new DrinkBase(ConfigHandler.BlueberryAmount, ConfigHandler.BlueberrySaturation, false).setTranslationKey("blueberry_juice");
//		blackberry_juice = new DrinkBase(ConfigHandler.BlackberryAmount, ConfigHandler.BlackberrySaturation, false).setTranslationKey("blackberry_juice");
//		maloberry_juice = new DrinkBase(ConfigHandler.MaloberryAmount, ConfigHandler.MaloberryAmount, false).setTranslationKey("maloberry_juice");
//		raspberry_berry = new FoodBase(3, 0.15F, true).setOreDictName("cropRaspberry").setTranslationKey("raspberry_berry");
//	    blueberry_berry = new FoodBase(3, 0.15F, true).setOreDictName("cropBlueberry").setTranslationKey("blueberry_berry");
//	    blackberry_berry = new FoodBase(3, 0.15F, true).setOreDictName("cropBlackberry").setTranslationKey("blackberry_berry");
//	    maloberry_berry = new FoodBase(3, 0.15F, true).setOreDictName("cropMaloberry").setTranslationKey("maloberry_berry");
//	}
//	
//	// Juices
//	if (ConfigHandler.all_juices || ConfigHandler.JuiceBottles){
//		apple_juice = new DrinkBase(ConfigHandler.AppleAmount, ConfigHandler.AppleSaturation, false).setTranslationKey("apple_juice");
//		carrot_juice = new DrinkBase(ConfigHandler.CarrotAmount, ConfigHandler.CarrotSaturation, false).setTranslationKey("carrot_juice");
//		potatoe_juice = new DrinkBase(ConfigHandler.PotatoAmount, ConfigHandler.PotatoSaturation, false).setTranslationKey("potatoe_juice");
//		beet_juice = new DrinkBase(ConfigHandler.BeetAmount, ConfigHandler.BeetSaturation, false).setTranslationKey("beet_juice");
//		cactus_juice = new DrinkBase(ConfigHandler.CactusAmount, ConfigHandler.CactusSaturation, false).setTranslationKey("cactus_juice");
//		slime_juice = new DrinkBase(ConfigHandler.SlimeAmount, ConfigHandler.SlimeSaturation, false).setTranslationKey("slime_juice");
//		wheat_juice = new DrinkBase(ConfigHandler.WheatAmount, ConfigHandler.WheatSaturation, false).setTranslationKey("wheat_juice");
//		melon_juice = new DrinkBase(ConfigHandler.MelonAmount, ConfigHandler.MelonSaturation, false).setTranslationKey("melon_juice");
//		pumpkin_juice = new DrinkBase(ConfigHandler.PumpkinAmount, ConfigHandler.PumpkinSaturation, false).setTranslationKey("pumpkin_juice");
//	}
//	
//	// Apples
//	if (ConfigHandler.DiamondApple) {
//		diamond_apple = new DiamondApple(4, 1.0F, false);
//	}
//	if (ConfigHandler.EmeraldApple) {
//		emerald_apple = new EmeraldApple(4, 1.0F, false);
//	}
//	if (ConfigHandler.iron_apple) {
//		iron_apple = new IronApple(4, 1.0F, false);
//	}
//		if (ConfigHandler.redstone_apple) {
//		redstone_apple = new RedstoneApple(4, 1.0F, false);
//	}
//	if (ConfigHandler.ApplePro) {
//		golden_apple = new GoldenApple(4, 1.0F, false);
//	}
//	
//	// Extra Food
//	if (ConfigHandler.CookedBacon){
//	    raw_bacon = new FoodBase(1, 0.1F, true).setTranslationKey("raw_bacon");
//	    cooked_bacon = new FoodBase(3, 0.3F, true).setTranslationKey("cooked_bacon");
//    }
//    if (ConfigHandler.MonsterJerky){
//	    monster_jerky = new FoodBase(4, 0.5F, true).setTranslationKey("monster_jerky");
//    }
//    if (ConfigHandler.ToastedBread){
//	    toasted_bread = new FoodBase(ConfigHandler.ToastedAmount, ConfigHandler.ToastedSaturation, true).setTranslationKey("toasted_bread");
//    }
//    if (ConfigHandler.FriedEgg){
//	    fried_egg = new FoodBase(4, 0.6F, true).setTranslationKey("fried_egg");
//    }
//    if (ConfigHandler.CookedMushrooms){
//	    cooked_mushroom_brown = new FoodBase(2, 0.3F, false).setTranslationKey("cooked_mushroom_brown");
//	    cooked_mushroom_red = new FoodBase(2, 0.3F, false).setTranslationKey("cooked_mushroom_red");
//    }
//    if (ConfigHandler.BaconEggs){
//	    bacon_eggs = new FoodBase(6, 0.7F, false).setTranslationKey("bacon_eggs");
//    }
//    if (ConfigHandler.LittleCandy){
//	    little_candy = new FoodBase(1, 0.6F, true).setTranslationKey("little_candy");
//    }
//    if (ConfigHandler.CookedApple){
//	    cooked_apple = new FoodBase(8, 0.75F, true).setTranslationKey("cooked_apple");
//    }
//    if (ConfigHandler.Sandwiches){
//    	bread_slice = new FoodBase(1, 0.1F, true).setTranslationKey("bread_slice");
//	    rabbit_sandwhich = new FoodBase(8, 1.0F, true).setTranslationKey("rabbit_sandwhich");
//	    bacon_eggs_sandwhich = new FoodBase(9, 1.0F, true).setTranslationKey("bacon_eggs_sandwhich");
//	    chicken_sandwhich = new FoodBase(8, 1.0F, true).setTranslationKey("chicken_sandwhich");
//	    beef_sandwhich = new FoodBase(10, 1.0F, true).setTranslationKey("beef_sandwhich");
//	    bacon_sandwhich = new FoodBase(6, 1.0F, true).setTranslationKey("bacon_sandwhich");
//    }
//    
//	// Juicer (Can not be turned off)
//	juicer = new ItemJuicer().setTranslationKey("juicer");
//	
//}
}
