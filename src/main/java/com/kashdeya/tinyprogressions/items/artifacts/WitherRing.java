package com.kashdeya.tinyprogressions.items.artifacts;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WitherRing extends Item {
	
	public WitherRing() {
		super();
		this.setCreativeTab(TinyProgressions.tabTP);
	}
	
	
	public void onUpdate(ItemStack stack, World worldIn, Entity player, int itemSlot, boolean isSelected) {
		if(player instanceof EntityLivingBase && worldIn.isRemote)
			if(((EntityLivingBase) player).isPotionActive(MobEffects.WITHER))
				((EntityLivingBase) player).removePotionEffect(MobEffects.WITHER);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.EPIC;
	}
	
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack){
        return true;
    }
}
