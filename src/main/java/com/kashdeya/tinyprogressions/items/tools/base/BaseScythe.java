package com.kashdeya.tinyprogressions.items.tools.base;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ToolItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

public class BaseScythe extends ToolItem {
	
   private static final Set<Block> DIGGABLES = ImmutableSet.of(Blocks.NETHER_WART_BLOCK, Blocks.WARPED_WART_BLOCK, Blocks.HAY_BLOCK, Blocks.DRIED_KELP_BLOCK, Blocks.TARGET, Blocks.SHROOMLIGHT, Blocks.SPONGE, Blocks.WET_SPONGE, Blocks.JUNGLE_LEAVES, Blocks.OAK_LEAVES, Blocks.SPRUCE_LEAVES, Blocks.DARK_OAK_LEAVES, Blocks.ACACIA_LEAVES, Blocks.BIRCH_LEAVES);
   protected static final Map<Block, BlockState> TILLABLES = Maps.newHashMap(ImmutableMap.of(Blocks.GRASS_BLOCK, Blocks.FARMLAND.defaultBlockState(), Blocks.GRASS_PATH, Blocks.FARMLAND.defaultBlockState(), Blocks.DIRT, Blocks.FARMLAND.defaultBlockState(), Blocks.COARSE_DIRT, Blocks.DIRT.defaultBlockState()));


	public BaseScythe(IItemTier tier, int maxDamage, float attackSpeed, Item.Properties properties) {
		super(maxDamage, attackSpeed,tier, DIGGABLES, properties.tab(TinyProgressions.ToolsGroup));

	}
	
	
	@Override
    public boolean hurtEnemy(ItemStack p_77644_1_, LivingEntity p_77644_2_, LivingEntity p_77644_3_) {
		return super.hurtEnemy(p_77644_1_, null, null);
	}

	@Override
	public boolean mineBlock(ItemStack p_179218_1_, World p_179218_2_, BlockState p_179218_3_, BlockPos p_179218_4_, LivingEntity p_179218_5_) {
		return super.mineBlock(p_179218_1_, p_179218_2_, p_179218_3_, p_179218_4_, null);
	}
		   
		   

	public ActionResultType useOn(ItemUseContext context) {
		ItemStack itemstack = context.getPlayer().getItemInHand(context.getHand());
		
		
		if (!context.getPlayer().mayUseItemAt(context.getClickedPos().relative(context.getClickedFace()), context.getClickedFace(),	itemstack)) {
			return ActionResultType.PASS;
		} else {
			int hook = ForgeEventFactory.onHoeUse(context);
			if (hook != 0)
				return hook > 0 ? ActionResultType.SUCCESS : ActionResultType.FAIL;

			BlockState iblockstate = context.getLevel().getBlockState(context.getClickedPos());
			Block block = iblockstate.getBlock();

			if (context.getClickedFace() != Direction.DOWN && context.getLevel().isEmptyBlock(context.getClickedPos().above())) {
				if (block == Blocks.GRASS_BLOCK || block == Blocks.GRASS_PATH) {
					this.setBlock(itemstack, context.getPlayer(), context.getLevel(), context.getClickedPos(),
							Blocks.DIRT.defaultBlockState());
					return ActionResultType.SUCCESS;
				}else if (block == Blocks.MYCELIUM) {
					this.setBlock(itemstack, context.getPlayer(), context.getLevel(), context.getClickedPos(),
							Blocks.COARSE_DIRT.defaultBlockState());
					return ActionResultType.SUCCESS;
				}else if (block == Blocks.DIRT) {
					this.setBlock(itemstack, context.getPlayer(), context.getLevel(), context.getClickedPos(),
							Blocks.FARMLAND.defaultBlockState());
					return ActionResultType.SUCCESS;
				} else if (block == Blocks.COARSE_DIRT) {
					this.setBlock(itemstack, context.getPlayer(), context.getLevel(), context.getClickedPos(),
							Blocks.DIRT.defaultBlockState());
					return ActionResultType.SUCCESS;
				} else if (block == Blocks.PODZOL) {
					this.setBlock(itemstack, context.getPlayer(), context.getLevel(), context.getClickedPos(), 
							Blocks.COARSE_DIRT.defaultBlockState());
					return ActionResultType.SUCCESS;
				}

			}

		}

		for (int k = -1; k < 2; k++) {
			for (int l = -1; l < 2; l++) {
				BlockPos selectedPose = new BlockPos(context.getClickedPos().offset(k, 0, l));
				if (!context.getLevel().isClientSide() && (context.getLevel().getBlockState(selectedPose).getBlock() instanceof IGrowable)) {
					IGrowable cropBlock = (IGrowable) context.getLevel().getBlockState(selectedPose).getBlock();
					BlockState cropState = context.getLevel().getBlockState(selectedPose);
					if (!cropBlock.isValidBonemealTarget(context.getLevel(), selectedPose, cropState, false)) {
						context.getLevel().destroyBlock(selectedPose, true);
						context.getLevel().sendBlockUpdated(selectedPose, cropState, Blocks.AIR.defaultBlockState(), 2);
//						context.getLevel().setBlockAndUpdate(selectedPose, Blocks.AIR.defaultBlockState());
						itemstack.hurtAndBreak(1, context.getPlayer(), (p_220041_1_) -> { p_220041_1_.broadcastBreakEvent(context.getHand());	});
					}
				}
			}
		}
		return ActionResultType.SUCCESS;
	}


	protected void setBlock(ItemStack stack, PlayerEntity player, World worldIn, BlockPos pos, BlockState state) {
		worldIn.playSound(player, pos, SoundEvents.HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

		if (!worldIn.isClientSide()) {
			worldIn.setBlock(pos, state, 11);
			stack.hurtAndBreak(1, player, (p_220041_1_) -> {
				p_220041_1_.broadcastBreakEvent(Hand.MAIN_HAND);
			});
		}
	}
}