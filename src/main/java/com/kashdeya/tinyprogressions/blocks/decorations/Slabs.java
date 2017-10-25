package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.util.Registry.IItemProvider;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Slabs extends BlockSlab implements IItemProvider
{
    private boolean isDouble;
    private Block droppedBlock;
    private BlockSlab doubleSlab;
    
    public Slabs()
    {
    		this(true, null);
    }
    
    public Slabs(BlockSlab doubleSlab)
    {
    		this(false, doubleSlab);
    }
    
    public Slabs(boolean isDouble, BlockSlab doubleSlab)
    {
        super(Material.ROCK);
        this.isDouble = isDouble;
        this.doubleSlab = doubleSlab;
        
        IBlockState state = blockState.getBaseState();
        if(!isDouble())
            state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
        
        setDefaultState(state);
        useNeighborBrightness = true;
    }
    
    @Override
    public ItemBlock getItemBlock()
    {
    		if(!isDouble)
    			return new ItemSlab(this, this, doubleSlab);
    		
    		return null;
    }
    
    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] { HALF });
    }
    
    @Override
    public String getUnlocalizedName(int meta)
    {
        return getUnlocalizedName();
    }
    
    @Override
    public IProperty<?> getVariantProperty()
    {
        return HALF;
    }
    
    @Override
    public boolean isDouble()
    {
        return isDouble;
    }
    
    @Override
    public Comparable<?> getTypeForItem(ItemStack stack)
    {
        return EnumBlockHalf.BOTTOM;
    }
    
    @Override
    public int getMetaFromState(IBlockState state)
    {
        if(isDouble())
            return 0;
        
        return ((EnumBlockHalf)state.getValue(HALF)).ordinal() + 1;
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        if(!isDouble())
            return getDefaultState().withProperty(HALF, EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
        
        return getDefaultState();
    }
    
    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        if(isDouble)
            drops.add(new ItemStack(droppedBlock, 2));
        else
            drops.add(new ItemStack(this, 1));
    }
    
    public Slabs setDropped(Block block)
    {
        droppedBlock = block;
        return this;
    }
}
