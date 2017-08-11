package com.kashdeya.tinyprogressions.gui;

import com.kashdeya.tinyprogressions.capabilities.IStorage;
import com.kashdeya.tinyprogressions.container.PouchContainer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;

public class PouchGui extends GuiContainer
{
    private final ResourceLocation texture = new ResourceLocation("minecraft", "textures/gui/container/generic_54.png");
    
    private IStorage storage;
 
    public PouchGui(IStorage storage, EntityPlayer player)
    {
        super(new PouchContainer(storage, player));
        this.storage = storage;
        ySize = 222;
    }
 
    @Override
    public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
 
    @Override
    public void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        drawCenteredString(fontRenderer, new TextComponentTranslation("item." + storage.getName()).getFormattedText(), xSize / 2, 5, 0xFFFFFF);
        drawString(fontRenderer, new TextComponentTranslation("container.inventory").getFormattedText(), 6, 128, 0xFFFFFF);
    }
    
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        renderHoveredToolTip(mouseX, mouseY);
    }
}