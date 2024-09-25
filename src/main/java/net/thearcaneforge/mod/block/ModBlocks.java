package net.thearcaneforge.mod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    // ARCANE

    public  static  final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TheArcaneForge.MOD_ID);

    public static final RegistryObject<Block> ARCANE_BLOCK = registerBlock("arcane_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> RAW_ARCANE_BLOCK = registerBlock("raw_arcane_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> ARCANE_ORE = registerBlock("arcane_ore",
            () -> new DropExperienceBlock(UniformInt.of(2,4),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> ARCANE_DEEPSLATE_ORE = registerBlock("arcane_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(3,6),BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    //GARNET

    public static final RegistryObject<Block> PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            () -> new DropExperienceBlock(UniformInt.of(3,6),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> PINK_GARNET_DEESLATE_ORE = registerBlock("pink_garnet_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(3,6), BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    //BISMUTH
    public static final RegistryObject<Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> BISMUTH_ORE = registerBlock("bismuth_ore",
            () -> new DropExperienceBlock(UniformInt.of(3,6),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> BISMUTH_DEESLATE_ORE = registerBlock("bismuth_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(3,6), BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));


        //NON BLOCKS

    //ARCANE
    public static final RegistryObject<StairBlock> ARCANE_STAIRS = registerBlock("arcane_stairs",
            () -> new StairBlock(ModBlocks.ARCANE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> ARCANE_SLAB = registerBlock("arcane_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> ARCANE_PRESSURE_PLATE = registerBlock("arcane_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> ARCANE_BUTTON = registerBlock("arcane_button",
            () -> new ButtonBlock(BlockSetType.IRON,1, BlockBehaviour.Properties.of().strength(3f)
                    .requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> ARCANE_FENCE = registerBlock("arcane_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> ARCANE_FENCE_GATE = registerBlock("arcane_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> ARCANE_WALL = registerBlock("arcane_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> ARCANE_DOOR = registerBlock("arcane_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> ARCANE_TRAPDOOR = registerBlock("arcane_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    //GARNET
    public static final RegistryObject<StairBlock> PINK_GARNET_STAIRS = registerBlock("pink_garnet_stairs",
            () -> new StairBlock(ModBlocks.PINK_GARNET_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> PINK_GARNET_SLAB = registerBlock("pink_garnet_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> PINK_GARNET_PRESSURE_PLATE = registerBlock("pink_garnet_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> PINK_GARNET_BUTTON = registerBlock("pink_garnet_button",
            () -> new ButtonBlock(BlockSetType.IRON,1, BlockBehaviour.Properties.of().strength(3f)
                    .requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> PINK_GARNET_FENCE = registerBlock("pink_garnet_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> PINK_GARNET_FENCE_GATE = registerBlock("pink_garnet_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> PINK_GARNET_WALL = registerBlock("pink_garnet_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> PINK_GARNET_DOOR = registerBlock("pink_garnet_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> PINK_GARNET_TRAPDOOR = registerBlock("pink_garnet_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));



    private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        regiterBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends  Block> void regiterBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void  register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
