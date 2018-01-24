package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;

public class Stairs extends BlockStairs
{
    public Stairs(Block parent)
    {
        super(parent.getDefaultState());
        this.setHardness(50.0F);
        this.setHarvestLevel("pickaxe", 1);
        this.setResistance(1750.0F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(TinyProgressions.tabTP);
    }
}
