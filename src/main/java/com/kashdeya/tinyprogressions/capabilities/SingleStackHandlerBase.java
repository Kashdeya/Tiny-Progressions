package com.kashdeya.tinyprogressions.capabilities;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemHandlerHelper;

public abstract class SingleStackHandlerBase implements IItemHandlerModifiable
{
    @Override
    public int getSlots()
    {
        return 1;
    }
    
    @Override
    public void setStackInSlot(int index, ItemStack itemstack)
    {
        if(ItemStack.areItemsEqual(getStack(), itemstack))
            return;
        
        setStack(itemstack);
        onContentsChanged();
    }
    
    @Override
    public ItemStack getStackInSlot(int index)
    {
        return getStack();
    }
    
    @Override
    public ItemStack insertItem(int index, ItemStack input, boolean simulate)
    {
        if(input == null || input.isEmpty())
            return ItemStack.EMPTY;
        
        int limit = getStackLimit(input);
        
        if(limit <= 0)
            return input;
        
        ItemStack curStack = getStack();
        
        if(curStack != null && !curStack.isEmpty())
        {
            if(!ItemHandlerHelper.canItemStacksStack(input, curStack))
                return input;
            
            limit -= curStack.getCount();
            
            if(limit <= 0)
                return input;
        }
        
        boolean reachedLimit = input.getCount() > limit;
        
        input = input == null ? null : input.copy();
        
        if(!simulate)
        {
            if(curStack == null || curStack.isEmpty())
                setStack(reachedLimit ? ItemHandlerHelper.copyStackWithSize(input, limit) : input);
            else
            {
                curStack.grow(reachedLimit ? limit : input.getCount());
                setStack(curStack);
            }
            
            onContentsChanged();
        }
        
        return reachedLimit ? ItemHandlerHelper.copyStackWithSize(input, input.getCount() - 1) : ItemStack.EMPTY;
    }
    
    @Override
    public ItemStack extractItem(int index, int count, boolean simulate)
    {
        if(count == 0)
            return ItemStack.EMPTY;
        
        ItemStack existing = getStack();
        
        if(existing == null || existing.isEmpty())
            return ItemStack.EMPTY;
        
        int toExtract = count == 1 ? 1 : Math.min(count, existing.getMaxStackSize());
        
        if(existing.getCount() <= toExtract)
        {
            if(!simulate)
            {
                setStack(ItemStack.EMPTY);
                onContentsChanged();
            }
            
            return existing;
        }
        
        if(!simulate)
        {
            existing.shrink(toExtract);
            setStack(existing);
            onContentsChanged();
        }
        
        return ItemHandlerHelper.copyStackWithSize(existing, toExtract);
    }
    
    @Override
    public int getSlotLimit(int index)
    {
        return 64;
    }
    
    public boolean canInsertAll(ItemStack stack)
    {
        if(stack == null || stack.isEmpty())
            return false;
        
        ItemStack item = insertItem(0, stack, true);
        return item == null || item.isEmpty();
    }
    
    public boolean canExtractAll(int amount)
    {
        ItemStack item = extractItem(0, amount, true);
        return item != null && !item.isEmpty() && item.getCount() == amount;
    }
    
    public boolean isFull()
    {
        ItemStack curStack = getStack();
        return curStack != null && !curStack.isEmpty() && curStack.getCount() >= curStack.getMaxStackSize();
    }
    
    public boolean isEmpty()
    {
        ItemStack curStack = getStack();
        return curStack == null || curStack.isEmpty();
    }
    
    public int getStackLevel()
    {
        ItemStack curStack = getStack();
        return (curStack == null || curStack.isEmpty()) ? 0 : curStack.getCount();
    }
    
    protected int getStackLimit(@Nonnull ItemStack itemstack)
    {
        return itemstack.getMaxStackSize();
    }
    
    protected void onContentsChanged()
    {
    }
    
    public abstract ItemStack getStack();
    public abstract void setStack(ItemStack itemstack);
    public abstract String getSlotKey();
}
