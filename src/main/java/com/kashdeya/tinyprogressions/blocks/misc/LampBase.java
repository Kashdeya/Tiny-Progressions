package com.kashdeya.tinyprogressions.blocks.misc;

import java.util.Random;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class LampBase extends Block{
	
	private Block drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;

	private LampBase(String unlocalizedName, Material mat, Block drop, int meta, int least_quantity, int most_quantity) {
		super(mat);
		this.drop = drop;
		this.meta = meta;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
		this.setHardness(0.5f);
		this.setLightLevel(1.0F);
		this.setLightOpacity(1);
		this.setUnlocalizedName(unlocalizedName);
		this.setSoundType(blockSoundType.GLASS);
		this.setCreativeTab(tinyprogressions.tabTP);
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }

	public LampBase(String unlocalizedName, Material mat, Block drop, int least_quantity, int most_quantity) {
		this(unlocalizedName, mat, drop, 0, least_quantity, most_quantity);
	}

	protected LampBase(String unlocalizedName, Material mat, Block drop) {
		this(unlocalizedName, mat, drop, 1, 1);
	}

	@Override
	public int damageDropped(IBlockState blockstate) {
		return this.meta;
	}

	@Override
	public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
		if (this.least_quantity >= this.most_quantity)
			return this.least_quantity;
		return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}
}