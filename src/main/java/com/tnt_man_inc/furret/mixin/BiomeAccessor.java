package com.tnt_man_inc.furret.mixin;

import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Biome.class)
public interface BiomeAccessor {
	@Invoker
	void callAddSpawn(SpawnGroup group, Biome.SpawnEntry spawnEntry);
}
