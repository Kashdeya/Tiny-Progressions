package com.kashdeya.tinyprogressions.inits;

import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.crafting.Recipes;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.DamageHandler;
import com.kashdeya.tinyprogressions.handlers.MaterialHandler;
import com.kashdeya.tinyprogressions.items.battle.BattleMain;
import com.kashdeya.tinyprogressions.items.battle.EmeraldBattle;
import com.kashdeya.tinyprogressions.items.battle.ObsidianBattle;
import com.kashdeya.tinyprogressions.items.multi.EmeraldMulti;
import com.kashdeya.tinyprogressions.items.multi.MultiMain;
import com.kashdeya.tinyprogressions.items.multi.ObsidianMulti;
import com.kashdeya.tinyprogressions.items.scythes.EmeraldScythe;
import com.kashdeya.tinyprogressions.items.scythes.ObsidianScythe;
import com.kashdeya.tinyprogressions.items.scythes.ScytheMain;
import com.kashdeya.tinyprogressions.items.spears.EmeraldSpear;
import com.kashdeya.tinyprogressions.items.spears.ObsidianSpear;
import com.kashdeya.tinyprogressions.items.spears.SpearMain;
import com.kashdeya.tinyprogressions.items.tools.BirthdayPickaxe;
import com.kashdeya.tinyprogressions.items.tools.bone.BoneAxe;
import com.kashdeya.tinyprogressions.items.tools.bone.BoneHoe;
import com.kashdeya.tinyprogressions.items.tools.bone.BonePickaxe;
import com.kashdeya.tinyprogressions.items.tools.bone.BoneSpade;
import com.kashdeya.tinyprogressions.items.tools.bone.BoneSword;
import com.kashdeya.tinyprogressions.items.tools.emerald.EmeraldAxe;
import com.kashdeya.tinyprogressions.items.tools.emerald.EmeraldHoe;
import com.kashdeya.tinyprogressions.items.tools.emerald.EmeraldPickaxe;
import com.kashdeya.tinyprogressions.items.tools.emerald.EmeraldSpade;
import com.kashdeya.tinyprogressions.items.tools.emerald.EmeraldSword;
import com.kashdeya.tinyprogressions.items.tools.flint.FlintAxe;
import com.kashdeya.tinyprogressions.items.tools.flint.FlintHoe;
import com.kashdeya.tinyprogressions.items.tools.flint.FlintPickaxe;
import com.kashdeya.tinyprogressions.items.tools.flint.FlintSpade;
import com.kashdeya.tinyprogressions.items.tools.flint.FlintSword;
import com.kashdeya.tinyprogressions.items.tools.obsidian.ObsidianAxe;
import com.kashdeya.tinyprogressions.items.tools.obsidian.ObsidianHoe;
import com.kashdeya.tinyprogressions.items.tools.obsidian.ObsidianPickaxe;
import com.kashdeya.tinyprogressions.items.tools.obsidian.ObsidianSpade;
import com.kashdeya.tinyprogressions.items.tools.obsidian.ObsidianSword;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;

public class TechTools {
	
	static Set<Item> items = Sets.newHashSet();
	
	// Flint
	public static Item flint_pickaxe;
	public static Item flint_axe;
	public static Item flint_spade;
	public static Item flint_sword;
	public static Item flint_hoe;
	// Bone
	public static Item bone_pickaxe;
	public static Item bone_axe;
	public static Item bone_spade;
	public static Item bone_sword;
	public static Item bone_hoe;
	// Birthday
	public static Item birthday_pickaxe;
	// Emerald
	public static Item emerald_axe;
	public static Item emerald_pickaxe;
	public static Item emerald_spade;
	public static Item emerald_hoe;
	public static Item emerald_sword;
	// Obsidian
	public static Item obsidian_axe;
	public static Item obsidian_pickaxe;
	public static Item obsidian_spade;
	public static Item obsidian_hoe;
	public static Item obsidian_sword;
	// Scythe
	public static Item wooden_scythe;
	public static Item stone_scythe;
	public static Item golden_scythe;
	public static Item iron_scythe;
	public static Item emerald_scythe;
	public static Item diamond_scythe;
	public static Item obsidian_scythe;
	// Multi
	public static Item wooden_multi;
	public static Item stone_multi;
	public static Item golden_multi;
	public static Item iron_multi;
	public static Item emerald_multi;
	public static Item diamond_multi;
	public static Item obsidian_multi;
	// Battle
	public static Item wooden_battle;
	public static Item stone_battle;
	public static Item golden_battle;
	public static Item iron_battle;
	public static Item emerald_battle;
	public static Item diamond_battle;
	public static Item obsidian_battle;
	// Spear
	public static Item wooden_spear;
	public static Item stone_spear;
	public static Item golden_spear;
	public static Item iron_spear;
	public static Item emerald_spear;
	public static Item diamond_spear;
	public static Item obsidian_spear;
	
	public static void init(){
		// Flint
		if (ConfigHandler.FlintTools){
			flint_pickaxe = new FlintPickaxe(MaterialHandler.FLINT).setUnlocalizedName("flint_pickaxe");
			registerItem(flint_pickaxe, "flint_pickaxe");
			
			Recipes.addShapedRecipe("flint_pickaxe", new ItemStack(flint_pickaxe), new Object[] {
					"fff",
					" s ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			flint_axe = new FlintAxe(MaterialHandler.FLINT, 7.0F, -1.2F).setUnlocalizedName("flint_axe");
			registerItem(flint_axe, "flint_axe");
			
			Recipes.addShapedRecipe("flint_axe", new ItemStack(flint_axe), new Object[] {
					"ff ",
					"fs ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			flint_spade = new FlintSpade(MaterialHandler.FLINT).setUnlocalizedName("flint_spade");
			registerItem(flint_spade, "flint_spade");
			
			Recipes.addShapedRecipe("flint_spade", new ItemStack(flint_spade), new Object[] {
					" f ",
					" s ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			flint_sword = new FlintSword(MaterialHandler.FLINT).setUnlocalizedName("flint_sword");
			registerItem(flint_sword, "flint_sword");
			
			Recipes.addShapedRecipe("flint_sword", new ItemStack(flint_sword), new Object[] {
					" f ",
					" f ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
			
			flint_hoe = new FlintHoe(MaterialHandler.FLINT).setUnlocalizedName("flint_hoe");
			registerItem(flint_hoe, "flint_hoe");
			
			Recipes.addShapedRecipe("flint_hoe", new ItemStack(flint_hoe), new Object[] {
					"ff ",
					" s ",
					" s ",
						Character.valueOf('f'), "flint",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Bone
		if (ConfigHandler.BoneTools){
			bone_pickaxe = new BonePickaxe(MaterialHandler.BONE).setUnlocalizedName("bone_pickaxe");
			registerItem(bone_pickaxe, "bone_pickaxe");
			
			Recipes.addShapedRecipe("bone_pickaxe", new ItemStack(bone_pickaxe), new Object[] {
					"bbb",
					" s ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			bone_axe = new BoneAxe(MaterialHandler.BONE, 5.0F, -1.2F).setUnlocalizedName("bone_axe");
			registerItem(bone_axe, "bone_axe");
			
			Recipes.addShapedRecipe("bone_axe", new ItemStack(bone_axe), new Object[] {
					"bb ",
					"bs ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			bone_spade = new BoneSpade(MaterialHandler.BONE).setUnlocalizedName("bone_spade");
			registerItem(bone_spade, "bone_spade");
			
			Recipes.addShapedRecipe("bone_spade", new ItemStack(bone_spade), new Object[] {
					" b ",
					" s ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			bone_sword = new BoneSword(MaterialHandler.BONE).setUnlocalizedName("bone_sword");
			registerItem(bone_sword, "bone_sword");
			
			Recipes.addShapedRecipe("bone_sword", new ItemStack(bone_sword), new Object[] {
					" b ",
					" b ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
			
			bone_hoe = new BoneHoe(MaterialHandler.BONE).setUnlocalizedName("bone_hoe");
			registerItem(bone_hoe, "bone_hoe");
			
			Recipes.addShapedRecipe("bone_hoe", new ItemStack(bone_hoe), new Object[] {
					"bb ",
					" s ",
					" s ",
						Character.valueOf('b'), "bone",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Birthday
	    if (ConfigHandler.BirthdayPickaxe){
	    		birthday_pickaxe = new BirthdayPickaxe(MaterialHandler.BIRTHDAY);
			registerItem(birthday_pickaxe, "birthday_pickaxe");
			
			ItemStack BirthdayPickaxe = new ItemStack(birthday_pickaxe);
			BirthdayPickaxe.addEnchantment(Enchantments.MENDING, 2);
			
			Recipes.addShapedRecipe("birthday_pickaxe", BirthdayPickaxe, new Object[] {
					"rdr",
					" s ",
					" s ",
						Character.valueOf('r'), "blockReinforcedObsidian",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
		}
	    // Scythe
	    if (ConfigHandler.wooden_scythe){
	    		wooden_scythe = new ScytheMain(ToolMaterial.WOOD).setUnlocalizedName("wooden_scythe").setMaxDamage(DamageHandler.wooden_scythe);
			registerItem(wooden_scythe, "wooden_scythe");
			
			Recipes.addShapedRecipe("wooden_scythe", new ItemStack(wooden_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "logWood",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.stone_scythe){
			stone_scythe = new ScytheMain(ToolMaterial.STONE).setUnlocalizedName("stone_scythe").setMaxDamage(DamageHandler.stone_scythe);
			registerItem(stone_scythe, "stone_scythe");
			
			Recipes.addShapedRecipe("stone_scythe", new ItemStack(stone_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "stone",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.golden_scythe){
			golden_scythe = new ScytheMain(ToolMaterial.GOLD).setUnlocalizedName("golden_scythe").setMaxDamage(DamageHandler.golden_scythe);
			registerItem(golden_scythe, "golden_scythe");
			
			Recipes.addShapedRecipe("golden_scythe", new ItemStack(golden_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "ingotGold",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.iron_scythe){
			iron_scythe = new ScytheMain(ToolMaterial.IRON).setUnlocalizedName("iron_scythe").setMaxDamage(DamageHandler.iron_scythe);
			registerItem(iron_scythe, "iron_scythe");
			
			Recipes.addShapedRecipe("iron_scythe", new ItemStack(iron_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('s'), "stickWood"
			});
	    }
	    if (ConfigHandler.diamond_scythe){
			diamond_scythe = new ScytheMain(ToolMaterial.DIAMOND).setUnlocalizedName("diamond_scythe").setMaxDamage(DamageHandler.diamond_scythe);
			registerItem(diamond_scythe, "diamond_scythe");
			
			Recipes.addShapedRecipe("diamond_scythe", new ItemStack(diamond_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
	    }
		if (ConfigHandler.emerald_scythe){
			emerald_scythe = new EmeraldScythe(MaterialHandler.EMERALD).setUnlocalizedName("emerald_scythe").setMaxDamage(DamageHandler.emerald_scythe);
			registerItem(emerald_scythe, "emerald_scythe");
			
			Recipes.addShapedRecipe("emerald_scythe", new ItemStack(emerald_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_scythe){
			obsidian_scythe = new ObsidianScythe(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_scythe").setMaxDamage(DamageHandler.obsidian_scythe);
			registerItem(obsidian_scythe, "obsidian_scythe");
			
			Recipes.addShapedRecipe("obsidian_scythe", new ItemStack(obsidian_scythe), new Object[] {
					"iii",
					" s ",
					"s  ",
						Character.valueOf('i'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Emerald
		if (ConfigHandler.emerald_axe){
		    emerald_axe = new EmeraldAxe(MaterialHandler.EMERALD, 7.0F, -1.2F).setUnlocalizedName("emerald_axe").setMaxDamage(DamageHandler.emerald_axe);
		    registerItem(emerald_axe, "emerald_axe");
		    
		    Recipes.addShapedRecipe("emerald_axe", new ItemStack(emerald_axe), new Object[] {
					"ee ",
					"es ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_pickaxe){
			emerald_pickaxe = new EmeraldPickaxe(MaterialHandler.EMERALD).setUnlocalizedName("emerald_pickaxe").setMaxDamage(DamageHandler.emerald_pickaxe);
		    registerItem(emerald_pickaxe, "emerald_pickaxe");
		    
		    Recipes.addShapedRecipe("emerald_pickaxe", new ItemStack(emerald_pickaxe), new Object[] {
					"eee",
					" s ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_spade){
			emerald_spade = new EmeraldSpade(MaterialHandler.EMERALD).setUnlocalizedName("emerald_spade").setMaxDamage(DamageHandler.emerald_spade);
		    registerItem(emerald_spade, "emerald_spade");
		    
		    Recipes.addShapedRecipe("emerald_spade", new ItemStack(emerald_spade), new Object[] {
					" e ",
					" s ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_hoe){
			emerald_hoe = new EmeraldHoe(MaterialHandler.EMERALD).setUnlocalizedName("emerald_hoe").setMaxDamage(DamageHandler.emerald_hoe);
		    registerItem(emerald_hoe, "emerald_hoe");
		    
		    Recipes.addShapedRecipe("emerald_hoe", new ItemStack(emerald_hoe), new Object[] {
					"ee ",
					" s ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_sword){
			emerald_sword = new EmeraldSword(MaterialHandler.EMERALD).setUnlocalizedName("emerald_sword").setMaxDamage(DamageHandler.emerald_sword);
		    registerItem(emerald_sword, "emerald_sword");
		    
		    Recipes.addShapedRecipe("emerald_sword", new ItemStack(emerald_sword), new Object[] {
					" e ",
					" e ",
					" s ",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Obsidian
		if (ConfigHandler.obsidian_axe){
		    obsidian_axe = new ObsidianAxe(MaterialHandler.OBSIDIAN, 8.0F, -1.2F).setUnlocalizedName("obsidian_axe").setMaxDamage(DamageHandler.obsidian_axe);
		    registerItem(obsidian_axe, "obsidian_axe");
		    
		    Recipes.addShapedRecipe("obsidian_axe", new ItemStack(obsidian_axe), new Object[] {
					"oo ",
					"os ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_pickaxe){
			obsidian_pickaxe = new ObsidianPickaxe(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_pickaxe").setMaxDamage(DamageHandler.obsidian_pickaxe);
		    registerItem(obsidian_pickaxe, "obsidian_pickaxe");
		    
		    Recipes.addShapedRecipe("obsidian_pickaxe", new ItemStack(obsidian_pickaxe), new Object[] {
					"ooo",
					" s ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_spade){
			obsidian_spade = new ObsidianSpade(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_spade").setMaxDamage(DamageHandler.obsidian_spade);
		    registerItem(obsidian_spade, "obsidian_spade");
		    
		    Recipes.addShapedRecipe("obsidian_spade", new ItemStack(obsidian_spade), new Object[] {
					" o ",
					" s ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_hoe){
			obsidian_hoe = new ObsidianHoe(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_hoe").setMaxDamage(DamageHandler.obsidian_hoe);
		    registerItem(obsidian_hoe, "obsidian_hoe");
		    
		    Recipes.addShapedRecipe("obsidian_hoe", new ItemStack(obsidian_hoe), new Object[] {
					"oo ",
					" s ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_sword){
			obsidian_sword = new ObsidianSword(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_sword").setMaxDamage(DamageHandler.obsidian_sword);
		    registerItem(obsidian_sword, "obsidian_sword");
		    
		    Recipes.addShapedRecipe("obsidian_sword", new ItemStack(obsidian_sword), new Object[] {
					" o ",
					" o ",
					" s ",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Multi
		if (ConfigHandler.wooden_multi){
			wooden_multi = new MultiMain(ToolMaterial.WOOD).setUnlocalizedName("wooden_multi").setMaxDamage(DamageHandler.wooden_multi);
			registerItem(wooden_multi, "wooden_multi");
			
		    Recipes.addShapedRecipe("wooden_multi", new ItemStack(wooden_multi), new Object[] {
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
			stone_multi = new MultiMain(ToolMaterial.STONE).setUnlocalizedName("stone_multi").setMaxDamage(DamageHandler.stone_multi);
			registerItem(stone_multi, "stone_multi");
			
			Recipes.addShapedRecipe("stone_multi", new ItemStack(stone_multi), new Object[] {
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
			golden_multi = new MultiMain(ToolMaterial.GOLD).setUnlocalizedName("golden_multi").setMaxDamage(DamageHandler.golden_multi);
			registerItem(golden_multi, "golden_multi");
			
			Recipes.addShapedRecipe("golden_multi", new ItemStack(golden_multi), new Object[] {
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
			iron_multi = new MultiMain(ToolMaterial.IRON).setUnlocalizedName("iron_multi").setMaxDamage(DamageHandler.iron_multi);
			registerItem(iron_multi, "iron_multi");
			
			Recipes.addShapedRecipe("iron_multi", new ItemStack(iron_multi), new Object[] {
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
			diamond_multi = new MultiMain(ToolMaterial.DIAMOND).setUnlocalizedName("diamond_multi").setMaxDamage(DamageHandler.diamond_multi);
			registerItem(diamond_multi, "diamond_multi");
			
			Recipes.addShapedRecipe("diamond_multi", new ItemStack(diamond_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), Items.DIAMOND_AXE,
						Character.valueOf('S'), Items.DIAMOND_SHOVEL,
						Character.valueOf('P'), Items.DIAMOND_PICKAXE,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_multi){
			emerald_multi = new EmeraldMulti(MaterialHandler.EMERALD).setUnlocalizedName("emerald_multi").setMaxDamage(DamageHandler.emerald_multi);
			registerItem(emerald_multi, "emerald_multi");
			
			Recipes.addShapedRecipe("emerald_multi", new ItemStack(emerald_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), emerald_axe,
						Character.valueOf('S'), emerald_spade,
						Character.valueOf('P'), emerald_pickaxe,
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_multi){
			obsidian_multi = new ObsidianMulti(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_multi").setMaxDamage(DamageHandler.obsidian_multi);
			registerItem(obsidian_multi, "obsidian_multi");
			
			Recipes.addShapedRecipe("obsidian_multi", new ItemStack(obsidian_multi), new Object[] {
					"ASP",
					" s ",
					" s ",
						Character.valueOf('A'), obsidian_axe,
						Character.valueOf('S'), obsidian_spade,
						Character.valueOf('P'), obsidian_pickaxe,
						Character.valueOf('s'), "stickWood"
			});
		}
		// Battle
		if (ConfigHandler.wooden_battle){
			wooden_battle = new BattleMain(ToolMaterial.WOOD, 8.0F, -3.5F).setUnlocalizedName("wooden_battle").setMaxDamage(DamageHandler.wooden_battle);
			registerItem(wooden_battle, "wooden_battle");
			
			Recipes.addShapedRecipe("wooden_battle", new ItemStack(wooden_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "logWood",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.stone_battle){
			stone_battle = new BattleMain(ToolMaterial.STONE, 10.0F, -3.5F).setUnlocalizedName("stone_battle").setMaxDamage(DamageHandler.stone_battle);
			registerItem(stone_battle, "stone_battle");
			
			Recipes.addShapedRecipe("stone_battle", new ItemStack(stone_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "stone",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.golden_battle){
			golden_battle = new BattleMain(ToolMaterial.GOLD, 8.0F, -3.1F).setUnlocalizedName("golden_battle").setMaxDamage(DamageHandler.golden_battle);
			registerItem(golden_battle, "golden_battle");
			
			Recipes.addShapedRecipe("golden_battle", new ItemStack(golden_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "ingotGold",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.iron_battle){
			iron_battle = new BattleMain(ToolMaterial.IRON, 11.0F, -3.2F).setUnlocalizedName("iron_battle").setMaxDamage(DamageHandler.iron_battle);
			registerItem(iron_battle, "iron_battle");
			
			Recipes.addShapedRecipe("iron_battle", new ItemStack(iron_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.diamond_battle){
			diamond_battle = new BattleMain(ToolMaterial.DIAMOND, 12.0F, -3.0F).setUnlocalizedName("diamond_battle").setMaxDamage(DamageHandler.diamond_battle);
			registerItem(diamond_battle, "diamond_battle");
			
			Recipes.addShapedRecipe("diamond_battle", new ItemStack(diamond_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_battle){
			emerald_battle = new EmeraldBattle(MaterialHandler.EMERALD, 14.0F, -1.2F).setUnlocalizedName("emerald_battle").setMaxDamage(DamageHandler.emerald_battle);
			registerItem(emerald_battle, "emerald_battle");
			
			Recipes.addShapedRecipe("emerald_battle", new ItemStack(emerald_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_battle){
			obsidian_battle = new ObsidianBattle(MaterialHandler.OBSIDIAN, 16.0F, -1.2F).setUnlocalizedName("obsidian_battle").setMaxDamage(DamageHandler.obsidian_battle);
			registerItem(obsidian_battle, "obsidian_battle");
			
			Recipes.addShapedRecipe("obsidian_battle", new ItemStack(obsidian_battle), new Object[] {
					"isi",
					"isi",
					" s ",
						Character.valueOf('i'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
		// Spear
		if (ConfigHandler.wooden_spear){
			wooden_spear = new SpearMain(ToolMaterial.WOOD).setUnlocalizedName("wooden_spear").setMaxDamage(DamageHandler.wooden_spear);
			registerItem(wooden_spear, "wooden_spear");
			
			Recipes.addShapedRecipe("wooden_spear", new ItemStack(wooden_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "logWood",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.stone_spear){
			stone_spear = new SpearMain(ToolMaterial.STONE).setUnlocalizedName("stone_spear").setMaxDamage(DamageHandler.stone_spear);
			registerItem(stone_spear, "stone_spear");
			
			Recipes.addShapedRecipe("stone_spear", new ItemStack(stone_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "stone",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.golden_spear){
			golden_spear = new SpearMain(ToolMaterial.GOLD).setUnlocalizedName("golden_spear").setMaxDamage(DamageHandler.golden_spear);
			registerItem(golden_spear, "golden_spear");
			
			Recipes.addShapedRecipe("golden_spear", new ItemStack(golden_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "ingotGold",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.iron_spear){
			iron_spear = new SpearMain(ToolMaterial.IRON).setUnlocalizedName("iron_spear").setMaxDamage(DamageHandler.iron_spear);
			registerItem(iron_spear, "iron_spear");
			
			Recipes.addShapedRecipe("iron_spear", new ItemStack(iron_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.diamond_spear){
			diamond_spear = new SpearMain(ToolMaterial.DIAMOND).setUnlocalizedName("diamond_spear").setMaxDamage(DamageHandler.diamond_spear);
			registerItem(diamond_spear, "diamond_spear");
			
			Recipes.addShapedRecipe("diamond_spear", new ItemStack(diamond_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "gemDiamond",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.emerald_spear){
			emerald_spear = new EmeraldSpear(MaterialHandler.EMERALD).setUnlocalizedName("emerald_spear").setMaxDamage(DamageHandler.emerald_spear);
			registerItem(emerald_spear, "emerald_spear");
			
			Recipes.addShapedRecipe("emerald_spear", new ItemStack(emerald_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "gemEmerald",
						Character.valueOf('s'), "stickWood"
			});
		}
		if (ConfigHandler.obsidian_spear){
			obsidian_spear = new ObsidianSpear(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_spear").setMaxDamage(DamageHandler.obsidian_spear);
			registerItem(obsidian_spear, "obsidian_spear");
			
			Recipes.addShapedRecipe("obsidian_spear", new ItemStack(obsidian_spear), new Object[] {
					"i  ",
					" s ",
					"  s",
						Character.valueOf('i'), "obsidian",
						Character.valueOf('s'), "stickWood"
			});
		}
	}
	
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		Iterator<Item> i = items.iterator();
		
		while(i.hasNext())
		{
			event.getRegistry().register(i.next());
		}
	}
	
	static void registerItem(Item item, String name){
	    item.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + name));
	    items.add(item);
	}

}
