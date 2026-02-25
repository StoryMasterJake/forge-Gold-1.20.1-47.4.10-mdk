package net.zoeydismal.zrosegold.item.custom;

import net.zoeydismal.zrosegold.ZRoseGoldMod;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;

//Props to Not A Junkie on discord for the code.
public class SmithingTemplate extends SmithingTemplateItem{
    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;


    private static final Component ROSEGOLD_UPGRADE = Component.translatable(
                    Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ZRoseGoldMod.MOD_ID,"smithing_template.rosegold_upgrade")))
            .withStyle(TITLE_FORMAT);
    private static final Component ROSEGOLD_UPGRADE_APPLIES_TO = Component.translatable(
                    Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ZRoseGoldMod.MOD_ID, "smithing_template.rosegold_upgrade.applies_to")))
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component ROSEGOLD_UPGRADE_INGREDIENTS = Component.translatable(
                    Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ZRoseGoldMod.MOD_ID, "smithing_template.rosegold_upgrade.ingredients")))
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component ROSEGOLD_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ZRoseGoldMod.MOD_ID,"smithing_template.rosegold_upgrade.base_slot_description")));
    private static final Component ROSEGOLD_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ZRoseGoldMod.MOD_ID,"smithing_template.rosegold_upgrade.additions_slot_description")));

    private static final ResourceLocation EMPTY_SLOT_INGOT = ResourceLocation.fromNamespaceAndPath(ZRoseGoldMod.MOD_ID, "item/empty_slot_ingot");
    private static final ResourceLocation EMPTY_SLOT_HOE = ResourceLocation.parse("item/empty_slot_hoe");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = ResourceLocation.parse("item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_AXE = ResourceLocation.parse("item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_SWORD = ResourceLocation.parse("item/empty_slot_sword");
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = ResourceLocation.parse("item/empty_slot_pickaxe");
    private static final ResourceLocation EMPTY_SLOT_HELMET = ResourceLocation.parse("item/empty_armor_slot_helmet");
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = ResourceLocation.parse("item/empty_armor_slot_chestplate");
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = ResourceLocation.parse("item/empty_armor_slot_leggings");
    private static final ResourceLocation EMPTY_SLOT_BOOTS = ResourceLocation.parse("item/empty_armor_slot_boots");

    public SmithingTemplate(Component pAppliesTo, Component pIngredients, Component pUpdradeDescription, Component pBaseSlotDescription, Component pAdditionsSlotDescription, List<ResourceLocation> pBaseSlotEmptyIcons, List<ResourceLocation> pAdditonalSlotEmptyIcons) {
        super(pAppliesTo, pIngredients, pUpdradeDescription, pBaseSlotDescription, pAdditionsSlotDescription, pBaseSlotEmptyIcons, pAdditonalSlotEmptyIcons);
    }

    public static SmithingTemplateItem createRoseGoldUpgradeTemplate() {
        return new SmithingTemplateItem(ROSEGOLD_UPGRADE_APPLIES_TO, ROSEGOLD_UPGRADE_INGREDIENTS, ROSEGOLD_UPGRADE, ROSEGOLD_UPGRADE_BASE_SLOT_DESCRIPTION,
                ROSEGOLD_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createRoseGoldUpgradeIconList(), createRoseGoldUpgradeMaterialList());
    }

    private static List<ResourceLocation> createRoseGoldUpgradeIconList() {
        return List.of(EMPTY_SLOT_SWORD, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_AXE, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL, EMPTY_SLOT_HELMET, EMPTY_SLOT_CHESTPLATE,
                EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_BOOTS);
    }

    private static List<ResourceLocation> createRoseGoldUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }
}