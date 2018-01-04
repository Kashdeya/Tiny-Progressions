package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
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
import net.minecraftforge.common.IShearable;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OldReed extends BlockBush implements IShearable {
	
    protected static final AxisAlignedBB REED_AABB = new AxisAlignedBB(0.125D, 0.0D, 0.125D, 0.875D, 1.0D, 0.875D);
	
	public OldReed()
    {
        super(Material.PLANTS);
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setHardness(0.0F);
        this.setSoundType(SoundType.PLANT);
        this.setUnlocalizedName("old_reed");
    }
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return REED_AABB;
    }

    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return MapColor.WOOD;
    }

	@Override
    protected boolean canSustainBush(IBlockState state)
    {
        return state.getBlock() == Blocks.SAND;
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
        return TechItems.dead_reed;
    }

    @Override 
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){
    	return false; 
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
    {
        return Collections.singletonList(new ItemStack(TechBlocks.old_reed));
    }
}