package com.kashdeya.tinyprogressions.events;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.kashdeya.tinyprogressions.blocks.BlockGrowthUpgrade;

public class BucketUseEvent {
    @SubscribeEvent
    public void onPlayerUsingBucket(FillBucketEvent event) {
        if (event.getEntity() instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP) event.getEntity();
            IBlockState state = event.getWorld().getBlockState(event.getTarget().getBlockPos());
            if (state != null) {
                if (state.getBlock() instanceof BlockGrowthUpgrade) {
                    event.setCanceled(true);
                }
            }
        }
    }
}
