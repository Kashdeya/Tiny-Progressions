package com.kashdeya.tinyprogressions.blocks.fluids;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class BlockFluidVasholine extends FlowingFluidBlock {

	public static ResourceLocation overlay = new ResourceLocation(Reference.MOD_ID, "textures/fluids/wub_juice_overlay");
	
	public BlockFluidVasholine(Properties props) {
		super(TechBlocks.vasholine_fluid, props
				.noCollission()
				.strength(100.0F)
				.noDrops()
				.lightLevel((p) -> 15)
				.randomTicks());
	}

	

//	@Override
//	public boolean canDisplace(IBlockAccess world, BlockPos pos) {
//		return !world.getBlockState(pos).getMaterial().isLiquid() && super.canDisplace(world, pos);
//	}
//
//	@Override
//	public boolean displaceIfPossible(World world, BlockPos pos) {
//		return !world.getBlockState(pos).getMaterial().isLiquid() && super.displaceIfPossible(world, pos);
//	}	

   @Nullable
   @OnlyIn(Dist.CLIENT)
   public IParticleData getDripParticleData() {
      return ParticleTypes.DRIPPING_WATER;
   }

	
	@Override
	public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
		
		if (entity instanceof PlayerEntity) {
			if(world.getGameTime()%20 == 0 && ((PlayerEntity) entity).getHealth() < ((PlayerEntity) entity).getMaxHealth()) // add whatever time you want here 20 = every 1 second
				((PlayerEntity) entity).heal(ConfigHandler.vasholine_heal_amount);
			if (ConfigHandler.wub_weakness){
				((PlayerEntity) entity).addEffect(new EffectInstance(Effects.WEAKNESS, 20, 0, false, false));
			}
			if (ConfigHandler.wub_blindness){
				((PlayerEntity) entity).addEffect(new EffectInstance(Effects.BLINDNESS, 20, 0, false, false));
			}
			if (ConfigHandler.wub_fatigue){	
				((PlayerEntity) entity).addEffect(new EffectInstance(Effects.DIG_SLOWDOWN, 20, 0, false, false));
			}
			entity.rotationYaw -= (world.random.nextFloat() - world.random.nextFloat()) * 0.5D;
			entity.prevRotationYaw += (world.random.nextFloat() + world.random.nextFloat()) * 0.5D;
		}
		if (entity instanceof LivingEntity && !(entity instanceof PlayerEntity) && ConfigHandler.vasholine_mobs){
			entity.hurt(DamageSource.MAGIC, ConfigHandler.vasholine_mobs_amount);
		}
		if (entity instanceof LivingEntity && !(entity instanceof PlayerEntity) && ConfigHandler.wub_heal_mobs){
			((LivingEntity) entity).heal(ConfigHandler.mob_heal_amount);
		}
	}

	@Override
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		if (worldIn.isEmptyBlock(pos.above()) && worldIn.getGameTime() % 5 == 0) {

			float xx = (float) pos.getX() + 0.5F;
			float zz = (float) pos.getZ() + 0.5F;
			float fixedOffset = 0.25F;
			float randomOffset = rand.nextFloat() * 0.6F - 0.3F;
			
			worldIn.addParticle(ParticleTypes.FIREWORK, true, (double) (xx - fixedOffset), (double) pos.getY() + 0.8D, (double) (zz + randomOffset), 0.0D, 0.0D, 0.0D);
			worldIn.addParticle(ParticleTypes.FIREWORK, true, (double) (xx + fixedOffset), (double) pos.getY() + 0.8D, (double) (zz + randomOffset), 0.0D, 0.0D, 0.0D);
			worldIn.addParticle(ParticleTypes.FIREWORK, true, (double) (xx + randomOffset), (double) pos.getY() + 0.8D, (double) (zz - fixedOffset), 0.0D, 0.0D, 0.0D);
			worldIn.addParticle(ParticleTypes.FIREWORK, true, (double) (xx + randomOffset), (double) pos.getY() + 0.8D, (double) (zz + fixedOffset), 0.0D, 0.0D, 0.0D);

		}
	}
	
    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
    	tooltip.add(new TranslationTextComponent("tooltip.vasholine_1"));
    }
}