package com.kashdeya.tinyprogressions.blocks.bushes;

import com.kashdeya.tinyprogressions.inits.TechFoods;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlueberryBush extends BlockBerryBush {

	public BlueberryBush() {
		this.setUnlocalizedName("blueberry_bush");
	}

	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return TechFoods.blueberry_berry;
    }
	
}
