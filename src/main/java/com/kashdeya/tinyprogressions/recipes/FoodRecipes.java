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
	
	public static IRecipe JUICER;
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
			BSC_SUGAR_COOKIE = new ShapedRecipe(new ItemStack(TechFoods.bsc_sugar_cookie, 8), new Object[] {
					"wsw",
						Character.valueOf('w'), Items.WHEAT,
						Character.valueOf('s'), Items.SUGAR
			});
		}
		
		// Bams Pizza 
		if (ConfigHandler.bams_pizza){
			BAMS_PIZZA = new ShapedRecipe(new ItemStack(TechFoods.bams_pizza), new Object[] {
					"bbb",
					" b ",
					" b ",
						Character.valueOf('b'), Items.BREAD
			});
		}
		// Juicer
		if (ConfigHandler.all_juices || ConfigHandler.JuiceBottles || ConfigHandler.ExtraJuices || ConfigHandler.ExtraJuicesBottles){
			JUICER = new ShapedRecipe(new ItemStack(TechFoods.juicer), new Object[] {
					"l",
					"s",
						Character.valueOf('s'), "stone",
						Character.valueOf('l'), Blocks.STONE_BUTTON
			});
		}
		
		// Juices WO Bottles
		if (ConfigHandler.all_juices && ConfigHandler.JuiceBottles == false){
			
			APPLE_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.apple_juice), new Object[] {
					"juicer", Items.APPLE
			});
			
			CARROT_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.carrot_juice), new Object[] {
					"juicer", Items.CARROT
			});
			
			POTATO_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.potatoe_juice), new Object[] {
					"juicer", Items.POTATO
			});
			
			BEET_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.beet_juice), new Object[] {
					"juicer", Items.BEETROOT
			});
			
			CACTUS_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.cactus_juice, 2), new Object[] {
					"juicer", Blocks.CACTUS
			});
			
			SLIME_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.slime_juice), new Object[] {
					"juicer", Items.SLIME_BALL
			});
			
			WHEAT_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.wheat_juice), new Object[] {
					"juicer", Items.WHEAT
			});
			
			MELON_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.melon_juice), new Object[] {
					"juicer", Items.MELON
			});
			
			PUMPKIN_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.pumpkin_juice, 2), new Object[] {
					"juicer", Blocks.PUMPKIN
			});
		}
		
		// Juice Bottles
		if (ConfigHandler.JuiceBottles && ConfigHandler.all_juices == false){
			
			APPLE_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.apple_juice), new Object[] {
					"juicer", Items.APPLE, "glassBottle"
			});
			
			CARROT_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.carrot_juice), new Object[] {
					"juicer", Items.CARROT, "glassBottle"
			});
			
			POTATO_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.potatoe_juice), new Object[] {
					"juicer", Items.POTATO, "glassBottle"
			});
			
			BEET_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.beet_juice), new Object[] {
					"juicer", Items.BEETROOT, "glassBottle"
			});
			
			CACTUS_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.cactus_juice, 2), new Object[] {
					"juicer", Blocks.CACTUS, "glassBottle", "glassBottle"
			});
			
			SLIME_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.slime_juice), new Object[] {
					"juicer", Items.SLIME_BALL, "glassBottle"
			});
			
			WHEAT_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.wheat_juice), new Object[] {
					"juicer", Items.WHEAT, "glassBottle"
			});
			
			MELON_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.melon_juice), new Object[] {
					"juicer", Items.MELON, "glassBottle"
			});
			
			PUMPKIN_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.pumpkin_juice, 2), new Object[] {
					"juicer", Blocks.PUMPKIN, "glassBottle", "glassBottle"
			});
		}
		
		// Juices WO Bottles
		if (ConfigHandler.ExtraJuices && !ConfigHandler.ExtraJuicesBottles){
			
			RASPBERRY_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.raspberry_juice), new Object[] {
					"juicer", "cropRaspberry"
			});
			
			BLUEBERRY_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.blueberry_juice), new Object[] {
					"juicer", "cropBlueberry"
			});
			
			BLACKBERRY_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.blackberry_juice), new Object[] {
					"juicer", "cropBlackberry"
			});
			
			MALOBERRY_JUICE = new ShapelessRecipe(new ItemStack(TechFoods.maloberry_juice), new Object[] {
					"juicer", "cropMaloberry"
			});
		}
		
		// Juice Bottles
		if (ConfigHandler.ExtraJuicesBottles && !ConfigHandler.ExtraJuices){
			
			RASPBERRY_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.raspberry_juice), new Object[] {
					"juicer", "cropRaspberry", "glassBottle"
			});
			
			BLUEBERRY_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.blueberry_juice), new Object[] {
					"juicer", "cropBlueberry", "glassBottle"
			});
			
			BLACKBERRY_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.blackberry_juice), new Object[] {
					"juicer", "cropBlackberry", "glassBottle"
			});
			
			MALOBERRY_JUICE2 = new ShapelessRecipe(new ItemStack(TechFoods.maloberry_juice), new Object[] {
					"juicer", "cropMaloberry", "glassBottle"
			});
		}
		
		// Apples
		if (ConfigHandler.DiamondApple) {
			DIAMOND_APPLE = new ShapedRecipe(new ItemStack(TechFoods.diamond_apple), new Object[] {
					"ddd",
					"dad",
					"ddd",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('a'), new ItemStack(Items.APPLE)
			});
		}
		if (ConfigHandler.EmeraldApple) {
			EMERALD_APPLE = new ShapedRecipe(new ItemStack(TechFoods.emerald_apple), new Object[] {
					"eee",
					"eae",
					"eee",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('a'), new ItemStack(Items.APPLE)
			});
		}
		if (ConfigHandler.iron_apple) {
			IRON_APPLE = new ShapedRecipe(new ItemStack(TechFoods.iron_apple), new Object[] {
					"iii",
					"iai",
					"iii",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('a'), new ItemStack(Items.APPLE)
			});
		}
 		if (ConfigHandler.redstone_apple) {
			REDSTONE_APPLE = new ShapedRecipe(new ItemStack(TechFoods.redstone_apple), new Object[] {
					"rrr",
					"rar",
					"rrr",
						Character.valueOf('r'), "dustRedstone",
						Character.valueOf('a'), new ItemStack(Items.APPLE)
			});
		}
 		
 		// Apple Pro
		if (ConfigHandler.ApplePro && ConfigHandler.NotchApple == false) {
			GOLDEN_APPLE1 = new ShapedRecipe(new ItemStack(Items.GOLDEN_APPLE), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "nuggetGold",
						Character.valueOf('a'), new ItemStack(Items.APPLE)
			});
			GOLDEN_APPLE2 = new ShapedRecipe(new ItemStack(TechFoods.golden_apple), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "ingotGold",
						Character.valueOf('a'), new ItemStack(Items.GOLDEN_APPLE)
			});
			GOLDEN_APPLE3 = new ShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "blockGold",
						Character.valueOf('a'), TechFoods.golden_apple
			});
		}
		
		// Notch Apple
		if (ConfigHandler.NotchApple && ConfigHandler.ApplePro == false) {
			GOLDEN_APPLE4 = new ShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "blockGold",
						Character.valueOf('a'), new ItemStack(Items.APPLE)
			});
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
			RAW_BACON = new ShapelessRecipe(new ItemStack(TechFoods.raw_bacon, 4), new Object[] {
					Items.PORKCHOP
			});
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
			BACON_EGGS = new ShapelessRecipe(new ItemStack(TechFoods.bacon_eggs), new Object[] {
					TechFoods.cooked_bacon, TechFoods.fried_egg, TechFoods.fried_egg
			});
			
			BACON_EGGS_SANDWICH = new ShapelessRecipe(new ItemStack(TechFoods.bacon_eggs_sandwhich), new Object[] {
					TechFoods.bread_slice, TechFoods.bacon_eggs, TechFoods.bread_slice
			});
			
			BREAD_SLICE = new ShapelessRecipe(new ItemStack(TechFoods.bread_slice, 10), new Object[] {
					Items.BREAD
			});
			
			BACON_SANDWICH = new ShapelessRecipe(new ItemStack(TechFoods.bacon_sandwhich), new Object[] {
					TechFoods.bread_slice, TechFoods.cooked_bacon, TechFoods.cooked_bacon, TechFoods.bread_slice
			});
			
			BEEF_SANDWICH = new ShapelessRecipe(new ItemStack(TechFoods.beef_sandwhich), new Object[] {
					TechFoods.bread_slice, Items.COOKED_BEEF, TechFoods.bread_slice
			});
			
			CHICKEN_SANDWICH = new ShapelessRecipe(new ItemStack(TechFoods.chicken_sandwhich), new Object[] {
					TechFoods.bread_slice, Items.COOKED_CHICKEN, TechFoods.bread_slice
			});
			
			RABBIT_SANDWICH = new ShapelessRecipe(new ItemStack(TechFoods.rabbit_sandwhich), new Object[] {
					TechFoods.bread_slice, Items.COOKED_RABBIT, TechFoods.bread_slice
			});
		}
	}
}
