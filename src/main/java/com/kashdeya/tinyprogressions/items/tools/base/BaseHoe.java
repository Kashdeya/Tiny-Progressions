package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item.Properties;

public class BaseHoe extends HoeItem {
	
	
	static {

		BaseHoe flintHoe =    new BaseHoe(ItemToolModTier.FLINT, 0, new Properties());
		BaseHoe boneHoe =     new BaseHoe(ItemToolModTier.BONE, 0, new Properties());
		BaseHoe emeraldHoe =  new BaseHoe(ItemToolModTier.EMERALD, 0, new Properties());
		BaseHoe obsidianHoe = new BaseHoe(ItemToolModTier.OBSIDIAN, 0, new Properties());
		BaseHoe wubHoe =      new BaseHoe(ItemToolModTier.WUBWUB, 0, new Properties());
		
		BaseHoe BscDiamondAxe =  new BaseHoe(ItemToolModTier.BSCDIAMOND, 0, new Properties());
		BaseHoe BscGoldAxe =     new BaseHoe(ItemToolModTier.BSCGOLD, 0, new Properties());
		BaseHoe BscIronAxe =     new BaseHoe(ItemToolModTier.BSCIRON, 0, new Properties());
		
	} 
	
	
	
	public BaseHoe(IItemTier tier, float attackSpeed, Properties prop){
		super(tier, attackSpeed, prop);
		
		prop.group(TinyProgressions.TAB)
		.maxStackSize(1);
	}
}
