package com.kashdeya.tinyprogressions.configs;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.FuelHandler;

public class TinyConfig {
	
	public static Configuration config;
	
	public static final File configDir = new File("config/Tiny Progressions");
	
	public static void initMainConfigs()
	{
		
		File f = new File(configDir, "Main.cfg");
        config = new Configuration(f);
        
        config.load();
        
		String category;
		
		category = "Tiny Progressions";
		
		config.addCustomCategoryComment(category + " Growth Crystal", "True or False");
		ConfigHandler.BlockGrowth = config.getBoolean("Growth Crystal Tier 1", category + " Growth Crystal", true, "Enable Growth Crystal Tier 1?");
		ConfigHandler.BlockGrowthTicks = config.getInt("Growth Crystal Tier 1 Speed", category + " Growth Crystal", 100, 100, 1000, "Amount of seconds between each growth ticks. (Lower = faster)");
		ConfigHandler.BlockGrowthUpgrade = config.getBoolean("Growth Crystal Tier 2", category + " Growth Crystal", true, "Enable Growth Crystal Tier 2? (Requires Tier 1 to be Enabled)");
		ConfigHandler.BlockGrowthUpgradeTicks = config.getInt("Growth Crystal Tier 2 Speed", category + " Growth Crystal", 10, 10, 500, "Amount of seconds between each growth ticks. (Lower = faster)");
		
		config.addCustomCategoryComment(category + " Watering Cans", "True or False");
		ConfigHandler.WateringCan = config.getBoolean("Watering Can", category + " Watering Cans", true, "Enable Watering Can?");
		ConfigHandler.WateringCanUpgrade = config.getBoolean("Reinforced Watering Can", category + " Watering Cans", true, "Enable Reinforced Watering Can? (Requires Watering Can to be Enabled)");
		
		config.addCustomCategoryComment(category + " Cobblegen Crystals", "True or False");
		ConfigHandler.Cobblegen = config.getBoolean("Cobblegen Crystal Tier 1", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 1?");
		ConfigHandler.IronCobblegen = config.getBoolean("Cobblegen Crystal Tier 2", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 2? (Requires Cobblegen Crystal Tier 1 to be Enabled)");
		ConfigHandler.DiamondCobblegen = config.getBoolean("Cobblegen Crystal Tier 3", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 3? (Requires Cobblegen Crystal Tier 2 to be Enabled)");
		ConfigHandler.BlazeCobblegen = config.getBoolean("Cobblegen Crystal Tier 4", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 4? (Requires Cobblegen Crystal Tier 3 to be Enabled)");
		ConfigHandler.EmeraldCobblegen = config.getBoolean("Cobblegen Crystal Tier 5", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 5? (Requires Cobblegen Crystal Tier 4 to be Enabled)");
		
		config.addCustomCategoryComment(category + " Extra Stuff", "True or False");
		ConfigHandler.FleshBlock = config.getBoolean("Flesh Block", category + " Misc Blocks", true, "Enable Compressed Flesh Block?");
		ConfigHandler.CharcoalBlock = config.getBoolean("Charcoal Block", category + " Extra Stuff", true, "Enable the Charcoal Block?");
		FuelHandler.CharcoalBlockBurn = config.getInt("Charcoal Block Burn Time", category + " Extra Stuff", 16000, 0, Integer.MAX_VALUE, "Sets the burn time for the Charcoal Block.");
		ConfigHandler.LeafDrops = config.getBoolean("Stick Drops", category + " Extra Stuff", true, "Enable Sticks to drop from leaves?");
		ConfigHandler.LeafDropsChance = config.getInt("Stick Drop Chance", category + " Extra Stuff", 10, 1, 100, "Sets the drop rate of Sticks from leaves.");
		
		config.addCustomCategoryComment(category + " Quartz", "True or False");
		ConfigHandler.QuartzDust = config.getBoolean("Quartz Dust", category + " Quartz", true, "Enable Quartz Dust?");
		ConfigHandler.QuartzDustRecipe = config.getBoolean("Quartz Dust Recipe", category + " Quartz", false, "Enable Quartz Dust Recipe?");
		ConfigHandler.QuartzKnife = config.getBoolean("Quartz Knife", category + " Quartz", true, "Enable the Quartz Knife?");
		ConfigHandler.QuartzKnifeDamage = config.getInt("Quartz Knife Durability", category + " Quartz", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		
		config.addCustomCategoryComment(category + " Reinforced Blocks", "True or False");
		ConfigHandler.ReinforcedGlass = config.getBoolean("Reinforced Glass Block", category + " Reinforced Blocks", true, "Enable Reinforced Glass Block?");
		ConfigHandler.ReinforcedObsidian = config.getBoolean("Reinforced Obsidian Block", category + " Reinforced Blocks", true, "Enable Reinforced Obsidian Block?");
		
		config.addCustomCategoryComment(category + " Goodies", "True or False");
		ConfigHandler.BirthdayPickaxe = config.getBoolean("Party Pickaxe", category + " Goodies", true, "Enable Party Pickaxe?");
        
		if (config.hasChanged())
        config.save();
	}

}
