package com.kashdeya.tinyprogressions.blocks.ores;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WubOre extends StandardBlock implements IOreDictEntry {
	
	private final String oredic;
	
    public WubOre(String oredic)
    {
        super(Properties.of(Material.STONE)
        		.strength(2, 10)
        		.harvestTool(ToolType.PICKAXE)
        		.harvestLevel(3)
        		.sound(SoundType.STONE));
        this.oredic = oredic;
    }
    
	@Override
	public String getOreDictName() {
		return this.oredic;
	}
    
}
