package net.Paltozz.dndmod.item;

import net.Paltozz.dndmod.DndMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DndMod.MOD_ID);

    public static final DeferredItem<Item> OWLBEAR_FEATHER = ITEMS.register("owlbear_feather",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> OWLBEAR_CLAW = ITEMS.register("owlbear_claw",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_ADAMANT = ITEMS.register("raw_adamant",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ADAMANT_INGOT = ITEMS.register("adamant_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
