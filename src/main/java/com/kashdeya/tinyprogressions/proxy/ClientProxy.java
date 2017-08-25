package com.kashdeya.tinyprogressions.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ClientProxy extends CommonProxy {
    public EntityPlayerMP getPlayerEntityFromContext(MessageContext ctx)
    {
      return (EntityPlayerMP)(ctx.side.isClient() ? Minecraft.getMinecraft().player : ctx.getServerHandler().player);
    }
}
