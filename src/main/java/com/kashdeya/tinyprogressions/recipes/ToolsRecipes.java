package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;
import com.kashdeya.tinyprogressions.registry.recipes.ShapedRecipe;

import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolsRecipes {
	public static IRecipe C_AXE, KAPPA_PICK, BIRTHDAY_PICKAXE;
	public static IRecipe BSC_IRON_AXE, BSC_IRON_AXE2, BSC_IRON_HOE, BSC_IRON_HOE2, BSC_IRON_PICKAXE, BSC_IRON_SPADE, BSC_IRON_SWORD;
	public static IRecipe BSC_GOLD_AXE, BSC_GOLD_AXE2, BSC_GOLD_HOE, BSC_GOLD_HOE2, BSC_GOLD_PICKAXE, BSC_GOLD_SPADE, BSC_GOLD_SWORD;
	public static IRecipe BSC_DIAMOND_AXE, BSC_DIAMOND_AXE2, BSC_DIAMOND_HOE, BSC_DIAMOND_HOE2, BSC_DIAMOND_PICKAXE, BSC_DIAMOND_SPADE, BSC_DIAMOND_SWORD;
	public static IRecipe NETHER_IRON_AXE, NETHER_IRON_AXE2, NETHER_IRON_HOE, NETHER_IRON_HOE2, NETHER_IRON_PICKAXE, NETHER_IRON_SPADE, NETHER_IRON_SWORD;
	public static IRecipe NETHER_GOLD_AXE, NETHER_GOLD_AXE2, NETHER_GOLD_HOE, NETHER_GOLD_HOE2, NETHER_GOLD_PICKAXE, NETHER_GOLD_SPADE, NETHER_GOLD_SWORD;
	public static IRecipe NETHER_DIAMOND_AXE, NETHER_DIAMOND_AXE2, NETHER_DIAMOND_HOE, NETHER_DIAMOND_HOE2, NETHER_DIAMOND_PICKAXE, NETHER_DIAMOND_SPADE, NETHER_DIAMOND_SWORD;
	public static IRecipe NETHER_AXE, NETHER_AXE2, NETHER_HOE, NETHER_HOE2, NETHER_PICKAXE, NETHER_SPADE, NETHER_SWORD;
	public static IRecipe FLINT_AXE, FLINT_HOE, FLINT_PICKAXE, FLINT_SPADE, FLINT_SWORD;
	public static IRecipe BONE_AXE, BONE_HOE, BONE_PICKAXE, BONE_SPADE, BONE_SWORD;
	public static IRecipe EMERALD_AXE, EMERALD_HOE, EMERALD_PICKAXE, EMERALD_SPADE, EMERALD_SWORD;
	public static IRecipe OBSIDIAN_AXE, OBSIDIAN_HOE, OBSIDIAN_PICKAXE, OBSIDIAN_SPADE, OBSIDIAN_SWORD;
	public static IRecipe WOODEN_SCYTHE, STONE_SCYTHE, IRON_SCYTHE, GOLD_SCYTHE, DIAMOND_SCYTHE, EMERALD_SCYTHE, OBSIDIAN_SCYTHE;
	public static IRecipe WOODEN_MULTI, STONE_MULTI, IRON_MULTI, GOLD_MULTI, DIAMOND_MULTI, EMERALD_MULTI, OBSIDIAN_MULTI;
	public static IRecipe WOODEN_BATTLE, STONE_BATTLE, IRON_BATTLE, GOLD_BATTLE, DIAMOND_BATTLE, EMERALD_BATTLE, OBSIDIAN_BATTLE;
	public static IRecipe WOODEN_SPEAR, STONE_SPEAR, IRON_SPEAR, GOLD_SPEAR, DIAMOND_SPEAR, EMERALD_SPEAR, OBSIDIAN_SPEAR;
	public static IRecipe WUB_AXE, WUB_AXE2, WUB_HOE2, WUB_PICKAXE, WUB_SPADE, WUB_HOE, WUB_SWORD, WUB_PAXEL, WUB_HAMMER;
	
	public static void init() {
		// Wub Tools
		if (ConfigHandler.wub_juice_tools && ConfigHandler.vasholine){
			WUB_AXE = new ShapedRecipe(new ItemStack(TechTools.wub_axe), 
					"ii ",
	                "is ",
	                " s ",
					'i', new ItemStack(TechItems.wub_ingot),
					's', "stickWood");
			WUB_AXE2 = new ShapedRecipe(new ItemStack(TechTools.wub_axe), 
					" ii",
	                " si",
	                " s ",
					'i', new ItemStack(TechItems.wub_ingot),
					's', "stickWood");
			WUB_HOE = new ShapedRecipe(new ItemStack(TechTools.wub_hoe), 
					"ii ",
	                " s ",
	                " s ",
					'i', new ItemStack(TechItems.wub_ingot),
					's', "stickWood");
			WUB_HOE2 = new ShapedRecipe(new ItemStack(TechTools.wub_hoe), 
					" ii",
	                " s ",
	                " s ",
					'i', new ItemStack(TechItems.wub_ingot),
					's', "stickWood");
			WUB_PICKAXE = new ShapedRecipe(new ItemStack(TechTools.wub_pickaxe), 
					"iii",
	                " s ",
	                " s ",
					'i', new ItemStack(TechItems.wub_ingot),
					's', "stickWood");
			WUB_SPADE = new ShapedRecipe(new ItemStack(TechTools.wub_spade), 
					"i",
	                "s",
	                "s",
					'i', new ItemStack(TechItems.wub_ingot),
					's', "stickWood");
			WUB_SWORD = new ShapedRecipe(new ItemStack(TechTools.wub_sword), 
					"i",
	                "i",
	                "s",
					'i', new ItemStack(TechItems.wub_ingot),
					's', "stickWood");
			WUB_PAXEL = new ShapedRecipe(new ItemStack(TechTools.wub_paxel), 
					"asp",
	                " i ",
	                " i ",
	                'a', new ItemStack(TechTools.wub_axe),
	                's', new ItemStack(TechTools.wub_spade),
	                'p', new ItemStack(TechTools.wub_pickaxe),
					'i', "stickWood");
			WUB_HAMMER = new ShapedRecipe(new ItemStack(TechTools.wub_hammer), 
					"aaa",
	                "aia",
	                " i ",
	                'a', new ItemStack(TechItems.wub_ingot),
					'i', "stickWood");
		}
		// c axe
		if (ConfigHandler.c_axe){
			C_AXE = new ShapedRecipe(new ItemStack(TechTools.c_axe), 
					"s i",
                "si ",
                "s i",
				'i', "ingotIron",
				's', "stickWood");
		}
		// bsc iron
		if (ConfigHandler.bsc_rod && ConfigHandler.bsc_iron_tools_weapons){
			BSC_IRON_AXE = new ShapedRecipe(new ItemStack(TechTools.bsc_iron_axe), 
					"ii ",
                "is ",
                " s ",
				'i', "ingotIron",
				's', "stickCane");
			BSC_IRON_AXE2 = new ShapedRecipe(new ItemStack(TechTools.bsc_iron_axe), 
					" ii",
                " si",
                " s ",
				'i', "ingotIron",
				's', "stickCane");
			BSC_IRON_HOE = new ShapedRecipe(new ItemStack(TechTools.bsc_iron_hoe), 
					"ii ",
                " s ",
                " s ",
				'i', "ingotIron",
				's', "stickCane");
			BSC_IRON_HOE2 = new ShapedRecipe(new ItemStack(TechTools.bsc_iron_hoe), 
					" ii",
                " s ",
                " s ",
				'i', "ingotIron",
				's', "stickCane");
			BSC_IRON_PICKAXE = new ShapedRecipe(new ItemStack(TechTools.bsc_iron_pickaxe), 
					"iii",
                " s ",
                " s ",
				'i', "ingotIron",
				's', "stickCane");
			BSC_IRON_SPADE = new ShapedRecipe(new ItemStack(TechTools.bsc_iron_spade), 
					"i",
                "s",
                "s",
				'i', "ingotIron",
				's', "stickCane");
			BSC_IRON_SWORD = new ShapedRecipe(new ItemStack(TechTools.bsc_iron_sword), 
					"i",
                "i",
                "s",
				'i', "ingotIron",
				's', "stickCane");
		}
		// bsc gold
		if (ConfigHandler.bsc_rod && ConfigHandler.bsc_gold_tools_weapons){
			BSC_GOLD_AXE = new ShapedRecipe(new ItemStack(TechTools.bsc_gold_axe), 
					"ii ",
                "is ",
                " s ",
				'i', "ingotGold",
				's', "stickCane");
			BSC_GOLD_AXE2 = new ShapedRecipe(new ItemStack(TechTools.bsc_gold_axe), 
					" ii",
                " si",
                " s ",
				'i', "ingotGold",
				's', "stickCane");
			BSC_GOLD_HOE = new ShapedRecipe(new ItemStack(TechTools.bsc_gold_hoe), 
					"ii ",
                " s ",
                " s ",
				'i', "ingotGold",
				's', "stickCane");
			BSC_GOLD_HOE2 = new ShapedRecipe(new ItemStack(TechTools.bsc_gold_hoe), 
					" ii",
                " s ",
                " s ",
				'i', "ingotGold",
				's', "stickCane");
			BSC_GOLD_PICKAXE = new ShapedRecipe(new ItemStack(TechTools.bsc_gold_pickaxe), 
					"iii",
                " s ",
                " s ",
				'i', "ingotGold",
				's', "stickCane");
			BSC_GOLD_SPADE = new ShapedRecipe(new ItemStack(TechTools.bsc_gold_spade), 
					"i",
                "s",
                "s",
				'i', "ingotGold",
				's', "stickCane");
			BSC_GOLD_SWORD = new ShapedRecipe(new ItemStack(TechTools.bsc_gold_sword), 
					"i",
                "i",
                "s",
				'i', "ingotGold",
				's', "stickCane");
		}
		// bsc diamond
		if (ConfigHandler.bsc_rod && ConfigHandler.bsc_diamond_tools_weapons){
			BSC_DIAMOND_AXE = new ShapedRecipe(new ItemStack(TechTools.bsc_diamond_axe), 
					"ii ",
                "is ",
                " s ",
				'i', "gemDiamond",
				's', "stickCane");
			BSC_DIAMOND_AXE2 = new ShapedRecipe(new ItemStack(TechTools.bsc_diamond_axe), 
					" ii",
                " si",
                " s ",
				'i', "gemDiamond",
				's', "stickCane");
			BSC_DIAMOND_HOE = new ShapedRecipe(new ItemStack(TechTools.bsc_diamond_hoe), 
					"ii ",
                " s ",
                " s ",
				'i', "gemDiamond",
				's', "stickCane");
			BSC_DIAMOND_HOE2 = new ShapedRecipe(new ItemStack(TechTools.bsc_diamond_hoe), 
					" ii",
                " s ",
                " s ",
				'i', "gemDiamond",
				's', "stickCane");
			BSC_DIAMOND_PICKAXE = new ShapedRecipe(new ItemStack(TechTools.bsc_diamond_pickaxe), 
					"iii",
                " s ",
                " s ",
				'i', "gemDiamond",
				's', "stickCane");
			BSC_DIAMOND_SPADE = new ShapedRecipe(new ItemStack(TechTools.bsc_diamond_spade), 
					"i",
                "s",
                "s",
				'i', "gemDiamond",
				's', "stickCane");
			BSC_DIAMOND_SWORD = new ShapedRecipe(new ItemStack(TechTools.bsc_diamond_sword), 
					"i",
                "i",
                "s",
				'i', "gemDiamond",
				's', "stickCane");
		}
		
		// nether iron
		if (ConfigHandler.nether_rod && ConfigHandler.nether_iron_tools_weapons){
			NETHER_IRON_AXE = new ShapedRecipe(new ItemStack(TechTools.nether_iron_axe), 
					"ii ",
                "is ",
                " s ",
				'i', "ingotIron",
				's', "stickNether");
			NETHER_IRON_AXE2 = new ShapedRecipe(new ItemStack(TechTools.nether_iron_axe), 
					" ii",
                " si",
                " s ",
				'i', "ingotIron",
				's', "stickNether");
			NETHER_IRON_HOE = new ShapedRecipe(new ItemStack(TechTools.nether_iron_hoe), 
					"ii ",
                " s ",
                " s ",
				'i', "ingotIron",
				's', "stickNether");
			NETHER_IRON_HOE2 = new ShapedRecipe(new ItemStack(TechTools.nether_iron_hoe), 
					" ii",
                " s ",
                " s ",
				'i', "ingotIron",
				's', "stickNether");
			NETHER_IRON_PICKAXE = new ShapedRecipe(new ItemStack(TechTools.nether_iron_pickaxe), 
					"iii",
                " s ",
                " s ",
				'i', "ingotIron",
				's', "stickNether");
			NETHER_IRON_SPADE = new ShapedRecipe(new ItemStack(TechTools.nether_iron_spade), 
					"i",
                "s",
                "s",
				'i', "ingotIron",
				's', "stickNether");
			NETHER_IRON_SWORD = new ShapedRecipe(new ItemStack(TechTools.nether_iron_sword), 
					"i",
                "i",
                "s",
				'i', "ingotIron",
				's', "stickNether");
		}
		// nether gold
		if (ConfigHandler.nether_rod && ConfigHandler.nether_gold_tools_weapons){
			NETHER_GOLD_AXE = new ShapedRecipe(new ItemStack(TechTools.nether_gold_axe), 
					"ii ",
                "is ",
                " s ",
				'i', "ingotGold",
				's', "stickNether");
			NETHER_GOLD_AXE2 = new ShapedRecipe(new ItemStack(TechTools.nether_gold_axe), 
					" ii",
                " si",
                " s ",
				'i', "ingotGold",
				's', "stickNether");
			NETHER_GOLD_HOE = new ShapedRecipe(new ItemStack(TechTools.nether_gold_hoe), 
					"ii ",
                " s ",
                " s ",
				'i', "ingotGold",
				's', "stickNether");
			NETHER_GOLD_HOE2 = new ShapedRecipe(new ItemStack(TechTools.nether_gold_hoe), 
					" ii",
                " s ",
                " s ",
				'i', "ingotGold",
				's', "stickNether");
			NETHER_GOLD_PICKAXE = new ShapedRecipe(new ItemStack(TechTools.nether_gold_pickaxe), 
					"iii",
                " s ",
                " s ",
				'i', "ingotGold",
				's', "stickNether");
			NETHER_GOLD_SPADE = new ShapedRecipe(new ItemStack(TechTools.nether_gold_spade), 
					"i",
                "s",
                "s",
				'i', "ingotGold",
				's', "stickNether");
			NETHER_GOLD_SWORD = new ShapedRecipe(new ItemStack(TechTools.nether_gold_sword), 
					"i",
                "i",
                "s",
				'i', "ingotGold",
				's', "stickNether");
		}
		// nether diamond
		if (ConfigHandler.nether_rod && ConfigHandler.nether_diamond_tools_weapons){
			NETHER_DIAMOND_AXE = new ShapedRecipe(new ItemStack(TechTools.nether_diamond_axe), 
					"ii ",
                "is ",
                " s ",
				'i', "gemDiamond",
				's', "stickNether");
			NETHER_DIAMOND_AXE2 = new ShapedRecipe(new ItemStack(TechTools.nether_diamond_axe), 
					" ii",
                " si",
                " s ",
				'i', "gemDiamond",
				's', "stickNether");
			NETHER_DIAMOND_HOE = new ShapedRecipe(new ItemStack(TechTools.nether_diamond_hoe), 
					"ii ",
                " s ",
                " s ",
				'i', "gemDiamond",
				's', "stickNether");
			NETHER_DIAMOND_HOE2 = new ShapedRecipe(new ItemStack(TechTools.nether_diamond_hoe), 
					" ii",
                " s ",
                " s ",
				'i', "gemDiamond",
				's', "stickNether");
			NETHER_DIAMOND_PICKAXE = new ShapedRecipe(new ItemStack(TechTools.nether_diamond_pickaxe), 
					"iii",
                " s ",
                " s ",
				'i', "gemDiamond",
				's', "stickNether");
			NETHER_DIAMOND_SPADE = new ShapedRecipe(new ItemStack(TechTools.nether_diamond_spade), 
					"i",
                "s",
                "s",
				'i', "gemDiamond",
				's', "stickNether");
			NETHER_DIAMOND_SWORD = new ShapedRecipe(new ItemStack(TechTools.nether_diamond_sword), 
					"i",
                "i",
                "s",
				'i', "gemDiamond",
				's', "stickNether");
		}
		// Nether Tools
		if (ConfigHandler.nether_rod && ConfigHandler.nether_tools_weapons){
			NETHER_AXE = new ShapedRecipe(new ItemStack(TechTools.nether_axe), 
					"ii ",
                "is ",
                " s ",
				'i', "netherrack",
				's', "stickNether");
			NETHER_AXE2 = new ShapedRecipe(new ItemStack(TechTools.nether_axe), 
					" ii",
                " si",
                " s ",
				'i', "netherrack",
				's', "stickNether");
			NETHER_HOE = new ShapedRecipe(new ItemStack(TechTools.nether_hoe), 
					"ii ",
                " s ",
                " s ",
				'i', "netherrack",
				's', "stickNether");
			NETHER_HOE2 = new ShapedRecipe(new ItemStack(TechTools.nether_hoe), 
					" ii",
                " s ",
                " s ",
				'i', "netherrack",
				's', "stickNether");
			NETHER_PICKAXE = new ShapedRecipe(new ItemStack(TechTools.nether_pickaxe), 
					"iii",
                " s ",
                " s ",
				'i', "netherrack",
				's', "stickNether");
			NETHER_SPADE = new ShapedRecipe(new ItemStack(TechTools.nether_spade), 
					"i",
                "s",
                "s",
				'i', "netherrack",
				's', "stickNether");
			NETHER_SWORD = new ShapedRecipe(new ItemStack(TechTools.nether_sword), 
					"i",
                "i",
                "s",
				'i', "netherrack",
				's', "stickNether");
		}
		// Kappa Pick
		if (ConfigHandler.kappa_pick){
			KAPPA_PICK = new ShapedRecipe(new ItemStack(TechTools.kappa_pick), 
					"ici",
                " s ",
                " s ",
				'i', "ingotIron",
				'c', "ingotBrick",
				's', "stickWood");
		}
		// Flint Tools
		if (ConfigHandler.FlintTools){
			FLINT_PICKAXE = new ShapedRecipe(new ItemStack(TechTools.flint_pickaxe), 
					"fff",
                " s ",
                " s ",
				'f', "flint",
				's', "stickWood");
			
			FLINT_AXE = new ShapedRecipe(new ItemStack(TechTools.flint_axe), 
					"ff ",
                "fs ",
                " s ",
				'f', "flint",
				's', "stickWood");
			
			FLINT_SPADE = new ShapedRecipe(new ItemStack(TechTools.flint_spade), 
				"f",
                "s",
                "s",
				'f', "flint",
				's', "stickWood");
			
			FLINT_SWORD = new ShapedRecipe(new ItemStack(TechTools.flint_sword), 
				"f",
                "f",
                "s",
				'f', "flint",
				's', "stickWood");
			
			FLINT_HOE = new ShapedRecipe(new ItemStack(TechTools.flint_hoe), 
					"ff ",
                " s ",
                " s ",
				'f', "flint",
				's', "stickWood");
		}
		
		// Bone Tools
		if (ConfigHandler.BoneTools){
			BONE_PICKAXE = new ShapedRecipe(new ItemStack(TechTools.bone_pickaxe), 
					"bbb",
                " s ",
                " s ",
				'b', "bone",
				's', "stickWood");
			
			BONE_AXE = new ShapedRecipe(new ItemStack(TechTools.bone_axe), 
					"bb ",
                "bs ",
                " s ",
				'b', "bone",
				's', "stickWood");
			
			BONE_SPADE = new ShapedRecipe(new ItemStack(TechTools.bone_spade), 
					"b",
                "s",
                "s",
				'b', "bone",
				's', "stickWood");
			
			BONE_SWORD = new ShapedRecipe(new ItemStack(TechTools.bone_sword), 
					"b",
                "b",
                "s",
				'b', "bone",
				's', "stickWood");
			
			BONE_HOE = new ShapedRecipe(new ItemStack(TechTools.bone_hoe), 
					"bb ",
                " s ",
                " s ",
				'b', "bone",
				's', "stickWood");
		}
		
		// Happy Birthday Darkosto
	    if (ConfigHandler.BirthdayPickaxe && ConfigHandler.ReinforcedObsidian){
			ItemStack BirthdayPickaxe = new ItemStack(TechTools.birthday_pickaxe);
			BirthdayPickaxe.addEnchantment(Enchantments.MENDING, 0);
			
			BIRTHDAY_PICKAXE = new ShapedRecipe(BirthdayPickaxe, 
					"rdr",
                " s ",
                " s ",
				'r', "ingotReinforcedObsidian",
				'd', "gemDiamond",
				's', "stickWood");
		}
	    
	    // Scythe
	    if (ConfigHandler.wooden_scythe){
			WOODEN_SCYTHE = new ShapedRecipe(new ItemStack(TechTools.wooden_scythe), 
					"iii",
                " s ",
                "s  ",
				'i', "logWood",
				's', "stickWood");
	    }
	    if (ConfigHandler.stone_scythe){
			STONE_SCYTHE = new ShapedRecipe(new ItemStack(TechTools.stone_scythe), 
					"iii",
                " s ",
                "s  ",
				'i', "stone",
				's', "stickWood");
	    }
	    if (ConfigHandler.golden_scythe){
			GOLD_SCYTHE = new ShapedRecipe(new ItemStack(TechTools.golden_scythe), 
					"iii",
                " s ",
                "s  ",
				'i', "ingotGold",
				's', "stickWood");
	    }
	    if (ConfigHandler.iron_scythe){
			IRON_SCYTHE = new ShapedRecipe(new ItemStack(TechTools.iron_scythe), 
					"iii",
                " s ",
                "s  ",
				'i', "ingotIron",
				's', "stickWood");
	    }
	    if (ConfigHandler.diamond_scythe){
			DIAMOND_SCYTHE = new ShapedRecipe(new ItemStack(TechTools.diamond_scythe), 
					"iii",
                " s ",
                "s  ",
				'i', "gemDiamond",
				's', "stickWood");
	    }
		if (ConfigHandler.emerald_scythe){
			EMERALD_SCYTHE = new ShapedRecipe(new ItemStack(TechTools.emerald_scythe), 
					"iii",
                " s ",
                "s  ",
				'i', "gemEmerald",
				's', "stickWood");
		}
		if (ConfigHandler.obsidian_scythe){
			OBSIDIAN_SCYTHE = new ShapedRecipe(new ItemStack(TechTools.obsidian_scythe), 
					"iii",
                " s ",
                "s  ",
				'i', "obsidian",
				's', "stickWood");
		}
		
		// Emerald Tools
		if (ConfigHandler.emerald_axe){
		    EMERALD_AXE = new ShapedRecipe(new ItemStack(TechTools.emerald_axe), 
		    		"ee ",
                "es ",
                " s ",
				'e', "gemEmerald",
				's', "stickWood");
		}
		if (ConfigHandler.emerald_pickaxe){
		    EMERALD_PICKAXE = new ShapedRecipe(new ItemStack(TechTools.emerald_pickaxe), 
		    		"eee",
                " s ",
                " s ",
				'e', "gemEmerald",
				's', "stickWood");
		}
		if (ConfigHandler.emerald_spade){
		    EMERALD_SPADE = new ShapedRecipe(new ItemStack(TechTools.emerald_spade), 
		    		"e",
                "s",
                "s",
				'e', "gemEmerald",
				's', "stickWood");
		}
		if (ConfigHandler.emerald_hoe){
		    EMERALD_HOE = new ShapedRecipe(new ItemStack(TechTools.emerald_hoe), 
		    	"ee ",
                " s ",
                " s ",
				'e', "gemEmerald",
				's', "stickWood");
		}
		if (ConfigHandler.emerald_sword){
		    EMERALD_SWORD = new ShapedRecipe(new ItemStack(TechTools.emerald_sword), 
		    		"e",
                "e",
                "s",
				'e', "gemEmerald",
				's', "stickWood");
		}
		
		// Obsidian Tools
		if (ConfigHandler.obsidian_axe){
		    OBSIDIAN_AXE = new ShapedRecipe(new ItemStack(TechTools.obsidian_axe), 
		    		"oo ",
                "os ",
                " s ",
				'o', "obsidian",
				's', "stickWood");
		}
		if (ConfigHandler.obsidian_pickaxe){
		    OBSIDIAN_PICKAXE = new ShapedRecipe(new ItemStack(TechTools.obsidian_pickaxe), 
		    		"ooo",
                " s ",
                " s ",
				'o', "obsidian",
				's', "stickWood");
		}
		if (ConfigHandler.obsidian_spade){
		    OBSIDIAN_SPADE = new ShapedRecipe(new ItemStack(TechTools.obsidian_spade), 
		    		"o",
                "s",
                "s",
				'o', "obsidian",
				's', "stickWood");
		}
		if (ConfigHandler.obsidian_hoe){
		    OBSIDIAN_HOE = new ShapedRecipe(new ItemStack(TechTools.obsidian_hoe), 
		    		"oo ",
                " s ",
                " s ",
				'o', "obsidian",
				's', "stickWood");
		}
		if (ConfigHandler.obsidian_sword){
		    OBSIDIAN_SWORD = new ShapedRecipe(new ItemStack(TechTools.obsidian_sword), 
		    		"o",
                "o",
                "s",
				'o', "obsidian",
				's', "stickWood");
		}
		
		// MultiTools
		if (ConfigHandler.wooden_multi){
		    WOODEN_MULTI = new ShapedRecipe(new ItemStack(TechTools.wooden_multi), 
		    		"ASP",
                " s ",
                " s ",
				'A', new ItemStack(Items.WOODEN_AXE),
				'S', new ItemStack(Items.WOODEN_SHOVEL),
				'P', new ItemStack(Items.WOODEN_PICKAXE),
				's', "stickWood");
		}
		if (ConfigHandler.stone_multi){
			STONE_MULTI = new ShapedRecipe(new ItemStack(TechTools.stone_multi), 
					"ASP",
                " s ",
                " s ",
				'A', new ItemStack(Items.STONE_AXE),
				'S', new ItemStack(Items.STONE_SHOVEL),
				'P', new ItemStack(Items.STONE_PICKAXE),
				's', "stickWood");
		}
		if (ConfigHandler.golden_multi){
			GOLD_MULTI = new ShapedRecipe(new ItemStack(TechTools.golden_multi), 
					"ASP",
                " s ",
                " s ",
				'A', new ItemStack(Items.GOLDEN_AXE),
				'S', new ItemStack(Items.GOLDEN_SHOVEL),
				'P', new ItemStack(Items.GOLDEN_PICKAXE),
				's', "stickWood");
		}
		if (ConfigHandler.iron_multi){
			IRON_MULTI = new ShapedRecipe(new ItemStack(TechTools.iron_multi), 
					"ASP",
                " s ",
                " s ",
				'A', new ItemStack(Items.IRON_AXE),
				'S', new ItemStack(Items.IRON_SHOVEL),
				'P', new ItemStack(Items.IRON_PICKAXE),
				's', "stickWood");
		}
		if (ConfigHandler.diamond_multi){
			DIAMOND_MULTI = new ShapedRecipe(new ItemStack(TechTools.diamond_multi), 
					"ASP",
                " s ",
                " s ",
				'A', new ItemStack(Items.DIAMOND_AXE),
				'S', new ItemStack(Items.DIAMOND_SHOVEL),
				'P', new ItemStack(Items.DIAMOND_PICKAXE),
				's', "stickWood");
		}
		if (ConfigHandler.emerald_multi && ConfigHandler.emerald_axe && ConfigHandler.emerald_spade && ConfigHandler.emerald_pickaxe){
			EMERALD_MULTI = new ShapedRecipe(new ItemStack(TechTools.emerald_multi), 
					"ASP",
                " s ",
                " s ",
				'A', new ItemStack(TechTools.emerald_axe),
				'S', new ItemStack(TechTools.emerald_spade),
				'P', new ItemStack(TechTools.emerald_pickaxe),
				's', "stickWood");
		}
		if (ConfigHandler.obsidian_multi && ConfigHandler.obsidian_axe && ConfigHandler.obsidian_spade && ConfigHandler.obsidian_pickaxe){
			OBSIDIAN_MULTI = new ShapedRecipe(new ItemStack(TechTools.obsidian_multi), 
					"ASP",
                " s ",
                " s ",
				'A', new ItemStack(TechTools.obsidian_axe),
				'S', new ItemStack(TechTools.obsidian_spade),
				'P', new ItemStack(TechTools.obsidian_pickaxe),
				's', "stickWood");
		}
		
		// Battle Axes
		if (ConfigHandler.wooden_battle){
			WOODEN_BATTLE = new ShapedRecipe(new ItemStack(TechTools.wooden_battle), 
					"isi",
                "isi",
                " s ",
				'i', "logWood",
				's', "stickWood");
		}
		if (ConfigHandler.stone_battle){
			STONE_BATTLE = new ShapedRecipe(new ItemStack(TechTools.stone_battle), 
					"isi",
                "isi",
                " s ",
				'i', "stone",
				's', "stickWood");
		}
		if (ConfigHandler.golden_battle){
			GOLD_BATTLE = new ShapedRecipe(new ItemStack(TechTools.golden_battle), 
					"isi",
                "isi",
                " s ",
				'i', "ingotGold",
				's', "stickWood");
		}
		if (ConfigHandler.iron_battle){
			IRON_BATTLE = new ShapedRecipe(new ItemStack(TechTools.iron_battle), 
					"isi",
                "isi",
                " s ",
				'i', "ingotIron",
				's', "stickWood");
		}
		if (ConfigHandler.diamond_battle){
			DIAMOND_BATTLE = new ShapedRecipe(new ItemStack(TechTools.diamond_battle), 
					"isi",
                "isi",
                " s ",
				'i', "gemDiamond",
				's', "stickWood");
		}
		if (ConfigHandler.emerald_battle){
			EMERALD_BATTLE = new ShapedRecipe(new ItemStack(TechTools.emerald_battle), 
					"isi",
                "isi",
                " s ",
				'i', "gemEmerald",
				's', "stickWood");
		}
		if (ConfigHandler.obsidian_battle){
			OBSIDIAN_BATTLE = new ShapedRecipe(new ItemStack(TechTools.obsidian_battle), 
					"isi",
                "isi",
                " s ",
				'i', "obsidian",
				's', "stickWood");
		}
		
		// Spears
		if (ConfigHandler.wooden_spear){
			WOODEN_SPEAR = new ShapedRecipe(new ItemStack(TechTools.wooden_spear), 
					"i  ",
                " s ",
                "  s",
				'i', "logWood",
				's', "stickWood");
		}
		if (ConfigHandler.stone_spear){
			STONE_SPEAR = new ShapedRecipe(new ItemStack(TechTools.stone_spear), 
					"i  ",
                " s ",
                "  s",
				'i', "stone",
				's', "stickWood");
		}
		if (ConfigHandler.golden_spear){
			GOLD_SPEAR = new ShapedRecipe(new ItemStack(TechTools.golden_spear), 
					"i  ",
                " s ",
                "  s",
				'i', "ingotGold",
				's', "stickWood");
		}
		if (ConfigHandler.iron_spear){
			IRON_SPEAR = new ShapedRecipe(new ItemStack(TechTools.iron_spear), 
					"i  ",
                " s ",
                "  s",
				'i', "ingotIron",
				's', "stickWood");
		}
		if (ConfigHandler.diamond_spear){
			DIAMOND_SPEAR = new ShapedRecipe(new ItemStack(TechTools.diamond_spear), 
					"i  ",
                " s ",
                "  s",
				'i', "gemDiamond",
				's', "stickWood");
		}
		if (ConfigHandler.emerald_spear){
			EMERALD_SPEAR = new ShapedRecipe(new ItemStack(TechTools.emerald_spear), 
					"i  ",
                " s ",
                "  s",
				'i', "gemEmerald",
				's', "stickWood");
		}
		if (ConfigHandler.obsidian_spear){
			OBSIDIAN_SPEAR = new ShapedRecipe(new ItemStack(TechTools.obsidian_spear), 
					"i  ",
                " s ",
                "  s",
				'i', "obsidian",
				's', "stickWood");
		}
	}
}
