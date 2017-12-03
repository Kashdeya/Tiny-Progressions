package com.kashdeya.tinyprogressions.blocks;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.registry.utils.IItemProvider;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StandardBlock extends Block implements IItemProvider
{
	private ItemBlock itemBlock;
	private BlockRenderLayer renderLayer;
	
	public StandardBlock(Material material)
	{
		super(material);
		setCreativeTab(TinyProgressions.tabTP);
	}
	
	public StandardBlock setBlockRenderLayer(BlockRenderLayer renderLayer)
	{
		this.renderLayer = renderLayer;
		return this;
	}
	
	public StandardBlock setUnlocalName(String name)
	{
		setUnlocalizedName(name);
		return this;
	}
	
	public StandardBlock setSound(SoundType sound)
	{
		setSoundType(sound);
		return this;
	}
	
	public StandardBlock setHarvestLvl(String toolClass, int level)
	{
		setHarvestLevel(toolClass, level);
		return this;
	}
	
	public StandardBlock setItemBlock(Class<? extends ItemBlock> itemBlock)
	{
		try
		{
			this.itemBlock = itemBlock.getDeclaredConstructor(Block.class).newInstance(this);
		}
		catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e)
		{
		}
		
		return this;
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return itemBlock;
    }
	
	@Override
	public ItemBlock createItemBlock()
	{
		return itemBlock;
	}
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
		return renderLayer;
    }
	
	@Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
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
}
