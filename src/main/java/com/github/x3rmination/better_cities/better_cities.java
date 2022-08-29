package com.github.x3rmination.better_cities;

import com.github.x3rmination.better_cities.init.StructureInit;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("better_cities")
public class better_cities {

    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "better_cities";

    public better_cities() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        StructureInit.DEFERRED_REGISTRY_STRUCTURE.register(modEventBus);
    }
}
