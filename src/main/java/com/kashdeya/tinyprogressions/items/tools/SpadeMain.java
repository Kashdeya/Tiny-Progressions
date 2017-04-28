package com.kashdeya.tinyprogressions.items.tools;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class SpadeMain extends ItemSpade {
	
	public SpadeMain(ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setMaxStackSize(1);
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = this.toolMaterial.getRepairItemStack();
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
}