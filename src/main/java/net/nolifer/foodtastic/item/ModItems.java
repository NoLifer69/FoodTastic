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

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FoodTastic.MOD_ID, name), item);
    }

    public static void registerModItems(){

    }
}
