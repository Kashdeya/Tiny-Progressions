package com.kashdeya.tinyprogressions.capabilities;

import javax.annotation.Nullable;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;

public class StorageProvider implements ICapabilitySerializable<CompoundNBT>, Capability.IStorage<IStorage<?>>
{
    private final InventoryStorage instance;
 
    public StorageProvider()
    {
        this(0);
    }
    
    public StorageProvider(int inventorySize)
    {
        this(null, inventorySize);
    }
    
    public StorageProvider(String name, int inventorySize)
    {
        instance = new InventoryStorage(name, inventorySize);
    }
    
    public boolean hasCapability(Capability<?> capability, @Nullable Direction facing)
    {
        return capability.equals(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY);
    }
    
    
	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        return hasCapability(cap, side) ? cap : null;
    }
 
	@Override
	public INBT writeNBT(Capability<IStorage<?>> capability, IStorage<?> instance, Direction side) {
        return serializeNBT();
    }
 

	@Override
	public void readNBT(Capability<IStorage<?>> capability, IStorage<?> instance, Direction side, INBT nbt) {
        deserializeNBT((CompoundNBT)nbt);
    }

    @Override
    public CompoundNBT serializeNBT()
    {
    	CompoundNBT compound = new CompoundNBT();
        instance.writeToNBT(compound);
        return compound;
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt)
    {
        instance.readFromNBT(nbt);
    }

    

}