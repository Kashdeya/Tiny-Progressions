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
			CHAINMAIL_HELMET = new ShapedRecipe(new ItemStack(Items.CHAINMAIL_HELMET),
				"sss",
				"s s",
				's', "chainmail");
			
			CHAINMAIL_CHESTPLATE = new ShapedRecipe(new ItemStack(Items.CHAINMAIL_CHESTPLATE),
				"s s",
				"sss",
				"sss",
				's', "chainmail");
			
			CHAINMAIL_LEGGINGS = new ShapedRecipe(new ItemStack(Items.CHAINMAIL_LEGGINGS),
				"sss",
				"s s",
				"s s",
				's', "chainmail");
			
			CHAINMAIL_BOOTS = new ShapedRecipe(new ItemStack(Items.CHAINMAIL_BOOTS),
				"s s",
				"s s",
				's', "chainmail");
		}
		
		if (ArmorHandler.bam_tshirt){
			BAM_TSHIRT = new ShapelessRecipe(new ItemStack(TechArmor.bam_tshirt), TechArmor.emerald_chestplate);
		}
		
		if (ArmorHandler.StoneArmor){
			STONE_HELMET = new ShapedRecipe(new ItemStack(TechArmor.stone_helmet),
				"sss",
				"s s",
				's', "cobblestone");
			
			STONE_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.stone_chestplate),
				"s s",
				"sss",
				"sss",
				's', "cobblestone");

			STONE_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.stone_leggings),
				"sss",
				"s s",
				"s s",
				's', "cobblestone");
			
			STONE_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.stone_boots),
				"s s",
				"s s",
				's', "cobblestone");
		}
		
		if (ArmorHandler.obsidian_armor){
			OBSIDIAN_HELMET = new ShapedRecipe(new ItemStack(TechArmor.obsidian_helmet),
				"sss",
				"s s",
				's', "obsidian");
			
			OBSIDIAN_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.obsidian_chestplate),
				"s s",
				"sss",
				"sss",
				's', "obsidian");
			
			OBSIDIAN_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.obsidian_leggings),
				"sss",
				"s s",
				"s s",
				's', "obsidian");
			
			OBSIDIAN_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.obsidian_boots),
				"s s",
				"s s",
				's', "obsidian");
		}
		
		if (ArmorHandler.FlintArmor){
			FLINT_HELMET = new ShapedRecipe(new ItemStack(TechArmor.flint_helmet),
				"fff",
				"f f",
				'f', "flint");
			
			FLINT_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.flint_chestplate),
				"f f",
				"fff",
				"fff",
				'f', "flint");
			
			FLINT_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.flint_leggings),
				"fff",
				"f f",
				"f f",
				'f', "flint");
			
			FLINT_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.flint_boots),
				"f f",
				"f f",
				'f', "flint");
		}
		
		if (ArmorHandler.BoneArmor){
			BONE_HELMET = new ShapedRecipe(new ItemStack(TechArmor.bone_helmet),
				"bbb",
				"b b",
				'b', "bone");

			BONE_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.bone_chestplate),
				"b b",
				"bbb",
				"bbb",
				'b', "bone");
			
			BONE_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.bone_leggings),
				"bbb",
				"b b",
				"b b",
				'b', "bone");
			
			BONE_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.bone_boots),
				"b b",
				"b b",
				'b', "bone");
		}
		
		if (ArmorHandler.WoodArmor){
			WOODEN_HELMET = new ShapedRecipe(new ItemStack(TechArmor.wooden_helmet),
				"lll",
				"l l",
				'l', Blocks.LOG);
			
			WOODEN_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.wooden_chestplate),
				"l l",
				"lll",
				"lll",
				'l', Blocks.LOG);
			
			WOODEN_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.wooden_leggings),
				"lll",
				"l l",
				"l l",
				'l', Blocks.LOG);
			
			WOODEN_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.wooden_boots),
				"l l",
				"l l",
				'l', Blocks.LOG);
			WOODEN2_HELMET = new ShapedRecipe(new ItemStack(TechArmor.wooden_helmet),
				"lll",
				"l l",
				'l', Blocks.LOG2);
			
			WOODEN2_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.wooden_chestplate),
				"l l",
				"lll",
				"lll",
				'l', Blocks.LOG2);
			
			WOODEN2_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.wooden_leggings),
				"lll",
				"l l",
				"l l",
				'l', Blocks.LOG2);
			
			WOODEN2_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.wooden_boots),
				"l l",
				"l l",
				'l', Blocks.LOG2);
		}
		
		if (ArmorHandler.lava_armor){
			LAVA_HELMET = new ShapedRecipe(new ItemStack(TechArmor.lava_helmet),
				"bbb",
				"cdc",
				'b', Blocks.MAGMA,
				'c', Items.MAGMA_CREAM,
				'd', TechArmor.emerald_helmet);
			
			LAVA_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.lava_chestplate),
				"b b",
				"cdc",
				"bbb",
				'b', Blocks.MAGMA,
				'c', Items.MAGMA_CREAM,
				'd', TechArmor.emerald_chestplate);
			
			LAVA_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.lava_leggings),
				"bdb",
				"c c",
				"b b",
				'b', Blocks.MAGMA,
				'c', Items.MAGMA_CREAM,
				'd', TechArmor.emerald_leggings);
			
			LAVA_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.lava_boots),
				"bdb",
				"c c",
				'b', Blocks.MAGMA,
				'c', Items.MAGMA_CREAM,
				'd', TechArmor.emerald_boots);
		}
		
		if (ArmorHandler.wither_armor){
			WITHER_HELMET = new ShapedRecipe(new ItemStack(TechArmor.wither_helmet),
				"www",
				"w w",
				'w', TechItems.wither_rib);
			
			WITHER_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.wither_chestplate),
				"w w",
				"www",
				"www",
				'w', TechItems.wither_rib);
			
			WITHER_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.wither_leggings),
				"www",
				"w w",
				"w w",
				'w', TechItems.wither_rib);
			
			WITHER_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.wither_boots),
				"w w",
				"w w",
				'w', TechItems.wither_rib);
		}
		
		if (ArmorHandler.dragon_armor){
			DRAGON_HELMET = new ShapedRecipe(new ItemStack(TechArmor.dragon_helmet),
				"ddd",
				"d d",
				'd', TechItems.dragon_scale);
			
			DRAGON_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.dragon_chestplate),
				"d d",
				"ddd",
				"ddd",
				'd', TechItems.dragon_scale);
			
			DRAGON_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.dragon_leggings),
				"ddd",
				"d d",
				"d d",
				'd', TechItems.dragon_scale);
			
		   	DRAGON_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.dragon_boots),
				"d d",
				"d d",
				'd', TechItems.dragon_scale);
		}
		
		if (ArmorHandler.lapis_armor){
			LAPIS_INGOT = new ShapedRecipe(new ItemStack(TechItems.lapis_ingot),
				"ddd",
				"ddd",
				'd', new ItemStack(Items.DYE, 1, 4));
			LAPIS_HELMET = new ShapedRecipe(new ItemStack(TechArmor.lapis_helmet),
				"ddd",
				"d d",
				'd', TechItems.lapis_ingot);
			
			LAPIS_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.lapis_chestplate),
				"d d",
				"ddd",
				"ddd",
				'd', TechItems.lapis_ingot);
			
			LAPIS_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.lapis_leggings),
				"ddd",
				"d d",
				"d d",
				'd', TechItems.lapis_ingot);
			
		   	LAPIS_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.lapis_boots),
				"d d",
				"d d",
				'd', TechItems.lapis_ingot);
		}
		
		if (ArmorHandler.redstone_armor){
			REDSTONE_INGOT = new ShapedRecipe(new ItemStack(TechItems.redstone_ingot),
				"ddd",
				"ddd",
				'd', Items.REDSTONE);
			REDSTONE_HELMET = new ShapedRecipe(new ItemStack(TechArmor.redstone_helmet),
				"ddd",
				"d d",
				'd', TechItems.redstone_ingot);
			
			REDSTONE_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.redstone_chestplate),
				"d d",
				"ddd",
				"ddd",
				'd', TechItems.redstone_ingot);
			
			REDSTONE_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.redstone_leggings),
				"ddd",
				"d d",
				"d d",
				'd', TechItems.redstone_ingot);
			
		   	REDSTONE_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.redstone_boots),
				"d d",
				"d d",
				'd', TechItems.redstone_ingot);
		}
		
		if (ArmorHandler.quartz_armor){
			QUARTZ_INGOT = new ShapedRecipe(new ItemStack(TechItems.quartz_ingot),
				"ddd",
				"ddd",
				'd', Items.QUARTZ);
			QUARTZ_HELMET = new ShapedRecipe(new ItemStack(TechArmor.quartz_helmet),
				"ddd",
				"d d",
				'd', TechItems.quartz_ingot);

			QUARTZ_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.quartz_chestplate),
				"d d",
				"ddd",
				"ddd",
				'd', TechItems.quartz_ingot);

			QUARTZ_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.quartz_leggings),
				"ddd",
				"d d",
				"d d",
				'd', TechItems.quartz_ingot);
			
		   	QUARTZ_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.quartz_boots),
				"d d",
				"d d",
				'd', TechItems.quartz_ingot);
		}
		
		if (ArmorHandler.emerald_amor){
			EMERALD_HELMET = new ShapedRecipe(new ItemStack(TechArmor.emerald_helmet),
				"ddd",
				"d d",
				'd', Items.EMERALD);
			
			EMERALD_CHESTPLATE = new ShapedRecipe(new ItemStack(TechArmor.emerald_chestplate),
				"d d",
				"ddd",
				"ddd",
				'd', Items.EMERALD);
			
			EMERALD_LEGGINGS = new ShapedRecipe(new ItemStack(TechArmor.emerald_leggings),
				"ddd",
				"d d",
				"d d",
				'd', Items.EMERALD);
			
		    EMERALD_BOOTS = new ShapedRecipe(new ItemStack(TechArmor.emerald_boots),
				"d d",
				"d d",
				'd', Items.EMERALD);
		}
	}

}
