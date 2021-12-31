package com.kashdeya.tinyprogressions.handlers.recipehandler;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.kashdeya.tinyprogressions.inits.TechFoods;
import com.kashdeya.tinyprogressions.inits.TechRecipeSerializer;

import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ICraftingRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.RecipeItemHelper;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class JuicerRecipe implements ICraftingRecipe {
	   static int MAX_WIDTH = 3;
	   static int MAX_HEIGHT = 3;
	
	   private final ResourceLocation id;
	   private final String group;
	   private final ItemStack recipeOutput;
	   private final NonNullList<Ingredient> recipeItems;
	   private final boolean isSimple;
	   
   public JuicerRecipe(ResourceLocation idIn, String groupIn, ItemStack recipeOutputIn, NonNullList<Ingredient> recipeItemsIn) {
	      this.id = idIn;
	      this.group = groupIn;
	      this.recipeOutput = recipeOutputIn;
	      this.recipeItems = recipeItemsIn;
	      this.isSimple = recipeItemsIn.stream().allMatch(Ingredient::isSimple);
	   }
	
   @Override
   public ResourceLocation getId() {
      return this.id;
   }
   
   @Override
   public IRecipeSerializer<?> getSerializer() {
      return TechRecipeSerializer.Juicer.get();
   }

   @Override
   public String getGroup() {
      return this.group;
   }


   @Override
   public ItemStack getResultItem() {
      return this.recipeOutput;
   }
   
   @Override
   public NonNullList<Ingredient> getIngredients() {
      return this.recipeItems;
   }

   @Override
   public boolean matches(CraftingInventory inv, World worldIn) {
      RecipeItemHelper recipeitemhelper = new RecipeItemHelper();
      java.util.List<ItemStack> inputs = new java.util.ArrayList<>();
      int i = 0;

      for(int j = 0; j < inv.getContainerSize(); ++j) {
         ItemStack itemstack = inv.getItem(j);
         if (!itemstack.isEmpty()) {
            ++i;
            if (isSimple)
            recipeitemhelper.accountStack(itemstack, 1);
            else inputs.add(itemstack);
         }
      }

      return i == this.recipeItems.size() && (isSimple ? recipeitemhelper.canCraft(this, (IntList)null) : net.minecraftforge.common.util.RecipeMatcher.findMatches(inputs,  this.recipeItems) != null);
   }
   
   
   @Override
   public ItemStack assemble(CraftingInventory inv) {
	  ItemStack juicerOutput = ItemStack.EMPTY;
      for(int j = 0; j < inv.getContainerSize(); ++j) {
         ItemStack itemstack = inv.getItem(j);
         if(ItemStack.isSame(itemstack, new ItemStack(TechFoods.Juicer.get()))) { 
        	 juicerOutput = itemstack;
        	 break;
         }
      }
    
      return this.recipeOutput.copy();
   }

   public boolean canFit(int width, int height) {
      return width * height >= this.recipeItems.size();
   }

	
	
   public static class Serializer extends net.minecraftforge.registries.ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<JuicerRecipe> {
	      private static final ResourceLocation NAME = new ResourceLocation("minecraft", "crafting_shapeless");
	  	
	      @Override
	      public JuicerRecipe fromJson(ResourceLocation recipeId, JsonObject json) {
	         String s = JSONUtils.getAsString(json, "group", "");
	         NonNullList<Ingredient> nonnulllist = readIngredients(JSONUtils.getAsJsonArray(json, "ingredients"));
	         if (nonnulllist.isEmpty()) {
	            throw new JsonParseException("No ingredients for shapeless recipe");
	         } else if (nonnulllist.size() > JuicerRecipe.MAX_WIDTH * JuicerRecipe.MAX_HEIGHT) {
	             throw new JsonParseException("Too many ingredients for shapeless recipe the max is " + (JuicerRecipe.MAX_WIDTH * JuicerRecipe.MAX_HEIGHT));
	         } else {
	            ItemStack itemstack = ShapedRecipe.itemFromJson(JSONUtils.getAsJsonObject(json, "result"));
	            return new JuicerRecipe(recipeId, s, itemstack, nonnulllist);
	         }
	      }

	      private static NonNullList<Ingredient> readIngredients(JsonArray p_199568_0_) {
	         NonNullList<Ingredient> nonnulllist = NonNullList.create();

	         for(int i = 0; i < p_199568_0_.size(); ++i) {
	            Ingredient ingredient = Ingredient.fromJson(p_199568_0_.get(i));
	            if (!ingredient.isEmpty()) {
//	            	if (!ingredient.hasNoMatchingItems()) {
	               nonnulllist.add(ingredient);
	            }
	         }

	         return nonnulllist;
	      }

	      @Override
	      public JuicerRecipe fromNetwork(ResourceLocation recipeId, PacketBuffer buffer) {
	         String s = buffer.readUtf(32767);
	         int i = buffer.readVarInt();
	         NonNullList<Ingredient> nonnulllist = NonNullList.withSize(i, Ingredient.EMPTY);

	         for(int j = 0; j < nonnulllist.size(); ++j) {
	            nonnulllist.set(j, Ingredient.fromNetwork(buffer));
	         }

	         ItemStack itemstack = buffer.readItem();
	         return new JuicerRecipe(recipeId, s, itemstack, nonnulllist);
	      }

	      @Override
	      public void toNetwork(PacketBuffer buffer, JuicerRecipe recipe) {
	         buffer.writeUtf(recipe.group);
	         buffer.writeVarInt(recipe.recipeItems.size());

	         for(Ingredient ingredient : recipe.recipeItems) {
	            ingredient.toNetwork(buffer);
	         }

	         buffer.writeItem(recipe.recipeOutput);
	      }


	   }


@Override
public boolean canCraftInDimensions(int p_194133_1_, int p_194133_2_) {
	return true;
}



}
