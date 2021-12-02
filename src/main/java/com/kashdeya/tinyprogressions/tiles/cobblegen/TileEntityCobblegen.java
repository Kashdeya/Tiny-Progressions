package com.kashdeya.tinyprogressions.tiles.cobblegen;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.inits.ModTileEntityTypes;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;

public class TileEntityCobblegen extends TileEntity implements ITickableTileEntity// ISidedInventory,
{
	protected float openness;
	protected float oOpenness;
	protected int openCount;
//	private net.minecraftforge.common.util.LazyOptional<net.minecraftforge.items.IItemHandlerModifiable> genHandler;

	int cycle = 0;
	int cycleUpdate = 40;
	int maxStacksize = 64;
	int slotSize = 1;

	private CobbleGenContents cobbleGenContents;

	public TileEntityCobblegen() {
		super(ModTileEntityTypes.CobbleGen.get());
	}

	public TileEntityCobblegen setGenStats(int cycleUpdate, int maxStackSize) {
		this.cycleUpdate = cycleUpdate;
		this.maxStacksize = maxStackSize;
		this.setChanged();
		this.createInventory();
		return this;
	}
	
	public void createInventory() {
		cobbleGenContents = CobbleGenContents.createForTileEntity(slotSize, maxStacksize, this::canPlayerAccessInventory, this::setChanged);
	}

	public boolean canPlayerAccessInventory(PlayerEntity player) {
		if (this.getLevel().getBlockEntity(this.getBlockPos()) != this)
			return false;
		final double X_CENTRE_OFFSET = 0.5;
		final double Y_CENTRE_OFFSET = 0.5;
		final double Z_CENTRE_OFFSET = 0.5;
		final double MAXIMUM_DISTANCE_SQ = 8.0 * 8.0;
		return player.distanceToSqr(this.getBlockPos().getX() + X_CENTRE_OFFSET,
				this.getBlockPos().getY() + Y_CENTRE_OFFSET,
				this.getBlockPos().getZ() + Z_CENTRE_OFFSET) < MAXIMUM_DISTANCE_SQ;
	}

	public int getContainerSize() {
		return this.maxStacksize;
	}

	public int getCycleUpdate() {
		return cycleUpdate;
	}

	public int getMaxStackSize() {
		return maxStacksize;
	}



	protected ITextComponent getDefaultName() {
		return new TranslationTextComponent("container.chest");
	}

	private static final String COBBLEGEN_INVENTORY_TAG = "inventory_slots";

	@Override
	public void load(BlockState block, CompoundNBT nbt) {

		this.cycleUpdate = nbt.getInt("cycleUpdate");
		this.maxStacksize = nbt.getInt("maxStacksize");
		
		if(this.cobbleGenContents == null)
			this.createInventory();
		
		if(nbt.contains(COBBLEGEN_INVENTORY_TAG)) {
			CompoundNBT inventoryNBT = nbt.getCompound(COBBLEGEN_INVENTORY_TAG);
			
			this.cobbleGenContents.deserializeNBT(inventoryNBT);
			if (this.cobbleGenContents.getContainerSize() != slotSize)
				throw new IllegalArgumentException("Corrupted NBT: Number of inventory slots did not match expected.");
			}
		super.load(block, nbt);
	}


	@Override
	public CompoundNBT save(CompoundNBT nbt) {
		CompoundNBT inventoryNBT = this.cobbleGenContents.serializeNBT();
		nbt.put(COBBLEGEN_INVENTORY_TAG, inventoryNBT);
		nbt.putInt("cycleUpdate", cycleUpdate);
		nbt.putInt("maxStacksize", maxStacksize);
		super.save(nbt);
		return nbt;
	}

	@Override
	@Nullable
	public SUpdateTileEntityPacket getUpdatePacket() {
		CompoundNBT nbtTagCompound = new CompoundNBT();
		save(nbtTagCompound);
		int tileEntityType = 42; 
		return new SUpdateTileEntityPacket(this.getBlockPos(), tileEntityType, nbtTagCompound);
	}

	@Override
	public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt) {
		BlockState blockState = level.getBlockState(this.getBlockPos());
		load(blockState, pkt.getTag());
	}

	@Override
	public CompoundNBT getUpdateTag() {
		CompoundNBT nbtTagCompound = new CompoundNBT();
		save(nbtTagCompound);
		return nbtTagCompound;
	}

	@Override
	public void handleUpdateTag(BlockState blockState, CompoundNBT tag) {
		this.load(blockState, tag);
	}

	public void dropAllContents(World world, BlockPos blockPos) {
		InventoryHelper.dropContents(world, blockPos, this.cobbleGenContents);
	}

	@Override
	public void tick() {
		if (this.getLevel().isClientSide())
			return;
		
		if (cycle++ >= getCycleUpdate()) {
			cycle = 0;

			if (cobbleGenContents.getItem(0) == ItemStack.EMPTY || cobbleGenContents.getItem(0).getItem() != Blocks.COBBLESTONE.asItem()) {
				cobbleGenContents.setItem(0, new ItemStack(Blocks.COBBLESTONE));
			} else {
				cobbleGenContents.increaseStackSize(0, cobbleGenContents.getItem(0));
			}

			TileEntity tile = this.getLevel().getBlockEntity(this.getBlockPos().above());
			
			if (tile != null && tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, Direction.DOWN).isPresent()) {
				this.handleCapability(tile);
			}
			else if (tile instanceof IInventory) {
				this.handleIInventory(tile);
			}
			
			this.setChanged();
		}
	}

	
	private void handleIInventory(TileEntity tile) {
		
		IInventory iinventory = (IInventory) tile;
		if (isInventoryFull(iinventory, Direction.UP)) {
			return;
		} else {
			if (this.cobbleGenContents.getItem(0) != ItemStack.EMPTY) {
				ItemStack stack = this.cobbleGenContents.getItem(0).copy();
				ItemStack stack1 = putStackInInventoryAllSlots(iinventory, this.cobbleGenContents.removeItem(0, 1), Direction.UP);
				if (stack1 == ItemStack.EMPTY || stack1.getCount() == 0)
					iinventory.setChanged();
				else
					this.cobbleGenContents.setItem(0, stack);
			}
		}
		
	}
	
	
	public static ItemStack putStackInInventoryAllSlots(IInventory inventoryIn, ItemStack stack, @Nullable Direction side) {
		if (inventoryIn instanceof ISidedInventory && side != null && !(inventoryIn instanceof TileEntityCobblegen) && inventoryIn.canPlaceItem(0, stack.copy())) {
			ISidedInventory isidedinventory = (ISidedInventory) inventoryIn;
			int[] aint = isidedinventory.getSlotsForFace(side);

			for (int k = 0; k < aint.length && stack != ItemStack.EMPTY && stack.getCount() > 0; ++k)
				stack = insertStack(inventoryIn, stack, aint[k], side);
		} else {
			int i = inventoryIn.getContainerSize();

			for (int j = 0; j < i && stack != ItemStack.EMPTY && stack.getCount() > 0; ++j)
				stack = insertStack(inventoryIn, stack, j, side);
		}

		if (stack != ItemStack.EMPTY && stack.getCount() == 0)
			stack = ItemStack.EMPTY;

		return stack;
	}
	
	private static ItemStack insertStack(IInventory inventoryIn, ItemStack stack, int index, Direction side) {
		ItemStack itemstack = inventoryIn.getItem(index);

		if (canInsertItemInSlot(inventoryIn, stack, index, side)) {
			if (itemstack == ItemStack.EMPTY) {
				// Forge: BUGFIX: Again, make things respect max stack sizes.
				int max = Math.min(stack.getMaxStackSize(), inventoryIn.getMaxStackSize());
				if (max >= stack.getCount()) {
					inventoryIn.setItem(index, stack);
					stack = ItemStack.EMPTY;
				} else
					inventoryIn.setItem(index, stack.split(max));

			} else if (stack.sameItem(itemstack)) {
				// Forge: BUGFIX: Again, make things respect max stack sizes.
				int max = Math.min(stack.getMaxStackSize(), inventoryIn.getMaxStackSize());
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
		return inventoryIn.canPlaceItem(index, stack) && (!(inventoryIn instanceof ISidedInventory) || ((ISidedInventory) inventoryIn).canPlaceItemThroughFace(index, stack, side));
	}
	
	protected boolean isInventoryFull(IInventory inventoryIn, Direction side) {
		if (inventoryIn instanceof ISidedInventory) {
			ISidedInventory isidedinventory = (ISidedInventory) inventoryIn;
			int[] aint = isidedinventory.getSlotsForFace(side);

			for (int k : aint) {
				ItemStack itemstack1 = isidedinventory.getItem(k);

				if (itemstack1 == ItemStack.EMPTY || itemstack1.getCount() != itemstack1.getMaxStackSize())
					return false;
			}
		} else {
			int i = inventoryIn.getContainerSize();

			for (int j = 0; j < i; ++j) {
				ItemStack itemstack = inventoryIn.getItem(j);

				if (itemstack == ItemStack.EMPTY || itemstack.getCount() != itemstack.getMaxStackSize())
					return false;
			}
		}

		return true;
	}
	
	private void handleCapability(TileEntity tile) {

		IItemHandler handler = tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, Direction.DOWN).orElse(null);

		if (this.cobbleGenContents.getItem(0) != ItemStack.EMPTY) {
			ItemStack stack = this.cobbleGenContents.getItem(0).copy();
			stack.setCount(1);
			ItemStack stack1 = ItemHandlerHelper.insertItem(handler, stack, true);
			if (stack1 == ItemStack.EMPTY || stack1.getCount() == 0) {
				ItemHandlerHelper.insertItem(handler, this.cobbleGenContents.removeItem(0, 1), false);
				this.setChanged();
			}
		}
	}
	
	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return LazyOptional.of(() -> this.cobbleGenContents.getHandler()).cast();
        }
        return super.getCapability(cap, side);
    }
	
	public CobbleGenContents getInventory() {
		return this.cobbleGenContents;
	}
}