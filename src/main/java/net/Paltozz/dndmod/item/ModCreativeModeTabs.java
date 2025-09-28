package net.Paltozz.dndmod.item;

import net.Paltozz.dndmod.DndMod;
import net.Paltozz.dndmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DndMod.MOD_ID);

    public static final Supplier<CreativeModeTab> MATERIALPLANE_TAB = CREATIVE_MODE_TAB.register("materialplane_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OWLBEAR_FEATHER.get()))
                    .title(Component.translatable("creativetab.dndmod.materialplane"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.OWLBEAR_FEATHER);
                        output.accept(ModItems.OWLBEAR_CLAW);

                    })

                    .build());
    public static final Supplier<CreativeModeTab> UNDERDARK_TAB = CREATIVE_MODE_TAB.register("underdark_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ADAMANT_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DndMod.MOD_ID, "materialplane_tab"))
                    .title(Component.translatable("creativetab.dndmod.underdark"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ADAMANT_ORE);
                        output.accept(ModBlocks.DEEPSLATE_ADAMANT_ORE);
                        output.accept(ModItems.RAW_ADAMANT);
                        output.accept(ModBlocks.RAW_ADAMANT_BLOCK);
                        output.accept(ModItems.ADAMANT_INGOT);
                        output.accept(ModBlocks.ADAMANT_BLOCK);


                    })

                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
