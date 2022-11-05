package net.nolifer.foodtastic.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nolifer.foodtastic.FoodTastic;

public class ModItems {

    public static final Item HAMBURGER = registerItem("hamburger",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.HAMBURGER)));

    public static final Item ORANGE = registerItem("orange",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.ORANGE)));

    public static final Item BANANA = registerItem("banana",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BANANA)));

    public static final Item BLUE_GRAPES = registerItem("blue_grapes",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BLUE_GRAPES)));

    public static final Item GREEN_GRAPES = registerItem("green_grapes",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.GREEN_GRAPES)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FoodTastic.MOD_ID, name), item);
    }

    public static void registerModItems(){

    }
}
