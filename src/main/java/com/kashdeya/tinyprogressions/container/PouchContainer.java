package com.kashdeya.tinyprogressions.container;

import com.kashdeya.tinyprogressions.capabilities.IStorage;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class PouchContainer extends Container
{
    private final IStorage storage;
    private final int currentSlot;
    
    public PouchContainer(IStorage storage, EntityPlayer player)
    {
        this.storage = storage;
        currentSlot = player.inventory.currentItem;
        
        for(int x = 0; x < 9; x++)
            addSlotToContainer(new Slot(player.inventory, x, 8 + x * 18, 198));
 
        for(int y = 0; y < 3; y++)
            for(int x = 0; x < 9; x++)
                addSlotToContainer(new Slot(player.inventory, 9 + x + y * 9, 8 + x * 18, 140 + y * 18));
 
        for(int y = 0; y < 6; y++)
            for(int x = 0; x < 9; x++)
                addSlotToContainer(new SlotPouch(storage, x + y * 9, 8 + x * 18, 18 + y * 18));
    }
 
    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return true;
    }
    
    @Override
    public ItemStack slotClick(int slotId, int dragType, ClickType clickTypeIn, EntityPlayer player)
    {
        if(slotId == currentSlot)
            return ItemStack.EMPTY;
        
        return super.slotClick(slotId, dragType, clickTypeIn, player);
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int index)
    {
        Slot slot = getSlot(index);
 
        if(slot == null || !slot.getHasStack())
            return null;
 
        ItemStack itemstack = slot.getStack();
        ItemStack returned = itemstack.copy();
 
        if(index >= 36)
        {
            // N.B. We've clicked outside of the Player's Inventory
            //  The player's slots are added first, so are index 0-35.
            //  We clicked in our Inventory so try and move the Item
            //  back into the Player's Inventory
            if(!mergeItemStack(itemstack, 0, 36, false))
                return ItemStack.EMPTY;
        }
        else
        {
            // N.B. We've clicked inside of the Player's Inventory.
            //  The player's slots are added first, so are index 0-35.
            //  We clicked in the Player's Inventory, so try and move
            //  the Item into our Inventory.
            if(!mergeItemStack(itemstack, 36, 36 + storage.getSizeInventory(), false))
                return ItemStack.EMPTY;
        }
 
        if(itemstack.getCount() == 0)
        {
            // We picked everything up, so clear the Slot
            slot.putStack(ItemStack.EMPTY);
        }
        else
        {
            // There is something left, so update the Slot
            slot.onSlotChanged();
        }
 
        slot.onTake(player, itemstack);
        return returned;
    }
}