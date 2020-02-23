package com.kashdeya.tinyprogressions.tiles;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.capabilities.InventoryStorage;

import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;

public class TileEntityCobblegen extends TileEntity implements  ITickable //ISidedInventory,
{
	public TileEntityCobblegen(TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
	}

	//ItemStack stack = ItemStack.EMPTY;
	int cycle = 0;
	
	public InventoryStorage outputInventory = new InventoryStorage(1) {
	    	@Override
			public boolean canInsertSlot(int slot, ItemStack stack) { return false; }
	    	@Override
		    public void writeToNBT(CompoundNBT compound)  { 	compound.put("outputInventory", serializeNBT());    }
	    	@Override 
		    public void readFromNBT(CompoundNBT compound) { 	deserializeNBT(compound.getCompound("outputInventory"));  }
	    };
	    
	public int getCycleUpdate() {
		return 40;
	}
	
	public int getMaxStackSize() {
		return 32;
	}
	
	public ItemStack getStack() {
		return outputInventory.getStackInSlot(0);
	}
	
	@Override
	public void update()
	{
		if(world.isRemote)
			return;

		cycle++;
		
		if(cycle >= getCycleUpdate())
		{
			cycle = 0;
			
			if(getStack() == ItemStack.EMPTY || getStack().getItem() != Item.getItemFromBlock(Blocks.COBBLESTONE))
			{
				outputInventory.setStackInSlot(0, new ItemStack(Blocks.COBBLESTONE));
			} 
			else
			{
				getStack().setCount(Math.min(getMaxStackSize(), getStack().getCount() + 1));
			}
			
			this.outputInventory.setStackInSlot(0, getStack());
			
			TileEntity tile = world.getTileEntity(pos.offset(Direction.UP));
			if (tile != null && tile.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, Direction.DOWN)) {
				IItemHandler handler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, Direction.DOWN);

				if (this.outputInventory.getStackInSlot(0) != ItemStack.EMPTY) {
					ItemStack stack = this.outputInventory.getStackInSlot(0).copy();
					stack.setCount(1);
					ItemStack stack1 = ItemHandlerHelper.insertItem(handler, stack, true);
					if (stack1 == ItemStack.EMPTY || stack1.getCount() == 0) {
						ItemHandlerHelper.insertItem(handler, this.outputInventory.extractItemInternal(0, 1, false), false);
						markDirty();
					}
				}
			}

			else if (tile instanceof IInventory) {
				IInventory iinventory = (IInventory) tile;
				if (isInventoryFull(iinventory, Direction.UP)) {
					return;
				} else {
					if (this.outputInventory.getStackInSlot(0) != ItemStack.EMPTY) {
						ItemStack stack = this.outputInventory.getStackInSlot(0).copy();
						ItemStack stack1 = putStackInInventoryAllSlots(iinventory, this.outputInventory.extractItemInternal(0, 1, false), Direction.UP);
						if (stack1 == ItemStack.EMPTY || stack1.getCount() == 0)
							iinventory.markDirty();
						else
							this.outputInventory.setStackInSlot(0, stack);
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
					inventoryIn.setInventorySlotContents(index, stack.splitStack(max));

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
		return stack1.getItem() == stack2.getItem() && (stack1.getMetadata() == stack2.getMetadata() && (stack1.getCount() <= stack1.getMaxStackSize() && ItemStack.areItemStackTagsEqual(stack1, stack2)));
	}

	@SuppressWarnings("unchecked")
    @Override
    public <T> T getCapability(Capability<T> capability, Direction facing) {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return (T) this.outputInventory;
        }
        return super.getCapability(capability, facing);
    }
		
    @Override
    public boolean hasCapability(Capability<?> capability, Direction facing) {
        return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY ||
        super.hasCapability(capability, facing);
    }
/*
	@Override
	public boolean isEmpty() {
        return stack.isEmpty();
	}
	
	/*
	@Override
	public int getSizeInventory()
	{
		return 1;
	}

	@Override
	public ItemStack getStackInSlot(int index)
	{
		return stack;
	}

	@Override
	public ItemStack decrStackSize(int index, int count)
	{
		if(stack != ItemStack.EMPTY && stack.getCount() > count)
		{
			return stack.splitStack(count);
		} else
		{
			ItemStack tmp = stack;
			stack = ItemStack.EMPTY;
			return tmp;
		}
	}

	@Override
	public ItemStack removeStackFromSlot(int index)
	{
		if(index == 0)
		{
			ItemStack tmp = stack;
			stack = ItemStack.EMPTY;
			return tmp;
		} else
		{
			return ItemStack.EMPTY;
		}
	}
	
	@Override
	public void setInventorySlotContents(int index, ItemStack stack)
	{
		// Should not normally happen but just in case
		if(index == 0)
		{
			this.stack = stack;
		}
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 32;
	}
	
	@Override
	public boolean isUsableByPlayer(EntityPlayer player)
	{
		return true;
	}

	@Override
	public void openInventory(EntityPlayer player)
	{
	}

	@Override
	public void closeInventory(EntityPlayer player)
	{
	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack)
	{
		return index == 0 && stack != ItemStack.EMPTY && stack.getItem() == Item.getItemFromBlock(Blocks.COBBLESTONE);
	}

	@Override
	public int getField(int id)
	{
		return 0;
	}

	@Override
	public void setField(int id, int value)
	{
	}

	@Override
	public int getFieldCount()
	{
		return 0;
	}

	@Override
	public void clear()
	{
		stack = ItemStack.EMPTY;
	}

	@Override
	public String getName()
	{
		return TechBlocks.cobblegen_block.getLocalizedName();
	}

	@Override
	public boolean hasCustomName()
	{
		return false;
	}

	@Override
	public ITextComponent getDisplayName()
	{
		return new TextComponentString(getName());
	}

	@Override
	public int[] getSlotsForFace(Direction side)
	{
		return new int[]{0};
	}

	@Override
	public boolean canInsertItem(int index, ItemStack itemStackIn, Direction direction)
	{
		return false;
	}

	@Override
	public boolean canExtractItem(int index, ItemStack stack, Direction direction)
	{
		return index == 0 && stack != ItemStack.EMPTY && stack.getItem() == Item.getItemFromBlock(Blocks.COBBLESTONE);
	}
	

	    @Override
		public void update()
		{
			if(world.isRemote)
				return;

			cycle++;
			
			if(cycle >= 40)
			{
				cycle = 0;
				
				if(stack == ItemStack.EMPTY)
				{
					stack = new ItemStack(Blocks.COBBLESTONE);
				} else
				{
					stack.setCount(Math.min(32, stack.getCount() + 1));
				}
				
				this.setInventorySlotContents(0, stack);
				
				TileEntity tile = world.getTileEntity(pos.offset(Direction.UP));
				if (tile != null && tile.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, Direction.DOWN)) {
					IItemHandler handler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, Direction.DOWN);

					if (getStackInSlot(0) != ItemStack.EMPTY) {
						ItemStack stack = getStackInSlot(0).copy();
						stack.setCount(1);
						ItemStack stack1 = ItemHandlerHelper.insertItem(handler, stack, true);
						if (stack1 == ItemStack.EMPTY || stack1.getCount() == 0) {
							ItemHandlerHelper.insertItem(handler, this.decrStackSize(0, 1), false);
							markDirty();
						}
					}
				}

				else if (tile instanceof IInventory) {
					IInventory iinventory = (IInventory) tile;
					if (isInventoryFull(iinventory, Direction.UP)) {
						System.out.println("Full");
						return;
					} else {
						if (getStackInSlot(0) != ItemStack.EMPTY) {
							ItemStack stack = getStackInSlot(0).copy();
							ItemStack stack1 = putStackInInventoryAllSlots(iinventory, decrStackSize(0, 1), Direction.UP);
							if (stack1 == ItemStack.EMPTY || stack1.getCount() == 0)
								iinventory.markDirty();
							else
								setInventorySlotContents(0, stack);
						}
					}
				}
				markDirty();
			}
		}*/
	    
	    
	    
}