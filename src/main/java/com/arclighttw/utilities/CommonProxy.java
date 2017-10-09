package com.arclighttw.utilities;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CommonProxy
{
	protected ForgeMod modInstance;
	
	protected IProxy commonProxy;
	protected IProxy clientProxy;
	
	public void setupInstance(ForgeMod instance)
	{
		modInstance = instance;
	}
	
	public void onPreInitialization(FMLPreInitializationEvent event)
	{
		if(modInstance != null)
			commonProxy = modInstance.getServerProxy();
		
		if(commonProxy != null)
			commonProxy.onPreInitialization(event);
	}
	
	public void onInitialization(FMLInitializationEvent event)
	{
		if(commonProxy != null)
			commonProxy.onInitialization(event);
	}
	
	public void onPostInitialization(FMLPostInitializationEvent event)
	{
		if(commonProxy != null)
			commonProxy.onPostInitialization(event);
	}
	
	public EntityPlayerMP getPlayerEntityFromContext(MessageContext ctx)
	{
		return null;
	}
}
