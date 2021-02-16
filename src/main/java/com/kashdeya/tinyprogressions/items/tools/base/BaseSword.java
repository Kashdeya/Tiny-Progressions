package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class BaseSword extends SwordItem {
	
	static {

		BaseSword flintSword =    new BaseSword(ItemToolModTier.FLINT, 0, 0, new Properties());
		BaseSword boneSword =     new BaseSword(ItemToolModTier.BONE, 0, 0, new Properties());
		BaseSword emeraldSword =  new BaseSword(ItemToolModTier.EMERALD, 0, 0, new Properties());
		BaseSword obsidianSword = new BaseSword(ItemToolModTier.OBSIDIAN, 0, 0, new Properties());
		BaseSword wubSword =      new BaseSword(ItemToolModTier.WUBWUB, 0, 0, new Properties());
		
		SwordItem BscDiamondSword =  new SwordItem(ItemToolModTier.BSCDIAMOND, 0, 0, new Properties());
		SwordItem BscGoldSword =     new SwordItem(ItemToolModTier.BSCGOLD, 0, 0, new Properties());
		SwordItem BscIronSword =     new SwordItem(ItemToolModTier.BSCIRON, 0, 0, new Properties());
	} 
	
	
	public BaseSword(IItemTier tier, int maxDamage, float attackSpeed, Properties prop){
		super(tier, maxDamage, attackSpeed, prop.group(TinyProgressions.combatGroup));

	}
}
