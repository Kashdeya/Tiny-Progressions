package com.kashdeya.tinyprogressions.util;

import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;

public class FluidUtil implements IFluidHandlerItem {

	private ItemStack container;
	private int capacity;
	private FluidStack fluid;

	public FluidUtil(ItemStack container, int capacity, FluidStack fluid) {
		this.container = container;
		this.capacity = capacity;
		this.fluid = fluid;
	}

	public FluidUtil(ItemStack container, int capacity, Fluid fluid) {
		this.container = container;
		this.capacity = capacity;
		this.fluid = new FluidStack(fluid, capacity);
	}

	
	@Override
	public ItemStack getContainer() {
		return container;
	}

	@Override
	public int getTanks() {
		return 0;
	}

	@Override
	public FluidStack getFluidInTank(int tank) {
		return this.fluid;
	}

	@Override
	public int getTankCapacity(int tank) {
		return this.capacity;
	}

	@Override
	public boolean isFluidValid(int tank, FluidStack stack) {
		return !stack.isEmpty();
	}

	@Override
	public int fill(FluidStack resource, FluidAction action) {
		return 0;
	}

	@Override
	public FluidStack drain(FluidStack resource, FluidAction action) {
		return null;
	}

	@Override
	public FluidStack drain(int maxDrain, FluidAction action) {
		if(container.getCount() != 1 || maxDrain <= 0) {
		return null;
		}
		if(fluid == null || fluid.getAmount() <= 0) {
			return null;
		}
	
		final int drainAmount = Math.min(fluid.getAmount(), maxDrain);
		FluidStack drained = fluid.copy();
		drained.setAmount(drainAmount);

		return drained;
	}

//	@Override
//	public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
//		return null;
//	}
//	
	
	
	
	
	
	
//	
//	@Override
//	public IFluidTankProperties[] getTankProperties() {
//		return new FluidTankProperties[] {new FluidTankProperties(fluid, capacity)};
//	}
//
//	@Override
//	public int fill(FluidStack resource, boolean doFill) {
//		return 0;
//	}
//
//	@Override
//	public FluidStack drain(FluidStack resource, boolean doDrain) {
//		if (resource == null || resource.amount <= 0 || !resource.isFluidEqual(fluid)) {
//			return null;
//		}
//		return drain(resource.amount, doDrain);
//	}
//
//	@Override
//	public FluidStack drain(int maxDrain, boolean doDrain) {
//		if(container.getCount() != 1 || maxDrain <= 0) {
//			return null;
//		}
//		if(fluid == null || fluid.amount <= 0) {
//			return null;
//		}
//		
//		final int drainAmount = Math.min(fluid.amount, maxDrain);
//		FluidStack drained = fluid.copy();
//		drained.amount = drainAmount;
//		if(doDrain) {
//			//Do not reduce fluid because it is infinite
//		}
//		return drained;
//	}

//	public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable Direction facing) {
//		return capability == CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY;
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	@Nullable
//	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction facing) {
//		return capability == CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY ?  (LazyOptional<T>)this : null;
//	}
//


}