package com.retr0.createwasteland.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CREATE_WASTELAND = new CreativeModeTab("create_wastelandtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.URANIUM_CHUNK.get());
        }
    };
}
