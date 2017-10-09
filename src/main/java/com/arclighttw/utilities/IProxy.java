package com.arclighttw.utilities;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface IProxy
{
	public void onPreInitialization(FMLPreInitializationEvent event);
	public void onInitialization(FMLInitializationEvent event);
	public void onPostInitialization(FMLPostInitializationEvent event);
}
