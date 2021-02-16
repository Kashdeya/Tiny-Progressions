package com.kashdeya.tinyprogressions.items;

import net.minecraft.advancements.CriteriaTriggers;
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

public class DrinkBase extends FoodBase{
	
	SoundEvent sound = SoundEvents.ENTITY_PLAYER_BURP;
	
	public DrinkBase(Properties properties, Food food) {
		super(properties, food);
	}
	
	
	public DrinkBase setSound(SoundEvent soundIn) {
		this.sound = soundIn;
		return this;
	}

	@Override
	public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
    
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
    
		
		ActionResult<ItemStack> rtn = super.onItemRightClick(worldIn, playerIn, handIn);
		
		if(rtn.getType() == ActionResultType.FAIL)
			return rtn;
		
    	ItemStack stack = playerIn.getHeldItem(handIn);
    	
    	playerIn.getFoodStats().addStats(1, this.getFood().getSaturation());
        worldIn.playSound(null, playerIn.getPosition().getX(), playerIn.getPosition().getY(), playerIn.getPosition().getZ(), this.sound, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);

        //this.onFoodEaten(stack, worldIn, playerIn);
        

        if (playerIn instanceof ServerPlayerEntity)
        {
            CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayerEntity)playerIn, stack);
        }
        
        if (!playerIn.isCreative())
        {
            if (stack.isEmpty())
            {
                return new ActionResult<ItemStack> (ActionResultType.PASS, new ItemStack(Items.GLASS_BOTTLE));
            }

           	playerIn.inventory.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE));
        }

        stack.shrink(1);
        return  new ActionResult<ItemStack> (ActionResultType.FAIL, stack);
    }
	
}
