package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.properties.EnumDustColor;
import com.kashdeya.tinyprogressions.registry.recipes.ShapedRecipe;
import com.kashdeya.tinyprogressions.registry.recipes.ShapelessRecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.potion.PotionUtils;

public class ItemRecipes {
	
	public static IRecipe NETHER_ROD, BSC_ROD;
	public static IRecipe[] COLORED_DUST;
	
	public static IRecipe WATERING_CAN, WATERING_CAN_UPGRADE;

	public static IRecipe MEDKIT;
	public static IRecipe ENDERPEARL;
	public static IRecipe REPAIR_TABLET;
	
	public static IRecipe TINY_CHARCOAL, TINY_COAL, CHARCOAL1, COAL, STEEL_INGOT, STEEL_INGOT1;
	
	public static IRecipe CHAINMAIL_PART;
	public static IRecipe STONE_HAMMER, OBSIDIAN_DUST;
	
	public static IRecipe WITHER_RING, POSION_RING, FIRE_RING, NAUSEA_RING, MASTER_RING, STARTER_RING;
	
		public static void init() {
			// Rings
			if (ConfigHandler.artifact_rings && ConfigHandler.steel_ingot){
				STARTER_RING = new ShapedRecipe(new ItemStack(TechItems.starter_ring),
						"sss",
						"shs",
						"sss",
						's', new ItemStack(TechItems.steel_ingot),
						'h', new ItemStack(TechItems.stone_hammer));
				WITHER_RING = new ShapedRecipe(new ItemStack(TechItems.wither_ring), 
						"sms",
						"aha",
						"sms",
						'h', new ItemStack(TechItems.starter_ring),
						'm', new ItemStack(Items.MILK_BUCKET),
						'a', PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_INVISIBILITY),
						's', new ItemStack(TechItems.corrupted_gem));
				FIRE_RING = new ShapedRecipe(new ItemStack(TechItems.fire_ring), 
						"sms",
						"aha",
						"sms",
						'h', new ItemStack(TechItems.starter_ring),
						'm', new ItemStack(Items.MAGMA_CREAM),
						'a', PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_FIRE_RESISTANCE),
						's', new ItemStack(TechItems.corrupted_hexa));
				POSION_RING = new ShapedRecipe(new ItemStack(TechItems.posion_ring), 
						"sms",
						"aha",
						"sms",
						'h', new ItemStack(TechItems.starter_ring),
						'm', new ItemStack(Items.SPIDER_EYE),
						'a', PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.LONG_POISON),
						's', new ItemStack(TechItems.corrupted_shard));
				NAUSEA_RING = new ShapedRecipe(new ItemStack(TechItems.nausea_ring), 
						"sms",
						"aha",
						"sms",
						'h', new ItemStack(TechItems.starter_ring),
						'm', new ItemStack(Items.GHAST_TEAR),
						'a', PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.MUNDANE),
						's', new ItemStack(TechItems.corrupted_shard));
				MASTER_RING = new ShapedRecipe(new ItemStack(TechItems.master_ring), 
						"wf",
						"np",
						'w', new ItemStack(TechItems.wither_ring),
						'f', new ItemStack(TechItems.fire_ring),
						'n', new ItemStack(TechItems.nausea_ring),
						'p', new ItemStack(TechItems.posion_ring));
			}
			// Nether
			if (ConfigHandler.nether_rod){
				NETHER_ROD = new ShapedRecipe(new ItemStack(TechItems.nether_rod, 4), 
						"i",
						"i",
						'i', TechBlocks.soul_sandstone);
			}
			// bsc
			if (ConfigHandler.bsc_rod) {
				BSC_ROD = new ShapedRecipe(new ItemStack(TechItems.bsc_rod, 4), 
						"i",
						"i",
						'i', TechBlocks.compressed_sugar_cane);
			}
			
			// Glowstone Dust
			if (ConfigHandler.ColorGlowstone)
			{
				COLORED_DUST = new IRecipe[EnumDustColor.values().length];
				for(int i = 0; i < EnumDustColor.values().length; i++)
				{
					COLORED_DUST[i] = new ShapedRecipe(new ItemStack(TechItems.colored_dust, 8, i), 
							"ddd",
							"dgd",
							"ddd",
							'g', Items.GLOWSTONE_DUST,
							'd', EnumDustColor.values()[i].getCraftingOredict());
				}
			}
			
			// Watering Cans
			if (ConfigHandler.WateringCan) {
				WATERING_CAN = new ShapedRecipe(new ItemStack(TechItems.watering_can), 
						"id ",
						"iwi",
						" i ",
						'i', "ingotIron",
						'd', "dyeWhite",
						'w', Items.WATER_BUCKET);
			}
			if (ConfigHandler.WateringCanUpgrade && ConfigHandler.WateringCan) {
				WATERING_CAN_UPGRADE = new ShapedRecipe(new ItemStack(TechItems.watering_can_upgrade), 
						"on ",
						"owo",
						" o ",
						'o', "ingotReinforcedObsidian",
						'n', Items.NETHER_STAR,
						'w', TechItems.watering_can);
			}
			
			// Medkit
			if (ConfigHandler.MedKit) {
				MEDKIT = new ShapedRecipe(new ItemStack(TechItems.med_kit), 
						"prp",
						"rgr",
						"lrl",
						'p', "paper",
						'r', "dyeRed",
						'l', "leather",
						'g', Items.SPECKLED_MELON);
			}
			
			// Ender Dust
			if (ConfigHandler.ender_ore) {
				ENDERPEARL = new ShapedRecipe(new ItemStack(Items.ENDER_PEARL), 
						"ee",
						"ee",
						'e', "dustEnder");
			}
			
			// Medkit
			if (ConfigHandler.repair_tablet) {
				REPAIR_TABLET = new ShapedRecipe(new ItemStack(TechItems.repair_tablet), 
						"plp",
						"rgr",
						"prp",
						'p', TechBlocks.hardened_stone,
						'r', TechItems.corrupted_gem,
						'l', Items.NETHER_STAR,
						'g', TechItems.redstone_ingot);
			}
			
			// Tiny Coal & Charcoal
			if (ConfigHandler.tiny_charcoal) {
				TINY_CHARCOAL = new ShapelessRecipe(new ItemStack(TechItems.tiny_charcoal, 8), new ItemStack(Items.COAL, 1, 1), TechItems.stone_hammer);
				CHARCOAL1 = new ShapedRecipe(new ItemStack(Items.COAL, 1, 1),
						
						"sss",
						"s s",
						"sss",
						's', TechItems.tiny_charcoal);
			}
			if (ConfigHandler.tiny_coal) {
				TINY_COAL = new ShapelessRecipe(new ItemStack(TechItems.tiny_coal, 8), new ItemStack(Items.COAL, 1, 0), TechItems.stone_hammer);
				COAL = new ShapedRecipe(new ItemStack(Items.COAL, 1, 0), 
						"sss",
						"s s",
						"sss",
						's', TechItems.tiny_coal);
			}
			
			// Chainmail part
			if (ArmorHandler.chain_armor){
				CHAINMAIL_PART = new ShapelessRecipe(new ItemStack(TechItems.chainmail_part, 2), Items.IRON_INGOT, TechItems.stone_hammer);
			}
			
			// Steel
			if (ConfigHandler.steel_ingot & (ConfigHandler.tiny_charcoal || ConfigHandler.tiny_coal)){
				STEEL_INGOT = new ShapedRecipe(new ItemStack(TechItems.steel_ingot, 2), 
						"sss",
						"ihi",
						"sss",
						'h', TechItems.stone_hammer,
						'i', Items.IRON_INGOT,
						's', TechItems.tiny_coal);
				STEEL_INGOT1 = new ShapedRecipe(new ItemStack(TechItems.steel_ingot, 2), 
						"sss",
						"ihi",
						"sss",
						'h', TechItems.stone_hammer,
						'i', Items.IRON_INGOT,
						's', TechItems.tiny_charcoal);
			}
			
			// Can not be turned off.
				OBSIDIAN_DUST = new ShapelessRecipe(new ItemStack(TechItems.obsidian_dust), new ItemStack(Blocks.OBSIDIAN), new ItemStack(TechItems.stone_hammer));
				STONE_HAMMER = new ShapedRecipe(new ItemStack(TechItems.stone_hammer),					
						"cic",
						"isi",
						" s ",
						'i', Items.STRING,
						's', Items.STICK,
						'c', TechBlocks.hardened_stone);
			
		}

}
