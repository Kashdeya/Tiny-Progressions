package com.kashdeya.tinyprogressions.handlers.recipehandler;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class RecipeFurnaceNBT extends FurnaceRecipe {
	
	CompoundNBT  resultNBT;
	
	public RecipeFurnaceNBT(ResourceLocation idIn, String groupIn, Ingredient ingredientIn, ItemStack resultIn, float experienceIn, int cookTimeIn) {
		super(idIn, groupIn, ingredientIn, resultIn, experienceIn, cookTimeIn);
		
	}

	
	public static class Serializer extends net.minecraftforge.registries.ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<RecipeFurnaceNBT> {

		public final int cookTime = 200;
		
		@Override
		public RecipeFurnaceNBT read(ResourceLocation recipeId, JsonObject json) {
		      String s = JSONUtils.getString(json, "group", "");
		      JsonElement jsonelement = (JsonElement)(JSONUtils.isJsonArray(json, "ingredient") ? JSONUtils.getJsonArray(json, "ingredient") : JSONUtils.getJsonObject(json, "ingredient"));
		      Ingredient ingredient = Ingredient.deserialize(jsonelement);
		      //Forge: Check if primitive string to keep vanilla or a object which can contain a count field.
		      if (!json.has("result")) throw new com.google.gson.JsonSyntaxException("Missing result, expected to find a string or object");
		      ItemStack itemstack;
		      if (json.get("result").isJsonObject()) itemstack = ShapedRecipe.deserializeItem(JSONUtils.getJsonObject(json, "result"));
		      else {
		      String s1 = JSONUtils.getString(json, "result");
		      ResourceLocation resourcelocation = new ResourceLocation(s1);
		      itemstack = new ItemStack(Registry.ITEM.getValue(resourcelocation).orElseThrow(() -> {
		         return new IllegalStateException("Item: " + s1 + " does not exist");
		      }));
		      }
		      if(json.has("resultNBT") && json.get("resultNBT").isJsonObject()) {
		    	  CompoundNBT tag = new CompoundNBT();
		    	  System.out.print(json.get("resultNBT").getAsJsonObject().toString());
				try {
					tag = JsonToNBT.getTagFromJson(json.get("resultNBT").getAsJsonObject().toString());
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
				}
				if(!tag.isEmpty())
		    	  itemstack.setTag(tag);
		      }
		      float f = JSONUtils.getFloat(json, "experience", 0.0F);
		      int i = JSONUtils.getInt(json, "cookingtime", cookTime);
			return new RecipeFurnaceNBT(recipeId, s, ingredient, itemstack, f, i) ;
		}


		@Override
		public RecipeFurnaceNBT read(ResourceLocation recipeId, PacketBuffer buffer) {
		      String s = buffer.readString(32767);
		      Ingredient ingredient = Ingredient.read(buffer);
		      ItemStack itemstack = buffer.readItemStack();
		      float f = buffer.readFloat();
		      int i = buffer.readVarInt();
			return  new RecipeFurnaceNBT(recipeId, s, ingredient, itemstack, f, i) ;
		}

		@Override
		public void write(PacketBuffer buffer, RecipeFurnaceNBT recipe) {
		      buffer.writeString(recipe.group);
		      recipe.ingredient.write(buffer);
		      buffer.writeItemStack(recipe.result);
		      buffer.writeFloat(recipe.experience);
		      buffer.writeVarInt(recipe.cookTime);
		}
	
	}

}