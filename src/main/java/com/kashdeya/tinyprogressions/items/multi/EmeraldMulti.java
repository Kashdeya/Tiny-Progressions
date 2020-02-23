package com.kashdeya.tinyprogressions.items.multi;

import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;

import net.minecraft.item.IItemTier;

public class EmeraldMulti extends MultiMain{
	
	public EmeraldMulti(){
		super(ItemToolModTier.PEMERALD, new Properties().maxStackSize(1));
	}	
	
	
//	@Override
//    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
//        ItemStack mat = new ItemStack(Items.EMERALD);
//        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
//    }

}
