package com.superepicjuce.soapmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SOAP = new FoodProperties.Builder().alwaysEat().nutrition(2024)
            .saturationMod(20f).effect(() -> new MobEffectInstance(MobEffects.POISON, 900), 0.5f).build();
    public static final FoodProperties MINTSOAP = new FoodProperties.Builder().alwaysEat().nutrition(2024)
            .saturationMod(20f).effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 1200), 0.9f).build();
    public static final FoodProperties FIRESOAP = new FoodProperties.Builder().alwaysEat().nutrition(2024)
            .saturationMod(20f).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200), 0.9f).build();
    public static final FoodProperties SUSSOAP = new FoodProperties.Builder().alwaysEat().nutrition(2024)
            .saturationMod(20f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 9999), 0.9f).build();
}
