package com.kashdeya.tinyprogressions.crafting;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

public class ConfigEnabledCondition implements IConditionFactory
{
	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json)
	{
		String key = JsonUtils.getString(json, "config");		
		return () -> ConfigHandler.parse(key);
	}
}
