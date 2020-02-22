package com.kashdeya.tinyprogressions.armor;

import java.util.List;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class BamShirt extends ItemArmor {
	
	public BamShirt(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn) {
		super(material, renderIndex, equipmentSlotIn);
		this.setMaxStackSize(1);
		this.setCreativeTab(TinyProgressions.tabTP);
	}
	
    /**
     * Return whether this item is repairable in an anvil.
     */
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(Items.EMERALD);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }
    
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.bamsarmor_1").getFormattedText());
    }
}
