package net.nolifer.foodtastic;

import net.fabricmc.api.ClientModInitializer;
import net.nolifer.foodtastic.item.ModItems;

public class FoodTasticClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModItems.registerModItems();
    }
}
