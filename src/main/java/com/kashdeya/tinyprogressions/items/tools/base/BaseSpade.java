package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.common.ToolType;

public class BaseSpade extends ShovelItem {
	
	static {

		BaseSpade flintSpade =    new BaseSpade(ItemToolModTier.FLINT, 0, 0, new Properties());
		BaseSpade boneSpade =     new BaseSpade(ItemToolModTier.BONE, 0, 0, new Properties());
		BaseSpade emeraldSpade =  new BaseSpade(ItemToolModTier.EMERALD, 0, 0, new Properties());
		BaseSpade obsidianSpade = new BaseSpade(ItemToolModTier.OBSIDIAN, 0, 0, new Properties());
		BaseSpade wubSpade =      new BaseSpade(ItemToolModTier.WUBWUB, 0, 0, new Properties());
		
		BaseSpade BscDiamondSpade =  new BaseSpade(ItemToolModTier.BSCDIAMOND, 0, 0, new Properties());
		BaseSpade BscGoldSpade =     new BaseSpade(ItemToolModTier.BSCGOLD, 0, 0, new Properties());
		BaseSpade BscIronSpade =     new BaseSpade(ItemToolModTier.BSCIRON, 0, 0, new Properties());
	} 
	
	
	
	
	public BaseSpade(IItemTier tier, int maxDamage, float attackSpeed, Properties prop){
		super(tier, maxDamage, attackSpeed, prop);
		
		prop.group(TinyProgressions.TAB)
			.maxStackSize(1);
	}
}
