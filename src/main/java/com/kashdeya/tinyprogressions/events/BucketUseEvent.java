package com.kashdeya.tinyprogressions.events;

import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BucketUseEvent {
    @SubscribeEvent
    public static void onBucketUse(FillBucketEvent event)
    {
        if (event.getTarget() != null)
        {
            if (event.getTarget().getType() == RayTraceResult.Type.BLOCK)
            {
            	Vec3d hitvec = event.getTarget().getHitVec();
                if (event.getWorld().getBlockState(new BlockPos(hitvec.getX(), hitvec.getY(), hitvec.getZ())).getBlock() == TechBlocks.growth_upgrade)
                {
                    event.setCanceled(true);
                }
            }
        }
    }
    
    @SubscribeEvent
    public static void onBucket(FillBucketEvent event)
    {
        if (event.getTarget() != null)
        {
            if (event.getTarget().getType() == RayTraceResult.Type.BLOCK)
            {
            	Vec3d hitvec = event.getTarget().getHitVec();
                if (event.getWorld().getBlockState(new BlockPos(hitvec.getX(), hitvec.getY(), hitvec.getZ())).getBlock() == TechBlocks.growth_upgrade_two)
                {
                    event.setCanceled(true);
                }
            }
        }
    }
}
