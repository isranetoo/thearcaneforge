package net.thearcaneforge.mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheArcaneForge.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ARCANE_TOOLS_TAB = CREATIVE_MODE_TABS.register("arcane_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModITools.CHISEL.get()))
                    .title(Component.translatable("creativetab.thearcaneforge.arcane_tools_tab"))
                    .displayItems((itemDisplayParameters,output) -> {
                        output.accept(ModITools.CHISEL.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> ARCANE_ITEMS_TAB = CREATIVE_MODE_TABS.register("arcane_item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ARCANE_GEMSTONE.get()))
                    .title(Component.translatable("creativetab.thearcaneforge.arcane_gemstone_items"))
                    .displayItems((itemDisplayParameters,output) -> {
                        output.accept(ModItems.ARCANE_GEMSTONE.get());
                        output.accept(ModItems.RAW_ARCANE_ORE.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> ARCANE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("arcane_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ARCANE_BLOCK.get()))
                    .withTabsBefore(ARCANE_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.thearcaneforge.arcane_gemstone_blocks"))
                    .displayItems((itemDisplayParameters,output) -> {
                        output.accept(ModBlocks.ARCANE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ARCANE_BLOCK.get());
                        output.accept(ModBlocks.ARCANE_ORE.get());
                        output.accept(ModBlocks.ARCANE_DEEPSLATE_ORE.get());

                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
