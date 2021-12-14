package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;

public class BaseHoe extends HoeItem {
	
	public BaseHoe(IItemTier tier, int attackDamage, float attackSpeed, Properties prop){
		super(tier, attackDamage, attackSpeed, prop.tab(TinyProgressions.ToolsGroup));
	}
}
