package moe.lobster.anvilcraft_fooding.init;

import com.tterrag.registrate.util.entry.ItemEntry;
import moe.lobster.anvilcraft_fooding.data.ModCompostable;
import moe.lobster.anvilcraft_fooding.data.foodsystem.FoodTagBuilder;
import moe.lobster.anvilcraft_fooding.data.foodsystem.Tastes;
import moe.lobster.anvilcraft_fooding.init.data.ModFoods;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.Tags;

import static moe.lobster.anvilcraft_fooding.AnvilCraftFooding.REGISTRATE;

public class ModItems {
    static {
        REGISTRATE.defaultCreativeTab(ModItemGroups.ANVILCRAFT_FOODING.getKey());
    }

    public static final ItemEntry<? extends Item> CHILI = REGISTRATE
        .item("chili", p -> new Item(p.food(ModFoods.CHILI)))
        .properties(
            properties -> properties.component(
                DataComponents.CUSTOM_DATA,
                FoodTagBuilder.create()
                    .add(Tastes.SPICY.get(), 1)
                    .add(Tastes.VEGETABLE.get(), 1)
                    .toCustomData()
            )
        )
        .compostable(ModCompostable.FRUIT_CHANCE)
        .tag(Tags.Items.FOODS)
        .register();
    public static final ItemEntry<? extends Item> CHILI_JAM = REGISTRATE
        .item("chili_jam", p -> new Item(p.food(ModFoods.CHILI_JAM)))
        .properties(
            properties -> properties.component(
                DataComponents.CUSTOM_DATA,
                FoodTagBuilder.create()
                    .add(Tastes.SPICY.get(), 8)
                    .add(Tastes.JAM.get(), 1)
                    .toCustomData()
            )
        )
        .compostable(ModCompostable.FOOD_CHANCE)
        .tag(Tags.Items.FOODS)
        .register();

    public static final ItemEntry<? extends Item> LEMON = REGISTRATE
        .item("lemon", p -> new Item(p.food(ModFoods.LEMON)))
        .properties(
            properties -> properties.component(
                DataComponents.CUSTOM_DATA,
                FoodTagBuilder.create()
                    .add(Tastes.SOUR.get(), 1)
                    .add(Tastes.FRUIT.get(), 1)
                    .toCustomData()
            )
        )
        .compostable(ModCompostable.FRUIT_CHANCE)
        .tag(Tags.Items.FOODS)
        .register();

    public static void register() {

    }
}
