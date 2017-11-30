package com.kashdeya.tinyprogressions.blocks.ores;

import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class VasholineOre extends Block {
	
    public VasholineOre()
    {
        super(Material.ROCK);
        this.setHardness(8.0F);
        this.setResistance(10.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setUnlocalizedName("vasholine_ore");
    }
    
    @Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
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
    
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}
    
    @Override
    public int quantityDropped(Random rand) {
        return 1 + rand.nextInt(2);
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return TechItems.ender_dust;
    }
    
    @Override
    public int quantityDroppedWithBonus(int fortune, Random rand) {
    	return MathHelper.clamp(this.quantityDropped(rand) + rand.nextInt(fortune + 1), 1, 6);
    }
    

    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        return (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this)) ? (1 + RANDOM.nextInt(5)) : 0;
    }
    
    @Override
    public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, com.google.common.base.Predicate<IBlockState> target)
    {
        return false;
    }
}
