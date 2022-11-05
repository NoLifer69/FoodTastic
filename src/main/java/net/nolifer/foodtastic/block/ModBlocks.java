package net.nolifer.foodtastic.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.nolifer.foodtastic.FoodTastic;
import net.nolifer.foodtastic.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block GREEN_GRAPE_BUSH = registerBlock("green_grape_bush",
            new FlowerBlock(StatusEffects.LUCK, 8,
                    FabricBlockSettings.copy(Blocks.DANDELION)), ItemGroup.DECORATIONS);

    public static final Block BLUE_GRAPE_BUSH = registerBlock("blue_grape_bush",
            new FlowerBlock(StatusEffects.LUCK, 8,
                    FabricBlockSettings.copy(Blocks.DANDELION)), ItemGroup.DECORATIONS);

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(FoodTastic.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(FoodTastic.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(FoodTastic.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

}