package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.IExtendedReach;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class BaseSpear extends SwordItem implements IExtendedReach {
	

	static {
		BaseSpear emeraldSpear =  new BaseSpear(ItemToolModTier.EMERALD, 0, 0, new Properties());
		BaseSpear obsidianSpear  = new BaseSpear(ItemToolModTier.OBSIDIAN, 0, 0, new Properties());
	}
	
	
	public BaseSpear(IItemTier tier, int maxDamage, float attackSpeed, Properties prop){
		super(tier, maxDamage, attackSpeed, prop.group(TinyProgressions.TAB));

	}
	
	@Override	
	public float getReach() {
		return ConfigHandler.spear_reach;
	}
}
