package com.kashdeya.tinyprogressions.blocks.compressed;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.world.Explosion;
import net.minecraftforge.common.ToolType;

public class CompressedBlocks extends StandardBlock{
	
	private int meta;
	private int least_quantity;
	private int most_quantity;
	
	private CompressedBlocks(String unlocalizedName, Properties prop, SoundType sound, Block drop, int meta, int least_quantity, int most_quantity) {
		super(prop.harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(sound));
		this.meta = meta;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
	}
	
	public CompressedBlocks(String unlocalizedName, Properties prop, SoundType sound, Block drop, int least_quantity, int most_quantity) {
		this(unlocalizedName, prop, sound, drop, 0, least_quantity, most_quantity);
	}

	protected CompressedBlocks(String unlocalizedName,Properties prop, SoundType sound, Block drop) {
		this(unlocalizedName, prop, sound, drop, 1, 1);
	}
	
//	@Override
//	public boolean isOpaqueCube(IBlockState state)
//    {
//        return false;
//    }
//
//	@Override
//	public int damageDropped(IBlockState blockstate) {
//		return this.meta;
//	}
//
//	@Override
//	public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
//		if (this.least_quantity >= this.most_quantity)
//			return this.least_quantity;
//		return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
//	}
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
      return false;
    }
}