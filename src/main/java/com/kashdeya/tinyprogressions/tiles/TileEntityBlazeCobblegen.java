package com.kashdeya.tinyprogressions.tiles;

import com.kashdeya.tinyprogressions.inits.TechBlocks;

public class TileEntityBlazeCobblegen extends TileEntityCobblegen {
	@Override
	public String getName() {
		return TechBlocks.blaze_cobblegen_block.getLocalizedName();
	}

	@Override
	protected int getCycles() {
		return 5;
	}

	@Override
	protected int getMaxStored() {
		return 64;
	}
}