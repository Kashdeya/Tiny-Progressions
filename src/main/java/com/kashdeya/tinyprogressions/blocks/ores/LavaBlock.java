package com.kashdeya.tinyprogressions.blocks.ores;

import java.util.Random;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySpawnPlacementRegistry.PlacementType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class LavaBlock extends StandardBlock implements IOreDictEntry {

	private final String oredic;
	
    public LavaBlock(String oredic) {
        super(Properties.of(Material.STONE)
        		.strength(1, 5)
        		.lightLevel((p) -> 4)
        		.randomTicks()
        		.sound(SoundType.STONE));
        
        this.oredic = oredic;
    }

    @Override
    public String getOreDictName() {
        return this.oredic;
    }
	
    @Override
    public void playerDestroy(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack) {
        super.playerWillDestroy(worldIn, pos, state, player);
//    	if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, stack) == 0) {
//      if (worldIn.dimensionType().ultraWarm()) {
//      	worldIn.removeBlock(pos, false);
//         return;
//      }
//	}
        player.causeFoodExhaustion(0.025F);
        worldIn.setBlockAndUpdate(pos, Blocks.LAVA.defaultBlockState());

       }

    @Override
    public boolean dropFromExplosion(Explosion explosionIn) {
        return false;
    }

    @Override
    public void stepOn(World worldIn, BlockPos pos, Entity entityIn) {
    	entityIn.setDeltaMovement(entityIn.getDeltaMovement().multiply(new Vector3d(0.8D, 1D, 0.8D)));
        if (!entityIn.fireImmune() && entityIn instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity) entityIn)) {
            entityIn.hurt(DamageSource.HOT_FLOOR, 1.0F);
        }
       super.stepOn(worldIn, pos, entityIn);
    }

    @Override
    public boolean canCreatureSpawn(BlockState state, IBlockReader worldIn, BlockPos pos, PlacementType placement, EntityType<?> type) {
        return type.fireImmune();
    }

	@Override
	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        double d0 = (double) pos.getX();
        double d1 = (double) pos.getY();
        double d2 = (double) pos.getZ();

        if (rand.nextInt(100) == 0) {
            double d8 = d0 + (double) rand.nextFloat();
            double d4 = d1 + stateIn.getCollisionShape(worldIn, pos).max(Direction.Axis.Y);
            double d6 = d2 + (double) rand.nextFloat();
            worldIn.addParticle(ParticleTypes.LAVA, d8, d4, d6, 0.0D, 0.0D, 0.0D);
            worldIn.playLocalSound(d8, d4, d6, SoundEvents.LAVA_POP, SoundCategory.BLOCKS, 0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
        }

        if (rand.nextInt(200) == 0) {
        	worldIn.playLocalSound(d0, d1, d2, SoundEvents.LAVA_POP, SoundCategory.BLOCKS, 0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
        }

        if (rand.nextInt(100) == 0) {
            double d3 = d0 + (double) rand.nextFloat();
            double d7 = d2 + (double) rand.nextFloat();

            worldIn.addParticle(ParticleTypes.DRIPPING_LAVA, d3, d1, d7, 0.0D, 0.0D, 0.0D);
        }
    }
}