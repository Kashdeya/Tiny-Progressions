package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class BasePickaxe extends PickaxeItem {

	public BasePickaxe(IItemTier tier, int maxDamage, float attackSpeed, Properties prop){
		super(tier, maxDamage, attackSpeed, prop.group(TinyProgressions.ToolsGroup));

	}
}

