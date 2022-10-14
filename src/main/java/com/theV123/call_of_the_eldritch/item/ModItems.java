package com.theV123.call_of_the_eldritch.item;

import com.theV123.call_of_the_eldritch.CallOfTheEldritch;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CallOfTheEldritch.MOD_ID);

    public static final RegistryObject<Item> STAINEDSTEEL = ITEMS.register("stained_steel",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
