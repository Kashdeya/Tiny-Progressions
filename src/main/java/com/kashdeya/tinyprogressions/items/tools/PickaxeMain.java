package com.kashdeya.tinyprogressions.items.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class PickaxeMain extends ItemPickaxe {
	
	public PickaxeMain(ToolMaterial material){
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