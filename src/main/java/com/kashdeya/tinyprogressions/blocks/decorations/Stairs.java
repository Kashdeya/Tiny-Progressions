package com.kashdeya.tinyprogressions.blocks.decorations;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Stairs extends StairsBlock
{
    public Stairs(Block parent)
    {
        super(()-> parent.getDefaultState(), 
        		Properties
        		.create(Material.ROCK)
        		.hardnessAndResistance(50F, 1750F)
        		.sound(SoundType.STONE)
        		.harvestLevel(1)
        		.harvestTool(ToolType.PICKAXE));
   }
}
