package com.kashdeya.tinyprogressions.items.battle;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class EmeraldBattle extends BattleMain{
	
	public EmeraldBattle(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
        this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}

	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.EMERALD);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }

}
