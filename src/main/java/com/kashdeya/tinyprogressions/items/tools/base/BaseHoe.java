package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;

public class BaseHoe extends HoeItem {
	
	public BaseHoe(IItemTier tier, float attackSpeed, Properties prop){
		super(tier, attackSpeed, prop.group(TinyProgressions.ToolsGroup));
	}
}
