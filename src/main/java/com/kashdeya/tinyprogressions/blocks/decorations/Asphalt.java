package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class Asphalt extends StandardBlock{
	
	public Asphalt()
    {
        super(Properties
        		.create(Material.ROCK)
        		.hardnessAndResistance(.8F, 100F)
        		.sound(SoundType.STONE)
        		.harvestLevel(1)
        		.harvestTool(ToolType.PICKAXE));
    }
	
	/**
     * Get the Item that this Block should drop when harvested.
     */
//	@Override
//    public Item getItemDropped(IBlockState state, Random rand, int fortune)
//    {
//        return Item.getItemFromBlock(TechBlocks.asphalt_block);
//    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return true;
    }
	
//	@Override
//    public int quantityDropped(Random rand)
//    {
//        return 1;
//    }
//	
	@Override
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) 
    {
        entityIn.onLivingFall(fallDistance, 3.0F);
    }
	
	@Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
    	entityIn.setMotion(entityIn.getMotion().x * 1.8D, entityIn.getMotion().y, entityIn.getMotion().z * 1.8D);
        super.onEntityWalk(worldIn, pos, entityIn);
    }

}
