package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class BasePickaxe extends PickaxeItem {
	
	static {

		BasePickaxe flintPickAxe =    new BasePickaxe(ItemToolModTier.FLINT, 0, 0, new Properties());
		BasePickaxe bonePickAxe =     new BasePickaxe(ItemToolModTier.BONE, 0, 0, new Properties());
		BasePickaxe emeraldPickAxe =  new BasePickaxe(ItemToolModTier.EMERALD, 0, 0, new Properties());
		BasePickaxe obsidianPickAxe = new BasePickaxe(ItemToolModTier.OBSIDIAN, 0, 0, new Properties());
		BasePickaxe wubPickAxe =      new BasePickaxe(ItemToolModTier.WUBWUB, 0, 0, new Properties());
		
		BasePickaxe seaIronPickAxe =  new BasePickaxe(ItemToolModTier.SEAIRON, 0, 0, new Properties());
		
		BasePickaxe BscDiamondPickAxe =  new BasePickaxe(ItemToolModTier.BSCDIAMOND, 0, 0, new Properties());
		BasePickaxe BscGoldPickAxe =     new BasePickaxe(ItemToolModTier.BSCGOLD, 0, 0, new Properties());
		BasePickaxe BscIronPickAxe =     new BasePickaxe(ItemToolModTier.BSCIRON, 0, 0, new Properties());
		
		BasePickaxe kappaPick = new BasePickaxe(ItemToolModTier.KAPPA, ConfigHandler.kappa_damage, 0, new Properties());
	} 
	
	public BasePickaxe(IItemTier tier, int maxDamage, float attackSpeed, Properties prop){
		super(tier, maxDamage, attackSpeed, prop);
		prop.group(TinyProgressions.TAB)
		.maxStackSize(1);
	}
}
