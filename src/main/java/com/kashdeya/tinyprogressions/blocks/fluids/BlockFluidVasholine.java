package com.kashdeya.tinyprogressions.blocks.fluids;

import java.util.List;
import java.util.Random;

import com.kashdeya.tinyprogressions.fluids.ModFluids;
import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.MaterialHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
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
		setUnlocalizedName("vasholine");
	}

	@Override
	public boolean canDisplace(IBlockAccess world, BlockPos pos) {
		if (world.getBlockState(pos).getMaterial().isLiquid())
			return false;
		return super.canDisplace(world, pos);
	}

	@Override
	public boolean displaceIfPossible(World world, BlockPos pos) {
		if (world.getBlockState(pos).getMaterial().isLiquid())
			return false;
		return super.displaceIfPossible(world, pos);
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		if (entity instanceof EntityLivingBase) {
			if(world.getTotalWorldTime()%20 == 0 && ((EntityLivingBase) entity).getHealth() < ((EntityLivingBase) entity).getMaxHealth()) // add whatever time you want here 20 = every 1 second
				((EntityLivingBase) entity).heal(0.5F);
			entity.rotationYaw += (world.rand.nextFloat() - world.rand.nextFloat()) * 5.0D;
			entity.rotationPitch += (world.rand.nextFloat() - world.rand.nextFloat()) * 5.0D;
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