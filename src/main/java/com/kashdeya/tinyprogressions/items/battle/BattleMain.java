package com.kashdeya.tinyprogressions.items.battle;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class BattleMain extends AxeItem {

	//TO move later
	static
	{
		BattleMain emeraldBattle = new BattleMain(ItemToolModTier.EMERALD  , 0, 0);
		BattleMain obsidianBattle = new BattleMain(ItemToolModTier.OBSIDIAN, 0, 0);
	}
	
	
	public BattleMain(IItemTier material, float damage, float speed)
    {
        super(material, damage, speed, new Properties().maxStackSize(1).group(TinyProgressions.TAB));
    }
    
	
    public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("sword", "axe");
	}

	private static HashSet<Block> effectiveAgainst = Sets.newHashSet(Blocks.COBWEB);

	@Override
	public boolean canHarvestBlock(BlockState blockIn) {
			return effectiveAgainst.contains(blockIn.getBlock()) || super.canHarvestBlock(blockIn);
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState state) {
		return state.getMaterial() == Material.WEB ? this.efficiency : effectiveAgainst.contains(state.getBlock()) ? this.efficiency : super.getDestroySpeed(stack, state);
	}
	

}
