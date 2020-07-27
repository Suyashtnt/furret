package com.tnt_man_inc.furret.furret;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.WanderAroundGoal;
import net.minecraft.entity.mob.MobEntityWithAi;
import net.minecraft.world.World;

public class FurretEntity extends MobEntityWithAi {

	public FurretEntity(EntityType<? extends MobEntityWithAi> entityType, World world) {
		super(entityType, world);
	}

	@Override
	public void initGoals(){
		this.goalSelector.add(1, new WanderAroundGoal(this, 0.6f));
	}

}
