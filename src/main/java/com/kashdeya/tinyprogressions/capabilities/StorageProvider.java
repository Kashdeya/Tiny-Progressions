package com.kashdeya.tinyprogressions.capabilities;

import javax.annotation.Nullable;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;

public class StorageProvider implements ICapabilitySerializable<CompoundNBT>, Capability.IStorage<IStorage<?>>
{
    @CapabilityInject(InventoryStorage.class)
    public static Capability<InventoryStorage> TYPE;
    private LazyOptional<InventoryStorage> instance = LazyOptional.of(TYPE::getDefaultInstance);;
 
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
        instance = LazyOptional.of(()->new InventoryStorage(name, inventorySize));
    }
    
    public boolean hasCapability(Capability<?> capability, @Nullable Direction facing)
    {
        return capability.equals(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY);
    }
    
    
	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        return hasCapability(cap, side) ? instance.cast() : LazyOptional.empty();
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
        InventoryStorage storage = instance.orElse(null);
        if(storage != null)
        	storage.writeToNBT(compound);
        
        return compound;
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt)
    {
        InventoryStorage storage = instance.orElse(null);
        if(storage != null)
        	storage.readFromNBT(nbt);
    }

    

}