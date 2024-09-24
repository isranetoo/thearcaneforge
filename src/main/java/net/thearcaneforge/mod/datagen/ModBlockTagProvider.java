package net.thearcaneforge.mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider  extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TheArcaneForge.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)

                //ARCANE
                .add(ModBlocks.ARCANE_BLOCK.get())
                .add(ModBlocks.RAW_ARCANE_BLOCK.get())
                .add(ModBlocks.ARCANE_ORE.get())
                .add(ModBlocks.ARCANE_DEEPSLATE_ORE.get())

                //GARNET
                .add(ModBlocks.PINK_GARNET_BLOCK.get())
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK.get())
                .add(ModBlocks.PINK_GARNET_ORE.get())
                .add(ModBlocks.PINK_GARNET_DEESLATE_ORE.get())

                //BISMUTH
                .add(ModBlocks.BISMUTH_BLOCK.get())
                .add(ModBlocks.BISMUTH_ORE.get())
                .add(ModBlocks.BISMUTH_DEESLATE_ORE.get());

                //IRON TOOLS
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ARCANE_BLOCK.get())
                .add(ModBlocks.ARCANE_ORE.get())
                .add(ModBlocks.PINK_GARNET_BLOCK.get())
                .add(ModBlocks.PINK_GARNET_ORE.get())
                .add(ModBlocks.BISMUTH_BLOCK.get())
                .add(ModBlocks.BISMUTH_ORE.get());

                //DIAMONDS TOOLS
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ARCANE_DEEPSLATE_ORE.get())
                .add(ModBlocks.PINK_GARNET_DEESLATE_ORE.get())
                .add(ModBlocks.BISMUTH_DEESLATE_ORE.get());

        tag(BlockTags.FENCES).add(ModBlocks.ARCANE_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.ARCANE_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.ARCANE_WALL.get());
    }
}
