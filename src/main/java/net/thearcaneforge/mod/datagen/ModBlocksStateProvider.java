package net.thearcaneforge.mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.block.ModBlocks;

public class ModBlocksStateProvider extends BlockStateProvider {
    public ModBlocksStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TheArcaneForge.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //ARCANE
        blockWithItem(ModBlocks.ARCANE_BLOCK);
        blockWithItem(ModBlocks.RAW_ARCANE_BLOCK);
        blockWithItem(ModBlocks.ARCANE_ORE);
        blockWithItem(ModBlocks.ARCANE_DEEPSLATE_ORE);

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

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
