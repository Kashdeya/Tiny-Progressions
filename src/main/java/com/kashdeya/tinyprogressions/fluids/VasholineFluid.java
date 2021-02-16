package com.kashdeya.tinyprogressions.fluids;


import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.state.StateContainer;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.Tag;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class VasholineFluid extends ForgeFlowingFluid{

	protected VasholineFluid(Properties properties) {
		super(properties);
	}
	
//	@Override
//    public boolean canDisplace(FluidState p_215665_1_, IBlockReader p_215665_2_, BlockPos p_215665_3_, Fluid p_215665_4_, Direction p_215665_5_) {
//	      return p_215665_5_ == Direction.DOWN && !p_215665_4_.isIn(FluidTags.WATER);
//    }
	
	@Override
	public boolean isSource(FluidState state) {
		return false;
	}
	
	
	
	//TODO Not sure if this was done right. I tried to add this block to the fluid tag.. and forsome reason couldn't
	public boolean isIn(Tag<Fluid> tagIn) {
	     return tagIn == FluidTags.WATER; //FluidTags.WATER.contains(this);
	}

    public int getLevel(FluidState state) {
        return state.get(LEVEL_1_8);
    }
	
//	@Override
//	protected boolean causesDownwardCurrent(IBlockReader worldIn, BlockPos neighborPos, Direction side) {
//	      BlockState blockstate = worldIn.getBlockState(neighborPos);
//	      FluidState FluidState = worldIn.getFluidState(neighborPos);
//	      if (FluidState.getFluid().isEquivalentTo(this)) {
//	         return false;
//	      } else if (side == Direction.UP) {
//	         return true;
//	      } else {
//	         return blockstate.getMaterial() == Material.ICE ? false : blockstate.func_224755_d(worldIn, neighborPos, side);
//	      }
//	 }

	
    public static class Flowing extends VasholineFluid
    {

		public Flowing(Properties properties) {
			super(properties);
		}
		

        protected void fillStateContainer(StateContainer.Builder<Fluid, FluidState> builder) {
            super.fillStateContainer(builder);
            builder.add(LEVEL_1_8);
        }

		@Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL_1_8);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }

    }
    
    public static class Source extends VasholineFluid
    {

		public Source(Properties properties) {
			super(properties);
		}
		
        protected void fillStateContainer(StateContainer.Builder<Fluid, FluidState> builder) {
            super.fillStateContainer(builder);
            builder.add(LEVEL_1_8);
        }

		@Override
        public int getLevel(FluidState state) {
            return 8;
        }

		@Override
        public boolean isSource(FluidState state) {
            return true;
        }
    }
}
