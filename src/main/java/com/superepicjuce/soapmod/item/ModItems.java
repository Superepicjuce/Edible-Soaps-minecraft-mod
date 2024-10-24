package com.superepicjuce.soapmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.superepicjuce.soapmod.soapmod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, soapmod.MOD_ID);

    public static final RegistryObject<Item> SOAP = ITEMS.register("soap",
            () -> new Item(new Item.Properties().food(ModFoods.SOAP)));
    public static final RegistryObject<Item> FAT = ITEMS.register("fat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MINTSOAP = ITEMS.register("mintsoap",
            () -> new Item(new Item.Properties().food(ModFoods.MINTSOAP)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
