package com.kashdeya.tinyprogressions.tiles;

import com.kashdeya.tinyprogressions.inits.TechBlocks;

public class TileEntityDiamondCobblegen extends TileEntityCobblegen {
	@Override
	public String getName() {
		return TechBlocks.diamond_cobblegen_block.getLocalizedName();
	}

	@Override
	protected int getCycles() {
		return 10;
	}

	@Override
	protected int getMaxStored() {
		return 64;
	}
}
