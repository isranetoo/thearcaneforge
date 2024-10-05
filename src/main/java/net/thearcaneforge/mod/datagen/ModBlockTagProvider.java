package net.thearcaneforge.mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.block.ModBlocks;
import net.thearcaneforge.mod.util.ModTags;
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
                .add(ModBlocks.BISMUTH_DEESLATE_ORE.get())

                //SAPPHIRE
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.SAPPHIRE_DEESLATE_ORE.get())
                .add(ModBlocks.SAPPHIRE_NETHER_ORE.get());

                //IRON TOOLS
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ARCANE_BLOCK.get())
                .add(ModBlocks.ARCANE_ORE.get())
                .add(ModBlocks.PINK_GARNET_BLOCK.get())
                .add(ModBlocks.PINK_GARNET_ORE.get())
                .add(ModBlocks.BISMUTH_BLOCK.get())
                .add(ModBlocks.BISMUTH_ORE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_ORE.get());

                //DIAMONDS TOOLS
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ARCANE_DEEPSLATE_ORE.get())
                .add(ModBlocks.PINK_GARNET_DEESLATE_ORE.get())
                .add(ModBlocks.BISMUTH_DEESLATE_ORE.get())
                .add(ModBlocks.SAPPHIRE_DEESLATE_ORE.get())
                .add(ModBlocks.SAPPHIRE_NETHER_ORE.get());

        //DECORATIVES

        //ARCANE
        tag(BlockTags.FENCES).add(ModBlocks.ARCANE_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.ARCANE_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.ARCANE_WALL.get());

        //GARNET
        tag(BlockTags.FENCES).add(ModBlocks.PINK_GARNET_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.PINK_GARNET_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.PINK_GARNET_WALL.get());

        //BISMUTH
        tag(BlockTags.FENCES).add(ModBlocks.BISMUTH_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.BISMUTH_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.BISMUTH_WALL.get());

        //SAPPHIRE
        tag(BlockTags.FENCES).add(ModBlocks.SAPPHIRE_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.SAPPHIRE_WALL.get());

        //TOOLS

        //ARCANE
        tag(ModTags.Blocks.NEEDS_ARCANE_TOOL)
                .add(ModBlocks.RAW_ARCANE_BLOCK.get())
                .addTag(BlockTags.NEEDS_IRON_TOOL)
                .add(Blocks.OBSIDIAN);

        tag(ModTags.Blocks.INCORRECT_FOR_ARCANE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_ARCANE_TOOL);

        //GARNET
        tag(ModTags.Blocks.NEEDS_GARNET_TOOL)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK.get())
                .addTag(BlockTags.NEEDS_IRON_TOOL)
                .add(Blocks.OBSIDIAN);

        tag(ModTags.Blocks.INCORRECT_FOR_GARNET_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_GARNET_TOOL);

        //BISMUTH
        tag(ModTags.Blocks.NEEDS_BISMUTH_TOOL)
                .add(ModBlocks.BISMUTH_ORE.get())
                .addTag(BlockTags.NEEDS_IRON_TOOL)
                .add(Blocks.OBSIDIAN);

        tag(ModTags.Blocks.INCORRECT_FOR_BISMUTH_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_BISMUTH_TOOL);

        //SAPPHIRE
        tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .addTag(BlockTags.NEEDS_IRON_TOOL)
                .add(Blocks.OBSIDIAN);

        tag(ModTags.Blocks.INCORRECT_FOR_SAPPHIRE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL);



    }
}
