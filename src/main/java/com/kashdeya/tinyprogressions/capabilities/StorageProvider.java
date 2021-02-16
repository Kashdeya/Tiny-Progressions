package com.kashdeya.tinyprogressions.capabilities;

import javax.annotation.Nullable;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class StorageProvider implements  ICapabilityProvider , ICapabilitySerializable<CompoundNBT>
{
    @CapabilityInject(InventoryStorage.class)

    public final LazyOptional<ItemStackHandler> instance;
 
    public StorageProvider(ItemStackHandler handler)
    {
    	instance = LazyOptional.of(() -> handler); 
    }
    
    public boolean hasCapability(Capability<?> capability, @Nullable Direction facing)
    {
        return capability.equals(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY);
    }
    
	@SuppressWarnings("unchecked")
	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {

		if(cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			return (LazyOptional<T>) instance;
		
		return LazyOptional.empty();
	}

	@Override
	public CompoundNBT serializeNBT() {
		ItemStackHandler inv = instance.orElseGet(null);
		return inv.serializeNBT();
	}

	@Override
	public void deserializeNBT(CompoundNBT nbt) {
		ItemStackHandler inv = instance.orElseGet(null);
		inv.deserializeNBT(nbt);
	}


}