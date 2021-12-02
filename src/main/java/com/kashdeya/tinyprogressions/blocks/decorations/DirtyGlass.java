package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class DirtyGlass extends AbstractGlassBlock implements IOreDictEntry
{
    public DirtyGlass()
    {
        super(Properties.of(Material.GLASS, MaterialColor.NONE)
        		.strength(.3F)
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
