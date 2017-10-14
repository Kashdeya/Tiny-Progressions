package com.kashdeya.tinyprogressions.crafting;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechTools;

import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ToolsRecipes {
	
	public static void init() {
		// Flint Tools
		if (ConfigHandler.FlintTools){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.flint_pickaxe), new Object[] {
					"fff",
					" s ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.flint_axe), new Object[] {
					"ff ",
					"fs ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.flint_spade), new Object[] {
					" f ",
					" s ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.flint_sword), new Object[] {
					" f ",
					" f ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.flint_hoe), new Object[] {
					"ff ",
					" s ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
		}
		
		// Bone Tools
		if (ConfigHandler.BoneTools){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.bone_pickaxe), new Object[] {
					"bbb",
					" s ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.bone_axe), new Object[] {
					"bb ",
					"bs ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.bone_spade), new Object[] {
					" b ",
					" s ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.bone_sword), new Object[] {
					" b ",
					" b ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.bone_hoe), new Object[] {
					"bb ",
					" s ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
		}
		
		// Happy Birthday Darkosto
	    if (ConfigHandler.BirthdayPickaxe && ConfigHandler.ReinforcedObsidian){
			ItemStack BirthdayPickaxe = new ItemStack(TechTools.birthday_pickaxe);
			BirthdayPickaxe.addEnchantment(Enchantments.MENDING, 0);
			
			RecipeRegistry.addShapedRecipe(BirthdayPickaxe, new Object[] {
					"rdr",
					" s ",
					" s ",
						Character.valueOf('r'), "ingotReinforcedObsidian",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
		}
	    
	    // Scythe
	    if (ConfigHandler.wooden_scythe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.wooden_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "logWood",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.stone_scythe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.stone_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "stone",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.golden_scythe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.golden_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "ingotGold",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.iron_scythe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.iron_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.diamond_scythe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.diamond_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
	    }
		if (ConfigHandler.emerald_scythe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_scythe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		
		// Emerald Tools
		if (ConfigHandler.emerald_axe){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_axe), new Object[] {
					"ee ",
					"es ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_pickaxe){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_pickaxe), new Object[] {
					"eee",
					" s ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_spade){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_spade), new Object[] {
					" e ",
					" s ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_hoe){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_hoe), new Object[] {
					"ee ",
					" s ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_sword){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_sword), new Object[] {
					" e ",
					" e ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		
		// Obsidian Tools
		if (ConfigHandler.obsidian_axe){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_axe), new Object[] {
					"oo ",
					"os ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_pickaxe){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_pickaxe), new Object[] {
					"ooo",
					" s ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_spade){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_spade), new Object[] {
					" o ",
					" s ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_hoe){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_hoe), new Object[] {
					"oo ",
					" s ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_sword){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_sword), new Object[] {
					" o ",
					" o ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		
		// MultiTools
		if (ConfigHandler.wooden_multi){
		    RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.wooden_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), Items.WOODEN_AXE,
						Character.valueOf('S'), Items.WOODEN_SHOVEL,
						Character.valueOf('P'), Items.WOODEN_PICKAXE,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.stone_multi){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.stone_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), Items.STONE_AXE,
						Character.valueOf('S'), Items.STONE_SHOVEL,
						Character.valueOf('P'), Items.STONE_PICKAXE,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.golden_multi){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.golden_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), Items.GOLDEN_AXE,
						Character.valueOf('S'), Items.GOLDEN_SHOVEL,
						Character.valueOf('P'), Items.GOLDEN_PICKAXE,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.iron_multi){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.iron_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), Items.IRON_AXE,
						Character.valueOf('S'), Items.IRON_SHOVEL,
						Character.valueOf('P'), Items.IRON_PICKAXE,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.diamond_multi){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.diamond_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), Items.DIAMOND_AXE,
						Character.valueOf('S'), Items.DIAMOND_SHOVEL,
						Character.valueOf('P'), Items.DIAMOND_PICKAXE,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_multi && ConfigHandler.emerald_axe && ConfigHandler.emerald_spade && ConfigHandler.emerald_pickaxe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), TechTools.emerald_axe,
						Character.valueOf('S'), TechTools.emerald_spade,
						Character.valueOf('P'), TechTools.emerald_pickaxe,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_multi && ConfigHandler.obsidian_axe && ConfigHandler.obsidian_spade && ConfigHandler.obsidian_pickaxe){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), TechTools.obsidian_axe,
						Character.valueOf('S'), TechTools.obsidian_spade,
						Character.valueOf('P'), TechTools.obsidian_pickaxe,
						Character.valueOf('s'), "stickWood"
			});
		}
		
		// Battle Axes
		if (ConfigHandler.wooden_battle){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.wooden_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "logWood",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.stone_battle){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.stone_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "stone",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.golden_battle){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.golden_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "ingotGold",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.iron_battle){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.iron_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.diamond_battle){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.diamond_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_battle){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_battle){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		
		// Spears
		if (ConfigHandler.wooden_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.wooden_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "logWood",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.stone_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.stone_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "stone",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.golden_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.golden_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "ingotGold",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.iron_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.iron_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.diamond_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.diamond_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_spear){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
	}
}
