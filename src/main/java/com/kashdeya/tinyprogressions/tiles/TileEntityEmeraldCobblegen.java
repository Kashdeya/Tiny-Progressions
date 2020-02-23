package com.kashdeya.tinyprogressions.tiles;

import net.minecraft.tileentity.TileEntityType;

public class TileEntityEmeraldCobblegen extends TileEntityCobblegen {

	
	public TileEntityEmeraldCobblegen(TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCycleUpdate() {
		return 1;
	}
	
	@Override
	public int getMaxStackSize() {
		return 64;
	}
	
	
	/*
	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public String getName() {
		return TechBlocks.emerald_cobblegen_block.getLocalizedName();
	}*/
	
	/*
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
    }*/
}