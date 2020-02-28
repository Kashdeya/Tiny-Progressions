package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class BaseAxe extends AxeItem{
	
//	static {
//
//		BaseAxe flintAxe =    new BaseAxe(ItemToolModTier.FLINT, 0, 0, new Properties());
//		BaseAxe boneAxe =     new BaseAxe(ItemToolModTier.BONE, 0, 0, new Properties());
//		BaseAxe emeraldAxe =  new BaseAxe(ItemToolModTier.EMERALD, 0, 0, new Properties());
//		BaseAxe obsidianAxe = new BaseAxe(ItemToolModTier.OBSIDIAN, 0, 0, new Properties());
//		BaseAxe wubAxe =      new BaseAxe(ItemToolModTier.WUBWUB, 0, 0, new Properties());
//		
//		BaseAxe seaIronAxe =  new BaseAxe(ItemToolModTier.SEAIRON, 0, 0, new Properties());
//		
//		BaseAxe BscDiamondAxe =  new BaseAxe(ItemToolModTier.BSCDIAMOND, 0, 0, new Properties());
//		BaseAxe BscGoldAxe =     new BaseAxe(ItemToolModTier.BSCGOLD, 0, 0, new Properties());
//		BaseAxe BscIronAxe =     new BaseAxe(ItemToolModTier.BSCIRON, 0, 0, new Properties());
//	} 
	
	
	public BaseAxe(IItemTier material, float damage, float speed, Properties prop){
		super(material, damage, speed, prop);
		
		prop.group(TinyProgressions.TAB)
			.maxStackSize(1);
	}
}
