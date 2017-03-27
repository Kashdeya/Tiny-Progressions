package com.kashdeya.tinyprogressions.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

public class GoldenApple extends ItemFood
{
	  public GoldenApple(int amount, float saturation, boolean isWolfFood)
	  {
	    super(amount, saturation, isWolfFood);
	    this.setCreativeTab(TinyProgressions.tabTP);
	    this.setAlwaysEdible();
	    this.setUnlocalizedName("golden_apple");
	  }
	  
	  @Override
	  public boolean hasEffect(ItemStack Stack)
	  {
	    return true;
	  }
	  
	  @Override
	  public EnumRarity getRarity(ItemStack Stack)
	  {
	    return EnumRarity.EPIC;
	  }
	  
	  @Override
	  protected void onFoodEaten(ItemStack Stack, World World, EntityPlayer Player)
	  {
	    if (!World.isRemote)
	    {
	    	Player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 3000, 0));
	    	Player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 225, 1));
            Player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 1));
	    }
	}
}
