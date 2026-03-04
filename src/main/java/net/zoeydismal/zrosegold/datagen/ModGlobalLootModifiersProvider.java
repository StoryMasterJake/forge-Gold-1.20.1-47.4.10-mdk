package net.zoeydismal.zrosegold.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.zoeydismal.zrosegold.ZRoseGoldMod;
import net.zoeydismal.zrosegold.item.ModItems;
import net.zoeydismal.zrosegold.loot.AddItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, ZRoseGoldMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("rose_gold_apple_from_mineshafts", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.34f).build()}, ModItems.ROSEGOLD_APPLE.get()));

        add("rose_gold_apple_from_desert_pyramid", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build(),
                LootItemRandomChanceCondition.randomChance(0.20f).build()}, ModItems.ROSEGOLD_APPLE.get()));

        add("rose_gold_apple_from_simple_dungeon", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build()}, ModItems.ROSEGOLD_APPLE.get()));

        add("rose_gold_apple_from_underwater_ruin_big", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build(),
                LootItemRandomChanceCondition.randomChance(0.04f).build()}, ModItems.ROSEGOLD_APPLE.get()));
    }
}
