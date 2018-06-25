package com.kashdeya.tinyprogressions.capabilities;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemStackHandler;

public class InventoryStorage extends ItemStackHandler
{
	   private final String name;
	    
	    public InventoryStorage(int inventorySize)
	    {
	        this("", inventorySize);
	    }
	 
	    public InventoryStorage(String name, int inventorySize)
	    {
	        super(inventorySize);
	        this.name = name;
	    }
	 
	    public String getName()
	    {
	        return name;
	    }
	 
	    public boolean hasCustomName()
	    {
	        return name != null;
	    }
	 
	    public ITextComponent getDisplayName()
	    {
	        return new TextComponentTranslation(name);
	    }
	    
	    
	    @Override
	    public ItemStack insertItem(int slot, ItemStack stack, boolean simulate)
	    {
	    	if(canInsertSlot(slot, stack))
	    		return super.insertItem(slot, stack, simulate);
	    	else
	    		return stack;
	    }
		
	    /**
	     * Inserts an ItemStack into the first given slot and return the remainder. The ItemStack should not be modified in this function! <br> Note: This behaviour is subtly different from IFluidHandlers.fill() 
	     * @param stack
	     * @param simulate
	     * @return
	     */
			
		public ItemStack insertItemFirstAvaliableSlot(ItemStack stack, boolean simulate) {
			
			for(int i = 0; i < this.getSlots(); i++) {
				
				if(insertItem(i, stack, true) != stack) 
					return insertItem(i, stack, false);
			}
			
			return stack;
		}
		
		/**
		 * This will get a copy of the item in the slot and remove the old on. Used to override. 
		 * 
		 * @param slot
		 * @return
		 */
		public ItemStack getAndRemoveSlot(int slot)	{
			ItemStack extract = this.getStackInSlot(slot).copy();
			
			if(!extract.isEmpty())
				this.setStackInSlot(slot, ItemStack.EMPTY);
			
			return extract;
		}
		
	    @Override
	    public ItemStack extractItem(int slot, int amount, boolean simulate)
	    {
	    	if(canExtractSlot(slot))
	    		return super.extractItem(slot, amount, simulate);
	    	else
	    		return ItemStack.EMPTY;	
	    }
	    
	    /**
	     * Used to insert item internally from the block it self.  Even if a player is not able.
	     * 
	     * @param slot
	     * @param stack
	     * @param simulate
	     * @return
	     */
	    public ItemStack insertItemInternal(int slot, ItemStack stack, boolean simulate)
	    {
	    	return super.insertItem(slot, stack, simulate);
	    }
	    
	    /**
	     * Will internally extract an item from a slot. Even if a player is not able.
	     * @param slot
	     * @param amount
	     * @param simulate
	     * @return
	     */
	    public ItemStack extractItemInternal(int slot, int amount, boolean simulate)
	    {
	    	return super.extractItem(slot, amount, simulate);
	    }
	    
	    /**
	     * Check if an item can be extracted from this slot
	     * 
	     * @param slot
	     * @return
	     */
		public boolean canExtractSlot(int slot)
		{
			return true;
		}
		
		/**
		 * Check if you can insert a item into a slot.
		 * 
		 * @param slot
		 * @param stack
		 * @return
		 */
		public boolean canInsertSlot(int slot, ItemStack stack)
		{
			return true;
		}
		
		/**
		 * This will drop any and all items from this inventory at block Pos given.
		 * @param world
		 * @param pos
		 */
		public void dropInventory(World world, BlockPos pos) {
	        for (int i = 0; i < this.getSlots(); ++i)
	        {
	        	ItemStack stack = getAndRemoveSlot(i);
	        	
	        	if(!stack.isEmpty()){
	        		world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY()+1, pos.getZ(), stack));
	        	}
	        }
		}
	    
	    
	    public void writeToNBT(NBTTagCompound compound)
	    {
	    	compound.setTag("Inventory", serializeNBT());
        }
	     
	    public void readFromNBT(NBTTagCompound compound)
	    {
	    	deserializeNBT(compound.getCompoundTag("Inventory"));
	    }

}
