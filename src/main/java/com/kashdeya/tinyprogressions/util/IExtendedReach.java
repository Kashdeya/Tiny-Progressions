package com.kashdeya.tinyprogressions.util;

import java.util.UUID;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.common.ForgeMod;

public interface IExtendedReach {
	
	public UUID attUUID = UUID.fromString("0fb96bd2-8064-11ea-bc55-0242ac130003");
	
	float getReach();
		
	default void extendReach(PlayerEntity player) {
		AttributeModifier extended = new AttributeModifier(attUUID, "extend-reach", getReach(), AttributeModifier.Operation.ADDITION);

		if(!player.getAttribute(ForgeMod.REACH_DISTANCE.get()).hasModifier(extended))
			player.getAttribute(ForgeMod.REACH_DISTANCE.get()).addPermanentModifier(extended);
	}
	
	default boolean hasReach(PlayerEntity player) {
		AttributeModifier extended = new AttributeModifier(attUUID, "extend-reach", getReach(), AttributeModifier.Operation.ADDITION);
		return player.getAttribute(ForgeMod.REACH_DISTANCE.get()).hasModifier(extended);
	}
	
	default void removeReach(PlayerEntity player) {
		player.getAttribute(ForgeMod.REACH_DISTANCE.get()).removeModifier(attUUID);
}
}
