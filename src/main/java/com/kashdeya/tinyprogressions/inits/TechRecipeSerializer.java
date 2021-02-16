package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.handlers.recipehandler.RecipeShapedNBT;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class TechRecipeSerializer {

	public static RegistryObject<IRecipeSerializer<?>> Shaped_Recipe_NBT = TinyProgressions.RECIPEHANDLER.register("crafting_shaped_nbt", () -> new RecipeShapedNBT.Serializer());
	public static RegistryObject<IRecipeSerializer<?>> Juicer = TinyProgressions.RECIPEHANDLER.register("juicer_recipe", () -> new RecipeShapedNBT.Serializer());
}
