package com.kashdeya.tinyprogressions.items.tools.flint;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.oredict.OreDictionary;

public class FlintSword extends ItemSword {
	
	public FlintSword(ToolMaterial material){
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(Items.FLINT);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }
}
