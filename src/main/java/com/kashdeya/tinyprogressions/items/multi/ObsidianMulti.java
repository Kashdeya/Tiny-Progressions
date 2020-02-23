package com.kashdeya.tinyprogressions.items.multi;

import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;

public class ObsidianMulti extends MultiMain{
	
	public ObsidianMulti(){
		super(ItemToolModTier.POBSIDIAN, new Properties().maxStackSize(1));
	}	
	
//	@Override
//    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
//        ItemStack mat = new ItemStack(Blocks.OBSIDIAN);
//        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
//    }

}
