package com.kashdeya.tinyprogressions.items.apple;

import java.util.List;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
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

public class IronApple extends ItemFood
{
	  public IronApple(int amount, float saturation, boolean isWolfFood)
	  {
	    super(amount, saturation, isWolfFood);
	    this.setCreativeTab(TinyProgressions.tabTP);
	    this.setAlwaysEdible();
	    this.setUnlocalizedName("iron_apple");
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
	      Player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 300, 0, true, false));
	      Player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 20, 0, true, false));
	    }
	  }
	  
	  @Override
	  @SideOnly(Side.CLIENT)
	  public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		  tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.iron_apple_1").getFormattedText());
		  tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.iron_apple_2").getFormattedText());
	  }
}