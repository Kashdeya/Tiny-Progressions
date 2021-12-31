package com.kashdeya.tinyprogressions.items.medkits;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class LargeMedKit extends ItemBase {
	
	public LargeMedKit() {
		super(new Properties().stacksTo(ConfigHandler.LargeMedHealStack).tab(TinyProgressions.ToolsGroup));
	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		if (entityLiving instanceof PlayerEntity) {
			Random random = new Random();
			PlayerEntity PlayerEntity = (PlayerEntity)entityLiving;
			if (entityLiving.getHealth() < entityLiving.getMaxHealth()){
				this.onItemUse(stack, worldIn, PlayerEntity);
			}
	        worldIn.playSound((PlayerEntity)null, PlayerEntity.position().x, PlayerEntity.position().y, PlayerEntity.position().z, SoundEvents.ARMOR_EQUIP_GENERIC, SoundCategory.PLAYERS, 1.0F, 0.1F);
	        
	        if (PlayerEntity instanceof ServerPlayerEntity)
            {
	        	if (entityLiving.getHealth() < entityLiving.getMaxHealth()){
	        		CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayerEntity)PlayerEntity, stack);
	        	}
            }
	    }
		
		if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).isCreative()) {
			if (entityLiving.getHealth() < entityLiving.getMaxHealth()){
				stack.shrink(1);
			}
	    }
		return stack;
	}
	
	protected void onItemUse(ItemStack stack, World worldIn, PlayerEntity player) {
		if (player.getHealth() < player.getMaxHealth()){
			player.addEffect(new EffectInstance(Effects.HEAL, 1 * 20, 0, false, false));
			player.addEffect(new EffectInstance(Effects.HEALTH_BOOST, ConfigHandler.largeMedBoostTime * 20, 2, false, false));
		}
		// Saving for a later date
		//player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(22);
	}
	
	
	@Override
	   public int getUseDuration(ItemStack stack) {
	    return ConfigHandler.LargeMedDuration;
	}
	  
	@Override
	public UseAction getUseAnimation(ItemStack stack) {
	    return UseAction.BOW;
	}
	
	@Override
	public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if (playerIn.getHealth() < playerIn.getMaxHealth()){
			playerIn.startUsingItem(handIn);
			return new ActionResult<ItemStack>(ActionResultType.SUCCESS, playerIn.getItemInHand(handIn));
		}
		return new ActionResult<ItemStack>(ActionResultType.FAIL, playerIn.getItemInHand(handIn));
	}
	  
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.medkit_1"));
		tooltip.add(new TranslationTextComponent("tooltip.largemedkit_2"));
		tooltip.add(new TranslationTextComponent("tooltip.medkits"));
	}
	
}
