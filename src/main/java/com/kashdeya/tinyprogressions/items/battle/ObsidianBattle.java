package com.kashdeya.tinyprogressions.items.battle;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class ObsidianBattle extends BattleMain{
	
	public ObsidianBattle(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
        this.setCreativeTab(tinyprogressions.tabTP);
		this.setMaxStackSize(1);
	}

	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Blocks.OBSIDIAN);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }

}
