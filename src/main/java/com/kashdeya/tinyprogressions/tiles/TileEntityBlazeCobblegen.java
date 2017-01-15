package com.kashdeya.tinyprogressions.tiles;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;

import com.kashdeya.tinyprogressions.inits.TechBlocks;

public class TileEntityBlazeCobblegen extends TileEntityCobblegen {

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public String getName() {
		return TechBlocks.blaze_cobblegen_block.getLocalizedName();
	}

	@Override
	public void update() {

		if(worldObj.isRemote)
			return;

		cycle++;

		if (cycle >= 5) {
			cycle = 0;

			if (stack == null)
				stack = new ItemStack(Blocks.COBBLESTONE);
			else
				stack.stackSize = Math.min(64, stack.stackSize + 1);

			setInventorySlotContents(0, stack);

			TileEntity tile = worldObj.getTileEntity(pos.offset(EnumFacing.UP));
			if (tile instanceof IInventory) {
				IInventory iinventory = (IInventory) tile;
				if (isInventoryFull(iinventory, EnumFacing.UP)) {
					return;
				} else {
					if (getStackInSlot(0) != null) {
						ItemStack stack = getStackInSlot(0).copy();
						ItemStack stack1 = putStackInInventoryAllSlots(iinventory, decrStackSize(0, 1), EnumFacing.UP);
						if (stack1 == null || stack1.stackSize == 0)
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