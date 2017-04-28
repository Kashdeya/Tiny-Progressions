package com.kashdeya.tinyprogressions.items.tools;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class AxeMain extends ItemAxe{
	
	public AxeMain(ToolMaterial material, float damage, float speed){
		super(material, damage, speed);
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
