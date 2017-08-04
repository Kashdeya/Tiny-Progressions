package com.kashdeya.tinyprogressions.tiles;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.wrapper.InvWrapper;

public class TileEntityCobblegen extends TileEntity implements ISidedInventory, ITickable
{
	ItemStack stack = null;
	int cycle = 0;
	
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
		if(stack != null && stack.getCount() > count)
		{
			return stack.splitStack(count);
		} else
		{
			ItemStack tmp = stack;
			stack = null;
			return tmp;
		}
	}

	@Override
	public ItemStack removeStackFromSlot(int index)
	{
		if(index == 0)
		{
			ItemStack tmp = stack;
			stack = null;
			return tmp;
		} else
		{
			return null;
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
		return index == 0 && stack != null && stack.getItem() == Item.getItemFromBlock(Blocks.COBBLESTONE);
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
		stack = null;
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
	public int[] getSlotsForFace(EnumFacing side)
	{
		return new int[]{0};
	}

	@Override
	public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction)
	{
		return false;
	}

	@Override
	public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction)
	{
		return index == 0 && stack != null && stack.getItem() == Item.getItemFromBlock(Blocks.COBBLESTONE);
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
			
			if(stack == null)
			{
				stack = new ItemStack(Blocks.COBBLESTONE);
			} else
			{
				stack.setCount(Math.min(32, stack.getCount() + 1));
			}
			
			this.setInventorySlotContents(0, stack);
			
			TileEntity tile = world.getTileEntity(pos.offset(EnumFacing.UP));
			if (tile != null && tile.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.DOWN)) {
				IItemHandler handler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.DOWN);

				if (getStackInSlot(0) != null) {
					ItemStack stack = getStackInSlot(0).copy();
					stack.setCount(1);
					ItemStack stack1 = ItemHandlerHelper.insertItem(handler, stack, true);
					if (stack1 == null || stack1.getCount() == 0) {
						ItemHandlerHelper.insertItem(handler, this.decrStackSize(0, 1), false);
						markDirty();
					}
				}
			}

			else if (tile instanceof IInventory) {
				IInventory iinventory = (IInventory) tile;
				if (isInventoryFull(iinventory, EnumFacing.UP)) {
					return;
				} else {
					if (getStackInSlot(0) != null) {
						ItemStack stack = getStackInSlot(0).copy();
						ItemStack stack1 = putStackInInventoryAllSlots(iinventory, decrStackSize(0, 1), EnumFacing.UP);
						if (stack1 == null || stack1.getCount() == 0)
							iinventory.markDirty();
						else
							setInventorySlotContents(0, stack);
					}
				}
			}
			markDirty();
		}
	}

	protected boolean isInventoryFull(IInventory inventoryIn, EnumFacing side) {
		if (inventoryIn instanceof ISidedInventory) {
			ISidedInventory isidedinventory = (ISidedInventory) inventoryIn;
			int[] aint = isidedinventory.getSlotsForFace(side);

			for (int k : aint) {
				ItemStack itemstack1 = isidedinventory.getStackInSlot(k);

				if (itemstack1 == null || itemstack1.getCount() != itemstack1.getMaxStackSize())
					return false;
			}
		} else {
			int i = inventoryIn.getSizeInventory();

			for (int j = 0; j < i; ++j) {
				ItemStack itemstack = inventoryIn.getStackInSlot(j);

				if (itemstack == null || itemstack.getCount() != itemstack.getMaxStackSize())
					return false;
			}
		}

		return true;
	}

	public static ItemStack putStackInInventoryAllSlots(IInventory inventoryIn, ItemStack stack,
			@Nullable EnumFacing side) {
		if (inventoryIn instanceof ISidedInventory && side != null && !(inventoryIn instanceof TileEntityCobblegen) && inventoryIn.isItemValidForSlot(0, stack.copy())) {
			ISidedInventory isidedinventory = (ISidedInventory) inventoryIn;
			int[] aint = isidedinventory.getSlotsForFace(side);

			for (int k = 0; k < aint.length && stack != null && stack.getCount() > 0; ++k)
				stack = insertStack(inventoryIn, stack, aint[k], side);
		} else {
			int i = inventoryIn.getSizeInventory();

			for (int j = 0; j < i && stack != null && stack.getCount() > 0; ++j)
				stack = insertStack(inventoryIn, stack, j, side);
		}

		if (stack != null && stack.getCount() == 0)
			stack = null;

		return stack;
	}

	private static ItemStack insertStack(IInventory inventoryIn, ItemStack stack, int index, EnumFacing side) {
		ItemStack itemstack = inventoryIn.getStackInSlot(index);

		if (canInsertItemInSlot(inventoryIn, stack, index, side)) {
			if (itemstack == null) {
				// Forge: BUGFIX: Again, make things respect max stack sizes.
				int max = Math.min(stack.getMaxStackSize(), inventoryIn.getInventoryStackLimit());
				if (max >= stack.getCount()) {
					inventoryIn.setInventorySlotContents(index, stack);
					stack = null;
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

	private static boolean canInsertItemInSlot(IInventory inventoryIn, ItemStack stack, int index, EnumFacing side) {
		return !inventoryIn.isItemValidForSlot(index, stack) ? false : !(inventoryIn instanceof ISidedInventory) || ((ISidedInventory) inventoryIn).canInsertItem(index, stack, side);
	}

	private static boolean canCombine(ItemStack stack1, ItemStack stack2) {
		return stack1.getItem() != stack2.getItem() ? false : (stack1.getMetadata() != stack2.getMetadata() ? false : (stack1.getCount() > stack1.getMaxStackSize() ? false : ItemStack.areItemStackTagsEqual(stack1, stack2)));
	}

	@SuppressWarnings("unchecked")
    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return (T) new InvWrapper(this);
        }
        return super.getCapability(capability, facing);
    }
		
    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY ||
        super.hasCapability(capability, facing);
    }

	@Override
	public boolean isEmpty() {
        return stack.isEmpty();
	}
}