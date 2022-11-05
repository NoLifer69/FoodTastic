package net.nolifer.foodtastic;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.nolifer.foodtastic.block.ModBlocks;
import net.nolifer.foodtastic.item.ModItems;

public class FoodTasticClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_GRAPE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_GRAPE_BUSH, RenderLayer.getCutout());

        ModItems.registerModItems();
    }
}
