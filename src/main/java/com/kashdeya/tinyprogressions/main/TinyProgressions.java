package com.kashdeya.tinyprogressions.main;

import java.util.Iterator;

import com.kashdeya.tinyprogressions.configs.TinyConfig;
import com.kashdeya.tinyprogressions.crafting.ArmorRecipes;
import com.kashdeya.tinyprogressions.crafting.BlockRecipes;
import com.kashdeya.tinyprogressions.crafting.FoodRecipes;
import com.kashdeya.tinyprogressions.crafting.ItemRecipes;
import com.kashdeya.tinyprogressions.crafting.OtherRecipes;
import com.kashdeya.tinyprogressions.crafting.ToolsRecipes;
import com.kashdeya.tinyprogressions.events.BucketUseEvent;
import com.kashdeya.tinyprogressions.events.EntityEvents;
import com.kashdeya.tinyprogressions.events.EventDrops;
import com.kashdeya.tinyprogressions.events.IReachEvent;
import com.kashdeya.tinyprogressions.events.SpongeBlockPlacement;
import com.kashdeya.tinyprogressions.handlers.GuiHandler;
import com.kashdeya.tinyprogressions.handlers.OreDictHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechFoods;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;
import com.kashdeya.tinyprogressions.proxy.CommonProxy;
import com.kashdeya.tinyprogressions.tabs.TabTP;
import com.kashdeya.tinyprogressions.util.Registry;
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
	public static CommonProxy PROXY;
	
	public static final Registry REGISTRY = new Registry();

	public static final CreativeTabs tabTP = new TabTP("tiny_progressions");

	public static SimpleNetworkWrapper network;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {

		// Configs
		TinyConfig.initMainConfigs();

		// Load everything else
		TechItems.init();
		TechBlocks.init();
		TechArmor.init();
		TechTools.init();
		TechFoods.init();
		
		REGISTRY.preInit();
		RemoveItems.initRemove();
		
		// Events
		MinecraftForge.EVENT_BUS.register(instance);
		MinecraftForge.EVENT_BUS.register(REGISTRY);
		MinecraftForge.EVENT_BUS.register(new IReachEvent());
		MinecraftForge.EVENT_BUS.register(EventDrops.class);
		MinecraftForge.EVENT_BUS.register(SpongeBlockPlacement.class);
		MinecraftForge.EVENT_BUS.register(BucketUseEvent.class);
		MinecraftForge.EVENT_BUS.register(EntityEvents.class);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		PROXY.init();
		REGISTRY.init();
		
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		OreDictHandler.init();
		OtherRecipes.init();
		ArmorRecipes.init();
		BlockRecipes.init();
		ItemRecipes.init();
		ToolsRecipes.init();
		FoodRecipes.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
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
			event.crafting.addEnchantment(Enchantments.MENDING, 2);
	}
}
