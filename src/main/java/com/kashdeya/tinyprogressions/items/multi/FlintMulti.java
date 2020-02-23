package com.kashdeya.tinyprogressions.items.multi;

import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;

import net.minecraft.item.IItemTier;

public class FlintMulti extends MultiMain{
	
	public FlintMulti(){
		super(ItemToolModTier.PFLINT, new Properties().maxStackSize(1));
	}
	
//	@Override
//    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
//        ItemStack mat = new ItemStack(Items.FLINT);
//        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
//    }

}