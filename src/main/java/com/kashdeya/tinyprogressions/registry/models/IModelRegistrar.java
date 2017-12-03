package com.kashdeya.tinyprogressions.registry.models;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IModelRegistrar
{
	@SideOnly(Side.CLIENT)
	void registerModels();
}
