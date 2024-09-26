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
import net.thearcaneforge.mod.item.ModITools;
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
        ModITools.register(modEventBus);


        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModITools.ARCANE_CHISEL);
            event.accept(ModITools.GARNET_CHISEL);
            event.accept(ModITools.BISMUTH_CHISEL);

            event.accept(ModItems.ARCANE_PICKAXE);
            event.accept(ModItems.ARCANE_AXE);
            event.accept(ModItems.ARCANE_SHOVEL);
            event.accept(ModItems.ARCANE_HOE);
        }

        if (event.getTabKey() == CreativeModeTabs.COMBAT){

            event.accept(ModItems.ARCANE_SWORD);

        }

        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ModItems.KOHLRABI);
            event.accept(ModItems.RADISH);
            event.accept(ModItems.CAULIFLOWER);
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
            //FUEL
            event.accept(ModItems.ARCANE_ASHES);
            event.accept(ModItems.GARNET_ASHES);
            event.accept(ModItems.FROSTFIRE_ICE);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){

            event.accept(ModBlocks.ARCANE_BLOCK);
            event.accept(ModBlocks.PINK_GARNET_BLOCK);
            event.accept(ModBlocks.BISMUTH_BLOCK);

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
