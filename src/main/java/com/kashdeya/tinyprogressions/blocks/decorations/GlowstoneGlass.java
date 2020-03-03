package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class GlowstoneGlass extends AbstractGlassBlock implements IOreDictEntry
{
    public GlowstoneGlass()
    {
        super(Properties.create(Material.GLASS, MaterialColor.AIR)
        		.hardnessAndResistance(.3F)
        		.sound(SoundType.GLASS)
        		.lightValue(1));
        
        //TODO
//		setLightOpacity(1);
    }
    
    @Override
    public String getOreDictName() {
    	return "blockGlassGlowstone";
    }

    //TODO
//    @SideOnly(Side.CLIENT)
//    public BlockRenderLayer getBlockLayer()
//    {
//        return BlockRenderLayer.CUTOUT;
//    }
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
//        return Item.getItemFromBlock(TechBlocks.glowstone_glass);
//    }
//    
//    @Override
//    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
//    {
//        return MapColor.AIR;
//    }
}
