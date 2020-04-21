package com.kashdeya.tinyprogressions.inits;

import java.util.List;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;


public class TechFeatures {

	public static final BlockClusterFeatureConfig blackBerryBushConfigFeature = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(TechBlocks.blackberry_bush.get().getDefaultState()), new SimpleBlockPlacer())).func_227315_a_(64).func_227316_a_(ImmutableSet.of(Blocks.GRASS_BLOCK.getDefaultState().getBlock())).func_227317_b_().func_227322_d_();	
	public static final BlockClusterFeatureConfig blueBerryBushConfigFeature  = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(TechBlocks.blueberry_bush.get().getDefaultState()), new SimpleBlockPlacer())).func_227315_a_(64).func_227316_a_(ImmutableSet.of(Blocks.GRASS_BLOCK.getDefaultState().getBlock())).func_227317_b_().func_227322_d_();
	public static final BlockClusterFeatureConfig maloBerryBushConfigFeature  = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(TechBlocks.maloberry_bush.get().getDefaultState()), new SimpleBlockPlacer())).func_227315_a_(64).func_227316_a_(ImmutableSet.of(Blocks.GRASS_BLOCK.getDefaultState().getBlock())).func_227317_b_().func_227322_d_();
	public static final BlockClusterFeatureConfig raspBerryBushConfigFeature  = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(TechBlocks.raspberry_bush.get().getDefaultState()), new SimpleBlockPlacer())).func_227315_a_(64).func_227316_a_(ImmutableSet.of(Blocks.GRASS_BLOCK.getDefaultState().getBlock())).func_227317_b_().func_227322_d_();
	
	public static final List<Category> berryWhitelist = Lists.newArrayList(Category.JUNGLE, Category.SWAMP, Category.PLAINS, Category.TAIGA, Category.EXTREME_HILLS);

	public static void registerAllFeatures() {
		for(Biome biome : Biome.BIOMES) {
			registerBushesToBiomes(biome);
			registerOres(biome);
		}
	}
	
	public static void registerBushesToBiomes(Biome biome) {
		for( Category selected : berryWhitelist)
			if(biome.getCategory().equals(selected))
			{
				addFeatureToBiome(biome);
			}
	}
	
	public static void registerOres(Biome biome) {
		if(biome.getCategory() == Biome.Category.NETHER) {
			addNetherOre(biome, TechBlocks.nether_wub_ore.get().getDefaultState()    ,new CountRangeConfig(ConfigHandler.nether_wub_block_min, 0, 0, ConfigHandler.nether_wub_block_max), ConfigHandler.nether_wub_block_count );
			addNetherOre(biome, TechBlocks.charcoal_block.get().getDefaultState()    ,new CountRangeConfig(ConfigHandler.charcoal_min, 0, 0, ConfigHandler.charcoal_max), ConfigHandler.charcoal_size);
			addNetherOre(biome, TechBlocks.nether_lava_block.get().getDefaultState() ,new CountRangeConfig(ConfigHandler.nether_lava_block_min, 0, 0, ConfigHandler.nether_lava_block_max), ConfigHandler.nether_lava_block_size);
		}
		else {
			if(ConfigHandler.overworld_wub)
				addNatureOre(biome, TechBlocks.wub_ore.get().getDefaultState() ,new CountRangeConfig(ConfigHandler.wub_block_min, 0, 0, ConfigHandler.wub_block_max), ConfigHandler.wub_block_count );
			
			addNatureOre(biome, TechBlocks.lava_block.get().getDefaultState()  ,new CountRangeConfig(ConfigHandler.lava_block_min, 0, 0, ConfigHandler.lava_block_max),ConfigHandler.lava_block_size );
			addNatureOre(biome, TechBlocks.ender_ore.get().getDefaultState()   ,new CountRangeConfig(ConfigHandler.ender_ore_min, 0, 0, ConfigHandler.ender_ore_max),ConfigHandler.ender_ore_size );
			addNatureOre(biome, TechBlocks.water_block.get().getDefaultState() ,new CountRangeConfig( ConfigHandler.water_block_min, 0, 0, ConfigHandler.water_block_max), ConfigHandler.water_block_size);
		}
	}	
	
	private static void addFeatureToBiome(Biome biomeIn) {
		System.out.println(biomeIn.getDisplayName().getFormattedText());
		biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_227248_z_.func_225566_b_(blackBerryBushConfigFeature).func_227228_a_(Placement.COUNT_HEIGHTMAP_DOUBLE.func_227446_a_(new FrequencyConfig(1))));
		biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_227248_z_.func_225566_b_(blueBerryBushConfigFeature).func_227228_a_(Placement.COUNT_HEIGHTMAP_DOUBLE.func_227446_a_(new FrequencyConfig(1))));
		biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_227248_z_.func_225566_b_(maloBerryBushConfigFeature).func_227228_a_(Placement.COUNT_HEIGHTMAP_DOUBLE.func_227446_a_(new FrequencyConfig(1))));
		biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_227248_z_.func_225566_b_(raspBerryBushConfigFeature).func_227228_a_(Placement.COUNT_HEIGHTMAP_DOUBLE.func_227446_a_(new FrequencyConfig(1))));
	}
	
	private static void addNatureOre(Biome biomeIn, BlockState Ore, CountRangeConfig range, int orecount) {
	      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Ore, orecount)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(range)));
	}
   
	private static void addNetherOre(Biome biomeIn, BlockState Ore, CountRangeConfig range, int orecount) {
	   biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, Ore, orecount)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(range)));
	}
}
