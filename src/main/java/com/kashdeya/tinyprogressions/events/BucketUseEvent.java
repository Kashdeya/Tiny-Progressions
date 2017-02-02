package com.kashdeya.tinyprogressions.events;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.kashdeya.tinyprogressions.blocks.BlockGrowthUpgrade;
import com.kashdeya.tinyprogressions.blocks.BlockGrowthUpgradeTwo;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

public class BucketUseEvent {
    @SubscribeEvent
    public void onPlayerUsingBucket(FillBucketEvent event) {
    	if (ConfigHandler.BlockGrowthUpgrade || ConfigHandler.BlockGrowthUpgradeTwo){
    		if (event.getEntity() != null && event.getEntity() instanceof EntityPlayer) {
    			IBlockState state = event.getWorld().getBlockState(event.getTarget().getBlockPos());
    			if (state != null) {
    				if (state.getBlock() instanceof BlockGrowthUpgrade || state.getBlock() instanceof BlockGrowthUpgradeTwo) {
    					event.setCanceled(true);
    				}
    			}
    		}
    	}
    }
}
