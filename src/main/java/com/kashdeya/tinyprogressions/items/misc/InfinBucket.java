package com.kashdeya.tinyprogressions.items.misc;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.FluidUtil;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.block.ILiquidContainer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.fluids.capability.templates.FluidHandlerItemStack;

public class InfinBucket extends BucketItem {

	public InfinBucket() {
		super(()-> Fluids.WATER, new Properties().group(TinyProgressions.ToolsGroup));
	}

	@Override
	protected ItemStack emptyBucket(ItemStack p_203790_1_, PlayerEntity p_203790_2_) {
		return p_203790_1_;
	}
	
//	@Override
//	public ICapabilityProvider initCapabilities(ItemStack stack, CompoundNBT nbt) {
//		return new FluidUtil(stack, 1000, Fluids.WATER);
//	}
//	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.infinbucket_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
	}

}