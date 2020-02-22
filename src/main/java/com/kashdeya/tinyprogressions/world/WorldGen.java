package com.kashdeya.tinyprogressions.world;

import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) { // the overworld
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		if (world.provider.getDimension() == -1) { // the nether
			generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}

	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (ConfigHandler.vasholine && ConfigHandler.overworld_wub){
			generateOre(TechBlocks.wub_ore.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, ConfigHandler.wub_block_min, ConfigHandler.wub_block_max, 1 + random.nextInt(ConfigHandler.wub_block_count), ConfigHandler.wub_block_frequency);
		}
		if (ConfigHandler.ender_ore){
			generateOre(TechBlocks.ender_ore.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, ConfigHandler.ender_ore_min, ConfigHandler.ender_ore_max, 1 + random.nextInt(ConfigHandler.ender_ore_size), ConfigHandler.ender_ore_frequency);
		}
		if (ConfigHandler.lava_block){
			generateOre(TechBlocks.lava_block.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, ConfigHandler.lava_block_min, ConfigHandler.lava_block_max, 1 + random.nextInt(ConfigHandler.lava_block_size), ConfigHandler.lava_block_frequency);
		}
		if (ConfigHandler.water_block){
			generateOre(TechBlocks.water_block.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, ConfigHandler.water_block_min, ConfigHandler.water_block_max, 1 + random.nextInt(ConfigHandler.water_block_size), ConfigHandler.water_block_frequency);
		}
	}
	
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (ConfigHandler.CharcoalWorldgen && ConfigHandler.CharcoalBlock){
			generateNetherOre(TechBlocks.charcoal_block.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, ConfigHandler.charcoal_min, ConfigHandler.charcoal_max, 1 + random.nextInt(ConfigHandler.charcoal_size), ConfigHandler.charcoal_frequency, BlockMatcher.forBlock(Blocks.MAGMA));
		}
		if (ConfigHandler.vasholine && ConfigHandler.nether_wub){
			generateNetherOre(TechBlocks.nether_wub_ore.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, ConfigHandler.nether_wub_block_min, ConfigHandler.nether_wub_block_max, 1 + random.nextInt(ConfigHandler.nether_wub_block_count), ConfigHandler.nether_wub_block_frequency, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (ConfigHandler.nether_lava_block){
			generateOre(TechBlocks.nether_lava_block.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, ConfigHandler.nether_lava_block_min, ConfigHandler.nether_lava_block_max, 1 + random.nextInt(ConfigHandler.nether_lava_block_size), ConfigHandler.nether_lava_block_frequency);
		}
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
	
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
	
	private void generateNetherOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances, BlockMatcher blockMatcher) {
		int deltaY = maxY - minY;
	
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}

}