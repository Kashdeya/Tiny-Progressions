package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.items.block.MetaItemBlock;
import com.kashdeya.tinyprogressions.properties.EnumLampColor;
import com.kashdeya.tinyprogressions.util.IMetadata;
import com.kashdeya.tinyprogressions.util.Registry.IItemProvider;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class LampColored extends Lamp implements IMetadata, IItemProvider
{
	public static final PropertyEnum<EnumLampColor> COLOR = PropertyEnum.create("color", EnumLampColor.class);
	protected String[] unlocalNames;
	
	public LampColored()
	{
		setDefaultState(blockState.getBaseState().withProperty(COLOR, EnumLampColor.WHITE));
		this.unlocalNames = EnumLampColor.getNames();
	}
	
	@Override
	public ItemBlock getItemBlock()
	{
		return new MetaItemBlock(this);
	}
	
	@Override
	public int getCount()
	{
		return unlocalNames.length;
	}
	
	@Override
	public String getTexture(int index)
	{
		return unlocalNames[index];
	}
	
	@Override
	public String[] getUnlocalizedNames()
	{
		return unlocalNames;
	}
	
	@Override
	public BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] { COLOR });
	}
	
	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return MapColor.getBlockColor(EnumDyeColor.values()[state.getValue(COLOR).ordinal()]);
    }
	
	@Override
	public int damageDropped(IBlockState state)
	{
		return getMetaFromState(state);
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(COLOR, EnumLampColor.values()[meta]);
    }
	
	@Override
    public int getMetaFromState(IBlockState state)
    {
		EnumLampColor metaValue = state.getValue(COLOR);
		return metaValue.ordinal();
    }
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for(int i = 0; i < unlocalNames.length; i++)
			items.add(new ItemStack(this, 1, i));
	}
}
