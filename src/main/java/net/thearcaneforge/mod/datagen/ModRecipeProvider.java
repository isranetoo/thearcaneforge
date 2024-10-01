package net.thearcaneforge.mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
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

        // ARCANE SWORD
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ARCANE_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .define('A', ModItems.ARCANE_GEMSTONE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()), has(ModItems.ARCANE_GEMSTONE.get()))
                .save(pRecipeOutput);

        // ARCANE PICKAXE
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ARCANE_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.ARCANE_GEMSTONE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()), has(ModItems.ARCANE_GEMSTONE.get()))
                .save(pRecipeOutput);

        // ARCANE AXE
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ARCANE_AXE.get())
                .pattern("AA ")
                .pattern("AS ")
                .pattern(" S ")
                .define('A', ModItems.ARCANE_GEMSTONE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()), has(ModItems.ARCANE_GEMSTONE.get()))
                .save(pRecipeOutput);

        // ARCANE SHOVEL
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ARCANE_SHOVEL.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.ARCANE_GEMSTONE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()), has(ModItems.ARCANE_GEMSTONE.get()))
                .save(pRecipeOutput);

        // ARCANE HOE
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ARCANE_HOE.get())
                .pattern("AA ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.ARCANE_GEMSTONE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()), has(ModItems.ARCANE_GEMSTONE.get()))
                .save(pRecipeOutput);

        // ARCANE HAMMER
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ARCANE_HAMMER.get())
                .pattern("AAA")
                .pattern("ASA")
                .pattern(" S ")
                .define('A', ModItems.ARCANE_GEMSTONE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()), has(ModItems.ARCANE_GEMSTONE.get()))
                .save(pRecipeOutput);

        //DECORATIVES
        stairBuilder(ModBlocks.ARCANE_STAIRS.get(), Ingredient.of(ModItems.ARCANE_GEMSTONE.get())).group("arcane_gemstone")
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()), has(ModItems.ARCANE_GEMSTONE.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCANE_SLAB.get(), ModItems.ARCANE_GEMSTONE.get());

        buttonBuilder(ModBlocks.ARCANE_BUTTON.get(), Ingredient.of(ModItems.ARCANE_GEMSTONE.get())).group("arcane_gemstone")
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()), has(ModItems.ARCANE_GEMSTONE.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.ARCANE_PRESSURE_PLATE.get(), ModItems.ARCANE_GEMSTONE.get());

        fenceBuilder(ModBlocks.ARCANE_FENCE.get(), Ingredient.of(ModItems.ARCANE_GEMSTONE.get())).group("arcane_gemstone")
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()), has(ModItems.ARCANE_GEMSTONE.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.ARCANE_FENCE_GATE.get(), Ingredient.of(ModItems.ARCANE_GEMSTONE.get())).group("arcane_gemstone")
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()), has(ModItems.ARCANE_GEMSTONE.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCANE_WALL.get(), ModItems.ARCANE_GEMSTONE.get());

        doorBuilder(ModBlocks.ARCANE_DOOR.get(), Ingredient.of(ModItems.ARCANE_GEMSTONE.get())).group("arcane_gemstone")
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()), has(ModItems.ARCANE_GEMSTONE.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.ARCANE_TRAPDOOR.get(), Ingredient.of(ModItems.ARCANE_GEMSTONE.get())).group("arcane_gemstone")
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()), has(ModItems.ARCANE_GEMSTONE.get())).save(pRecipeOutput);

        // ARCANE LAMP Recipe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ARCANE_LAMP.get())
                .pattern(" G ")
                .pattern("GLG")
                .pattern(" G ")
                .define('G', ModItems.ARCANE_GEMSTONE.get())
                .define('L', ModBlocks.ARCANE_BLOCK.get())
                .unlockedBy(getHasName(ModItems.ARCANE_GEMSTONE.get()), has(ModItems.ARCANE_GEMSTONE.get()))
                .save(pRecipeOutput);


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

        // PINK GARNET SWORD
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .define('A', ModItems.PINK_GARNET.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get()))
                .save(pRecipeOutput);

        // PINK GARNET PICKAXE
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.PINK_GARNET.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get()))
                .save(pRecipeOutput);

        // PINK GARNET AXE
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_AXE.get())
                .pattern("AA ")
                .pattern("AS ")
                .pattern(" S ")
                .define('A', ModItems.PINK_GARNET.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get()))
                .save(pRecipeOutput);

        // PINK GARNET SHOVEL
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_SHOVEL.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.PINK_GARNET.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get()))
                .save(pRecipeOutput);

        // PINK GARNET HOE
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_HOE.get())
                .pattern("AA ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.PINK_GARNET.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get()))
                .save(pRecipeOutput);

        // PINK GARNET HAMMER
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.PINK_GARNET_HAMMER.get())
                .pattern("AAA")
                .pattern("ASA")
                .pattern(" S ")
                .define('A', ModItems.PINK_GARNET.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get()))
                .save(pRecipeOutput);



        //DECORATIVES

        stairBuilder(ModBlocks.PINK_GARNET_STAIRS.get(), Ingredient.of(ModItems.PINK_GARNET.get())).group("pink_garnet")
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GARNET_SLAB.get(), ModItems.PINK_GARNET.get());

        buttonBuilder(ModBlocks.PINK_GARNET_BUTTON.get(), Ingredient.of(ModItems.PINK_GARNET.get())).group("pink_garnet")
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.PINK_GARNET_PRESSURE_PLATE.get(), ModItems.PINK_GARNET.get());

        fenceBuilder(ModBlocks.PINK_GARNET_FENCE.get(), Ingredient.of(ModItems.PINK_GARNET.get())).group("pink_garnet")
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.PINK_GARNET_FENCE_GATE.get(), Ingredient.of(ModItems.PINK_GARNET.get())).group("pink_garnet")
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GARNET_WALL.get(), ModItems.PINK_GARNET.get());

        doorBuilder(ModBlocks.PINK_GARNET_DOOR.get(), Ingredient.of(ModItems.PINK_GARNET.get())).group("pink_garnet")
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.PINK_GARNET_TRAPDOOR.get(), Ingredient.of(ModItems.PINK_GARNET.get())).group("pink_garnet")
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get())).save(pRecipeOutput);

        // PINK GARNET LAMP Recipe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_GARNET_LAMP.get())
                .pattern(" G ")
                .pattern("GLG")
                .pattern(" G ")
                .define('G', ModItems.PINK_GARNET.get())
                .define('L', ModBlocks.PINK_GARNET_BLOCK.get())
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get()))
                .save(pRecipeOutput);


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

        // BISMUTH SWORD Recipe
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .define('A', ModItems.BISMUTH_GEMSTONE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()), has(ModItems.BISMUTH_GEMSTONE.get()))
                .save(pRecipeOutput);

        // BISMUTH PICKAXE
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.BISMUTH_GEMSTONE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()), has(ModItems.BISMUTH_GEMSTONE.get()))
                .save(pRecipeOutput);

        // BISMUTH AXE
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_AXE.get())
                .pattern("AA ")
                .pattern("AS ")
                .pattern(" S ")
                .define('A', ModItems.BISMUTH_GEMSTONE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()), has(ModItems.BISMUTH_GEMSTONE.get()))
                .save(pRecipeOutput);

        // BISMUTH SHOVEL
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_SHOVEL.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.BISMUTH_GEMSTONE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()), has(ModItems.BISMUTH_GEMSTONE.get()))
                .save(pRecipeOutput);

        // BISMUTH HOE
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_HOE.get())
                .pattern("AA ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.BISMUTH_GEMSTONE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()), has(ModItems.BISMUTH_GEMSTONE.get()))
                .save(pRecipeOutput);

        // BISMUTH HAMMER
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BISMUTH_HAMMER.get())
                .pattern("AAA")
                .pattern("ASA")
                .pattern(" S ")
                .define('A', ModItems.BISMUTH_GEMSTONE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()), has(ModItems.BISMUTH_GEMSTONE.get()))
                .save(pRecipeOutput);


        //DECORATIVES

        stairBuilder(ModBlocks.BISMUTH_STAIRS.get(), Ingredient.of(ModItems.BISMUTH_GEMSTONE.get())).group("bismuth_gemstone")
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()), has(ModItems.BISMUTH_GEMSTONE.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BISMUTH_SLAB.get(), ModItems.BISMUTH_GEMSTONE.get());

        buttonBuilder(ModBlocks.BISMUTH_BUTTON.get(), Ingredient.of(ModItems.BISMUTH_GEMSTONE.get())).group("bismuth_gemstone")
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()), has(ModItems.BISMUTH_GEMSTONE.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.BISMUTH_PRESSURE_PLATE.get(), ModItems.BISMUTH_GEMSTONE.get());

        fenceBuilder(ModBlocks.BISMUTH_FENCE.get(), Ingredient.of(ModItems.BISMUTH_GEMSTONE.get())).group("bismuth_gemstone")
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()), has(ModItems.BISMUTH_GEMSTONE.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.BISMUTH_FENCE_GATE.get(), Ingredient.of(ModItems.BISMUTH_GEMSTONE.get())).group("bismuth_gemstone")
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()), has(ModItems.BISMUTH_GEMSTONE.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BISMUTH_WALL.get(), ModItems.BISMUTH_GEMSTONE.get());

        doorBuilder(ModBlocks.BISMUTH_DOOR.get(), Ingredient.of(ModItems.BISMUTH_GEMSTONE.get())).group("bismuth_gemstone")
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()), has(ModItems.BISMUTH_GEMSTONE.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.BISMUTH_TRAPDOOR.get(), Ingredient.of(ModItems.BISMUTH_GEMSTONE.get())).group("bismuth_gemstone")
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()), has(ModItems.BISMUTH_GEMSTONE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BISMUTH_LAMP.get())
                .pattern(" G ")
                .pattern("GLG")
                .pattern(" G ")
                .define('G', ModItems.BISMUTH_GEMSTONE.get())
                .define('L', ModBlocks.BISMUTH_BLOCK.get())
                .unlockedBy(getHasName(ModItems.BISMUTH_GEMSTONE.get()), has(ModItems.BISMUTH_GEMSTONE.get()))
                .save(pRecipeOutput);

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
