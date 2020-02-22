package com.kashdeya.tinyprogressions.items.tools.bone;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class BoneSpade extends ItemSpade {
	
	public BoneSpade(ToolMaterial material){
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(Items.BONE);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }
}
