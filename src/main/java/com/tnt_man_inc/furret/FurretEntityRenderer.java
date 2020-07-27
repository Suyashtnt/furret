package com.tnt_man_inc.furret;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class FurretEntityRenderer extends MobEntityRenderer<FurretEntity, FurretModelPlaceholder> {

	public FurretEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new FurretModelPlaceholder(), 0.5f);
	}

	@Override
	public Identifier getTexture(FurretEntity entity) {
		return new Identifier("furret", "textures/entity/furret/furret.png");
	}
}