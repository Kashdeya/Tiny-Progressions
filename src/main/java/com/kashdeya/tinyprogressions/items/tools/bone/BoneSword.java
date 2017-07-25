package com.kashdeya.tinyprogressions.items.tools.bone;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class BoneSword extends ItemSword {
	
	public BoneSword(ToolMaterial material){
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.BONE);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
}
