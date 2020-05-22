package com.kashdeya.tinyprogressions.blocks.oredoubler;

import java.util.Random;

import com.kashdeya.tinyprogressions.tiles.TileEntityOreDoubler;

import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

public class IronFurnaceBlock extends AbstractFurnaceBlock {

	private int cookSpeedInTicks = 100;

	public IronFurnaceBlock(Block.Properties builder, int cookSpeedInTicksIn) {

		super(builder
				.hardnessAndResistance(1, 1000)
				.harvestLevel(1)
				.harvestTool(ToolType.PICKAXE)
				.lightValue(13)
				.sound(SoundType.STONE));
		this.cookSpeedInTicks = cookSpeedInTicksIn;
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(IBlockReader worldIn) {
		return new TileEntityOreDoubler();
	}

	// @Override
	// public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState
	// state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX,
	// float hitY, float hitZ)
	// {
	// playerIn.openGui(TinyProgressions.INSTANCE, 1, worldIn, pos.getX(),
	// pos.getY(), pos.getZ());
	//
	// return true;
	// }

	@Override
	protected void interactWith(World worldIn, BlockPos pos, PlayerEntity player) {
	      TileEntity tileentity = worldIn.getTileEntity(pos);
	      if (tileentity instanceof TileEntityOreDoubler) {
	         player.openContainer((INamedContainerProvider)tileentity);
	         player.addStat(Stats.INTERACT_WITH_FURNACE);
	      }
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        if (stateIn.get(IronFurnaceBlock.LIT))
        {
        	Direction enumfacing = stateIn.get(FACING);

			double d0 = (double)pos.getX() + 0.5D;
            double d1 = (double)pos.getY() + 0.25D + rand.nextDouble() * 6.0D / 16.0D;
            double d2 = (double)pos.getZ() + 0.5D;
            double d3 = 0.52D;
            double d4 = rand.nextDouble() * 0.6D - 0.3D;

            if (rand.nextDouble() < 0.1D)
            {
                worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
            }

            switch (enumfacing)
            {
                case WEST:
                	worldIn.addParticle(ParticleTypes.SMOKE, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                	worldIn.addParticle(ParticleTypes.FLAME, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    break;
                case EAST:
                	worldIn.addParticle(ParticleTypes.SMOKE, d0 + 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                	worldIn.addParticle(ParticleTypes.FLAME, d0 + 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    break;
                case NORTH:
                	worldIn.addParticle(ParticleTypes.SMOKE, d0 + d4, d1, d2 - 0.52D, 0.0D, 0.0D, 0.0D);
                	worldIn.addParticle(ParticleTypes.FLAME, d0 + d4, d1, d2 - 0.52D, 0.0D, 0.0D, 0.0D);
                    break;
                case SOUTH:
                	worldIn.addParticle(ParticleTypes.SMOKE, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D);
                	worldIn.addParticle(ParticleTypes.FLAME, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D);
            }
        }
    }
	
}
//	@Override
//    public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
//    {
//    		TileEntity te = worldIn.getTileEntity(pos);
//    		if(te instanceof TileEntityOreDoubler) {
//    			((TileEntityOreDoubler) te).inputInventory.dropInventory(worldIn, pos);
//    			((TileEntityOreDoubler) te).outputInventory.dropInventory(worldIn, pos);
//    			((TileEntityOreDoubler) te).fuelInventory.dropInventory(worldIn, pos);
//    		}
//    		super.breakBlock(worldIn, pos, state);
//    }
    

