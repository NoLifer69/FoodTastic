package net.nolifer.foodtastic;

import net.fabricmc.api.ModInitializer;
import net.nolifer.foodtastic.item.ModItems;

public class FoodTastic implements ModInitializer {
	public static final String MOD_ID = "foodtastic";

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
