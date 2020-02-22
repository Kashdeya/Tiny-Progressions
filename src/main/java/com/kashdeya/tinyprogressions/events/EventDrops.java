package com.kashdeya.tinyprogressions.events;

import java.util.Random;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechFoods;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

public class EventDrops {
	
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.HarvestDropsEvent event) {
		
		
		Block target = event.getState().getBlock();
		int trigger = event.getWorld().rand.nextInt(1000);
		if (target == Blocks.LEAVES || target == Blocks.LEAVES2 || OreDictionary.getOres("treeLeaves").contains(new ItemStack(target)) || target instanceof BlockLeaves) {
			if(trigger < ConfigHandler.peachDropsChance && ConfigHandler.extra_drops) {
				EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(TechFoods.plump_peach, ConfigHandler.peachDropsAmount));
				event.getWorld().spawnEntity(item);
			}
			
			if(trigger < ConfigHandler.pearDropsChance && ConfigHandler.extra_drops) {
				EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(TechFoods.plump_pear, ConfigHandler.pearDropsAmount));
				event.getWorld().spawnEntity(item);
			}
			
			if(trigger < ConfigHandler.appleDropsChance && ConfigHandler.extra_drops_vanilla) {
				EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Items.APPLE, ConfigHandler.appleDropsAmount));
				event.getWorld().spawnEntity(item);
			}
			
			if(trigger < ConfigHandler.stickDropsChance && ConfigHandler.extra_drops_vanilla) {
				EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Items.STICK, ConfigHandler.stickDropsAmount));
				event.getWorld().spawnEntity(item);
			}
		}
		
		if (target == Blocks.DIRT || target == Blocks.GRASS || OreDictionary.getOres("grass").contains(new ItemStack(target)) || OreDictionary.getOres("dirt").contains(new ItemStack(target)) || target instanceof BlockDirt || target instanceof BlockGrass) {
			if(trigger < ConfigHandler.BoneDropsChance && ConfigHandler.BoneDrops) {
				EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Items.BONE, ConfigHandler.BoneAmount));
				event.getWorld().spawnEntity(item);
			}
			
			if(trigger < ConfigHandler.SkullDropsChance && ConfigHandler.SkullDrops) {
				EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Items.SKULL, ConfigHandler.SkullAmount));
				event.getWorld().spawnEntity(item);
			}
		}
	}
	
	@SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onLivingDrops(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityDragon && ArmorHandler.dragon_armor) {
            registerMobDrop(event, event.getEntity(), true, new ItemStack(TechItems.dragon_scale, new Random().nextInt(16)));
        } else if (event.getEntity() instanceof EntityWither && ConfigHandler.wither_rib) {
            registerMobDrop(event, event.getEntity(), true, new ItemStack(TechItems.wither_rib, new Random().nextInt(6)));
        }
    }

    private static void registerMobDrop(LivingDropsEvent event, Entity entity, boolean enableDrop, ItemStack drop) {
        if (enableDrop) {
            event.getEntityLiving().entityDropItem(drop, 0.0f);
        }
    }
}
