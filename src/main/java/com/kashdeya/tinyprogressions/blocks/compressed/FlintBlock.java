package com.kashdeya.tinyprogressions.blocks.compressed;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class FlintBlock extends StandardBlock implements IOreDictEntry{
	
	public FlintBlock()
	{
		super(Properties.create(Material.ROCK).hardnessAndResistance(1f, 5f).sound(SoundType.STONE));

	}
	
	@Override
	public String getOreDictName() {
		return "blockFlint";
	}
	
	/**
     * Get the Item that this Block should drop when harvested.
     */
//	@Override
//    public Item getItemDropped(IBlockState state, Random rand, int fortune)
//    {
//        return Item.getItemFromBlock(TechBlocks.flint_block);
//    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }
	
	@Override
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) 
    {
        entityIn.onLivingFall(fallDistance, 3.0F);
    }
	
}