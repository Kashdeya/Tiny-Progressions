package com.kashdeya.tinyprogressions.blocks.decorations;

import java.util.Random;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class Asphalt extends Block{
	
	public Asphalt()
    {
        super(Material.ROCK);
        this.setHardness(0.8F);
        this.setHarvestLevel("pickaxe", 0);
        this.setResistance(100.0F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setUnlocalizedName("asphalt_block");
    }
	
	/**
     * Get the Item that this Block should drop when harvested.
     */
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TechBlocks.asphalt_block);
    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return true;
    }
	
	@Override
    public int quantityDropped(Random rand)
    {
        return 1;
    }
	
	@Override
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.fall(fallDistance, 3.0F);
    }
	
	@Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
    	entityIn.motionX *= 1.8D;
        entityIn.motionZ *= 1.8D;

        super.onEntityWalk(worldIn, pos, entityIn);
    }

}
