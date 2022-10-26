package com.retr0.createwasteland.item;

import com.retr0.createwasteland.CreateWasteland;
import com.retr0.createwasteland.item.custom.GasMaskItem;
import com.retr0.createwasteland.item.custom.GeigerCounterItem;
import com.retr0.createwasteland.sound.ModSounds;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
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

    // Uranium Items
    public static final RegistryObject<Item> URANIUM_CHUNK = ITEMS.register("uranium_chunk",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND_ORE)));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND_ORE)));
    public static final RegistryObject<Item> CRUSHED_URANIUM_ORE = ITEMS.register("crushed_uranium_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND_ORE)));

    // Lead Items
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND_ORE)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND_ORE)));
    public static final RegistryObject<Item> REINFORCED_LEAD_SANDPAPER = ITEMS.register("reinforced_lead_sandpaper",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND_ITEMS)));

    // Steel Items
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND_ORE)));
    public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND_ORE)));
    public static final RegistryObject<Item> CRUSHED_STEEL_INGOT = ITEMS.register("crushed_steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND_ORE)));
    public static final RegistryObject<Item> STEEL_SCREW = ITEMS.register("steel_screw",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND_ITEMS)));


    // Geiger Counter
    public static final RegistryObject<Item> GEIGER_COUNTER = ITEMS.register("geiger_counter",
            () -> new GeigerCounterItem(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND_TOOLS)));

    public static final RegistryObject<Item> GASMASK = ITEMS.register("gasmask",
            () -> new GasMaskItem(new Item.Properties().tab(ModCreativeModeTab.CREATE_WASTELAND_TOOLS)));

    public static final RegistryObject<ArmorItem> HAZMAT_HELMET = ITEMS.register("hazmat_helmet",
            () -> new ArmorItem(null, EquipmentSlot.HEAD, new Item.Properties()));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
