package com.kashdeya.tinyprogressions.world;

import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.TempCategory;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class PlantGen implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunk_X, int chunk_Z, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    	int x = chunk_X * 16 + random.nextInt(16);
        int z = chunk_Z * 16 + random.nextInt(16);
        
        final Biome biome = world.getBiomeForCoordsBody(new BlockPos(x, 0, z));
        final BlockPos blockPos = world.getHeight(new BlockPos(x, 0, z));
        
        if(biome.getTempCategory() != TempCategory.WARM)
            return;
        
        if (ConfigHandler.old_reed) {
        	generatePlant(TechBlocks.old_reed, world, blockPos);
        }
    }

    private void generatePlant(Block block, World world, BlockPos pos) {

        for (int tryNum = 0; tryNum < 3; tryNum++) {
            int posX = (pos.getX());
            int posY = (pos.getY());
            int posZ = (pos.getZ());

            final BlockPos newPos = new BlockPos(posX, posY, posZ);

            if (block.canPlaceBlockAt(world, newPos)) {
                world.setBlockState(newPos, block.getDefaultState(), 2);
            }
        }
    }
}