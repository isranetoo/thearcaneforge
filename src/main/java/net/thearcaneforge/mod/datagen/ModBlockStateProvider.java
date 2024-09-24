package net.thearcaneforge.mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TheArcaneForge.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //ARCANE
        blockWithItem(ModBlocks.ARCANE_BLOCK);
        blockWithItem(ModBlocks.RAW_ARCANE_BLOCK);
        blockWithItem(ModBlocks.ARCANE_ORE);
        blockWithItem(ModBlocks.ARCANE_DEEPSLATE_ORE);

        //DECORATIVES
        stairsBlock(ModBlocks.ARCANE_STAIRS.get(), blockTexture(ModBlocks.ARCANE_BLOCK.get()));
        slabBlock(ModBlocks.ARCANE_SLAB.get(), blockTexture(ModBlocks.ARCANE_BLOCK.get()), blockTexture(ModBlocks.ARCANE_BLOCK.get()));

        buttonBlock(ModBlocks.ARCANE_BUTTON.get(), blockTexture(ModBlocks.ARCANE_BLOCK.get()));
        pressurePlateBlock(ModBlocks.ARCANE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ARCANE_BLOCK.get()));

        fenceBlock(ModBlocks.ARCANE_FENCE.get(), blockTexture(ModBlocks.ARCANE_BLOCK.get()));
        fenceGateBlock(ModBlocks.ARCANE_FENCE_GATE.get(), blockTexture(ModBlocks.ARCANE_BLOCK.get()));
        wallBlock(ModBlocks.ARCANE_WALL.get(), blockTexture(ModBlocks.ARCANE_BLOCK.get()));

        doorBlockWithRenderType(ModBlocks.ARCANE_DOOR.get(), modLoc("block/arcane_door_bottom"), modLoc("block/arcane_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.ARCANE_TRAPDOOR.get(), modLoc("block/arcane_trapdoor"), true, "cutout");

        blockItem(ModBlocks.ARCANE_STAIRS);
        blockItem(ModBlocks.ARCANE_SLAB);
        blockItem(ModBlocks.ARCANE_PRESSURE_PLATE);
        blockItem(ModBlocks.ARCANE_FENCE_GATE);
        blockItem(ModBlocks.ARCANE_TRAPDOOR, "_bottom");

        //GARNET
        blockWithItem(ModBlocks.PINK_GARNET_BLOCK);
        blockWithItem(ModBlocks.RAW_PINK_GARNET_BLOCK);
        blockWithItem(ModBlocks.PINK_GARNET_ORE);
        blockWithItem(ModBlocks.PINK_GARNET_DEESLATE_ORE);

        //BISMUTH
        blockWithItem(ModBlocks.BISMUTH_BLOCK);
        blockWithItem(ModBlocks.BISMUTH_ORE);
        blockWithItem(ModBlocks.BISMUTH_DEESLATE_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("tutorialmod:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("tutorialmod:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}
