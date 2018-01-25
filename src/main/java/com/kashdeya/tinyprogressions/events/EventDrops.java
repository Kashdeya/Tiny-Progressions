package com.kashdeya.tinyprogressions.events;

import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.block.BlockDirt;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventDrops {
	
	@SubscribeEvent
	public static void blockBreak(BlockEvent.HarvestDropsEvent event) {
		
		if(ConfigHandler.BoneDrops) {
			if (event.getState().getBlock() instanceof BlockDirt){
				event.getDrops().add(new ItemStack(Items.BONE, ConfigHandler.BoneAmmount));
				event.setDropChance(ConfigHandler.BoneDropsChance);
			}
		}
			
		if(ConfigHandler.SkullDrops) {
			if (event.getState().getBlock() instanceof BlockDirt){
				event.getDrops().add(new ItemStack(Items.SKULL, ConfigHandler.SkullAmmount));
				event.setDropChance(ConfigHandler.SkullDropsChance);
			}
		}
	}
	
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.HarvestDropsEvent event) {
		if (ConfigHandler.stickDrops) {
			if (event.getState().getBlock().isLeaves(event.getState(), event.getWorld(), event.getPos())) {
				EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Items.STICK, ConfigHandler.stickDropsAmmount));
				event.setDropChance(ConfigHandler.stickDropsChance);
				event.getWorld().spawnEntity(item);
				}
		}
		
		
		if (ConfigHandler.appleDrops) {
			if (event.getState().getBlock().isLeaves(event.getState(), event.getWorld(), event.getPos())) {
				EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Items.APPLE, ConfigHandler.appleDropsAmmount));
				event.setDropChance(ConfigHandler.appleDropsChance);
				event.getWorld().spawnEntity(item);
				}
		}
		
	}
	
	@SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onLivingDrops(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityDragon && ArmorHandler.dragon_armor) {
            registerMobDrop(event, event.getEntity(), ArmorHandler.dragon_armor, new ItemStack(TechItems.dragon_scale, new Random().nextInt(16)));
        } else if (event.getEntity() instanceof EntityWither && (ArmorHandler.wither_armor || ConfigHandler.wither_rib)) {
            registerMobDrop(event, event.getEntity(), ArmorHandler.wither_armor, new ItemStack(TechItems.wither_rib, new Random().nextInt(6)));
        }
    }

    private static void registerMobDrop(LivingDropsEvent event, Entity entity, boolean enableDrop, ItemStack drop) {
        if (enableDrop) {
            event.getEntityLiving().entityDropItem(drop, 0.0f);
        }
    }
}
