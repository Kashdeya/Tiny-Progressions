package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ArmorRecipes {
	
	
	public static void init() {

			exportJson.addShapedRecipe(new ItemStack(Items.CHAINMAIL_HELMET),
				"sss",
				"s s",
				's', "forge:chainmail");
			
			exportJson.addShapedRecipe(new ItemStack(Items.CHAINMAIL_CHESTPLATE),
				"s s",
				"sss",
				"sss",
				's', "forge:chainmail");
			
			exportJson.addShapedRecipe(new ItemStack(Items.CHAINMAIL_LEGGINGS),
				"sss",
				"s s",
				"s s",
				's', "forge:chainmail");
			
			exportJson.addShapedRecipe(new ItemStack(Items.CHAINMAIL_BOOTS),
				"s s",
				"s s",
				's', "forge:chainmail");
		

			exportJson.addShapedRecipe(new ItemStack(TechArmor.stone_helmet.get()),
				"sss",
				"s s",
				's', "forge:cobblestone");
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.stone_chestplate.get()),
				"s s",
				"sss",
				"sss",
				's', "forge:cobblestone");

			exportJson.addShapedRecipe(new ItemStack(TechArmor.stone_leggings.get()),
				"sss",
				"s s",
				"s s",
				's', "forge:cobblestone");
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.stone_boots.get()),
				"s s",
				"s s",
				's', "forge:cobblestone");
		
		
		
			exportJson.addShapedRecipe(new ItemStack(TechArmor.obsidian_helmet.get()),
				"sss",
				"s s",
				's', "forge:obsidian");
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.obsidian_chestplate.get()),
				"s s",
				"sss",
				"sss",
				's', "forge:obsidian");
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.obsidian_leggings.get()),
				"sss",
				"s s",
				"s s",
				's', "forge:obsidian");
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.obsidian_boots.get()),
				"s s",
				"s s",
				's', "forge:obsidian");
		
		
		
			exportJson.addShapedRecipe(new ItemStack(TechArmor.flint_helmet.get()),
				"fff",
				"f f",
				'f', Items.FLINT);
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.flint_chestplate.get()),
				"f f",
				"fff",
				"fff",
				'f', Items.FLINT);
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.flint_leggings.get()),
				"fff",
				"f f",
				"f f",
				'f', Items.FLINT);
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.flint_boots.get()),
				"f f",
				"f f",
				'f', Items.FLINT);
		
		
		
		exportJson.addShapedRecipe(new ItemStack(TechArmor.bone_helmet.get()),
				"bbb",
				"b b",
				'b', "forge:bones");

		exportJson.addShapedRecipe(new ItemStack(TechArmor.bone_chestplate.get()),
				"b b",
				"bbb",
				"bbb",
				'b', "forge:bones");
			
		exportJson.addShapedRecipe(new ItemStack(TechArmor.bone_leggings.get()),
				"bbb",
				"b b",
				"b b",
				'b', "forge:bones");
			
		exportJson.addShapedRecipe(new ItemStack(TechArmor.bone_boots.get()),
				"b b",
				"b b",
				'b', "forge:bones");
		
		
		
		exportJson.addShapedRecipe(new ItemStack(TechArmor.wooden_helmet.get()),
				"lll",
				"l l",
				'l', "minecraft:planks");
			
		exportJson.addShapedRecipe(new ItemStack(TechArmor.wooden_chestplate.get()),
				"l l",
				"lll",
				"lll",
				'l',  "minecraft:planks");
			
		exportJson.addShapedRecipe(new ItemStack(TechArmor.wooden_leggings.get()),
				"lll",
				"l l",
				"l l",
				'l',  "minecraft:planks");
			
		exportJson.addShapedRecipe(new ItemStack(TechArmor.wooden_boots.get()),
				"l l",
				"l l",
				'l',  "minecraft:planks");
		
		
		exportJson.addShapedRecipe(new ItemStack(TechArmor.lava_helmet.get()),
				"bbb",
				"cdc",
				'b', new ItemStack(Blocks.MAGMA_BLOCK),
				'c', new ItemStack(Items.MAGMA_CREAM),
				'd', new ItemStack(TechArmor.emerald_helmet.get()));
			
		exportJson.addShapedRecipe(new ItemStack(TechArmor.lava_chestplate.get()),
				"b b",
				"cdc",
				"bbb",
				'b', new ItemStack(Blocks.MAGMA_BLOCK),
				'c', new ItemStack(Items.MAGMA_CREAM),
				'd', new ItemStack(TechArmor.emerald_chestplate.get()));
			
		exportJson.addShapedRecipe(new ItemStack(TechArmor.lava_leggings.get()),
				"bdb",
				"c c",
				"b b",
				'b', new ItemStack(Blocks.MAGMA_BLOCK),
				'c', new ItemStack(Items.MAGMA_CREAM),
				'd', new ItemStack(TechArmor.emerald_leggings.get()));
			
		exportJson.addShapedRecipe(new ItemStack(TechArmor.lava_boots.get()),
				"bdb",
				"c c",
				'b', new ItemStack(Blocks.MAGMA_BLOCK),
				'c', new ItemStack(Items.MAGMA_CREAM),
				'd', new ItemStack(TechArmor.emerald_boots.get()));
		
		
		
		exportJson.addShapedRecipe(new ItemStack(TechArmor.wither_helmet.get()),
				"www",
				"w w",
				'w', new ItemStack(TechItems.wither_rib.get()));
			
		exportJson.addShapedRecipe(new ItemStack(TechArmor.wither_chestplate.get()),
				"w w",
				"www",
				"www",
				'w', new ItemStack(TechItems.wither_rib.get()));
			
		exportJson.addShapedRecipe(new ItemStack(TechArmor.wither_leggings.get()),
				"www",
				"w w",
				"w w",
				'w', new ItemStack(TechItems.wither_rib.get()));
			
		exportJson.addShapedRecipe(new ItemStack(TechArmor.wither_boots.get()),
				"w w",
				"w w",
				'w', new ItemStack(TechItems.wither_rib.get()));
		
		
		
			exportJson.addShapedRecipe(new ItemStack(TechArmor.dragon_helmet.get()),
				"ddd",
				"d d",
				'd', new ItemStack(TechItems.dragon_scale.get()));
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.dragon_chestplate.get()),
				"d d",
				"ddd",
				"ddd",
				'd', new ItemStack(TechItems.dragon_scale.get()));
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.dragon_leggings.get()),
				"ddd",
				"d d",
				"d d",
				'd', new ItemStack(TechItems.dragon_scale.get()));
			
		   	exportJson.addShapedRecipe(new ItemStack(TechArmor.dragon_boots.get()),
				"d d",
				"d d",
				'd', new ItemStack(TechItems.dragon_scale.get()));
		
		exportJson.addShapedRecipe(new ItemStack(TechItems.lapis_ingot.get()),
				"ddd",
				"ddd",
				'd', new ItemStack(Items.LAPIS_LAZULI));
			exportJson.addShapedRecipe(new ItemStack(TechArmor.lapis_helmet.get()),
				"ddd",
				"d d",
				'd', new ItemStack(TechItems.lapis_ingot.get()));
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.lapis_chestplate.get()),
				"d d",
				"ddd",
				"ddd",
				'd', new ItemStack(TechItems.lapis_ingot.get()));
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.lapis_leggings.get()),
				"ddd",
				"d d",
				"d d",
				'd', new ItemStack(TechItems.lapis_ingot.get()));
			
		   	exportJson.addShapedRecipe(new ItemStack(TechArmor.lapis_boots.get()),
				"d d",
				"d d",
				'd', new ItemStack(TechItems.lapis_ingot.get()));
		
		
		
			exportJson.addShapedRecipe(new ItemStack(TechItems.redstone_ingot.get()),
				"ddd",
				"ddd",
				'd', new ItemStack(Items.REDSTONE));
			exportJson.addShapedRecipe(new ItemStack(TechArmor.redstone_helmet.get()),
				"ddd",
				"d d",
				'd', new ItemStack(TechItems.redstone_ingot.get()));
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.redstone_chestplate.get()),
				"d d",
				"ddd",
				"ddd",
				'd', new ItemStack(TechItems.redstone_ingot.get()));
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.redstone_leggings.get()),
				"ddd",
				"d d",
				"d d",
				'd', new ItemStack(TechItems.redstone_ingot.get()));
			
		   	exportJson.addShapedRecipe(new ItemStack(TechArmor.redstone_boots.get()),
				"d d",
				"d d",
				'd', new ItemStack(TechItems.redstone_ingot.get()));

			exportJson.addShapedRecipe(new ItemStack(TechItems.quartz_ingot.get()),
				"ddd",
				"ddd",
				'd', new ItemStack(Items.QUARTZ));
			exportJson.addShapedRecipe(new ItemStack(TechArmor.quartz_helmet.get()),
				"ddd",
				"d d",
				'd', new ItemStack(TechItems.quartz_ingot.get()));

			exportJson.addShapedRecipe(new ItemStack(TechArmor.quartz_chestplate.get()),
				"d d",
				"ddd",
				"ddd",
				'd', new ItemStack(TechItems.quartz_ingot.get()));

			exportJson.addShapedRecipe(new ItemStack(TechArmor.quartz_leggings.get()),
				"ddd",
				"d d",
				"d d",
				'd', new ItemStack(TechItems.quartz_ingot.get()));
			
		   	exportJson.addShapedRecipe(new ItemStack(TechArmor.quartz_boots.get()),
				"d d",
				"d d",
				'd', new ItemStack(TechItems.quartz_ingot.get()));

		
		 exportJson.addShapedRecipe(new ItemStack(TechArmor.emerald_helmet.get()),
				"ddd",
				"d d",
				'd', new ItemStack(Items.EMERALD));
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.emerald_chestplate.get()),
				"d d",
				"ddd",
				"ddd",
				'd', new ItemStack(Items.EMERALD));
			
			exportJson.addShapedRecipe(new ItemStack(TechArmor.emerald_leggings.get()),
				"ddd",
				"d d",
				"d d",
				'd', new ItemStack(Items.EMERALD));
			
		    exportJson.addShapedRecipe(new ItemStack(TechArmor.emerald_boots.get()),
				"d d",
				"d d",
				'd', new ItemStack(Items.EMERALD));
		    
		
		    exportJson.addShapelessRecipe(new ItemStack(TechArmor.bam_tshirt.get()), new ItemStack(TechArmor.emerald_chestplate.get()));
		
	}

}
