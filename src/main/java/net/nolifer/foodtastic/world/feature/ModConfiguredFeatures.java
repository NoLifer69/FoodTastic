package net.nolifer.foodtastic.world.feature;

import net.nolifer.foodtastic.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> BLUE_GRAPE_BUSH =
            ConfiguredFeatures.register("flower_blue_grape_bushs", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_GRAPE_BUSH)))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GREEN_GRAPE_BUSH =
            ConfiguredFeatures.register("flower_green_grape_bush", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GREEN_GRAPE_BUSH)))));
}

