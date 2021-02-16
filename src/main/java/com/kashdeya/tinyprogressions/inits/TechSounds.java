package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.main.Reference;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber
public class TechSounds {
	
	private static ResourceLocation  succulateDrink = new ResourceLocation(Reference.MOD_ID, "suckthepearls");
	
	@ObjectHolder("tp:succ")
	public static SoundEvent SUCULANT_DRINK = new SoundEvent(succulateDrink);

	public static RegistryObject<SoundEvent> SUCULANT_DRINK_OBJ = TinyProgressions.SOUNDS.register("succ", () -> SUCULANT_DRINK);


}
