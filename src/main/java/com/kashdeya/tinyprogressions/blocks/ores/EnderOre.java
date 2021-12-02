package com.kashdeya.tinyprogressions.blocks.ores;

import java.util.Random;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.EndermiteEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

public class EnderOre extends StandardBlock implements IOreDictEntry {
	
    public EnderOre()
    {
        super(Properties
        		.of(Material.STONE)
        		.strength(8, 10)
        		.harvestLevel(1)
        		.harvestTool(ToolType.PICKAXE));
    }
    
	@Override
	public String getOreDictName() {
		return "oreEnderOre";
	}
    
    @Override
    public void playerWillDestroy(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
    	if (ConfigHandler.ender_mite && !worldIn.isClientSide()){
            int x = pos.getX();
            int y = pos.getY();
            int z = pos.getZ();
            int rand = worldIn.random.nextInt(100);
            if (rand <= ConfigHandler.endermite_spawn) {
            	for(int i= worldIn.random.nextInt(4)+1; i > 0; i-- ) {
	                Entity entity = new EndermiteEntity(EntityType.ENDERMITE, worldIn);
	                    entity.setPos(x + (0.5), y + (1), z + (0.5));
	                    entity.setYBodyRot(worldIn.random.nextFloat() * 360F);
	                    worldIn.addFreshEntity(entity);
	                    ((LivingEntity) entity).playSound(SoundEvents.ENDERMITE_AMBIENT, 1, 1);
            	}
            }
    	}
    }
    
	@Override
	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        for (int i = 0; i < 4; ++i)
        {
            double d0 = (double)((float)pos.getX() + rand.nextFloat());
            double d1 = (double)((float)pos.getY() + rand.nextFloat());
            double d2 = (double)((float)pos.getZ() + rand.nextFloat());
            double d3 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            double d4 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            double d5 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            int j = rand.nextInt(2) * 2 - 1;

            if (worldIn.getBlockState(pos.west()).getBlock() != this && worldIn.getBlockState(pos.east()).getBlock() != this)
            {
                d0 = (double)pos.getX() + 0.5D + 0.25D * (double)j;
                d3 = (double)(rand.nextFloat() * 2.0F * (float)j);
            }
            else
            {
                d2 = (double)pos.getZ() + 0.5D + 0.25D * (double)j;
                d5 = (double)(rand.nextFloat() * 2.0F * (float)j);
            }

            worldIn.addParticle(ParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5);
        }
    }
    
}
