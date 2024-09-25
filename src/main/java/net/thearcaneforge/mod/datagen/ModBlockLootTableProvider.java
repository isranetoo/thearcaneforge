package net.thearcaneforge.mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.thearcaneforge.mod.block.ModBlocks;
import net.thearcaneforge.mod.item.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {

        //  --DROP IT SELF-- //

        //ARCANE
        dropSelf(ModBlocks.ARCANE_BLOCK.get());

        //DECORATIVES ARCANE

        dropSelf(ModBlocks.ARCANE_STAIRS.get());
        dropSelf(ModBlocks.ARCANE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.ARCANE_BUTTON.get());
        dropSelf(ModBlocks.ARCANE_FENCE.get());
        dropSelf(ModBlocks.ARCANE_FENCE_GATE.get());
        dropSelf(ModBlocks.ARCANE_WALL.get());
        dropSelf(ModBlocks.ARCANE_TRAPDOOR.get());

        this.add(ModBlocks.ARCANE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ARCANE_SLAB.get()));
        this.add(ModBlocks.ARCANE_DOOR.get(),
                block -> createDoorTable(ModBlocks.ARCANE_DOOR.get()));

        //DECORATIVES GARNET

        dropSelf(ModBlocks.PINK_GARNET_STAIRS.get());
        dropSelf(ModBlocks.PINK_GARNET_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.PINK_GARNET_BUTTON.get());
        dropSelf(ModBlocks.PINK_GARNET_FENCE.get());
        dropSelf(ModBlocks.PINK_GARNET_FENCE_GATE.get());
        dropSelf(ModBlocks.PINK_GARNET_WALL.get());
        dropSelf(ModBlocks.PINK_GARNET_TRAPDOOR.get());

        this.add(ModBlocks.PINK_GARNET_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PINK_GARNET_SLAB.get()));
        this.add(ModBlocks.PINK_GARNET_DOOR.get(),
                block -> createDoorTable(ModBlocks.PINK_GARNET_DOOR.get()));

        //DECORATIVES BISMUTH

        dropSelf(ModBlocks.BISMUTH_STAIRS.get());
        dropSelf(ModBlocks.BISMUTH_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BISMUTH_BUTTON.get());
        dropSelf(ModBlocks.BISMUTH_FENCE.get());
        dropSelf(ModBlocks.BISMUTH_FENCE_GATE.get());
        dropSelf(ModBlocks.BISMUTH_WALL.get());
        dropSelf(ModBlocks.BISMUTH_TRAPDOOR.get());

        this.add(ModBlocks.BISMUTH_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BISMUTH_SLAB.get()));
        this.add(ModBlocks.BISMUTH_DOOR.get(),
                block -> createDoorTable(ModBlocks.BISMUTH_DOOR.get()));

        //GARNET
        dropSelf(ModBlocks.PINK_GARNET_BLOCK.get());

        //BISMUTH
        dropSelf(ModBlocks.BISMUTH_BLOCK.get());


        // --ORES-- //

        //ARCANE ORES
        this.add(ModBlocks.ARCANE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ARCANE_ORE.get(), ModItems.RAW_ARCANE_ORE.get(),2,6));
        this.add(ModBlocks.ARCANE_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ARCANE_DEEPSLATE_ORE.get(), ModItems.RAW_ARCANE_ORE.get(),2,6));
        this.add(ModBlocks.RAW_ARCANE_BLOCK.get(),
                block -> createMultipleOreDrops(ModBlocks.RAW_ARCANE_BLOCK.get(), ModItems.RAW_ARCANE_ORE.get(),2,6));

        //GARNET ORES
        this.add(ModBlocks.PINK_GARNET_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.PINK_GARNET_ORE.get(), ModItems.RAW_PINK_GARNET.get(),2,6));
        this.add(ModBlocks.PINK_GARNET_DEESLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.PINK_GARNET_DEESLATE_ORE.get(), ModItems.RAW_PINK_GARNET.get(),2,6));
        this.add(ModBlocks.RAW_PINK_GARNET_BLOCK.get(),
                block -> createMultipleOreDrops(ModBlocks.RAW_PINK_GARNET_BLOCK.get(), ModItems.RAW_PINK_GARNET.get(),2,6));

        //BISMUTH ORES
        this.add(ModBlocks.BISMUTH_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.BISMUTH_ORE.get(), ModItems.RAW_BISMUTH.get(),2,6));
        this.add(ModBlocks.BISMUTH_DEESLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.BISMUTH_DEESLATE_ORE.get(), ModItems.RAW_BISMUTH.get(),2,6));

    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock, (LootPoolEntryContainer.Builder<?>)this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
