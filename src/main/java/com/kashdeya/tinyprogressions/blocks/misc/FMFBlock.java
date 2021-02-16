package com.kashdeya.tinyprogressions.blocks.misc;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class FMFBlock extends Block{

	public FMFBlock(Properties properties) {
		super(properties);
	}
	
	public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return false;
	}
	
}
