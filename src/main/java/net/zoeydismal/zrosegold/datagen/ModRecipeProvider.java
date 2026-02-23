package net.zoeydismal.zrosegold.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.zoeydismal.zrosegold.block.ModBlocks;
import net.zoeydismal.zrosegold.datagen.loot.ModBlockLootTables;
import net.zoeydismal.zrosegold.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSEGOLD_BLOCK.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ModItems.ROSEGOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSEGOLD_INGOT.get()), has(ModItems.ROSEGOLD_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSEGOLD_INGOT.get(),9)
                .requires(ModBlocks.ROSEGOLD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ROSEGOLD_BLOCK.get()), has(ModBlocks.ROSEGOLD_BLOCK.get()))
                .save(pWriter);
    }
}
