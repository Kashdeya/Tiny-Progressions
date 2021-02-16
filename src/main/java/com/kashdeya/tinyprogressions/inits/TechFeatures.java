/*
package com.kashdeya.tinyprogressions.inits;

import java.util.List;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
// import com.kashdeya.tinyprogressions.world.QuickSandFeature;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TechFeatures {



	// public static RegistryObject<Feature<BlockStateFeatureConfig>> QuickSandFeature = TinyProgressions.FEATURES.register("quicksandfeature", () -> new QuickSandFeature(BlockStateFeatureConfig::func_227271_a_));

	public static BlockClusterFeatureConfig blackBerryBushConfigFeature;
	public static BlockClusterFeatureConfig blueBerryBushConfigFeature;
	public static BlockClusterFeatureConfig maloBerryBushConfigFeature;
	public static BlockClusterFeatureConfig raspBerryBushConfigFeature;

	public static BlockClusterFeatureConfig reedConfigFeature;


	public static final List<Category> berryWhitelist = Lists.newArrayList(Category.JUNGLE, Category.SWAMP, Category.PLAINS, Category.TAIGA, Category.EXTREME_HILLS);
	public static final List<Category> reedWhitelist = Lists.newArrayList(Category.PLAINS, Category.SWAMP);

	public static void registerAllFeatures() {


		blackBerryBushConfigFeature = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(TechBlocks.blackberry_bush.get().getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK.getDefaultState().getBlock())).func_227317_b_().build();
		blueBerryBushConfigFeature  = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(TechBlocks.blueberry_bush.get().getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK.getDefaultState().getBlock())).func_227317_b_().build();
		maloBerryBushConfigFeature  = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(TechBlocks.maloberry_bush.get().getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK.getDefaultState().getBlock())).func_227317_b_().build();
		raspBerryBushConfigFeature  = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(TechBlocks.raspberry_bush.get().getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK.getDefaultState().getBlock())).func_227317_b_().build();
		reedConfigFeature  = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(TechBlocks.old_reed.get().getDefaultState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(Blocks.COARSE_DIRT.getDefaultState().getBlock(), Blocks.DIRT.getDefaultState().getBlock(), Blocks.GRASS_BLOCK.getDefaultState().getBlock())).func_227317_b_().build();


		for(Biome biome : ForgeRegistries.BIOMES) {

			if(ConfigHandler.bushes_terrain_gen)
				registerBushesToBiomes(biome);

			registerOres(biome);

			// if(ConfigHandler.should_gen_quick_sand)
				// addQuickSand(biome);

			if(reedWhitelist.contains(biome.getCategory()))
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(reedConfigFeature).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.func_227446_a_(new FrequencyConfig(1))));
		}
	}

	public static void registerBushesToBiomes(Biome biome) {
		for( Category selected : berryWhitelist)
			if(biome.getCategory().equals(selected))
			{
				addBerryBushToBiome(biome);
			}
	}

	public static void registerOres(Biome biome) {
		if(biome.getCategory() == Biome.Category.NETHER) {
			if(ConfigHandler.wub_ore_gen)
				addNetherOre(biome, TechBlocks.nether_wub_ore.get().getDefaultState()    ,new CountRangeConfig(ConfigHandler.nether_wub_block_frequency, ConfigHandler.nether_wub_block_min, 0, ConfigHandler.nether_wub_block_max), ConfigHandler.nether_wub_block_count );

			if(ConfigHandler.charcoal_ore_gen)
				addNetherOre(biome, TechBlocks.charcoal_block.get().getDefaultState()    ,new CountRangeConfig(ConfigHandler.charcoal_frequency , ConfigHandler.charcoal_min, 0, ConfigHandler.charcoal_max), ConfigHandler.charcoal_size);

			if(ConfigHandler.lava_block_gen)
				addNetherOre(biome, TechBlocks.nether_lava_block.get().getDefaultState() ,new CountRangeConfig(ConfigHandler.nether_lava_block_frequency, ConfigHandler.nether_lava_block_min, 0, ConfigHandler.nether_lava_block_max), ConfigHandler.lava_block_size);
		}
		else {
			if(ConfigHandler.wub_ore_gen && ConfigHandler.overworld_wub)
				addNatureOre(biome, TechBlocks.wub_ore.get().getDefaultState() ,new CountRangeConfig(ConfigHandler.wub_block_frequency, ConfigHandler.wub_block_min, 0, ConfigHandler.wub_block_max), ConfigHandler.wub_block_count );

			if(ConfigHandler.lava_block_gen)
				addNatureOre(biome, TechBlocks.lava_block.get().getDefaultState()  ,new CountRangeConfig(ConfigHandler.lava_block_frequency, ConfigHandler.lava_block_min, 0, ConfigHandler.lava_block_max),ConfigHandler.lava_block_size );

			if(ConfigHandler.ender_ore_gen)
				addNatureOre(biome, TechBlocks.ender_ore.get().getDefaultState()   ,new CountRangeConfig(ConfigHandler.ender_ore_frequency, ConfigHandler.ender_ore_min, 0, ConfigHandler.ender_ore_max),ConfigHandler.ender_ore_size );

			if(ConfigHandler.water_block_gen)
				addNatureOre(biome, TechBlocks.water_block.get().getDefaultState() ,new CountRangeConfig(ConfigHandler.water_block_frequency, ConfigHandler.water_block_min, 0, ConfigHandler.water_block_max), ConfigHandler.water_block_size);
		}
	}

	private static void addBerryBushToBiome(Biome biomeIn) {
		biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(blackBerryBushConfigFeature).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.func_227446_a_(new FrequencyConfig(1))));
		biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(blueBerryBushConfigFeature).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.func_227446_a_(new FrequencyConfig(1))));
		biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(maloBerryBushConfigFeature).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.func_227446_a_(new FrequencyConfig(1))));
		biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(raspBerryBushConfigFeature).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.func_227446_a_(new FrequencyConfig(1))));
	}

	private static void addNatureOre(Biome biomeIn, BlockState Ore, CountRangeConfig range, int orecount) {
	      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Ore, orecount)).withPlacement(Placement.COUNT_RANGE.func_227446_a_(range)));
	}

	private static void addNetherOre(Biome biomeIn, BlockState Ore, CountRangeConfig range, int orecount) {
	   biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, Ore, orecount)).withPlacement(Placement.COUNT_RANGE.func_227446_a_(range)));
	}

	private static void addQuickSand(Biome biomeIn) {
		BlockStateFeatureConfig quickStandConfigFeature =  new BlockStateFeatureConfig(TechBlocks.quick_sand.get().getDefaultState());
		biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, QuickSandFeature.get().func_227250_b_(new BlockStateFeatureConfig(TechBlocks.quick_sand.get().getDefaultState()).func_227271_a_(Placement.LAVA_LAKE.func_227446_a_(new ChanceConfig(70))));
	    biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, QuickSandFeature.get().withConfiguration(quickStandConfigFeature).withPlacement(Placement.LAVA_LAKE.func_227446_a_(new ChanceConfig(60))));
	}

}
*/
