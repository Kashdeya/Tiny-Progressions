package com.kashdeya.tinyprogressions.events;

import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechFoods;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class EventDrops {
	
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.HarvestDropsEvent event) {
		
		
		Block target = event.getState().getBlock();
		int trigger = event.getWorld().getRandom().nextInt(1000);
		//OreDict.hasTag("leaves", target) ||
		if (target instanceof LeavesBlock) {
			if(trigger < ConfigHandler.peachDropsChance && ConfigHandler.extra_drops) {
				ItemEntity item = new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(TechFoods.plump_peach.get(), ConfigHandler.peachDropsAmount));
				event.getWorld().addEntity(item);
			}
			
			if(trigger < ConfigHandler.pearDropsChance && ConfigHandler.extra_drops) {
				ItemEntity item = new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(TechFoods.plump_pear.get(), ConfigHandler.pearDropsAmount));
				event.getWorld().addEntity(item);
			}
			
			if(trigger < ConfigHandler.appleDropsChance && ConfigHandler.extra_drops_vanilla) {
				ItemEntity item = new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Items.APPLE, ConfigHandler.appleDropsAmount));
				event.getWorld().addEntity(item);
			}
			
			if(trigger < ConfigHandler.stickDropsChance && ConfigHandler.extra_drops_vanilla) {
				ItemEntity item = new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Items.STICK, ConfigHandler.stickDropsAmount));
				event.getWorld().addEntity(item);
			}
		}
		
		if (target == Blocks.DIRT || target == Blocks.GRASS || Tags.Blocks.DIRT.getEntries().contains(target) || target instanceof GrassBlock) {
			if(trigger < ConfigHandler.BoneDropsChance && ConfigHandler.BoneDrops) {
				ItemEntity item = new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Items.BONE, ConfigHandler.BoneAmount));
				event.getWorld().addEntity(item);
			}
			
			if(trigger < ConfigHandler.SkullDropsChance && ConfigHandler.SkullDrops) {
				ItemEntity item = new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Items.SKELETON_SKULL, ConfigHandler.SkullAmount));
				event.getWorld().addEntity(item);
			}
		}
	}
	
	@SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onLivingDrops(LivingDropsEvent event) {
        if (event.getEntity() instanceof EnderDragonEntity && ArmorHandler.dragon_armor) {
            registerMobDrop(event, event.getEntity(), true, new ItemStack(TechItems.dragon_scale.get(), new Random().nextInt(16)));
        } else if (event.getEntity() instanceof WitherEntity && ConfigHandler.wither_rib) {
            registerMobDrop(event, event.getEntity(), true, new ItemStack(TechItems.wither_rib.get(), new Random().nextInt(6)));
        }
    }

    private static void registerMobDrop(LivingDropsEvent event, Entity entity, boolean enableDrop, ItemStack drop) {
        if (enableDrop) {
            event.getEntityLiving().entityDropItem(drop, 0.0f);
        }
    }
}
