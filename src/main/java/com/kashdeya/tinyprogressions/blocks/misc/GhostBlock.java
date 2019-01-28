package com.kashdeya.tinyprogressions.blocks.misc;

import java.util.Random;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;

public class GhostBlock extends Block {
	
	public GhostBlock()
    {
        super(Material.CLOTH);
        this.setHardness(1.5F);
        this.setHarvestLevel("pickaxe", 1);
        this.setResistance(10.0F);
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setTranslationKey("ghost_block");
    }
	
    /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     */
	@Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    
    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }
	
	@Override
    public int quantityDropped(Random rand)
    {
        return 0;
    }
	
    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }

}
