package com.kashdeya.tinyprogressions.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class WateringCan extends WateringCanBase {
	
	public WateringCan(){
		super();
		this.setUnlocalizedName("WateringCan");
		this.setWateringRange(1);
		this.setWateringChance(25);
	}

	@Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);
        if (stack.getItem() instanceof WateringCan) {
            tooltip.add("Used to water things!");
            tooltip.add("Waters a 3x3 area!");
            tooltip.add("");
        }
    }
}