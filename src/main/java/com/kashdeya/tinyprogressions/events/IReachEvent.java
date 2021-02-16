package com.kashdeya.tinyprogressions.events;


public class IReachEvent {

//    @SubscribeEvent(priority = EventPriority.HIGHEST, receiveCanceled = true)
//    public void onEvent(MouseInputEvent event) {
//        if ((event.getButton() == 0) && (event.isButtonstate())) {
//            Minecraft mc = Minecraft.getInstance();
//            PlayerEntity thePlayer = mc.player;
//            if (thePlayer != null) {
//                ItemStack itemstack = thePlayer.getHeldItem(Hand.MAIN_HAND);
//                if (!itemstack.isEmpty()) {
//                    IExtendedReach ieri;
//                    //IExtendedReach ieri;
//                    if ((itemstack.getItem() instanceof IExtendedReach)) {
//                        ieri = (IExtendedReach) itemstack.getItem();
//                    } else {
//                        ieri = null;
//                    }
//                    if (ieri != null) {
//                        float reach = ieri.getReach();
//                        RayTraceResult mov = getMouseOverExtended(reach);
//                        if (mov != null) {
//                            if ((mov.getHitVec() != null) && mov.getType() == Type.ENTITY) {
//                            	
////                            	if mov.entityHit.hurtResistantTime == 0
//                                if (mov.entityHit != thePlayer) {
//                                    TinyProgressions.network.sendToServer(new MessageExtendedReachAttack(mov.entityHit
//                                        .getEntityId()));
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    public static RayTraceResult getMouseOverExtended(float dist) {
//        Minecraft mc = FMLClientHandler.instance().getClient();
//        Entity theRenderViewEntity = mc.getRenderViewEntity();
//        AxisAlignedBB theViewBoundingBox = new AxisAlignedBB(theRenderViewEntity.posX - 0.5D, theRenderViewEntity.posY - 0.0D, theRenderViewEntity.posZ - 0.5D, theRenderViewEntity.posX + 0.5D, theRenderViewEntity.posY + 1.5D, theRenderViewEntity.posZ + 0.5D);
//
//        RayTraceResult returnMOP = null;
//        if (mc.world != null) {
//            double var2 = dist;
//            returnMOP = theRenderViewEntity.rayTrace(var2, 0.0F);
//            double calcdist = var2;
//            Vec3d pos = theRenderViewEntity.getPositionEyes(0.0F);
//            var2 = calcdist;
//            if (returnMOP != null) {
//                calcdist = returnMOP.hitVec.distanceTo(pos);
//            }
//            Vec3d lookvec = theRenderViewEntity.getLook(0.0F);
//            Vec3d var8 = pos.add(lookvec.x * var2, lookvec.y * var2, lookvec.z * var2);
//
//            Entity pointedEntity = null;
//            float var9 = 1.0F;
//            List<Entity> list = mc.world.getEntitiesWithinAABBExcludingEntity(theRenderViewEntity, theViewBoundingBox
//
//                .offset(lookvec.x * var2, lookvec.y * var2, lookvec.z * var2)
//
//                .expand(var9, var9, var9));
//            double d = calcdist;
//            for (Entity entity : list) {
//                if (entity.canBeCollidedWith()) {
//                    float bordersize = entity.getCollisionBorderSize();
//                    AxisAlignedBB aabb = new AxisAlignedBB(entity.posX - entity.width / 2.0F, entity.posY, entity.posZ - entity.width / 2.0F, entity.posX + entity.width / 2.0F, entity.posY + entity.height, entity.posZ + entity.width / 2.0F);
//
//                    aabb.expand(bordersize, bordersize, bordersize);
//                    RayTraceResult mop0 = aabb.calculateIntercept(pos, var8);
//                    if (aabb.contains(pos)) {
//                        if ((0.0D < d) || (d == 0.0D)) {
//                            pointedEntity = entity;
//                            d = 0.0D;
//                        }
//                    } else if (mop0 != null) {
//                        double d1 = pos.distanceTo(mop0.hitVec);
//                        if ((d1 < d) || (d == 0.0D)) {
//                            pointedEntity = entity;
//                            d = d1;
//                        }
//                    }
//                }
//            }
//            if ((pointedEntity != null) && ((d < calcdist) || (returnMOP == null))) {
//                returnMOP = new RayTraceResult(pointedEntity);
//            }
//        }
//        return returnMOP;
//    }
}

