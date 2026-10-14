package com.klyozzpremium.guineapigmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuineaPigMod implements ModInitializer {
    public static final String MOD_ID = "guineapigmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final EntityType<GuineaPigEntity> GUINEA_PIG = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            new ResourceLocation(MOD_ID, "guineapig"),
            EntityType.Builder.of(GuineaPigEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f)
                    .build("guineapig")
    );

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(GUINEA_PIG, GuineaPigEntity.createAttributes());
        SpawnPlacements.register(GUINEA_PIG, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);
        LOGGER.info("Guinea Pig Mod initialized");
    }
}