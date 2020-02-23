package com.kashdeya.tinyprogressions.items.tools.base;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class BaseAxe extends AxeItem{
	
	public BaseAxe(IItemTier material, float damage, float speed, Properties prop){
		super(material, damage, speed, prop);
	}
}
