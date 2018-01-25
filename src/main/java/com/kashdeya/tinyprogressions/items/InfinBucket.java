package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.util.FluidUtil;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockCauldron;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.fluids.capability.templates.FluidHandlerItemStack;

public class InfinBucket extends ItemBucket {

	@CapabilityInject
	(FluidHandlerItemStack.class)
	static IFluidHandlerItem ItemFluidHandler = null;

	public InfinBucket() {
		super(Blocks.FLOWING_WATER);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, false);

		if (raytraceresult == null) {
			return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
		} else if (raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK) {
			return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
		}

		BlockPos blockpos = raytraceresult.getBlockPos();
		IBlockState block = worldIn.getBlockState(blockpos);

		if (block.getBlock() instanceof BlockCauldron) {
			BlockCauldron cauldron = (BlockCauldron) block.getBlock();
			int level = ((Integer) block.getValue(BlockCauldron.LEVEL)).intValue();
			if (level < 3 && !worldIn.isRemote) {
				playerIn.addStat(StatList.CAULDRON_FILLED);
				cauldron.setWaterLevel(worldIn, blockpos, block, 3);
				worldIn.playSound((EntityPlayer) null, blockpos, SoundEvents.ITEM_BUCKET_EMPTY, SoundCategory.BLOCKS,
						1.0F, 1.0F);
			}
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);

		} else {
			boolean flag1 = block.getBlock().isReplaceable(worldIn, blockpos);
			BlockPos blockpos1 = flag1 && raytraceresult.sideHit == EnumFacing.UP ? blockpos
					: blockpos.offset(raytraceresult.sideHit);

			if (!playerIn.canPlayerEdit(blockpos1, raytraceresult.sideHit, itemstack)) {
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			} else if (this.tryPlaceContainedLiquid(playerIn, worldIn, blockpos1)) {
				if (playerIn instanceof EntityPlayerMP) {
					CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP) playerIn, blockpos1, itemstack);
				}

				playerIn.addStat(StatList.getObjectUseStats(this));
				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
			} else {
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}

	}

	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, NBTTagCompound nbt) {
		if (this.getClass() == InfinBucket.class) {
			return new FluidUtil(stack, 1000, FluidRegistry.WATER);
		}
		return super.initCapabilities(stack, nbt);
	}

}