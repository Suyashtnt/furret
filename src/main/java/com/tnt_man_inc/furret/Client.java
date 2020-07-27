package com.tnt_man_inc.furret;

import com.tnt_man_inc.furret.furret.FurretEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

import static com.tnt_man_inc.furret.Main.FURRET;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.INSTANCE.register(FURRET, (dispatcher, context) -> {
			return new FurretEntityRenderer(dispatcher);
		});
	}
}
