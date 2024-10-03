package net.thearcaneforge.mod.datagen;

import net.minecraft.resources.ResourceKey;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.block.ModBlocks;
import net.thearcaneforge.mod.item.ModITools;
import net.thearcaneforge.mod.item.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<ResourceKey<TrimMaterial>, Float>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

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

        //DECORATIVES

        //ARCANE
        buttonItem(ModBlocks.ARCANE_BUTTON, ModBlocks.ARCANE_BLOCK);
        fenceItem(ModBlocks.ARCANE_FENCE, ModBlocks.ARCANE_BLOCK);
        wallItem(ModBlocks.ARCANE_WALL, ModBlocks.ARCANE_BLOCK);

        simpleBlockItem(ModBlocks.ARCANE_DOOR);

        //GARNET
        buttonItem(ModBlocks.PINK_GARNET_BUTTON, ModBlocks.PINK_GARNET_BLOCK);
        fenceItem(ModBlocks.PINK_GARNET_FENCE, ModBlocks.PINK_GARNET_BLOCK);
        wallItem(ModBlocks.PINK_GARNET_WALL, ModBlocks.PINK_GARNET_BLOCK);

        simpleBlockItem(ModBlocks.PINK_GARNET_DOOR);

        //BISMUTH
        buttonItem(ModBlocks.BISMUTH_BUTTON, ModBlocks.BISMUTH_BLOCK);
        fenceItem(ModBlocks.BISMUTH_FENCE, ModBlocks.BISMUTH_BLOCK);
        wallItem(ModBlocks.BISMUTH_WALL, ModBlocks.BISMUTH_BLOCK);

        simpleBlockItem(ModBlocks.BISMUTH_DOOR);

        //TOOLS

        //ARCANE
        handheldItem(ModItems.ARCANE_SWORD);
        handheldItem(ModItems.ARCANE_PICKAXE);
        handheldItem(ModItems.ARCANE_SHOVEL);
        handheldItem(ModItems.ARCANE_AXE);
        handheldItem(ModItems.ARCANE_HOE);
        handheldItem(ModItems.ARCANE_HAMMER);

        trimmedArmorItem(ModItems.ARCANE_HELMET);
        trimmedArmorItem(ModItems.ARCANE_CHESTPLATE);
        trimmedArmorItem(ModItems.ARCANE_LEGGINGS);
        trimmedArmorItem(ModItems.ARCANE_BOOTS);

        //GARNET
        handheldItem(ModItems.PINK_GARNET_SWORD);
        handheldItem(ModItems.PINK_GARNET_PICKAXE);
        handheldItem(ModItems.PINK_GARNET_SHOVEL);
        handheldItem(ModItems.PINK_GARNET_AXE);
        handheldItem(ModItems.PINK_GARNET_HOE);
        handheldItem(ModItems.PINK_GARNET_HAMMER);

        trimmedArmorItem(ModItems.PINK_GARNET_HELMET);
        trimmedArmorItem(ModItems.PINK_GARNET_CHESTPLATE);
        trimmedArmorItem(ModItems.PINK_GARNET_LEGGINGS);
        trimmedArmorItem(ModItems.PINK_GARNET_BOOTS);

        //BISMUTH

        handheldItem(ModItems.BISMUTH_SWORD);
        handheldItem(ModItems.BISMUTH_PICKAXE);
        handheldItem(ModItems.BISMUTH_SHOVEL);
        handheldItem(ModItems.BISMUTH_AXE);
        handheldItem(ModItems.BISMUTH_HOE);
        handheldItem(ModItems.BISMUTH_HAMMER);

        trimmedArmorItem(ModItems.BISMUTH_HELMET);
        trimmedArmorItem(ModItems.BISMUTH_CHESTPLATE);
        trimmedArmorItem(ModItems.BISMUTH_LEGGINGS);
        trimmedArmorItem(ModItems.BISMUTH_BOOTS);
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = TheArcaneForge.MOD_ID;

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(TheArcaneForge.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(TheArcaneForge.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(TheArcaneForge.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(TheArcaneForge.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(TheArcaneForge.MOD_ID,"item/" + item.getId().getPath()));
    }
}
