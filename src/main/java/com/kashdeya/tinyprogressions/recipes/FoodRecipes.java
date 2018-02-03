package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechFoods;
import com.kashdeya.tinyprogressions.registry.recipes.ShapedRecipe;
import com.kashdeya.tinyprogressions.registry.recipes.ShapelessRecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoodRecipes {

	public static IRecipe BSC_SUGAR_COOKIE;
	public static IRecipe BAMS_PIZZA;
	
	public static IRecipe JUICER, PEAR_JUICE, PEACH_JUICE, PEAR_JUICE2, PEACH_JUICE2;
	public static IRecipe APPLE_JUICE, CARROT_JUICE, POTATO_JUICE, BEET_JUICE, CACTUS_JUICE, SLIME_JUICE, WHEAT_JUICE, MELON_JUICE, PUMPKIN_JUICE;
	public static IRecipe APPLE_JUICE2, CARROT_JUICE2, POTATO_JUICE2, BEET_JUICE2, CACTUS_JUICE2, SLIME_JUICE2, WHEAT_JUICE2, MELON_JUICE2, PUMPKIN_JUICE2;
	
	public static IRecipe RASPBERRY_JUICE, BLUEBERRY_JUICE, BLACKBERRY_JUICE, MALOBERRY_JUICE;
	public static IRecipe RASPBERRY_JUICE2, BLUEBERRY_JUICE2, BLACKBERRY_JUICE2, MALOBERRY_JUICE2;
	
	public static IRecipe DIAMOND_APPLE, EMERALD_APPLE, IRON_APPLE, REDSTONE_APPLE;
	public static IRecipe GOLDEN_APPLE1, GOLDEN_APPLE2, GOLDEN_APPLE3, GOLDEN_APPLE4;
	
	public static IRecipe RAW_BACON;
	public static IRecipe BACON_EGGS, BACON_EGGS_SANDWICH, BREAD_SLICE, BACON_SANDWICH, BEEF_SANDWICH, CHICKEN_SANDWICH, RABBIT_SANDWICH;
	
	public static void init() {
		
		// bsc cookie
		if (ConfigHandler.bsc_sugar_cookie){
			BSC_SUGAR_COOKIE = new ShapedRecipe(new ItemStack(TechFoods.bsc_sugar_cookie, 8), "wsw",
				'w', Items.WHEAT,
				's', Items.SUGAR);
		}
		
		// Bams Pizza 
		if (ConfigHandler.bams_pizza){
			BAMS_PIZZA = new ShapedRecipe(new ItemStack(TechFoods.bams_pizza), "bbb",
                " b ",
                " b ",
				'b', Items.BREAD);
		}
		// Juicer (Can not be turned off)
			JUICER = new ShapedRecipe(new ItemStack(TechFoods.juicer), "l",
                "s",
				's', "stone",
				'l', Blocks.STONE_BUTTON);
		
		// Extra Drop w/o Bottles
		if (!ConfigHandler.extra_drop_bottle){
			PEAR_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.pear_juice), "juicer", TechFoods.plump_pear);
			PEACH_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.peach_juice), "juicer", TechFoods.plump_peach);
		}
		// Extra Drops Bottles
		if (ConfigHandler.extra_drop_bottle){
			PEAR_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.pear_juice), "juicer", TechFoods.plump_pear, "glassBottle");
			PEACH_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.peach_juice), "juicer", TechFoods.plump_peach, "glassBottle");
		}
		
		// Juices WO Bottles
		if (ConfigHandler.all_juices && ConfigHandler.JuiceBottles == false){
			
			APPLE_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.apple_juice), "juicer", Items.APPLE);
			
			CARROT_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.carrot_juice), "juicer", Items.CARROT);
			
			POTATO_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.potatoe_juice), "juicer", Items.POTATO);
			
			BEET_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.beet_juice), "juicer", Items.BEETROOT);
			
			CACTUS_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.cactus_juice, 2), "juicer", Blocks.CACTUS);
			
			SLIME_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.slime_juice), "juicer", Items.SLIME_BALL);
			
			WHEAT_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.wheat_juice), "juicer", Items.WHEAT);
			
			MELON_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.melon_juice), "juicer", Items.MELON);
			
			PUMPKIN_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.pumpkin_juice, 2), "juicer", Blocks.PUMPKIN);
		}
		
		// Juice Bottles
		if (ConfigHandler.JuiceBottles && ConfigHandler.all_juices == false){
			
			APPLE_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.apple_juice), "juicer", Items.APPLE, "glassBottle");
			
			CARROT_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.carrot_juice), "juicer", Items.CARROT, "glassBottle");
			
			POTATO_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.potatoe_juice), "juicer", Items.POTATO, "glassBottle");
			
			BEET_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.beet_juice), "juicer", Items.BEETROOT, "glassBottle");
			
			CACTUS_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.cactus_juice, 2), "juicer", Blocks.CACTUS, "glassBottle", "glassBottle");
			
			SLIME_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.slime_juice), "juicer", Items.SLIME_BALL, "glassBottle");
			
			WHEAT_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.wheat_juice), "juicer", Items.WHEAT, "glassBottle");
			
			MELON_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.melon_juice), "juicer", Items.MELON, "glassBottle");
			
			PUMPKIN_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.pumpkin_juice, 2), "juicer", Blocks.PUMPKIN, "glassBottle", "glassBottle");
		}
		
		// Juices WO Bottles
		if (ConfigHandler.ExtraJuices && !ConfigHandler.ExtraJuicesBottles){
			
			RASPBERRY_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.raspberry_juice), "juicer", "cropRaspberry");
			
			BLUEBERRY_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.blueberry_juice), "juicer", "cropBlueberry");
			
			BLACKBERRY_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.blackberry_juice), "juicer", "cropBlackberry");
			
			MALOBERRY_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.maloberry_juice), "juicer", "cropMaloberry");
		}
		
		// Juice Bottles
		if (ConfigHandler.ExtraJuicesBottles && !ConfigHandler.ExtraJuices){
			
			RASPBERRY_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.raspberry_juice), "juicer", "cropRaspberry", "glassBottle");
			
			BLUEBERRY_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.blueberry_juice), "juicer", "cropBlueberry", "glassBottle");
			
			BLACKBERRY_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.blackberry_juice), "juicer", "cropBlackberry", "glassBottle");
			
			MALOBERRY_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.maloberry_juice), "juicer", "cropMaloberry", "glassBottle");
		}
		
		// Apples
		if (ConfigHandler.DiamondApple) {
			DIAMOND_APPLE = new ShapedRecipe(new ItemStack(TechFoods.diamond_apple), "ddd",
                "dad",
                "ddd",
				'd', "gemDiamond",
				'a', new ItemStack(Items.APPLE));
		}
		if (ConfigHandler.EmeraldApple) {
			EMERALD_APPLE = new ShapedRecipe(new ItemStack(TechFoods.emerald_apple), "eee",
                "eae",
                "eee",
				'e', "gemEmerald",
				'a', new ItemStack(Items.APPLE));
		}
		if (ConfigHandler.iron_apple) {
			IRON_APPLE = new ShapedRecipe(new ItemStack(TechFoods.iron_apple), "iii",
                "iai",
                "iii",
				'i', "ingotIron",
				'a', new ItemStack(Items.APPLE));
		}
 		if (ConfigHandler.redstone_apple) {
			REDSTONE_APPLE = new ShapedRecipe(new ItemStack(TechFoods.redstone_apple), "rrr",
                "rar",
                "rrr",
				'r', "dustRedstone",
				'a', new ItemStack(Items.APPLE));
		}
 		
 		// Apple Pro
		if (ConfigHandler.ApplePro && ConfigHandler.NotchApple == false) {
			GOLDEN_APPLE1 = new ShapedRecipe(new ItemStack(Items.GOLDEN_APPLE), "ggg",
                "gag",
                "ggg",
				'g', "nuggetGold",
				'a', new ItemStack(Items.APPLE));
			GOLDEN_APPLE2 = new ShapedRecipe(new ItemStack(TechFoods.golden_apple), "ggg",
                "gag",
                "ggg",
				'g', "ingotGold",
				'a', new ItemStack(Items.GOLDEN_APPLE));
			GOLDEN_APPLE3 = new ShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), "ggg",
                "gag",
                "ggg",
				'g', "blockGold",
				'a', TechFoods.golden_apple);
		}
		
		// Notch Apple
		if (ConfigHandler.NotchApple && ConfigHandler.ApplePro == false) {
			GOLDEN_APPLE4 = new ShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), "ggg",
                "gag",
                "ggg",
				'g', "blockGold",
				'a', new ItemStack(Items.APPLE));
		}
		
		// Extra Food
		if (ConfigHandler.CookedApple) {
			GameRegistry.addSmelting(Items.APPLE, new ItemStack(TechFoods.cooked_apple), 1.0F);
		}
		if (ConfigHandler.CookedMushrooms) {
			GameRegistry.addSmelting(Blocks.RED_MUSHROOM, new ItemStack(TechFoods.cooked_mushroom_red), 0.5F);
			GameRegistry.addSmelting(Blocks.BROWN_MUSHROOM, new ItemStack(TechFoods.cooked_mushroom_brown), 0.5F);
		}
		if (ConfigHandler.CookedBacon) {
			RAW_BACON = new ShapelessRecipe(new ItemStack(TechFoods.raw_bacon, 4), Items.PORKCHOP);
			GameRegistry.addSmelting(TechFoods.raw_bacon, new ItemStack(TechFoods.cooked_bacon), 0.5F);
		}
		if (ConfigHandler.FriedEgg) {
			GameRegistry.addSmelting(Items.EGG, new ItemStack(TechFoods.fried_egg), 0.5F);
		}
		if (ConfigHandler.MonsterJerky) {
			GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(TechFoods.monster_jerky), 0.5F);
		}
		if (ConfigHandler.ToastedBread) {
			GameRegistry.addSmelting(Items.BREAD, new ItemStack(TechFoods.toasted_bread), 0.5F);
		}
		if (ConfigHandler.CookedMushrooms) {
			GameRegistry.addSmelting(Items.SUGAR, new ItemStack(TechFoods.little_candy), 0.5F);
		}
		if (ConfigHandler.Sandwiches) {
			BACON_EGGS = new ShapelessRecipe(new ItemStack(TechFoods.bacon_eggs), TechFoods.cooked_bacon, TechFoods.fried_egg, TechFoods.fried_egg);
			
			BACON_EGGS_SANDWICH = new ShapelessRecipe(new ItemStack(TechFoods.bacon_eggs_sandwhich), TechFoods.bread_slice, TechFoods.bacon_eggs, TechFoods.bread_slice);
			
			BREAD_SLICE = new ShapelessRecipe(new ItemStack(TechFoods.bread_slice, 10), Items.BREAD);
			
			BACON_SANDWICH = new ShapelessRecipe(new ItemStack(TechFoods.bacon_sandwhich), TechFoods.bread_slice, TechFoods.cooked_bacon, TechFoods.cooked_bacon, TechFoods.bread_slice);
			
			BEEF_SANDWICH = new ShapelessRecipe(new ItemStack(TechFoods.beef_sandwhich), TechFoods.bread_slice, Items.COOKED_BEEF, TechFoods.bread_slice);
			
			CHICKEN_SANDWICH = new ShapelessRecipe(new ItemStack(TechFoods.chicken_sandwhich), TechFoods.bread_slice, Items.COOKED_CHICKEN, TechFoods.bread_slice);
			
			RABBIT_SANDWICH = new ShapelessRecipe(new ItemStack(TechFoods.rabbit_sandwhich), TechFoods.bread_slice, Items.COOKED_RABBIT, TechFoods.bread_slice);
		}
	}
}
