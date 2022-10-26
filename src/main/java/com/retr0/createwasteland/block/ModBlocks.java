package com.retr0.createwasteland.block;

import com.retr0.createwasteland.CreateWasteland;
import com.retr0.createwasteland.item.ModCreativeModeTab;
import com.retr0.createwasteland.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, CreateWasteland.MOD_ID);



    // Ore
    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CREATE_WASTELAND_ORE);

    public static final RegistryObject<Block> URANIUM_ORE_BLOCK = registerBlock("uranium_ore_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.CREATE_WASTELAND_ORE);


    // Blocks
    public static final RegistryObject<Block> IRRADIATED_STONE = registerBlock("irradiated_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CREATE_WASTELAND_BLOCKS);

    public static final RegistryObject<Block> IRRADIATED_COBBLESTONE = registerBlock("irradiated_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CREATE_WASTELAND_BLOCKS);

    public static final RegistryObject<Block> STEEL_CASING = registerBlock("steel_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CREATE_WASTELAND_BLOCKS);

    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CREATE_WASTELAND_BLOCKS);

    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CREATE_WASTELAND_BLOCKS);


    // Plants
    public static final RegistryObject<Block> GLOWING_FUNGUS = registerBlock("glowing_fungus",
            () -> new FlowerBlock(MobEffects.GLOWING, 12,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).lightLevel((state) -> 10)), ModCreativeModeTab.CREATE_WASTELAND_BLOCKS);

    public static final RegistryObject<Block> POTTED_GLOWING_FUNGUS = BLOCKS.register("potted_glowing_fungus",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.GLOWING_FUNGUS,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
