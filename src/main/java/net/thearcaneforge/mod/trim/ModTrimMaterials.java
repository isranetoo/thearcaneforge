package net.thearcaneforge.mod.trim;

import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.item.ModItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> ARCANE_GEMSTONE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(TheArcaneForge.MOD_ID, "arcane_gemstone"));

    public static final ResourceKey<TrimMaterial> PINK_GARNET =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(TheArcaneForge.MOD_ID, "pink_garnet"));

    public static final ResourceKey<TrimMaterial> BISMUTH_GEMSTONE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(TheArcaneForge.MOD_ID, "bismuth_gemstone"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, ARCANE_GEMSTONE, ModItems.ARCANE_GEMSTONE.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), 0.8F);
        register(context, PINK_GARNET, ModItems.PINK_GARNET.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), 1.0F);
        register(context, BISMUTH_GEMSTONE, ModItems.BISMUTH_GEMSTONE.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), 0.5F);
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
                                 Style style, float itemModelIndex) {
        TrimMaterial trimmaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex,
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style), Map.of());
        context.register(trimKey, trimmaterial);
    }
}