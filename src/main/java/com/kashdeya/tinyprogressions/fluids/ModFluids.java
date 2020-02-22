package com.kashdeya.tinyprogressions.fluids;

import java.lang.reflect.Field;

import com.kashdeya.tinyprogressions.main.Reference;

import javafx.geometry.Side;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModFluids {

	public static final ModFluids INSTANCE = new ModFluids();

	public static Fluid VASHOLINE = new Fluid("vasholine", new ResourceLocation(Reference.MOD_ID, "fluids/wub_juice_still"), new ResourceLocation(Reference.MOD_ID, "fluids/wub_juice_flow")).setDensity(3000).setViscosity(1500).setUnlocalizedName("vasholine");

	private ModFluids() {
	}

	public static void init() {
		try {
			for (Field f : ModFluids.class.getDeclaredFields()) {
				Object obj = f.get(null);
				if (obj instanceof Fluid) {
					Fluid fluid = (Fluid) obj;
					if (FluidRegistry.isFluidRegistered(fluid.getName()))
						f.set(null, FluidRegistry.getFluid(fluid.getName()));
					else {
						FluidRegistry.registerFluid(fluid);
						FluidRegistry.addBucketForFluid(fluid);
					}
				}
			}
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onTextureStitchPre(TextureStitchEvent.Pre event) {
		event.getMap().registerSprite(VASHOLINE.getStill());
		event.getMap().registerSprite(VASHOLINE.getFlowing());
	}
}