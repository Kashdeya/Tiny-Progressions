package com.kashdeya.tinyprogressions.container;

import com.google.common.collect.Lists;
import com.kashdeya.tinyprogressions.inits.TechContainers;

import net.minecraft.client.util.RecipeBookCategories;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.AbstractFurnaceContainer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IIntArray;

public class OreDoublerContainer extends AbstractFurnaceContainer{

   public OreDoublerContainer(int p_i50082_1_, PlayerInventory p_i50082_2_) {
	   super(TechContainers.iron_furnace_container.get(), IRecipeType.SMELTING, p_i50082_1_, p_i50082_2_);
   }
	
    public OreDoublerContainer (int windowId, PlayerInventory inv, PacketBuffer data) 
    { 
    	super(TechContainers.iron_furnace_container.get(), IRecipeType.SMELTING, windowId, inv);
   	} 
    
	public OreDoublerContainer(int windowId, PlayerInventory playerInventory, IInventory tileentityInventory, IIntArray furnaceData) 
	{
		super(TechContainers.iron_furnace_container.get(), IRecipeType.SMELTING, windowId, playerInventory, tileentityInventory, furnaceData);
	}
	
   public java.util.List<net.minecraft.client.util.RecipeBookCategories> getRecipeBookCategories() {
	   return Lists.newArrayList(RecipeBookCategories.FURNACE_SEARCH, RecipeBookCategories.FURNACE_FOOD, RecipeBookCategories.FURNACE_BLOCKS, RecipeBookCategories.FURNACE_MISC); 
   }
}
