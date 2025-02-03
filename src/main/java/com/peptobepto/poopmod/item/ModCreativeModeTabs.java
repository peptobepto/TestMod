package com.peptobepto.poopmod.item;

import com.mojang.brigadier.LiteralMessage;
import com.peptobepto.poopmod.PoopMod;
import com.peptobepto.poopmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PoopMod.MODID);


    public static final Supplier<CreativeModeTab> EVILITEMS = CREATIVE_MODE_TAB.register("evil_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GREEG.get()))
                    .title(Component.translatable("creativetab.poopmod.evil_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GREEG);
                        output.accept(ModItems.BOKAJ);
                        output.accept(ModItems.POOP);
                        output.accept(ModItems.JAKOB);
                    }).build());

        public static final Supplier<CreativeModeTab> EVILBLOCKS = CREATIVE_MODE_TAB.register("evil_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GREEBLE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(PoopMod.MODID, "evil_items"))
                    .title(Component.translatable("creativetab.poopmod.evil_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.GREEBLE);
                        output.accept(ModBlocks.POOP_BLOCK);
                        output.accept(ModBlocks.RAH);
                        output.accept(ModBlocks.BIGJAKOB);
                    }).build());

    public static void register(IEventBus EventBus) {
        CREATIVE_MODE_TAB.register(EventBus);
    }
}
