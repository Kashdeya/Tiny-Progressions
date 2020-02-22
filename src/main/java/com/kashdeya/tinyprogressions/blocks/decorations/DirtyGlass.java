package com.kashdeya.tinyprogressions.blocks.decorations;

import java.util.Random;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import javafx.geometry.Side;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DirtyGlass extends BlockGlass implements IOreDictEntry
{
    public DirtyGlass()
    {
        super(Material.GLASS, false);
        this.setHardness(0.3F);
        this.setSoundType(SoundType.GLASS);
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setTranslationKey("dirty_glass");
    }
    
    @Override
    public String getOreDictName() {
    	return "blockGlassDirty";
    }
    
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    
    @Override
    public int quantityDropped(Random rand)
    {
        return 1;
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TechBlocks.dirty_glass);
    }
    
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return MapColor.AIR;
    }
}
