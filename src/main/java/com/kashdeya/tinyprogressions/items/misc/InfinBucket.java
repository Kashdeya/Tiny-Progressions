package com.kashdeya.tinyprogressions.items.misc;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.FluidUtil;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CauldronBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
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
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.fluids.capability.templates.FluidHandlerItemStack;

public class InfinBucket extends BucketItem {

	@CapabilityInject
	(FluidHandlerItemStack.class)
	static IFluidHandlerItem ItemFluidHandler = null;

	public InfinBucket() {
		super(Blocks.FLOWING_WATER);
		this.setCreativeTab(TinyProgressions.TAB);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, false);

		if (raytraceresult == null) {
			return new ActionResult<ItemStack>(ActionResultType.PASS, itemstack);
		} else if (raytraceresult.getType() != RayTraceResult.Type.BLOCK) {
			return new ActionResult<ItemStack>(ActionResultType.PASS, itemstack);
		}

		BlockPos blockpos = new BlockPos(raytraceresult.getHitVec().getX(),raytraceresult.getHitVec().getY(), raytraceresult.getHitVec().getZ());
		BlockState block = worldIn.getBlockState(blockpos);

		if (block.getBlock() instanceof CauldronBlock) {
			CauldronBlock cauldron = (CauldronBlock) block.getBlock();
			int level = ((Integer) block.getValue(CauldronBlock.LEVEL)).intValue();
			if (level < 3 && !worldIn.isRemote) {
				playerIn.addStat(StatList.CAULDRON_FILLED);
				cauldron.setWaterLevel(worldIn, blockpos, block, 3);
				worldIn.playSound((PlayerEntity) null, blockpos, SoundEvents.ITEM_BUCKET_EMPTY, SoundCategory.BLOCKS,
						1.0F, 1.0F);
			}
			return new ActionResult<ItemStack>(ActionResultType.SUCCESS, itemstack);

		} else {
			boolean flag1 = block.getBlock().isReplaceable(worldIn, blockpos);
			BlockPos blockpos1 = flag1 && raytraceresult.sideHit == Direction.UP ? blockpos
					: blockpos.offset(raytraceresult.sideHit);

			if (!playerIn.canPlayerEdit(blockpos1, raytraceresult.sideHit, itemstack)) {
				return new ActionResult<ItemStack>(ActionResultType.FAIL, itemstack);
			} else if (this.tryPlaceContainedLiquid(playerIn, worldIn, blockpos1)) {
				if (playerIn instanceof ServerPlayerEntity) {
					CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayerEntity) playerIn, blockpos1, itemstack);
				}

				playerIn.addStat(StatList.getObjectUseStats(this));
				return new ActionResult<ItemStack>(ActionResultType.SUCCESS, itemstack);
			} else {
				return new ActionResult<ItemStack>(ActionResultType.FAIL, itemstack);
			}
		}

	}

	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, CompoundNBT nbt) {
		if (this.getClass() == InfinBucket.class) {
			return new FluidUtil(stack, 1000, FluidRegistry.WATER);
		}
		return super.initCapabilities(stack, nbt);
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.infinbucket_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
	}

}