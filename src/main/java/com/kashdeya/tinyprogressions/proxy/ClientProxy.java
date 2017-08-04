package com.kashdeya.tinyprogressions.proxy;

import com.kashdeya.tinyprogressions.handlers.RenderHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ClientProxy extends CommonProxy {

    @Override
	public void registerRenderers() {
    	// Renders
        RenderHandler.preInitBlocks();
        RenderHandler.initBlocks();
        RenderHandler.initBlockRenders();
        RenderHandler.initItems();
        RenderHandler.initArmor();
        RenderHandler.initTools();
	}
    
    @Override
    public void registerWorldRenderers() {
    	RenderHandler.initBlockWorldRenders();
    	RenderHandler.initItemHandRenders();
    }
    
    public EntityPlayerMP getPlayerEntityFromContext(MessageContext ctx)
    {
      return (EntityPlayerMP)(ctx.side.isClient() ? Minecraft.getMinecraft().player : ctx.getServerHandler().player);
    }
}
