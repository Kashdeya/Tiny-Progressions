package com.kashdeya.tinyprogressions.events;

import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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
			if (ConfigHandler.BoneDrops)
			{
				if(target == Blocks.DIRT)
				{
					if(CHANCE.nextFloat()<ConfigHandler.BoneDropsChance)
					{
						event.getDrops().add(new ItemStack(Items.BONE,AMOUNT.nextInt(ConfigHandler.BoneAmmount)));
						if (CHANCE.nextFloat()<ConfigHandler.SkullDropsChance && ConfigHandler.SkullDrops)
						{
							event.getDrops().add(new ItemStack(Items.SKULL,AMOUNT.nextInt(ConfigHandler.SkullAmmount)));
							
						}
					}
				}
			}
			
			// Stick Drops
			if (ConfigHandler.stickDrops)
			{
				if(target == Blocks.LEAVES || target == Blocks.LEAVES2)
				{
					if(CHANCE.nextFloat()<ConfigHandler.stickDropsChance)
					{
						event.getDrops().add(new ItemStack(Items.STICK,AMOUNT.nextInt(ConfigHandler.stickDropsAmmount)));
					}
				}
			}
		}
	}
	
	@SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onLivingDrops(LivingDropsEvent event) {
		int min = 0;
		int max = 4;
        if (event.getEntity() instanceof EntityDragon) {
            registerMobDrop(event, event.getEntity(), ArmorHandler.dragon_armor, new ItemStack(TechItems.dragon_scale, AMOUNT.nextInt(16)));
        } else if (event.getEntity() instanceof EntityWither) {
            registerMobDrop(event, event.getEntity(), ArmorHandler.wither_armor, new ItemStack(TechItems.wither_rib, AMOUNT.nextInt(max - min + 1) + min));
        }
    }

    private static void registerMobDrop(LivingDropsEvent event, Entity entity, boolean enableDrop, ItemStack drop) {
        if (enableDrop) {
            event.getEntityLiving().entityDropItem(drop, 0.0f);
        }
    }
}
