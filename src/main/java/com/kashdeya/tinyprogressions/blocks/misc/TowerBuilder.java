package com.kashdeya.tinyprogressions.blocks.misc;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TowerBuilder extends Block {
	
	public TowerBuilder()
    {
        super(Properties.create(Material.WOOD)
        		.hardnessAndResistance(1.5f, 10)
        		.sound(SoundType.WOOD));// needs changed!
//        this.setTranslationKey("tower_builder");
    }
}
