package com.github.x3rmination.better_cities.init;

import com.github.x3rmination.better_cities.better_cities;
import com.github.x3rmination.better_cities.structures.CityStructure;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class StructureInit {

    public static final DeferredRegister<StructureFeature<?>> DEFERRED_REGISTRY_STRUCTURE = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, better_cities.MOD_ID);

    public static final RegistryObject<StructureFeature<?>> CITY_STRUCTURE = DEFERRED_REGISTRY_STRUCTURE.register("city_structure", CityStructure::new);

}
