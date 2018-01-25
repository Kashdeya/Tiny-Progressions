package com.kashdeya.tinyprogressions.util;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.FluidTankProperties;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.fluids.capability.IFluidTankProperties;

public class FluidUtil implements IFluidHandlerItem, ICapabilityProvider {

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
	public IFluidTankProperties[] getTankProperties() {
		return new FluidTankProperties[] {new FluidTankProperties(fluid, capacity)};
	}

	@Override
	public int fill(FluidStack resource, boolean doFill) {
		return 0;
	}

	@Override
	public FluidStack drain(FluidStack resource, boolean doDrain) {
		if (resource == null || resource.amount <= 0 || !resource.isFluidEqual(fluid)) {
			return null;
		}
		return drain(resource.amount, doDrain);
	}

	@Override
	public FluidStack drain(int maxDrain, boolean doDrain) {
		if(container.getCount() != 1 || maxDrain <= 0) {
			return null;
		}
		if(fluid == null || fluid.amount <= 0) {
			return null;
		}
		
		final int drainAmount = Math.min(fluid.amount, maxDrain);
		FluidStack drained = fluid.copy();
		drained.amount = drainAmount;
		if(doDrain) {
			//Do not reduce fluid because it is infinite
		}
		return drained;
	}

	@Override
	public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
		return capability == CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Nullable
	public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
		return capability == CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY ? (T) this : null;
	}

	@Override
	public ItemStack getContainer() {
		return container;
	}

}