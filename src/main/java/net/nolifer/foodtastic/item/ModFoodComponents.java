package net.nolifer.foodtastic.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent HAMBURGER = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.6F).meat().build();
    public static final FoodComponent ORANGE = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.3F).meat().build();
    public static final FoodComponent BANANA = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.1F).meat().build();
    public static final FoodComponent BLUE_GRAPES = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.2F).meat().build();
    public static final FoodComponent GREEN_GRAPES = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.2F).meat().build();
}
