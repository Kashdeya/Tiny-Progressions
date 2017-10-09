package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.DrinkBase;
import com.kashdeya.tinyprogressions.items.FoodBase;
import com.kashdeya.tinyprogressions.items.ItemJuicer;
import com.kashdeya.tinyprogressions.items.apple.DiamondApple;
import com.kashdeya.tinyprogressions.items.apple.EmeraldApple;
import com.kashdeya.tinyprogressions.items.apple.GoldenApple;
import com.kashdeya.tinyprogressions.items.apple.IronApple;
import com.kashdeya.tinyprogressions.items.apple.RedstoneApple;

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
	
	public static void init(){
		// Juices
		if (ConfigHandler.all_juices){
			juicer = new ItemJuicer().setUnlocalizedName("juicer");
			TechItems.registerItem(juicer, "juicer");
			
			apple_juice = new DrinkBase(ConfigHandler.AppleAmount, ConfigHandler.AppleSaturation, false).setUnlocalizedName("apple_juice");
			TechItems.registerItem(apple_juice, "apple_juice");
			
			carrot_juice = new DrinkBase(ConfigHandler.CarrotAmount, ConfigHandler.CarrotSaturation, false).setUnlocalizedName("carrot_juice");
			TechItems.registerItem(carrot_juice, "carrot_juice");
			
			potatoe_juice = new DrinkBase(ConfigHandler.PotatoeAmount, ConfigHandler.PotatoeSaturation, false).setUnlocalizedName("potatoe_juice");
			TechItems.registerItem(potatoe_juice, "potatoe_juice");
			
			beet_juice = new DrinkBase(ConfigHandler.BeetAmount, ConfigHandler.BeetSaturation, false).setUnlocalizedName("beet_juice");
			TechItems.registerItem(beet_juice, "beet_juice");
			
			cactus_juice = new DrinkBase(ConfigHandler.CactusAmount, ConfigHandler.CactusSaturation, false).setUnlocalizedName("cactus_juice");
			TechItems.registerItem(cactus_juice, "cactus_juice");
			
			slime_juice = new DrinkBase(ConfigHandler.SlimeAmount, ConfigHandler.SlimeSaturation, false).setUnlocalizedName("slime_juice");
			TechItems.registerItem(slime_juice, "slime_juice");
			
			wheat_juice = new DrinkBase(ConfigHandler.WheatAmount, ConfigHandler.WheatSaturation, false).setUnlocalizedName("wheat_juice");
			TechItems.registerItem(wheat_juice, "wheat_juice");
			
			melon_juice = new DrinkBase(ConfigHandler.MelonAmount, ConfigHandler.MelonSaturation, false).setUnlocalizedName("melon_juice");
			TechItems.registerItem(melon_juice, "melon_juice");
			
			pumpkin_juice = new DrinkBase(ConfigHandler.PumpkinAmount, ConfigHandler.PumpkinSaturation, false).setUnlocalizedName("pumpkin_juice");
			TechItems.registerItem(pumpkin_juice, "pumpkin_juice");
		}
		
		// Apples
		if (ConfigHandler.DiamondApple) {
			diamond_apple = new DiamondApple(4, 1.2F, false);
			TechItems.registerItem(diamond_apple, "diamond_apple");
		}
		if (ConfigHandler.EmeraldApple) {
			emerald_apple = new EmeraldApple(4, 1.2F, false);
			TechItems.registerItem(emerald_apple, "emerald_apple");
		}
		if (ConfigHandler.iron_apple) {
			iron_apple = new IronApple(4, 1.2F, false);
			TechItems.registerItem(iron_apple, "iron_apple");
		}
 		if (ConfigHandler.redstone_apple) {
			redstone_apple = new RedstoneApple(4, 1.2F, false);
			TechItems.registerItem(redstone_apple, "redstone_apple");
		}
		if (ConfigHandler.ApplePro) {
			golden_apple = new GoldenApple(4, 1.2F, false);
			TechItems.registerItem(golden_apple, "golden_apple");
		}
		
		// Extra Food
		if (ConfigHandler.CookedBacon){
		    raw_bacon = new FoodBase(1, 0.1F, true).setUnlocalizedName("raw_bacon");
		    TechItems.registerItem(raw_bacon, "raw_bacon");
		    cooked_bacon = new FoodBase(3, 0.3F, true).setUnlocalizedName("cooked_bacon");
		    TechItems.registerItem(cooked_bacon, "cooked_bacon");
	    }
	    if (ConfigHandler.MonsterJerky){
		    monster_jerky = new FoodBase(4, 0.5F, true).setUnlocalizedName("monster_jerky");
		    TechItems.registerItem(monster_jerky, "monster_jerky");
	    }
	    if (ConfigHandler.ToastedBread){
		    toasted_bread = new FoodBase(ConfigHandler.ToastedAmount, ConfigHandler.ToastedSaturation, true).setUnlocalizedName("toasted_bread");
		    TechItems.registerItem(toasted_bread, "toasted_bread");
	    }
	    if (ConfigHandler.FriedEgg){
		    fried_egg = new FoodBase(4, 0.6F, true).setUnlocalizedName("fried_egg");
		    TechItems.registerItem(fried_egg, "fried_egg");
	    }
	    if (ConfigHandler.CookedMushrooms){
		    cooked_mushroom_brown = new FoodBase(2, 03F, false).setUnlocalizedName("cooked_mushroom_brown");
		    TechItems.registerItem(cooked_mushroom_brown, "cooked_mushroom_brown");
		    cooked_mushroom_red = new FoodBase(2, 03F, false).setUnlocalizedName("cooked_mushroom_red");
		    TechItems.registerItem(cooked_mushroom_red, "cooked_mushroom_red");
	    }
	    if (ConfigHandler.BaconEggs){
		    bacon_eggs = new FoodBase(6, 0.7F, false).setUnlocalizedName("bacon_eggs");
		    TechItems.registerItem(bacon_eggs, "bacon_eggs");
	    }
	    if (ConfigHandler.LittleCandy){
		    little_candy = new FoodBase(1, 0.6F, true).setUnlocalizedName("little_candy");
		    TechItems.registerItem(little_candy, "little_candy");
	    }
	    if (ConfigHandler.CookedApple){
		    cooked_apple = new FoodBase(8, 8.0F, true).setUnlocalizedName("cooked_apple");
		    TechItems.registerItem(cooked_apple, "cooked_apple");
	    }
	    if (ConfigHandler.Sandwiches){
	    	bread_slice = new FoodBase(1, 0.1F, true).setUnlocalizedName("bread_slice");
		    TechItems.registerItem(bread_slice, "bread_slice");
		    rabbit_sandwhich = new FoodBase(8, 2.0F, true).setUnlocalizedName("rabbit_sandwhich");
		    TechItems.registerItem(rabbit_sandwhich, "rabbit_sandwhich");
		    bacon_eggs_sandwhich = new FoodBase(9, 11.0F, true).setUnlocalizedName("bacon_eggs_sandwhich");
		    TechItems.registerItem(bacon_eggs_sandwhich, "bacon_eggs_sandwhich");
		    chicken_sandwhich = new FoodBase(8, 2.0F, true).setUnlocalizedName("chicken_sandwhich");
		    TechItems.registerItem(chicken_sandwhich, "chicken_sandwhich");
		    beef_sandwhich = new FoodBase(10, 2.0F, true).setUnlocalizedName("beef_sandwhich");
		    TechItems.registerItem(beef_sandwhich, "beef_sandwhich");
		    bacon_sandwhich = new FoodBase(6, 2.0F, true).setUnlocalizedName("bacon_sandwhich");
		    TechItems.registerItem(bacon_sandwhich, "bacon_sandwhich");
	    }
		
	}
	
	public static void render(){
		// Juices
		if (ConfigHandler.all_juices){
			TechItems.renderItem(juicer, "juicer");
			TechItems.renderItem(apple_juice, "apple_juice");
			TechItems.renderItem(carrot_juice, "carrot_juice");
			TechItems.renderItem(potatoe_juice, "potatoe_juice");
			TechItems.renderItem(beet_juice, "beet_juice");
			TechItems.renderItem(cactus_juice, "cactus_juice");
			TechItems.renderItem(slime_juice, "slime_juice");
			TechItems.renderItem(wheat_juice, "wheat_juice");
			TechItems.renderItem(melon_juice, "melon_juice");
			TechItems.renderItem(pumpkin_juice, "pumpkin_juice");
		}
		
		// Apples
		if (ConfigHandler.DiamondApple) {
			TechItems.renderItem(diamond_apple, "diamond_apple");
		}
		if (ConfigHandler.EmeraldApple) {
			TechItems.renderItem(emerald_apple, "emerald_apple");
		}
		if (ConfigHandler.iron_apple) {
			TechItems.renderItem(iron_apple, "iron_apple");
		}
 		if (ConfigHandler.redstone_apple) {
			TechItems.renderItem(redstone_apple, "redstone_apple");
		}
		if (ConfigHandler.ApplePro) {
			TechItems.renderItem(golden_apple, "golden_apple");
		}
		
		// Extra Food
		if (ConfigHandler.CookedBacon){
		    TechItems.renderItem(raw_bacon, "raw_bacon");
		    TechItems.renderItem(cooked_bacon, "cooked_bacon");
	    }
	    if (ConfigHandler.MonsterJerky){
		    TechItems.renderItem(monster_jerky, "monster_jerky");
	    }
	    if (ConfigHandler.ToastedBread){
		    TechItems.renderItem(toasted_bread, "toasted_bread");
	    }
	    if (ConfigHandler.FriedEgg){
		    TechItems.renderItem(fried_egg, "fried_egg");
	    }
	    if (ConfigHandler.CookedMushrooms){
		    TechItems.renderItem(cooked_mushroom_brown, "cooked_mushroom_brown");
		    TechItems.renderItem(cooked_mushroom_red, "cooked_mushroom_red");
	    }
	    if (ConfigHandler.BaconEggs){
		    TechItems.renderItem(bacon_eggs, "bacon_eggs");
	    }
	    if (ConfigHandler.LittleCandy){
		    TechItems.renderItem(little_candy, "little_candy");
	    }
	    if (ConfigHandler.CookedApple){
		    TechItems.renderItem(cooked_apple, "cooked_apple");
	    }
	    if (ConfigHandler.Sandwiches){
		    TechItems.renderItem(bread_slice, "bread_slice");
		    TechItems.renderItem(rabbit_sandwhich, "rabbit_sandwhich");
		    TechItems.renderItem(bacon_eggs_sandwhich, "bacon_eggs_sandwhich");
		    TechItems.renderItem(chicken_sandwhich, "chicken_sandwhich");
		    TechItems.renderItem(beef_sandwhich, "beef_sandwhich");
		    TechItems.renderItem(bacon_sandwhich, "bacon_sandwhich");
	    }
		
	}
}
