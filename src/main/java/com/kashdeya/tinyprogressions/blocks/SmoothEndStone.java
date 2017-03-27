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
import com.kashdeya.tinyprogressions.main.TinyProgressions;

public class SmoothEndStone extends Block {
	
	public SmoothEndStone()
    {
        super(Material.ROCK);
        this.setHardness(3.0F);
        this.setHarvestLevel("pickaxe", 1);
        this.setResistance(15.0F);
        this.setSoundType(blockSoundType.STONE);
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setUnlocalizedName("smooth_endstone");
    }
	
	/**
     * Get the Item that this Block should drop when harvested.
     */
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TechBlocks.smooth_endstone);
    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }
	
	@Override
    public int quantityDropped(Random rand)
    {
        return 1;
    }
	
	@Override
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.fall(fallDistance, 3.0F);
    }
}
