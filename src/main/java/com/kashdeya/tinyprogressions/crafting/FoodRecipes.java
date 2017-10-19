package com.kashdeya.tinyprogressions.crafting;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechFoods;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class FoodRecipes {

	public static void init() {
		// Juicer
		if (ConfigHandler.all_juices || ConfigHandler.JuiceBottles || ConfigHandler.NaturaJuices || ConfigHandler.NaturaJuicesBottles){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.juicer), new Object[] {
					"l",
					"s",
						Character.valueOf('s'), "stone",
						Character.valueOf('l'), Blocks.STONE_BUTTON
			});
		}
		
		// Juices WO Bottles
		if (ConfigHandler.all_juices && ConfigHandler.JuiceBottles == false){
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.apple_juice), new Object[] {
					"juicer", Items.APPLE
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.carrot_juice), new Object[] {
					"juicer", Items.CARROT
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.potatoe_juice), new Object[] {
					"juicer", Items.POTATO
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.beet_juice), new Object[] {
					"juicer", Items.BEETROOT
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.cactus_juice, 2), new Object[] {
					"juicer", Blocks.CACTUS
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.slime_juice), new Object[] {
					"juicer", Items.SLIME_BALL
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.wheat_juice), new Object[] {
					"juicer", Items.WHEAT
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.melon_juice), new Object[] {
					"juicer", Items.MELON
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.pumpkin_juice, 2), new Object[] {
					"juicer", Blocks.PUMPKIN
			});
		}
		
		// Juice Bottles
		if (ConfigHandler.JuiceBottles && ConfigHandler.all_juices == false){
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.apple_juice), new Object[] {
					"juicer", Items.APPLE, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.carrot_juice), new Object[] {
					"juicer", Items.CARROT, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.potatoe_juice), new Object[] {
					"juicer", Items.POTATO, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.beet_juice), new Object[] {
					"juicer", Items.BEETROOT, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.cactus_juice, 2), new Object[] {
					"juicer", Blocks.CACTUS, "glassBottle", "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.slime_juice), new Object[] {
					"juicer", Items.SLIME_BALL, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.wheat_juice), new Object[] {
					"juicer", Items.WHEAT, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.melon_juice), new Object[] {
					"juicer", Items.MELON, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.pumpkin_juice, 2), new Object[] {
					"juicer", Blocks.PUMPKIN, "glassBottle", "glassBottle"
			});
		}
		
		// Juices WO Bottles
		if (ConfigHandler.NaturaJuices && ConfigHandler.NaturaJuicesBottles == false){
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.raspberry_juice), new Object[] {
					"juicer", "cropRaspberry"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.blueberry_juice), new Object[] {
					"juicer", "cropBlueberry"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.blackberry_juice), new Object[] {
					"juicer", "cropBlackberry"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.maloberry_juice), new Object[] {
					"juicer", "cropMaloberry"
			});
		}
		
		// Juice Bottles
		if (ConfigHandler.NaturaJuicesBottles && ConfigHandler.NaturaJuices == false){
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.raspberry_juice), new Object[] {
					"juicer", "cropRaspberry", "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.blueberry_juice), new Object[] {
					"juicer", "cropBlueberry", "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.blackberry_juice), new Object[] {
					"juicer", "cropBlackberry", "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.maloberry_juice), new Object[] {
					"juicer", "cropMaloberry", "glassBottle"
			});
		}
		
		// Apples
		if (ConfigHandler.DiamondApple) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.diamond_apple), new Object[] {
					"ddd",
					"dad",
					"ddd",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.EmeraldApple) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.emerald_apple), new Object[] {
					"eee",
					"eae",
					"eee",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.iron_apple) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.iron_apple), new Object[] {
					"iii",
					"iai",
					"iii",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('a'), Items.APPLE
			});
		}
 		if (ConfigHandler.redstone_apple) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.redstone_apple), new Object[] {
					"rrr",
					"rar",
					"rrr",
						Character.valueOf('r'), "dustRedstone",
						Character.valueOf('a'), Items.APPLE
			});
		}
 		
 		// Apple Pro
		if (ConfigHandler.ApplePro && ConfigHandler.NotchApple == false) {
			RecipeRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 0), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "nuggetGold",
						Character.valueOf('a'), Items.APPLE
			});
			RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.golden_apple), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "ingotGold",
						Character.valueOf('a'), new ItemStack(Items.GOLDEN_APPLE, 1, 0)
			});
			RecipeRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "blockGold",
						Character.valueOf('a'), TechFoods.golden_apple
			});
		}
		
		// Notch Apple
		if (ConfigHandler.NotchApple && ConfigHandler.ApplePro == false) {
			RecipeRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "blockGold",
						Character.valueOf('a'), Items.APPLE
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
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.raw_bacon, 4), new Object[] {
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
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.bacon_eggs), new Object[] {
					TechFoods.cooked_bacon, TechFoods.fried_egg, TechFoods.fried_egg
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.bacon_eggs_sandwhich), new Object[] {
					TechFoods.bread_slice, TechFoods.bacon_eggs, TechFoods.bread_slice
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.bread_slice, 10), new Object[] {
					Items.BREAD
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.bacon_sandwhich), new Object[] {
					TechFoods.bread_slice, TechFoods.cooked_bacon, TechFoods.cooked_bacon, TechFoods.bread_slice
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.beef_sandwhich), new Object[] {
					TechFoods.bread_slice, Items.COOKED_BEEF, TechFoods.bread_slice
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.chicken_sandwhich), new Object[] {
					TechFoods.bread_slice, Items.COOKED_CHICKEN, TechFoods.bread_slice
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.rabbit_sandwhich), new Object[] {
					TechFoods.bread_slice, Items.COOKED_RABBIT, TechFoods.bread_slice
			});
		}
	}
}
