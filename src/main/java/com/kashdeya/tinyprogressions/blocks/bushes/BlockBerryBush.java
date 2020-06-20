package com.kashdeya.tinyprogressions.blocks.bushes;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.item.Item;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IPlantable;

public class BlockBerryBush extends BushBlock implements IPlantable {
	
	protected static final AxisAlignedBB BERRY_AABB = new AxisAlignedBB(0.125D, 0.0D, 0.125D, 0.875D, 1.0D, 0.875D);

	private Item droppedItem;
	

	public BlockBerryBush(Properties properties)
    {
		super(properties);
    }
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos position, ISelectionContext context) {
		return VoxelShapes.create(BERRY_AABB);
	}
	
	@Override
	public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) 
	{
        return state.getBlock() == Blocks.GRASS || state.getBlock() == Blocks.DIRT;
    }
	
//	@Override
//    public Item getItemDropped(IBlockState state, Random rand, int fortune)
//    {
//        return TechFoods.raspberry_berry;
//    }

//	@Override
//    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
//    {
//        return true;
//    }

//	@Override
//	public int quantityDropped(Random random)
//    {
//        return 1 + random.nextInt(5);
//    }
	
}