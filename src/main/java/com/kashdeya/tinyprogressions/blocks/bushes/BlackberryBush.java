package com.kashdeya.tinyprogressions.blocks.bushes;

import java.util.Random;

import com.kashdeya.tinyprogressions.inits.TechFoods;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

public class BlackberryBush extends BlockCrops {

	public static final PropertyInteger BLACKBERRY_AGE = PropertyInteger.create("age", 0, 7);
    private static final AxisAlignedBB[] BLACKBERRY_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.1875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.3125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.4375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5625D, 1.0D)};
	
	public BlackberryBush() {
		super();
    	this.setDefaultState(this.blockState.getBaseState().withProperty(BLACKBERRY_AGE, Integer.valueOf(0)));
		this.setUnlocalizedName("blackberry_bush");
	}
	
	protected PropertyInteger getAgeProperty()
    {
        return BLACKBERRY_AGE;
    }
    
    @Override
    protected Item getSeed()
    {
        return TechItems.blackberry_seeds;
    }
    
    @Override
    protected Item getCrop()
    {
        return TechFoods.blackberry_berry;
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(BLACKBERRY_AGE, Integer.valueOf(meta));
    }
    
    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((Integer)state.getValue(BLACKBERRY_AGE)).intValue();
    }
    
    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {BLACKBERRY_AGE});
    }
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return BLACKBERRY_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
    }
    
    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
    	return EnumPlantType.Crop;
    }
	
}