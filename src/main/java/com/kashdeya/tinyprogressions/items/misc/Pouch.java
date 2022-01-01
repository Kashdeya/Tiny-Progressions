package com.kashdeya.tinyprogressions.items.misc;

import com.kashdeya.tinyprogressions.capabilities.InventoryStorage;
import com.kashdeya.tinyprogressions.capabilities.StorageProvider;
import com.kashdeya.tinyprogressions.container.PouchContainer;
import com.kashdeya.tinyprogressions.items.ItemBase;

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
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fml.network.NetworkHooks;

public class Pouch extends ItemBase  implements INamedContainerProvider 
{
    public Pouch()
    {
    	super(new Properties().stacksTo(1));
    }
    
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, CompoundNBT nbt)
    {
        return new StorageProvider(new InventoryStorage(54));
    }
     
    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand)
    {
    	ItemStack itemstack = player.getItemInHand(hand);
    	if(!world.isClientSide()) {
    		NetworkHooks.openGui((ServerPlayerEntity) player, this);
    		return new ActionResult<>(ActionResultType.SUCCESS, player.getItemInHand(hand));
    	}
    	return new ActionResult<>(ActionResultType.FAIL, itemstack);
    }

	@Override
	public Container createMenu(int id, PlayerInventory playerInv, PlayerEntity playerEntity) {
		return new PouchContainer(id, playerInv, playerEntity);
	}

	@Override
	public ITextComponent getDisplayName() {
		return new StringTextComponent(this.getRegistryName().getPath());
	}


}
