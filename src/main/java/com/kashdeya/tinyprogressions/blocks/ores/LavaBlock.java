package com.kashdeya.tinyprogressions.blocks.ores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.common.base.Predicate;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import javafx.geometry.Side;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LavaBlock extends Block implements IOreDictEntry {

    public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

    public LavaBlock() {
        super(Material.GROUND);
        this.setHardness(1.0F);
        this.setResistance(5.0F);
        this.setLightLevel(0.2F);
        this.setTickRandomly(true);
        this.setTranslationKey("lava_block");
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(TinyProgressions.tabTP);
    }

    @Override
    public String getOreDictName() {
        return "oreLavaBlock";
    }

	@Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
	
	
    @Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
        return false;
    }

    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te, ItemStack stack) {
        player.addStat(StatList.getBlockStats(this));
        player.addExhaustion(0.025F);
        if (this.canSilkHarvest(worldIn, pos, state, player) && EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack) > 0) {
            List<ItemStack> items = new ArrayList<ItemStack>();
            ItemStack itemstack = this.getSilkTouchDrop(state);

            if (!itemstack.isEmpty()) {
                items.add(itemstack);
            }

            ForgeEventFactory.fireBlockHarvesting(items, worldIn, pos, state, 0, 1.0f, true, player);
            items.forEach(item -> spawnAsEntity(worldIn, pos, item));
        } else {
            worldIn.setBlockState(pos, Blocks.FLOWING_LAVA.getDefaultState());
        }
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

    @Override
    public boolean canDropFromExplosion(Explosion explosionIn) {
        return false;
    }

    @Override
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
        entityIn.fall(fallDistance, 3.0F);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        entityIn.motionX *= 0.8D;
        entityIn.motionZ *= 0.8D;
        if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase) entityIn)) {
            entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 1.0F);
        }

        super.onEntityWalk(worldIn, pos, entityIn);
    }

    @Override
    public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, Predicate<IBlockState> target) {
        return false;
    }

    @Override
    public boolean canEntitySpawn(IBlockState state, Entity entityIn) {
        return entityIn.isImmuneToFire();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getPackedLightmapCoords(IBlockState state, IBlockAccess source, BlockPos pos) {
        int i = source.getCombinedLight(pos, 0);
        int j = source.getCombinedLight(pos.up(), 0);
        int k = i & 255;
        int l = j & 255;
        int i1 = i >> 16 & 255;
        int j1 = j >> 16 & 255;
        return (k > l ? k : l) | (i1 > j1 ? i1 : j1) << 16;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState worldIn, World pos, BlockPos state, Random rand) {
        double d0 = (double) state.getX();
        double d1 = (double) state.getY();
        double d2 = (double) state.getZ();

        if (rand.nextInt(100) == 0) {
            double d8 = d0 + (double) rand.nextFloat();
            double d4 = d1 + worldIn.getBoundingBox(pos, state).maxY;
            double d6 = d2 + (double) rand.nextFloat();
            pos.spawnParticle(EnumParticleTypes.LAVA, d8, d4, d6, 0.0D, 0.0D, 0.0D);
            pos.playSound(d8, d4, d6, SoundEvents.BLOCK_LAVA_POP, SoundCategory.BLOCKS, 0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
        }

        if (rand.nextInt(200) == 0) {
            pos.playSound(d0, d1, d2, SoundEvents.BLOCK_LAVA_AMBIENT, SoundCategory.BLOCKS, 0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
        }

        if (rand.nextInt(100) == 0) {
            double d3 = d0 + (double) rand.nextFloat();
            double d7 = d2 + (double) rand.nextFloat();

            pos.spawnParticle(EnumParticleTypes.DRIP_LAVA, d3, d1, d7, 0.0D, 0.0D, 0.0D);
        }
    }
}