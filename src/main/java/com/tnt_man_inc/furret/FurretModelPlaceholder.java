package com.tnt_man_inc.furret;

import com.tnt_man_inc.furret.furret.FurretEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

//not final model
public class FurretModelPlaceholder extends EntityModel<FurretEntity> {

	private final ModelPart base;

	public FurretModelPlaceholder() {
		base = new ModelPart(this, 0, 0);
		base.addCuboid(-6, -6, -6, 12, 12, 12);
	}

	@Override
	public void setAngles(FurretEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		// translate model down
		matrices.translate(0, 1.125, 0);

		// render cube
		base.render(matrices, vertices, light, overlay);
	}

}