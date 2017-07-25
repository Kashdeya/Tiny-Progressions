package com.kashdeya.tinyprogressions.tiles;

import com.kashdeya.tinyprogressions.inits.TechBlocks;

public class TileEntityEmeraldCobblegen extends TileEntityCobblegen {
	@Override
	public String getName() {
		return TechBlocks.emerald_cobblegen_block.getLocalizedName();
	}

	@Override
	protected int getCycles() {
		return 1;
	}

	@Override
	protected int getMaxStored() {
		return 64;
	}
}
