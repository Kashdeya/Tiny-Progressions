package com.kashdeya.tinyprogressions.blocks.decorations;

import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IShearable;

public class OldReed extends BushBlock implements IShearable {
	
    protected static final AxisAlignedBB REED_AABB = new AxisAlignedBB(0.125D, 0.0D, 0.125D, 0.875D, 1.0D, 0.875D);
	
	public OldReed()
    {
        super(Properties
        		.create(Material.PLANTS, MaterialColor.WOOD)
        		.hardnessAndResistance(0F)
        		.sound(SoundType.PLANT));
    }
	
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos position, ISelectionContext context) {
		return VoxelShapes.create(REED_AABB);
	}
	

	
	//TODO

//	@Override
//    protected boolean canSustainBush(BlockState state)
//    {
//        return state.getBlock() == Blocks.SAND;
//    }
//
//	@Override
//    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
//    {
//        return true;
//    }

//	@Override
//	public int quantityDropped(Random random)
//    {
//        return 2;
//    }

//	@Override
//    public Item getItemDropped(IBlockState state, Random rand, int fortune)
//    {
//        return TechItems.dead_reed;
//    }

//    @Override 
//    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){
//    	return false; 
//    }
//
//    @Override
//    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
//    {
//        return Collections.singletonList(new ItemStack(TechBlocks.old_reed));
//    }
}