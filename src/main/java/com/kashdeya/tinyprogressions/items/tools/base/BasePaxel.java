package com.kashdeya.tinyprogressions.items.tools.base;

import java.util.Set;

import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.common.ToolType;

public class BasePaxel extends PickaxeItem {
	
//	//TOD Move Later Also tweak the settings I think.
//	static
//	{
//		BasePaxel flintMulti =    new BasePaxel(ItemToolModTier.PFLINT,   0,0, new Properties());
//		BasePaxel emeraldMulti =  new BasePaxel(ItemToolModTier.PEMERALD, 0,0, new Properties());
//		BasePaxel obsidianMulti = new BasePaxel(ItemToolModTier.POBSIDIAN,0,0, new Properties());
//		BasePaxel wubMulti = 	  new BasePaxel(ItemToolModTier.PWUBWUB  ,0,0, new Properties());
//	}
	
	public BasePaxel(IItemTier tier, int baseDmg, int baseSpeed, Properties properties) {
		super(tier, baseDmg, baseSpeed,  properties
				.addToolType(ToolType.PICKAXE, tier.getHarvestLevel())
				.addToolType(ToolType.SHOVEL, tier.getHarvestLevel())
				.addToolType(ToolType.AXE, tier.getHarvestLevel())
				.group(TinyProgressions.TAB));

	}

//	@Override
//	public Set<ToolType> getToolTypes(ItemStack stack) {
//		return ImmutableSet.of(ToolType.PICKAXE, ToolType.SHOVEL, ToolType.AXE);
//	}

	private static Set<Block> effectiveAgainst = Sets.newHashSet(
		Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.SPRUCE_PLANKS,
		Blocks.BOOKSHELF, Blocks.ACACIA_LOG, Blocks.BIRCH_LOG, Blocks.DARK_OAK_LOG, Blocks.JUNGLE_LOG, Blocks.OAK_LOG,
		Blocks.SPRUCE_LOG, Blocks.CHEST, Blocks.PUMPKIN, Blocks.CARVED_PUMPKIN, Blocks.MELON, Blocks.LADDER,
		Blocks.ACACIA_BUTTON, Blocks.BIRCH_BUTTON, Blocks.DARK_OAK_BUTTON, Blocks.JUNGLE_BUTTON, Blocks.OAK_BUTTON, Blocks.SPRUCE_BUTTON, 
		Blocks.STONE_BUTTON, Blocks.ACACIA_PRESSURE_PLATE, Blocks.BIRCH_PRESSURE_PLATE, Blocks.DARK_OAK_PRESSURE_PLATE, Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, 
		Blocks.JUNGLE_PRESSURE_PLATE, Blocks.OAK_PRESSURE_PLATE, Blocks.SPRUCE_PRESSURE_PLATE, Blocks.STONE_PRESSURE_PLATE,Blocks.ACTIVATOR_RAIL,
		Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK,
		Blocks.DIAMOND_ORE, Blocks.STONE_SLAB, Blocks.DETECTOR_RAIL, Blocks.GOLD_BLOCK,
		Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK,
		Blocks.LAPIS_ORE, Blocks.REDSTONE_BLOCK, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK,
		Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE,
		Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE, Blocks.CLAY,
		Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND,
		Blocks.SNOW, Blocks.SNOW, Blocks.SOUL_SAND, Blocks.GRASS_PATH, Blocks.COBWEB);

	@Override
	public boolean canHarvestBlock(BlockState blockIn) {
			return effectiveAgainst.contains(blockIn.getBlock()) || super.canHarvestBlock(blockIn);
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState state) {
		return state.getMaterial() == Material.WEB || state.getMaterial() == Material.WOOD || state.getMaterial() == Material.TALL_PLANTS || state.getMaterial() == Material.PLANTS || state.getMaterial() == Material.ORGANIC || state.getMaterial() == Material.SAND ? this.efficiency : effectiveAgainst.contains(state.getBlock()) ? this.efficiency : super.getDestroySpeed(stack, state);
	}
}
