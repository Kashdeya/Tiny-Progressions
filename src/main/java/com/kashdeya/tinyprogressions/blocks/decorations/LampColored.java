package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.properties.EnumLampColor;
import com.kashdeya.tinyprogressions.util.BlockMetadata;

import javafx.geometry.Side;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.chunk.BlockStateContainer;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LampColored extends BlockMetadata
{
	public static final PropertyEnum<EnumLampColor> COLOR = PropertyEnum.create("color", EnumLampColor.class);
	
	public LampColored()
	{
		super(Material.GLASS, EnumLampColor.getNames());
		setHardness(0.5f);
		setLightLevel(1.0F);
		setLightOpacity(1);
		setSoundType(SoundType.GLASS);
		setDefaultState(blockState.getBaseState().withProperty(COLOR, EnumLampColor.WHITE));
	}
	
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT_MIPPED;
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
    protected boolean canSilkHarvest()
    {
        return true;
    }

	@Override
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
	
	@Override
	public BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, COLOR);
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
}
