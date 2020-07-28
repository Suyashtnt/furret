package com.tnt_man_inc.furret.furret;// Made with Blockbench 3.5.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class FurretModel extends EntityModel<FurretEntity> {
	private final ModelPart frontrightleg;
	private final ModelPart frontleftleg;
	private final ModelPart baccleftleg;
	private final ModelPart baccrightleg;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart main;
	private final ModelPart ears;
	private final ModelPart right;
	private final ModelPart left;
	private final ModelPart tail;
public FurretModel() {
		textureWidth = 32;
		textureHeight = 32;
		frontrightleg = new ModelPart(this);
		frontrightleg.setPivot(-4.5F, 22.0F, 3.5F);
		frontrightleg.setTextureOffset(0, 1).addCuboid(4.5F, 0.0F, -6.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		frontleftleg = new ModelPart(this);
		frontleftleg.setPivot(-4.5F, 22.0F, 3.5F);
		frontleftleg.setTextureOffset(0, 1).addCuboid(2.5F, 0.0F, -6.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		baccleftleg = new ModelPart(this);
		baccleftleg.setPivot(-4.5F, 22.0F, 3.5F);
		baccleftleg.setTextureOffset(0, 1).addCuboid(2.5F, 0.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		baccrightleg = new ModelPart(this);
		baccrightleg.setPivot(-4.5F, 22.0F, 3.5F);
	baccrightleg.setTextureOffset(0, 1).addCuboid(4.5F, 0.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

	body = new ModelPart(this);
	body.setPivot(0.0F, 24.0F, 0.0F);
	body.setTextureOffset(0, 11).addCuboid(-2.0F, -5.0F, -4.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);

	head = new ModelPart(this);
	head.setPivot(0.0F, 24.0F, 0.0F);


	main = new ModelPart(this);
	main.setPivot(0.0F, 0.0F, 0.0F);
	head.addChild(main);
	main.setTextureOffset(0, 11).addCuboid(-2.0F, -5.0F, -6.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

	ears = new ModelPart(this);
	ears.setPivot(0.0F, 0.0F, 0.0F);
	head.addChild(ears);


	right = new ModelPart(this);
	right.setPivot(0.375F, -4.375F, -5.25F);
	ears.addChild(right);
	right.setTextureOffset(0, 0).addCuboid(0.125F, -1.125F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	right.setTextureOffset(0, 0).addCuboid(0.875F, -1.875F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

	left = new ModelPart(this);
	left.setPivot(-1.375F, -4.375F, -5.25F);
	ears.addChild(left);
	left.setTextureOffset(0, 0).addCuboid(-1.125F, -1.125F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	left.setTextureOffset(0, 0).addCuboid(-1.875F, -1.875F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		tail = new ModelPart(this);
		tail.setPivot(0.0F, 19.5F, 7.0F);
		setRotationAngle(tail, 0.2618F, 0.0F, 0.0F);
		tail.setTextureOffset(16, 0).addCuboid(-2.0F, -1.5353F, -4.8637F, 3.0F, 3.0F, 6.0F, 0.0F, false);
}

	@Override
	public void setAngles(FurretEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}

	@Override
public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		frontrightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		frontleftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		baccleftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		baccrightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}

	}