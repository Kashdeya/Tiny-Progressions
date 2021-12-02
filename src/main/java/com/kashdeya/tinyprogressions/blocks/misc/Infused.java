package com.kashdeya.tinyprogressions.blocks.misc;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

public class Infused extends Block {

//	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
	 public static AbstractBlock.IExtendedPositionPredicate<EntityType<?>> isValidSpawnFire = (blockstate, blockreader, pos, entity) -> {
         return entity.fireImmune() && blockstate.isFaceSturdy(blockreader, pos, Direction.UP) && blockstate.getLightValue(blockreader, pos) < 14;
      };
      
      
	public Infused() {
		super(Properties.of(Material.LAVA)
				.strength(2, 1000)
				.randomTicks()
				.lightLevel((p) -> 8)
				.sound(SoundType.STONE)
				.harvestLevel(1)
				.harvestTool(ToolType.PICKAXE)
				.isValidSpawn(isValidSpawnFire));
//		this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, 7));
	}

    @Override
    public boolean canDropFromExplosion(BlockState state, IBlockReader world, BlockPos pos, Explosion explosionIn) {
        return false;
    }

//	@Override
//	protected BlockStateContainer createBlockState() {
//		return new BlockStateContainer(this, new IProperty[] { LEVEL });
//	}
//
//	@Override
//	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
//		this.getBlockState(worldIn, pos, state);
//	}
//
//	
	@Override
    public void stepOn(World worldIn, BlockPos pos, Entity entityIn) {
        entityIn.getDeltaMovement().multiply(new Vector3d(0.25D, 1, 0.25D));
        if (!entityIn.fireImmune() && entityIn instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity) entityIn)) {
            entityIn.hurt(DamageSource.HOT_FLOOR, 1.0F);
        }

        super.stepOn(worldIn, pos, entityIn);
    }
	
	
	@Override
	public void neighborChanged(BlockState state, World world, BlockPos pos, Block ablock, BlockPos neighbor, boolean p_220069_6_) {
	
		
		super.neighborChanged(state, world, pos, ablock, neighbor, p_220069_6_);

		boolean flag = false;
		Direction facing = null;
		for (Direction enumfacing : Direction.values()) {
			
			if (world.getFluidState(pos.relative(enumfacing)).is(FluidTags.WATER) || world.getBlockState(pos.relative(enumfacing)).is(Blocks.BLUE_ICE)) {
				System.out.println("found");
				facing = enumfacing;
				flag = true;
				break;
			}
		}

		if (flag) {
			 
			Block block = world.getFluidState(pos.relative(facing)).isSource() ? Blocks.OBSIDIAN : Blocks.COBBLESTONE;
			 
			 
			if (world.getFluidState(pos.relative(facing)).is(FluidTags.WATER)) {
				System.out.println("water");
				
				world.setBlockAndUpdate(pos.relative(facing), net.minecraftforge.event.ForgeEventFactory.fireFluidPlaceBlockEvent(world, pos.relative(facing), pos.relative(facing), block.defaultBlockState()));
				this.effects(world, pos.relative(facing));
			}
			else if (world.getBlockState(pos.relative(facing)).is(Blocks.BLUE_ICE)) {
				world.setBlockAndUpdate(pos.relative(facing), net.minecraftforge.event.ForgeEventFactory.fireFluidPlaceBlockEvent(world, pos.relative(facing), pos.relative(facing), Blocks.BASALT.defaultBlockState()));
				this.effects(world, pos.relative(facing));
			}
		}
		
		
	}
	
	protected void effects(World worldIn, BlockPos pos) {
		double d0 = (double) pos.getX();
		double d1 = (double) pos.getY();
		double d2 = (double) pos.getZ();
		worldIn.playSound((PlayerEntity) null, pos, SoundEvents.LAVA_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.random.nextFloat() - worldIn.random.nextFloat()) * 0.8F);

		for (int i = 0; i < 8; ++i) {
			worldIn.addParticle(ParticleTypes.LARGE_SMOKE, d0 + Math.random(), d1 + 1.2D, d2 + Math.random(), 0.0D,	0.0D, 0.0D);
		}
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.infused_1").withStyle(TextFormatting.YELLOW));
		tooltip.add(new TranslationTextComponent("tooltip.infused_2").withStyle(TextFormatting.YELLOW));
		tooltip.add(new TranslationTextComponent("tooltip.infused_3").withStyle(TextFormatting.YELLOW));
	}
}
