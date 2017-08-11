package com.kashdeya.tinyprogressions.capabilities;

import net.minecraft.inventory.IInventory;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

public interface IStorage extends IInventory
{
    @CapabilityInject(IStorage.class)
    public static Capability<IStorage> INSTANCE = null;
 
    default void writeToNBT(NBTTagCompound compound)
    {
    }
 
    default void readFromNBT(NBTTagCompound compound)
    {
    }
}
