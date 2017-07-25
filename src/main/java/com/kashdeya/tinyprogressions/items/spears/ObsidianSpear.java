package com.kashdeya.tinyprogressions.items.spears;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

public class ObsidianSpear extends SpearMain{
	
	public ObsidianSpear(ToolMaterial material) {
		super(material);
        this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}

	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Blocks.OBSIDIAN);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }

}