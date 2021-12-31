package com.kashdeya.tinyprogressions.items.medkits;

import java.util.List;

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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SmallMedkit extends ItemBase {
	
	public SmallMedkit() {
		super(new Properties().stacksTo(ConfigHandler.smallMedHealStack).tab(TinyProgressions.ToolsGroup));
	}
	
	@Override
	 public void releaseUsing(ItemStack p_77615_1_, World p_77615_2_, LivingEntity p_77615_3_, int p_77615_4_) {
		System.out.println("test");
		super.releaseUsing(p_77615_1_, p_77615_2_, p_77615_3_, p_77615_4_);
	 }
	
	
	@Override
	public ItemStack finishUsingItem(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		System.out.println("test");
		if (entityLiving instanceof PlayerEntity) {
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
			player.addEffect(new EffectInstance(Effects.HEALTH_BOOST, ConfigHandler.smallMedBoostTime * 20, 1, false, false));
		}
	}
	
	@Override
	public int getUseDuration(ItemStack stack) {
	    return ConfigHandler.smallMedDuration;
//		return 72000;
	}
	  
	  
	@Override
	public UseAction getUseAnimation(ItemStack stack) {
	    return UseAction.BOW;
	}
	
	
	@Override
	public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if (playerIn.getHealth() < playerIn.getMaxHealth()){
//			playerIn.setActiveHand(handIn);
			System.out.println("worked");
			playerIn.startUsingItem(handIn);
			return ActionResult.consume(playerIn.getItemInHand(handIn));
		}
		System.out.println("fail");
		
		return ActionResult.fail(playerIn.getItemInHand(handIn));
	}
	  
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.medkit_1"));
		tooltip.add(new TranslationTextComponent("tooltip.smallmedkit_2"));
		tooltip.add(new TranslationTextComponent("tooltip.medkits"));
	}
	
}
