package com.retr0.createwasteland.item;

import com.retr0.createwasteland.CreateWasteland;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateWasteland.MOD_ID);

// Add Items Here
    public static final RegistryObject<Item> URANIUM_CHUNK = ITEMS.register("uranium_chunk",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND)));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND)));
    public static final RegistryObject<Item> CRUSHED_URANIUM_ORE = ITEMS.register("crushed_uranium_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND)));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND)));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
