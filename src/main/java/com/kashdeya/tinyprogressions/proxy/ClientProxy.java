package com.kashdeya.tinyprogressions.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFirework;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	@Override
	public void onPreInitialization(FMLPreInitializationEvent event)
	{
		super.onPreInitialization(event);
	}

	@Override
	public void onInitialization(FMLInitializationEvent event)
	{
		super.onInitialization(event);
	}

	@Override
	public void onPostInitialization(FMLPostInitializationEvent event)
	{
		super.onPostInitialization(event);
	}

	@Override
	public void spawnCustomParticle(String particleName, World world, double x, double y, double z, double vecX, double vecY, double vecZ) {
		Particle fx = null;

		if (particleName.equals("sparkles")) {
			fx = new ParticleFirework.Factory().createParticle(EnumParticleTypes.FIREWORKS_SPARK.getParticleID(), world, x, y, z, vecX, vecY, vecZ, 0);
			fx.setRBGColorF(0.9F, 0.9F, 0F);
			fx.setAlphaF(0.5F);
		}

		if (fx != null)
			Minecraft.getMinecraft().effectRenderer.addEffect(fx);
	}
}
