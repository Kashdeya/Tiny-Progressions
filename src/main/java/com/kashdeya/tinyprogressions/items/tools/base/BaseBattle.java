package com.kashdeya.tinyprogressions.items.tools.base;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.BlockTags;

public class BaseBattle extends AxeItem {

	
	public BaseBattle(IItemTier material, float damage, float speed)
    {
        super(material, damage, speed, new Properties().stacksTo(1).tab(TinyProgressions.combatGroup));
    }
    
    public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("sword", "axe");
	}

	private static HashSet<Block> effectiveAgainst = Sets.newHashSet(Blocks.COBWEB);

	@Override
	public boolean isCorrectToolForDrops(BlockState blockIn) {
			return effectiveAgainst.contains(blockIn.getBlock()) || super.isCorrectToolForDrops(blockIn);
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState state) {
	      if (state.is(Blocks.COBWEB)) {
	          return 15.0F;
	       } else {
	          Material material = state.getMaterial();
	          return material != Material.PLANT && material != Material.REPLACEABLE_PLANT && material != Material.CORAL && !state.is(BlockTags.LEAVES) && material != Material.VEGETABLE ? super.getDestroySpeed(stack, state) : 1.5F;
	       }
	}
	

}
