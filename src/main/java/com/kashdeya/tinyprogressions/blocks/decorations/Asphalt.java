package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class Asphalt extends StandardBlock{
	
	public Asphalt()
    {
        super(Properties
        		.of(Material.STONE)
        		.strength(.8F, 100F)
        		.sound(SoundType.STONE)
        		.harvestLevel(1)
        		.harvestTool(ToolType.PICKAXE));
    }
	
	@Override
    public boolean canDropFromExplosion(BlockState state, IBlockReader world, BlockPos pos, Explosion explosionIn)
    {
        return true;
    }
	
	@Override
	public void  fallOn(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) 
    {
        entityIn.causeFallDamage(fallDistance, 3.0F);
    }
	
	@Override
    public void stepOn( World worldIn, BlockPos pos, Entity entityIn)
    {
        entityIn.setDeltaMovement(entityIn.getDeltaMovement().multiply(new Vector3d(1.4D,0,1.4D)));
        super.stepOn(worldIn, pos, entityIn);
    }

}
