package com.kashdeya.tinyprogressions.armor;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class EmeraldArmor extends ItemArmor {
	
	public EmeraldArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn) {
		super(material, renderIndex, equipmentSlotIn);
		this.setMaxStackSize(1);
		this.setCreativeTab(TinyProgressions.tabTP);
	}
	
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(Items.EMERALD);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }
}