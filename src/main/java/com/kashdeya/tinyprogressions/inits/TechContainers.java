package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.container.OreDoublerContainer;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value= Dist.CLIENT)
public class TechContainers {

	public static RegistryObject<ContainerType<?>> iron_furnace_container = TinyProgressions.CONTAINERS.register("iron_furnace_container", () -> (IForgeContainerType.create(OreDoublerContainer::new)));

}
