package net.thearcaneforge.mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.block.ModBlocks;
import net.thearcaneforge.mod.block.custom.ModLampsBlock;

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

        //LAMP
        customLamp(ModBlocks.ARCANE_LAMP, "arcane_lamp_on", "arcane_lamp_off");
        customLamp(ModBlocks.PINK_GARNET_LAMP, "pink_garnet_lamp_on", "pink_garnet_lamp_off");
        customLamp(ModBlocks.BISMUTH_LAMP, "bismuth_lamp_on", "bismuth_lamp_off");

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

        //DECORATIVES

        stairsBlock(ModBlocks.PINK_GARNET_STAIRS.get(), blockTexture(ModBlocks.PINK_GARNET_BLOCK.get()));
        slabBlock(ModBlocks.PINK_GARNET_SLAB.get(), blockTexture(ModBlocks.PINK_GARNET_BLOCK.get()), blockTexture(ModBlocks.PINK_GARNET_BLOCK.get()));

        buttonBlock(ModBlocks.PINK_GARNET_BUTTON.get(), blockTexture(ModBlocks.PINK_GARNET_BLOCK.get()));
        pressurePlateBlock(ModBlocks.PINK_GARNET_PRESSURE_PLATE.get(), blockTexture(ModBlocks.PINK_GARNET_BLOCK.get()));

        fenceBlock(ModBlocks.PINK_GARNET_FENCE.get(), blockTexture(ModBlocks.PINK_GARNET_BLOCK.get()));
        fenceGateBlock(ModBlocks.PINK_GARNET_FENCE_GATE.get(), blockTexture(ModBlocks.PINK_GARNET_BLOCK.get()));
        wallBlock(ModBlocks.PINK_GARNET_WALL.get(), blockTexture(ModBlocks.PINK_GARNET_BLOCK.get()));

        doorBlockWithRenderType(ModBlocks.PINK_GARNET_DOOR.get(), modLoc("block/pink_garnet_door_bottom"), modLoc("block/pink_garnet_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.PINK_GARNET_TRAPDOOR.get(), modLoc("block/pink_garnet_trapdoor"), true, "cutout");

        blockItem(ModBlocks.PINK_GARNET_STAIRS);
        blockItem(ModBlocks.PINK_GARNET_SLAB);
        blockItem(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
        blockItem(ModBlocks.PINK_GARNET_FENCE_GATE);
        blockItem(ModBlocks.PINK_GARNET_TRAPDOOR, "_bottom");

        //BISMUTH
        blockWithItem(ModBlocks.BISMUTH_BLOCK);
        blockWithItem(ModBlocks.BISMUTH_ORE);
        blockWithItem(ModBlocks.BISMUTH_DEESLATE_ORE);

        //DECORATIVES

        stairsBlock(ModBlocks.BISMUTH_STAIRS.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        slabBlock(ModBlocks.BISMUTH_SLAB.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));

        buttonBlock(ModBlocks.BISMUTH_BUTTON.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        pressurePlateBlock(ModBlocks.BISMUTH_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));

        fenceBlock(ModBlocks.BISMUTH_FENCE.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        fenceGateBlock(ModBlocks.BISMUTH_FENCE_GATE.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        wallBlock(ModBlocks.BISMUTH_WALL.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));

        doorBlockWithRenderType(ModBlocks.BISMUTH_DOOR.get(), modLoc("block/bismuth_door_bottom"), modLoc("block/bismuth_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.BISMUTH_TRAPDOOR.get(), modLoc("block/bismuth_trapdoor"), true, "cutout");

        blockItem(ModBlocks.BISMUTH_STAIRS);
        blockItem(ModBlocks.BISMUTH_SLAB);
        blockItem(ModBlocks.BISMUTH_PRESSURE_PLATE);
        blockItem(ModBlocks.BISMUTH_FENCE_GATE);
        blockItem(ModBlocks.BISMUTH_TRAPDOOR, "_bottom");

        //SAPPHIRE
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.RAW_SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.SAPPHIRE_DEESLATE_ORE);
        blockWithItem(ModBlocks.SAPPHIRE_NETHER_ORE);


    }

    //LAMPS
    private void customLamp(RegistryObject<Block> lampBlock, String lampOnTexture, String lampOffTexture) {
        ResourceLocation onTextureLocation = modLoc("block/" + lampOnTexture);
        ResourceLocation offTextureLocation = modLoc("block/" + lampOffTexture);

        getVariantBuilder(lampBlock.get()).forAllStates(state -> {
            if (state.getValue(ModLampsBlock.CLICKED)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll(lampOnTexture, onTextureLocation))};
            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll(lampOffTexture, offTextureLocation))};
            }
        });

        simpleBlockItem(lampBlock.get(), models().cubeAll(lampOnTexture, onTextureLocation));
    }




    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("thearcaneforge:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("thearcaneforge:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}
