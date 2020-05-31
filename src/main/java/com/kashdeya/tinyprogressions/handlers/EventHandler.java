package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class EventHandler {

	private static ResourceLocation dirt = new ResourceLocation("minecraft", "blocks/grass");
	private static ResourceLocation oak_leaves = new ResourceLocation("minecraft", "blocks/oak_leaves");
	private static ResourceLocation birch_leaves = new ResourceLocation("minecraft", "blocks/birch_leaves");
	private static ResourceLocation dark_oak_leaves = new ResourceLocation("minecraft", "blocks/dark_oak_leaves");
	private static ResourceLocation jungle_leaves = new ResourceLocation("minecraft", "blocks/jungle_leaves");
	private static ResourceLocation spruce_leaves = new ResourceLocation("minecraft", "blocks/spruce_leaves");
	private static ResourceLocation acacia_leaves = new ResourceLocation("minecraft", "blocks/acacia_leaves");
	
	
	
    @SubscribeEvent
    public static void onLootLoad(LootTableLoadEvent event) {
        if (event.getName().equals(dirt)) {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Reference.MOD_ID, "blocks/dirt"))).build());
        }
        if (event.getName().equals(oak_leaves)) {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Reference.MOD_ID, "blocks/oak_leaves"))).build());
        }
        if (event.getName().equals(birch_leaves)) {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Reference.MOD_ID, "blocks/birch_leaves"))).build());
        }
        if (event.getName().equals(dark_oak_leaves)) {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Reference.MOD_ID, "blocks/dark_oak_leaves"))).build());
        }
        if (event.getName().equals(jungle_leaves)) {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Reference.MOD_ID, "blocks/jungle_leaves"))).build());
        }
        if (event.getName().equals(spruce_leaves)) {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Reference.MOD_ID, "blocks/spruce_leaves"))).build());
        }
        if (event.getName().equals(acacia_leaves)) {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Reference.MOD_ID, "blocks/acacia_leaves"))).build());
        }
    }
    
    
}
