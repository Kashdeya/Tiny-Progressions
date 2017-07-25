package com.kashdeya.tinyprogressions.inits;

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

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TechTools {
	
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
			flint_axe = new FlintAxe(MaterialHandler.FLINT, 7.0F, -3.2F).setUnlocalizedName("flint_axe");
			registerItem(flint_axe, "flint_axe");
			flint_spade = new FlintSpade(MaterialHandler.FLINT).setUnlocalizedName("flint_spade");
			registerItem(flint_spade, "flint_spade");
			flint_sword = new FlintSword(MaterialHandler.FLINT).setUnlocalizedName("flint_sword");
			registerItem(flint_sword, "flint_sword");
			flint_hoe = new FlintHoe(MaterialHandler.FLINT).setUnlocalizedName("flint_hoe");
			registerItem(flint_hoe, "flint_hoe");
		}
		// Bone
		if (ConfigHandler.BoneTools){
			bone_pickaxe = new BonePickaxe(MaterialHandler.BONE).setUnlocalizedName("bone_pickaxe");
			registerItem(bone_pickaxe, "bone_pickaxe");
			bone_axe = new BoneAxe(MaterialHandler.BONE, 5.0F, -3.2F).setUnlocalizedName("bone_axe");
			registerItem(bone_axe, "bone_axe");
			bone_spade = new BoneSpade(MaterialHandler.BONE).setUnlocalizedName("bone_spade");
			registerItem(bone_spade, "bone_spade");
			bone_sword = new BoneSword(MaterialHandler.BONE).setUnlocalizedName("bone_sword");
			registerItem(bone_sword, "bone_sword");
			bone_hoe = new BoneHoe(MaterialHandler.BONE).setUnlocalizedName("bone_hoe");
			registerItem(bone_hoe, "bone_hoe");
		}
		// Birthday
	    if (ConfigHandler.BirthdayPickaxe){
	    	birthday_pickaxe = new BirthdayPickaxe(MaterialHandler.BIRTHDAY);
			registerItem(birthday_pickaxe, "birthday_pickaxe");
		}
	    // Scythe
	    if (ConfigHandler.wooden_scythe){
	    	wooden_scythe = new ScytheMain(ToolMaterial.WOOD).setUnlocalizedName("wooden_scythe").setMaxDamage(DamageHandler.wooden_scythe);
			registerItem(wooden_scythe, "wooden_scythe");
	    }
	    if (ConfigHandler.stone_scythe){
			stone_scythe = new ScytheMain(ToolMaterial.STONE).setUnlocalizedName("stone_scythe").setMaxDamage(DamageHandler.stone_scythe);
			registerItem(stone_scythe, "stone_scythe");
	    }
	    if (ConfigHandler.golden_scythe){
			golden_scythe = new ScytheMain(ToolMaterial.GOLD).setUnlocalizedName("golden_scythe").setMaxDamage(DamageHandler.golden_scythe);
			registerItem(golden_scythe, "golden_scythe");
	    }
	    if (ConfigHandler.iron_scythe){
			iron_scythe = new ScytheMain(ToolMaterial.IRON).setUnlocalizedName("iron_scythe").setMaxDamage(DamageHandler.iron_scythe);
			registerItem(iron_scythe, "iron_scythe");
	    }
	    if (ConfigHandler.diamond_scythe){
			diamond_scythe = new ScytheMain(ToolMaterial.DIAMOND).setUnlocalizedName("diamond_scythe").setMaxDamage(DamageHandler.diamond_scythe);
			registerItem(diamond_scythe, "diamond_scythe");
	    }
		if (ConfigHandler.emerald_scythe){
			emerald_scythe = new EmeraldScythe(MaterialHandler.EMERALD).setUnlocalizedName("emerald_scythe").setMaxDamage(DamageHandler.emerald_scythe);
			registerItem(emerald_scythe, "emerald_scythe");
		}
		if (ConfigHandler.obsidian_scythe){
			obsidian_scythe = new ObsidianScythe(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_scythe").setMaxDamage(DamageHandler.obsidian_scythe);
			registerItem(obsidian_scythe, "obsidian_scythe");
		}
		// Emerald
		if (ConfigHandler.emerald_axe){
		    emerald_axe = new EmeraldAxe(MaterialHandler.EMERALD, 7.0F, -3.0F).setUnlocalizedName("emerald_axe").setMaxDamage(DamageHandler.emerald_axe);
		    registerItem(emerald_axe, "emerald_axe");
		}
		if (ConfigHandler.emerald_pickaxe){
			emerald_pickaxe = new EmeraldPickaxe(MaterialHandler.EMERALD).setUnlocalizedName("emerald_pickaxe").setMaxDamage(DamageHandler.emerald_pickaxe);
		    registerItem(emerald_pickaxe, "emerald_pickaxe");
		}
		if (ConfigHandler.emerald_spade){
			emerald_spade = new EmeraldSpade(MaterialHandler.EMERALD).setUnlocalizedName("emerald_spade").setMaxDamage(DamageHandler.emerald_spade);
		    registerItem(emerald_spade, "emerald_spade");
		}
		if (ConfigHandler.emerald_hoe){
			emerald_hoe = new EmeraldHoe(MaterialHandler.EMERALD).setUnlocalizedName("emerald_hoe").setMaxDamage(DamageHandler.emerald_hoe);
		    registerItem(emerald_hoe, "emerald_hoe");
		}
		if (ConfigHandler.emerald_sword){
			emerald_sword = new EmeraldSword(MaterialHandler.EMERALD).setUnlocalizedName("emerald_sword").setMaxDamage(DamageHandler.emerald_sword);
		    registerItem(emerald_sword, "emerald_sword");
		}
		// Obsidian
		if (ConfigHandler.obsidian_axe){
		    obsidian_axe = new ObsidianAxe(MaterialHandler.OBSIDIAN, 8.0F, -2.9F).setUnlocalizedName("obsidian_axe").setMaxDamage(DamageHandler.obsidian_axe);
		    registerItem(obsidian_axe, "obsidian_axe");
		}
		if (ConfigHandler.obsidian_pickaxe){
			obsidian_pickaxe = new ObsidianPickaxe(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_pickaxe").setMaxDamage(DamageHandler.obsidian_pickaxe);
		    registerItem(obsidian_pickaxe, "obsidian_pickaxe");
		}
		if (ConfigHandler.obsidian_spade){
			obsidian_spade = new ObsidianSpade(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_spade").setMaxDamage(DamageHandler.obsidian_spade);
		    registerItem(obsidian_spade, "obsidian_spade");
		}
		if (ConfigHandler.obsidian_hoe){
			obsidian_hoe = new ObsidianHoe(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_hoe").setMaxDamage(DamageHandler.obsidian_hoe);
		    registerItem(obsidian_hoe, "obsidian_hoe");
		}
		if (ConfigHandler.obsidian_sword){
			obsidian_sword = new ObsidianSword(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_sword").setMaxDamage(DamageHandler.obsidian_sword);
		    registerItem(obsidian_sword, "obsidian_sword");
		}
		// Multi
		if (ConfigHandler.wooden_multi){
			wooden_multi = new MultiMain(ToolMaterial.WOOD).setUnlocalizedName("wooden_multi").setMaxDamage(DamageHandler.wooden_multi);
			registerItem(wooden_multi, "wooden_multi");
		}
		if (ConfigHandler.stone_multi){
			stone_multi = new MultiMain(ToolMaterial.STONE).setUnlocalizedName("stone_multi").setMaxDamage(DamageHandler.stone_multi);
			registerItem(stone_multi, "stone_multi");
		}
		if (ConfigHandler.golden_multi){
			golden_multi = new MultiMain(ToolMaterial.GOLD).setUnlocalizedName("golden_multi").setMaxDamage(DamageHandler.golden_multi);
			registerItem(golden_multi, "golden_multi");
		}
		if (ConfigHandler.iron_multi){
			iron_multi = new MultiMain(ToolMaterial.IRON).setUnlocalizedName("iron_multi").setMaxDamage(DamageHandler.iron_multi);
			registerItem(iron_multi, "iron_multi");
		}
		if (ConfigHandler.diamond_multi){
			diamond_multi = new MultiMain(ToolMaterial.DIAMOND).setUnlocalizedName("diamond_multi").setMaxDamage(DamageHandler.diamond_multi);
			registerItem(diamond_multi, "diamond_multi");
		}
		if (ConfigHandler.emerald_multi){
			emerald_multi = new EmeraldMulti(MaterialHandler.EMERALD).setUnlocalizedName("emerald_multi").setMaxDamage(DamageHandler.emerald_multi);
			registerItem(emerald_multi, "emerald_multi");
		}
		if (ConfigHandler.obsidian_multi){
			obsidian_multi = new ObsidianMulti(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_multi").setMaxDamage(DamageHandler.obsidian_multi);
			registerItem(obsidian_multi, "obsidian_multi");
		}
		// Battle
		if (ConfigHandler.wooden_battle){
			wooden_battle = new BattleMain(ToolMaterial.WOOD, 8.0F, -3.5F).setUnlocalizedName("wooden_battle").setMaxDamage(DamageHandler.wooden_battle);
			registerItem(wooden_battle, "wooden_battle");
		}
		if (ConfigHandler.stone_battle){
			stone_battle = new BattleMain(ToolMaterial.STONE, 10.0F, -3.5F).setUnlocalizedName("stone_battle").setMaxDamage(DamageHandler.stone_battle);
			registerItem(stone_battle, "stone_battle");
		}
		if (ConfigHandler.golden_battle){
			golden_battle = new BattleMain(ToolMaterial.GOLD, 8.0F, -3.1F).setUnlocalizedName("golden_battle").setMaxDamage(DamageHandler.golden_battle);
			registerItem(golden_battle, "golden_battle");
		}
		if (ConfigHandler.iron_battle){
			iron_battle = new BattleMain(ToolMaterial.IRON, 11.0F, -3.2F).setUnlocalizedName("iron_battle").setMaxDamage(DamageHandler.iron_battle);
			registerItem(iron_battle, "iron_battle");
		}
		if (ConfigHandler.diamond_battle){
			diamond_battle = new BattleMain(ToolMaterial.DIAMOND, 12.0F, -3.0F).setUnlocalizedName("diamond_battle").setMaxDamage(DamageHandler.diamond_battle);
			registerItem(diamond_battle, "diamond_battle");
		}
		if (ConfigHandler.emerald_battle){
			emerald_battle = new EmeraldBattle(MaterialHandler.EMERALD, 14.0F, -2.9F).setUnlocalizedName("emerald_battle").setMaxDamage(DamageHandler.emerald_battle);
			registerItem(emerald_battle, "emerald_battle");
		}
		if (ConfigHandler.obsidian_battle){
			obsidian_battle = new ObsidianBattle(MaterialHandler.OBSIDIAN, 16.0F, -2.8F).setUnlocalizedName("obsidian_battle").setMaxDamage(DamageHandler.obsidian_battle);
			registerItem(obsidian_battle, "obsidian_battle");
		}
		// Spear
		if (ConfigHandler.wooden_spear){
			wooden_spear = new SpearMain(ToolMaterial.WOOD).setUnlocalizedName("wooden_spear").setMaxDamage(DamageHandler.wooden_spear);
			registerItem(wooden_spear, "wooden_spear");
		}
		if (ConfigHandler.stone_spear){
			stone_spear = new SpearMain(ToolMaterial.STONE).setUnlocalizedName("stone_spear").setMaxDamage(DamageHandler.stone_spear);
			registerItem(stone_spear, "stone_spear");
		}
		if (ConfigHandler.golden_spear){
			golden_spear = new SpearMain(ToolMaterial.GOLD).setUnlocalizedName("golden_spear").setMaxDamage(DamageHandler.golden_spear);
			registerItem(golden_spear, "golden_spear");
		}
		if (ConfigHandler.iron_spear){
			iron_spear = new SpearMain(ToolMaterial.IRON).setUnlocalizedName("iron_spear").setMaxDamage(DamageHandler.iron_spear);
			registerItem(iron_spear, "iron_spear");
		}
		if (ConfigHandler.diamond_spear){
			diamond_spear = new SpearMain(ToolMaterial.DIAMOND).setUnlocalizedName("diamond_spear").setMaxDamage(DamageHandler.diamond_spear);
			registerItem(diamond_spear, "diamond_spear");
		}
		if (ConfigHandler.emerald_spear){
			emerald_spear = new EmeraldSpear(MaterialHandler.EMERALD).setUnlocalizedName("emerald_spear").setMaxDamage(DamageHandler.emerald_spear);
			registerItem(emerald_spear, "emerald_spear");
		}
		if (ConfigHandler.obsidian_spear){
			obsidian_spear = new ObsidianSpear(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_spear").setMaxDamage(DamageHandler.obsidian_spear);
			registerItem(obsidian_spear, "obsidian_spear");
		}
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}

}
