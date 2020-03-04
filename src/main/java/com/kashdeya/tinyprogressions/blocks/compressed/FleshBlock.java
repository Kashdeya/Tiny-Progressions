package com.kashdeya.tinyprogressions.blocks.compressed;

import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class FleshBlock extends FallingBlock{
	
	public FleshBlock()
	{
		super(Properties
				.create(Material.SAND)
				.hardnessAndResistance(.5F, 5F)
				.sound(SoundType.SAND));
	}
	
//	/**
//     * Get the Item that this Block should drop when harvested.
//     */
//	@Override
//    public Item getItemDropped(BlockState state, Random rand, int fortune)
//    {
//        return Item.getItemFromBlock(TechBlocks.flesh_block);
//    }
//	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }
	
	@Override
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.fall(fallDistance, 3.0F);
    }
	
	/**
     * Triggered whenever an entity collides with this block (enters into the block)
     */
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
        entityIn.setMotion(entityIn.getMotion().getX() * 0.4D, entityIn.getMotion().getY(), entityIn.getMotion().getZ() * 0.4D);
    }
	
}