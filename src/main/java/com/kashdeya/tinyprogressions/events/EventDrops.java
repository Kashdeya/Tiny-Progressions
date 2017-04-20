package com.kashdeya.tinyprogressions.events;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

public class EventDrops {
	
	public static Random CHANCE = new java.util.Random();
	public static Random AMOUNT = new java.util.Random();

	
	@SubscribeEvent
	public void blockBreak(HarvestDropsEvent event)
	{
		World world = event.getWorld();
		if(!world.isRemote)
		{
			Block target = event.getState().getBlock();
			if (ConfigHandler.BoneDrops == true)
			{
				if(target == Blocks.DIRT)
				{
					if(CHANCE.nextFloat()<ConfigHandler.BoneDropsChance)
					{
						event.getDrops().add(new ItemStack(Items.BONE,AMOUNT.nextInt(ConfigHandler.BoneAmmount)));
						if (CHANCE.nextFloat()<ConfigHandler.SkullDropsChance && ConfigHandler.SkullDrops == true)
						{
							event.getDrops().add(new ItemStack(Items.SKULL,AMOUNT.nextInt(ConfigHandler.SkullAmmount)));
							
						}
					}
				}
			}
			
			// Stick Drops
			if (ConfigHandler.LeafDrops == true)
			{
				if(target == Blocks.LEAVES || target == Blocks.LEAVES2)
				{
					if(CHANCE.nextFloat()<ConfigHandler.LeafDropsChance)
					{
						event.getDrops().add(new ItemStack(Items.STICK,AMOUNT.nextInt(ConfigHandler.LeafDropsAmmount)));
					}
				}
			}
		}
	}	
}
