package net.zoeydismal.zrosegold.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.zoeydismal.zrosegold.ZRoseGoldMod;
import net.zoeydismal.zrosegold.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZRoseGoldMod.MOD_ID);

    public  static  final RegistryObject<CreativeModeTab> ROSEGOLD_TAB = CREATIVE_MODE_TABS.register("rosegold_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ROSEGOLD_INGOT.get()))
                    .title(Component.translatable("creativetab.rosegold_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.ROSEGOLD_INGOT.get());

                        output.accept(ModBlocks.ROSEGOLD_BLOCK.get());

                        output.accept(ModItems.ROSEGOLD_SWORD.get());
                        output.accept(ModItems.ROSEGOLD_PICKAXE.get());
                        output.accept(ModItems.ROSEGOLD_AXE.get());
                        output.accept(ModItems.ROSEGOLD_SHOVEL.get());
                        output.accept(ModItems.ROSEGOLD_HOE.get());

                        output.accept(ModItems.ROSEGOLD_HELMET.get());
                        output.accept(ModItems.ROSEGOLD_CHESTPLATE.get());
                        output.accept(ModItems.ROSEGOLD_LEGGINGS.get());
                        output.accept(ModItems.ROSEGOLD_BOOTS.get());

                        output.accept(ModItems.ROSEGOLD_APPLE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
