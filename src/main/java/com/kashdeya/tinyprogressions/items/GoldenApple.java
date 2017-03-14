package com.kashdeya.tinyprogressions.items;

import java.util.List;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GoldenApple extends ItemFood
{
	  public GoldenApple(int amount, float saturation, boolean isWolfFood)
	  {
	    super(amount, saturation, isWolfFood);
	    this.setCreativeTab(tinyprogressions.tabTP);
	    this.setAlwaysEdible();
	    this.setUnlocalizedName("GoldenApple");
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
