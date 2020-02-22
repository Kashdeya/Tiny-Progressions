package com.kashdeya.tinyprogressions.items.medkits;

import java.util.List;
import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import javafx.geometry.Side;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SmallMedkit extends Item {
	
	public SmallMedkit() {
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setTranslationKey("small_med_kit");
		this.setMaxStackSize(ConfigHandler.smallMedHealStack);
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		if (entityLiving instanceof EntityPlayer) {
			Random random = new Random();
			EntityPlayer entityplayer = (EntityPlayer)entityLiving;
			if (entityLiving.getHealth() < entityLiving.getMaxHealth()){
				this.onItemUse(stack, worldIn, entityplayer);
			}
	        worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.PLAYERS, 1.0F, 0.1F);
	        
	        if (entityplayer instanceof EntityPlayerMP)
            {
	        	if (entityLiving.getHealth() < entityLiving.getMaxHealth()){
	        		CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP)entityplayer, stack);
	        	}
            }
	    }
		
		if (entityLiving instanceof EntityPlayer && !((EntityPlayer)entityLiving).capabilities.isCreativeMode) {
			if (entityLiving.getHealth() < entityLiving.getMaxHealth()){
				stack.shrink(1);
			}
	    }
		return stack;
	}
	
	protected void onItemUse(ItemStack stack, World worldIn, EntityPlayer player) {
		if (player.getHealth() < player.getMaxHealth()){
			player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1 * 20, 0, false, false));
			player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, ConfigHandler.smallMedBoostTime * 20, 1, false, false));
		}
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
	    return ConfigHandler.smallMedDuration;
	}
	  
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
	    return EnumAction.BOW;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		if (playerIn.getHealth() < playerIn.getMaxHealth()){
			playerIn.setActiveHand(handIn);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
		}
		return new ActionResult<ItemStack>(EnumActionResult.FAIL, playerIn.getHeldItem(handIn));
	}
	  
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.medkit_1").getFormattedText());
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.smallmedkit_2").getFormattedText());
		tooltip.add(TextFormatting.RED + new TextComponentTranslation("tooltip.medkits").getFormattedText());
	}
	
}
