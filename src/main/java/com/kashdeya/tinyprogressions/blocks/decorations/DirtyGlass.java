package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class DirtyGlass extends AbstractGlassBlock implements IOreDictEntry
{
	//TODO not sure where to register
    public DirtyGlass()
    {
        super(Properties.create(Material.GLASS, MaterialColor.AIR)
        		.hardnessAndResistance(.3F)
        		.sound(SoundType.GLASS));
    }
    
    @Override
    public String getOreDictName() {
    	return "blockGlassDirty";
    }
    
    public BlockRenderType getBlockLayer()
    {
        return BlockRenderType.MODEL;
    }
  
}
