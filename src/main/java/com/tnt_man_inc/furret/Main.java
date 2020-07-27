package com.tnt_man_inc.furret;

import com.tnt_man_inc.furret.furret.FurretEntity;
import com.tnt_man_inc.furret.mixin.BiomeAccessor;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class Main implements ModInitializer {

	public static final EntityType<FurretEntity> FURRET = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier("furret", "furret"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FurretEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
	);

	@Override
	public void onInitialize() {
		FabricDefaultAttributeRegistry.register(FURRET, FurretEntity.createMobAttributes());
		RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> ((BiomeAccessor)biome).callAddSpawn(SpawnGroup.AMBIENT, new Biome.SpawnEntry(FURRET, 13, 1, 3)));

	}
}
