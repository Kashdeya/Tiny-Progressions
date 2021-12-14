package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class DrinkBase extends FoodBase {

	SoundEvent sound = SoundEvents.PLAYER_BURP;

	public DrinkBase(Properties properties, Food food) {
		super(properties.tab(TinyProgressions.FoodGroup), food);
	}

	public DrinkBase setSound(SoundEvent soundIn) {
		this.sound = soundIn;
		return this;
	}

	@Override
	public UseAction getUseAnimation(ItemStack p_77661_1_) {
		return UseAction.DRINK;
	}

	public ItemStack finishUsingItem(ItemStack stack, World worldIn, LivingEntity playerIn) {

		if (!(playerIn instanceof PlayerEntity))
			return stack;

		PlayerEntity player = (PlayerEntity) playerIn;

		ItemStack stackback = super.finishUsingItem(stack, worldIn, playerIn);
		worldIn.playSound(null, playerIn.position().x, playerIn.position().y, playerIn.position().z, this.sound,
				SoundCategory.PLAYERS, 0.5F, worldIn.random.nextFloat() * 0.1F + 0.9F);

		if (playerIn instanceof ServerPlayerEntity) {
			CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayerEntity) playerIn, stack);
		}

		if (!player.isCreative()) {
			player.inventory.add(new ItemStack(Items.GLASS_BOTTLE));
			return stack;
		}

		return stackback;
	}

}
