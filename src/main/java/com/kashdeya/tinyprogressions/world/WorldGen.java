package com.kashdeya.tinyprogressions.world;

import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {
	
    private WorldGenerator ender_ore;
    private WorldGenerator lava_ore;
    private WorldGenerator lava_block;
    private WorldGenerator water_block;
    
    public WorldGen()
    {
    	if (ConfigHandler.ender_ore){
    		this.ender_ore = new WorldGenMinable(TechBlocks.ender_ore.getDefaultState(), ConfigHandler.ender_ore_size);
    	}
    	if (ConfigHandler.lava_ore){
    		this.lava_ore = new WorldGenMinable(TechBlocks.lava_ore.getDefaultState(), ConfigHandler.lava_ore_size);
    	}
    	if (ConfigHandler.lava_block){
    		this.lava_block = new WorldGenMinable(TechBlocks.lava_block.getDefaultState(), ConfigHandler.lava_block_size);
    	}
    	if (ConfigHandler.water_block){
    		this.water_block = new WorldGenMinable(TechBlocks.water_block.getDefaultState(), ConfigHandler.water_block_size);
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
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
      switch (world.provider.getDimension())
      {
      case 0:
    	  if (ConfigHandler.ender_ore){
    		  runGenerator(this.ender_ore, world, random, chunkX, chunkZ, ConfigHandler.ender_ore_frequency, ConfigHandler.ender_ore_min, ConfigHandler.ender_ore_max);
    	  }
    	  if (ConfigHandler.lava_ore){
    		  runGenerator(this.lava_ore, world, random, chunkX, chunkZ, ConfigHandler.lava_ore_frequency, ConfigHandler.lava_ore_min, ConfigHandler.lava_ore_max);
    	  }
    	  if (ConfigHandler.lava_block){
    		  runGenerator(this.lava_block, world, random, chunkX, chunkZ, ConfigHandler.lava_block_frequency, ConfigHandler.lava_block_min, ConfigHandler.lava_block_max);
    	  }
    	  if (ConfigHandler.water_block){
    		  runGenerator(this.water_block, world, random, chunkX, chunkZ, ConfigHandler.water_block_frequency, ConfigHandler.water_block_min, ConfigHandler.water_block_max);
    	  }
    	  break;
      case 1:
    	  break;
      case -1:
    	  break;
      }
    }
}