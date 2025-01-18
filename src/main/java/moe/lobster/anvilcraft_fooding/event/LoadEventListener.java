package moe.lobster.anvilcraft_fooding.event;

import moe.lobster.anvilcraft_fooding.AnvilCraftFooding;
import moe.lobster.anvilcraft_fooding.init.ModFoodTags;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;

@EventBusSubscriber(modid = AnvilCraftFooding.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class LoadEventListener {
    @SubscribeEvent
    public static void onFMLLoadComplete(FMLLoadCompleteEvent event) {
        ModFoodTags.register();
    }
}
