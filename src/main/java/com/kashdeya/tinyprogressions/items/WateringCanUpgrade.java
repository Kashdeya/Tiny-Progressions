package com.kashdeya.tinyprogressions.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class WateringCanUpgrade extends WateringCanBase {
	
	public WateringCanUpgrade(){
		super();
		this.setUnlocalizedName("WateringCanUpgrade");
		this.setWateringRange(2);
		this.setWateringChance(75);
	}

	@Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);
        if (stack.getItem() instanceof WateringCanUpgrade) {
            tooltip.add("A better way to water things!");
            tooltip.add("Waters a 5x5 area!");
            tooltip.add("");
        }
    }
}