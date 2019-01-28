package com.kashdeya.tinyprogressions.capabilities;

import javax.annotation.Nullable;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.items.CapabilityItemHandler;

public class StorageProvider implements ICapabilitySerializable<NBTTagCompound>, Capability.IStorage<IStorage<?>>
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
    
    @Override
    public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing)
    {
        return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY;
    }
 
	@Override
    @SuppressWarnings("unchecked")
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing)
    {
        return hasCapability(capability, facing) ? (T)instance : null;
    }
 
    @Override
    public NBTBase writeNBT(Capability<IStorage<?>> capability, IStorage<?> instance, EnumFacing side)
    {
        return serializeNBT();
    }
 
    @Override
    public void readNBT(Capability<IStorage<?>> capability, IStorage<?> instance, EnumFacing facing, NBTBase nbt)
    {
        deserializeNBT((NBTTagCompound)nbt);
    }

    @Override
    public NBTTagCompound serializeNBT()
    {
        NBTTagCompound compound = new NBTTagCompound();
        instance.writeToNBT(compound);
        return compound;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt)
    {
        instance.readFromNBT(nbt);
    }
}