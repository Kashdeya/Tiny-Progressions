package com.kashdeya.tinyprogressions.main;

import org.apache.logging.log4j.Logger;

import com.kashdeya.tinyprogressions.config.TinyConfig;
import com.kashdeya.tinyprogressions.events.BucketUseEvent;
import com.kashdeya.tinyprogressions.events.EventDrops;
import com.kashdeya.tinyprogressions.events.IReachEvent;
import com.kashdeya.tinyprogressions.events.SpongeBlockPlacement;
import com.kashdeya.tinyprogressions.fluids.ModFluids;
import com.kashdeya.tinyprogressions.gui.GuiHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechFoods;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;
import com.kashdeya.tinyprogressions.proxy.CommonProxy;
import com.kashdeya.tinyprogressions.recipes.ArmorRecipes;
import com.kashdeya.tinyprogressions.recipes.BlockRecipes;
import com.kashdeya.tinyprogressions.recipes.FoodRecipes;
import com.kashdeya.tinyprogressions.recipes.ItemRecipes;
import com.kashdeya.tinyprogressions.recipes.OtherRecipes;
import com.kashdeya.tinyprogressions.recipes.ToolsRecipes;
import com.kashdeya.tinyprogressions.registry.ModRegistry;
import com.kashdeya.tinyprogressions.util.OreDict;
import com.kashdeya.tinyprogressions.util.RemoveItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Enchantments;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.FluidRegistry;
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

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MINECRAFT)

public class TinyProgressions extends ModRegistry {

	@Instance(Reference.MOD_ID)
	public static TinyProgressions instance;
	
	@SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_COMMON)
	public static CommonProxy proxy;
	
	public static final CreativeTabs tabTP = new TabTP("tiny_progressions");

	public static SimpleNetworkWrapper network;
	public static Logger logger;
	
	static { 
		FluidRegistry.enableUniversalBucket();
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		
		// Configs
		TinyConfig.initMain();
		TinyConfig.initArmor();
		TinyConfig.initToolsWeapons();
		TinyConfig.initFood();
		TinyConfig.initExtra();
		TinyConfig.initOres();
		ModFluids.init();
		
		TechBlocks.init();
		TechItems.init();
		TechTools.init();
		TechArmor.init();
		TechFoods.init();
		register(TechBlocks.class);
		register(TechItems.class);
		register(TechTools.class);
		register(TechArmor.class);
		register(TechFoods.class);
				
		RemoveItems.initRemove();
		
		// Events
		MinecraftForge.EVENT_BUS.register(instance);
		MinecraftForge.EVENT_BUS.register(new IReachEvent());
		MinecraftForge.EVENT_BUS.register(EventDrops.class);
		MinecraftForge.EVENT_BUS.register(SpongeBlockPlacement.class);
		MinecraftForge.EVENT_BUS.register(BucketUseEvent.class);
		
		// Setup
		proxy.onPreInitialization(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.onInitialization(e);
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		OreDict.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.onPostInitialization(e);
	}

	@SubscribeEvent
	public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
		BlockRecipes.init();
		ItemRecipes.init();
		ToolsRecipes.init();
		ArmorRecipes.init();
		FoodRecipes.init();
		OtherRecipes.init();
		register(BlockRecipes.class);
		register(ItemRecipes.class);
		register(ToolsRecipes.class);
		register(ArmorRecipes.class);
		register(FoodRecipes.class);
		register(OtherRecipes.class);
		
		IForgeRegistryModifiable<IRecipe> registry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();

		RemoveItems.recipes.forEach(rl -> {
			System.out.println("Removing: " + rl);
			registry.remove(rl);
		});
	}

	@SubscribeEvent
	public void itemCrafted(ItemCraftedEvent event)
	{
		if (event.crafting.getItem() == TechTools.birthday_pickaxe)
			event.crafting.addEnchantment(Enchantments.MENDING, 0);
	}
}
