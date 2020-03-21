package com.kashdeya.tinyprogressions.blocks.decorations;

import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class WitheredBlock extends Block {
	
	public WitheredBlock()
    {
        super(Material.ROCK);
        this.setBlockUnbreakable();
        this.setTickRandomly(true);
        this.setResistance(6000000.0F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setTranslationKey("withered_block");
        this.disableStats();
    }

	//TODO
//    @Override
//    public int quantityDropped(Random random)
//    {
//        return 0;
//    }
//
//    @Override
//    @Nullable
//    public Item getItemDropped(IBlockState state, Random rand, int fortune)
//    {
//        return null;
//    }
    
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {    	
        if (entityIn instanceof EntityPlayer)
        {
            ((LivingEntity) entityIn).addPotionEffect(new PotionEffect(MobEffects.WITHER, ConfigHandler.WitheredBlockTime * 20, 0, true, ConfigHandler.WitheredBlockParticals));
        }

        super.onEntityWalk(worldIn, pos, entityIn);
    }
    
    @Override
	public boolean canCreatureSpawn(IBlockState state, IBlockAccess world, BlockPos pos, EntityLiving.SpawnPlacementType type) {
		return true;
	}
    
    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
//        List<EntityLivingBase> list = worldIn.getEntitiesWithinAABB(EntityPlayer.class, this.FULL_BLOCK_AABB.expand(2, 2, 2));
    }
    
}
