package com.kashdeya.tinyprogressions.util;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class InventoryHelper {
	
	public static void consumeItem(@Nullable EntityPlayer player, @Nonnull ItemStack item) {
		if (player == null || !player.capabilities.isCreativeMode) {
			--item.stackSize;
			if (item.stackSize < 0)
				item.stackSize = 0;
		}
	}

}
