package com.kashdeya.tinyprogressions.blocks.compressed;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class CharcoalBlock extends StandardBlock implements IOreDictEntry{
	
	public CharcoalBlock()
	{
		super(Properties.of(Material.STONE)
				.strength(1.5F, 10F)
				.harvestLevel(1)
				.harvestTool(ToolType.PICKAXE)
				.sound(SoundType.STONE));
	}
	
	@Override
	public String getOreDictName() {
		return "blockCharcoal";
	}
	
	/**
     * Get the Item that this Block should drop when harvested.
//     */
//	@Override
//    public Item getItemDropped(IBlockState state, Random rand, int fortune)
//    {
//        return Item.getItemFromBlock(TechBlocks.charcoal_block);
//    }
	
	@Override
    public boolean  canDropFromExplosion(BlockState state, IBlockReader world, BlockPos pos, Explosion explosionIn)
    {
        return false;
    }
	
}