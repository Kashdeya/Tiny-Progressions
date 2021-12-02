package com.kashdeya.tinyprogressions.gui;

import com.kashdeya.tinyprogressions.capabilities.InventoryStorage;
import com.kashdeya.tinyprogressions.container.PouchContainer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public abstract class PouchGui extends ContainerScreen<PouchContainer>
{
    private final ResourceLocation texture = new ResourceLocation("minecraft", "textures/gui/container/generic_54.png");
    
    private InventoryStorage storage;
 
    public PouchGui(PouchContainer container,  PlayerInventory inventory, ITextComponent titleIn)
    {
        super(container, inventory, titleIn);
//        this.storage = storage2;
//        ySize = 222;
//        this.s
    }

    public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        Minecraft.getInstance().getTextureManager().bind(texture);
//        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }

    public void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
//        drawCenteredString(fontRenderer, new TextComponentTranslation("item." + storage.getName()).getFormattedText(), xSize / 2, 5, 0xFFFFFF);
//        drawString(fontRenderer, new TextComponentTranslation("container.inventory").getFormattedText(), 6, 128, 0xFFFFFF);
    }
    
//    @Override
//    public void drawScreen(int mouseX, int mouseY, float partialTicks)
//    {
//        drawDefaultBackground();
//        super.drawScreen(mouseX, mouseY, partialTicks);
//        renderHoveredToolTip(mouseX, mouseY);
//    }
}