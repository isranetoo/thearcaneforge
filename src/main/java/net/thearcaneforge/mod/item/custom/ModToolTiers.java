package net.thearcaneforge.mod.item.custom;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.thearcaneforge.mod.item.ModItems;
import net.thearcaneforge.mod.util.ModTags;

public class ModToolTiers {

    public static Tier ARCANE = new ForgeTier(1500,5,3f,10,
            ModTags.Blocks.NEEDS_ARCANE_TOOL,() -> Ingredient.of(ModItems.ARCANE_GEMSTONE.get()),
            ModTags.Blocks.INCORRECT_FOR_ARCANE_TOOL);

    public static Tier PINK_GARNET = new ForgeTier(1400,4,3f,10,
            ModTags.Blocks.NEEDS_GARNET_TOOL,() -> Ingredient.of(ModItems.PINK_GARNET.get()),
            ModTags.Blocks.INCORRECT_FOR_GARNET_TOOL);

    public static Tier BISMUTH = new ForgeTier(1300,4,3f,10,
            ModTags.Blocks.NEEDS_BISMUTH_TOOL,() -> Ingredient.of(ModItems.BISMUTH_GEMSTONE.get()),
            ModTags.Blocks.INCORRECT_FOR_BISMUTH_TOOL);
}
