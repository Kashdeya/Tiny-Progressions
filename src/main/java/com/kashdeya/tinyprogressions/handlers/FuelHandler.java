package com.kashdeya.tinyprogressions.handlers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

import com.kashdeya.tinyprogressions.inits.TechBlocks;

public class FuelHandler implements IFuelHandler {
	
	public static int CharcoalBlockBurn = 16000;
	
	@Override
    public int getBurnTime(ItemStack fuel) {
        ItemStack itemStack = fuel;
        if (fuel.getItem() == Item.getItemFromBlock(TechBlocks.charcoal_block)) { return CharcoalBlockBurn; }
        
        return 0;
    }

}
