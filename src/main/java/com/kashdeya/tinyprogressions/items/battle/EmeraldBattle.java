package com.kashdeya.tinyprogressions.items.battle;

import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;

import net.minecraft.item.IItemTier;

public class EmeraldBattle extends BattleMain {

    public EmeraldBattle(IItemTier material, float damage, float speed) {
        super(ItemToolModTier.EMERALD, damage, speed);
    }

    
//TODO I think the material will override this. Must test 
//    @Override
//    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
//        ItemStack mat = new ItemStack(Items.EMERALD);
//        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
//    }

}
