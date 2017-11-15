package com.kashdeya.tinyprogressions.items;

import java.util.List;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MedKit extends Item {
	
	  public MedKit()
	  {
		  this.setCreativeTab(TinyProgressions.tabTP);
		  this.setUnlocalizedName("med_kit");
		  this.setMaxStackSize(ConfigHandler.healStack);
	  }
	  
	  @Override
	  public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
	    if (!playerIn.capabilities.isCreativeMode) {
	      playerIn.getHeldItem(handIn).setCount(playerIn.getHeldItem(handIn).getCount() - 1);
	    }
	    
	    playerIn.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, ConfigHandler.healDuration * 20, ConfigHandler.healLevel, false, false));
	    if (ConfigHandler.healinstant){
	    	playerIn.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 0, false, false));
	    }
	    
	    return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	  }
	  
	  @Override
	  @SideOnly(Side.CLIENT)
	  public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		  tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.medkit").getFormattedText());
	  }
}
