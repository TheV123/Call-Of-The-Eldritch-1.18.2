package com.theV123.call_of_the_eldritch.block;

import com.theV123.call_of_the_eldritch.CallOfTheEldritch;
import com.theV123.call_of_the_eldritch.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CallOfTheEldritch.MOD_ID);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                    CreativeModeTab tab){
        RegistryObject<T> returned = BLOCKS.register(name, block);
        registerBlockItem(name, returned, tab);
        return returned;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
