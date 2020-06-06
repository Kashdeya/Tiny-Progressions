package com.kashdeya.tinyprogressions.tiles;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.capabilities.InventoryStorage;
import com.kashdeya.tinyprogressions.inits.ModTileEntityTypes;

import net.minecraft.block.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;

public class TileEntityCobblegen extends TileEntity implements ITickableTileEntity//ISidedInventory,
{

	public TileEntityCobblegen() {
		super(ModTileEntityTypes.CobbleGen.get());
	}

	public TileEntityCobblegen setGenStats(int cycleUpdate, int maxStackSize) {
		this.cycleUpdate = cycleUpdate;
		this.maxStacksize = maxStackSize;
		return this;
	}

	//ItemStack stack = ItemStack.EMPTY;
	int cycle = 0;
	int cycleUpdate = 40;
	int maxStacksize = 32;
	
	public LazyOptional<InventoryStorage> outputInventory =LazyOptional.of(() ->  new InventoryStorage(1) {
	    	@Override
			public boolean canInsertSlot(int slot, ItemStack stack) { return false; }
	    	@Override
		    public void writeToNBT(CompoundNBT compound)  { 	compound.put("outputInventory", serializeNBT());    }
	    	@Override 
		    public void readFromNBT(CompoundNBT compound) { 	deserializeNBT(compound.getCompound("outputInventory"));  }
	    });
	    
	public int getCycleUpdate() {
		return cycleUpdate;
	}
	
	public int getMaxStackSize() {
		return maxStacksize;
	}
	
	public ItemStack getStack() {
		InventoryStorage inventory = outputInventory.orElse(null);
		return inventory == null ? ItemStack.EMPTY : inventory.getStackInSlot(0);
	}
	
	public boolean hasStorage() {
		return outputInventory.orElse(null) != null ? true : false;
	}
	
	public InventoryStorage getInventory() {
		return outputInventory.orElse(null);
	}
	
	@Override
	public void tick()
	{
		if(world.isRemote)
			return;

		cycle++;
		
		if(cycle >= getCycleUpdate())
		{
			cycle = 0;
			
			if(getStack() == ItemStack.EMPTY || getStack().getItem() != Item.getItemFromBlock(Blocks.COBBLESTONE))
			{
				getInventory().setStackInSlot(0, new ItemStack(Blocks.COBBLESTONE));
			} 
			else
			{
				getStack().setCount(Math.min(getMaxStackSize(), getStack().getCount() + 1));
			}
			
			getInventory().setStackInSlot(0, getStack());
			
			TileEntity tile = world.getTileEntity(pos.offset(Direction.UP));
			if (tile != null && tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, Direction.DOWN).isPresent()) {
				IItemHandler handler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, Direction.DOWN).orElse(null);

				if (getInventory().getStackInSlot(0) != ItemStack.EMPTY) {
					ItemStack stack = getInventory().getStackInSlot(0).copy();
					stack.setCount(1);
					ItemStack stack1 = ItemHandlerHelper.insertItem(handler, stack, true);
					if (stack1 == ItemStack.EMPTY || stack1.getCount() == 0) {
						ItemHandlerHelper.insertItem(handler, getInventory().extractItemInternal(0, 1, false), false);
						markDirty();
					}
				}
			}

			else if (tile instanceof IInventory) {
				IInventory iinventory = (IInventory) tile;
				if (isInventoryFull(iinventory, Direction.UP)) {
					return;
				} else {
					if (getInventory().getStackInSlot(0) != ItemStack.EMPTY) {
						ItemStack stack = getInventory().getStackInSlot(0).copy();
						ItemStack stack1 = putStackInInventoryAllSlots(iinventory, getInventory().extractItemInternal(0, 1, false), Direction.UP);
						if (stack1 == ItemStack.EMPTY || stack1.getCount() == 0)
							iinventory.markDirty();
						else
							getInventory().setStackInSlot(0, stack);
					}
				}
			}
			markDirty();
		}
	}

	protected boolean isInventoryFull(IInventory inventoryIn, Direction side) {
		if (inventoryIn instanceof ISidedInventory) {
			ISidedInventory isidedinventory = (ISidedInventory) inventoryIn;
			int[] aint = isidedinventory.getSlotsForFace(side);

			for (int k : aint) {
				ItemStack itemstack1 = isidedinventory.getStackInSlot(k);

				if (itemstack1 == ItemStack.EMPTY || itemstack1.getCount() != itemstack1.getMaxStackSize())
					return false;
			}
		} else {
			int i = inventoryIn.getSizeInventory();

			for (int j = 0; j < i; ++j) {
				ItemStack itemstack = inventoryIn.getStackInSlot(j);

				if (itemstack == ItemStack.EMPTY || itemstack.getCount() != itemstack.getMaxStackSize())
					return false;
			}
		}

		return true;
	}

	public static ItemStack putStackInInventoryAllSlots(IInventory inventoryIn, ItemStack stack,
			@Nullable Direction side) {
		if (inventoryIn instanceof ISidedInventory && side != null && !(inventoryIn instanceof TileEntityCobblegen) && inventoryIn.isItemValidForSlot(0, stack.copy())) {
			ISidedInventory isidedinventory = (ISidedInventory) inventoryIn;
			int[] aint = isidedinventory.getSlotsForFace(side);

			for (int k = 0; k < aint.length && stack != ItemStack.EMPTY && stack.getCount() > 0; ++k)
				stack = insertStack(inventoryIn, stack, aint[k], side);
		} else {
			int i = inventoryIn.getSizeInventory();

			for (int j = 0; j < i && stack != ItemStack.EMPTY && stack.getCount() > 0; ++j)
				stack = insertStack(inventoryIn, stack, j, side);
		}

		if (stack != ItemStack.EMPTY && stack.getCount() == 0)
			stack = ItemStack.EMPTY;

		return stack;
	}

	private static ItemStack insertStack(IInventory inventoryIn, ItemStack stack, int index, Direction side) {
		ItemStack itemstack = inventoryIn.getStackInSlot(index);

		if (canInsertItemInSlot(inventoryIn, stack, index, side)) {
			if (itemstack == ItemStack.EMPTY) {
				// Forge: BUGFIX: Again, make things respect max stack sizes.
				int max = Math.min(stack.getMaxStackSize(), inventoryIn.getInventoryStackLimit());
				if (max >= stack.getCount()) {
					inventoryIn.setInventorySlotContents(index, stack);
					stack = ItemStack.EMPTY;
				} else
					inventoryIn.setInventorySlotContents(index, stack.split(max));

			} else if (canCombine(itemstack, stack)) {
				// Forge: BUGFIX: Again, make things respect max stack sizes.
				int max = Math.min(stack.getMaxStackSize(), inventoryIn.getInventoryStackLimit());
				if (max > itemstack.getCount()) {
					int i = max - itemstack.getCount();
					int j = Math.min(stack.getCount(), i);
					stack.setCount(stack.getCount() - j);
					itemstack.setCount(itemstack.getCount() + j);
				}
			}
		}

		return stack;
	}

	private static boolean canInsertItemInSlot(IInventory inventoryIn, ItemStack stack, int index, Direction side) {
		return inventoryIn.isItemValidForSlot(index, stack) && (!(inventoryIn instanceof ISidedInventory) || ((ISidedInventory) inventoryIn).canInsertItem(index, stack, side));
	}

	private static boolean canCombine(ItemStack stack1, ItemStack stack2) {
		return false;
	}

	
	//TODO no metadata....
//	private static boolean canCombine(ItemStack stack1, ItemStack stack2) {
//		return stack1.getItem() == stack2.getItem() && (stack1.getMetadata() == stack2.getMetadata() && (stack1.getCount() <= stack1.getMaxStackSize() && ItemStack.areItemStackTagsEqual(stack1, stack2)));
//	}


	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return this.outputInventory.cast();
        }
        return super.getCapability(cap, side);
    }
	    
}