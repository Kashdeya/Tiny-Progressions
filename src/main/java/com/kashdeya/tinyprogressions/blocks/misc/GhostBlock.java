package com.kashdeya.tinyprogressions.blocks.misc;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class GhostBlock extends Block {
	
	public GhostBlock()
    {
        super(Properties.create(Material.WOOL)
        		.hardnessAndResistance(1.5f, 10f)
        		.harvestTool(ToolType.PICKAXE)
        		.harvestLevel(1)
        		.notSolid());
//        this.setTranslationKey("ghost_block");
    }
	
	
	
	@Override
	public VoxelShape getCollisionShape(BlockState state, IBlockReader reader, BlockPos position, ISelectionContext context) {
		return VoxelShapes.empty();
	}
	
    /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     */
//	@Override
//    public boolean isOpaqueCube(IBlockState state)
//    {
//        return false;
//    }
//    
//    @Override
//    public boolean isFullCube(IBlockState state)
//    {
//        return false;
//    }
//	
//	@Override
//    public boolean canDropFromExplosion(Explosion explosionIn)
//    {
//        return false;
//    }
//	
//	@Override
//    public int quantityDropped(Random rand)
//    {
//        return 0;
//    }
//	
//    @Nullable
//    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
//    {
//        return NULL_AABB;
//    }

}
