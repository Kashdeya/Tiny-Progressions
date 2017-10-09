package com.arclighttw.utilities.client;

import com.arclighttw.utilities.CommonProxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy
{
	@Override
	public void onPreInitialization(FMLPreInitializationEvent event)
	{
		super.onPreInitialization(event);
		
		if(modInstance != null)
			clientProxy = modInstance.getClientProxy();
		
		if(clientProxy != null)
			clientProxy.onPreInitialization(event);
	}
	
	@Override
	public void onInitialization(FMLInitializationEvent event)
	{
		super.onInitialization(event);
		
		if(clientProxy != null)
			clientProxy.onInitialization(event);
	}
	
	@Override
	public void onPostInitialization(FMLPostInitializationEvent event)
	{
		super.onPostInitialization(event);
		
		if(clientProxy != null)
			clientProxy.onPostInitialization(event);
	}
	
	@Override
	public EntityPlayerMP getPlayerEntityFromContext(MessageContext ctx)
    {
		return (EntityPlayerMP)(ctx.side.isClient() ? Minecraft.getMinecraft().player : ctx.getServerHandler().player);
    }
}
