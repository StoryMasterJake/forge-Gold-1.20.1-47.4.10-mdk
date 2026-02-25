package net.zoeydismal.zrosegold.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ROSEGOLD_APPLE = new FoodProperties.Builder().alwaysEat().nutrition(4)
            .saturationMod(1.2F).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 2405), 1).build();
}
