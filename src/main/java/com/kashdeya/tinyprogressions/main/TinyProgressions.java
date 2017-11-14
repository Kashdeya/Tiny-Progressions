package com.kashdeya.tinyprogressions.main;

import java.util.Iterator;

import com.kashdeya.tinyprogressions.config.TinyConfig;
import com.kashdeya.tinyprogressions.events.BucketUseEvent;
import com.kashdeya.tinyprogressions.events.EntityEvents;
import com.kashdeya.tinyprogressions.events.EventDrops;
import com.kashdeya.tinyprogressions.events.IReachEvent;
import com.kashdeya.tinyprogressions.events.SpongeBlockPlacement;
import com.kashdeya.tinyprogressions.gui.GuiHandler;
import com.kashdeya.tinyprogressions.inits.TechTools;
import com.kashdeya.tinyprogressions.proxy.CommonProxy;
import com.kashdeya.tinyprogressions.util.RemoveItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Enchantments;
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
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class TinyProgressions {

	@Instance(Reference.MOD_ID)
	public static TinyProgressions instance;
	
	@SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_COMMON)
	public static CommonProxy proxy;
	
	public static final CreativeTabs tabTP = new TabTP("tiny_progressions");

	public static SimpleNetworkWrapper network;
	public static org.apache.logging.log4j.Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		
		// Configs
		TinyConfig.initMain();
		TinyConfig.initArmor();
		TinyConfig.initToolsWeapons();
		TinyConfig.initFood();
		TinyConfig.initExtra();
		
		// Setup
		proxy.onPreInitialization(e);
				
		RemoveItems.initRemove();
		
		// Events
		MinecraftForge.EVENT_BUS.register(instance);
		MinecraftForge.EVENT_BUS.register(new IReachEvent());
		MinecraftForge.EVENT_BUS.register(EventDrops.class);
		MinecraftForge.EVENT_BUS.register(SpongeBlockPlacement.class);
		MinecraftForge.EVENT_BUS.register(BucketUseEvent.class);
		MinecraftForge.EVENT_BUS.register(EntityEvents.class);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.onInitialization(e);
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.onPostInitialization(e);
	}

	@SubscribeEvent
	public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
		IForgeRegistryModifiable<IRecipe> registry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();
		Iterator<ResourceLocation> iterator = RemoveItems.recipes.iterator();

		while (iterator.hasNext()) {
		    ResourceLocation rl = iterator.next();
		    System.out.println("Removing: " + rl);
			registry.remove(rl);
		}
	}

	@SubscribeEvent
	public void itemCrafted(ItemCraftedEvent event)
	{
		if (event.crafting.getItem() == TechTools.birthday_pickaxe)
			event.crafting.addEnchantment(Enchantments.MENDING, 0);
	}
}
