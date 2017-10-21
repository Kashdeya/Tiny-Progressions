package com.kashdeya.tinyprogressions.proxy;

import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthRenderer;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeRenderer;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeTwoRenderer;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowth;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgrade;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgradeTwo;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	@Override
	public void onPreInitialization(FMLPreInitializationEvent event)
	{
	}

	@Override
	public void onInitialization(FMLInitializationEvent event)
	{
		if (ConfigHandler.BlockGrowth) {
			ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowth.class, new TileEntityGrowthRenderer());
		}
		if (ConfigHandler.BlockGrowthUpgrade) {
			ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowthUpgrade.class, new TileEntityGrowthUpgradeRenderer());
			ModelLoader.setCustomStateMapper(TechBlocks.growth_upgrade, new StateMap.Builder().ignore(new IProperty[] { BlockLiquid.LEVEL }).build());
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo) {
			ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowthUpgradeTwo.class, new TileEntityGrowthUpgradeTwoRenderer());
			ModelLoader.setCustomStateMapper(TechBlocks.growth_upgrade_two, new StateMap.Builder().ignore(new IProperty[] { BlockLiquid.LEVEL }).build());
		}
	}

	@Override
	public void onPostInitialization(FMLPostInitializationEvent event)
	{
	}
}
