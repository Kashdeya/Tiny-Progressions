package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.world.Explosion;
import net.minecraftforge.common.ToolType;

public class HardenedBlocks extends StandardBlock{
	
	private int meta;
	private int least_quantity;
	private int most_quantity;
	
	private HardenedBlocks(Properties prop, int meta, int least_quantity, int most_quantity) {
		super(prop.hardnessAndResistance(50F, 2000F)
				.harvestLevel(1)
				.harvestTool(ToolType.PICKAXE)
				.sound(SoundType.STONE));
		this.meta = meta;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
	}
	
	public HardenedBlocks(Properties prop, int least_quantity, int most_quantity) {
		this(prop, 0, least_quantity, most_quantity);
	}

	protected HardenedBlocks(Properties prop, Block drop) {
		this(prop,  1, 1);
	}
	
	//TODO
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
//	
//	@Override
//    public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity)
//    {
//      return !(entity instanceof EntityCreeper);
//    }
//    
//    @Override
//    public void onBlockExploded(World world, BlockPos pos, Explosion explosion) {}
    
    @Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
      return false;
    }

}
