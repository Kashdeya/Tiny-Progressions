package com.kashdeya.tinyprogressions.events;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EntityEvents {
	@SubscribeEvent
	public static void onEntityJoinWorld(EntityJoinWorldEvent event)
	{
		if(!ConfigHandler.custom_moist_timer)
			return;
		
		if(!(event.getEntity() instanceof EntityPlayer))
			return;
		
		if(event.getWorld().getWorldTime() >= 400)
			return;
		
		int rainTime = (int)(24000 * ConfigHandler.moist_time);
		
		if(rainTime < 100)
			rainTime = 100;
		
		event.getWorld().getWorldInfo().setRainTime(rainTime);
	}
}
