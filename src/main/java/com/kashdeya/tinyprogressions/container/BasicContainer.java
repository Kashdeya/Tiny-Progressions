package com.kashdeya.tinyprogressions.container;


import java.util.Arrays;
import java.util.List;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;

public class BasicContainer extends Container{
	
	List<IItemHandler> inventories;
	PlayerEntity player;
	IItemHandler playerInventory; 
	
	
	protected BasicContainer(ContainerType<?> type, int id) {
		super(type, id);
	}

	
	public void addInventories(IItemHandler... invs){
		inventories = Arrays.asList(invs);
	}
	
	
	@Override
	public boolean canInteractWith(PlayerEntity playerIn) {
		return true;
	}

	
	protected void bindPlayerInventory(PlayerInventory playerInventory) {
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 9; ++j) {
				this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}

		for (int k = 0; k < 9; ++k) {
			this.addSlot(new Slot(playerInventory, k, 8 + k * 18, 142));
		}
	}
	
	
	private int getAllSlots() {
		int slotCount = 0;
		for(IItemHandler inv : inventories)
			slotCount += inv.getSlots();
		
		return slotCount;
	}
	
	@Override
	public ItemStack transferStackInSlot(PlayerEntity player, int slotIndex) 
	{
        ItemStack stack = ItemStack.EMPTY;
        Slot slot = (Slot)this.inventorySlots.get(slotIndex);

        if (slot != null && slot.getHasStack())
        {
            ItemStack stackInSlot = slot.getStack();
            stack = stackInSlot.copy();

            if (slotIndex < getAllSlots())
            {
                if (!this.mergeItemStack(stackInSlot, getAllSlots(), this.inventorySlots.size(), true))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(stackInSlot, 0, getAllSlots(), false))
            {
                return ItemStack.EMPTY;
            }
            
            if (stackInSlot.getCount() == 0)
                slot.putStack(ItemStack.EMPTY);
            else
                slot.onSlotChanged();
            
        }
        
		return  stack;
	}
	
	@Override
	protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection){
		boolean flag = false;
		int i = startIndex;
		if (reverseDirection) i = endIndex - 1;
		
		if (stack.isStackable()){
			while (stack.getCount() > 0 && (!reverseDirection && i < endIndex || reverseDirection && i >= startIndex)){
				Slot slot = (Slot)this.inventorySlots.get(i);
				ItemStack itemstack = slot.getStack();
				int maxLimit = Math.min(stack.getMaxStackSize(), slot.getSlotStackLimit());
				
				boolean isValidItem = slot.isItemValid(stack);
				
				if (!itemstack.isEmpty() && areItemStacksEqual(stack, itemstack) && isValidItem){
					int j = itemstack.getCount() + stack.getCount();
					if (j <= maxLimit){
						stack.setCount(0);
						itemstack.setCount(j);
						slot.onSlotChanged();
						flag = true;
						
					}else if (itemstack.getCount() < maxLimit){
						stack.shrink(maxLimit - itemstack.getCount());
						itemstack.setCount(maxLimit);
						slot.onSlotChanged();
						flag = true;
					}
				}
				if (reverseDirection){ 
					--i;
				}else ++i;
			}
		}
		if (stack.getCount() > 0){
			if (reverseDirection){
				i = endIndex - 1;
			}else i = startIndex;

			while (!reverseDirection && i < endIndex || reverseDirection && i >= startIndex){
				Slot slot1 = (Slot)this.inventorySlots.get(i);
				ItemStack itemstack1 = slot1.getStack();


				if (itemstack1.isEmpty() && slot1.isItemValid(stack)){ // Forge: Make sure to respect isItemValid in the slot.
					if(stack.getCount() <= slot1.getSlotStackLimit()){
						slot1.putStack(stack.copy());
						slot1.onSlotChanged();
						stack.setCount(0);
						flag = true;
						break;
					}else{
						itemstack1 = stack.copy();
						stack.shrink(slot1.getSlotStackLimit());
						itemstack1.setCount(slot1.getSlotStackLimit());
						slot1.putStack(itemstack1);
						slot1.onSlotChanged();
						flag = true;
					}					
				} 
				if (reverseDirection){
					--i;
				}else ++i;
			}
		}
		return flag;
	}
	
	private static boolean areItemStacksEqual(ItemStack stackA, ItemStack stackB)
	{
		return ItemStack.areItemsEqual(stackA, stackB);
	}

}
