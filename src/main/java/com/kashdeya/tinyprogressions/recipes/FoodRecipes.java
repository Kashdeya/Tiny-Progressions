package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.inits.TechFoods;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class FoodRecipes {

	public static void init() {
		
//		// bsc cookie
//
//		exportJson.addShapedRecipe(new ItemStack(TechFoods.bsc_sugar_cookie.get(), 8), "wsw",
//				'w', new ItemStack(Items.WHEAT),
//				's', new ItemStack(Items.SUGAR));
//		
//		// Bams Pizza 
//		
//		exportJson.addShapedRecipe(new ItemStack(TechFoods.bams_pizza.get()), "bbb",
//                " b ",
//                " b ",
//				'b', new ItemStack(Items.BREAD));
//		
//		
//		// SUCC THE PEARLS
//		
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.succ_pearls.get()), new ItemStack(Items.ENDER_PEARL), "forge:juicer");
//		
//		
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.succ_pearls.get()), new ItemStack(Items.ENDER_PEARL), "forge:juicer", "forge:bottles/glass");
//		
//		
//		// Extra Drop w/o Bottles
//		
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.pear_juice.get()), "forge:juicer", new ItemStack(TechFoods.plump_pear.get()));
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.peach_juice.get()), "forge:juicer", new ItemStack(TechFoods.plump_peach.get()));
//		
//		// Extra Drops Bottles
//		
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.pear_juice.get()), "forge:juicer",  new ItemStack(TechFoods.plump_pear.get()), "forge:bottles/glass");
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.peach_juice.get()), "forge:juicer", new ItemStack(TechFoods.plump_peach.get()), "forge:bottles/glass");
//		
//		
//		// Juices WO Bottles
//		
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.apple_juice.get()), "forge:juicer", Items.APPLE);
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.carrot_juice.get()), "forge:juicer", Items.CARROT);
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.potatoe_juice.get()), "forge:juicer", Items.POTATO);
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.beet_juice.get()), "forge:juicer", Items.BEETROOT);
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.cactus_juice.get(), 2), "forge:juicer", Blocks.CACTUS);
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.slime_juice.get()), "forge:juicer", Items.SLIME_BALL);
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.wheat_juice.get()), "forge:juicer", Items.WHEAT);
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.melon_juice.get()), "forge:juicer", Items.MELON);
//			
//		
//		
//		
//		// Juice Bottles
//		
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.apple_juice.get()), "forge:juicer", Items.APPLE, "forge:bottles/glass");
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.carrot_juice.get()), "forge:juicer", Items.CARROT, "forge:bottles/glass");
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.potatoe_juice.get()), "forge:juicer", Items.POTATO, "forge:bottles/glass");
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.beet_juice.get()), "forge:juicer", Items.BEETROOT, "forge:bottles/glass");
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.cactus_juice.get(), 2), "forge:juicer", Blocks.CACTUS, "forge:bottles/glass", "forge:bottles/glass");
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.slime_juice.get()), "forge:juicer", Items.SLIME_BALL, "forge:bottles/glass");
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.wheat_juice.get()), "forge:juicer", Items.WHEAT, "forge:bottles/glass");
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.melon_juice.get()), "forge:juicer", Items.MELON, "forge:bottles/glass");
//			
//		
//		
//		
//		// Juices WO Bottles
//		
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.raspberry_juice.get()), "forge:juicer", "forge:crops/raspberry");
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.blueberry_juice.get()), "forge:juicer", "forge:crops/blueberry");
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.blackberry_juice.get()), "forge:juicer", "forge:crops/blackberry");
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.maloberry_juice.get()), "forge:juicer", "forge:crops/maloberry");
//		
//		
//		// Juice Bottles
//		
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.raspberry_juice.get()), "forge:juicer", "forge:crops/raspberry", "forge:bottles/glass");
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.blueberry_juice.get()), "forge:juicer", "forge:crops/blueberry", "forge:bottles/glass");
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.blackberry_juice.get()), "forge:juicer", "forge:crops/blackberry", "forge:bottles/glass");
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.maloberry_juice.get()), "forge:juicer", "forge:crops/maloberry", "forge:bottles/glass");
//		
//		
//		// Apples
//		
//		exportJson.addShapedRecipe(new ItemStack(TechFoods.diamond_apple.get()), "ddd",
//                "dad",
//                "ddd",
//				'd', "forge:gem/diamond",
//				'a', new ItemStack(Items.APPLE));
//		
//		
//		exportJson.addShapedRecipe(new ItemStack(TechFoods.emerald_apple.get()), "eee",
//                "eae",
//                "eee",
//				'e', "forge:gems/emerald",
//				'a', new ItemStack(Items.APPLE));
//		
//		
//		exportJson.addShapedRecipe(new ItemStack(TechFoods.iron_apple.get()), "iii",
//                "iai",
//                "iii",
//				'i', "forge:ingots/iron",
//				'a', new ItemStack(Items.APPLE));
//		
// 		
//		exportJson.addShapedRecipe(new ItemStack(TechFoods.redstone_apple.get()), "rrr",
//                "rar",
//                "rrr",
//				'r', "forge:dusts/redstone",
//				'a', new ItemStack(Items.APPLE));
//		
// 		
// 		// Apple Pro
//		
//		exportJson.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE), "ggg",
//                "gag",
//                "ggg",
//				'g', "forge:nuggets/gold",
//				'a', new ItemStack(Items.APPLE));
//		exportJson.addShapedRecipe(new ItemStack(TechFoods.golden_apple.get()), "ggg",
//                "gag",
//                "ggg",
//				'g', "forge:ingots/gold",
//				'a', new ItemStack(Items.GOLDEN_APPLE));
//		exportJson.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1), "ggg",
//                "gag",
//                "ggg",
//				'g', "forge:storage_blocks/gold",
//				'a', new ItemStack(TechFoods.golden_apple.get()));
//		
//		
//		// Notch Apple
//		
//		exportJson.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1), "ggg",
//                "gag",
//                "ggg",
//				'g', "forge:storage_blocks/gold",
//				'a', new ItemStack(Items.APPLE));
//		
//		
//		// Extra Food
//		
//		exportJson.addSmeltingRecipe(new ItemStack(TechFoods.cooked_apple.get()), 2, 200 , new ItemStack(Items.APPLE));
//		
//		
//		exportJson.addSmeltingRecipe(new ItemStack(TechFoods.cooked_mushroom_red.get()), 1, 200 , new ItemStack(Blocks.RED_MUSHROOM));
//		exportJson.addSmeltingRecipe(new ItemStack(TechFoods.cooked_mushroom_brown.get()), 1, 200 , new ItemStack(Blocks.BROWN_MUSHROOM));
//		
//		
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.raw_bacon.get(), 4), Items.PORKCHOP);
//		
//		exportJson.addSmeltingRecipe(new ItemStack(TechFoods.cooked_bacon.get()), 1, 200 , new ItemStack(TechFoods.raw_bacon.get()));
//		
//		exportJson.addSmeltingRecipe(new ItemStack(TechFoods.fried_egg.get()), 1, 200 , new ItemStack(Items.EGG));
//		
//		exportJson.addSmeltingRecipe(new ItemStack(TechFoods.monster_jerky.get()), 1, 200 , new ItemStack(Items.ROTTEN_FLESH));
//		
//		exportJson.addSmeltingRecipe(new ItemStack(TechFoods.toasted_bread.get()), 1, 200 , new ItemStack(Items.BREAD)); 
//		
//		exportJson.addSmeltingRecipe(new ItemStack(TechFoods.little_candy.get()), 1, 200 , new ItemStack(Items.SUGAR));
//		
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.bacon_eggs.get()), new ItemStack(TechFoods.cooked_bacon.get()), new ItemStack(TechFoods.fried_egg.get()), new ItemStack(TechFoods.fried_egg.get()));			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.bacon_eggs_sandwhich.get()), new ItemStack(TechFoods.bread_slice.get()), new ItemStack(TechFoods.bacon_eggs.get()), new ItemStack(TechFoods.bread_slice.get()));
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.bread_slice.get(), 10), Items.BREAD);
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.bacon_sandwhich.get()), new ItemStack(TechFoods.bread_slice.get()), new ItemStack(TechFoods.cooked_bacon.get()), new ItemStack(TechFoods.cooked_bacon.get()), new ItemStack(TechFoods.bread_slice.get()));
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.beef_sandwhich.get()), new ItemStack(TechFoods.bread_slice.get()), new ItemStack(Items.COOKED_BEEF), new ItemStack(TechFoods.bread_slice.get()));
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.chicken_sandwhich.get()), new ItemStack(TechFoods.bread_slice.get()), new ItemStack(Items.COOKED_CHICKEN), new ItemStack(TechFoods.bread_slice.get()));
//			
//		exportJson.addShapelessRecipe(new ItemStack(TechFoods.rabbit_sandwhich.get()), new ItemStack(TechFoods.bread_slice.get()), new ItemStack(Items.COOKED_RABBIT), new ItemStack(TechFoods.bread_slice.get()));
//		
//		
//		// forge:juicer (Can not be turned off)
//		exportJson.addShapedRecipe(new ItemStack(TechFoods.Juicer.get()), "l",
//					"s",
//					's', "forge:stone",
//					'l', Blocks.STONE_BUTTON);
	}
}
