package com.kashdeya.tinyprogressions.proxy;

import com.kashdeya.tinyprogressions.handlers.FuelHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.recipes.Recipes;
import com.kashdeya.tinyprogressions.tiles.TileEntityBlazeCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityDiamondCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityEmeraldCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowth;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgrade;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgradeTwo;
import com.kashdeya.tinyprogressions.tiles.TileEntityIronCobblegen;
import com.kashdeya.tinyprogressions.util.MessageExtendedReachAttack;
import com.kashdeya.tinyprogressions.util.RemoveItems;
import com.kashdeya.tinyprogressions.world.WorldGen;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class CommonProxy {

	public void registerTileEntities() {
    	// Tile Entities
    	GameRegistry.registerTileEntity(TileEntityCobblegen.class, "tileEntityCobblegen");
    	GameRegistry.registerTileEntity(TileEntityIronCobblegen.class, "tileEntityIronCobblegen");
    	GameRegistry.registerTileEntity(TileEntityDiamondCobblegen.class, "tileEntityDiamondCobblegen");
    	GameRegistry.registerTileEntity(TileEntityEmeraldCobblegen.class, "tileEntityEmeraldCobblegen");
    	GameRegistry.registerTileEntity(TileEntityBlazeCobblegen.class, "tileEntityBlazeCobblegen");
    	GameRegistry.registerTileEntity(TileEntityGrowth.class, "tileEntityGrowth");
    	GameRegistry.registerTileEntity(TileEntityGrowthUpgrade.class, "tileEntityGrowthUpgrade");
    	GameRegistry.registerTileEntity(TileEntityGrowthUpgradeTwo.class, "tileEntityGrowthUpgradeTwo");
		
	}

    public void init() {
    	// Recipes
    	Recipes.registerRecipes();
    	RemoveItems.initRemove();
    	
    	// FuelHandler
    	GameRegistry.registerFuelHandler(new FuelHandler());
    	
    	// Load WorldGeneration
    	GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    	
    	// register messages from client to server
    	TinyProgressions.network = NetworkRegistry.INSTANCE.newSimpleChannel("network");

    	int packetId = 0;
    	TinyProgressions.network.registerMessage(MessageExtendedReachAttack.Handler.class, MessageExtendedReachAttack.class, packetId++, Side.SERVER);

    }

	public void registerRenderers() {
		//unused - only called clientside
	}
	
	public EntityPlayerMP getPlayerEntityFromContext(MessageContext ctx) {
	    return null;
	}

}
