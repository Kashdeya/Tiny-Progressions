package com.kashdeya.tinyprogressions.blocks.misc;

import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DecoMain extends Block implements IOreDictEntry{
	String oredictName;
	
	public DecoMain()
    {
		super(Properties.of(Material.METAL)
				.strength(2F, 1000F)
				.harvestLevel(1)
				.harvestTool(ToolType.PICKAXE));

    }
    
//    @Override
//    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
//    {
//        return false;
//    }
//    
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
