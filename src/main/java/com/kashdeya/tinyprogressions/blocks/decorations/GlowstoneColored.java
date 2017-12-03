package com.kashdeya.tinyprogressions.blocks.decorations;

import java.util.Random;

import com.kashdeya.tinyprogressions.armor.BlockMetadata;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.properties.EnumGlowstoneColor;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class GlowstoneColored extends BlockMetadata
{
	public static final PropertyEnum<EnumGlowstoneColor> COLOR = PropertyEnum.create("color", EnumGlowstoneColor.class);
	
	public GlowstoneColored()
	{
		super(Material.GLASS, EnumGlowstoneColor.getNames());
        setHardness(0.3F);
        setSoundType(SoundType.GLASS);
        setLightLevel(1.0F);
        setCreativeTab(TinyProgressions.tabTP);
		
		setDefaultState(blockState.getBaseState().withProperty(COLOR, EnumGlowstoneColor.WHITE));
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
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
	{
		drops.clear();
		
		Random random = new Random();
		int quantity = 2 + random.nextInt(3);
		
		drops.add(new ItemStack(TechItems.colored_dust, quantity, getMetaFromState(state)));
	}
	
	@Override
	public int damageDropped(IBlockState state)
	{
		return getMetaFromState(state);
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(COLOR, EnumGlowstoneColor.values()[meta]);
    }
	
	@Override
    public int getMetaFromState(IBlockState state)
    {
		EnumGlowstoneColor metaValue = state.getValue(COLOR);
		return metaValue.ordinal();
    }
}
