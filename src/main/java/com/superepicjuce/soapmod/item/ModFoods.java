package com.superepicjuce.soapmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SOAP = new FoodProperties.Builder().alwaysEat().nutrition(2024)
            .saturationMod(20f).effect(() -> new MobEffectInstance(MobEffects.POISON, 900), 0.5f).build();
}
