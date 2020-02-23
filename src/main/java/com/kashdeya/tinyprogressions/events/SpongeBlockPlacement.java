package com.kashdeya.tinyprogressions.events;

import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowthUpgrade;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowthUpgradeTwo;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.event.world.BlockEvent.EntityPlaceEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

//TODO double check this later. needs to set up subscribe events.
public class SpongeBlockPlacement {
	
    @SubscribeEvent
    public void onPlayerSpongePlacement(EntityPlaceEvent event) {
    	if (ConfigHandler.BlockGrowthUpgrade || ConfigHandler.BlockGrowthUpgradeTwo){
            if (event.getPlacedBlock().getBlock().asItem() != Items.AIR && event.getPlacedBlock().getBlock() == Blocks.SPONGE) {
                for (int x = -8; x <= 8; x++) {
                    for (int y = -8; y <= 8; y++) {
                        for (int z = -8; z <= 8; z++) {
                            BlockState state = event.getWorld().getBlockState(new BlockPos(event.getPos().getX() + x, event.getPos().getY() + y, event.getPos().getZ() + z));
                            if (state.getBlock() instanceof BlockGrowthUpgrade || state.getBlock() instanceof BlockGrowthUpgradeTwo) {
                                event.setCanceled(true);
                                //TODO add to translation
                                event.getEntity().sendMessage(new TranslationTextComponent("Cant place a sponge near a Growth Crystal"));
                            }
                        }
                    }
                }
            }
        }
    }
}
