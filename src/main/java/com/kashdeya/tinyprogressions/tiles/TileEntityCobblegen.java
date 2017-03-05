package com.kashdeya.tinyprogressions.tiles;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;

public class TileEntityCobblegen extends TileEntity implements ITickable
{
	public ItemStackHandler inv = new ItemStackHandler(1) {
		@Nonnull
		@Override
		public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
			return stack; // don't allow insertions
		}
	};
	int cycle = 0;

		public String getName()
	{
		return TechBlocks.cobblegen_block.getLocalizedName();
	}

	@Override
	public ITextComponent getDisplayName()
	{
		return new TextComponentString(getName());
	}

	protected int getCycles() {
        return 40;
    }

    protected int getMaxStored() {
        return 32;
    }

	@Override
	public void update()
	{
		if(getWorld().isRemote)
			return;

		cycle++;

		if(cycle >= getCycles())
		{
			cycle = 0;

			ItemStack stack = inv.getStackInSlot(0);

			if(stack.isEmpty())
			{
				inv.setStackInSlot(0, new ItemStack(Blocks.COBBLESTONE));
			}
			else if (stack.getCount() < getMaxStored())
			{
					stack.grow(1);
            }

			TileEntity tile = getWorld().getTileEntity(pos.offset(EnumFacing.UP));
			if (tile != null && tile.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.DOWN)) {
                IItemHandler handler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.DOWN);

                if (!inv.getStackInSlot(0).isEmpty()) {
                    inv.setStackInSlot(0, ItemHandlerHelper.insertItem(handler, inv.getStackInSlot(0), false));
                }
			}
			markDirty();
		}
	}

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);

        if (compound.hasKey("inv")) {
            inv.setStackInSlot(0, new ItemStack(compound.getCompoundTag("inv")));
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);

        compound.setTag("inv", inv.getStackInSlot(0).writeToNBT(new NBTTagCompound()));

        return compound;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.cast(inv);
        }
        return super.getCapability(capability, facing);
    }

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY || super.hasCapability(capability, facing);
    }
}