package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class BaseAxe extends AxeItem{

	public BaseAxe(IItemTier material, float damage, float speed, Properties prop){
		super(material, damage, speed, prop.group(TinyProgressions.ToolsGroup));
	}
}
