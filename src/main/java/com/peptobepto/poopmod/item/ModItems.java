package com.peptobepto.poopmod.item;

import com.peptobepto.poopmod.PoopMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PoopMod.MODID);

    public static final DeferredItem<Item> POOP = ITEMS.register("poop",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GREEG = ITEMS.register("greeg",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> JAKOB = ITEMS.register("jakob",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BOKAJ = ITEMS.register("bokaj",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
