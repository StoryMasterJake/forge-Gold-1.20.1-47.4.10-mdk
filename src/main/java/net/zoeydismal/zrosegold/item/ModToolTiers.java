package net.zoeydismal.zrosegold.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.zoeydismal.zrosegold.ZRoseGoldMod;
import net.zoeydismal.zrosegold.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier ROSEGOLD = TierSortingRegistry.registerTier(
            new ForgeTier(0, 200, 12f, 1f, 20,
                    ModTags.blocks.NEEDS_ROSEGOLD_TOOL, () -> Ingredient.of(ModItems.ROSEGOLD_INGOT.get())),
            new ResourceLocation(ZRoseGoldMod.MOD_ID,"rosegold"), List.of(Tiers.GOLD), List.of(Tiers.STONE));

}
