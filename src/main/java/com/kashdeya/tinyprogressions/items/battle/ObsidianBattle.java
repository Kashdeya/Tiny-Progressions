package com.kashdeya.tinyprogressions.items.battle;

import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;

public class ObsidianBattle extends BattleMain {

    public ObsidianBattle(float damage, float speed) {
    	super(ItemToolModTier.OBSIDIAN, damage, speed);
    }

//    @Override
//    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
//        ItemStack mat = new ItemStack(Blocks.OBSIDIAN);
//        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
//    }

}
