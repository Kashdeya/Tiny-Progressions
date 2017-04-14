package com.kashdeya.tinyprogressions.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import com.kashdeya.tinyprogressions.handlers.RenderHandler;

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
        RenderHandler.initFoods();
	}
    
    public EntityPlayerMP getPlayerEntityFromContext(MessageContext ctx)
    {
      return (EntityPlayerMP)(ctx.side.isClient() ? Minecraft.getMinecraft().thePlayer : ctx.getServerHandler().playerEntity);
    }
}
