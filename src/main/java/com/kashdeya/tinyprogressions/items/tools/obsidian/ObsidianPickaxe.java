package com.kashdeya.tinyprogressions.items.tools.obsidian;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ObsidianPickaxe extends ItemPickaxe {
	
	public ObsidianPickaxe(ToolMaterial material){
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
		this.setHarvestLevel("pickaxe", 4);
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		ItemStack mat = new ItemStack(Blocks.OBSIDIAN);
		return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
	}
}
