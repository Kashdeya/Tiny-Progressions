package com.kashdeya.tinyprogressions.items.spears;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class EmeraldSpear extends SpearMain{
	
	public EmeraldSpear(ToolMaterial material) {
		super(material);
        this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}

	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(Items.EMERALD);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }

}