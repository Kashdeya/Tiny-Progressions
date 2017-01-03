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
		ConfigHandler.CharcoalBlock = config.getBoolean("Charcoal Block", category + " Extra Stuff", true, "Enable the Charcoal Block?");
		FuelHandler.CharcoalBlockBurn = config.getInt("Charcoal Block Burn Time", category + " Extra Stuff", 16000, 0, Integer.MAX_VALUE, "Sets the burn time for the Charcoal Block.");
		ConfigHandler.DirtyGlass = config.getBoolean("Dirty Glass Block", category + " Extra Stuff", true, "Enable Dirty Glass Block?");
		ConfigHandler.NotchApple = config.getBoolean("Notch Apple", category + " Extra Stuff", true, "Bring back the Notch Apple Recipe?");
		ConfigHandler.AndesiteBrick = config.getBoolean("Andesite Bricks", category + " Extra Stuff", true, "Enable Andesite Bricks?");
		ConfigHandler.DioriteBrick = config.getBoolean("Diorite Bricks", category + " Extra Stuff", true, "Enable Diorite Bricks?");
		ConfigHandler.GraniteBrick = config.getBoolean("Granite Bricks", category + " Extra Stuff", true, "Enable Granite Bricks?");
		ConfigHandler.MyceliumSeeds = config.getBoolean("Mycelium Seeds", category + " Extra Stuff", true, "Enable Mycelium Seeds?");
		ConfigHandler.DiamondApple = config.getBoolean("Diamond Apple", category + " Extra Stuff", true, "Enable Diamond Apple?");
		ConfigHandler.MedKit = config.getBoolean("Medkit", category + " Extra Stuff", true, "Enable Medkit?");
		ConfigHandler.healDuration = config.getInt("Medkit Heal Duration", category + " Extra Stuff", 300, 0, Integer.MAX_VALUE, "Amount in ticks. (20 = 1 tick)");
		
		config.addCustomCategoryComment(category + " Drops", "True or False");
		ConfigHandler.LeafDrops = config.getBoolean("Stick Drops", category + " Drops", true, "Enable Sticks to drop from leaves?");
		ConfigHandler.LeafDropsChance = config.getFloat("Stick Drop Chance", category + " Drops", 0.1F, 0, 1.0F, "Sets the Chance of Sticks from leaves.");
		ConfigHandler.LeafDropsAmmount = config.getInt("Stick Drop Ammount", category + " Drops", 1, 1, 64, "Sets the Ammount of Sticks Dropped from leaves.");
		ConfigHandler.BoneDrops = config.getBoolean("Bone Drops", category + " Drops", true, "Enable Bones to drop from Dirt?");
		ConfigHandler.BoneDropsChance = config.getFloat("Bone Drop Chance", category + " Drops", 0.1F, 0, 1.0F, "Sets the Chance of Bones from Dirt.");
		ConfigHandler.BoneAmmount = config.getInt("Bone Drop Ammount", category + " Drops", 1, 1, 64, "Sets the Ammount of Bones Dropped from Dirt.");
		ConfigHandler.SkullDrops = config.getBoolean("Skull Drops", category + " Drops", true, "Enable Skull to drop from Dirt? (Bone Drops must be enabled!)");
		ConfigHandler.SkullAmmount = config.getInt("Skull Drop Ammount", category + " Drops", 1, 1, 64, "Sets the Ammount of Skull Dropped from Dirt. (Skulls Have the same Drop Chance as Bones)");
		
		config.addCustomCategoryComment(category + " Quartz", "True or False");
		ConfigHandler.QuartzDust = config.getBoolean("Quartz Dust", category + " Quartz", true, "Enable Quartz Dust?");
		ConfigHandler.QuartzDustRecipe = config.getBoolean("Quartz Dust Recipe", category + " Quartz", false, "Enable vanilla style Quartz Dust Recipe?");
		ConfigHandler.QuartzKnife = config.getBoolean("Quartz Knife", category + " Quartz", true, "Enable the Quartz Knife and Dust Recipe?");
		ConfigHandler.QuartzKnifeDamage = config.getInt("Quartz Knife Durability", category + " Quartz", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		
		config.addCustomCategoryComment(category + " Reinforced Blocks", "True or False");
		ConfigHandler.ReinforcedGlass = config.getBoolean("Reinforced Glass Block", category + " Reinforced Blocks", true, "Enable Reinforced Glass Block?");
		ConfigHandler.ReinforcedObsidian = config.getBoolean("Reinforced Obsidian Block", category + " Reinforced Blocks", true, "Enable Reinforced Obsidian Block?");
		
		config.addCustomCategoryComment(category + " Goodies", "True or False");
		ConfigHandler.BirthdayPickaxe = config.getBoolean("Party Pickaxe", category + " Goodies", true, "Enable Party Pickaxe?");
		
		config.addCustomCategoryComment(category + " Armor", "True or False");
		ConfigHandler.StoneArmor = config.getBoolean("Stone Armor", category + " Armor", true, "Enable Stone Armor?");
		
		config.addCustomCategoryComment(category + " Compressed Blocks", "True or False");
		ConfigHandler.BoneBlock = config.getBoolean("Compressed Bone Block", category + " Compressed Blocks", true, "Enable Compressed Bone Block?");
		ConfigHandler.FleshBlock = config.getBoolean("Compressed Flesh Block", category + " Compressed Blocks", true, "Enable Compressed Flesh Block?");
        
		if (config.hasChanged())
        config.save();
	}

}
