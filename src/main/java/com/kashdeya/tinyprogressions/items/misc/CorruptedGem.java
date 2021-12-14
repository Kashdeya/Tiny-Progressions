package com.kashdeya.tinyprogressions.items.misc;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.items.ItemBase;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CorruptedGem extends ItemBase {
	
	public CorruptedGem(Properties properties) {
		super(new Properties().stacksTo(1));
	}
	
	public void onUpdate(ItemStack stack, World worldIn, Entity player, int itemSlot, boolean isSelected) {
		if(player instanceof PlayerEntity)
			((PlayerEntity) player).addEffect(new EffectInstance(Effects.POISON, 30 * 20, 0, true, true));
	}
	
	
	
   @Override
   @OnlyIn(Dist.CLIENT)
   public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.warning_1"));
		tooltip.add(new TranslationTextComponent("tooltip.gem_1"));
	}
}
