package com.kashdeya.tinyprogressions.proxy;

import com.arclighttw.utilities.IProxy;
import com.kashdeya.tinyprogressions.crafting.ArmorRecipes;
import com.kashdeya.tinyprogressions.crafting.BlockRecipes;
import com.kashdeya.tinyprogressions.crafting.FoodRecipes;
import com.kashdeya.tinyprogressions.crafting.ItemRecipes;
import com.kashdeya.tinyprogressions.crafting.OtherRecipes;
import com.kashdeya.tinyprogressions.crafting.ToolsRecipes;
import com.kashdeya.tinyprogressions.handlers.FuelHandler;
import com.kashdeya.tinyprogressions.handlers.OreDictHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechFoods;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.MessageExtendedReachAttack;
import com.kashdeya.tinyprogressions.world.PlantGen;
import com.kashdeya.tinyprogressions.world.WorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class CommonProxy implements IProxy {

	@Override
	public void onPreInitialization(FMLPreInitializationEvent event)
	{
		TechItems.init();
		TechBlocks.init();
		TechArmor.init();
		TechTools.init();
		TechFoods.init();
	}
	
	@Override
	public void onInitialization(FMLInitializationEvent event)
	{
		
		
		// FuelHandler
		GameRegistry.registerFuelHandler(new FuelHandler());

		// Load WorldGeneration
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
		GameRegistry.registerWorldGenerator(new PlantGen(), 0);

		// register messages from client to server
		TinyProgressions.network = NetworkRegistry.INSTANCE.newSimpleChannel("network");

		int packetId = 0;
		TinyProgressions.network.registerMessage(MessageExtendedReachAttack.Handler.class,
				MessageExtendedReachAttack.class, packetId++, Side.SERVER);
	}
	
	@Override
	public void onPostInitialization(net.minecraftforge.fml.common.event.FMLPostInitializationEvent event)
	{
		OreDictHandler.init();
		OtherRecipes.init();
		ArmorRecipes.init();
		BlockRecipes.init();
		ItemRecipes.init();
		ToolsRecipes.init();
		FoodRecipes.init();
	}
}
