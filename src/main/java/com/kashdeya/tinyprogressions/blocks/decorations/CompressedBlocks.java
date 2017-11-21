package com.kashdeya.tinyprogressions.blocks.decorations;

import java.util.Random;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.Explosion;

public class CompressedBlocks extends Block{
	
	private int meta;
	private int least_quantity;
	private int most_quantity;
	
	private CompressedBlocks(String unlocalizedName, Material mat, SoundType sound, Block drop, int meta, int least_quantity, int most_quantity) {
		super(mat);
		this.meta = meta;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
		this.setUnlocalizedName(unlocalizedName);
		this.setHarvestLevel("pickaxe", 0);
        this.setSoundType(sound);
        this.setCreativeTab(TinyProgressions.tabTP);
	}
	
	public CompressedBlocks(String unlocalizedName, Material mat, SoundType sound, Block drop, int least_quantity, int most_quantity) {
		this(unlocalizedName, mat, sound, drop, 0, least_quantity, most_quantity);
	}

	protected CompressedBlocks(String unlocalizedName, Material mat, SoundType sound, Block drop) {
		this(unlocalizedName, mat, sound, drop, 1, 1);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
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
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
      return false;
    }
}