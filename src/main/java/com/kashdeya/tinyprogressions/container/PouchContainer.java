package com.kashdeya.tinyprogressions.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;

public class PouchContainer extends Container
{
    private final IItemHandler storage;
//    private final int currentSlot;

	PlayerEntity player;
	IItemHandler playerInventory; 
	
    public PouchContainer(int id, PlayerInventory playerInventoryIn, PlayerEntity playerIn)
    {
    	super(ContainerType.GENERIC_9x6, id);
    	
    	this.storage = null;
    	
		this.player = playerIn;
		this.playerInventory = new InvWrapper(playerInventoryIn);
		
		player.getMainHandItem().getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(h -> {
				this.addSlot(new SlotPouch(h, 0, 46, 33));
				this.addSlot(new SlotPouch(h, 1, 46, 58));
				this.addSlot(new SlotPouch(h, 2, 112, 33));
				this.addSlot(new SlotPouch(h, 3, 112, 58));
			});
    	
		addPlayerInventory(8, 84);
		
//        this.storage = iItemHandler;
// 
//        for(int y = 0; y < 6; y++)
//            for(int x = 0; x < 9; x++)
//                this.addSlot(new SlotPouch(storage, x + y * 9, 8 + x * 18, 18 + y * 18));
//
//		for (int i = 0; i < 3; ++i) {
//			for (int j = 0; j < 9; ++j) {
//				this.addSlot(new Slot(playerInventoryIn, j + i * 9 + 9, 8 + j * 18, 140 + i * 18));
//			}
//		}
//
//		for (int k = 0; k < 9; ++k) {
//			this.addSlot(new Slot(playerInventoryIn, k, 8 + k * 18, 198));
//		}
        
   }
 
	private void addPlayerInventory(int leftCol, int topRow) {
		addSlotBox(playerInventory, 9, leftCol, topRow, 9, 18, 3, 18);
		topRow += 58;
		addSlotRange(playerInventory, 0, leftCol, topRow, 9, 18);
	}
		
	private int addSlotRange(IItemHandler handler, int index, int x, int y, int amount, int dx) {
		for(int i = 0; i < amount; i++) {
			addSlot(new SlotItemHandler(handler, index, x, y));
			x += dx;
			index++;
		}
		return index;
	}
	public int addSlotBox(IItemHandler handler, int index, int x, int y, int horAmount, int dx, int verAmount, int dy) {
		for(int j = 0; j < verAmount ; j++) {
			index = addSlotRange(handler, index, x, y, horAmount, dx);
			y += dy;
		}
		return index;
		
	}
		
	@Override
	public boolean stillValid(PlayerEntity p_75145_1_) {
		// TODO Auto-generated method stub
		return true;
	}
    
//    @Override
//    public ItemStack transferStackInSlot(PlayerEntity player, int index)
//    {
//        Slot slot = getSlot(index);
// 
//        if(slot == null || !slot.getHasStack())
//            return ItemStack.EMPTY;
// 
//        ItemStack itemstack = slot.getStack();
//        ItemStack returned = itemstack.copy();
//        
//        if (index < this.storage.getSlots()) {
//        	if (!this.mergeItemStack(itemstack, this.storage.getSlots(),  this.inventorySlots.size(), true))
//        		return ItemStack.EMPTY;
//        }
//       	else if (!this.mergeItemStack(itemstack, 0, this.storage.getSlots(), false))
//       		return ItemStack.EMPTY;
//        
//        if (itemstack.isEmpty())
//        	slot.putStack(ItemStack.EMPTY);
//        else
//        	slot.onSlotChanged();
//
//        return returned;
//    }

}
