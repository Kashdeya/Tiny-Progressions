package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.DrinkBase;
import com.kashdeya.tinyprogressions.items.FoodBase;
import com.kashdeya.tinyprogressions.items.apple.DiamondApple;
import com.kashdeya.tinyprogressions.items.apple.EmeraldApple;
import com.kashdeya.tinyprogressions.items.apple.GoldenApple;
import com.kashdeya.tinyprogressions.items.apple.IronApple;
import com.kashdeya.tinyprogressions.items.apple.RedstoneApple;
import com.kashdeya.tinyprogressions.items.misc.ItemJuicer;

import net.minecraft.item.Item;

public class TechFoods {
	
	// Apples
	public static Item golden_apple;
	public static Item diamond_apple;
	public static Item emerald_apple;
	public static Item iron_apple;
	public static Item redstone_apple;
	// Juices
	public static Item juicer;
	public static Item apple_juice;
	public static Item carrot_juice;
	public static Item potatoe_juice;
	public static Item beet_juice;
	public static Item cactus_juice;
	public static Item slime_juice;
	public static Item wheat_juice;
	public static Item melon_juice;
	public static Item pumpkin_juice;
	public static Item peach_juice;
	public static Item pear_juice;
	// MISC
	public static Item raw_bacon;
	public static Item cooked_bacon;
	public static Item monster_jerky;
	public static Item toasted_bread;
	public static Item fried_egg;
	public static Item cooked_mushroom_brown;
	public static Item cooked_mushroom_red;
	public static Item bacon_eggs;
	public static Item little_candy;
	public static Item bacon_sandwhich;
	public static Item beef_sandwhich;
	public static Item bread_slice;
	public static Item chicken_sandwhich;
	public static Item cooked_apple;
	public static Item rabbit_sandwhich;
	public static Item bacon_eggs_sandwhich;
	// Extra Juices
	public static Item raspberry_juice;
	public static Item blueberry_juice;
	public static Item blackberry_juice;
	public static Item maloberry_juice;
	public static Item raspberry_berry;
	public static Item blueberry_berry;
	public static Item blackberry_berry;
	public static Item maloberry_berry;
	// bsc cookie
	public static Item bsc_sugar_cookie;
	// Bams Pizza
	public static Item bams_pizza;
	// Extra Drops
	public static Item plump_pear;
	public static Item plump_peach;
	
	public static void init(){
		// Extra Drops
		if (ConfigHandler.extra_drops){
			plump_pear = new FoodBase(3, 0.25F, true).setOreDictName("cropPear").setUnlocalizedName("plump_pear");
			plump_peach = new FoodBase(3, 0.25F, true).setOreDictName("cropPeach").setUnlocalizedName("plump_peach");
			pear_juice = new DrinkBase(ConfigHandler.pearAmount, ConfigHandler.pearSaturation, false).setUnlocalizedName("pear_juice");
			peach_juice = new DrinkBase(ConfigHandler.peachAmount, ConfigHandler.peachSaturation, false).setUnlocalizedName("peach_juice");
		}
		// bsc cookie
		if (ConfigHandler.bsc_sugar_cookie){
			bsc_sugar_cookie = new FoodBase(1, 1.0F, true).setUnlocalizedName("bsc_sugar_cookie");
		}
		// Bams Pizza
		if (ConfigHandler.bams_pizza){
			bams_pizza = new FoodBase(ConfigHandler.bams_pizza_amount, ConfigHandler.bams_pizza_sat, true).setUnlocalizedName("bams_pizza");
		}
		
		// Natura Juices
		if (ConfigHandler.ExtraJuices || ConfigHandler.ExtraJuicesBottles){
			raspberry_juice = new DrinkBase(ConfigHandler.RaspberryAmount, ConfigHandler.RaspberrySaturation, false).setUnlocalizedName("raspberry_juice");
			blueberry_juice = new DrinkBase(ConfigHandler.BlueberryAmount, ConfigHandler.BlueberrySaturation, false).setUnlocalizedName("blueberry_juice");
			blackberry_juice = new DrinkBase(ConfigHandler.BlackberryAmount, ConfigHandler.BlackberrySaturation, false).setUnlocalizedName("blackberry_juice");
			maloberry_juice = new DrinkBase(ConfigHandler.MaloberryAmount, ConfigHandler.MaloberrySaturation, false).setUnlocalizedName("maloberry_juice");
			raspberry_berry = new FoodBase(3, 0.15F, true).setOreDictName("cropRaspberry").setUnlocalizedName("raspberry_berry");
		    blueberry_berry = new FoodBase(3, 0.15F, true).setOreDictName("cropBlueberry").setUnlocalizedName("blueberry_berry");
		    blackberry_berry = new FoodBase(3, 0.15F, true).setOreDictName("cropBlackberry").setUnlocalizedName("blackberry_berry");
		    maloberry_berry = new FoodBase(3, 0.15F, true).setOreDictName("cropMaloberry").setUnlocalizedName("maloberry_berry");
		}
		
		// Juicer (Can not be turned off)
			juicer = new ItemJuicer().setUnlocalizedName("juicer");
		
		// Juices
		if (ConfigHandler.all_juices || ConfigHandler.JuiceBottles){
			apple_juice = new DrinkBase(ConfigHandler.AppleAmount, ConfigHandler.AppleSaturation, false).setUnlocalizedName("apple_juice");
			carrot_juice = new DrinkBase(ConfigHandler.CarrotAmount, ConfigHandler.CarrotSaturation, false).setUnlocalizedName("carrot_juice");
			potatoe_juice = new DrinkBase(ConfigHandler.PotatoAmount, ConfigHandler.PotatoSaturation, false).setUnlocalizedName("potatoe_juice");
			beet_juice = new DrinkBase(ConfigHandler.BeetAmount, ConfigHandler.BeetSaturation, false).setUnlocalizedName("beet_juice");
			cactus_juice = new DrinkBase(ConfigHandler.CactusAmount, ConfigHandler.CactusSaturation, false).setUnlocalizedName("cactus_juice");
			slime_juice = new DrinkBase(ConfigHandler.SlimeAmount, ConfigHandler.SlimeSaturation, false).setUnlocalizedName("slime_juice");
			wheat_juice = new DrinkBase(ConfigHandler.WheatAmount, ConfigHandler.WheatSaturation, false).setUnlocalizedName("wheat_juice");
			melon_juice = new DrinkBase(ConfigHandler.MelonAmount, ConfigHandler.MelonSaturation, false).setUnlocalizedName("melon_juice");
			pumpkin_juice = new DrinkBase(ConfigHandler.PumpkinAmount, ConfigHandler.PumpkinSaturation, false).setUnlocalizedName("pumpkin_juice");
		}
		
		// Apples
		if (ConfigHandler.DiamondApple) {
			diamond_apple = new DiamondApple(4, 1.0F, false);
		}
		if (ConfigHandler.EmeraldApple) {
			emerald_apple = new EmeraldApple(4, 1.0F, false);
		}
		if (ConfigHandler.iron_apple) {
			iron_apple = new IronApple(4, 1.0F, false);
		}
 		if (ConfigHandler.redstone_apple) {
			redstone_apple = new RedstoneApple(4, 1.0F, false);
		}
		if (ConfigHandler.ApplePro) {
			golden_apple = new GoldenApple(4, 1.0F, false);
		}
		
		// Extra Food
		if (ConfigHandler.CookedBacon){
		    raw_bacon = new FoodBase(1, 0.1F, true).setUnlocalizedName("raw_bacon");
		    cooked_bacon = new FoodBase(3, 0.3F, true).setUnlocalizedName("cooked_bacon");
	    }
	    if (ConfigHandler.MonsterJerky){
		    monster_jerky = new FoodBase(4, 0.5F, true).setUnlocalizedName("monster_jerky");
	    }
	    if (ConfigHandler.ToastedBread){
		    toasted_bread = new FoodBase(ConfigHandler.ToastedAmount, ConfigHandler.ToastedSaturation, true).setUnlocalizedName("toasted_bread");
	    }
	    if (ConfigHandler.FriedEgg){
		    fried_egg = new FoodBase(4, 0.6F, true).setUnlocalizedName("fried_egg");
	    }
	    if (ConfigHandler.CookedMushrooms){
		    cooked_mushroom_brown = new FoodBase(2, 0.3F, false).setUnlocalizedName("cooked_mushroom_brown");
		    cooked_mushroom_red = new FoodBase(2, 0.3F, false).setUnlocalizedName("cooked_mushroom_red");
	    }
	    if (ConfigHandler.BaconEggs){
		    bacon_eggs = new FoodBase(6, 0.7F, false).setUnlocalizedName("bacon_eggs");
	    }
	    if (ConfigHandler.LittleCandy){
		    little_candy = new FoodBase(1, 0.6F, true).setUnlocalizedName("little_candy");
	    }
	    if (ConfigHandler.CookedApple){
		    cooked_apple = new FoodBase(8, 0.75F, true).setUnlocalizedName("cooked_apple");
	    }
	    if (ConfigHandler.Sandwiches){
	    	bread_slice = new FoodBase(1, 0.1F, true).setUnlocalizedName("bread_slice");
		    rabbit_sandwhich = new FoodBase(8, 1.0F, true).setUnlocalizedName("rabbit_sandwhich");
		    bacon_eggs_sandwhich = new FoodBase(9, 1.0F, true).setUnlocalizedName("bacon_eggs_sandwhich");
		    chicken_sandwhich = new FoodBase(8, 1.0F, true).setUnlocalizedName("chicken_sandwhich");
		    beef_sandwhich = new FoodBase(10, 1.0F, true).setUnlocalizedName("beef_sandwhich");
		    bacon_sandwhich = new FoodBase(6, 1.0F, true).setUnlocalizedName("bacon_sandwhich");
	    }
		
	}
}
