package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	
	public static int CharcoalBlockBurn;
	public static int tiny_coal_burntime;
	public static int tiny_charcoal_burntime;
	public static int lava_block_burntime;
	
	@Override
    public int getBurnTime(ItemStack fuel) {
		if (ConfigHandler.CharcoalBlock){
			if (fuel.getItem() == Item.getItemFromBlock(TechBlocks.charcoal_block)) { return CharcoalBlockBurn; }
		}
        if (ArmorHandler.lava_armor){
        	if (fuel.getItem() == TechItems.lava_crystal) {return 2500;}
        	if (fuel.getItem() == Item.getItemFromBlock(TechBlocks.lava_crystal_block)) {return 10000;}
        }
        if (ConfigHandler.StoneTorch){
        	if (fuel.getItem() == Item.getItemFromBlock(TechBlocks.stone_torch)) {return 150;}
        }
        if (ConfigHandler.tiny_coal){
        	if (fuel.getItem() == TechItems.tiny_coal) {return tiny_coal_burntime;}
        }
        if (ConfigHandler.tiny_charcoal){
        	if (fuel.getItem() == TechItems.tiny_charcoal) {return tiny_charcoal_burntime;}
        }
        if (ConfigHandler.lava_block_recipe){
        	if (fuel.getItem() == Item.getItemFromBlock(TechBlocks.lava_block)) {return lava_block_burntime;}
        }

        return 0;
    }
}
