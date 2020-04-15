package com.kashdeya.tinyprogressions.events;

// This should no longer be needed.. since growth block is not faking as water anymore
public class SpongeBlockPlacement {
	
//    @SubscribeEvent
//    public void onPlayerSpongePlacement(EntityPlaceEvent event) {
//    	if (ConfigHandler.BlockGrowthUpgrade || ConfigHandler.BlockGrowthUpgradeTwo){
//            if (event.getPlacedBlock().getBlock().asItem() != Items.AIR && event.getPlacedBlock().getBlock() == Blocks.SPONGE) {
//                for (int x = -8; x <= 8; x++) {
//                    for (int y = -8; y <= 8; y++) {
//                        for (int z = -8; z <= 8; z++) {
//                            BlockState state = event.getWorld().getBlockState(new BlockPos(event.getPos().getX() + x, event.getPos().getY() + y, event.getPos().getZ() + z));
//                            if (state.getBlock() instanceof BlockGrowthUpgrade || state.getBlock() instanceof BlockGrowthUpgradeTwo) {
//                                event.setCanceled(true);
//                                //TODO add to translation
//                                event.getEntity().sendMessage(new TranslationTextComponent("Cant place a sponge near a Growth Crystal"));
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
}
