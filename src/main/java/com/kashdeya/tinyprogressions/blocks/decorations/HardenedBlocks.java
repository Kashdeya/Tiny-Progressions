package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.world.Explosion;
import net.minecraftforge.common.ToolType;

public class HardenedBlocks extends StandardBlock{
	
	private HardenedBlocks(Properties prop, int meta, int least_quantity, int most_quantity) {
		super(prop.hardnessAndResistance(100F, 2000F)
				.harvestLevel(1)
				.harvestTool(ToolType.PICKAXE)
				.sound(SoundType.STONE));
	}
	
	public HardenedBlocks(Properties prop, int least_quantity, int most_quantity) {
		this(prop, 0, least_quantity, most_quantity);
	}

	protected HardenedBlocks(Properties prop, Block drop) {
		this(prop,  1, 1);
	}
	
//	@Override
//    public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity)
//    {
//      return !(entity instanceof EntityCreeper);
//    }
    
    @Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
      return false;
    }

}
