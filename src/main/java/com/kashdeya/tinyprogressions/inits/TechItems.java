package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.DiamondApple;
import com.kashdeya.tinyprogressions.items.DiamondSaw;
import com.kashdeya.tinyprogressions.items.EmeraldApple;
import com.kashdeya.tinyprogressions.items.FlintKnife;
import com.kashdeya.tinyprogressions.items.GoldenApple;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.items.MedKit;
import com.kashdeya.tinyprogressions.items.MyceliumSeeds;
import com.kashdeya.tinyprogressions.items.QuartzKnife;
import com.kashdeya.tinyprogressions.items.WateringCan;
import com.kashdeya.tinyprogressions.items.WateringCanUpgrade;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TechItems {
	// Diamond Saw
	public static Item diamond_saw;
	// Watering Cans
	public static Item watering_can;
	public static Item watering_can_upgrade;
	// Quartz Items
	public static Item quartz_knife;
	public static Item quartz_dust;
	// Apples
	public static Item golden_apple;
	public static Item diamond_apple;
	public static Item emerald_apple;
	public static Item iron_apple;
	public static Item redstone_apple;
	// Misc Items
	public static Item mycelium_seeds;
	public static Item med_kit;
	public static Item rotten_leather;
	public static Item old_reed;
	// Stone Dust
	public static Item stone_dust;
	// Flint Knife
	public static Item flint_knife;
	// Stone Stick
	public static Item stone_stick;
	// Ender
	public static Item ender_dust;
	// Cooking
	public static Item stone_juicer;
	// Glowstone Dust
	public static Item black_dust;
	public static Item blue_dust;
	public static Item brown_dust;
	public static Item cyan_dust;
	public static Item gray_dust;
	public static Item green_dust;
	public static Item lightblue_dust;
	public static Item lime_dust;
	public static Item magenta_dust;
	public static Item orange_dust;
	public static Item pink_dust;
	public static Item purple_dust;
	public static Item red_dust;
	public static Item silver_dust;
	public static Item white_dust;
	// Metals
	public static Item reinforced_diamond;
	public static Item redstone_ingot;
	public static Item lapis_ingot;
	public static Item amethyst_gem;
	public static Item sapphire_gem;
	public static Item ruby_gem;
	public static Item chain_links;
	// Drops
	public static Item witherRib;
	public static Item dragon_scale;
	public static Item lava_crystal;
	
	public static void init(){
		// Apples
	    if (ConfigHandler.DiamondApple){
	    	diamond_apple = new DiamondApple(4, 1.2F, false);
	    	registerItem(diamond_apple, "diamond_apple");
	    }
	    if (ConfigHandler.EmeraldApple){
	    	emerald_apple = new EmeraldApple(4, 1.2F, false);
	    	registerItem(emerald_apple, "emerald_apple");
	    }
	    if (ConfigHandler.ApplePro){
	    	golden_apple = new GoldenApple(4, 1.2F, false);
	    	registerItem(golden_apple, "golden_apple");
	    }
	    
		// Watering Cans
		if (ConfigHandler.WateringCan){
			watering_can = new WateringCan();
			registerItem(watering_can, "watering_can");
		}
		if (ConfigHandler.WateringCanUpgrade){
			watering_can_upgrade = new WateringCanUpgrade();
			registerItem(watering_can_upgrade, "watering_can_upgrade");
		}
		
		// Diamond Saw
	    if (ConfigHandler.glowstone_lamps){
	    	diamond_saw = new DiamondSaw();
	    	registerItem(diamond_saw, "diamond_saw");
	    }
		
		// Quartz Items
	    if (ConfigHandler.QuartzKnife){
	    	quartz_knife = new QuartzKnife();
	    	registerItem(quartz_knife, "quartz_knife");
	    	quartz_dust = new ItemBase().setUnlocalizedName("quartz_dust");
	    	registerItem(quartz_dust, "quartz_dust");
	    }
	    
	    // Misc Items
	    if (ConfigHandler.StoneTorch){
	    	stone_stick = new ItemBase().setUnlocalizedName("stone_stick");
	    	registerItem(stone_stick, "stone_stick");
	    }	    	
	    if (ConfigHandler.MyceliumSeeds){
	    	mycelium_seeds = new MyceliumSeeds();
	    	registerItem(mycelium_seeds, "mycelium_seeds");
	    }
	    if (ConfigHandler.MedKit){
	    	med_kit = new MedKit();
	    	registerItem(med_kit, "med_kit");
	    }
	    
	    // Dust
	    if (ConfigHandler.StoneDust){
	    	stone_dust = new ItemBase().setUnlocalizedName("stone_dust");
			registerItem(stone_dust, "stone_dust");
		}
	    if (ConfigHandler.EnderOre){
			ender_dust = new ItemBase().setUnlocalizedName("ender_dust");
		    registerItem(ender_dust, "ender_dust");
		}
	    
	    // Flint Knife
	    if (ConfigHandler.FlintKnife){
	    	flint_knife = new FlintKnife();
			registerItem(flint_knife, "flint_knife");
	    }
	    
	    // Cooking
	    if (ConfigHandler.Juicer){
	    	stone_juicer = new ItemBase().setUnlocalizedName("stone_juicer");
	    	registerItem(stone_juicer, "stone_juicer");
	    }
	    
	    // Drops
	    if (ConfigHandler.DragonArmor){
		    dragon_scale = new ItemBase().setUnlocalizedName("dragon_scale");
		    registerItem(dragon_scale, "dragon_scale");
	    }
	    if (ConfigHandler.WitherArmor){
		    witherRib = new ItemBase().setUnlocalizedName("witherRib");
		    registerItem(witherRib, "witherRib");
	    }
	    if (ConfigHandler.LavaArmor){
	    	lava_crystal = new ItemBase().setUnlocalizedName("lava_crystal");
			registerItem(lava_crystal, "lava_crystal");
		}
	    
	    // Metals
	    if (ConfigHandler.ChainLinks){
	    	chain_links = new ItemBase().setUnlocalizedName("chain_links");
	    	registerItem(chain_links, "chain_links");
	    }
	    if (ConfigHandler.ReinforcedArmor){
		    reinforced_diamond = new ItemBase().setUnlocalizedName("reinforced_diamond");
		    registerItem(reinforced_diamond, "reinforced_diamond");
	    }
	    if (ConfigHandler.RedstoneArmor){
			redstone_ingot = new ItemBase().setUnlocalizedName("redstone_ingot");
		    registerItem(redstone_ingot, "redstone_ingot");
	    }
	    if (ConfigHandler.LapisArmor){
			lapis_ingot = new ItemBase().setUnlocalizedName("lapis_ingot");
		    registerItem(lapis_ingot, "lapis_ingot");
	    }
	    if (ConfigHandler.AmethystOre){
		    amethyst_gem = new ItemBase().setUnlocalizedName("amethyst_gem");
		    registerItem(amethyst_gem, "amethyst_gem");
	    }
	    if (ConfigHandler.SapphireOre){
		    sapphire_gem = new ItemBase().setUnlocalizedName("sapphire_gem");
		    registerItem(sapphire_gem, "sapphire_gem");
	    }
	    if (ConfigHandler.RubyOre){
		    ruby_gem = new ItemBase().setUnlocalizedName("ruby_gem");
		    registerItem(ruby_gem, "ruby_gem");
	    }
	    if (ConfigHandler.BrokenReed){
	    	old_reed = new ItemBase().setUnlocalizedName("old_reed");
		    registerItem(old_reed, "old_reed");
	    }
	    // Glowstone Dust
	    if (ConfigHandler.ColorGlowstone){
		    black_dust = new ItemBase().setUnlocalizedName("black_dust");
		    registerItem(black_dust, "black_dust");
		    blue_dust = new ItemBase().setUnlocalizedName("blue_dust");
		    registerItem(blue_dust, "blue_dust");
		    brown_dust = new ItemBase().setUnlocalizedName("brown_dust");
		    registerItem(brown_dust, "brown_dust");
		    cyan_dust = new ItemBase().setUnlocalizedName("cyan_dust");
		    registerItem(cyan_dust, "cyan_dust");
		    gray_dust = new ItemBase().setUnlocalizedName("gray_dust");
		    registerItem(gray_dust, "gray_dust");
		    green_dust = new ItemBase().setUnlocalizedName("green_dust");
		    registerItem(green_dust, "green_dust");
		    lightblue_dust = new ItemBase().setUnlocalizedName("lightblue_dust");
		    registerItem(lightblue_dust, "light_blue_dust");
		    lime_dust = new ItemBase().setUnlocalizedName("lime_dust");
		    registerItem(lime_dust, "lime_dust");
		    magenta_dust = new ItemBase().setUnlocalizedName("magenta_dust");
		    registerItem(magenta_dust, "magenta_dust");
		    orange_dust = new ItemBase().setUnlocalizedName("orange_dust");
		    registerItem(orange_dust, "orange_dust");
		    pink_dust = new ItemBase().setUnlocalizedName("pink_dust");
		    registerItem(pink_dust, "pink_dust");
		    purple_dust = new ItemBase().setUnlocalizedName("purple_dust");
		    registerItem(purple_dust, "purple_dust");
		    red_dust = new ItemBase().setUnlocalizedName("red_dust");
		    registerItem(red_dust, "red_dust");
		    silver_dust = new ItemBase().setUnlocalizedName("silver_dust");
		    registerItem(silver_dust, "silver_dust");
		    white_dust = new ItemBase().setUnlocalizedName("white_dust");
		    registerItem(white_dust, "white_dust");
	    }
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}
}
