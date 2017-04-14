package com.kashdeya.tinyprogressions.world;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;

public class WorldGen implements IWorldGenerator {
	
    private WorldGenerator ender_ore;
    private WorldGenerator lava_crystal_ore;
    private WorldGenerator lava_block;
    private WorldGenerator nether_lava_block;
    private WorldGenerator water_block;
    private WorldGenerator amethyst_ore;
    private WorldGenerator ruby_ore;
    private WorldGenerator sapphire_ore;
    private WorldGenerator antimatter_block;
    private WorldGenerator Blood_block;
    private WorldGenerator Coralium_block;
    private WorldGenerator MoltenDirt_block;
    private WorldGenerator MoltenDirtNether_block;
    
    public WorldGen()
    {
    	if (ConfigHandler.EnderOre){
    		this.ender_ore = new WorldGenMinable(TechBlocks.ender_ore.getDefaultState(), ConfigHandler.EnderOreSize);
    	}
    	if (ConfigHandler.LavaCrystal){
    		this.lava_crystal_ore = new WorldGenMinable(TechBlocks.lava_crystal_ore.getDefaultState(), ConfigHandler.LavaCrystalSize);
    	}
    	if (ConfigHandler.LavaBlock){
    		this.lava_block = new WorldGenMinable(TechBlocks.lava_block.getDefaultState(), ConfigHandler.LavaBlockSize);
    	}
    	if (ConfigHandler.NetherLavaBlock){
    		this.nether_lava_block = new WorldGenMinable(TechBlocks.nether_lava_block.getDefaultState(), ConfigHandler.NetherLavaBlockSize);
    	}
    	if (ConfigHandler.WaterBlock){
    		this.water_block = new WorldGenMinable(TechBlocks.water_block.getDefaultState(), ConfigHandler.WaterBlockSize);
    	}
    	if (ConfigHandler.AmethystOre){
    		this.amethyst_ore = new WorldGenMinable(TechBlocks.amethyst_ore.getDefaultState(), ConfigHandler.AmethystSize);
    	}
    	if (ConfigHandler.RubyOre){
    		this.ruby_ore = new WorldGenMinable(TechBlocks.ruby_ore.getDefaultState(), ConfigHandler.RubySize);
    	}
    	if (ConfigHandler.SapphireOre){
    		this.sapphire_ore = new WorldGenMinable(TechBlocks.sapphire_ore.getDefaultState(), ConfigHandler.SapphireSize);
    	}
    	if (ConfigHandler.AntimatterBlock){
    		this.antimatter_block = new WorldGenMinable(TechBlocks.antimatter_block.getDefaultState(), ConfigHandler.AntimatterSize);
    	}
    	if (ConfigHandler.BloodBlock){
    		this.Blood_block = new WorldGenMinable(TechBlocks.blood_block.getDefaultState(), ConfigHandler.BloodSize);
    	}
    	if (ConfigHandler.CoraliumBlock){
    		this.Coralium_block = new WorldGenMinable(TechBlocks.coralium_block.getDefaultState(), ConfigHandler.CoraliumSize);
    	}
    	if (ConfigHandler.MoltenDirtBlock){
    		this.MoltenDirt_block = new WorldGenMinable(TechBlocks.moltendirt_block.getDefaultState(), ConfigHandler.MoltenDirtSize);
    	}
    	if (ConfigHandler.MoltenDirtNetherBlock){
    		this.MoltenDirtNether_block = new WorldGenMinable(TechBlocks.moltendirt_nether_block.getDefaultState(), ConfigHandler.MoltenDirtNetherSize);
    	}
    }
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
      switch (world.provider.getDimension())
      {
      case 0:
    	  if (ConfigHandler.EnderOre){
    		  runGenerator(this.ender_ore, world, random, chunkX, chunkZ, ConfigHandler.EnderOreFrequency, ConfigHandler.EnderOreMin, ConfigHandler.EnderOreMax);
    	  }
    	  if (ConfigHandler.LavaCrystal){
    		  runGenerator(this.lava_crystal_ore, world, random, chunkX, chunkZ, ConfigHandler.LavaCrystalFrequency, ConfigHandler.LavaCrystalMin, ConfigHandler.LavaCrystalMax);
    	  }
    	  if (ConfigHandler.LavaBlock){
    		  runGenerator(this.lava_block, world, random, chunkX, chunkZ, ConfigHandler.LavaBlockFrequency, ConfigHandler.LavaBlockMin, ConfigHandler.LavaBlockMax);
    	  }
    	  if (ConfigHandler.WaterBlock){
    		  runGenerator(this.water_block, world, random, chunkX, chunkZ, ConfigHandler.WaterBlockFrequency, ConfigHandler.WaterBlockMin, ConfigHandler.WaterBlockMax);
    	  }
    	  if (ConfigHandler.AmethystOre){
    		  runGenerator(this.amethyst_ore, world, random, chunkX, chunkZ, ConfigHandler.AmethystFrequency, ConfigHandler.AmethystMin, ConfigHandler.AmethystMax);
    	  }
    	  if (ConfigHandler.RubyOre){
    		  runGenerator(this.ruby_ore, world, random, chunkX, chunkZ, ConfigHandler.RubyFrequency, ConfigHandler.RubyMin, ConfigHandler.RubyMax);
    	  }
    	  if (ConfigHandler.SapphireOre){
    		  runGenerator(this.sapphire_ore, world, random, chunkX, chunkZ, ConfigHandler.SapphireFrequency, ConfigHandler.SapphireMin, ConfigHandler.SapphireMax);
    	  }
    	  if (ConfigHandler.AntimatterBlock){
    		  runGenerator(this.antimatter_block, world, random, chunkX, chunkZ, ConfigHandler.AntimatterFrequency, ConfigHandler.AntimatterMin, ConfigHandler.AntimatterMax);
    	  }
    	  if (ConfigHandler.CoraliumBlock){
    		  runGenerator(this.Coralium_block, world, random, chunkX, chunkZ, ConfigHandler.CoraliumFrequency, ConfigHandler.CoraliumMin, ConfigHandler.CoraliumMax);
    	  }
    	  if (ConfigHandler.MoltenDirtBlock){
    		  runGenerator(this.MoltenDirt_block, world, random, chunkX, chunkZ, ConfigHandler.MoltenDirtFrequency, ConfigHandler.MoltenDirtMin, ConfigHandler.MoltenDirtMax);
    	  }
    	  break;
      case 1:
    	  break;
      case -1:
    	  if (ConfigHandler.NetherLavaBlock){
    		  runGenerator(this.nether_lava_block, world, random, chunkX, chunkZ, ConfigHandler.NetherLavaBlockFrequency, ConfigHandler.NetherLavaBlockMin, ConfigHandler.NetherLavaBlockMax);
    	  }
    	  if (ConfigHandler.BloodBlock){
    		  runGenerator(this.Blood_block, world, random, chunkX, chunkZ, ConfigHandler.BloodFrequency, ConfigHandler.BloodMin, ConfigHandler.BloodMax);
    	  }
    	  if (ConfigHandler.MoltenDirtNetherBlock){
    		  runGenerator(this.MoltenDirtNether_block, world, random, chunkX, chunkZ, ConfigHandler.MoltenDirtNetherFrequency, ConfigHandler.MoltenDirtNetherMin, ConfigHandler.MoltenDirtNetherMax);
    	  }
    	  break;
      }
    }
    
    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight)
    {
    	if ((minHeight < 0) || (maxHeight > 250) || (minHeight > maxHeight)) {
    		throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
    	}
    	int heightDiff = maxHeight - minHeight + 1;
    	for (int i = 0; i < chancesToSpawn; i++)
    	{
    		int x = chunk_X * 16 + rand.nextInt(16) + 8;
    		int y = minHeight + rand.nextInt(heightDiff);
    		int z = chunk_Z * 16 + rand.nextInt(16) + 8;
    		generator.generate(world, rand, new BlockPos(x, y, z));
    	}
    }
}