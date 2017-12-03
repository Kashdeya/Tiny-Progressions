package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.registry.recipes.ShapedRecipe;
import com.kashdeya.tinyprogressions.registry.recipes.ShapelessRecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class ArmorRecipes {
	
	public static IRecipe CHAINMAIL_HELMET, CHAINMAIL_CHESTPLATE, CHAINMAIL_LEGGINGS, CHAINMAIL_BOOTS;
	public static IRecipe STONE_HELMET, STONE_CHESTPLATE, STONE_LEGGINGS, STONE_BOOTS;
	public static IRecipe OBSIDIAN_HELMET, OBSIDIAN_CHESTPLATE, OBSIDIAN_LEGGINGS, OBSIDIAN_BOOTS;
	public static IRecipe FLINT_HELMET, FLINT_CHESTPLATE, FLINT_LEGGINGS, FLINT_BOOTS;
	public static IRecipe BONE_HELMET, BONE_CHESTPLATE, BONE_LEGGINGS, BONE_BOOTS;
	public static IRecipe WOODEN_HELMET, WOODEN_CHESTPLATE, WOODEN_LEGGINGS, WOODEN_BOOTS;
	public static IRecipe WOODEN2_HELMET, WOODEN2_CHESTPLATE, WOODEN2_LEGGINGS, WOODEN2_BOOTS;
	public static IRecipe LAVA_HELMET, LAVA_CHESTPLATE, LAVA_LEGGINGS, LAVA_BOOTS;
	public static IRecipe WITHER_HELMET, WITHER_CHESTPLATE, WITHER_LEGGINGS, WITHER_BOOTS;
	public static IRecipe DRAGON_HELMET, DRAGON_CHESTPLATE, DRAGON_LEGGINGS, DRAGON_BOOTS;
	public static IRecipe LAPIS_INGOT, LAPIS_HELMET, LAPIS_CHESTPLATE, LAPIS_LEGGINGS, LAPIS_BOOTS;
	public static IRecipe REDSTONE_INGOT, REDSTONE_HELMET, REDSTONE_CHESTPLATE, REDSTONE_LEGGINGS, REDSTONE_BOOTS;
	public static IRecipe QUARTZ_INGOT, QUARTZ_HELMET, QUARTZ_CHESTPLATE, QUARTZ_LEGGINGS, QUARTZ_BOOTS;
	public static IRecipe EMERALD_HELMET, EMERALD_CHESTPLATE, EMERALD_LEGGINGS, EMERALD_BOOTS;
	public static IRecipe BAM_TSHIRT;
	
	public static void init() {
		if (ArmorHandler.chain_armor){
			CHAINMAIL_HELMET = new ShapedRecipe(new ItemStack(Items.CHAINMAIL_HELMET), new Object[] {
					"sss",
					"s s",
						Character.valueOf('s'), "chainmail"
			});
			
			CHAINMAIL_CHESTPLATE = new ShapedRecipe(new ItemStack(Items.CHAINMAIL_CHESTPLATE), new Object[] {
					"s s",
					"sss",
					"sss",
						Character.valueOf('s'), "chainmail"
			});
			
			CHAINMAIL_LEGGINGS = new ShapedRecipe(new ItemStack(Items.CHAINMAIL_LEGGINGS), new Object[] {
					"sss",
					"s s",
					"s s",
						Character.valueOf('s'), "chainmail"
			});
			
			CHAINMAIL_BOOTS = new ShapedRecipe(new ItemStack(Items.CHAINMAIL_BOOTS), new Object[] {
					"s s",
					"s s",
						Character.valueOf('s'), "chainmail"
			});
		}
		
		if (ArmorHandler.bam_tshirt){
			BAM_TSHIRT = new ShapelessRecipe(new ItemStack(TechArmor.bam_tshirt), new Object[] {
					TechArmor.emerald_chestplate
			});
		}
		
		if (ArmorHandler.StoneArmor){
			STONE_HELMET = new ShapedRecipe(new ItemStack(TechArmor.stone_helmet), new Object[] {
					"sss",
					"s s",
						Character.valueOf('s'), "cobblestone"
			});
			
			STONE_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.stone_chestplate), new Object[] {
					"s s",
					"sss",
					"sss",
						Character.valueOf('s'), "cobblestone"
			});
			
			STONE_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.stone_leggings), new Object[] {
					"sss",
					"s s",
					"s s",
						Character.valueOf('s'), "cobblestone"
			});
			
			STONE_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.stone_boots), new Object[] {
					"s s",
					"s s",
						Character.valueOf('s'), "cobblestone"
			});
		}
		
		if (ArmorHandler.obsidian_armor){
			OBSIDIAN_HELMET = new ShapedRecipe(new ItemStack(TechArmor.obsidian_helmet), new Object[] {
					"sss",
					"s s",
						Character.valueOf('s'), "obsidian"
			});
			
			OBSIDIAN_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.obsidian_chestplate), new Object[] {
					"s s",
					"sss",
					"sss",
						Character.valueOf('s'), "obsidian"
			});
			
			OBSIDIAN_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.obsidian_leggings), new Object[] {
					"sss",
					"s s",
					"s s",
						Character.valueOf('s'), "obsidian"
			});
			
			OBSIDIAN_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.obsidian_boots), new Object[] {
					"s s",
					"s s",
						Character.valueOf('s'), "obsidian"
			});
		}
		
		if (ArmorHandler.FlintArmor){
			FLINT_HELMET = new ShapedRecipe(new ItemStack(TechArmor.flint_helmet), new Object[] {
					"fff",
					"f f",
						Character.valueOf('f'), "flint"
			});
			
			FLINT_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.flint_chestplate), new Object[] {
					"f f",
					"fff",
					"fff",
						Character.valueOf('f'), "flint"
			});
			
			FLINT_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.flint_leggings), new Object[] {
					"fff",
					"f f",
					"f f",
						Character.valueOf('f'), "flint"
			});
			
			FLINT_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.flint_boots), new Object[] {
					"f f",
					"f f",
						Character.valueOf('f'), "flint"
			});
		}
		
		if (ArmorHandler.BoneArmor){
			BONE_HELMET = new ShapedRecipe(new ItemStack(TechArmor.bone_helmet), new Object[] {
					"bbb",
					"b b",
						Character.valueOf('b'), "bone"
			});
			
			BONE_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.bone_chestplate), new Object[] {
					"b b",
					"bbb",
					"bbb",
						Character.valueOf('b'), "bone"
			});
			
			BONE_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.bone_leggings), new Object[] {
					"bbb",
					"b b",
					"b b",
						Character.valueOf('b'), "bone"
			});
			
			BONE_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.bone_boots), new Object[] {
					"b b",
					"b b",
						Character.valueOf('b'), "bone"
			});
		}
		
		if (ArmorHandler.WoodArmor){
			WOODEN_HELMET = new ShapedRecipe(new ItemStack(TechArmor.wooden_helmet), new Object[] {
					"lll",
					"l l",
						Character.valueOf('l'), Blocks.LOG
			});
			
			WOODEN_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.wooden_chestplate), new Object[] {
					"l l",
					"lll",
					"lll",
						Character.valueOf('l'), Blocks.LOG
			});
			
			WOODEN_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.wooden_leggings), new Object[] {
					"lll",
					"l l",
					"l l",
						Character.valueOf('l'), Blocks.LOG
			});
			
			WOODEN_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.wooden_boots), new Object[] {
					"l l",
					"l l",
						Character.valueOf('l'), Blocks.LOG
			});
			WOODEN2_HELMET = new ShapedRecipe(new ItemStack(TechArmor.wooden_helmet), new Object[] {
					"lll",
					"l l",
						Character.valueOf('l'), Blocks.LOG2
			});
			
			WOODEN2_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.wooden_chestplate), new Object[] {
					"l l",
					"lll",
					"lll",
						Character.valueOf('l'), Blocks.LOG2
			});
			
			WOODEN2_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.wooden_leggings), new Object[] {
					"lll",
					"l l",
					"l l",
						Character.valueOf('l'), Blocks.LOG2
			});
			
			WOODEN2_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.wooden_boots), new Object[] {
					"l l",
					"l l",
						Character.valueOf('l'), Blocks.LOG2
			});
		}
		
		if (ArmorHandler.lava_armor){
			LAVA_HELMET = new ShapedRecipe(new ItemStack(TechArmor.lava_helmet), new Object[] {
					"lll",
					"l l",
						Character.valueOf('l'), TechItems.lava_crystal
			});
			
			LAVA_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.lava_chestplate), new Object[] {
					"l l",
					"lll",
					"lll",
						Character.valueOf('l'), TechItems.lava_crystal
			});
			
			LAVA_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.lava_leggings), new Object[] {
					"lll",
					"l l",
					"l l",
						Character.valueOf('l'), TechItems.lava_crystal
			});
			
			LAVA_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.lava_boots), new Object[] {
					"l l",
					"l l",
						Character.valueOf('l'), TechItems.lava_crystal
			});
		}
		
		if (ArmorHandler.wither_armor){
			WITHER_HELMET = new ShapedRecipe(new ItemStack(TechArmor.wither_helmet), new Object[] {
					"www",
					"w w",
						Character.valueOf('w'), TechItems.wither_rib
			});
			
			WITHER_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.wither_chestplate), new Object[] {
					"w w",
					"www",
					"www",
						Character.valueOf('w'), TechItems.wither_rib
			});
			
			WITHER_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.wither_leggings), new Object[] {
					"www",
					"w w",
					"w w",
						Character.valueOf('w'), TechItems.wither_rib
			});
			
			WITHER_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.wither_boots), new Object[] {
					"w w",
					"w w",
						Character.valueOf('w'), TechItems.wither_rib
			});
		}
		
		if (ArmorHandler.dragon_armor){
			DRAGON_HELMET = new ShapedRecipe(new ItemStack(TechArmor.dragon_helmet), new Object[] {
					"ddd",
					"d d",
						Character.valueOf('d'), TechItems.dragon_scale
			});
			
			DRAGON_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.dragon_chestplate), new Object[] {
					"d d",
					"ddd",
					"ddd",
						Character.valueOf('d'), TechItems.dragon_scale
			});
			
			DRAGON_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.dragon_leggings), new Object[] {
					"ddd",
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.dragon_scale
			});
			
		   	DRAGON_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.dragon_boots), new Object[] {
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.dragon_scale
			});
		}
		
		if (ArmorHandler.lapis_armor){
			LAPIS_INGOT = new ShapedRecipe(new ItemStack(TechItems.lapis_ingot), new Object[] {
					"ddd",
					"ddd",
						Character.valueOf('d'), new ItemStack(Items.DYE, 1, 4)
			});
			LAPIS_HELMET = new ShapedRecipe(new ItemStack(TechArmor.lapis_helmet), new Object[] {
					"ddd",
					"d d",
						Character.valueOf('d'), TechItems.lapis_ingot
			});
			
			LAPIS_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.lapis_chestplate), new Object[] {
					"d d",
					"ddd",
					"ddd",
						Character.valueOf('d'), TechItems.lapis_ingot
			});
			
			LAPIS_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.lapis_leggings), new Object[] {
					"ddd",
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.lapis_ingot
			});
			
		   	LAPIS_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.lapis_boots), new Object[] {
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.lapis_ingot
			});
		}
		
		if (ArmorHandler.redstone_armor){
			REDSTONE_INGOT = new ShapedRecipe(new ItemStack(TechItems.redstone_ingot), new Object[] {
					"ddd",
					"ddd",
						Character.valueOf('d'), Items.REDSTONE
			});
			REDSTONE_HELMET = new ShapedRecipe(new ItemStack(TechArmor.redstone_helmet), new Object[] {
					"ddd",
					"d d",
						Character.valueOf('d'), TechItems.redstone_ingot
			});
			
			REDSTONE_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.redstone_chestplate), new Object[] {
					"d d",
					"ddd",
					"ddd",
						Character.valueOf('d'), TechItems.redstone_ingot
			});
			
			REDSTONE_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.redstone_leggings), new Object[] {
					"ddd",
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.redstone_ingot
			});
			
		   	REDSTONE_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.redstone_boots), new Object[] {
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.redstone_ingot
			});
		}
		
		if (ArmorHandler.quartz_armor){
			QUARTZ_INGOT = new ShapedRecipe(new ItemStack(TechItems.quartz_ingot), new Object[] {
					"ddd",
					"ddd",
						Character.valueOf('d'), Items.QUARTZ
			});
			QUARTZ_HELMET = new ShapedRecipe(new ItemStack(TechArmor.quartz_helmet), new Object[] {
					"ddd",
					"d d",
						Character.valueOf('d'), TechItems.quartz_ingot
			});
			
			QUARTZ_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.quartz_chestplate), new Object[] {
					"d d",
					"ddd",
					"ddd",
						Character.valueOf('d'), TechItems.quartz_ingot
			});
			
			QUARTZ_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.quartz_leggings), new Object[] {
					"ddd",
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.quartz_ingot
			});
			
		   	QUARTZ_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.quartz_boots), new Object[] {
					"d d",
					"d d",
						Character.valueOf('d'), TechItems.quartz_ingot
			});
		}
		
		if (ArmorHandler.emerald_amor){
			EMERALD_HELMET = new ShapedRecipe(new ItemStack(TechArmor.emerald_helmet), new Object[] {
					"ddd",
					"d d",
						Character.valueOf('d'), Items.EMERALD
			});
			
			EMERALD_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.emerald_chestplate), new Object[] {
					"d d",
					"ddd",
					"ddd",
						Character.valueOf('d'), Items.EMERALD
			});
			
			EMERALD_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.emerald_leggings), new Object[] {
					"ddd",
					"d d",
					"d d",
						Character.valueOf('d'), Items.EMERALD
			});
			
		    EMERALD_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.emerald_boots), new Object[] {
					"d d",
					"d d",
						Character.valueOf('d'), Items.EMERALD
			});
		}
	}

}
