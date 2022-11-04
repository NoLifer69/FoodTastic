package net.nolifer.foodtastic.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent HAMBURGER = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.6F).meat().build();
}
