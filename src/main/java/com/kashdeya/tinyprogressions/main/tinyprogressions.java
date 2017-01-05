package com.kashdeya.tinyprogressions.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.kashdeya.tinyprogressions.proxy.CommonProxy;
import com.kashdeya.tinyprogressions.tabs.TabTP;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class tinyprogressions {
	
	@Instance(Reference.MOD_ID)
    public static tinyprogressions instance;
	
	@SidedProxy(clientSide=Reference.PROXY_CLIENT, serverSide=Reference.PROXY_COMMON)
	public static CommonProxy proxy;
	
	public static final CreativeTabs tabTP = new TabTP("tiny_progressions");
	
    public static org.apache.logging.log4j.Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	logger = e.getModLog();
    	proxy.preInit(e);
    	MinecraftForge.EVENT_BUS.register(instance);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }
}
