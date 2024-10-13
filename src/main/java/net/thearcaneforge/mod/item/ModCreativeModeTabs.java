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

    public static final RegistryObject<CreativeModeTab> ARCANE_TOOLS_UTILS_TAB = CREATIVE_MODE_TABS.register("arcane_tools_utils_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModITools.ARCANE_CHISEL.get()))
                    .title(Component.translatable("creativetab.thearcaneforge.arcane_tools_utils_tab"))
                    .displayItems((itemDisplayParameters,output) -> {
                        output.accept(ModITools.ARCANE_CHISEL.get());
                        output.accept(ModITools.GARNET_CHISEL.get());
                        output.accept(ModITools.BISMUTH_CHISEL.get());

                        //ARCANE
                        output.accept(ModItems.ARCANE_PICKAXE.get());
                        output.accept(ModItems.ARCANE_SHOVEL.get());
                        output.accept(ModItems.ARCANE_AXE.get());
                        output.accept(ModItems.ARCANE_HOE.get());
                        output.accept(ModItems.ARCANE_HAMMER.get());
                        //GARNET
                        output.accept(ModItems.PINK_GARNET_PICKAXE.get());
                        output.accept(ModItems.PINK_GARNET_SHOVEL.get());
                        output.accept(ModItems.PINK_GARNET_AXE.get());
                        output.accept(ModItems.PINK_GARNET_HOE.get());
                        output.accept(ModItems.PINK_GARNET_HAMMER.get());

                        //BISMUTH
                        output.accept(ModItems.BISMUTH_PICKAXE.get());
                        output.accept(ModItems.BISMUTH_SHOVEL.get());
                        output.accept(ModItems.BISMUTH_AXE.get());
                        output.accept(ModItems.BISMUTH_HOE.get());
                        output.accept(ModItems.BISMUTH_HAMMER.get());

                        //SAPPHIRE
                        output.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        output.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        output.accept(ModItems.SAPPHIRE_AXE.get());
                        output.accept(ModItems.SAPPHIRE_HOE.get());



                    }).build());



    public static final RegistryObject<CreativeModeTab> ARCANE_COMBAT_TAB = CREATIVE_MODE_TABS.register("arcane_combat_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ARCANE_SWORD.get()))
                    .withTabsBefore(ARCANE_TOOLS_UTILS_TAB.getId())
                    .title(Component.translatable("creativetab.thearcaneforge.arcane_combat_tab"))
                    .displayItems((itemDisplayParameters,output) -> {

                        //ARCANE
                        output.accept(ModItems.ARCANE_SWORD.get());

                        output.accept(ModItems.ARCANE_HELMET.get());
                        output.accept(ModItems.ARCANE_CHESTPLATE.get());
                        output.accept(ModItems.ARCANE_LEGGINGS.get());
                        output.accept(ModItems.ARCANE_BOOTS.get());

                        output.accept(ModItems.ARCANE_HORSE_ARMOR.get());


                        //GARNET
                        output.accept(ModItems.PINK_GARNET_SWORD.get());

                        output.accept(ModItems.PINK_GARNET_HELMET.get());
                        output.accept(ModItems.PINK_GARNET_CHESTPLATE.get());
                        output.accept(ModItems.PINK_GARNET_LEGGINGS.get());
                        output.accept(ModItems.PINK_GARNET_BOOTS.get());

                        output.accept(ModItems.PINK_GARNET_HORSE_ARMOR.get());

                        //BISMUTH
                        output.accept(ModItems.BISMUTH_SWORD.get());

                        output.accept(ModItems.BISMUTH_HELMET.get());
                        output.accept(ModItems.BISMUTH_CHESTPLATE.get());
                        output.accept(ModItems.BISMUTH_LEGGINGS.get());
                        output.accept(ModItems.BISMUTH_BOOTS.get());

                        output.accept(ModItems.BISMUTH_HORSE_ARMOR.get());

                        //SAPPHIRE
                        output.accept(ModItems.SAPPHIRE_SWORD.get());

                        output.accept(ModItems.SAPPHIRE_HELMET.get());
                        output.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        output.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        output.accept(ModItems.SAPPHIRE_BOOTS.get());

                        //TRIMS
                        output.accept(ModItems.KAUPEN_SMITHING_TEMPLATE.get());


                    }).build());



    public static final RegistryObject<CreativeModeTab> ARCANE_ITEMS_TAB = CREATIVE_MODE_TABS.register("arcane_item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ARCANE_GEMSTONE.get()))
                    .withTabsBefore(ARCANE_COMBAT_TAB.getId())
                    .title(Component.translatable("creativetab.thearcaneforge.arcane_gemstone_items"))
                    .displayItems((itemDisplayParameters,output) -> {

                        //ARCANE
                        output.accept(ModItems.ARCANE_GEMSTONE.get());
                        output.accept(ModItems.RAW_ARCANE_ORE.get());

                        //GARNET
                        output.accept(ModItems.PINK_GARNET.get());
                        output.accept(ModItems.RAW_PINK_GARNET.get());

                        //BISMUTH
                        output.accept(ModItems.BISMUTH_GEMSTONE.get());
                        output.accept(ModItems.RAW_BISMUTH.get());

                        //SAPPHIRE
                        output.accept(ModItems.SAPPHIRE_GEMSTONE.get());
                        output.accept(ModItems.RAW_SAPPHIRE.get());

                        //FUEL
                        output.accept(ModItems.ARCANE_ASHES.get());
                        output.accept(ModItems.GARNET_ASHES.get());
                        output.accept(ModItems.FROSTFIRE_ICE.get());
                        output.accept(ModItems.PINE_CONE.get());

                    }).build());



    public static final RegistryObject<CreativeModeTab> ARCANE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("arcane_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ARCANE_BLOCK.get()))
                    .withTabsBefore(ARCANE_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.thearcaneforge.arcane_gemstone_blocks"))
                    .displayItems((itemDisplayParameters,output) -> {

                        //ARCANE
                        output.accept(ModBlocks.ARCANE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ARCANE_BLOCK.get());
                        output.accept(ModBlocks.ARCANE_ORE.get());
                        output.accept(ModBlocks.ARCANE_DEEPSLATE_ORE.get());

                        //GARNET
                        output.accept(ModBlocks.PINK_GARNET_BLOCK.get());
                        output.accept(ModBlocks.RAW_PINK_GARNET_BLOCK.get());
                        output.accept(ModBlocks.PINK_GARNET_ORE.get());
                        output.accept(ModBlocks.PINK_GARNET_DEESLATE_ORE.get());

                        //BISMUTH
                        output.accept(ModBlocks.BISMUTH_BLOCK.get());
                        output.accept(ModBlocks.BISMUTH_ORE.get());
                        output.accept(ModBlocks.BISMUTH_DEESLATE_ORE.get());

                        //SAPPHIRE
                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.SAPPHIRE_DEESLATE_ORE.get());
                        output.accept(ModBlocks.SAPPHIRE_NETHER_ORE.get());


                    }).build());




    public static final RegistryObject<CreativeModeTab> ARCANE_FOOD_TAB = CREATIVE_MODE_TABS.register("arcane_food_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KOHLRABI.get()))
                    .withTabsBefore(ARCANE_BLOCKS_TAB.getId())
                    .title(Component.translatable("creativetab.thearcaneforge.arcane_food_tab"))
                    .displayItems((itemDisplayParameters,output) -> {

                        output.accept(ModItems.KOHLRABI.get());
                        output.accept(ModItems.RADISH.get());
                        output.accept(ModItems.CAULIFLOWER.get());
                        output.accept(ModItems.STRAWBERRY.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> ARCANE_DECORATIVES_TAB = CREATIVE_MODE_TABS.register("arcane_decoratives_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ARCANE_STAIRS.get()))
                    .withTabsBefore(ARCANE_FOOD_TAB.getId())
                    .title(Component.translatable("creativetab.thearcaneforge.arcane_decoratives_tab"))
                    .displayItems((itemDisplayParameters,output) -> {

                        //ARCANE
                        output.accept(ModBlocks.ARCANE_STAIRS.get());
                        output.accept(ModBlocks.ARCANE_SLAB.get());
                        output.accept(ModBlocks.ARCANE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.ARCANE_BUTTON.get());
                        output.accept(ModBlocks.ARCANE_FENCE.get());
                        output.accept(ModBlocks.ARCANE_FENCE_GATE.get());
                        output.accept(ModBlocks.ARCANE_WALL.get());
                        output.accept(ModBlocks.ARCANE_DOOR.get());
                        output.accept(ModBlocks.ARCANE_TRAPDOOR.get());
                        output.accept(ModBlocks.ARCANE_LAMP.get());

                        //GARNET
                        output.accept(ModBlocks.PINK_GARNET_STAIRS.get());
                        output.accept(ModBlocks.PINK_GARNET_SLAB.get());
                        output.accept(ModBlocks.PINK_GARNET_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.PINK_GARNET_BUTTON.get());
                        output.accept(ModBlocks.PINK_GARNET_FENCE.get());
                        output.accept(ModBlocks.PINK_GARNET_FENCE_GATE.get());
                        output.accept(ModBlocks.PINK_GARNET_WALL.get());
                        output.accept(ModBlocks.PINK_GARNET_DOOR.get());
                        output.accept(ModBlocks.PINK_GARNET_TRAPDOOR.get());
                        output.accept(ModBlocks.PINK_GARNET_LAMP.get());

                        //BISMUTH
                        output.accept(ModBlocks.BISMUTH_STAIRS.get());
                        output.accept(ModBlocks.BISMUTH_SLAB.get());
                        output.accept(ModBlocks.BISMUTH_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.BISMUTH_BUTTON.get());
                        output.accept(ModBlocks.BISMUTH_FENCE.get());
                        output.accept(ModBlocks.BISMUTH_FENCE_GATE.get());
                        output.accept(ModBlocks.BISMUTH_WALL.get());
                        output.accept(ModBlocks.BISMUTH_DOOR.get());
                        output.accept(ModBlocks.BISMUTH_TRAPDOOR.get());
                        output.accept(ModBlocks.BISMUTH_LAMP.get());

                        //SAPPHIRE
                        output.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        output.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        output.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        output.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        output.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        output.accept(ModBlocks.SAPPHIRE_WALL.get());
                        output.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        output.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());



                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
