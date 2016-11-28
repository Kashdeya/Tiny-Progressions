package com.kashdeya.tinyprogressions.tiles;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
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
import net.minecraftforge.items.wrapper.InvWrapper;

import com.kashdeya.tinyprogressions.inits.TechBlocks;

public class TileEntityIronCobblegen extends TileEntity implements ISidedInventory, ITickable
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
		if(stack != null && stack.stackSize > count)
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
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player)
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
		return TechBlocks.iron_cobblegen_block.getLocalizedName();
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
		cycle++;
		
		if(cycle >= 20)
		{
			cycle = 0;
			
			if(stack == null)
			{
				stack = new ItemStack(Blocks.COBBLESTONE);
			} else
			{
				stack.stackSize = Math.min(64, stack.stackSize + 1);
			}
			
			this.setInventorySlotContents(0, stack);
			this.markDirty();
		}
	}
	
    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return (T) new InvWrapper(this);
        }
        return super.getCapability(capability, facing);
        
    }
}