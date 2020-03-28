package com.kashdeya.tinyprogressions.gui;

import com.kashdeya.tinyprogressions.container.OreDoublerContainer;

import net.minecraft.client.gui.recipebook.FurnaceRecipeGui;
import net.minecraft.client.gui.screen.inventory.AbstractFurnaceScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class OreDoublerGUI extends AbstractFurnaceScreen<OreDoublerContainer>
{
    private static final ResourceLocation FURNACE_GUI_TEXTURES = new ResourceLocation("textures/gui/container/furnace.png");

	public OreDoublerGUI(OreDoublerContainer container, PlayerInventory inventory, ITextComponent titleIn) 
	{
		super(container,new FurnaceRecipeGui(), inventory, titleIn, FURNACE_GUI_TEXTURES);
	}

    
}
    