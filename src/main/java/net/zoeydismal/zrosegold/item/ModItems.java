package net.zoeydismal.zrosegold.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zoeydismal.zrosegold.ZRoseGoldMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZRoseGoldMod.MOD_ID);

    public static final RegistryObject<Item> ROSEGOLD_INGOT = ITEMS.register("rosegold_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSEGOLD_SWORD = ITEMS.register("rosegold_sword",
            () -> new SwordItem(ModToolTiers.ROSEGOLD,3,  -2.2f, new Item.Properties()));
    public static final RegistryObject<Item> ROSEGOLD_PICKAXE = ITEMS.register("rosegold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ROSEGOLD,1,  -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> ROSEGOLD_AXE = ITEMS.register("rosegold_axe",
            () -> new AxeItem(ModToolTiers.ROSEGOLD,6,  -3, new Item.Properties()));
    public static final RegistryObject<Item> ROSEGOLD_SHOVEL = ITEMS.register("rosegold_shovel",
            () -> new ShovelItem(ModToolTiers.ROSEGOLD,1.5f,  -3, new Item.Properties()));
    public static final RegistryObject<Item> ROSEGOLD_HOE = ITEMS.register("rosegold_hoe",
            () -> new HoeItem(ModToolTiers.ROSEGOLD,-1,  -2, new Item.Properties()));

    public static final RegistryObject<Item> ROSEGOLD_HELMET = ITEMS.register("rosegold_helmet",
            () -> new ArmorItem(ModArmorMaterials.ROSEGOLD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ROSEGOLD_CHESTPLATE = ITEMS.register("rosegold_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ROSEGOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ROSEGOLD_LEGGINGS = ITEMS.register("rosegold_leggings",
            () -> new ArmorItem(ModArmorMaterials.ROSEGOLD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ROSEGOLD_BOOTS = ITEMS.register("rosegold_boots",
            () -> new ArmorItem(ModArmorMaterials.ROSEGOLD, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ROSEGOLD_APPLE = ITEMS.register("rosegold_apple",
            () -> new Item(new Item.Properties().food(ModFoods.ROSEGOLD_APPLE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
