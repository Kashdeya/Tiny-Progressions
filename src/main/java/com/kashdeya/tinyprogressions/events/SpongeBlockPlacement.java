package com.kashdeya.tinyprogressions.events;

import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowthUpgrade;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowthUpgradeTwo;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SpongeBlockPlacement {
	
    @SubscribeEvent
    public void onPlayerSpongePlacement(PlaceEvent event) {
    	if (ConfigHandler.BlockGrowthUpgrade || ConfigHandler.BlockGrowthUpgradeTwo){
            ItemStack itemstack = event.getPlayer().getHeldItem(event.getHand());
            if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.SPONGE)) {
                for (int x = -8; x <= 8; x++) {
                    for (int y = -8; y <= 8; y++) {
                        for (int z = -8; z <= 8; z++) {
                            IBlockState state = event.getWorld().getBlockState(new BlockPos(event.getPos().getX() + x, event.getPos().getY() + y, event.getPos().getZ() + z));
                            if (state.getBlock() instanceof BlockGrowthUpgrade || state.getBlock() instanceof BlockGrowthUpgradeTwo) {
                                event.setCanceled(true);
                                event.getPlayer().sendMessage(new TextComponentString("Cant place a sponge near a Growth Crystal"));
                            }
                        }
                    }
                }
            }
        }
    }
}
