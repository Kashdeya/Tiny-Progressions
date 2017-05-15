package com.kashdeya.tinyprogressions.world;

import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

public class GravelGen implements IWorldGenerator {
	
    @Override
    public void generate(Random rand, int chunk_X, int chunk_Z, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    	
    	final int xChunk = chunk_X * 16 + 8, zChunk = chunk_Z * 16 + 8;
    	int x = chunk_X * 16 + rand.nextInt(16);
    	int y = rand.nextInt(128);
        int z = chunk_Z * 16 + rand.nextInt(16);        
        final BlockPos blockPos = world.getHeight(new BlockPos(x, y + 64, z));
        
        if (ConfigHandler.oreGravel) {
        	if (rand.nextInt(ConfigHandler.gravelCoalRarity) == 0){
        		generateGravel(TechBlocks.coal_gravel, world, blockPos, rand);
        	}
        }
    }

    public void generateGravel(Block block, World world, BlockPos pos, Random rand) {
    	
        for (int x = pos.getX() - 1; x <= pos.getX() + 1; x++) {
            for (int z = pos.getZ() - 1; z <= pos.getZ() + 1; z++) {
                for (int y = pos.getY() - 1; y <= pos.getY() + 1; y++) {
                    BlockPos next = new BlockPos(x + 1, y + rand.nextInt(3), z + 1);
                    IBlockState place;
                	place = world.getBlockState(pos.down());

                    if (place.getBlock() == Blocks.GRASS) {
                        if (world.getBlockState(next).getBlock() == Blocks.AIR) {
                        	world.setBlockState(next, block.getDefaultState(), 2);
                        	}
                    }
                    if (place.getBlock() == Blocks.GRAVEL) {
                    	if (world.getBlockState(next).getBlock() == Blocks.AIR) {
                        	world.setBlockState(next, block.getDefaultState(), 2);
                        	}
                    }
                    if (place.getBlock() == Blocks.SAND) {
                        if (world.getBlockState(next).getBlock() == Blocks.AIR) {
                            world.setBlockState(next, block.getDefaultState(), 2);
                            }
                    }
                }
            }
        }
    }

}
