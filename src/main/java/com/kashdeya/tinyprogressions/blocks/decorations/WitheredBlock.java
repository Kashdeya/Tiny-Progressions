package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class WitheredBlock extends Block {
	
	public WitheredBlock(Properties prop)
    {
        super(prop.strength(400F, 3600000.0F).randomTicks().sound(SoundType.STONE));
    }

    @Override
    public void stepOn(World worldIn, BlockPos pos, Entity entityIn)
    {    	
        if (entityIn instanceof PlayerEntity)
        {
            ((LivingEntity) entityIn).addEffect(new EffectInstance(Effects.WITHER, ConfigHandler.WitheredBlockTime * 20, 1, true, ConfigHandler.WitheredBlockParticals));
        }

        super.stepOn(worldIn, pos, entityIn);
    }

    public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type) {
		return true;
	}
     
}
