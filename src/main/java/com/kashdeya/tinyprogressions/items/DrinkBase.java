package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

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
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class DrinkBase extends FoodBase{
	
	public DrinkBase(Properties properties, Food food) {
		super(properties, food);
	}
	

	@Override
	public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
    
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
    
    	ItemStack stack = playerIn.getHeldItem(handIn);
    	
    	//TODO update the stats stuff?
    	//playerIn.getFoodStats().addStats(this, stack);
        worldIn.playSound(null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
        
        //TODO ????
        //this.onFoodEaten(stack, worldIn, playerIn);
        
        //TODOupdate the stats stuff?
//        playerIn.addStat(StatList.getObjectUseStats(this));

        if (playerIn instanceof ServerPlayerEntity)
        {
            CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayerEntity)playerIn, stack);
        }
        
        if (!playerIn.isCreative())
        {
            if (stack.isEmpty() && ConfigHandler.JuiceBottles)
            {
                return new ActionResult<ItemStack> (ActionResultType.PASS, new ItemStack(Items.GLASS_BOTTLE));
            }

            if (ConfigHandler.JuiceBottles)
            {
            	playerIn.inventory.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE));
            }
        }

        stack.shrink(1);
        return  new ActionResult<ItemStack> (ActionResultType.FAIL, stack);
    }
	
}
