package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.IExtendedReach;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.world.World;

public class BaseSpear extends SwordItem implements IExtendedReach {
	

	
	public BaseSpear(IItemTier tier, int maxDamage, float attackSpeed, Properties prop){
		super(tier, maxDamage, attackSpeed, prop.group(TinyProgressions.TAB));

	}
	
   public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
	   if(isSelected && entityIn instanceof PlayerEntity &&  !this.hasReach((PlayerEntity) entityIn)) {
		   this.extendReach((PlayerEntity) entityIn);
	   }
	   else if(!isSelected && entityIn instanceof PlayerEntity && this.hasReach((PlayerEntity) entityIn)) {
		   this.removeReach((PlayerEntity) entityIn);
	   }
   }
	
	@Override	
	public float getReach() {
		return ConfigHandler.spear_reach;
	}
}
