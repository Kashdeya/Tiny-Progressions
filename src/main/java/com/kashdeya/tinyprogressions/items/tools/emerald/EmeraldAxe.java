package com.kashdeya.tinyprogressions.items.tools.emerald;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class EmeraldAxe extends ItemAxe{
	
	public EmeraldAxe(ToolMaterial material, float damage, float speed){
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