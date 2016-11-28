package com.kashdeya.tinyprogressions.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class FleshBlock extends Block{
	
	public FleshBlock() {
		super(Material.SAND);
		this.setHardness(0.5F);
		this.setHarvestLevel("shovel",0);
		this.setResistance(5.0F);
		this.setSoundType(blockSoundType.GROUND);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("FleshBlock");
	}
	
	/**
     * Get the Item that this Block should drop when harvested.
     */
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TechBlocks.FleshBlock);
    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }
	
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
    	entityIn.motionX *= 0.4D;
        entityIn.motionZ *= 0.4D;
    }
	
}