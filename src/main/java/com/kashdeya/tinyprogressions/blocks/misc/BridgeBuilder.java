package com.kashdeya.tinyprogressions.blocks.misc;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BridgeBuilder extends Block {
	
	public BridgeBuilder()
    {
        super(Properties.of(Material.WOOD)
        		.strength(1.5f, 10f)
        		.harvestTool(ToolType.PICKAXE)
        		.harvestLevel(1)
        		.sound(SoundType.WOOD));// needs changed!
//        this.setTranslationKey("bridge_builder");
    }
}
