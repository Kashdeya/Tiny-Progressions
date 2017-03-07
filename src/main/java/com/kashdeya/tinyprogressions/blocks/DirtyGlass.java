package com.kashdeya.tinyprogressions.blocks;

import java.util.Random;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class DirtyGlass extends BlockGlass
{
    public DirtyGlass()
    {
        super(Material.GLASS, false);
        this.setHardness(0.3F);
        this.setSoundType(blockSoundType.GLASS);
        this.setCreativeTab(tinyprogressions.tabTP);
        this.setUnlocalizedName("dirty_glass");
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
        return 0;
    }
    
    /**
     * Get the MapColor for this Block and the given BlockState
     */
    @Override
    public MapColor getMapColor(IBlockState state)
    {
        return MapColor.AIR;
    }
}
