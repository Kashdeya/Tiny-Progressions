package com.kashdeya.tinyprogressions.tiles.cobblegen;

import java.util.function.Predicate;

import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemStackHandler;

public class CobbleGenContents implements IInventory {

	private Predicate<PlayerEntity> canPlayerAccessInventoryLambda = x -> true;
	private Notify markDirtyNotificationLambda = () -> {
	};
	private Notify openInventoryNotificationLambda = () -> {
	};
	private Notify closeInventoryNotificationLambda = () -> {
	};
	private final ItemStackHandler genComponentContents;
	
	public static CobbleGenContents createForTileEntity(int size,int stackSize, Predicate<PlayerEntity> canPlayerAccessInventoryLambda, Notify markDirtyNotificationLambda) {
		return new CobbleGenContents(size, stackSize, canPlayerAccessInventoryLambda, markDirtyNotificationLambda);
	}

	public static CobbleGenContents createForClientSideContainer(int size) {
		return new CobbleGenContents(size, 64);
	}

	private CobbleGenContents(int size, int stackSize) {
		this.genComponentContents = new ItemStackHandler(size) {
		    @Override
		    public int getSlotLimit(int slot)
		    {
		        return stackSize;
		    }
		};
	}

	private CobbleGenContents(int size, int stackSize, Predicate<PlayerEntity> canPlayerAccessInventoryLambda, Notify markDirtyNotificationLambda) {
		this.genComponentContents = new ItemStackHandler(size){
		    @Override
		    public int getSlotLimit(int slot)
		    {
		        return stackSize;
		    }
		};
		this.canPlayerAccessInventoryLambda = canPlayerAccessInventoryLambda;
		this.markDirtyNotificationLambda = markDirtyNotificationLambda;
	}

	public CompoundNBT serializeNBT() {
		return genComponentContents.serializeNBT();
	}

	
	public ItemStackHandler getHandler() {
		return this.genComponentContents;
	}
    
	/**
	 * Fills the chest contents from the nbt; resizes automatically to fit. (used to
	 * load the contents from disk)
	 * 
	 * @param nbt
	 */
	public void deserializeNBT(CompoundNBT nbt) {
		genComponentContents.deserializeNBT(nbt);
	}

	@Override
	public void clearContent() {
		for (int i = 0; i < genComponentContents.getSlots(); ++i) {
			genComponentContents.setStackInSlot(i, ItemStack.EMPTY);
		}
	}

	@Override
	public boolean canPlaceItem(int index, ItemStack stack) {
		return genComponentContents.isItemValid(index, stack);
	}

	@Override
	public int getContainerSize() {
		return genComponentContents.getSlots();
	}

	@Override
	public ItemStack getItem(int index) {
		return genComponentContents.getStackInSlot(index);
	}

	@Override
	public boolean isEmpty() {
		for (int i = 0; i < genComponentContents.getSlots(); ++i) {
			if (!genComponentContents.getStackInSlot(i).isEmpty())
				return false;
		}
		return true;
	}

	@Override
	public ItemStack removeItem(int index, int count) {
		if (count < 0)
			throw new IllegalArgumentException("count should be >= 0:" + count);
		return genComponentContents.extractItem(index, count, false);
	}

	@Override
	public ItemStack removeItemNoUpdate(int index) {
		int maxPossibleItemStackSize = genComponentContents.getSlotLimit(index);
		return genComponentContents.extractItem(index, maxPossibleItemStackSize, false);
	}

 	@Override
	public void setItem(int index, ItemStack stack) {
		genComponentContents.setStackInSlot(index, stack);
	}

	@Override
	public boolean stillValid(PlayerEntity player) {
		return canPlayerAccessInventoryLambda.test(player);
	}

	@FunctionalInterface
	public interface Notify {
		void invoke();
	}

	public ItemStack increaseStackSize(int index, ItemStack itemStackToInsert) {
		ItemStack leftoverItemStack = genComponentContents.insertItem(index, itemStackToInsert, false);
		return leftoverItemStack;
	}

	public boolean doesItemStackFit(int index, ItemStack itemStackToInsert) {
		ItemStack leftoverItemStack = genComponentContents.insertItem(index, itemStackToInsert, true);
		return leftoverItemStack.isEmpty();
	}

	public void setCanPlayerAccessInventoryLambda(Predicate<PlayerEntity> canPlayerAccessInventoryLambda) {
		this.canPlayerAccessInventoryLambda = canPlayerAccessInventoryLambda;
	}
	
	
	  @Override
	  public void setChanged() {
	    markDirtyNotificationLambda.invoke();
	  }

	  @Override
	  public void startOpen(PlayerEntity player) {
	    openInventoryNotificationLambda.invoke();
	  }

	  @Override
	  public void stopOpen(PlayerEntity player) {
	    closeInventoryNotificationLambda.invoke();
	  }
	  

	// the function that the container should call in order to tell the parent
	// TileEntity that the
	// contents of its inventory have been changed.
	// default is "do nothing"
	public void setMarkDirtyNotificationLambda(Notify markDirtyNotificationLambda) {
		this.markDirtyNotificationLambda = markDirtyNotificationLambda;
	}

	// the function that the container should call in order to tell the parent
	// TileEntity that the
	// container has been opened by a player (eg so that the chest can animate its
	// lid being opened)
	// default is "do nothing"
	public void setOpenInventoryNotificationLambda(Notify openInventoryNotificationLambda) {
		this.openInventoryNotificationLambda = openInventoryNotificationLambda;
	}

	// the function that the container should call in order to tell the parent
	// TileEntity that the
	// container has been closed by a player
	// default is "do nothing"
	public void setCloseInventoryNotificationLambda(Notify closeInventoryNotificationLambda) {
		this.closeInventoryNotificationLambda = closeInventoryNotificationLambda;
	}

	//Drop All Items
	public void dropInventory(World worldIn, BlockPos pos) {

        for (int i = 0; i < this.getContainerSize(); ++i)
        {
        	ItemStack stack = removeItem(i, this.getMaxStackSize());
        	
        	if(!stack.isEmpty()){
        		worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY()+1, pos.getZ(), stack));
        	}
        }
	}
}
