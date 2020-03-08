package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
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
				.doesNotBlockMovement()
				);

	}

	
//	@Override
//	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
//		builder.
//	}
	
	@Override
	public VoxelShape getRenderShape(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return VoxelShapes.fullCube();
	}

//	@Override
//	public VoxelShape getCollisionBoundingBox(BlockState state, BlockAccess worldIn, BlockPos pos) {
//		return VoxelShapes.empty();
//	}

	@Override
	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
		entityIn.isAirBorne = false;
		entityIn.setMotionMultiplier(state, new Vec3d(0.25D, (double)0.05F, 0.25D));
	}

	@SubscribeEvent
	public void onEntityJump(LivingJumpEvent e) {
		if (e.getEntity().getEntityWorld().getBlockState(new BlockPos((int) Math.floor(e.getEntity().posX), (int) Math.floor(e.getEntity().posY) - 1, (int) Math.floor(e.getEntity().posZ))).getBlock() == this)
			e.getEntityLiving().setMotion(e.getEntityLiving().getMotion().getX(), .001, e.getEntityLiving().getMotion().getY());
	}
}