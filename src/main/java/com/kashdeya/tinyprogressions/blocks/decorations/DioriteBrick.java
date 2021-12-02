package com.kashdeya.tinyprogressions.blocks.decorations;

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
import net.minecraftforge.common.ToolType;

public class DioriteBrick extends StandardBlock implements IOreDictEntry{
	
	public DioriteBrick()
    {
        super(Properties
        		.of(Material.STONE)
        		.strength(1.5F, 10.0F)
        		.sound(SoundType.STONE)
        		.harvestLevel(1)
        		.harvestTool(ToolType.PICKAXE));

    }
	
	@Override
	public String getOreDictName() {
		return "stoneDioriteBrick";
	}
	
//	/**
//     * Get the Item that this Block should drop when harvested.
//     */
//	@Override
//    public Item getItemDropped(IBlockState state, Random rand, int fortune)
//    {
//        return Item.getItemFromBlock(TechBlocks.diorite_brick);
//    }
	
	@Override
    public boolean canDropFromExplosion(BlockState state, IBlockReader world, BlockPos pos, Explosion explosionIn)
    {
        return false;
    }
	
//	@Override
//    public int quantityDropped(Random rand)
//    {
//        return 1;
//    }
	
	@Override
	public void fallOn(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) 
    {
        entityIn.causeFallDamage(fallDistance, 3.0F);
    }

}
