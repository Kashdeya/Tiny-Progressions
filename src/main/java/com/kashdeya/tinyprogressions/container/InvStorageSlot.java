package com.kashdeya.tinyprogressions.container;

import javax.annotation.Nonnull;

import com.kashdeya.tinyprogressions.capabilities.InventoryStorage;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.SlotItemHandler;
/**
 * This is a default slot to handled the new inventory slots. 
 * @author GenDeathrow
  */
public class InvStorageSlot extends SlotItemHandler{

	
    private final int index;
    
	public InvStorageSlot(InventoryStorage itemHandler, int index, int xPosition, int yPosition) {
		super(itemHandler, index, xPosition, yPosition);
		this.index = index;
	}

	
	@Override
	    public int getItemStackLimit(@Nonnull ItemStack stack)
	    {
	        ItemStack maxAdd = stack.copy();
	        int maxInput = stack.getMaxStackSize();
	        maxAdd.setCount(maxInput);

	        InventoryStorage handler = this.getItemHandler();
	        ItemStack currentStack = handler.getStackInSlot(index);
	        if (handler instanceof IItemHandlerModifiable) {
	        	InventoryStorage handlerModifiable = (InventoryStorage) handler;

	            handlerModifiable.setStackInSlot(index, ItemStack.EMPTY);

	            ItemStack remainder = handlerModifiable.insertItemInternal(index, maxAdd, true);

	            handlerModifiable.setStackInSlot(index, currentStack);

	            return maxInput - remainder.getCount();
	        }
	        else
	        {
	            ItemStack remainder = handler.insertItemInternal(index, maxAdd, true);

	            int current = currentStack.getCount();
	            int added = maxInput - remainder.getCount();
	            return current + added;
	        }
	    }
	 
	 /**
	     * Return whether this slot's stack can be taken from this slot.
	     */
	    @Override
	    public boolean canTakeStack(EntityPlayer playerIn)
	    {
	        return !(this.getItemHandler().extractItemInternal(index, 1, true).isEmpty());
	    }
	    
	    
	    /**
	     * Decrease the size of the stack in slot (first int arg) by the amount of the second int arg. Returns the new
	     * stack.
	     */
	    @Override
	    @Nonnull
	    public ItemStack decrStackSize(int amount)
	    {
	        return  this.getItemHandler().extractItemInternal(index, amount, false);
	    }
	    
	    @Override
	    public InventoryStorage getItemHandler()
	    {
	        return (InventoryStorage) super.getItemHandler();
	    }
}
