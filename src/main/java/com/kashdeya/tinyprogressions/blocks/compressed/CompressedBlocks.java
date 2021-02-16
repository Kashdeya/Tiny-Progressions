package com.kashdeya.tinyprogressions.blocks.compressed;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.world.Explosion;
import net.minecraftforge.common.ToolType;
import net.minecraft.block.BlockState;

import java.util.Random;

public class CompressedBlocks extends StandardBlock{
	
	private int meta;
	private int least_quantity;
	private int most_quantity;
	
	public CompressedBlocks(Properties prop) {
		super(prop.harvestLevel(1).harvestTool(ToolType.PICKAXE));
		this.meta = meta;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
	}

	public boolean isOpaqueCube(BlockState state)
    {
        return false;
    }

	public int damageDropped(BlockState blockstate) {
		return this.meta;
	}

	public int quantityDropped(BlockState blockstate, int fortune, Random random) {
		if (this.least_quantity >= this.most_quantity)
			return this.least_quantity;
		return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
      return false;
    }
}