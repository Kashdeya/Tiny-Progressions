package com.kashdeya.tinyprogressions.world;

import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {
	
    private WorldGenerator ender_ore;
    
    public WorldGen()
    {
    	if (ConfigHandler.ender_ore){
    		this.ender_ore = new WorldGenMinable(TechBlocks.ender_ore.getDefaultState(), ConfigHandler.ender_ore_size);
    	}
    }
    
    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight)
    {
      if ((minHeight < 0) || (maxHeight > 256) || (minHeight > maxHeight)) {
        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
      }
      int heightDiff = maxHeight - minHeight + 1;
      for (int i = 0; i < chancesToSpawn; i++)
      {
        int x = chunk_X * 16 + rand.nextInt(8);
        int y = minHeight + rand.nextInt(heightDiff);
        int z = chunk_Z * 16 + rand.nextInt(8);
        generator.generate(world, rand, new BlockPos(x, y, z));
      }
    }
    
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
      switch (world.provider.getDimension())
      {
      case 0:
    	  if (ConfigHandler.ender_ore){
    		  runGenerator(this.ender_ore, world, random, chunkX, chunkZ, ConfigHandler.ender_ore_frequency, ConfigHandler.ender_ore_min, ConfigHandler.ender_ore_max);
    	  }
    	  break;
      case 1:
    	  break;
      case -1:
    	  break;
      }
    }
}