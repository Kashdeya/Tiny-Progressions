package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	
	public static int CharcoalBlockBurn;
	public static int lava_crystal_burntime;
	public static int stone_torch_burntime = 150;
	public static int lava_crystal_block_burntime;
	
	@Override
    public int getBurnTime(ItemStack fuel) {
		if (ConfigHandler.CharcoalBlock){
			if (fuel.getItem() == Item.getItemFromBlock(TechBlocks.charcoal_block)) { return CharcoalBlockBurn; }
		}
        if (ConfigHandler.lava_ore && ConfigHandler.lava_crystal_enable){
        	if (fuel.getItem() == TechItems.lava_crystal) {return lava_crystal_burntime;}
        	if (fuel.getItem() == Item.getItemFromBlock(TechBlocks.lava_crystal_block)) {return lava_crystal_block_burntime;}
        }
        if (ConfigHandler.StoneTorch){
        	if (fuel.getItem() == Item.getItemFromBlock(TechBlocks.stone_torch)) {return stone_torch_burntime;}
        }

        return 0;
    }
}
