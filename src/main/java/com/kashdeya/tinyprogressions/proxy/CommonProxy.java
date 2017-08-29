package com.kashdeya.tinyprogressions.proxy;

import com.kashdeya.tinyprogressions.handlers.FuelHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.MessageExtendedReachAttack;
import com.kashdeya.tinyprogressions.world.PlantGen;
import com.kashdeya.tinyprogressions.world.WorldGen;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class CommonProxy {

	public void init() {
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

	public EntityPlayerMP getPlayerEntityFromContext(MessageContext ctx) {
		return null;
	}

}
