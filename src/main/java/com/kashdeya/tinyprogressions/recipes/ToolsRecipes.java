package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ToolsRecipes {
	public static void init() {
		// Wub Tools
			exportJson.addShapedRecipe(new ItemStack(TechTools.wub_axe.get()), 
					"ii ",
	                "is ",
	                " s ",
					'i', new ItemStack(TechItems.wub_ingot.get()),
					's', "forge:rods/wooden");
			exportJson.addShapedRecipe(new ItemStack(TechTools.wub_axe.get()), 
					" ii",
	                " si",
	                " s ",
					'i', new ItemStack(TechItems.wub_ingot.get()),
					's', "forge:rods/wooden");
			exportJson.addShapedRecipe(new ItemStack(TechTools.wub_hoe.get()), 
					"ii ",
	                " s ",
	                " s ",
					'i', new ItemStack(TechItems.wub_ingot.get()),
					's', "forge:rods/wooden");
			exportJson.addShapedRecipe(new ItemStack(TechTools.wub_hoe.get()), 
					" ii",
	                " s ",
	                " s ",
					'i', new ItemStack(TechItems.wub_ingot.get()),
					's', "forge:rods/wooden");
			exportJson.addShapedRecipe(new ItemStack(TechTools.wub_pickaxe.get()), 
					"iii",
	                " s ",
	                " s ",
					'i', new ItemStack(TechItems.wub_ingot.get()),
					's', "forge:rods/wooden");
			exportJson.addShapedRecipe(new ItemStack(TechTools.wub_spade.get()), 
					"i",
	                "s",
	                "s",
					'i', new ItemStack(TechItems.wub_ingot.get()),
					's', "forge:rods/wooden");
			exportJson.addShapedRecipe(new ItemStack(TechTools.wub_sword.get()), 
					"i",
	                "i",
	                "s",
					'i', new ItemStack(TechItems.wub_ingot.get()),
					's', "forge:rods/wooden");
			exportJson.addShapedRecipe(new ItemStack(TechTools.wub_paxel.get()), 
					"asp",
	                " i ",
	                " i ",
	                'a', new ItemStack(TechTools.wub_axe.get()),
	                's', new ItemStack(TechTools.wub_spade.get()),
	                'p', new ItemStack(TechTools.wub_pickaxe.get()),
					'i', "forge:rods/wooden");
			exportJson.addShapedRecipe(new ItemStack(TechTools.wub_hammer.get()), 
					"aaa",
	                "aia",
	                " i ",
	                'a', new ItemStack(TechItems.wub_ingot.get()),
					'i', "forge:rods/wooden");
		
		// c axe
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.c_axe.get()), 
					"s i",
                "si ",
                "s i",
				'i', "forge:ingots/iron",
				's', "forge:rods/wooden");
		
		// bsc iron
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_iron_axe.get()), 
					"ii ",
                "is ",
                " s ",
				'i', "forge:ingots/iron",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_iron_axe.get()), 
					" ii",
                " si",
                " s ",
				'i', "forge:ingots/iron",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_iron_hoe.get()), 
					"ii ",
                " s ",
                " s ",
				'i', "forge:ingots/iron",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_iron_hoe.get()), 
					" ii",
                " s ",
                " s ",
				'i', "forge:ingots/iron",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_iron_pickaxe.get()), 
					"iii",
                " s ",
                " s ",
				'i', "forge:ingots/iron",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_iron_spade.get()), 
					"i",
                "s",
                "s",
				'i', "forge:ingots/iron",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_iron_sword.get()), 
					"i",
                "i",
                "s",
				'i', "forge:ingots/iron",
				's', "forge:rods/cane");
		
		// bsc gold
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_gold_axe.get()), 
					"ii ",
                "is ",
                " s ",
				'i', "forge:ingots/gold",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_gold_axe.get()), 
					" ii",
                " si",
                " s ",
				'i', "forge:ingots/gold",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_gold_hoe.get()), 
					"ii ",
                " s ",
                " s ",
				'i', "forge:ingots/gold",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_gold_hoe.get()), 
					" ii",
                " s ",
                " s ",
				'i', "forge:ingots/gold",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_gold_pickaxe.get()), 
					"iii",
                " s ",
                " s ",
				'i', "forge:ingots/gold",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_gold_spade.get()), 
					"i",
                "s",
                "s",
				'i', "forge:ingots/gold",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_gold_sword.get()), 
					"i",
                "i",
                "s",
				'i', "forge:ingots/gold",
				's', "forge:rods/cane");
		
		// bsc diamond
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_diamond_axe.get()), 
					"ii ",
                "is ",
                " s ",
				'i', "forge:gems/diamond",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_diamond_axe.get()), 
					" ii",
                " si",
                " s ",
				'i', "forge:gems/diamond",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_diamond_hoe.get()), 
					"ii ",
                " s ",
                " s ",
				'i', "forge:gems/diamond",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_diamond_hoe.get()), 
					" ii",
                " s ",
                " s ",
				'i', "forge:gems/diamond",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_diamond_pickaxe.get()), 
					"iii",
                " s ",
                " s ",
				'i', "forge:gems/diamond",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_diamond_spade.get()), 
					"i",
                "s",
                "s",
				'i', "forge:gems/diamond",
				's', "forge:rods/cane");
		exportJson.addShapedRecipe(new ItemStack(TechTools.bsc_diamond_sword.get()), 
					"i",
                "i",
                "s",
				'i', "forge:gems/diamond",
				's', "forge:rods/cane");
		
		
		// nether iron
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_iron_axe.get()), 
					"ii ",
                "is ",
                " s ",
				'i', "forge:ingots/iron",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_iron_axe.get()), 
					" ii",
                " si",
                " s ",
				'i', "forge:ingots/iron",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_iron_hoe.get()), 
					"ii ",
                " s ",
                " s ",
				'i', "forge:ingots/iron",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_iron_hoe.get()), 
					" ii",
                " s ",
                " s ",
				'i', "forge:ingots/iron",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_iron_pickaxe.get()), 
					"iii",
                " s ",
                " s ",
				'i', "forge:ingots/iron",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_iron_spade.get()), 
					"i",
                "s",
                "s",
				'i', "forge:ingots/iron",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_iron_sword.get()), 
					"i",
                "i",
                "s",
				'i', "forge:ingots/iron",
				's', "forge:rods/netherrack");

		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_gold_axe.get()), 
					"ii ",
                "is ",
                " s ",
				'i', "forge:ingots/gold",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_gold_axe.get()), 
					" ii",
                " si",
                " s ",
				'i', "forge:ingots/gold",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_gold_hoe.get()), 
					"ii ",
                " s ",
                " s ",
				'i', "forge:ingots/gold",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_gold_hoe.get()), 
					" ii",
                " s ",
                " s ",
				'i', "forge:ingots/gold",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_gold_pickaxe.get()), 
					"iii",
                " s ",
                " s ",
				'i', "forge:ingots/gold",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_gold_spade.get()), 
					"i",
                "s",
                "s",
				'i', "forge:ingots/gold",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_gold_sword.get()), 
					"i",
                "i",
                "s",
				'i', "forge:ingots/gold",
				's', "forge:rods/netherrack");
		
		// nether diamond
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_diamond_axe.get()), 
					"ii ",
                "is ",
                " s ",
				'i', "forge:gems/diamond",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_diamond_axe.get()), 
					" ii",
                " si",
                " s ",
				'i', "forge:gems/diamond",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_diamond_hoe.get()), 
					"ii ",
                " s ",
                " s ",
				'i', "forge:gems/diamond",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_diamond_hoe.get()), 
					" ii",
                " s ",
                " s ",
				'i', "forge:gems/diamond",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_diamond_pickaxe.get()), 
					"iii",
                " s ",
                " s ",
				'i', "forge:gems/diamond",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_diamond_spade.get()), 
					"i",
                "s",
                "s",
				'i', "forge:gems/diamond",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_diamond_sword.get()), 
					"i",
                "i",
                "s",
				'i', "forge:gems/diamond",
				's', "forge:rods/netherrack");
		
		// Nether Tools
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_axe.get()), 
					"ii ",
                "is ",
                " s ",
				'i', "forge:netherrack",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_axe.get()), 
					" ii",
                " si",
                " s ",
				'i', "forge:netherrack",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_hoe.get()), 
					"ii ",
                " s ",
                " s ",
				'i', "forge:netherrack",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_hoe.get()), 
					" ii",
                " s ",
                " s ",
				'i', "forge:netherrack",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_pickaxe.get()), 
					"iii",
                " s ",
                " s ",
				'i', "forge:netherrack",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_spade.get()), 
					"i",
                "s",
                "s",
				'i', "forge:netherrack",
				's', "forge:rods/netherrack");
		exportJson.addShapedRecipe(new ItemStack(TechTools.nether_sword.get()), 
					"i",
                "i",
                "s",
				'i', "forge:netherrack",
				's', "forge:rods/netherrack");

		exportJson.addShapedRecipe(new ItemStack(TechTools.kappa_pick.get()), 
					"ici",
                " s ",
                " s ",
				'i', "forge:ingots/iron",
				'c', "forge:ingots/brick",
				's', "forge:rods/wooden");
		
		// new ItemStack(Items.FLINT) Tools
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.flint_pickaxe.get()), 
					"fff",
                " s ",
                " s ",
				'f', new ItemStack(Items.FLINT),
				's', "forge:rods/wooden");
			
		exportJson.addShapedRecipe(new ItemStack(TechTools.flint_axe.get()), 
					"ff ",
                "fs ",
                " s ",
				'f', new ItemStack(Items.FLINT),
				's', "forge:rods/wooden");
			
		exportJson.addShapedRecipe(new ItemStack(TechTools.flint_spade.get()), 
				"f",
                "s",
                "s",
				'f', new ItemStack(Items.FLINT),
				's', "forge:rods/wooden");
			
		exportJson.addShapedRecipe(new ItemStack(TechTools.flint_sword.get()), 
				"f",
                "f",
                "s",
				'f', new ItemStack(Items.FLINT),
				's', "forge:rods/wooden");
			
		exportJson.addShapedRecipe(new ItemStack(TechTools.flint_hoe.get()), 
					"ff ",
                " s ",
                " s ",
				'f', new ItemStack(Items.FLINT),
				's', "forge:rods/wooden");
		
		
		// forge:bones Tools
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.bone_pickaxe.get()), 
					"bbb",
                " s ",
                " s ",
				'b', "forge:bones",
				's', "forge:rods/wooden");
			
		exportJson.addShapedRecipe(new ItemStack(TechTools.bone_axe.get()), 
					"bb ",
                "bs ",
                " s ",
				'b', "forge:bones",
				's', "forge:rods/wooden");
			
		exportJson.addShapedRecipe(new ItemStack(TechTools.bone_spade.get()), 
					"b",
                "s",
                "s",
				'b', "forge:bones",
				's', "forge:rods/wooden");
			
		exportJson.addShapedRecipe(new ItemStack(TechTools.bone_sword.get()), 
					"b",
                "b",
                "s",
				'b', "forge:bones",
				's', "forge:rods/wooden");
			
		exportJson.addShapedRecipe(new ItemStack(TechTools.bone_hoe.get()), 
					"bb ",
                " s ",
                " s ",
				'b', "forge:bones",
				's', "forge:rods/wooden");
		
		
			ItemStack BirthdayPickaxe = new ItemStack(TechTools.birthday_pickaxe.get());
			BirthdayPickaxe.addEnchantment(Enchantments.MENDING, 0);
			
		exportJson.addShapedRecipe(BirthdayPickaxe, 
				"rdr",
                " s ",
                " s ",
				'r', "forge:ingots/reinforced_obsidian",
				'd', "forge:gems/diamond",
				's', "forge:rods/wooden");
		
	    
		exportJson.addShapedRecipe(new ItemStack(TechTools.wooden_scythe.get()), 
					"iii",
                " s ",
                "s  ",
				'i', "minecraft:logs",
				's', "forge:rods/wooden");
	    
	    
		exportJson.addShapedRecipe(new ItemStack(TechTools.stone_scythe.get()), 
					"iii",
                " s ",
                "s  ",
				'i', "forge:stone",
				's', "forge:rods/wooden");
	    
	    
		exportJson.addShapedRecipe(new ItemStack(TechTools.golden_scythe.get()), 
				"iii",
                " s ",
                "s  ",
				'i', "forge:ingots/gold",
				's', "forge:rods/wooden");
	    
	    
		exportJson.addShapedRecipe(new ItemStack(TechTools.iron_scythe.get()), 
				"iii",
                " s ",
                "s  ",
				'i', "forge:ingots/iron",
				's', "forge:rods/wooden");
	    
	    
		exportJson.addShapedRecipe(new ItemStack(TechTools.diamond_scythe.get()), 
				"iii",
                " s ",
                "s  ",
				'i', "forge:gems/diamond",
				's', "forge:rods/wooden");
	    
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.emerald_scythe.get()), 
					"iii",
                " s ",
                "s  ",
				'i', "forge:gems/emerald",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.obsidian_scythe.get()), 
					"iii",
                " s ",
                "s  ",
				'i', "forge:obsidian",
				's', "forge:rods/wooden");
		
		
		// Emerald Tools
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.emerald_axe.get()), 
		    		"ee ",
                "es ",
                " s ",
				'e', "forge:gems/emerald",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.emerald_pickaxe.get()), 
		    		"eee",
                " s ",
                " s ",
				'e', "forge:gems/emerald",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.emerald_spade.get()), 
		    		"e",
                "s",
                "s",
				'e', "forge:gems/emerald",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.emerald_hoe.get()), 
		    	"ee ",
                " s ",
                " s ",
				'e', "forge:gems/emerald",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.emerald_sword.get()), 
		    		"e",
                "e",
                "s",
				'e', "forge:gems/emerald",
				's', "forge:rods/wooden");
		
		
	// forge:obsidian Tools
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.obsidian_axe.get()), 
		    		"oo ",
                "os ",
                " s ",
				'o', "forge:obsidian",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.obsidian_pickaxe.get()), 
		    		"ooo",
                " s ",
                " s ",
				'o', "forge:obsidian",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.obsidian_spade.get()), 
		    		"o",
                "s",
                "s",
				'o', "forge:obsidian",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.obsidian_hoe.get()), 
		    		"oo ",
                " s ",
                " s ",
				'o', "forge:obsidian",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.obsidian_sword.get()), 
		    		"o",
                "o",
                "s",
				'o', "forge:obsidian",
				's', "forge:rods/wooden");
		
		
		// MultiTools
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.wooden_multi.get()), 
		    		"ASP",
                " s ",
                " s ",
				'A', new ItemStack(Items.WOODEN_AXE),
				'S', new ItemStack(Items.WOODEN_SHOVEL),
				'P', new ItemStack(Items.WOODEN_PICKAXE),
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.stone_multi.get()), 
					"ASP",
                " s ",
                " s ",
				'A', new ItemStack(Items.STONE_AXE),
				'S', new ItemStack(Items.STONE_SHOVEL),
				'P', new ItemStack(Items.STONE_PICKAXE),
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.golden_multi.get()), 
					"ASP",
                " s ",
                " s ",
				'A', new ItemStack(Items.GOLDEN_AXE),
				'S', new ItemStack(Items.GOLDEN_SHOVEL),
				'P', new ItemStack(Items.GOLDEN_PICKAXE),
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.iron_multi.get()), 
					"ASP",
                " s ",
                " s ",
				'A', new ItemStack(Items.IRON_AXE),
				'S', new ItemStack(Items.IRON_SHOVEL),
				'P', new ItemStack(Items.IRON_PICKAXE),
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.diamond_multi.get()), 
					"ASP",
                " s ",
                " s ",
				'A', new ItemStack(Items.DIAMOND_AXE),
				'S', new ItemStack(Items.DIAMOND_SHOVEL),
				'P', new ItemStack(Items.DIAMOND_PICKAXE),
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.emerald_multi.get()), 
					"ASP",
                " s ",
                " s ",
				'A', new ItemStack(TechTools.emerald_axe.get()),
				'S', new ItemStack(TechTools.emerald_spade.get()),
				'P', new ItemStack(TechTools.emerald_pickaxe.get()),
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.obsidian_multi.get()), 
				"ASP",
                " s ",
                " s ",
				'A', new ItemStack(TechTools.obsidian_axe.get()),
				'S', new ItemStack(TechTools.obsidian_spade.get()),
				'P', new ItemStack(TechTools.obsidian_pickaxe.get()),
				's', "forge:rods/wooden");
		
		
		// Battle Axes
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.wooden_battle.get()), 
					"isi",
                "isi",
                " s ",
				'i', "minecraft:logs",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.stone_battle.get()), 
					"isi",
                "isi",
                " s ",
				'i', "forge:stone",
				's', "forge:rods/wooden");
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.golden_battle.get()), 
					"isi",
                "isi",
                " s ",
				'i', "forge:ingots/gold",
				's', "forge:rods/wooden");

		exportJson.addShapedRecipe(new ItemStack(TechTools.iron_battle.get()), 
					"isi",
                "isi",
                " s ",
				'i', "forge:ingots/iron",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.diamond_battle.get()), 
					"isi",
                "isi",
                " s ",
				'i', "forge:gems/diamond",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.emerald_battle.get()), 
					"isi",
                "isi",
                " s ",
				'i', "forge:gems/emerald",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.obsidian_battle.get()), 
					"isi",
                "isi",
                " s ",
				'i', "forge:obsidian",
				's', "forge:rods/wooden");
		
		
		// Spears
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.wooden_spear.get()), 
					"i  ",
                " s ",
                "  s",
				'i', "minecraft:logs",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.stone_spear.get()), 
					"i  ",
                " s ",
                "  s",
				'i', "forge:stone",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.golden_spear.get()), 
					"i  ",
                " s ",
                "  s",
				'i', "forge:ingots/gold",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.iron_spear.get()), 
					"i  ",
                " s ",
                "  s",
				'i', "forge:ingots/iron",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.diamond_spear.get()), 
					"i  ",
                " s ",
                "  s",
				'i', "forge:gems/diamond",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.emerald_spear.get()), 
					"i  ",
                " s ",
                "  s",
				'i', "forge:gems/emerald",
				's', "forge:rods/wooden");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechTools.obsidian_spear.get()), 
					"i  ",
                " s ",
                "  s",
				'i', "forge:obsidian",
				's', "forge:rods/wooden");
		
	}
}
