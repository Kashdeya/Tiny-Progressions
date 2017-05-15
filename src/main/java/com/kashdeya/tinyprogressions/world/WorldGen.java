package com.kashdeya.tinyprogressions.world;

import java.util.Random;

import com.google.common.base.Predicate;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0:
			// generateOoverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			
			if (ConfigHandler.oreGravel){
				//generateGravel(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
				}
			break;
		case -1:
			// generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			break;
		case 1:
			//generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			break;
		}
	}
	
	private void generateGravel(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(TechBlocks.coal_gravel.getDefaultState(), world, random, chunkX, chunkZ, 1, 128, 3 + random.nextInt(5), 6, Blocks.STONE);
	}
	
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances, Block generateIn) {
		int delatY = maxY - minY;
	    for (int i = 0; i < chances; i++) {
	    	BlockPos pos = new BlockPos((x + random.nextInt(16)) + 8, minY + random.nextInt(delatY), (z + random.nextInt(16)) + 8);
	    	WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(generateIn));
	    	generator.generate(world, random, pos);
	    }
	}
    
}