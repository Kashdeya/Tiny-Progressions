package com.kashdeya.tinyprogressions.items.misc;

import com.kashdeya.tinyprogressions.items.ItemStay;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemJuicer extends ItemStay implements IOreDictEntry {
	
	public ItemJuicer(Properties prop) {
		super(prop.maxStackSize(1));
	}

	@SubscribeEvent
	public static void onCrafting(PlayerDestroyItemEvent e) { }
	
	@Override
	public String getOreDictName() {
		return "juicer";
	}
	
}
