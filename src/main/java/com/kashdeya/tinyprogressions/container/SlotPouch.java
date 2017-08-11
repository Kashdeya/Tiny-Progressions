package com.kashdeya.tinyprogressions.container;

import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotPouch extends Slot
{
    public SlotPouch(IInventory inventory, int index, int xPosition, int yPosition)
    {
        super(inventory, index, xPosition, yPosition);
    }
    
    @Override
    public boolean isItemValid(ItemStack stack)
    {
        return stack != null && stack.getItem() != TechItems.pouch;
    }
}
