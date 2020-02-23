package com.kashdeya.tinyprogressions.items.misc;

import com.kashdeya.tinyprogressions.capabilities.StorageProvider;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fml.network.NetworkHooks;

public class Pouch extends ItemBase  implements INamedContainerProvider 
{
    public Pouch()
    {
    	super(new Properties().maxStackSize(1));
    }
    
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, CompoundNBT nbt)
    {
        return new StorageProvider(String.format("%s.name", stack.getTranslationKey().substring(5)), 54);
    }
     
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand)
    {
    	ItemStack itemstack = player.getHeldItem(hand);
       // player.openGui(TinyProgressions.INSTANCE, 0, world, 0, 0, 0);
    	if(!world.isRemote) {
    		NetworkHooks.openGui((ServerPlayerEntity) player, this);
    		return ActionResult.newResult(ActionResultType.SUCCESS, player.getHeldItem(hand));
    	}
    	return new ActionResult<>(ActionResultType.FAIL, itemstack);
    }

	@Override
	public Container createMenu(int arg0, PlayerInventory arg1, PlayerEntity arg2) {
		// TODO not sure where its suppose to go yet
//		player.openGui(TinyProgressions.INSTANCE, 0, world, 0, 0, 0);
		return null;
	}

	@Override
	public ITextComponent getDisplayName() {
		return null;
	}
}
