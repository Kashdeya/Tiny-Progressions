package com.kashdeya.tinyprogressions.main;

import java.util.Iterator;

import com.kashdeya.tinyprogressions.configs.TinyConfig;
import com.kashdeya.tinyprogressions.events.BucketUseEvent;
import com.kashdeya.tinyprogressions.events.EventDrops;
import com.kashdeya.tinyprogressions.events.IReachEvent;
import com.kashdeya.tinyprogressions.events.SpongeBlockPlacement;
import com.kashdeya.tinyprogressions.handlers.OreDictHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;
import com.kashdeya.tinyprogressions.proxy.CommonProxy;
import com.kashdeya.tinyprogressions.tabs.TabTP;
import com.kashdeya.tinyprogressions.util.RemoveItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MINECRAFT)

public class TinyProgressions {
	
	@Instance(Reference.MOD_ID)
    public static TinyProgressions instance;
	
	@SidedProxy(clientSide=Reference.PROXY_CLIENT, serverSide=Reference.PROXY_COMMON)
	public static CommonProxy PROXY;
	
	public static final CreativeTabs tabTP = new TabTP("tiny_progressions");
	
	public static SimpleNetworkWrapper network;
	
    public static org.apache.logging.log4j.Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	logger = e.getModLog();
    	
		// Configs
		TinyConfig.initMainConfigs();
		
    	// Load everything else
		TechItems.init();
		TechBlocks.init();
		TechArmor.init();
		TechTools.init();
		OreDictHandler.init();
		
		// Renders
    	PROXY.registerTileEntities();
    	PROXY.registerRenderers();
		
    	// Events
    	MinecraftForge.EVENT_BUS.register(instance);
    	MinecraftForge.EVENT_BUS.register(new IReachEvent());
    	MinecraftForge.EVENT_BUS.register(EventDrops.class);
    	MinecraftForge.EVENT_BUS.register(SpongeBlockPlacement.class);
    	MinecraftForge.EVENT_BUS.register(BucketUseEvent.class);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	PROXY.init();
    	PROXY.registerWorldRenderers();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {}
    
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event)
    {
    	TechBlocks.registerBlocks(event);
    }
    
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event)
    {
    	TechBlocks.registerItemBlocks(event);
    	TechItems.registerItems(event);
    	
    	TechArmor.registerItems(event);
    	TechTools.registerItems(event);
    }
    
    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
    	IForgeRegistryModifiable<IRecipe> registry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();
    	Iterator<ResourceLocation> iterator = RemoveItems.recipes.iterator();
    	
    	while(iterator.hasNext())
    	{
    		registry.remove(iterator.next());
    	}
    }
}
