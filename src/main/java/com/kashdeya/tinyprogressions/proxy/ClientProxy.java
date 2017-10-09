package com.kashdeya.tinyprogressions.proxy;

import com.arclighttw.utilities.IProxy;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthRenderer;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeRenderer;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeTwoRenderer;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechFoods;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowth;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgrade;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgradeTwo;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements IProxy
{
	@Override
	public void onPreInitialization(FMLPreInitializationEvent event)
	{
		if (ConfigHandler.BlockGrowth) {
			TinyProgressions.instance.renderTESR(TileEntityGrowth.class, new TileEntityGrowthRenderer());
		}
		if (ConfigHandler.BlockGrowthUpgrade) {
		    TinyProgressions.instance.renderTESR(TileEntityGrowthUpgrade.class, new TileEntityGrowthUpgradeRenderer());
		    TinyProgressions.instance.renderStateMap(TechBlocks.growth_upgrade, new StateMap.Builder().ignore(new IProperty[] { BlockLiquid.LEVEL }).build());
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo) {
			TinyProgressions.instance.renderTESR(TileEntityGrowthUpgradeTwo.class, new TileEntityGrowthUpgradeTwoRenderer());
			TinyProgressions.instance.renderStateMap(TechBlocks.growth_upgrade_two, new StateMap.Builder().ignore(new IProperty[] { BlockLiquid.LEVEL }).build());
		}
		
		TechItems.render();
		TechBlocks.render();
		TechArmor.render();
		TechTools.render();
		TechFoods.render();
	}

	@Override
	public void onInitialization(FMLInitializationEvent event)
	{
	}

	@Override
	public void onPostInitialization(FMLPostInitializationEvent event)
	{
	}
}
