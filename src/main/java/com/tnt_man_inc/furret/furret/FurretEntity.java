package com.tnt_man_inc.furret.furret;

import com.tnt_man_inc.furret.Main;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.RevengeGoal;
import net.minecraft.entity.ai.goal.WanderAroundGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntityWithAi;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PandaEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class FurretEntity extends AnimalEntity {

	public FurretEntity(EntityType<? extends MobEntityWithAi> entityType, World world) {
		super((EntityType<? extends AnimalEntity>) entityType, world);
	}

	@Override
	public void initGoals(){
		this.goalSelector.add(1, new WanderAroundGoal(this, 0.6f));
		this.goalSelector.add(2,new MeleeAttackGoal(this, 1 , false));
		this.targetSelector.add(1, (new RevengeGoal(this, new Class[0])).setGroupRevenge(new Class[0]));
	}
	public static DefaultAttributeContainer.Builder createFurretAttributes() {
		return LivingEntity.createLivingAttributes().add(EntityAttributes.GENERIC_FOLLOW_RANGE, 16.0D).add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5);
	}
	@Override
	public PassiveEntity createChild(PassiveEntity mate) {
		FurretEntity furretEntity = (FurretEntity) Main.FURRET.create(this.world);
		return furretEntity;
	}
}
