package com.kashdeya.tinyprogressions.blocks.compressed;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;



public class BoneBlock extends StandardBlock implements IOreDictEntry{
	
	public BoneBlock()
	{
		super(Properties
				.of(Material.STONE)
				.strength(0.5F, 5F)
				.sound(SoundType.STONE));
	}
	
	@Override
	public String getOreDictName() {
		return "blockBone";
	}
	
	@Override
    public boolean canDropFromExplosion(BlockState state, IBlockReader world, BlockPos pos, Explosion explosionIn)
    {
        return false;
    }
	
	@Override
	public void fallOn(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) 
    {
        entityIn.causeFallDamage(fallDistance, 3.0F);
    }
}
