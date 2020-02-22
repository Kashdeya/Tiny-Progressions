package com.kashdeya.tinyprogressions.world;

import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OldWorldGen implements IWorldGenerator {
	
	private WorldGenerator ender_ore;
    private WorldGenerator lava_block;
    private WorldGenerator water_block;
    private WorldGenerator charcoal_block;
    private WorldGenerator wub_ore;
    
    public OldWorldGen()
    {
    	if (ConfigHandler.ender_ore){
    		this.ender_ore = new WorldGenMinable(TechBlocks.ender_ore.getDefaultState(), ConfigHandler.ender_ore_size, BlockMatcher.forBlock(Blocks.STONE));
    	}
    	if (ConfigHandler.lava_block){
    		this.lava_block = new WorldGenMinable(TechBlocks.lava_block.getDefaultState(), ConfigHandler.lava_block_size, BlockMatcher.forBlock(Blocks.STONE));
    	}
    	if (ConfigHandler.water_block){
    		this.water_block = new WorldGenMinable(TechBlocks.water_block.getDefaultState(), ConfigHandler.water_block_size, BlockMatcher.forBlock(Blocks.STONE));
    	}
    	if (ConfigHandler.CharcoalWorldgen && ConfigHandler.CharcoalBlock){
    		this.charcoal_block = new WorldGenMinable(TechBlocks.charcoal_block.getDefaultState(), ConfigHandler.charcoal_size, BlockMatcher.forBlock(Blocks.MAGMA));
    	}
    	if (ConfigHandler.vasholine){
    		this.wub_ore = new WorldGenMinable(TechBlocks.wub_ore.getDefaultState(), ConfigHandler.wub_block_count, BlockMatcher.forBlock(Blocks.STONE));
    	}
    }
    
    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight)
    {
      if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
      }
      int heightDiff = maxHeight - minHeight + 1;
      for (int i = 0; i < chancesToSpawn; i++)
      {
        int x = chunk_X + rand.nextInt(16);
        int y = minHeight + rand.nextInt(heightDiff);
        int z = chunk_Z + rand.nextInt(16);
        BlockPos pos = new BlockPos(x,y,z);
        generator.generate(world, rand, pos);
        //String biome = world.getBiomeForCoordsBody(pos).getBiomeName();
      }
    }
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
      switch (world.provider.getDimension())
      {
      case 0:
    	  if (ConfigHandler.ender_ore){
    		  runGenerator(this.ender_ore, world, random, chunkX * 16, chunkZ * 16, ConfigHandler.ender_ore_frequency, ConfigHandler.ender_ore_min, ConfigHandler.ender_ore_max);
    	  }
    	  if (ConfigHandler.lava_block){
    		  runGenerator(this.lava_block, world, random, chunkX * 16, chunkZ * 16, ConfigHandler.lava_block_frequency, ConfigHandler.lava_block_min, ConfigHandler.lava_block_max);
    	  }
    	  if (ConfigHandler.water_block){
    		  runGenerator(this.water_block, world, random, chunkX * 16, chunkZ * 16, ConfigHandler.water_block_frequency, ConfigHandler.water_block_min, ConfigHandler.water_block_max);
    	  }
    	  if (ConfigHandler.vasholine){// && Biomes.EXTREME_HILLS != null
    		  runGenerator(this.wub_ore, world, random, chunkX * 16, chunkZ * 16, 5, 1, 12);
    	  }
    	  break;
      case 1:
    	  break;
      case -1:
    	  if (ConfigHandler.CharcoalWorldgen && ConfigHandler.CharcoalBlock){
    		  runGenerator(this.charcoal_block, world, random, chunkX * 16, chunkZ * 16, ConfigHandler.charcoal_frequency, ConfigHandler.charcoal_min, ConfigHandler.charcoal_max);
    	  }
    	  break;
      }
    }
}