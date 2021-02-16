package com.kashdeya.tinyprogressions.util;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class InventoryHelper {
	
	public static void consumeItem(@Nullable PlayerEntity player, @Nonnull ItemStack item) {
		if (player == null || !player.isCreative()) {
			item.setCount(item.getCount() - 1);
			
			if (item.getCount() < 0)
				item.setCount(0);
		}
	}

}
