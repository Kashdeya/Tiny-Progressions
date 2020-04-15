package com.kashdeya.tinyprogressions.blocks.misc;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WaterHarvester extends Block {
	
	public WaterHarvester()
    {
        super(Properties.create(Material.ROCK)
        		.hardnessAndResistance(1.5f, 10)
        		.sound(SoundType.STONE)
        		.harvestTool(ToolType.PICKAXE)
        		.harvestLevel(1));// needs changed!
//        this.setTranslationKey("water_harvester");
    }
}
