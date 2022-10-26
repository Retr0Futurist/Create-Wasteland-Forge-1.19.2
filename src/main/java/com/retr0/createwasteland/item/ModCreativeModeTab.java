package com.retr0.createwasteland.item;

import com.retr0.createwasteland.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CREATE_WASTELAND_ORE = new CreativeModeTab("create_wasteland_oretab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.URANIUM_CHUNK.get());
        }
    };
        public static final CreativeModeTab CREATE_WASTELAND_BLOCKS = new CreativeModeTab("create_wasteland_blockstab") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModBlocks.IRRADIATED_STONE.get());
            }
        };
    public static final CreativeModeTab CREATE_WASTELAND_TOOLS = new CreativeModeTab("create_wasteland_toolstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GEIGER_COUNTER.get());
        }
    };
    public static final CreativeModeTab CREATE_WASTELAND_ITEMS = new CreativeModeTab("create_wasteland_itemstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STEEL_SCREW.get());
        }
    };
    }
