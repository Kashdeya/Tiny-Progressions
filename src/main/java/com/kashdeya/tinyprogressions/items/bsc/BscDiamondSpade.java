package com.kashdeya.tinyprogressions.items.bsc;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class BscDiamondSpade extends ItemSpade {

    public BscDiamondSpade(ToolMaterial material) {
        super(material);
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setMaxStackSize(1);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(Items.DIAMOND);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }
}