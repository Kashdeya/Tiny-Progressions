package com.kashdeya.tinyprogressions.container;

import com.kashdeya.tinyprogressions.capabilities.InventoryStorage;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class PouchContainer extends Container
{
    private final InventoryStorage storage;
    private final int currentSlot;
    
    public PouchContainer(InventoryStorage storage, EntityPlayer player)
    {
        this.storage = storage;
        currentSlot = player.inventory.currentItem;
 
        for(int y = 0; y < 6; y++)
            for(int x = 0; x < 9; x++)
                addSlotToContainer(new SlotPouch(storage, x + y * 9, 8 + x * 18, 18 + y * 18));

		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 9; ++j) {
				this.addSlotToContainer(new Slot(player.inventory, j + i * 9 + 9, 8 + j * 18, 140 + i * 18));
			}
		}

		for (int k = 0; k < 9; ++k) {
			this.addSlotToContainer(new Slot(player.inventory, k, 8 + k * 18, 198));
		}
        
   }
 
    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return true;
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int index)
    {
        Slot slot = getSlot(index);
 
        if(slot == null || !slot.getHasStack())
            return ItemStack.EMPTY;
 
        ItemStack itemstack = slot.getStack();
        ItemStack returned = itemstack.copy();
        
        if (index < this.storage.getSlots()) {
        	if (!this.mergeItemStack(itemstack, this.storage.getSlots(),  this.inventorySlots.size(), true))
        		return ItemStack.EMPTY;
        }
       	else if (!this.mergeItemStack(itemstack, 0, this.storage.getSlots(), false))
       		return ItemStack.EMPTY;
        
        if (itemstack.isEmpty())
        	slot.putStack(ItemStack.EMPTY);
        else
        	slot.onSlotChanged();

        return returned;
    }
}
