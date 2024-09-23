package net.thearcaneforge.mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.item.ModITools;
import net.thearcaneforge.mod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheArcaneForge.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //ARCANE
        basicItem(ModItems.ARCANE_GEMSTONE.get());
        basicItem(ModItems.RAW_ARCANE_ORE.get());

        //GARNET
        basicItem(ModItems.PINK_GARNET.get());
        basicItem(ModItems.RAW_PINK_GARNET.get());

        //BISMUTH
        basicItem(ModItems.BISMUTH_GEMSTONE.get());
        basicItem(ModItems.RAW_BISMUTH.get());

        //CHISELS
        basicItem(ModITools.ARCANE_CHISEL.get());
        basicItem(ModITools.GARNET_CHISEL.get());
        basicItem(ModITools.BISMUTH_CHISEL.get());

        //FOOD
        basicItem(ModItems.KOHLRABI.get());
        basicItem(ModItems.RADISH.get());
        basicItem(ModItems.CAULIFLOWER.get());

        //FUEL
        basicItem(ModItems.ARCANE_ASHES.get());
        basicItem(ModItems.GARNET_ASHES.get());
        basicItem(ModItems.FROSTFIRE_ICE.get());


    }
}
