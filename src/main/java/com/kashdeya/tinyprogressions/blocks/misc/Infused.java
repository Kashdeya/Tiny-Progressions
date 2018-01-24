package com.kashdeya.tinyprogressions.blocks.misc;

import java.util.Random;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Infused extends Block {

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	public Infused() {
		super(Material.WATER);
		this.setUnlocalizedName("water_infused_stone");
		this.setHardness(2.0F);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setResistance(1000.0F);
		this.setSoundType(SoundType.STONE);
		this.setHarvestLevel("pickaxe", 1);
		this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, 7));
	}
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
        return false;
    }

    @Override
    public boolean canDropFromExplosion(Explosion explosionIn) {
        return false;
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

	@Override
	public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
		return false;
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { LEVEL });
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState();
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return 0;
	}

	@Override
	public EnumPushReaction getMobilityFlag(IBlockState state) {
		return EnumPushReaction.NORMAL;
	}

	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		this.checkForMixing(worldIn, pos, state);
	}

	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
		this.checkForMixing(worldIn, pos, state);
	}

	public boolean checkForMixing(World worldIn, BlockPos pos, IBlockState state) {

		boolean flag = false;
		EnumFacing facing = null;
		for (EnumFacing enumfacing : EnumFacing.values()) {
			if (worldIn.getBlockState(pos.offset(enumfacing)).getMaterial() == Material.LAVA) {
				facing = enumfacing;
				flag = true;
				break;
			}
		}

		if (flag) {
			Integer integer = (Integer) worldIn.getBlockState(pos.offset(facing)).getValue(BlockLiquid.LEVEL);

			if (integer.intValue() == 0) {
				worldIn.setBlockState(pos.offset(facing), Blocks.OBSIDIAN.getDefaultState());
				this.triggerMixEffects(worldIn, pos.offset(facing));
				return true;
			}

			if (integer.intValue() <= 4) {
				worldIn.setBlockState(pos.offset(facing), Blocks.COBBLESTONE.getDefaultState());
				this.triggerMixEffects(worldIn, pos.offset(facing));
				return true;
			}
		}

		return false;
	}

	protected void triggerMixEffects(World worldIn, BlockPos pos) {
		double d0 = (double) pos.getX();
		double d1 = (double) pos.getY();
		double d2 = (double) pos.getZ();
		worldIn.playSound((EntityPlayer) null, pos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 0.5F,
				2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

		for (int i = 0; i < 8; ++i) {
			worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0 + Math.random(), d1 + 1.2D, d2 + Math.random(),
					0.0D, 0.0D, 0.0D);
		}
	}
	
}
