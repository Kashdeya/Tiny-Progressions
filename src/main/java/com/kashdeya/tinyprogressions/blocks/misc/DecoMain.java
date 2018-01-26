package com.kashdeya.tinyprogressions.blocks.misc;

import com.kashdeya.tinyprogressions.items.misc.ItemBase;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class DecoMain extends Block implements IOreDictEntry{
	String oredictName;
	
	public DecoMain()
    {
		super(Material.IRON);
		this.setResistance(1000.0F);
		this.setHardness(2.0F);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setHarvestLevel("pickaxe", 1);
    }
    
    @Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
    }
    
    public DecoMain setOreDictName(String oredictName)
	{
		this.oredictName = oredictName;
		return this;
	}
	
	@Override
	public String getOreDictName() {
		return oredictName;
	}
    
}
