package com.kashdeya.tinyprogressions.items.battle;

import com.kashdeya.tinyprogressions.main.TinyProgressions;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ObsidianBattle extends BattleMain {

    public ObsidianBattle(ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setMaxStackSize(1);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(Blocks.OBSIDIAN);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }

}
