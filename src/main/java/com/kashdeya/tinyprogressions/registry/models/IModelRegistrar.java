package com.kashdeya.tinyprogressions.registry.models;

import javafx.geometry.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IModelRegistrar
{
	@SideOnly(Side.CLIENT)
	void registerModels();
}
