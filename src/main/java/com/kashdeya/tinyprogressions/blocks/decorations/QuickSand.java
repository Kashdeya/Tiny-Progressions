package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class QuickSand extends Block {

	public QuickSand() {
		super(Material.SAND);
		this.setHarvestLevel("shovel", 0);
		this.setHardness(0.4F);
		this.setSoundType(SoundType.SAND);
		this.setCreativeTab(TinyProgressions.tabTP);
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
    public void onEntityCollision(World worldIn, BlockPos pos, IBlockState state, Entity entity) {
		entity.isAirBorne = false;
		entity.setInWeb();
	}

	@SubscribeEvent
	public void onEntityJump(LivingJumpEvent e) {
		if (e.getEntity().getEntityWorld().getBlockState(new BlockPos((int) Math.floor(e.getEntity().posX), (int) Math.floor(e.getEntity().posY) - 1, (int) Math.floor(e.getEntity().posZ))).getBlock() == this)
			e.getEntityLiving().motionY = 0D;
	}
}