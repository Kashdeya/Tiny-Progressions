package com.kashdeya.tinyprogressions.items.apple;

import java.util.List;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EmeraldApple extends ItemFood
{
	  public EmeraldApple(int amount, float saturation, boolean isWolfFood)
	  {
	    super(amount, saturation, isWolfFood);
	    this.setCreativeTab(TinyProgressions.tabTP);
	    this.setAlwaysEdible();
	    this.setUnlocalizedName("emerald_apple");
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
	      Player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 300, 0, true, false));
	      Player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 300, 0, true, false));
	      Player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 120, 0, true, false));
	    }
	  }
	  
	  @Override
	  @SideOnly(Side.CLIENT)
	  @SuppressWarnings({ "unchecked", "rawtypes" })
	  public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag) {
		  list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.emerald_apple_1").getFormattedText());
		  list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.emerald_apple_2").getFormattedText());
		  list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.emerald_apple_3").getFormattedText());
	  }
}
