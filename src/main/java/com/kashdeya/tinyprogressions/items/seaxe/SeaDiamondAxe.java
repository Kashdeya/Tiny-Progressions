package com.kashdeya.tinyprogressions.items.seaxe;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

public class SeaDiamondAxe extends ItemAxe{
	
	public SeaDiamondAxe(ToolMaterial material, float damage, float speed){
		super(material, damage, speed);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
	
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("axe", "sword");
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.DIAMOND);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
	private static HashSet<Block> effectiveAgainst = Sets.newHashSet(new Block[] {
			Blocks.WEB}
	);

	@Override
	public boolean canHarvestBlock(IBlockState blockIn) {
			return effectiveAgainst.contains(blockIn.getBlock()) ? true : super.canHarvestBlock(blockIn);
	}

	@Override
	public float getDestroySpeed(ItemStack stack, IBlockState state) {
		 if (state.getMaterial() == Material.WEB)
		        return this.efficiency;
		 return effectiveAgainst.contains(state.getBlock()) ? this.efficiency : super.getDestroySpeed(stack, state);
	}
}
