package net.thearcaneforge.mod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thearcaneforge.mod.block.ModBlocks;
import net.thearcaneforge.mod.item.ModCreativeModeTabs;
import net.thearcaneforge.mod.item.ModTools;
import net.thearcaneforge.mod.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TheArcaneForge.MOD_ID)
public class TheArcaneForge
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "thearcaneforge";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();


    public TheArcaneForge()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModTools.register(modEventBus);


        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModTools.ARCANE_CHISEL);
            event.accept(ModTools.GARNET_CHISEL);
            event.accept(ModTools.BISMUTH_CHISEL);

            event.accept(ModItems.ARCANE_PICKAXE);
            event.accept(ModItems.ARCANE_AXE);
            event.accept(ModItems.ARCANE_SHOVEL);
            event.accept(ModItems.ARCANE_HOE);
            event.accept(ModItems.ARCANE_HAMMER);

            event.accept(ModItems.PINK_GARNET_PICKAXE);
            event.accept(ModItems.PINK_GARNET_AXE);
            event.accept(ModItems.PINK_GARNET_SHOVEL);
            event.accept(ModItems.PINK_GARNET_HOE);
            event.accept(ModItems.PINK_GARNET_HAMMER);

            event.accept(ModItems.BISMUTH_PICKAXE);
            event.accept(ModItems.BISMUTH_AXE);
            event.accept(ModItems.BISMUTH_SHOVEL);
            event.accept(ModItems.BISMUTH_HOE);
            event.accept(ModItems.BISMUTH_HAMMER);

            event.accept(ModItems.SAPPHIRE_PICKAXE);
            event.accept(ModItems.SAPPHIRE_AXE);
            event.accept(ModItems.SAPPHIRE_SHOVEL);
            event.accept(ModItems.SAPPHIRE_HOE);
        }

        if (event.getTabKey() == CreativeModeTabs.COMBAT){

            //ARCANE
            event.accept(ModItems.ARCANE_SWORD);

            event.accept(ModItems.ARCANE_HELMET);
            event.accept(ModItems.ARCANE_CHESTPLATE);
            event.accept(ModItems.ARCANE_LEGGINGS);
            event.accept(ModItems.ARCANE_BOOTS);

            event.accept(ModItems.ARCANE_HORSE_ARMOR);

            //PINK GARNET
            event.accept(ModItems.PINK_GARNET_SWORD);

            event.accept(ModItems.PINK_GARNET_HELMET);
            event.accept(ModItems.PINK_GARNET_CHESTPLATE);
            event.accept(ModItems.PINK_GARNET_LEGGINGS);
            event.accept(ModItems.PINK_GARNET_BOOTS);

            event.accept(ModItems.PINK_GARNET_HORSE_ARMOR);

            //BISMUTH
            event.accept(ModItems.BISMUTH_SWORD);

            event.accept(ModItems.BISMUTH_HELMET);
            event.accept(ModItems.BISMUTH_CHESTPLATE);
            event.accept(ModItems.BISMUTH_LEGGINGS);
            event.accept(ModItems.BISMUTH_BOOTS);

            event.accept(ModItems.BISMUTH_HORSE_ARMOR);

            //SAPPHIRE
            event.accept(ModItems.SAPPHIRE_SWORD);

            event.accept(ModItems.SAPPHIRE_HELMET);
            event.accept(ModItems.SAPPHIRE_CHESTPLATE);
            event.accept(ModItems.SAPPHIRE_LEGGINGS);
            event.accept(ModItems.SAPPHIRE_BOOTS);


        }

        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ModItems.KOHLRABI);
            event.accept(ModItems.RADISH);
            event.accept(ModItems.CAULIFLOWER);
            event.accept(ModItems.STRAWBERRY);
        }

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS){

            //ARCANE
            event.accept(ModItems.ARCANE_GEMSTONE);
            event.accept(ModItems.RAW_ARCANE_ORE);
            //GARNET
            event.accept(ModItems.PINK_GARNET);
            event.accept(ModItems.RAW_PINK_GARNET);
            //BISMUTH
            event.accept(ModItems.BISMUTH_GEMSTONE);
            event.accept(ModItems.RAW_BISMUTH);
            //SAPPHIRE
            event.accept(ModItems.SAPPHIRE_GEMSTONE);
            event.accept(ModItems.RAW_SAPPHIRE);
            //FUEL
            event.accept(ModItems.ARCANE_ASHES);
            event.accept(ModItems.GARNET_ASHES);
            event.accept(ModItems.FROSTFIRE_ICE);
            event.accept(ModItems.PINE_CONE);

            //TRIMS
            event.accept(ModItems.KAUPEN_SMITHING_TEMPLATE);
        }

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS){

            //ARCANE
            event.accept(ModBlocks.ARCANE_LAMP);
            //GARNET
            event.accept(ModBlocks.PINK_GARNET_LAMP);
            //BISMUTH
            event.accept(ModBlocks.BISMUTH_LAMP);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){

            event.accept(ModBlocks.ARCANE_BLOCK);
            event.accept(ModBlocks.PINK_GARNET_BLOCK);
            event.accept(ModBlocks.BISMUTH_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);

            //DECORATIVES

            //ARCANE
            event.accept(ModBlocks.ARCANE_STAIRS);
            event.accept(ModBlocks.ARCANE_SLAB);
            event.accept(ModBlocks.ARCANE_PRESSURE_PLATE);
            event.accept(ModBlocks.ARCANE_BUTTON);
            event.accept(ModBlocks.ARCANE_FENCE);
            event.accept(ModBlocks.ARCANE_FENCE_GATE);
            event.accept(ModBlocks.ARCANE_WALL);
            event.accept(ModBlocks.ARCANE_DOOR);
            event.accept(ModBlocks.ARCANE_TRAPDOOR);

            //GARNET
            event.accept(ModBlocks.PINK_GARNET_STAIRS);
            event.accept(ModBlocks.PINK_GARNET_SLAB);
            event.accept(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
            event.accept(ModBlocks.PINK_GARNET_BUTTON);
            event.accept(ModBlocks.PINK_GARNET_FENCE);
            event.accept(ModBlocks.PINK_GARNET_FENCE_GATE);
            event.accept(ModBlocks.PINK_GARNET_WALL);
            event.accept(ModBlocks.PINK_GARNET_DOOR);
            event.accept(ModBlocks.PINK_GARNET_TRAPDOOR);

            //BISMUTH
            event.accept(ModBlocks.BISMUTH_STAIRS);
            event.accept(ModBlocks.BISMUTH_SLAB);
            event.accept(ModBlocks.BISMUTH_PRESSURE_PLATE);
            event.accept(ModBlocks.BISMUTH_BUTTON);
            event.accept(ModBlocks.BISMUTH_FENCE);
            event.accept(ModBlocks.BISMUTH_FENCE_GATE);
            event.accept(ModBlocks.BISMUTH_WALL);
            event.accept(ModBlocks.BISMUTH_DOOR);
            event.accept(ModBlocks.BISMUTH_TRAPDOOR);

            //SAPPHIRE
            event.accept(ModBlocks.SAPPHIRE_STAIRS);
            event.accept(ModBlocks.SAPPHIRE_SLAB);
            event.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
            event.accept(ModBlocks.SAPPHIRE_BUTTON);
            event.accept(ModBlocks.SAPPHIRE_FENCE);
            event.accept(ModBlocks.SAPPHIRE_FENCE_GATE);
            event.accept(ModBlocks.SAPPHIRE_WALL);
            event.accept(ModBlocks.SAPPHIRE_DOOR);
            event.accept(ModBlocks.SAPPHIRE_TRAPDOOR);



        }

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS){

            //ARCANE
            event.accept(ModBlocks.RAW_ARCANE_BLOCK);
            event.accept(ModBlocks.ARCANE_ORE);
            event.accept(ModBlocks.ARCANE_DEEPSLATE_ORE);

            //GARNET
            event.accept(ModBlocks.RAW_PINK_GARNET_BLOCK);
            event.accept(ModBlocks.PINK_GARNET_ORE);
            event.accept(ModBlocks.PINK_GARNET_DEESLATE_ORE);

            //BISMUTH
            event.accept(ModBlocks.BISMUTH_ORE);
            event.accept(ModBlocks.BISMUTH_DEESLATE_ORE);

            //SAPPHIRE

            event.accept(ModBlocks.RAW_SAPPHIRE_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_ORE);
            event.accept(ModBlocks.SAPPHIRE_DEESLATE_ORE);
            event.accept(ModBlocks.SAPPHIRE_NETHER_ORE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event){

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
