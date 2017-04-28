package com.kashdeya.tinyprogressions.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class SwordMain extends ItemSword {
	
	protected Item.ToolMaterial toolMaterial;
	
	public SwordMain(ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setMaxStackSize(1);
		this.toolMaterial = material;
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = this.toolMaterial.getRepairItemStack();
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }

}