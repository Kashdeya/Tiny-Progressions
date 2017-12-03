package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.properties.EnumDustColor;
import com.kashdeya.tinyprogressions.properties.EnumGlowstoneColor;
import com.kashdeya.tinyprogressions.properties.EnumLampColor;
import com.kashdeya.tinyprogressions.registry.recipes.ShapedRecipe;
import com.kashdeya.tinyprogressions.registry.recipes.ShapelessRecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRecipes {
	public static IRecipe SOUL_SANDSTONE, SOUL_SAND;
	public static IRecipe STONE_STICK, STONE_TORCH, STONE_TORCH2;
	public static IRecipe GROWTH_BLOCK, GROWTH_UPGRADE, GROWTH_UPGRADE_TWO;
	public static IRecipe COBBLE_GEN, COBBLE_GEN2, IRON_COBBLE_GEN, DIAMOND_COBBLE_GEN, BLAZE_COBBLE_GEN, EMERALD_COBBLE_GEN;
	public static IRecipe OBSIDIAN, GLASS, DIRTY_GLASS;
	public static IRecipe FLESH_BLOCK, ROTTEN_FLESH;
	public static IRecipe BONE_BLOCK, BONE;
	public static IRecipe NETHERSTAR_BLOCK, NETHERSTAR;
	public static IRecipe FLINT_BLOCK, FLINT;
	public static IRecipe CHARCOAL_BLOCK, CHARCOAL;
	public static IRecipe DIORITE_BRICK, DIORITE, ANDESITE_BRICK, ANDESITE, GRANITE_BRICK, GRANITE;
	public static IRecipe UNHARDENED_STONE, HARDENED_STONE, HARDENED_STONEBRICKS, HARDENED_STONESMALLBRICKS;
	public static IRecipe HARDENED_STONE_STAIRS, HARDENED_STONEBRICKS_STAIRS, HARDENED_STONESMALLBRICKS_STAIRS;
	public static IRecipe HARDENED_STONE_SLAB, HARDENED_STONEBRICKS_SLAB, HARDENED_STONESMALLBRICKS_SLAB;
	public static IRecipe FMF_BLOCK;
	public static IRecipe LAMP;
	public static IRecipe[] COLORED_GLOWSTONE, COLORED_LAMPS;
	public static IRecipe LAVA_CRYSTAL, LAVA_CRYSTAL_BLOCK;
	public static IRecipe NETHERRACK, COMPRESSED_NETHER, COMPRESSED_NETHER2, COMPRESSED_2_NETHER, COMPRESSED_2_NETHER2, COMPRESSED_3_NETHER, COMPRESSED_3_NETHER2, COMPRESSED_4_NETHER, COMPRESSED_4_NETHER2;
	public static IRecipe COMPRESSED_5_NETHER, COMPRESSED_5_NETHER2, COMPRESSED_6_NETHER, COMPRESSED_6_NETHER2, COMPRESSED_7_NETHER, COMPRESSED_7_NETHER2, COMPRESSED_8_NETHER;
	public static IRecipe SUGAR, COMPRESSED_SUGAR, COMPRESSED_SUGAR2, COMPRESSED_2_SUGAR;
	public static IRecipe CANE, COMPRESSED_CANE, COMPRESSED_CANE2, COMPRESSED_2_CANE, COMPRESSED_2_CANE2, COMPRESSED_3_CANE, COMPRESSED_3_CANE2, COMPRESSED_4_CANE, COMPRESSED_4_CANE2;
	public static IRecipe COMPRESSED_5_CANE, COMPRESSED_5_CANE2, COMPRESSED_6_CANE, COMPRESSED_6_CANE2, COMPRESSED_7_CANE, COMPRESSED_7_CANE2, COMPRESSED_8_CANE;
	
	public static void init() {
		// Nether
		if (ConfigHandler.nether_rod){
			SOUL_SANDSTONE = new ShapedRecipe(new ItemStack(TechBlocks.soul_sandstone), new Object[] {
					"cc",
					"cc",
						Character.valueOf('c'), Blocks.SOUL_SAND
			});
			SOUL_SAND = new ShapelessRecipe(new ItemStack(Blocks.SOUL_SAND, 9), new Object[] {
					TechBlocks.soul_sandstone
			});
		}
		if (ConfigHandler.nether_compressed_blocks){
			NETHERRACK = new ShapelessRecipe(new ItemStack(Blocks.NETHERRACK, 9), new Object[] {
					TechBlocks.compressed_nether_block
			});
			COMPRESSED_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.compressed_nether_block), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), Blocks.NETHERRACK
			});
			COMPRESSED_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.compressed_nether_block, 9), new Object[] {
					TechBlocks.double_compressed_nether_block
			});
			COMPRESSED_2_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.double_compressed_nether_block), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.compressed_nether_block
			});
			COMPRESSED_2_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.double_compressed_nether_block, 9), new Object[] {
					TechBlocks.triple_compressed_nether_block
			});
			COMPRESSED_3_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.triple_compressed_nether_block), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.double_compressed_nether_block
			});
			COMPRESSED_3_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.triple_compressed_nether_block, 9), new Object[] {
					TechBlocks.quadruple_compressed_nether_block
			});
			COMPRESSED_4_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.quadruple_compressed_nether_block), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.triple_compressed_nether_block
			});
			COMPRESSED_4_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.quadruple_compressed_nether_block, 9), new Object[] {
					TechBlocks.quintuple_compressed_nether_block
			});
			COMPRESSED_5_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.quintuple_compressed_nether_block), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.quadruple_compressed_nether_block
			});
			COMPRESSED_5_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.quintuple_compressed_nether_block, 9), new Object[] {
					TechBlocks.sextuple_compressed_nether_block
			});
			COMPRESSED_6_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.sextuple_compressed_nether_block), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.quintuple_compressed_nether_block
			});
			COMPRESSED_6_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.sextuple_compressed_nether_block, 9), new Object[] {
					TechBlocks.septuple_compressed_nether_block
			});
			COMPRESSED_7_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.septuple_compressed_nether_block), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.sextuple_compressed_nether_block
			});
			COMPRESSED_7_NETHER2 = new ShapelessRecipe(new ItemStack(TechBlocks.septuple_compressed_nether_block, 9), new Object[] {
					TechBlocks.octuple_compressed_nether_block
			});
			COMPRESSED_8_NETHER = new ShapedRecipe(new ItemStack(TechBlocks.octuple_compressed_nether_block), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.septuple_compressed_nether_block
			});
		}
		// bsc
		if (ConfigHandler.bsc_sugar_compressed_blocks){
			SUGAR = new ShapelessRecipe(new ItemStack(Items.SUGAR, 9), new Object[] {
					TechBlocks.compressed_sugar
			});
			COMPRESSED_SUGAR = new ShapedRecipe(new ItemStack(TechBlocks.compressed_sugar), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), Items.SUGAR
			});
			COMPRESSED_SUGAR2 = new ShapelessRecipe(new ItemStack(TechBlocks.compressed_sugar, 9), new Object[] {
					TechBlocks.double_compressed_sugar
			});
			COMPRESSED_2_SUGAR = new ShapedRecipe(new ItemStack(TechBlocks.double_compressed_sugar), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.compressed_sugar
			});
		}
		if (ConfigHandler.bsc_sugarcane_compressed_blocks){
			CANE = new ShapelessRecipe(new ItemStack(Items.REEDS, 9), new Object[] {
					TechBlocks.compressed_sugar_cane
			});
			COMPRESSED_CANE = new ShapedRecipe(new ItemStack(TechBlocks.compressed_sugar_cane), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), Items.REEDS
			});
			COMPRESSED_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.compressed_sugar_cane, 9), new Object[] {
					TechBlocks.double_compressed_sugar_cane
			});
			COMPRESSED_2_CANE = new ShapedRecipe(new ItemStack(TechBlocks.double_compressed_sugar_cane), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.compressed_sugar_cane
			});
			COMPRESSED_2_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.double_compressed_sugar_cane, 9), new Object[] {
					TechBlocks.triple_compressed_sugar_cane
			});
			COMPRESSED_3_CANE = new ShapedRecipe(new ItemStack(TechBlocks.triple_compressed_sugar_cane), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.double_compressed_sugar_cane
			});
			COMPRESSED_3_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.triple_compressed_sugar_cane, 9), new Object[] {
					TechBlocks.quadruple_compressed_sugar_cane
			});
			COMPRESSED_4_CANE = new ShapedRecipe(new ItemStack(TechBlocks.quadruple_compressed_sugar_cane), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.triple_compressed_sugar_cane
			});
			COMPRESSED_4_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.quadruple_compressed_sugar_cane, 9), new Object[] {
					TechBlocks.quintuple_compressed_sugar_cane
			});
			COMPRESSED_5_CANE = new ShapedRecipe(new ItemStack(TechBlocks.quintuple_compressed_sugar_cane), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.quadruple_compressed_sugar_cane
			});
			COMPRESSED_5_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.quintuple_compressed_sugar_cane, 9), new Object[] {
					TechBlocks.sextuple_compressed_sugar_cane
			});
			COMPRESSED_6_CANE = new ShapedRecipe(new ItemStack(TechBlocks.sextuple_compressed_sugar_cane), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.quintuple_compressed_sugar_cane
			});
			COMPRESSED_6_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.sextuple_compressed_sugar_cane, 9), new Object[] {
					TechBlocks.septuple_compressed_sugar_cane
			});
			COMPRESSED_7_CANE = new ShapedRecipe(new ItemStack(TechBlocks.septuple_compressed_sugar_cane), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.sextuple_compressed_sugar_cane
			});
			COMPRESSED_7_CANE2 = new ShapelessRecipe(new ItemStack(TechBlocks.septuple_compressed_sugar_cane, 9), new Object[] {
					TechBlocks.octuple_compressed_sugar_cane
			});
			COMPRESSED_8_CANE = new ShapedRecipe(new ItemStack(TechBlocks.octuple_compressed_sugar_cane), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), TechBlocks.septuple_compressed_sugar_cane
			});
		}
		
		// Stone Torch
		if (ConfigHandler.StoneTorch) {
			STONE_STICK = new ShapedRecipe(new ItemStack(TechItems.stone_stick, 4), new Object[] {
					"c",
					"c",
						Character.valueOf('c'), "cobblestone"
			});
		}
		
		// Growth Crystals
		if (ConfigHandler.BlockGrowth) {
			GROWTH_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.growth_block), new Object[] {
					"ibi",
					"ded",
					"ibi",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('b'), TechBlocks.bone_block,
						Character.valueOf('d'), TechBlocks.dirty_glass,
						Character.valueOf('e'), Blocks.SEA_LANTERN
			});
		}
		if (ConfigHandler.BlockGrowthUpgrade && ConfigHandler.WateringCanUpgrade && ConfigHandler.BlockGrowth && ConfigHandler.NetherStarBlock) {
			GROWTH_UPGRADE = new ShapedRecipe(new ItemStack(TechBlocks.growth_upgrade), new Object[] {
					"cwc",
					"ses",
					"cnc",
						Character.valueOf('c'), TechBlocks.reinforced_glass,
						Character.valueOf('w'), TechItems.watering_can_upgrade,
						Character.valueOf('s'), Items.END_CRYSTAL,
						Character.valueOf('e'), TechBlocks.growth_block,
						Character.valueOf('n'), TechBlocks.netherstar_block
			});
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo && ConfigHandler.BlockGrowthUpgrade) {
			GROWTH_UPGRADE_TWO = new ShapelessRecipe(new ItemStack(TechBlocks.growth_upgrade_two), new Object[] {
					TechBlocks.growth_upgrade, Blocks.DRAGON_EGG
			});
		}
		
		// Cobble Generators
		if (ConfigHandler.Cobblegen) {
			COBBLE_GEN = new ShapedRecipe(new ItemStack(TechBlocks.cobblegen_block), new Object[] {
					"ccc",
					"wgl",
					"ccc",
						Character.valueOf('c'), "cobblestone",
						Character.valueOf('w'), Items.WATER_BUCKET,
						Character.valueOf('l'), Items.LAVA_BUCKET,
						Character.valueOf('g'), "blockGlass"
			});
			
			COBBLE_GEN2 = new ShapedRecipe(new ItemStack(TechBlocks.cobblegen_block), new Object[] {
					"ccc",
					"lgw",
					"ccc",
						Character.valueOf('c'), "cobblestone",
						Character.valueOf('w'), Items.WATER_BUCKET,
						Character.valueOf('l'), Items.LAVA_BUCKET,
						Character.valueOf('g'), "blockGlass"
			});
		}
		if (ConfigHandler.IronCobblegen && ConfigHandler.Cobblegen) {
			IRON_COBBLE_GEN = new ShapedRecipe(new ItemStack(TechBlocks.iron_cobblegen_block), new Object[] {
					"iii",
					"igi",
					"iii",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('g'), TechBlocks.cobblegen_block
			});
		}
		if (ConfigHandler.DiamondCobblegen && ConfigHandler.IronCobblegen) {
			DIAMOND_COBBLE_GEN = new ShapedRecipe(new ItemStack(TechBlocks.diamond_cobblegen_block), new Object[] {
					"ddd",
					"did",
					"ddd",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('i'), TechBlocks.iron_cobblegen_block
			});
		}
		if (ConfigHandler.BlazeCobblegen && ConfigHandler.DiamondCobblegen) {
			BLAZE_COBBLE_GEN = new ShapedRecipe(new ItemStack(TechBlocks.blaze_cobblegen_block), new Object[] {
					"bbb",
					"bdb",
					"bbb",
						Character.valueOf('b'), Items.BLAZE_ROD,
						Character.valueOf('d'), TechBlocks.diamond_cobblegen_block
			});
		}
		if (ConfigHandler.EmeraldCobblegen && ConfigHandler.BlazeCobblegen) {
			EMERALD_COBBLE_GEN = new ShapedRecipe(new ItemStack(TechBlocks.emerald_cobblegen_block), new Object[] {
					"eee",
					"ebe",
					"eee",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('b'), TechBlocks.blaze_cobblegen_block
			});
		}

		// Stone Torch
		if (ConfigHandler.StoneTorch) {
			STONE_TORCH = new ShapedRecipe(new ItemStack(TechBlocks.stone_torch, 4), new Object[] {
					"c",
					"s",
						Character.valueOf('c'), new ItemStack(Items.COAL,1,0),
						Character.valueOf('s'), "stickStone"
			});
			STONE_TORCH2 = new ShapedRecipe(new ItemStack(TechBlocks.stone_torch, 4), new Object[] {
					"c",
					"s",
						Character.valueOf('c'), new ItemStack(Items.COAL,1,1),
						Character.valueOf('s'), "stickStone"
			});
		}
		
		// Reinforced Blocks
		if (ConfigHandler.ReinforcedGlass) {
			GLASS = new ShapedRecipe(new ItemStack(TechBlocks.reinforced_glass, 4), new Object[] {
					"ogo",
					"gog",
					"ogo",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('g'), TechBlocks.dirty_glass
			});
		}
		if (ConfigHandler.ReinforcedObsidian) {
			OBSIDIAN = new ShapedRecipe(new ItemStack(TechBlocks.reinforced_obsidian, 4), new Object[] {
					"ioi",
					"oio",
					"ioi",
						Character.valueOf('o'), "obsidian",
						Character.valueOf('i'), Blocks.IRON_BARS
			});
		}
		
		// Dirty Glass
		if (ConfigHandler.DirtyGlass) {
			DIRTY_GLASS = new ShapedRecipe(new ItemStack(TechBlocks.dirty_glass, 4), new Object[] {
					"sgs",
					"gsg",
					"sgs",
						Character.valueOf('g'), "blockGlass",
						Character.valueOf('s'), Blocks.SOUL_SAND
			});
		}

		// Compressed Blocks
		if (ConfigHandler.FleshBlock) {
			FLESH_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.flesh_block), new Object[] {
					"rrr",
					"rrr",
					"rrr",
						Character.valueOf('r'), Items.ROTTEN_FLESH
			});
			
			ROTTEN_FLESH = new ShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 9), new Object[] {
					TechBlocks.flesh_block
			});
		}
		if (ConfigHandler.BoneBlock) {
			BONE_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.bone_block), new Object[] {
					"bbb",
					"bbb",
					"bbb",
						Character.valueOf('b'), "bone"
			});
			
			BONE = new ShapelessRecipe(new ItemStack(Items.BONE, 9), new Object[] {
					TechBlocks.bone_block
			});
		}
		if (ConfigHandler.NetherStarBlock) {
			NETHERSTAR_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.netherstar_block), new Object[] {
					"nnn",
					"nnn",
					"nnn",
						Character.valueOf('n'), Items.NETHER_STAR
			});
			
			NETHERSTAR = new ShapelessRecipe(new ItemStack(Items.NETHER_STAR, 9), new Object[] {
					TechBlocks.netherstar_block
			});
		}
		if (ConfigHandler.FlintBlock) {
			FLINT_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.flint_block), new Object[] {
					"fff",
					"fff",
					"fff",
						Character.valueOf('f'), "flint"
			});
					
			FLINT = new ShapelessRecipe(new ItemStack(Items.FLINT, 9), new Object[] {
					TechBlocks.flint_block
			});
		}
		if (ConfigHandler.CharcoalBlock) {
			CHARCOAL_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.charcoal_block), new Object[] {
					"ccc",
					"ccc",
					"ccc",
						Character.valueOf('c'), new ItemStack(Items.COAL, 1, 1)
			});
			
			CHARCOAL = new ShapelessRecipe(new ItemStack(Items.COAL, 9, 1), new Object[] {
					TechBlocks.charcoal_block
			});
		}
		
		// Vanilla Bricks
		if (ConfigHandler.DioriteBrick) {
			DIORITE_BRICK = new ShapedRecipe(new ItemStack(TechBlocks.diorite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneDioritePolished"
			});
			
			DIORITE = new ShapelessRecipe(new ItemStack(Blocks.STONE, 4, 4), new Object[] {
					TechBlocks.diorite_brick
			});
		}
		if (ConfigHandler.GraniteBrick) {
			GRANITE_BRICK = new ShapedRecipe(new ItemStack(TechBlocks.granite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneGranitePolished"
			});
			
			GRANITE = new ShapelessRecipe(new ItemStack(Blocks.STONE, 4, 2), new Object[] {
					TechBlocks.granite_brick
			});
		}
		if (ConfigHandler.AndesiteBrick) {
			ANDESITE_BRICK = new ShapedRecipe(new ItemStack(TechBlocks.andesite_brick, 4), new Object[] {
					"ss",
					"ss",
						Character.valueOf('s'), "stoneAndesitePolished"
			});
			
			ANDESITE = new ShapelessRecipe(new ItemStack(Blocks.STONE, 4, 6), new Object[] {
					TechBlocks.andesite_brick
			});
		}

		// Hardened Stone
		if (ConfigHandler.hardened_stone) {
			GameRegistry.addSmelting(new ItemStack(TechBlocks.unhardened_stone), new ItemStack(TechBlocks.hardened_stone), 1.0F);
			UNHARDENED_STONE = new ShapedRecipe(new ItemStack(TechBlocks.unhardened_stone, 4), new Object[] {
		            "csc",
		            "yiy",
		            "csc",
		                Character.valueOf('c'), Blocks.COBBLESTONE,
		                Character.valueOf('s'), Blocks.SAND,
		                Character.valueOf('y'), Items.CLAY_BALL,
		                Character.valueOf('i'), Items.IRON_INGOT,
		    });			
			HARDENED_STONEBRICKS = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks), new Object[] {
		            "ss",
		            "ss",
		                Character.valueOf('s'), TechBlocks.hardened_stone
		    });
			HARDENED_STONESMALLBRICKS = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks), new Object[] {
		            "ss",
		            "ss",
		                Character.valueOf('s'), TechBlocks.hardened_stone_bricks
		    });
			
			HARDENED_STONE_STAIRS = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_stairs, 4), new Object[] {
			        "  s",
			        " ss",
			        "sss",
			            Character.valueOf('s'), TechBlocks.hardened_stone
			});
			HARDENED_STONEBRICKS_STAIRS = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks_stairs, 4), new Object[] {
                    "  s",
                    " ss",
                    "sss",
                        Character.valueOf('s'), TechBlocks.hardened_stone_bricks
            });
			HARDENED_STONESMALLBRICKS_STAIRS = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks_stairs, 4), new Object[] {
                    "  s",
                    " ss",
                    "sss",
                        Character.valueOf('s'), TechBlocks.hardened_stone_smallbricks
            });
			HARDENED_STONE_SLAB = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_slab_half, 6), new Object[] {
			  "sss",
			      Character.valueOf('s'), TechBlocks.hardened_stone
			});
			HARDENED_STONEBRICKS_SLAB = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_bricks_slab_half, 6), new Object[] {
		              "sss",
		                  Character.valueOf('s'), TechBlocks.hardened_stone_bricks
		            });
			HARDENED_STONESMALLBRICKS_SLAB = new ShapedRecipe(new ItemStack(TechBlocks.hardened_stone_smallbricks_slab_half, 6), new Object[] {
		              "sss",
		                  Character.valueOf('s'), TechBlocks.hardened_stone_smallbricks
		            });
		}
		
		// Floaty Block
		if (ConfigHandler.angel_block) {
			FMF_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.fmf_block), new Object[] {
		            "ifi",
		            "fif",
		            "ifi",
		                Character.valueOf('i'), "ingotIron",
		                Character.valueOf('f'), "feather"
		    });
		}
		
		// Glowstone Dust
		if (ConfigHandler.ColorGlowstone){
			COLORED_GLOWSTONE = new IRecipe[EnumGlowstoneColor.values().length];
			for(int i = 0; i < EnumGlowstoneColor.values().length; i++)
			{
				COLORED_GLOWSTONE[i] = new ShapedRecipe(new ItemStack(TechBlocks.colored_glowstone, 1, i), new Object[] {
						"dd",
						"dd",
							Character.valueOf('d'), EnumDustColor.values()[i].getOredict()
				});
			}
		}
		
		// Lamps
		if (ConfigHandler.ColorLamps){
			LAMP = new ShapedRecipe(new ItemStack(TechBlocks.lamp), new Object[] {
					"dt",
						Character.valueOf('d'), "blockGlassColorless",
						Character.valueOf('t'), "torch"
			});
			
			COLORED_LAMPS = new IRecipe[EnumLampColor.values().length];
			for(int i = 0; i < EnumLampColor.values().length; i++)
			{
				COLORED_LAMPS[i] = new ShapedRecipe(new ItemStack(TechBlocks.colored_lamp, 1, i), new Object[] {
						"dt",
							Character.valueOf('d'), new ItemStack(Blocks.STAINED_GLASS, 1, i),
							Character.valueOf('t'), "torch"
				});
			}
		}
		
		// Lava Crystal Block
		if (ArmorHandler.lapis_armor) {
			LAVA_CRYSTAL_BLOCK = new ShapedRecipe(new ItemStack(TechBlocks.lava_crystal_block), new Object[] {
		            "ii",
		            "ii",
		                Character.valueOf('i'), TechItems.lava_crystal
		    });
			
			LAVA_CRYSTAL = new ShapelessRecipe(new ItemStack(TechItems.lava_crystal, 4), new Object[] {
					new ItemStack(TechBlocks.lava_crystal_block)
			});
		}
	}
}
