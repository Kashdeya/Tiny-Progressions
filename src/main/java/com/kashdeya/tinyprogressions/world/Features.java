package com.kashdeya.tinyprogressions.world;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

import static com.kashdeya.tinyprogressions.main.Reference.MOD_ID;

public class Features {
    public static ConfiguredFeature<?, ?> ENDERORE = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, TechBlocks.enderOre.getDefaultState(),
                    ConfigHandler.ender_ore_size))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            ConfigHandler.ender_ore_min,
                            0,
                            ConfigHandler.ender_ore_max)))
            .square().func_242731_b(ConfigHandler.ender_ore_frequency);

    public static void initModFeatures ()
    {
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "ore_ender"), ENDERORE);
    }
}
