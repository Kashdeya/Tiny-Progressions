package com.kashdeya.tinyprogressions.items.bsc;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class BscDiamondAxe extends ItemAxe {

    public BscDiamondAxe(ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setMaxStackSize(1);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(Items.DIAMOND);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }
}