package com.kashdeya.tinyprogressions.capabilities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.util.Constants;

public class Storage implements IStorage
{
    private final String name;
    private ItemStack[] contents;
    
    public Storage(int inventorySize)
    {
        this("", inventorySize);
    }
 
    public Storage(String name, int inventorySize)
    {
        this.name = name;
        contents = new ItemStack[inventorySize];
    }
 
    @Override
    public String getName()
    {
        return name;
    }
 
    @Override
    public boolean hasCustomName()
    {
        return name != null;
    }
 
    @Override
    public ITextComponent getDisplayName()
    {
        return new TextComponentTranslation(name);
    }
 
    @Override
    public void writeToNBT(NBTTagCompound compound)
    {
        NBTTagList list = new NBTTagList();
 
        for(int i = 0; i < getSizeInventory(); i++)
        {
            ItemStack itemstack = getStackInSlot(i);
 
            if(itemstack == null || itemstack.isEmpty())
                continue;
 
            NBTTagCompound item = new NBTTagCompound();
            item.setInteger("Slot", i);
            itemstack.writeToNBT(item);
 
            list.appendTag(item);
        }
 
        compound.setTag("Inventory", list);
    }
 
    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        NBTTagList list = compound.getTagList("Inventory", Constants.NBT.TAG_COMPOUND);
 
        for(int i = 0; i < list.tagCount(); i++)
        {
            NBTTagCompound item = list.getCompoundTagAt(i);
            int slot = item.getInteger("Slot");
 
            if(slot < 0 || slot >= getSizeInventory())
                continue;
 
            setInventorySlotContents(slot, new ItemStack(item));
        }
    }
 
    @Override
    public int getSizeInventory()
    {
        return contents.length;
    }
 
    @Override
    public ItemStack getStackInSlot(int slot)
    {
        if(slot < 0 || slot >= getSizeInventory())
            return ItemStack.EMPTY;
 
        ItemStack itemstack = contents[slot];
 
        if(itemstack == null)
        {
            contents[slot] = ItemStack.EMPTY;
            return contents[slot];
        }
 
        return itemstack;
    }
    
    @Override
    public ItemStack removeStackFromSlot(int slot)
    {
        ItemStack itemstack = getStackInSlot(slot);
        setInventorySlotContents(slot, null);
        return itemstack;
    }
 
    @Override
    public ItemStack decrStackSize(int slot, int count)
    {
        ItemStack itemstack = getStackInSlot(slot);
 
        if(itemstack == null || itemstack.isEmpty())
            return ItemStack.EMPTY;
 
        if(itemstack.getCount() >= count)
        {
            itemstack = itemstack.splitStack(count);
            markDirty();
        }
        else
            removeStackFromSlot(slot);
 
        return itemstack;
    }
 
    @Override
    public void setInventorySlotContents(int slot, ItemStack itemstack)
    {
        if(itemstack == null)
            itemstack = ItemStack.EMPTY;
 
        if(itemstack.getCount() > getInventoryStackLimit())
            itemstack.setCount(getInventoryStackLimit());
 
        contents[slot] = itemstack;
    }
 
    @Override
    public int getInventoryStackLimit()
    {
        return 64;
    }
 
    @Override
    public boolean isUsableByPlayer(EntityPlayer player)
    {
        return true;
    }
 
    @Override
    public boolean isItemValidForSlot(int slot, ItemStack itemstack)
    {
        return true;
    }
 
    @Override
    public boolean isEmpty()
    {
        for(int i = 0; i < getSizeInventory(); i++)
        {
            ItemStack itemstack = getStackInSlot(i);
 
            if(itemstack != null && !itemstack.isEmpty())
                return false;
        }
 
        return true;
    }
 
    @Override
    public void clear()
    {
        for(int i = 0; i < getSizeInventory(); i++)
            removeStackFromSlot(i);
    }
 
    @Override
    public void markDirty()
    {
    }
 
    @Override
    public void openInventory(EntityPlayer player)
    {
    }
 
    @Override
    public void closeInventory(EntityPlayer player)
    {
    }
 
    @Override
    public int getField(int id)
    {
        return 0;
    }
 
    @Override
    public void setField(int id, int value)
    {
    }
 
    @Override
    public int getFieldCount()
    {
        return 0;
    }
}