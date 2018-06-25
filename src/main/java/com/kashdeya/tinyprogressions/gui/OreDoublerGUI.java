package com.kashdeya.tinyprogressions.gui;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.GL11;

import com.kashdeya.tinyprogressions.container.OreDoublerContainer;
import com.kashdeya.tinyprogressions.main.Reference;
import com.kashdeya.tinyprogressions.tiles.TileEntityOreDoubler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;

public class OreDoublerGUI extends GuiContainer
{

    private static final ResourceLocation FURNACE_GUI_TEXTURES = new ResourceLocation(Reference.MOD_ID, "textures/gui/container/furnace_inventory.png");
	TileEntityOreDoubler oredoubler;
	InventoryPlayer playerinventory;
	
	public OreDoublerGUI(InventoryPlayer inventory, TileEntityOreDoubler tile) 
	{
		super(new OreDoublerContainer(inventory, tile, Minecraft.getMinecraft().player));
		xSize = 176;
		ySize = 166;
		this.oredoubler = tile;
		playerinventory = inventory;
	}

	int time;
	int rfEnergyLevels = 0;

	List<String> hover =  new ArrayList<String>();
	DecimalFormat formatter = new DecimalFormat("#,###");	

	
	

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
//        String s = this.oredoubler.getDisplayName().getUnformattedText();
//        this.fontRenderer.drawString(s, this.xSize / 2 - this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
        this.fontRenderer.drawString(this.playerinventory.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
    } 
	
	  /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }
    
	
    /**
     * Draws the background layer of this container (behind the items).
     */
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(FURNACE_GUI_TEXTURES);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);

        if (TileEntityOreDoubler.isBurning(this.oredoubler))
        {
            int k = this.getBurnLeftScaled(13);
            this.drawTexturedModalRect(i + 56, j + 36 + 12 - k, 176, 12 - k, 14, k + 1);
        }

        int l = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(i + 79, j + 34, 176, 14, l + 1, 16);
    }

    private int getCookProgressScaled(int pixels)
    {
        int i = this.oredoubler.getField(2);
        int j = this.oredoubler.getField(3);
        return j != 0 && i != 0 ? i * pixels / j : 0;
    }

    private int getBurnLeftScaled(int pixels)
    {
        int i = this.oredoubler.getField(1);

        if (i == 0)
        {
            i = 200;
        }

        return this.oredoubler.getField(0) * pixels / i;
    }
    
}
    