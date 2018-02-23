package com.kashdeya.tinyprogressions.items.medkits;

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

public class SmallBandage extends Item {
	
	public SmallBandage() {
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setUnlocalizedName("small_bandage");
		this.setMaxStackSize(ConfigHandler.smallBandageHealStack);
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
	    return 4;
	}
	  
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
	    return EnumAction.NONE;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
	    if (!playerIn.capabilities.isCreativeMode && playerIn.getHealth() < playerIn.getMaxHealth()) {
	      playerIn.getHeldItem(handIn).setCount(playerIn.getHeldItem(handIn).getCount() - 1);
	      playerIn.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, ConfigHandler.smallBandageRegen * 20, 0, false, false));
	      return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	    }
	    return new ActionResult<ItemStack>(EnumActionResult.FAIL, playerIn.getHeldItem(handIn));
	}
	  
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.bandage_1").getFormattedText());
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.bandage_2").getFormattedText());
		tooltip.add(TextFormatting.RED + new TextComponentTranslation("tooltip.medkits").getFormattedText());
	}
	
}
