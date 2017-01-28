package com.kashdeya.tinyprogressions.tiles;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityGrowthUpgrade extends TileEntity implements ITickable {

	public int animationTicks;

	public TileEntityGrowthUpgrade() {
	}

	@Override
	public void update() {
		if (worldObj.isRemote) {
			if (animationTicks < 720)
				animationTicks += 1;
			if (animationTicks >= 720)
				animationTicks = 0;
		}
	}
}
