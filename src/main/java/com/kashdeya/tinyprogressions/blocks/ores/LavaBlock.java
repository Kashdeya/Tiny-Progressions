package com.kashdeya.tinyprogressions.blocks.ores;

import java.util.Random;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.ForgeEventFactory;

public class LavaBlock extends StandardBlock implements IOreDictEntry {

	private final String oredic;
	
    public LavaBlock(String oredic) {
        super(Properties.create(Material.ROCK)
        		.hardnessAndResistance(1, 5)
        		.setLightLevel((p) -> 4)
        		.tickRandomly()
        		.sound(SoundType.STONE));
        
        this.oredic = oredic;
    }

    @Override
    public String getOreDictName() {
        return this.oredic;
    }
	
//    @Override
//    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
//        return false;
//    }

    @Override
    public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, TileEntity te, ItemStack stack) {
//        player.addStat(Stats.getBlockStats(this));
    	
        player.addExhaustion(0.025F);
        worldIn.setBlockState(pos, Blocks.LAVA.getDefaultState());
        }
//
//    @Override
//    public int quantityDropped(Random random) {
//        return 1;
//    }

    @Override
    public boolean canDropFromExplosion(Explosion explosionIn) {
        return false;
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        entityIn.setMotionMultiplier(worldIn.getBlockState(pos), new Vector3d(0.8D, 1D, 0.8D));
       
        if (!entityIn.isImmuneToFire() && entityIn instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity) entityIn)) {
            entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 1.0F);
        }
        super.onEntityWalk(worldIn, pos, entityIn);
    }

//    @Override
//    public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, Predicate<IBlockState> target) {
//        return false;
//    }
//
       public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type) {
        return type.isImmuneToFire();
    }
//
//    @Override
//    @SideOnly(Side.CLIENT)
//    public int getPackedLightmapCoords(IBlockState state, IBlockAccess source, BlockPos pos) {
//        int i = source.getCombinedLight(pos, 0);
//        int j = source.getCombinedLight(pos.up(), 0);
//        int k = i & 255;
//        int l = j & 255;
//        int i1 = i >> 16 & 255;
//        int j1 = j >> 16 & 255;
//        return (k > l ? k : l) | (i1 > j1 ? i1 : j1) << 16;
//    }

	@Override
	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        double d0 = (double) pos.getX();
        double d1 = (double) pos.getY();
        double d2 = (double) pos.getZ();

        if (rand.nextInt(100) == 0) {
            double d8 = d0 + (double) rand.nextFloat();
            double d4 = d1 + stateIn.getCollisionShape(worldIn, pos).getBoundingBox().maxY;
            double d6 = d2 + (double) rand.nextFloat();
            worldIn.addParticle(ParticleTypes.LAVA, d8, d4, d6, 0.0D, 0.0D, 0.0D);
            worldIn.playSound(d8, d4, d6, SoundEvents.BLOCK_LAVA_POP, SoundCategory.BLOCKS, 0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
        }

        if (rand.nextInt(200) == 0) {
        	worldIn.playSound(d0, d1, d2, SoundEvents.BLOCK_LAVA_AMBIENT, SoundCategory.BLOCKS, 0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
        }

        if (rand.nextInt(100) == 0) {
            double d3 = d0 + (double) rand.nextFloat();
            double d7 = d2 + (double) rand.nextFloat();

            worldIn.addParticle(ParticleTypes.DRIPPING_LAVA, d3, d1, d7, 0.0D, 0.0D, 0.0D);
        }
    }
}