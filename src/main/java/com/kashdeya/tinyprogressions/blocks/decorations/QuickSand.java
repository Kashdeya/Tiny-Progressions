package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class QuickSand extends StandardBlock {

	public QuickSand() {
		super(Properties
				.create(Material.SAND)
				.hardnessAndResistance(0.4F)
				.sound(SoundType.SAND)
				.harvestLevel(0)
				.harvestTool(ToolType.SHOVEL)
				);

	}

	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return FULL_BLOCK_AABB;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		return NULL_AABB;
	}

	@Override
    public void onEntityCollision(World worldIn, BlockPos pos, BlockState state, Entity entity) {
		entity.isAirBorne = false;
//		entity.setInWeb();
	}

	@SubscribeEvent
	public void onEntityJump(LivingJumpEvent e) {
		if (e.getEntity().getEntityWorld().getBlockState(new BlockPos((int) Math.floor(e.getEntity().posX), (int) Math.floor(e.getEntity().posY) - 1, (int) Math.floor(e.getEntity().posZ))).getBlock() == this)
			e.getEntityLiving().setMotion(e.getEntityLiving().getMotion().getX(), 0, e.getEntityLiving().getMotion().getY());
	}
}