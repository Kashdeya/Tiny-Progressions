package com.kashdeya.tinyprogressions.blocks.ores.gravel;

import java.util.Random;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LapisGravel extends BlockFalling {
	
	public LapisGravel()
    {
        this.setSoundType(blockSoundType.GROUND);
        this.setCreativeTab(tinyprogressions.tabTP);
        this.setUnlocalizedName("lapis_gravel");
        this.setHardness(0.6F);
    }
	
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }
	
    @Override
    public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, com.google.common.base.Predicate<IBlockState> target)
    {
        return false;
    }
    
    @Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
    }
	
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        if (fortune > 3)
        {
            fortune = 3;
        }

        return rand.nextInt(10 - fortune * 3) == 0 ? Items.DYE : Item.getItemFromBlock(this);
    }

    @Override
    public MapColor getMapColor(IBlockState state)
    {
        return MapColor.STONE;
    }

    @SideOnly(Side.CLIENT)
    public int getDustColor(IBlockState p_189876_1_)
    {
        return -8356741;
    }
    
}