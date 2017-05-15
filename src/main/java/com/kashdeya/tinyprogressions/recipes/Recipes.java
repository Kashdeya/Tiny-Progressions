package com.kashdeya.tinyprogressions.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechFoods;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;

public class Recipes {
	
	public static void registerRecipes(){
		
		// Armor
		if (ConfigHandler.WoodArmor){
			GameRegistry.addRecipe(new ItemStack(TechArmor.wooden_helmet), "fff", "f f", 'f', new ItemStack(Blocks.LOG, 1, 0));
			GameRegistry.addRecipe(new ItemStack(TechArmor.wooden_chestplate), "f f", "fff", "fff", 'f', new ItemStack(Blocks.LOG, 1, 0));
			GameRegistry.addRecipe(new ItemStack(TechArmor.wooden_leggings), "fff", "f f", "f f", 'f', new ItemStack(Blocks.LOG, 1, 0));
			GameRegistry.addRecipe(new ItemStack(TechArmor.wooden_boots), "f f", "f f", 'f', new ItemStack(Blocks.LOG, 1, 0));
		}
		if (ConfigHandler.StoneArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.stone_boots), "s s", "s s", 's', "stone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.stone_chestplate), "s s", "sss", "sss", 's', "stone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.stone_helmet), "sss", "s s", 's', "stone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.stone_leggings), "sss","s s", "s s", 's', "stone"));
		}
		if (ConfigHandler.FlintArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.flint_boots), "s s", "s s", 's', new ItemStack(Items.FLINT)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.flint_chestplate), "s s", "sss", "sss", 's', new ItemStack(Items.FLINT)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.flint_helmet), "sss", "s s", 's', new ItemStack(Items.FLINT)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.flint_leggings), "sss","s s", "s s", 's', new ItemStack(Items.FLINT)));
		}
		if (ConfigHandler.BoneArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.bone_boots), "s s", "s s", 's', "bone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.bone_chestplate), "s s", "sss", "sss", 's', "bone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.bone_helmet), "sss", "s s", 's', "bone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.bone_leggings), "sss","s s", "s s", 's', "bone"));
		}
		if (ConfigHandler.AmethystOre && ConfigHandler.AmethystArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.amethyst_boots), "s s", "s s", 's', "gemAmethyst"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.amethyst_chestplate), "s s", "sss", "sss", 's', "gemAmethyst"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.amethyst_helmet), "sss", "s s", 's', "gemAmethyst"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.amethyst_leggings), "sss","s s", "s s", 's', "gemAmethyst"));
		}
		if (ConfigHandler.ChainLinks){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.CHAINMAIL_BOOTS), "s s", "s s", 's', "chain"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.CHAINMAIL_CHESTPLATE), "s s", "sss", "sss", 's', "chain"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.CHAINMAIL_HELMET), "sss", "s s", 's', "chain"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.CHAINMAIL_LEGGINGS), "sss","s s", "s s", 's', "chain"));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.chain_links, 8), " i ","isi", " i ", 'i', "ingotIron", 's', "slimeball"));
		}
		if (ConfigHandler.DragonArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.dragon_boots), "s s", "s s", 's', "dragonScale"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.dragon_chestplate), "s s", "sss", "sss", 's', "dragonScale"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.dragon_helmet), "sss", "s s", 's', "dragonScale"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.dragon_leggings), "sss","s s", "s s", 's', "dragonScale"));
		}
		if (ConfigHandler.EmeraldArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.emerald_boots), "s s", "s s", 's', "gemEmerald"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.emerald_chestplate), "s s", "sss", "sss", 's', "gemEmerald"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.emerald_helmet), "sss", "s s", 's', "gemEmerald"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.emerald_leggings), "sss","s s", "s s", 's', "gemEmerald"));
		}
		if (ConfigHandler.LapisArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.lapis_boots), "s s", "s s", 's', "ingotLapis"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.lapis_chestplate), "s s", "sss", "sss", 's', "ingotLapis"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.lapis_helmet), "sss", "s s", 's', "ingotLapis"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.lapis_leggings), "sss","s s", "s s", 's', "ingotLapis"));
			
			GameRegistry.addSmelting(new ItemStack(Items.DYE, 1, 4), new ItemStack(TechItems.lapis_ingot), 1.0F);
		}
		if (ConfigHandler.LavaArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.lava_boots), "s s", "s s", 's', "gemLava"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.lava_chestplate), "s s", "sss", "sss", 's', "gemLava"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.lava_helmet), "sss", "s s", 's', "gemLava"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.lava_leggings), "sss","s s", "s s", 's', "gemLava"));
		}
		if (ConfigHandler.ObsidianArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.obsidian_boots), "s s", "s s", 's', "obsidian"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.obsidian_chestplate), "s s", "sss", "sss", 's', "obsidian"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.obsidian_helmet), "sss", "s s", 's', "obsidian"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.obsidian_leggings), "sss","s s", "s s", 's', "obsidian"));
		}
		if (ConfigHandler.RedstoneArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.redstone_boots), "s s", "s s", 's', "ingotRedstone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.redstone_chestplate), "s s", "sss", "sss", 's', "ingotRedstone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.redstone_helmet), "sss", "s s", 's', "ingotRedstone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.redstone_leggings), "sss","s s", "s s", 's', "ingotRedstone"));
			
			GameRegistry.addSmelting(new ItemStack(Items.REDSTONE), new ItemStack(TechItems.redstone_ingot), 1.0F);
		}
		if (ConfigHandler.ReinforcedArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.reinforced_boots), "s s", "s s", 's', "ingotReinforcedDiamond"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.reinforced_chestplate), "s s", "sss", "sss", 's', "ingotReinforcedDiamond"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.reinforced_helmet), "sss", "s s", 's', "ingotReinforcedDiamond"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.reinforced_leggings), "sss","s s", "s s", 's', "ingotReinforcedDiamond"));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.reinforced_diamond, 4), "odo", "dod", "odo", 'o', new ItemStack(TechBlocks.reinforced_obsidian), 'd', "gemDiamond"));
		}
		if (ConfigHandler.WitherArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.wither_boots), "s s", "s s", 's', "witherRib"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.wither_chestplate), "s s", "sss", "sss", 's', "witherRib"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.wither_helmet), "sss", "s s", 's', "witherRib"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.wither_leggings), "sss","s s", "s s", 's', "witherRib"));
		}
		if (ConfigHandler.SapphireOre && ConfigHandler.SapphireArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.sapphire_boots), "s s", "s s", 's', "gemSapphire"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.sapphire_chestplate), "s s", "sss", "sss", 's', "gemSapphire"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.sapphire_helmet), "sss", "s s", 's', "gemSapphire"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.sapphire_leggings), "sss","s s", "s s", 's', "gemSapphire"));
		}
		if (ConfigHandler.RubyOre && ConfigHandler.RubyArmor){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.ruby_boots), "s s", "s s", 's', "gemRuby"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.ruby_chestplate), "s s", "sss", "sss", 's', "gemRuby"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.ruby_helmet), "sss", "s s", 's', "gemRuby"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.ruby_leggings), "sss","s s", "s s", 's', "gemRuby"));
		}
		
		// Flint Recipe
		if (ConfigHandler.FlintRecipe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.FLINT), "ss ","s  ", 's', "gravel"));
		}
		
		// Smooth End Stone
		if (ConfigHandler.SmoothEndStone){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.smooth_endstone, 4), "nn", "nn", 'n', "endstone"));
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.END_BRICKS, 4), new Object[] {"CC", "CC", 'C', new ItemStack(TechBlocks.smooth_endstone)});			
		}
		
		// Scythes
		if (ConfigHandler.WoodenScythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.wooden_scythe), "ppp", " s ", "s  ", 'p', "logWood", 's', "stickWood"));
		}
		if (ConfigHandler.StoneScythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.stone_scythe), "sss", " t ", "t  ", 's', "stone", 't', "stickWood"));
		}
		if (ConfigHandler.GoldenScythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.golden_scythe), "ggg", " s ", "s  ", 'g', "ingotGold", 's', "stickWood"));
		}
		if (ConfigHandler.IronScythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.iron_scythe), "iii", " s ", "s  ", 'i', "ingotIron", 's', "stickWood"));
		}
		if (ConfigHandler.DiamondScythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.diamond_scythe), "ddd", " s ", "s  ", 'd', "gemDiamond", 's', "stickWood"));
		}
		if (ConfigHandler.EmeraldScythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_scythe), "ddd", " s ", "s  ", 'd', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.ObsidianScythe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_scythe), "ddd", " s ", "s  ", 'd', "obsidian", 's', "stickWood"));
		}
		
		// Multi
		if (ConfigHandler.WoodenMulti){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.wooden_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(Items.WOODEN_AXE), 's', new ItemStack(Items.WOODEN_SHOVEL), 'p', new ItemStack(Items.WOODEN_PICKAXE), 'd', new ItemStack(Items.STICK)});
		}
		if (ConfigHandler.StoneMulti){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.stone_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(Items.STONE_AXE), 's', new ItemStack(Items.STONE_SHOVEL), 'p', new ItemStack(Items.STONE_PICKAXE), 'd', new ItemStack(Items.STICK)});
		}
		if (ConfigHandler.GoldenMulti){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.golden_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(Items.GOLDEN_AXE), 's', new ItemStack(Items.GOLDEN_SHOVEL), 'p', new ItemStack(Items.GOLDEN_PICKAXE), 'd', new ItemStack(Items.STICK)});
		}
		if (ConfigHandler.IronMulti){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.iron_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(Items.IRON_AXE), 's', new ItemStack(Items.IRON_SHOVEL), 'p', new ItemStack(Items.IRON_PICKAXE), 'd', new ItemStack(Items.STICK)});
		}
		if (ConfigHandler.DiamondMulti){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.diamond_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(Items.DIAMOND_AXE), 's', new ItemStack(Items.DIAMOND_SHOVEL), 'p', new ItemStack(Items.DIAMOND_PICKAXE), 'd', new ItemStack(Items.STICK)});
		}
		if (ConfigHandler.EmeraldMulti){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.emerald_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(TechTools.emerald_axe), 's', new ItemStack(TechTools.emerald_spade), 'p', new ItemStack(TechTools.emerald_pickaxe), 'd', new ItemStack(Items.STICK)});
		}
		if (ConfigHandler.ObsidianMulti){
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.obsidian_multi), new Object[] {"asp", " d ", " d ", 'a', new ItemStack(TechTools.obsidian_axe), 's', new ItemStack(TechTools.obsidian_spade), 'p', new ItemStack(TechTools.obsidian_pickaxe), 'd', new ItemStack(Items.STICK)});
		}
		
		// Battle
		if (ConfigHandler.WoodenBattle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.wooden_battle), "psp", "psp", " s ", 'p', "logWood", 's', "stickWood"));
		}
		if (ConfigHandler.StoneBattle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.stone_battle), "sts", "sts", " t ", 's', "stone", 't', "stickWood"));
		}
		if (ConfigHandler.GoldenBattle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.golden_battle), "gsg", "gsg", " s ", 'g', "ingotGold", 's', "stickWood"));
		}
		if (ConfigHandler.IronBattle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.iron_battle), "isi", "isi", " s ", 'i', "ingotIron", 's', "stickWood"));
		}
		if (ConfigHandler.DiamondBattle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.diamond_battle), "dsd", "dsd", " s ", 'd', "gemDiamond", 's', "stickWood"));
		}
		if (ConfigHandler.EmeraldBattle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_battle), "dsd", "dsd", " s ", 'd', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.ObsidianBattle){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_battle), "dsd", "dsd", " s ", 'd', "obsidian", 's', "stickWood"));
		}
		
		// Spear
		if (ConfigHandler.WoodenSpear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.wooden_spear), "p  ", " s ", "  s", 'p', "logWood", 's', "stickWood"));
		}
		if (ConfigHandler.StoneSpear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.stone_spear), "s  ", " t ", "  t", 's', "stone", 't', "stickWood"));
		}
		if (ConfigHandler.GoldenSpear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.golden_spear), "g  ", " s ", "  s", 'g', "ingotGold", 's', "stickWood"));
		}
		if (ConfigHandler.IronSpear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.iron_spear), "i  ", " s ", "  s", 'i', "ingotIron", 's', "stickWood"));
		}
		if (ConfigHandler.DiamondSpear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.diamond_spear), "d  ", " s ", "  s", 'd', "gemDiamond", 's', "stickWood"));
		}
		if (ConfigHandler.EmeraldSpear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_spear), "d  ", " s ", "  s", 'd', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.ObsidianSpear){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_spear), "d  ", " s ", "  s", 'd', "obsidian", 's', "stickWood"));
		}
		
		// Emerald
		if (ConfigHandler.EmeraldAxe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_axe), "ff ", "fs ", " s ", 'f', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.EmeraldHoe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_hoe), "ff ", " s ", " s ", 'f', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.EmeraldSword){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_sword), "f", "f", "s", 'f', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.EmeraldSpade){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_spade), "f", "s", "s", 'f', "gemEmerald", 's', "stickWood"));
		}
		if (ConfigHandler.EmeraldPickaxe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.emerald_pickaxe), "fff", " s ", " s ", 'f', "gemEmerald", 's', "stickWood"));
		}
		
		// Obsidian
		if (ConfigHandler.ObsidianAxe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_axe), "ff ", "fs ", " s ", 'f', "obsidian", 's', "stickWood"));
		}
		if (ConfigHandler.ObsidianHoe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_hoe), "ff ", " s ", " s ", 'f', "obsidian", 's', "stickWood"));
		}
		if (ConfigHandler.ObsidianSword){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_sword), "f", "f", "s", 'f', "obsidian", 's', "stickWood"));
		}
		if (ConfigHandler.ObsidianSpade){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_spade), "f", "s", "s", 'f', "obsidian", 's', "stickWood"));
		}
		if (ConfigHandler.ObsidianPickaxe){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechTools.obsidian_pickaxe), "fff", " s ", " s ", 'f', "obsidian", 's', "stickWood"));
		}
		
		// Compressed Blocks
		if (ConfigHandler.FlintBlock){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.flint_block), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.FLINT)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.FLINT, 9), new Object[] {new ItemStack(TechBlocks.flint_block)});
		}
		if (ConfigHandler.NetherStarBlock){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.netherstar_block), "nnn", "nnn", "nnn", 'n', "netherStar"));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_STAR, 9), new Object[] {new ItemStack(TechBlocks.netherstar_block)});
		}
		if (ConfigHandler.BoneBlock){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.bone_block), "bbb", "bbb", "bbb", 'b', "bone"));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.BONE, 9), new Object[] {new ItemStack(TechBlocks.bone_block)});
		}
		if (ConfigHandler.FleshBlock){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.flesh_block), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.ROTTEN_FLESH)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 9), new Object[] {new ItemStack(TechBlocks.flesh_block)});
		}
		if (ConfigHandler.CharcoalBlock){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.charcoal_block), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.COAL, 1, 1)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 9, 1), new Object[] {new ItemStack(TechBlocks.charcoal_block)});
		}
		
		// Medkit
		if (ConfigHandler.MedKit){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.med_kit), "prp", "rgr", "lrl", 'p', "paper", 'r', "dyeRed", 'g', new ItemStack(Items.SPECKLED_MELON), 'l', "leather"));
		}
		
		// Stone Torch
		if (ConfigHandler.StoneTorch){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.stone_stick, 4), "d", "d", 'd', "cobblestone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.stone_torch, 4), "c", "d", 'd', "stickStone", 'c', new ItemStack(Items.COAL, 1, 0)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.stone_torch, 4), "c", "d", 'd', "stickStone", 'c', new ItemStack(Items.COAL, 1, 1)));
		}
		
		// Ender Dust
		if (ConfigHandler.EnderOre){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ENDER_PEARL), "ddd", "d d", "ddd", 'd', "dustEnder"));
		}
		
		// Apples
		if (ConfigHandler.DiamondApple){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.diamond_apple), "ddd", "dad", "ddd", 'd', "gemDiamond", 'a', new ItemStack(Items.APPLE)));
		}
		if (ConfigHandler.EmeraldApple){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.emerald_apple), "ddd", "dad", "ddd", 'd', "gemEmerald", 'a', new ItemStack(Items.APPLE)));
		}
		if (ConfigHandler.NotchApple){
			GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[] {"ggg", "gag", "ggg", 'a', new ItemStack(Items.APPLE), 'g', new ItemStack(Blocks.GOLD_BLOCK)});
		}
		if (ConfigHandler.ApplePro){
			GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 0), new Object[] {"ggg", "gag", "ggg", 'a', new ItemStack(Items.APPLE), 'g', new ItemStack(Items.GOLD_NUGGET)});
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.golden_apple), new Object[] {"ggg", "gag", "ggg", 'a', new ItemStack(Items.APPLE), 'g', new ItemStack(Items.GOLD_INGOT)});
			GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[] {"ggg", "gag", "ggg", 'a', new ItemStack(Items.APPLE), 'g', new ItemStack(Blocks.GOLD_BLOCK)});
		}
		
		// Bricks
		if (ConfigHandler.AndesiteBrick){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.andesite_brick, 4), "cc", "cc", 'c', "stoneAndesitePolished"));
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 6), new Object[] {new ItemStack(TechBlocks.andesite_brick)});
		}
		if (ConfigHandler.DioriteBrick){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.diorite_brick, 4), "cc", "cc", 'c', "stoneDioritePolished"));
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 4), new Object[] {new ItemStack(TechBlocks.diorite_brick)});
		}
		if (ConfigHandler.GraniteBrick){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.granite_brick, 4), "cc", "cc", 'c', "stoneGranitePolished"));
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 2), new Object[] {new ItemStack(TechBlocks.granite_brick)});
		}
		
		// Glass
		if (ConfigHandler.DirtyGlass){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.dirty_glass, 4), "sgs", "gsg", "sgs", 'g', "blockGlass", 's', new ItemStack(Blocks.SOUL_SAND)));
		}
		
		// Seeds
		if (ConfigHandler.MyceliumSeeds){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.mycelium_seeds), new Object[] {"bbb", "bsb", "bbb", 'b', new ItemStack(Items.SPIDER_EYE), 's', new ItemStack(Items.WHEAT_SEEDS)});
		}
		
		// Flint
		if (ConfigHandler.FlintTools){
			GameRegistry.addRecipe(new ItemStack(TechTools.flint_axe), "ff ", "fs ", " s ", 'f', new ItemStack(Items.FLINT), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.flint_hoe), "ff ", " s ", " s ", 'f', new ItemStack(Items.FLINT), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.flint_sword), "f", "f", "s", 'f', new ItemStack(Items.FLINT), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.flint_spade), "f", "s", "s", 'f', new ItemStack(Items.FLINT), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.flint_pickaxe), "fff", " s ", " s ", 'f', new ItemStack(Items.FLINT), 's', new ItemStack(Items.STICK));
		}
		if (ConfigHandler.FlintKnife){
			GameRegistry.addShapelessRecipe(new ItemStack(TechItems.flint_knife), new Object[] {new ItemStack(Items.FLINT), new ItemStack(Items.STRING), new ItemStack(Items.STICK)});
		}
		
		// Bone
		if (ConfigHandler.BoneTools){
			GameRegistry.addRecipe(new ItemStack(TechTools.bone_axe), "bb ", "bs ", " s ", 'b', new ItemStack(Items.BONE), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.bone_hoe), "bb ", " s ", " s ", 'b', new ItemStack(Items.BONE), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.bone_sword), "b", "b", "s", 'b', new ItemStack(Items.BONE), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.bone_spade), "b", "s", "s", 'b', new ItemStack(Items.BONE), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.bone_pickaxe), "bbb", " s ", " s ", 'b', new ItemStack(Items.BONE), 's', new ItemStack(Items.STICK));
		}
		
		// Birthday
		if (ConfigHandler.BirthdayPickaxe){
			ItemStack BirthdayPickaxe;
			BirthdayPickaxe  = new ItemStack(TechTools.birthday_pickaxe);
			BirthdayPickaxe.addEnchantment(Enchantments.MENDING, 2);
			GameRegistry.addRecipe(new ShapedOreRecipe(BirthdayPickaxe, "rrr", " i ", " i ", 'r', new ItemStack(TechItems.reinforced_diamond), 'i', "stickWood"));
		}
		
		// Reinforced
		if (ConfigHandler.ReinforcedGlass){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.reinforced_glass, 4), "ogo", "gog", "ogo", 'g', "blockGlassDirty", 'o', "obsidian"));
		}
		if (ConfigHandler.ReinforcedObsidian){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.reinforced_obsidian, 4), "ioi", "oio", "ioi", 'i', new ItemStack(Blocks.IRON_BARS), 'o', "obsidian"));
		}
		
		// Quartz
		if (ConfigHandler.QuartzKnife){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.quartz_knife), "  s", " s ", "q  ", 's', "stickWood", 'q', "gemQuartz"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.quartz_dust), "s", "q",  's', new ItemStack(TechItems.quartz_knife), 'q', "gemQuartz"));
		}
		
		// Watering Can
		if (ConfigHandler.WateringCan){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.watering_can), "id ", "iwi", " i ", 'i', "ingotIron", 'o', "dyeWhite", 'w', new ItemStack(Items.WATER_BUCKET)));
		}
		if (ConfigHandler.WateringCanUpgrade){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.watering_can_upgrade), "on ", "owo", " o ", 'o', "obsidian", 'w', new ItemStack(TechItems.watering_can), 'n', "netherStar"));
		}
		
		// Growth Blocks
		if (ConfigHandler.BlockGrowth){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.growth_block), "ibi", "ded", "ibi", 'i', "ingotIron", 'b', "blockBone", 'e', new ItemStack(Blocks.SEA_LANTERN), 'd', "blockGlassDirty"));
		}
		if (ConfigHandler.BlockGrowthUpgrade){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.growth_upgrade), new Object[] {"CWC", "SES", "CNC", 'W', new ItemStack(TechItems.watering_can_upgrade), 'N', new ItemStack(TechBlocks.netherstar_block), 'C', new ItemStack(TechBlocks.reinforced_obsidian), 'S', new ItemStack(Items.END_CRYSTAL), 'E', new ItemStack(TechBlocks.growth_block)});
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.growth_upgrade_two), new Object[] {"ab ", 'a', new ItemStack(TechBlocks.growth_upgrade), 'b', new ItemStack(Blocks.DRAGON_EGG)});
		}
		
		// Cobblegens
		if (ConfigHandler.Cobblegen){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.cobblegen_block), "ccc", "wgl", "ccc", 'c', "cobblestone", 'g', "blockGlass", 'w', new ItemStack(Items.WATER_BUCKET), 'l', new ItemStack(Items.LAVA_BUCKET)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.cobblegen_block), "ccc", "lgw", "ccc", 'c', "cobblestone", 'g', "blockGlass", 'w', new ItemStack(Items.WATER_BUCKET), 'l', new ItemStack(Items.LAVA_BUCKET)));
		}
		if (ConfigHandler.IronCobblegen){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.iron_cobblegen_block), "iii", "igi", "iii", 'i', "ingotIron", 'g', new ItemStack(TechBlocks.cobblegen_block)));
		}
		if (ConfigHandler.DiamondCobblegen){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.diamond_cobblegen_block), "ddd", "dgd", "ddd", 'd', "gemDiamond", 'g', new ItemStack(TechBlocks.iron_cobblegen_block)));
		}
		if (ConfigHandler.BlazeCobblegen){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.blaze_cobblegen_block), new Object[] {"bbb", "bgb", "bbb", 'b', new ItemStack(Items.BLAZE_ROD), 'g', new ItemStack(TechBlocks.diamond_cobblegen_block)});
		}
		if (ConfigHandler.EmeraldCobblegen){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.emerald_cobblegen_block), "eee", "ebe", "eee", 'e', "gemEmerald", 'b', new ItemStack(TechBlocks.blaze_cobblegen_block)));
		}
		
		// Juices
		if (ConfigHandler.Juicer){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.stone_juicer), new Object[] {"P", "S", 'S', new ItemStack(Blocks.STONE), 'P', new ItemStack(Blocks.STONE_PRESSURE_PLATE)});
			GameRegistry.addShapelessRecipe(new ItemStack(TechFoods.apple_juice), new Object[] {new ItemStack(Items.APPLE), new ItemStack(TechItems.stone_juicer)});
			GameRegistry.addShapelessRecipe(new ItemStack(TechFoods.carrot_juice), new Object[] {new ItemStack(Items.CARROT), new ItemStack(TechItems.stone_juicer)});
			GameRegistry.addShapelessRecipe(new ItemStack(TechFoods.cactus_juice), new Object[] {new ItemStack(Blocks.CACTUS), new ItemStack(TechItems.stone_juicer)});
			GameRegistry.addShapelessRecipe(new ItemStack(TechFoods.slim_juice), new Object[] {new ItemStack(Items.SLIME_BALL), new ItemStack(TechItems.stone_juicer)});
			GameRegistry.addShapelessRecipe(new ItemStack(TechFoods.watermelon_juice), new Object[] {new ItemStack(Items.MELON), new ItemStack(TechItems.stone_juicer)});
			GameRegistry.addShapelessRecipe(new ItemStack(TechFoods.beet_juice), new Object[] {new ItemStack(Items.BEETROOT), new ItemStack(TechItems.stone_juicer)});
		}
		
		// Bacon
		if (ConfigHandler.CookedBacon){
			GameRegistry.addShapelessRecipe(new ItemStack(TechFoods.raw_bacon), new Object[]{new ItemStack(Items.BEEF), new ItemStack(TechItems.flint_knife)});
			GameRegistry.addShapelessRecipe(new ItemStack(TechFoods.cooked_bacon), new Object[]{new ItemStack(Items.COOKED_BEEF), new ItemStack(TechItems.flint_knife)});
			GameRegistry.addSmelting(TechFoods.raw_bacon, new ItemStack(TechFoods.cooked_bacon), 1.0F);
		}
		
		// Reeds
		if (ConfigHandler.BrokenReed){
			GameRegistry.addShapelessRecipe(new ItemStack(Items.REEDS), new Object[] {new ItemStack(TechItems.old_reed), new ItemStack(TechItems.old_reed)});
		}
		
		// Gems
		if (ConfigHandler.AmethystOre){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.amethyst_block), "sss","sss", "sss", 's', "gemAmethyst"));
		}
		if (ConfigHandler.SapphireOre){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.sapphire_block), "sss","sss", "sss", 's', "gemSapphire"));
		}
		if (ConfigHandler.RubyOre){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.ruby_block), "sss","sss", "sss", 's', "gemRuby"));
		}
		
		// Glowstone
		if (ConfigHandler.ColorGlowstone){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.black_dust, 4), "bgb","g g", "bgb", 'g', "dustGlowstone", 'b', new ItemStack(Items.DYE, 1, 0)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.blue_dust, 4), "bgb","g g", "bgb", 'g', "dustGlowstone", 'b', new ItemStack(Items.DYE, 1, 4)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.brown_dust, 4), "bgb","g g", "bgb", 'g', "dustGlowstone", 'b', new ItemStack(Items.DYE, 1, 3)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.cyan_dust, 4), "cgc","g g", "cgc", 'g', "dustGlowstone", 'c', new ItemStack(Items.DYE, 1, 6)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.gray_dust, 4), "rgr","g g", "rgr", 'g', "dustGlowstone", 'r', new ItemStack(Items.DYE, 1, 8)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.green_dust, 4), "ege","g g", "ege", 'g', "dustGlowstone", 'e', new ItemStack(Items.DYE, 1, 2)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.lightblue_dust, 4), "lgl","g g", "lgl", 'g', "dustGlowstone", 'l', new ItemStack(Items.DYE, 1, 12)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.lime_dust, 4), "lgl","g g", "lgl", 'g', "dustGlowstone", 'l', new ItemStack(Items.DYE, 1, 10)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.magenta_dust, 4), "mgm","g g", "mgm", 'g', "dustGlowstone", 'm', new ItemStack(Items.DYE, 1, 13)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.orange_dust, 4), "ogo","g g", "ogo", 'g', "dustGlowstone", 'o', new ItemStack(Items.DYE, 1, 14)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.pink_dust, 4), "pgp","g g", "pgp", 'g', "dustGlowstone", 'p', new ItemStack(Items.DYE, 1, 9)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.purple_dust, 4), "pgp","g g", "pgp", 'g', "dustGlowstone", 'p', new ItemStack(Items.DYE, 1, 5)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.red_dust, 4), "rgr","g g", "rgr", 'g', "dustGlowstone", 'r', new ItemStack(Items.DYE, 1, 1)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.silver_dust, 4), "sgs","g g", "sgs", 'g', "dustGlowstone", 's', new ItemStack(Items.DYE, 1, 7)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.white_dust, 4), "wgw","g g", "wgw", 'g', "dustGlowstone", 'w', new ItemStack(Items.DYE, 1, 15)));
			
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.black_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.black_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.blue_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.blue_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.brown_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.brown_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.cyan_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.cyan_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.gray_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.gray_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.green_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.green_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.lightblue_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.lightblue_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.lime_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.lime_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.magenta_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.magenta_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.orange_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.orange_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.pink_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.pink_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.purple_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.purple_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.red_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.red_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.silver_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.silver_dust)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.white_glowstone), new Object[] {"aa", "aa", 'a', new ItemStack(TechItems.white_dust)});
		}
		
		if (ConfigHandler.CryingObsidian){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.crying_obsidian, 4), new Object[] {"lol", "olo", "lol", 'l', new ItemStack(Items.DYE, 1, 15), 'o', new ItemStack(Blocks.OBSIDIAN)});
		}
		
		// Lamps
		if (ConfigHandler.ColorLamps){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.base_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.GLASS), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.black_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 15), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.blue_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 11), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.brown_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 12), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.cyan_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 9), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.gray_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 7), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.green_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 13), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.lightblue_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 3), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.lime_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 5), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.magenta_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 2), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.orange_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 1), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.pink_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 6), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.purple_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 10), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.red_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 14), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.silver_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 8), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.white_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 0), 't', new ItemStack(Blocks.TORCH)});
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.yellow_lamp), new Object[] {"g", "t", 'g', new ItemStack(Blocks.STAINED_GLASS, 1, 4), 't', new ItemStack(Blocks.TORCH)});
		}
		
		if (ConfigHandler.water_source){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.water_source), new Object[] {"ggg", "t t", "ggg", 'g', new ItemStack(Blocks.STONE, 1, 0), 't', new ItemStack(Items.WATER_BUCKET)});
		}
		
		
		
	}

}
