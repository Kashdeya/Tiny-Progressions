package com.kashdeya.tinyprogressions.tiles;

import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.wrapper.InvWrapper;

public class TileEntityEmeraldCobblegen extends TileEntityCobblegen {

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public String getName() {
		return TechBlocks.emerald_cobblegen_block.getLocalizedName();
	}

	@Override
	public void update() {

		if(world.isRemote)
			return;

		cycle++;

		if (cycle >= 1) {
			cycle = 0;

			if (stack == ItemStack.EMPTY)
				stack = new ItemStack(Blocks.COBBLESTONE);
			else
				stack.setCount(Math.min(64, stack.getCount() + 1));

			setInventorySlotContents(0, stack);

			TileEntity tile = world.getTileEntity(pos.offset(EnumFacing.UP));
			if (tile != null && tile.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.DOWN)) {
				IItemHandler handler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.DOWN);

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
				if (isInventoryFull(iinventory, EnumFacing.UP)) {
					return;
				} else {
					if (getStackInSlot(0) != ItemStack.EMPTY) {
						ItemStack stack = getStackInSlot(0).copy();
						ItemStack stack1 = putStackInInventoryAllSlots(iinventory, decrStackSize(0, 1), EnumFacing.UP);
						if (stack1 == ItemStack.EMPTY || stack1.getCount() == 0)
							iinventory.markDirty();
						else
							setInventorySlotContents(0, stack);
					}
				}
			}
			markDirty();
		}
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
}