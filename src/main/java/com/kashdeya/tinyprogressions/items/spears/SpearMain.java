package com.kashdeya.tinyprogressions.items.spears;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import com.google.common.collect.Multimap;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.tinyprogressions;
import com.kashdeya.tinyprogressions.util.IExtendedReach;

public class SpearMain extends ItemSword implements IExtendedReach {
	
	protected Item.ToolMaterial toolMaterial;

	public SpearMain(ToolMaterial material) {
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setMaxStackSize(1);
	}
	
	@Override	
	public float getReach() {
		return ConfigHandler.SpearReach;
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = this.toolMaterial.getRepairItemStack();
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
}
