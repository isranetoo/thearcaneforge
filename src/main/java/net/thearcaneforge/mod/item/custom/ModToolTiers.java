package net.thearcaneforge.mod.item.custom;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.thearcaneforge.mod.item.ModItems;
import net.thearcaneforge.mod.util.ModTags;

public class ModToolTiers {

    public static Tier ARCANE = new ForgeTier(1400,4,3f,10,
            ModTags.Blocks.NEEDS_ARCANE_TOOL,() -> Ingredient.of(ModItems.ARCANE_GEMSTONE.get()),
            ModTags.Blocks.INCORRECT_FOR_ARCANE_TOOL);
}
