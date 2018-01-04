package com.kashdeya.tinyprogressions.util;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageExtendedReachAttack implements IMessage
{
	  private int entityId;
	  
	  public MessageExtendedReachAttack() {}
	  
	  public MessageExtendedReachAttack(int parEntityId)
	  {
	    entityId = parEntityId;
	    
	    System.out.println("Constructor");
	  }
	  
	  @Override
	  public void fromBytes(ByteBuf buf)
	  {
	    entityId = ByteBufUtils.readVarInt(buf, 4);
	    
	    System.out.println("fromBytes");
	  }
	  
	  @Override
	  public void toBytes(ByteBuf buf)
	  {
	    ByteBufUtils.writeVarInt(buf, entityId, 4);
	    
	    System.out.println("toBytes encoded");
	  }
	  
	  public static class Handler implements IMessageHandler<MessageExtendedReachAttack, IMessage>
	  {
		  @Override
		  public IMessage onMessage(final MessageExtendedReachAttack message, MessageContext ctx)
		  {
			  System.out.println("Message received");
	      
			  final EntityPlayerMP thePlayer = ctx.getServerHandler().player;
			  thePlayer.getServer().addScheduledTask(new Runnable()
			  {
				  @Override
				  public void run()
				  {
					  Entity theEntity = thePlayer.getEntityWorld().getEntityByID(message.entityId);
	          
					  System.out.println("Entity = " + theEntity);
					  if (thePlayer.getHeldItemMainhand() == null) {
						  return;
					  }
					  if (thePlayer.getHeldItemMainhand().getItem() instanceof IExtendedReach)
					  {
						  IExtendedReach theExtendedReachWeapon = (IExtendedReach)thePlayer.getHeldItemMainhand().getItem();
						  double distanceSq = thePlayer.getDistanceSq(theEntity);
	            
						  double reachSq = theExtendedReachWeapon.getReach() * theExtendedReachWeapon.getReach();
						  if (reachSq >= distanceSq) {
							  thePlayer.attackTargetEntityWithCurrentItem(theEntity);
						  }
					  }
					  return;
				  }
			  }
			 );
			  return null;
		  }
	  }
}