package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	
	public static int CharcoalBlockBurn;
	
	@Override
    public int getBurnTime(ItemStack fuel) {
		if (ConfigHandler.CharcoalBlock){
			if (fuel.getItem() == Item.getItemFromBlock(TechBlocks.charcoal_block)) { return CharcoalBlockBurn; }
		}
        if (ConfigHandler.lava_crystal_enable){
        	if (fuel.getItem() == TechItems.lava_crystal) {return 2500;}
        	if (fuel.getItem() == Item.getItemFromBlock(TechBlocks.lava_crystal_block)) {return 10000;}
        }
        if (ConfigHandler.StoneTorch){
        	if (fuel.getItem() == Item.getItemFromBlock(TechBlocks.stone_torch)) {return 150;}
        }

        return 0;
    }
}
