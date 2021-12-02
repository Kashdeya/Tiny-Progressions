package com.kashdeya.tinyprogressions.blocks.misc;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WaterHarvester extends Block {
	
	public WaterHarvester()
    {
        super(Properties.of(Material.STONE)
        		.strength(1.5f, 10)
        		.sound(SoundType.STONE)
        		.harvestTool(ToolType.PICKAXE)
        		.harvestLevel(1));// needs changed!
//        this.setTranslationKey("water_harvester");
    }
}
