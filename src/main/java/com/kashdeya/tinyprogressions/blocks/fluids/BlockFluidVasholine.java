package com.kashdeya.tinyprogressions.blocks.fluids;

import java.util.List;
import java.util.Random;

import com.kashdeya.tinyprogressions.fluids.ModFluids;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.MaterialHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFluidVasholine extends BlockFluidClassic {

	public BlockFluidVasholine() {
		super(ModFluids.VASHOLINE, MaterialHandler.VASHOLINE);
		setTranslationKey("vasholine");
		this.setLightLevel(1.0F);
	}

	@Override
	public boolean canDisplace(IBlockAccess world, BlockPos pos) {
		return !world.getBlockState(pos).getMaterial().isLiquid() && super.canDisplace(world, pos);
	}

	@Override
	public boolean displaceIfPossible(World world, BlockPos pos) {
		return !world.getBlockState(pos).getMaterial().isLiquid() && super.displaceIfPossible(world, pos);
	}	

	@Override
	public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity) {
		if (entity instanceof EntityPlayer) {
			if(world.getTotalWorldTime()%20 == 0 && ((EntityPlayer) entity).getHealth() < ((EntityPlayer) entity).getMaxHealth()) // add whatever time you want here 20 = every 1 second
				((EntityPlayer) entity).heal(ConfigHandler.vasholine_heal_amount);
			if (ConfigHandler.wub_weakness){
				((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 20, 0, false, false));
			}
			if (ConfigHandler.wub_blindness){
				((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 20, 0, false, false));
			}
			if (ConfigHandler.wub_fatigue){	
				((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 20, 0, false, false));
			}
			entity.rotationYaw -= (world.rand.nextFloat() - world.rand.nextFloat()) * 0.5D;
			entity.prevRotationYaw += (world.rand.nextFloat() + world.rand.nextFloat()) * 0.5D;
		}
		if (entity instanceof EntityLivingBase && !(entity instanceof EntityPlayer) && ConfigHandler.vasholine_mobs){
			entity.attackEntityFrom(DamageSource.MAGIC, ConfigHandler.vasholine_mobs_amount);
		}
		if (entity instanceof EntityLivingBase && !(entity instanceof EntityPlayer) && ConfigHandler.wub_heal_mobs){
			((EntityLivingBase) entity).heal(ConfigHandler.mob_heal_amount);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand) {
		if (world.isAirBlock(pos.up()) && world.getTotalWorldTime()%5 == 0) {

			float xx = (float) pos.getX() + 0.5F;
			float zz = (float) pos.getZ() + 0.5F;
			float fixedOffset = 0.25F;
			float randomOffset = rand.nextFloat() * 0.6F - 0.3F;

			TinyProgressions.proxy.spawnCustomParticle("sparkles", world, (double) (xx - fixedOffset), (double) pos.getY() + 0.8D, (double) (zz + randomOffset), 0.0D, 0.0D, 0.0D);
			TinyProgressions.proxy.spawnCustomParticle("sparkles", world, (double) (xx + fixedOffset), (double) pos.getY() + 0.8D, (double) (zz + randomOffset), 0.0D, 0.0D, 0.0D);
			TinyProgressions.proxy.spawnCustomParticle("sparkles", world, (double) (xx + randomOffset), (double) pos.getY() + 0.8D, (double) (zz - fixedOffset), 0.0D, 0.0D, 0.0D);
			TinyProgressions.proxy.spawnCustomParticle("sparkles", world, (double) (xx + randomOffset), (double) pos.getY() + 0.8D, (double) (zz + fixedOffset), 0.0D, 0.0D, 0.0D);

		}
	}
	
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
    	tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.vasholine_1").getFormattedText());
    }
}