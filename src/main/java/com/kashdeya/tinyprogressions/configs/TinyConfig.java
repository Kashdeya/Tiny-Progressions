package com.kashdeya.tinyprogressions.configs;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.FuelHandler;
import com.kashdeya.tinyprogressions.main.Reference;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class TinyConfig {
	
	public static Configuration config;
	
	public static final File configDir = new File("config/Tiny Progressions");

	public static final String configVersion = Reference.VERSION;
	
	public static void initMainConfigs()
	{
		
		File f = new File(configDir, "Main.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
        System.out.println(config.getLoadedConfigVersion() +":"+ config.getDefinedConfigVersion());
        
        // Run Legacy Handler if the versions dont Match up
        if(config.getLoadedConfigVersion() != config.getDefinedConfigVersion())
        	LegacyHandler.runLegacyHandler();
        
		String category;
		
		category = "Tiny Progressions";
		
		config.addCustomCategoryComment(category + " Growth Crystal", "True or False");
		ConfigHandler.BlockGrowth = config.getBoolean("Growth Crystal Tier 1", category + " Growth Crystal", true, "Enable Growth Crystal Tier 1?");
		ConfigHandler.BlockGrowthTicks = config.getInt("Growth Crystal Tier 1 Speed", category + " Growth Crystal", 30, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 40 Ticks = 2 Seconds]\n[Default*40=1200 Ticks]");
		ConfigHandler.BlockGrowthUpgrade = config.getBoolean("Growth Crystal Tier 2", category + " Growth Crystal", true, "Enable Growth Crystal Tier 2?\n[Requires Tier 1 to be Enabled]");
		ConfigHandler.BlockGrowthUpgradeTicks = config.getInt("Growth Crystal Tier 2 Speed", category + " Growth Crystal", 40, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 20 Ticks = 1 Second]\n[Default*20=800 Ticks]");
		ConfigHandler.BlockGrowthUpgradeTwo = config.getBoolean("Growth Crystal Tier 3", category + " Growth Crystal", true, "Enable Growth Crystal Tier 3?\n[Requires Tier 2 to be Enabled]");
		ConfigHandler.BlockGrowthUpgradeTwoTicks = config.getInt("Growth Crystal Tier 3 Speed", category + " Growth Crystal", 40, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 10 Ticks = 1/2 a Second]\n[Default*10=400 Ticks]");
		
		config.addCustomCategoryComment(category + " Watering Cans", "True or False");
		ConfigHandler.WateringCan = config.getBoolean("Watering Can", category + " Watering Cans", true, "Enable Watering Can?");
		ConfigHandler.WateringCanUpgrade = config.getBoolean("Reinforced Watering Can", category + " Watering Cans", true, "Enable Reinforced Watering Can?\n[Requires Watering Can to be Enabled]");
		
		config.addCustomCategoryComment(category + " Cobblegen Crystals", "True or False");
		ConfigHandler.Cobblegen = config.getBoolean("Cobblegen Crystal Tier 1", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 1?");
		ConfigHandler.IronCobblegen = config.getBoolean("Cobblegen Crystal Tier 2", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 2?\n[Requires Cobblegen Crystal Tier 1 to be Enabled]");
		ConfigHandler.DiamondCobblegen = config.getBoolean("Cobblegen Crystal Tier 3", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 3?\n[Requires Cobblegen Crystal Tier 2 to be Enabled]");
		ConfigHandler.BlazeCobblegen = config.getBoolean("Cobblegen Crystal Tier 4", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 4?\n[Requires Cobblegen Crystal Tier 3 to be Enabled]");
		ConfigHandler.EmeraldCobblegen = config.getBoolean("Cobblegen Crystal Tier 5", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 5?\n[Requires Cobblegen Crystal Tier 4 to be Enabled]");
		
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
		ConfigHandler.FlintBlock = config.getBoolean("Flint Block", category + " Extra Stuff", true, "Enable Flint Block?");
		ConfigHandler.SmoothEndStone = config.getBoolean("Smooth EndStone", category + " Extra Stuff", true, "Enable Smooth EndStone?");
		
		config.addCustomCategoryComment(category + " Drops", "True or False");
		ConfigHandler.LeafDrops = config.getBoolean("Stick Drops", category + " Drops", true, "Enable Sticks to drop from leaves?");
		ConfigHandler.LeafDropsChance = config.getFloat("Stick Drop Chance", category + " Drops", 0.1F, 0, 1.0F, "Sets the Chance of Sticks from leaves.");
		ConfigHandler.LeafDropsAmmount = config.getInt("Stick Drop Ammount", category + " Drops", 1, 1, 64, "Sets the Ammount of Sticks Dropped from leaves.");
		ConfigHandler.BoneDrops = config.getBoolean("Bone Drops", category + " Drops", true, "Enable Bones to drop from Dirt?");
		ConfigHandler.BoneDropsChance = config.getFloat("Bone Drop Chance", category + " Drops", 0.1F, 0, 1.0F, "Sets the Chance of Bones from Dirt.");
		ConfigHandler.BoneAmmount = config.getInt("Bone Drop Ammount", category + " Drops", 1, 1, 64, "Sets the Ammount of Bones Dropped from Dirt.");
		ConfigHandler.SkullDrops = config.getBoolean("Skull Drops", category + " Drops", true, "Enable Skull to drop from Dirt? (Bone Drops must be enabled!)");
		ConfigHandler.SkullAmmount = config.getInt("Skull Drop Ammount", category + " Drops", 1, 1, 64, "Sets the Ammount of Skull Dropped from Dirt.\n[Skulls Have the same Drop Chance as Bones]");
		
		config.addCustomCategoryComment(category + " Quartz", "True or False");
		ConfigHandler.QuartzDust = config.getBoolean("Quartz Dust", category + " Quartz", false, "Enable Quartz Dust?");
		ConfigHandler.QuartzDustRecipe = config.getBoolean("Quartz Dust Recipe", category + " Quartz", false, "Enable vanilla style Quartz Dust Recipe?");
		ConfigHandler.QuartzKnife = config.getBoolean("Quartz Knife", category + " Quartz", false, "Enable the Quartz Knife and Dust Recipe?");
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
		ConfigHandler.NetherStarBlock = config.getBoolean("Compressed Nether Star Block", category + " Compressed Blocks", true, "Enable Compressed Nether Star Block?");
    
		if (config.hasChanged())
        config.save();    
	}
	
	
	/**
	 * Used to update old configs without losing the old settings and cleaning up configs. 
	 * 
	 * @author GenDeathrow
	 */
	protected static class LegacyHandler
	{
		
		private static List<String> removeCategoryList = new ArrayList();
		private static List<List<String>> removePropertiesList = new ArrayList();
		private static List<List<String>> moveKeyList = new ArrayList();
		private static List<List<String>> renameKeyList = new ArrayList();
		
		private static org.apache.logging.log4j.Logger logger;
		
		public static void runLegacyHandler()
		{
			logger = tinyprogressions.logger;
			
			
			logger.info("Initiating Config Legacy Handler....");
	        initLegacyHander();
	        
	        logger.info("Moving Old Properties....");
	        moveOldKeys();
	        
	        logger.info("Renaming Old Propertiesr....");
	        renameOldKeys();
	        
	        logger.info("Cleaning up Categories....");
			removeOldCategories();
			
			logger.info("Cleaning up Properties....");
			removeProperites();
			
			logger.info("Config Legacy Handler Finished");
		}		
		
		/**
		 * Setup what Properties need removal <br>
		 * Must go in order of operation.. it will
		 *  <br><br>
		 * <b>1st.</b> It moves properties <br>
		 * <b>2nd.</b> It renames properties<br>
		 * <b>3rd.</b> Than removes old categories<br>
		 *  <br><br>
		 * So you have to set it up in correct order to get the files end up right.
		 */
		private static void initLegacyHander()
		{
			
			addToMovePropertyList("tiny progressions birthday pickaxe", "Birthday Pickaxe", "tiny progressions goodies");
			addToMovePropertyList("tiny progressions misc blocks", "Flesh Block", "tiny progressions compressed blocks");
			
			addToRenamePropertyList("tiny progressions goodies" , "Birthday Pickaxe", "Party Pickaxe");
			addToRenamePropertyList("tiny progressions compressed blocks" , "Flesh Block", "Compressed Flesh Block");
			
			addToRemoveCategoryList("tiny progressions birthday pickaxe");
			addToRemoveCategoryList("tiny progressions buckets");
			addToRemoveCategoryList("tiny progressions misc blocks");
			
			//addToRemoveProperties(category, propName);
		}
		
		/**
		 * Adds Property to be move to a new Category, Overwrites any Property with the same name
		 * 
		 * @param oldCategory
		 * @param propName
		 * @param newCategory
		 */
		public static void addToMovePropertyList(String oldCategory, String propName, String newCategory)
		{
			moveKeyList.add(Arrays.asList(oldCategory, propName, newCategory));
		}
		
		/**
		 * Renames a Property, Overwrites any Property with the new Name
		 * 
		 * @param category
		 * @param propName
		 * @param newPropName
		 */
		public static void addToRenamePropertyList(String category, String propName, String newPropName)
		{
			renameKeyList.add(Arrays.asList(category , propName, newPropName));
		}
		
		/**
		 * This is used to remove Properties inside categories that are being used still, <br>
		 * but the Property is no longer used. <br><br>
		 * 
		 * <b>Dont Use this if your overwriting a property with move / rename</b>
		 * 
		 * @param category
		 * @param propName
		 */
		public static void addToRemovePropertyList(String category, String propName)
		{
			renameKeyList.add(Arrays.asList(category , propName));
		}
		
		/**
		 * Adds to Remove Category List, All Properties and Category will be gone for ever, Careful with this one
		 * 
		 * @param category
		 */
		public static void addToRemoveCategoryList(String category)
		{
			removeCategoryList.add(category);
		}
		
		
		private static void moveOldKeys()
		{
			for(List<String> parms : moveKeyList)
			{
				if(parms.size() != 3) return;
				
				String oldCat = parms.get(0);
				String propName = parms.get(1);
				String newCat = parms.get(2);
				
				if(config.hasCategory(oldCat) && config.hasKey(oldCat, propName))
				{
					// Remove property if it already exist than replace
					if(config.hasKey(newCat, propName))
					{
						removeProperty(newCat, propName);
						logger.info("    - found duplicate property ("+propName+"), Overwriting.");
					}
					config.moveProperty(oldCat, propName, newCat);
					logger.info("    - property Moved ("+propName+")");
				}
			}
		}
		
		private static void renameOldKeys()
		{
			for(List<String> parms : renameKeyList)
			{
				if(parms.size() != 3) return;
				
				String category = parms.get(0);
				String oldPropName = parms.get(1);
				String newPropName = parms.get(2);
				
				if(config.hasCategory(category) && config.hasKey(category, oldPropName))
				{
					// Remove property if it already exist than replace
					if(config.hasKey(category, newPropName))
					{
						removeProperty(category, newPropName);
						logger.info("    - found duplicate property ("+newPropName+"), Overwriting.");
					}
					config.renameProperty(category, oldPropName, newPropName);
					logger.info("    - property ("+oldPropName+") Renamed to ("+newPropName+")");
				}
			}	
		}
		
		private static void removeProperites()
		{
			for(List<String> parms : removePropertiesList)
			{
				String category = parms.get(0);
				String propName = parms.get(1);
				
				if(config.hasKey(category, propName))
				{
					removeProperty(category, propName);
					
					logger.info("    - removing property ("+category+":"+propName+"). Its no longer Needed");
				}
			}
		}
		
		/**
		 * Remove Property if needed
		 * 
		 * @param category
		 * @param propName
		 */
		public static void removeProperty(String category, String propName)
		{
			String rmv = "Remove";
			config.addCustomCategoryComment(rmv, "");
				config.moveProperty(category, propName, rmv);
			config.removeCategory(config.getCategory(rmv));
		}
		/**
		 * Add all Categories you want to remove the the remove List. 
		 * This will remove all the properties inside these category's.
		 * Only do this if you have no intention of ever using that category name again,
		 * And don't mine losing the properties inside (config.moveproperty could be used before calling remove)  
		 */
		private static void removeOldCategories()
		{
			for(String category : removeCategoryList)
			{
				if(config.hasCategory(category))
				{
					config.removeCategory(config.getCategory(category));
					logger.info("    - category removed ("+category+")");
				}
			}
		}
		
		
		/**
		 * Use this to 
		 * @param Category
		 * @return ConfigCategory
		 */
		private static ConfigCategory getCategory(String Category)
		{
			return config.getCategory(Category);
		}

		
	}
	
	// Config Tools 
}
