package com.kashdeya.tinyprogressions.container;

import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotPouch extends SlotItemHandler	
{
    public SlotPouch(IItemHandler inventory, int index, int xPosition, int yPosition)
    {
        super(inventory, index, xPosition, yPosition);
    }
    
    @Override
    public boolean isItemValid(ItemStack stack)
    {
        return !stack.isEmpty() && (stack.getItem() != TechItems.pouch.get() || !(stack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, Direction.DOWN).isPresent()) );
    }
}
