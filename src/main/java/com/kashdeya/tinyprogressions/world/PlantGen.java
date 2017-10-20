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
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.IWorldGenerator;

public class PlantGen implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunk_X, int chunk_Z, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    	int x = chunk_X * 16 + 8;
        int z = chunk_Z * 16 + 8;
        
        final BlockPos blockPos = world.getHeight(new BlockPos(x, 0, z));
        final BlockPos chunkPos = new BlockPos(x, 0, z);
        final Biome biome = world.getChunkFromBlockCoords(chunkPos).getBiome(chunkPos, world.getBiomeProvider());
        
        if (BiomeDictionary.hasType(biome, Type.PLAINS) || BiomeDictionary.hasType(biome, Type.HOT) || BiomeDictionary.hasType(biome, Type.COLD)){
	        if (ConfigHandler.old_reed) {
	        	generatePlant(TechBlocks.old_reed, world, blockPos, random);
	        }
        }
        
        if(!BiomeDictionary.hasType(biome, Type.SAVANNA) || !BiomeDictionary.hasType(biome, Type.COLD)){
	        if (ConfigHandler.ExtraJuices || ConfigHandler.ExtraJuicesBottles){
	        	generateBlueberryPlant(TechBlocks.blueberry_bush, world, blockPos);
	        	generateRaspberryPlant(TechBlocks.raspberry_bush, world, blockPos);
	        	generateMaloberryPlant(TechBlocks.maloberry_bush, world, blockPos);
	        	generateBlackberryPlant(TechBlocks.blackberry_bush, world, blockPos);
	        }
        }        
    }

    private void generatePlant(Block block, World world, BlockPos pos, Random random) {

        for (int tryNum = 0; tryNum < 3; tryNum++) {
            int posX = (pos.getX() + random.nextInt(16));
            int posY = (pos.getY());
            int posZ = (pos.getZ() + random.nextInt(16));

            final BlockPos newPos = new BlockPos(posX, posY, posZ);

            if (block.canPlaceBlockAt(world, newPos)) {
                world.setBlockState(newPos, block.getDefaultState(), 2);
            }
        }
    }
    
    private void generateBlueberryPlant(Block block, World world, BlockPos pos) {

        for (int tryNum = 0; tryNum < 1; tryNum++) {
            int posX = (pos.getX());
            int posY = (pos.getY());
            int posZ = (pos.getZ());

            final BlockPos newPos = new BlockPos(posX, posY, posZ);

            if (block.canPlaceBlockAt(world, newPos)) {
                world.setBlockState(newPos, block.getDefaultState(), 2);
            }
        }
    }
    
    private void generateBlackberryPlant(Block block, World world, BlockPos pos) {

        for (int tryNum = 0; tryNum < 1; tryNum++) {
            int posX = (pos.getX());
            int posY = (pos.getY());
            int posZ = (pos.getZ());

            final BlockPos newPos = new BlockPos(posX, posY, posZ);

            if (block.canPlaceBlockAt(world, newPos)) {
                world.setBlockState(newPos, block.getDefaultState(), 2);
            }
        }
    }
    
    private void generateMaloberryPlant(Block block, World world, BlockPos pos) {

        for (int tryNum = 0; tryNum < 1; tryNum++) {
            int posX = (pos.getX());
            int posY = (pos.getY());
            int posZ = (pos.getZ());

            final BlockPos newPos = new BlockPos(posX, posY, posZ);

            if (block.canPlaceBlockAt(world, newPos)) {
                world.setBlockState(newPos, block.getDefaultState(), 2);
            }
        }
    }
    
    private void generateRaspberryPlant(Block block, World world, BlockPos pos) {

        for (int tryNum = 0; tryNum < 1; tryNum++) {
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