package com.kashdeya.tinyprogressions.registry.models;

import net.minecraft.client.renderer.model.IBakedModel;

public interface IRuntimeModel
{
	IBakedModel createModel(final IBakedModel existing);
}
