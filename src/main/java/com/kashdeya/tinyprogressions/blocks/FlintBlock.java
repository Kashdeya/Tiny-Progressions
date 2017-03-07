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

public class FlintBlock extends Block{
	
	public FlintBlock()
	{
		super(Material.GROUND);
		this.setHardness(1.0F);
		this.setResistance(5.0F);
		this.setSoundType(blockSoundType.STONE);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("flint_block");
	}
	
	/**
     * Get the Item that this Block should drop when harvested.
     */
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TechBlocks.FlintBlock);
    }
	
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
	
}