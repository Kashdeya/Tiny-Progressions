package com.arclighttw.utilities;

import net.minecraftforge.fml.common.SidedProxy;

public abstract class ForgeMod extends Registry
{
	@SidedProxy(clientSide = "com.arclighttw.utilities.client.ClientProxy", serverSide = "com.arclighttw.utilities.CommonProxy")
	public static CommonProxy proxy;
	
	public abstract IProxy getClientProxy();
	public abstract IProxy getServerProxy();
}
