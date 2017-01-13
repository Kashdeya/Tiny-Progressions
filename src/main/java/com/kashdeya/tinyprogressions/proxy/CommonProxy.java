package com.kashdeya.tinyprogressions.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.configs.TinyConfig;
import com.kashdeya.tinyprogressions.events.BucketUseEvent;
import com.kashdeya.tinyprogressions.events.EventDrops;
import com.kashdeya.tinyprogressions.events.SpongeBlockPlacement;
import com.kashdeya.tinyprogressions.handlers.FuelHandler;
import com.kashdeya.tinyprogressions.handlers.OreDictHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.recipes.Recipes;
import com.kashdeya.tinyprogressions.tiles.TileEntityBlazeCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityDiamondCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityEmeraldCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityIronCobblegen;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		// Configs
		TinyConfig.initMainConfigs();
		
    	// Load everything else
		TechItems.init();
		TechBlocks.init();
		TechArmor.init();
		OreDictHandler.init();

    }

    public void init(FMLInitializationEvent e) {
    	// Recipes
    	Recipes.registerRecipes();
    	
    	// Events
    	MinecraftForge.EVENT_BUS.register(new EventDrops());
    	MinecraftForge.EVENT_BUS.register(new SpongeBlockPlacement());
    	MinecraftForge.EVENT_BUS.register(new BucketUseEvent());
    	
    	// FuelHandler
    	GameRegistry.registerFuelHandler(new FuelHandler());
    	
    	// Tile Entities
    	GameRegistry.registerTileEntity(TileEntityCobblegen.class, "tileEntityCobblegen");
    	GameRegistry.registerTileEntity(TileEntityIronCobblegen.class, "tileEntityIronCobblegen");
    	GameRegistry.registerTileEntity(TileEntityDiamondCobblegen.class, "tileEntityDiamondCobblegen");
    	GameRegistry.registerTileEntity(TileEntityEmeraldCobblegen.class, "tileEntityEmeraldCobblegen");
    	GameRegistry.registerTileEntity(TileEntityBlazeCobblegen.class, "tileEntityBlazeCobblegen");
    	
    	// Load WorldGeneration

    }

    public void postInit(FMLPostInitializationEvent e) {

    }


}
