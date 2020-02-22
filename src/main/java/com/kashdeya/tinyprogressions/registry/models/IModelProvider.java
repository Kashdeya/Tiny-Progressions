package com.kashdeya.tinyprogressions.registry.models;

import javafx.geometry.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IModelProvider
{
	@SideOnly(Side.CLIENT)
	IRuntimeModel createModel();
}
