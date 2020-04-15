package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

public class BaseScythe extends SwordItem {

	public BaseScythe(IItemTier tier, int p_i48460_2_, float p_i48460_3_, Properties properties) {
		super(tier, p_i48460_2_, p_i48460_3_, properties.group(TinyProgressions.TAB));

	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		ItemStack itemstack = context.getPlayer().getHeldItem(context.getHand());

		if (!context.getPlayer().canPlayerEdit(context.getPos().offset(context.getFace()), context.getFace(),
				itemstack)) {
			return ActionResultType.PASS;
		} else {
			int hook = ForgeEventFactory.onHoeUse(context);
			if (hook != 0)
				return hook > 0 ? ActionResultType.SUCCESS : ActionResultType.FAIL;

			BlockState iblockstate = context.getWorld().getBlockState(context.getPos());
			Block block = iblockstate.getBlock();

			if (context.getFace() != Direction.DOWN && context.getWorld().isAirBlock(context.getPos().up())) {
				if (block == Blocks.GRASS || block == Blocks.GRASS_PATH) {
					this.setBlock(itemstack, context.getPlayer(), context.getWorld(), context.getPos(),
							Blocks.DIRT.getDefaultState());
					return ActionResultType.SUCCESS;
				}else if (block == Blocks.MYCELIUM) {
					this.setBlock(itemstack, context.getPlayer(), context.getWorld(), context.getPos(),
							Blocks.COARSE_DIRT.getDefaultState());
					return ActionResultType.SUCCESS;
				}else if (block == Blocks.DIRT) {
					this.setBlock(itemstack, context.getPlayer(), context.getWorld(), context.getPos(),
							Blocks.FARMLAND.getDefaultState());
					return ActionResultType.SUCCESS;
				} else if (block == Blocks.COARSE_DIRT) {
					this.setBlock(itemstack, context.getPlayer(), context.getWorld(), context.getPos(),
							Blocks.DIRT.getDefaultState());
					return ActionResultType.SUCCESS;
				} else if (block == Blocks.PODZOL) {
					this.setBlock(itemstack, context.getPlayer(), context.getWorld(), context.getPos(), 
							Blocks.COARSE_DIRT.getDefaultState());
					return ActionResultType.SUCCESS;
				}

			}

		}

		for (int k = -1; k < 2; k++) {
			for (int l = -1; l < 2; l++) {
				BlockPos selectedPose = new BlockPos(context.getPos().add(k, 0, l));
				if (!context.getWorld().isRemote && (context.getWorld().getBlockState(selectedPose).getBlock() instanceof IGrowable)) {
					IGrowable cropBlock = (IGrowable) context.getWorld().getBlockState(selectedPose).getBlock();
					BlockState cropState = context.getWorld().getBlockState(selectedPose);
					if (!cropBlock.canGrow(context.getWorld(), selectedPose, cropState, false)) {
						System.out.println(context.getWorld().destroyBlock(selectedPose, true));
						context.getWorld().setBlockState(selectedPose, cropState.getBlock().getDefaultState(), 2);
						context.getWorld().notifyBlockUpdate(selectedPose, cropState, cropState.getBlock().getDefaultState(), 2);
//						System.out.println(cropState.getBlock().getRegistryName());
						itemstack.damageItem(1, context.getPlayer(), (p_220041_1_) -> { p_220041_1_.sendBreakAnimation(context.getHand());	});
					}
				}
			}
		}
		return super.onItemUse(context);
	}


	protected void setBlock(ItemStack stack, PlayerEntity player, World worldIn, BlockPos pos, BlockState state) {
		worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

		if (!worldIn.isRemote) {
			worldIn.setBlockState(pos, state, 11);
			stack.damageItem(1, player, (p_220041_1_) -> {
				p_220041_1_.sendBreakAnimation(player.getActiveHand());
			});
		}
	}
}