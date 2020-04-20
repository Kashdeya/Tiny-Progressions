package com.kashdeya.tinyprogressions.items.medkits;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SmallBandage extends ItemBase {
	
	public SmallBandage() {
		super(new Properties().maxStackSize(ConfigHandler.smallBandageHealStack).group(TinyProgressions.ToolsGroup));
	}
	
	@Override
	   public int getUseDuration(ItemStack stack) {
	    return 4;
	}
	  
	@Override
	public UseAction getUseAction(ItemStack stack) {
	    return UseAction.NONE;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn,Hand handIn) {
	    if (!playerIn.isCreative() && playerIn.getHealth() < playerIn.getMaxHealth()) {
	      playerIn.getHeldItem(handIn).setCount(playerIn.getHeldItem(handIn).getCount() - 1);
	      ((PlayerEntity) playerIn).addPotionEffect(new EffectInstance(Effects.REGENERATION, ConfigHandler.smallBandageRegen * 20, 0, false, false));
	      return new ActionResult<ItemStack>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
	    }
	    return new ActionResult<ItemStack>(ActionResultType.FAIL, playerIn.getHeldItem(handIn));
	}
	  
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.bandage_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
		tooltip.add(new TranslationTextComponent("tooltip.bandage_2").setStyle(new Style().setColor(TextFormatting.YELLOW)));
		tooltip.add(new TranslationTextComponent("tooltip.medkits").setStyle(new Style().setColor(TextFormatting.YELLOW)));
	}
	
}
