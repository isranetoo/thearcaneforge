package net.thearcaneforge.mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.block.ModBlocks;
import net.thearcaneforge.mod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        //ARCANE
        List<ItemLike> ARCANE_SMELTABLES = List.of(ModItems.RAW_ARCANE_ORE.get(),
                ModBlocks.ARCANE_ORE.get(),ModBlocks.ARCANE_DEEPSLATE_ORE.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ARCANE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ARCANE_GEMSTONE.get())
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()),has(ModItems.ARCANE_GEMSTONE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.ARCANE_GEMSTONE.get(),9)
                .requires(ModBlocks.ARCANE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ARCANE_BLOCK.get()),has(ModBlocks.ARCANE_BLOCK.get())).save(pRecipeOutput);

        oreSmelting(pRecipeOutput, ARCANE_SMELTABLES, RecipeCategory.MISC, ModItems.ARCANE_GEMSTONE.get(), 0.25f,250,"arcane_gemstone");
        oreBlasting(pRecipeOutput, ARCANE_SMELTABLES, RecipeCategory.MISC, ModItems.ARCANE_GEMSTONE.get(), 0.25f,150,"arcane_gemstone");

        //GARNET

        List<ItemLike> GARNET_SMELTABLES = List.of(ModItems.RAW_PINK_GARNET.get(),
                ModBlocks.PINK_GARNET_ORE.get(),ModBlocks.PINK_GARNET_DEESLATE_ORE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_GARNET_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PINK_GARNET.get())
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()),has(ModItems.PINK_GARNET.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.PINK_GARNET.get(),9)
                .requires(ModBlocks.PINK_GARNET_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PINK_GARNET_BLOCK.get()),has(ModBlocks.PINK_GARNET_BLOCK.get())).save(pRecipeOutput);

        oreSmelting(pRecipeOutput, GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET.get(), 0.25f,200,"pink_garnet");
        oreBlasting(pRecipeOutput, GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET.get(), 0.25f,100,"pink_garnet");

        //BISMUTH

        List<ItemLike> BISMUTH_SMELTABLES = List.of(ModItems.RAW_BISMUTH.get(),
                ModBlocks.BISMUTH_ORE.get(),ModBlocks.BISMUTH_DEESLATE_ORE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BISMUTH_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BISMUTH_GEMSTONE.get())
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()),has(ModItems.BISMUTH_GEMSTONE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.BISMUTH_GEMSTONE.get(),9)
                .requires(ModBlocks.BISMUTH_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BISMUTH_BLOCK.get()),has(ModBlocks.BISMUTH_BLOCK.get())).save(pRecipeOutput);

        oreSmelting(pRecipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH_GEMSTONE.get(), 0.25f,150,"bismuth_gemstone");
        oreBlasting(pRecipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH_GEMSTONE.get(), 0.25f,50,"bismuth_gemstone");


    }
    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, TheArcaneForge.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
