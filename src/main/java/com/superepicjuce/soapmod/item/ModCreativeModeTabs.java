package com.superepicjuce.soapmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import com.superepicjuce.soapmod.item.ModItems;
import java.awt.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, net.superepicjuce.soapmod.soapmod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("soapmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SOAP.get()))
                    .title(Component.translatable("creativetab.soapmod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SOAP.get());
                        pOutput.accept(ModItems.FAT.get());
                        pOutput.accept(ModItems.FIRESOAP.get());
                        pOutput.accept(ModItems.MINTSOAP.get());

                        pOutput.accept(Items.COOKED_PORKCHOP);



                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}