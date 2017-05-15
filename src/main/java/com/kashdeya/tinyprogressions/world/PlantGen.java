package com.kashdeya.tinyprogressions.world;

import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

public class PlantGen implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunk_X, int chunk_Z, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    	final int xChunk = chunk_X * 16 + 8, zChunk = chunk_Z * 16 + 8;
    	int x = chunk_X * 16 + random.nextInt(16);
    	int y = random.nextInt(128);
        int z = chunk_Z * 16 + random.nextInt(16);
        
        final Biome biome = world.getBiomeForCoordsBody(new BlockPos(x, 0, z));
        final BlockPos blockPos = world.getHeight(new BlockPos(x, y + 64, z));
        
        if (ConfigHandler.BrokenReed && BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SANDY) && BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MESA) && BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DRY)) {
        		generatePlant(TechBlocks.broken_reed, world, blockPos);
        }
    }

    private void generatePlant(Block block, World world, BlockPos pos) {

        for (int i = 0; i < 10; ++i) {
            int posX = (pos.getX() + world.rand.nextInt(8)) - world.rand.nextInt(8);
            int posY = (pos.getY());
            int posZ = (pos.getZ() + world.rand.nextInt(8)) - world.rand.nextInt(8);

            final BlockPos newPos = new BlockPos(posX, posY, posZ);

            if (block.canPlaceBlockAt(world, newPos)) {
                world.setBlockState(newPos, block.getDefaultState(), 2);
            }
        }
    }
}