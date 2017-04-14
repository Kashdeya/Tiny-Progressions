package com.kashdeya.tinyprogressions.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;

public class PlantGen implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    	int xCh = chunkX * 16 + random.nextInt(16) + 8;
        int zCh = chunkZ * 16 + random.nextInt(16) + 8;
        
        final Biome biome = world.getBiomeForCoordsBody(new BlockPos(xCh, 0, zCh));
        final BlockPos blockPos = world.getHeight(new BlockPos(xCh, 0, zCh));
        
        if (ConfigHandler.BrokenReed && (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SANDY)) && (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.BEACH)) && (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MESA))) {
        	generatePlant(TechBlocks.broken_reed, world, blockPos);
        }
    }

    private void generatePlant(Block block, World world, BlockPos pos) {

        final int tries = 2;

        for (int tryNum = 0; tryNum < tries; tryNum++) {
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