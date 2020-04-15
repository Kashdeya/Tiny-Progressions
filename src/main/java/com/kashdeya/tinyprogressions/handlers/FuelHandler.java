package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.item.Item;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class FuelHandler 
//implements IFuelHandler 
{
	
	public static int CharcoalBlockBurn = 16000;
	public static int tiny_coal_burntime = 200;
	public static int tiny_charcoal_burntime = 200;
	public static int lava_block_burntime;
	
	@SubscribeEvent
	public static void burnTime(FurnaceFuelBurnTimeEvent event) {
		Item itemIn = event.getItemStack().getItem();
		
		if(itemIn == TechBlocks.charcoal_block.get().asItem())
			event.setBurnTime(CharcoalBlockBurn);
		else if(itemIn == TechBlocks.stone_torch.get().asItem())
				event.setBurnTime(150);
		else if(itemIn == TechItems.tiny_coal.get())
				event.setBurnTime(tiny_coal_burntime);
		else if(itemIn == TechItems.tiny_charcoal.get())
				event.setBurnTime(tiny_charcoal_burntime);
	}

}
