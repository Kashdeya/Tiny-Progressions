package com.kashdeya.tinyprogressions.blocks.decorations;

import java.util.Random;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class Lamp extends AbstractGlassBlock
{
	
	public Lamp(Properties prop)
	{
		super(prop.hardnessAndResistance(.5F, 1F).lightValue(15).sound(SoundType.GLASS).noDrops().func_226896_b_());
	}
	
	
	@Override
    public BlockRenderType getRenderType(BlockState state) {
		
        return BlockRenderType.MODEL;
     }

	
//	@Override
//	public BlockRenderLayer getRenderLayer() {
//	      return BlockRenderLayer.TRANSLUCENT;
//	}
	
   @OnlyIn(Dist.CLIENT)
   public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
      double d0 = (double)pos.getX() + 0.5D;
      double d1 = (double)pos.getY() + 0.7D;
      double d2 = (double)pos.getZ() + 0.5D;
      worldIn.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
      worldIn.addParticle(ParticleTypes.FLAME, d0, d1, d2, 0.0D, 0.0D, 0.0D);
   }
}
