package com.kashdeya.tinyprogressions.tiles;

import com.kashdeya.tinyprogressions.inits.TechBlocks;

public class TileEntityIronCobblegen extends TileEntityCobblegen {
	@Override
	public String getName() {
		return TechBlocks.iron_cobblegen_block.getLocalizedName();
	}

	@Override
	protected int getCycles() {
		return 20;
	}

	@Override
	protected int getMaxStored() {
		return 64;
	}
}