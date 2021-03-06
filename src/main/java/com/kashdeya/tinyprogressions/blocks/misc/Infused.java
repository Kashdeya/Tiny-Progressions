package com.kashdeya.tinyprogressions.blocks.misc;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Infused extends Block {

//	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	public Infused() {
		super(Properties.create(Material.LAVA)
				.hardnessAndResistance(2, 1000)
				.tickRandomly()
				.setLightLevel((p) -> 8)
				.sound(SoundType.STONE)
				.harvestLevel(1)
				.harvestTool(ToolType.PICKAXE));
//		this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, 7));
	}
	
//	@Override
//    @SideOnly(Side.CLIENT)
//    public BlockRenderLayer getRenderLayer()
//    {
//        return BlockRenderLayer.CUTOUT;
//    }
//
//    @Override
//    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
//        return false;
//    }
//
//    @Override
//    public boolean canDropFromExplosion(Explosion explosionIn) {
//        return false;
//    }
//
//    @Override
//    public int quantityDropped(Random random) {
//        return 1;
//    }
//
//	@Override
//	public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
//		return false;
//	}
//
//	@Override
//	protected BlockStateContainer createBlockState() {
//		return new BlockStateContainer(this, new IProperty[] { LEVEL });
//	}
//
//	@Override
//	public IBlockState getStateFromMeta(int meta) {
//		return this.getDefaultState();
//	}
//
//	@Override
//	public int getMetaFromState(IBlockState state) {
//		return 0;
//	}
//
//	@Override
//	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
//		this.getBlockState(worldIn, pos, state);
//	}
//
//	@Override
//	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
//		this.getBlockState(worldIn, pos, state);
//	}
//	
//	@Override
//    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
//        entityIn.motionX *= 0.25D;
//        entityIn.motionZ *= 0.25D;
//        if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase) entityIn)) {
//            entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 1.0F);
//        }
//
//        super.onEntityWalk(worldIn, pos, entityIn);
//    }
//	
//	@Override
//    public boolean canEntitySpawn(IBlockState state, Entity entityIn) {
//        return entityIn.isImmuneToFire();
//    }
//
//	public boolean getBlockState(World worldIn, BlockPos pos, IBlockState state) {
//
//		boolean flag = false;
//		EnumFacing facing = null;
//		for (EnumFacing enumfacing : EnumFacing.values()) {
//			if (worldIn.getBlockState(pos.offset(enumfacing)).getMaterial() == Material.WATER) {
//				facing = enumfacing;
//				flag = true;
//				break;
//			}
//		}
//
//		if (flag) {
//			Integer integer = (Integer) worldIn.getBlockState(pos.offset(facing)).getValue(BlockLiquid.LEVEL);
//
//			if (integer.intValue() == 0) {
//				worldIn.setBlockState(pos.offset(facing), Blocks.OBSIDIAN.getDefaultState());
//				this.effects(worldIn, pos.offset(facing));
//				return true;
//			}
//
//			if (integer.intValue() <= 4) {
//				worldIn.setBlockState(pos.offset(facing), Blocks.COBBLESTONE.getDefaultState());
//				this.effects(worldIn, pos.offset(facing));
//				return true;
//			}
//		}
//
//		return false;
//	}
//
//	protected void effects(World worldIn, BlockPos pos) {
//		double d0 = (double) pos.getX();
//		double d1 = (double) pos.getY();
//		double d2 = (double) pos.getZ();
//		worldIn.playSound((EntityPlayer) null, pos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 0.5F,
//				2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);
//
//		for (int i = 0; i < 8; ++i) {
//			worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0 + Math.random(), d1 + 1.2D, d2 + Math.random(),
//					0.0D, 0.0D, 0.0D);
//		}
//	}
//	
//	@Override
//	@SideOnly(Side.CLIENT)
//	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced)
//	{
//		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.infused_1").getFormattedText());
//		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.infused_2").getFormattedText());
//		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.infused_3").getFormattedText());
//	}
	
}
