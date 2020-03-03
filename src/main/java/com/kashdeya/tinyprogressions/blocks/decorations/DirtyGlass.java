package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class DirtyGlass extends AbstractGlassBlock implements IOreDictEntry
{
	//TODO not sure where to register
    public DirtyGlass()
    {
        super(Properties.create(Material.GLASS, MaterialColor.AIR)
        		.hardnessAndResistance(.3F)
        		.sound(SoundType.GLASS));
    }
    
    @Override
    public String getOreDictName() {
    	return "blockGlassDirty";
    }
    
    
    //TODO ?
    public BlockRenderType getBlockLayer()
    {
        return BlockRenderType.MODEL;
    }
//
//    @Override
//    public boolean isFullCube(IBlockState state)
//    {
//        return false;
//    }
//    
//    @Override
//    public boolean isOpaqueCube(IBlockState state)
//    {
//        return false;
//    }
//    
//    @Override
//    public int quantityDropped(Random rand)
//    {
//        return 1;
//    }
//    
//    @Override
//    public Item getItemDropped(IBlockState state, Random rand, int fortune)
//    {
//        return Item.getItemFromBlock(TechBlocks.dirty_glass);
//    }
//    
}
