package com.kashdeya.tinyprogressions.blocks.misc;

import java.util.Random;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BrokenReed extends BlockBush implements net.minecraftforge.common.IShearable {
	
    protected static final AxisAlignedBB REED_AABB = new AxisAlignedBB(0.125D, 0.0D, 0.125D, 0.875D, 1.0D, 0.875D);
	
	public BrokenReed()
    {
        super(Material.VINE);
        this.setCreativeTab(tinyprogressions.tabTP);
        this.setHardness(0.6F);
        this.setSoundType(SoundType.PLANT);
        this.setUnlocalizedName("broken_reed");
    }
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return REED_AABB;
    }
	
	@Override
	public MapColor getMapColor(IBlockState state)
    {
        return MapColor.WOOD;
    }

	@Override
    protected boolean canSustainBush(IBlockState state)
    {
        if (state.getBlock() == Blocks.SAND){
        	return true;
        }
        return false;
    }

	@Override
    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
    {
        return true;
    }

	@Override
	public int quantityDropped(Random random)
    {
        return 2;
    }

	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return TechItems.old_reed;
    }

    @Override 
    public boolean isShearable(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos){ 
    	return false; 
    }

    @Override
    public java.util.List<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        return java.util.Arrays.asList(new ItemStack(TechBlocks.broken_reed));
    }
}