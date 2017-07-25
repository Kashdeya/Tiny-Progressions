package com.kashdeya.tinyprogressions.events;

import java.util.List;

import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.IExtendedReach;
import com.kashdeya.tinyprogressions.util.MessageExtendedReachAttack;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class IReachEvent {
	
	  @SideOnly(Side.CLIENT)
	  @SubscribeEvent(priority=EventPriority.HIGHEST, receiveCanceled=true)
	  public void onEvent(MouseEvent event)
	  {
	    if ((event.getButton() == 0) && (event.isButtonstate()))
	    {
	      Minecraft mc = Minecraft.getMinecraft();
	      EntityPlayer thePlayer = mc.thePlayer;
	      if (thePlayer != null)
	      {
	        ItemStack itemstack = thePlayer.getHeldItem(EnumHand.MAIN_HAND);
	        if (itemstack != null)
	        {
	          IExtendedReach ieri;
	          //IExtendedReach ieri;
	          if ((itemstack.getItem() instanceof IExtendedReach)) {
	            ieri = (IExtendedReach)itemstack.getItem();
	          } else {
	            ieri = null;
	          }
	          if (ieri != null)
	          {
	            float reach = ieri.getReach();
	            RayTraceResult mov = getMouseOverExtended(reach);
	            if (mov != null) {
	              if ((mov.entityHit != null) && (mov.entityHit.hurtResistantTime == 0)) {
	                if (mov.entityHit != thePlayer) {
	                  TinyProgressions.network.sendToServer(new MessageExtendedReachAttack(mov.entityHit
	                    .getEntityId()));
	                }
	              }
	            }
	          }
	        }
	      }
	    }
	  }
	  
	  public static RayTraceResult getMouseOverExtended(float dist)
	  {
	    Minecraft mc = FMLClientHandler.instance().getClient();
	    Entity theRenderViewEntity = mc.getRenderViewEntity();
	    AxisAlignedBB theViewBoundingBox = new AxisAlignedBB(theRenderViewEntity.posX - 0.5D, theRenderViewEntity.posY - 0.0D, theRenderViewEntity.posZ - 0.5D, theRenderViewEntity.posX + 0.5D, theRenderViewEntity.posY + 1.5D, theRenderViewEntity.posZ + 0.5D);
	    
	    RayTraceResult returnMOP = null;
	    if (mc.theWorld != null)
	    {
	      double var2 = dist;
	      returnMOP = theRenderViewEntity.rayTrace(var2, 0.0F);
	      double calcdist = var2;
	      Vec3d pos = theRenderViewEntity.getPositionEyes(0.0F);
	      var2 = calcdist;
	      if (returnMOP != null) {
	        calcdist = returnMOP.hitVec.distanceTo(pos);
	      }
	      Vec3d lookvec = theRenderViewEntity.getLook(0.0F);
	      Vec3d var8 = pos.addVector(lookvec.xCoord * var2, lookvec.yCoord * var2, lookvec.zCoord * var2);
	      
	      Entity pointedEntity = null;
	      float var9 = 1.0F;
	      
	      List<Entity> list = mc.theWorld.getEntitiesWithinAABBExcludingEntity(theRenderViewEntity, theViewBoundingBox
	      
	        .addCoord(lookvec.xCoord * var2, lookvec.yCoord * var2, lookvec.zCoord * var2)
	        
	        .expand(var9, var9, var9));
	      double d = calcdist;
	      for (Entity entity : list) {
	        if (entity.canBeCollidedWith())
	        {
	          float bordersize = entity.getCollisionBorderSize();
	          AxisAlignedBB aabb = new AxisAlignedBB(entity.posX - entity.width / 2.0F, entity.posY, entity.posZ - entity.width / 2.0F, entity.posX + entity.width / 2.0F, entity.posY + entity.height, entity.posZ + entity.width / 2.0F);
	          
	          aabb.expand(bordersize, bordersize, bordersize);
	          RayTraceResult mop0 = aabb.calculateIntercept(pos, var8);
	          if (aabb.isVecInside(pos))
	          {
	            if ((0.0D < d) || (d == 0.0D))
	            {
	              pointedEntity = entity;
	              d = 0.0D;
	            }
	          }
	          else if (mop0 != null)
	          {
	            double d1 = pos.distanceTo(mop0.hitVec);
	            if ((d1 < d) || (d == 0.0D))
	            {
	              pointedEntity = entity;
	              d = d1;
	            }
	          }
	        }
	      }
	      if ((pointedEntity != null) && ((d < calcdist) || (returnMOP == null))) {
	        returnMOP = new RayTraceResult(pointedEntity);
	      }
	    }
	    return returnMOP;
	  }
	}

