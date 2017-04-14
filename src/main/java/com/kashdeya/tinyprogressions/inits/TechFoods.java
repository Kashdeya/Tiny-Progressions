package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.food.DrinkBase;
import com.kashdeya.tinyprogressions.items.food.FoodBase;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TechFoods {
	
	public static Item apple_juice;
	public static Item carrot_juice;
	public static Item cactus_juice;
	public static Item slim_juice;
	public static Item watermelon_juice;
	public static Item beet_juice;
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
	public static Item french_fries;
	public static Item rabbit_sandwhich;
	public static Item bacon_eggs_sandwhich;
	
	public static void init(){
		// Drinks
		if (ConfigHandler.Juicer){
			// Apple
			apple_juice = new DrinkBase(6, false).setUnlocalizedName("apple_juice");
		    registerItem(apple_juice, "apple_juice");
		    // Carrot
			carrot_juice = new DrinkBase(4, false).setUnlocalizedName("carrot_juice");
		    registerItem(carrot_juice, "carrot_juice");
		    // Cactus
	    	cactus_juice = new DrinkBase(4, false).setUnlocalizedName("cactus_juice");
		    registerItem(cactus_juice, "cactus_juice");
		    // Slim
	    	slim_juice = new DrinkBase(2, false).setUnlocalizedName("slim_juice");
		    registerItem(slim_juice, "slim_juice");
		    // Watermelon
	    	watermelon_juice = new DrinkBase(4, false).setUnlocalizedName("watermelon_juice");
	    	registerItem(watermelon_juice, "watermelon_juice");
	    	// Beet
	    	beet_juice = new DrinkBase(3, false).setUnlocalizedName("beet_juice");
	    	registerItem(beet_juice, "beet_juice");
	    }
		if (ConfigHandler.CookedBacon){
		    raw_bacon = new FoodBase(1, 0.1F, true).setUnlocalizedName("raw_bacon");
		    registerItem(raw_bacon, "raw_bacon");
		    cooked_bacon = new FoodBase(3, 0.3F, true).setUnlocalizedName("cooked_bacon");
		    registerItem(cooked_bacon, "cooked_bacon");
	    }
	    if (ConfigHandler.MonsterJerky){
		    monster_jerky = new FoodBase(4, 0.5F, true).setUnlocalizedName("monster_jerky");
		    registerItem(monster_jerky, "monster_jerky");
	    }
	    if (ConfigHandler.ToastedBread){
		    toasted_bread = new FoodBase(7, 3.0F, true).setUnlocalizedName("toasted_bread");
		    registerItem(toasted_bread, "toasted_bread");
	    }
	    if (ConfigHandler.FriedEgg){
		    fried_egg = new FoodBase(5, 0.6F, true).setUnlocalizedName("fried_egg");
		    registerItem(fried_egg, "fried_egg");
	    }
	    if (ConfigHandler.CookedMushroomBrown){
		    cooked_mushroom_brown = new FoodBase(2, 03F, false).setUnlocalizedName("cooked_mushroom_brown");
		    registerItem(cooked_mushroom_brown, "cooked_mushroom_brown");
	    }
	    if (ConfigHandler.CookedMushroomRed){
		    cooked_mushroom_red = new FoodBase(2, 03F, false).setUnlocalizedName("cooked_mushroom_red");
		    registerItem(cooked_mushroom_red, "cooked_mushroom_red");
	    }
	    if (ConfigHandler.BaconEggs){
		    bacon_eggs = new FoodBase(6, 0.7F, false).setUnlocalizedName("bacon_eggs");
		    registerItem(bacon_eggs, "bacon_eggs");
	    }
	    if (ConfigHandler.LittleCandy){
		    little_candy = new FoodBase(2, 0.6F, true).setUnlocalizedName("little_candy");
		    registerItem(little_candy, "little_candy");
	    }
	    if (ConfigHandler.BaconSandwhich){
		    bacon_sandwhich = new FoodBase(6, 2.0F, true).setUnlocalizedName("bacon_sandwhich");
		    registerItem(bacon_sandwhich, "bacon_sandwhich");
	    }
	    if (ConfigHandler.BeefSandwhich){
		    beef_sandwhich = new FoodBase(10, 2.0F, true).setUnlocalizedName("beef_sandwhich");
		    registerItem(beef_sandwhich, "beef_sandwhich");
	    }
	    if (ConfigHandler.BreadSlice){
		    bread_slice = new FoodBase(1, 0.1F, true).setUnlocalizedName("bread_slice");
		    registerItem(bread_slice, "bread_slice");
	    }
	    if (ConfigHandler.ChickenSandwhich){
		    chicken_sandwhich = new FoodBase(8, 2.0F, true).setUnlocalizedName("chicken_sandwhich");
		    registerItem(chicken_sandwhich, "chicken_sandwhich");
	    }
	    if (ConfigHandler.CookedApple){
		    cooked_apple = new FoodBase(8, 10.0F, true).setUnlocalizedName("cooked_apple");
		    registerItem(cooked_apple, "cooked_apple");
	    }
	    if (ConfigHandler.FrenchFries){
		    french_fries = new FoodBase(8, 8.2F, true).setUnlocalizedName("french_fries");
		    registerItem(french_fries, "french_fries");
	    }
	    if (ConfigHandler.RabbitSandwhich){
		    rabbit_sandwhich = new FoodBase(8, 2.0F, true).setUnlocalizedName("rabbit_sandwhich");
		    registerItem(rabbit_sandwhich, "rabbit_sandwhich");
	    }
	    if (ConfigHandler.BaconEggsSandwhich){
		    bacon_eggs_sandwhich = new FoodBase(9, 11.0F, true).setUnlocalizedName("bacon_eggs_sandwhich");
		    registerItem(bacon_eggs_sandwhich, "bacon_eggs_sandwhich");
	    }
		
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}
}
