package com.kashdeya.tinyprogressions.config;

import java.io.File;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.FuelHandler;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraftforge.common.config.Configuration;

public class TinyConfig {
	
	public static Configuration config;
	
	public static final File configDir = new File("config/Tiny Progressions");

	public static final String configVersion = Reference.VERSION;
	
	public static void initMain()
	{
		
		File f = new File(configDir, "Main.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
		
		config.addCustomCategoryComment("Growth Crystal", "These like to grow things!");
		ConfigHandler.BlockGrowth = config.getBoolean("Growth Crystal Tier 1", "Growth Crystal", true, "Enable Growth Crystal Tier 1?");
		ConfigHandler.BlockGrowthTicks = config.getInt("Growth Crystal Tier 1 Speed", "Growth Crystal", 60, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 40 Ticks or 2 Seconds]\n[Default*40=1200 Ticks]");
		ConfigHandler.GrowthParticalTicks = config.getInt("Growth Crystal Tier 1 Particles", "Growth Crystal", 1000, 50, 1000, "Lower Number gives more Particles");
		ConfigHandler.BlockGrowthUpgrade = config.getBoolean("Growth Crystal Tier 2", "Growth Crystal", true, "Enable Growth Crystal Tier 2?\n[Requires Tier 1 to be Enabled]");
		ConfigHandler.BlockGrowthUpgradeTicks = config.getInt("Growth Crystal Tier 2 Speed", "Growth Crystal", 30, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 20 Ticks or 1 Second]\n[Default*20=800 Ticks]");
		ConfigHandler.GrowthUpgradeParticalTicks = config.getInt("Growth Crystal Tier 2 Particles", "Growth Crystal", 1000, 50, 1000, "Lower Number gives more Particles");
		ConfigHandler.BlockGrowthUpgradeTwo = config.getBoolean("Growth Crystal Tier 3", "Growth Crystal", true, "Enable Growth Crystal Tier 3?\n[Requires Tier 2 to be Enabled]");
		ConfigHandler.BlockGrowthUpgradeTwoTicks = config.getInt("Growth Crystal Tier 3 Speed", "Growth Crystal", 30, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 10 Ticks or 1/2 a Second]\n[Default*10=400 Ticks]");
		ConfigHandler.GrowthUpgradeTwoParticalTicks = config.getInt("Growth Crystal Tier 3 Particles", "Growth Crystal", 1000, 50, 1000, "Lower Number gives more Particles");
		ConfigHandler.ParticalTicks = config.getBoolean("Growth Crystal Particles", "Growth Crystal", false, "Enable Growth Crystal Particles?");
		
		config.addCustomCategoryComment("Watering Cans", "Remember to water those plants!");
		ConfigHandler.WateringCan = config.getBoolean("Watering Can", "Watering Cans", true, "Enable Watering Can?");
		ConfigHandler.WateringCanChance = config.getInt("Watering Can Chance", "Watering Cans", 50, 1, 50, "Chance out of 50 that the Watering Can will tick the plant!");
		ConfigHandler.WateringCanUpgrade = config.getBoolean("Watering Can Reinforced", "Watering Cans", true, "Enable Reinforced Watering Can?\n[Requires Watering Can to be Enabled]");
		ConfigHandler.WateringCanUpgradeChance = config.getInt("Watering Can Reinforced Chance", "Watering Cans", 100, 50, 100, "Chance out of 100 that the Watering Can will tick the plant!");
		
		config.addCustomCategoryComment("Cobblegen Crystals", "Everyone needs a little cobblestone!");
		ConfigHandler.Cobblegen = config.getBoolean("Cobblegen Crystal Tier 1", "Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 1?");
		ConfigHandler.IronCobblegen = config.getBoolean("Cobblegen Crystal Tier 2", "Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 2?\n[Requires Cobblegen Crystal Tier 1 to be Enabled for recipe]");
		ConfigHandler.DiamondCobblegen = config.getBoolean("Cobblegen Crystal Tier 3", "Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 3?\n[Requires Cobblegen Crystal Tier 2 to be Enabled for recipe]");
		ConfigHandler.BlazeCobblegen = config.getBoolean("Cobblegen Crystal Tier 4", "Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 4?\n[Requires Cobblegen Crystal Tier 3 to be Enabled for recipe]");
		ConfigHandler.EmeraldCobblegen = config.getBoolean("Cobblegen Crystal Tier 5", "Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 5?\n[Requires Cobblegen Crystal Tier 4 to be Enabled for recipe]");
		
		config.addCustomCategoryComment("Reinforced Blocks", "True or False\n[Required for Other Items in this mod.]");
		ConfigHandler.ReinforcedGlass = config.getBoolean("Reinforced Glass Block", "Reinforced Blocks", true, "Enable Reinforced Glass Block?");
		ConfigHandler.ReinforcedObsidian = config.getBoolean("Reinforced Obsidian Block", "Reinforced Blocks", true, "Enable Reinforced Obsidian Block?");
		
		config.addCustomCategoryComment("Compressed Blocks", "These blocks are required for Other Items in this mod.");
		ConfigHandler.BoneBlock = config.getBoolean("Compressed Bone Block", "Compressed Blocks", true, "Enable Compressed Bone Block?");
		ConfigHandler.FleshBlock = config.getBoolean("Compressed Flesh Block", "Compressed Blocks", true, "Enable Compressed Flesh Block?");
		ConfigHandler.NetherStarBlock = config.getBoolean("Compressed Nether Star Block", "Compressed Blocks", true, "Enable Compressed Nether Star Block?");
		ConfigHandler.FlintBlock = config.getBoolean("Compressed Flint Block", "Compressed Blocks", true, "Enable Compressed Flint Block?");
		
		config.addCustomCategoryComment("Dirty Glass", "Just a little dirty!");
		ConfigHandler.DirtyGlass = config.getBoolean("Dirty Glass Block", "Dirty Glass", true, "Enable Dirty Glass Block?\n[Required for Other Items in this mod.]");
		
		config.addCustomCategoryComment("Charcoal", "It's the little things that count right?");
		ConfigHandler.CharcoalBlock = config.getBoolean("Charcoal Block", "Charcoal", true, "Enable the Charcoal Block?");
		FuelHandler.CharcoalBlockBurn = config.getInt("Charcoal Block Burn Time", "Charcoal", 16000, 0, Integer.MAX_VALUE, "Sets the burn time for the Charcoal Block.");
		
		config.addCustomCategoryComment("Lava Infused Stone", "Makes Obsidian and Cobblestone when Water is place around it.");
		ConfigHandler.lava_infused_stone = config.getBoolean("Lava Infused Stone", "Lava Infused Stone", true, "Enable Lava Infused Stone?");
		
		config.addCustomCategoryComment("Floaty Block", "May save you from certain death!");
		ConfigHandler.angel_block = config.getBoolean("Floaty McFloaty Block", "Floaty Block", true, "Enable Floaty McFloaty Block?");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initSupporters()
	{
		
		File f = new File(configDir, "Supporters.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
        
		config.addCustomCategoryComment("Custom Packs", "Added for Custom Packs!\n[If you enable please make a recipe for them, Other wise they do nothing.]");
		ConfigHandler.FlintKnife = config.getBoolean("Flint Knife", "Custom Packs", false, "Enable Flint Knife?");
		ConfigHandler.FlintKnifeDamage = config.getInt("Flint Knife Durability", "Custom Packs", 100, 0, Integer.MAX_VALUE, "Sets the amount of Durability.");
		ConfigHandler.StoneDust = config.getBoolean("Stone Dust", "Custom Packs", false, "Enable Stone Dust?");
		ConfigHandler.QuartzKnife = config.getBoolean("Quartz Knife", "Custom Packs", false, "Enable the Quartz Knife and Dust Recipe?");
		ConfigHandler.QuartzKnifeDamage = config.getInt("Quartz Knife Durability", "Custom Packs", 128, 0, Integer.MAX_VALUE, "Sets the amount of Durability.");
		
		config.addCustomCategoryComment("Happy Birthday Darkosto", "Fun Stuff");
		ConfigHandler.BirthdayPickaxe = config.getBoolean("Party Pickaxe", "Happy Birthday Darkosto", true, "Enable Party Pickaxe?");
		
		config.addCustomCategoryComment("Withered Bedrock", "Sink Into Madness Block!\n[This item is not a Craftable Block.]\n[To be used with Bedrock Replacer Mod]\n[MAY CAUSE SERVER LAG NEEDS MORE TESTING]");
		ConfigHandler.WitheredBlock = config.getBoolean("Withered Bedrock", "Withered Bedrock", false, "Enable Withered Bedrock?");
		ConfigHandler.WitheredBlockParticals = config.getBoolean("Withered Particles", "Withered Bedrock", false, "Enable Player Withered Particles?");
		ConfigHandler.WitheredBlockTime = config.getInt("Withered Time", "Withered Bedrock", 3, 1, Integer.MAX_VALUE, "Sets the Time a player is Withered from standing on Withered Bedrock.\n[1 = 20Ticks]");
		
		config.addCustomCategoryComment("WUB Juice", "WUB WUB WUB!");
		ConfigHandler.vasholine = config.getBoolean("WUB Juice", "WUB Juice", true, "Enable WUB Juice?");
		ConfigHandler.vasholine_heal_amount = config.getFloat("WUB Juice Heal Amount", "WUB Juice", 0.25F, 0.0F, 1.0F, "Sets the amount of heal Wub Juice does per tick.");
		ConfigHandler.vasholine_mobs = config.getBoolean("WUB Juice Hurts Mobs", "WUB Juice", true, "Enable mobs getting hurt?");	
		ConfigHandler.vasholine_mobs_amount = config.getFloat("WUB Juice Hurts Mobs Amount", "WUB Juice", 0.01F, 0.0F, 1.0F, "Sets the amount mobs get hurt.");
		ConfigHandler.wub_heal_mobs = config.getBoolean("WUB Juice Heals Mobs", "WUB Juice", false, "Enable mobs getting healed?");	
		ConfigHandler.mob_heal_amount = config.getFloat("WUB Juice Heals Mobs Amount", "WUB Juice", 0.01F, 0.0F, 1.0F, "Sets the amount mobs get healed.");
		ConfigHandler.wub_weakness = config.getBoolean("WUB Juice Side Effect Weakness", "WUB Juice", true, "Enable Weakness while being healed?");
		ConfigHandler.wub_blindness = config.getBoolean("WUB Juice Side Effect Blindness", "WUB Juice", true, "Enable Blindness while being healed?");
		ConfigHandler.wub_fatigue = config.getBoolean("WUB Juice Side Effect Mining Fatigue", "WUB Juice", true, "Enable Mining Fatigue while being healed?");
		
		config.addCustomCategoryComment("WUB Juice Extras", "Tools, Weapons and more!\n[Wub Juice must be ENABLED above]\n[Overworld or Nether Wub Ore must be ENABLED below]\n[More Configs coming soon!]");
		ConfigHandler.wub_juice_tools = config.getBoolean("Tools & Weapons", "WUB Juice Extras", true, "Enable Extras?");
		
		config.addCustomCategoryComment("Medical Items", "Need a little healing?\n[Each teir requires the lower teir for crafting!]\n[Medical Items can now only be used if player is hurt!]");
		// Enable
		ConfigHandler.medical_kits = config.getBoolean("Enable Medical Items", "Medical Items", true, "Enable Medical Items?");
		// Small Bandage
		ConfigHandler.smallBandageHealStack = config.getInt("Teir 1 Meical Item Stacksize", "Medical Items", 8, 1, 64, "Sets the Stacksize of the Small Medical Bandage!");
		ConfigHandler.smallBandageRegen = config.getInt("Teir 1 Meical Item Regen Time", "Medical Items", 5, 1, 30, "Sets the length of regen of the Small Medical Bandage!\n[Does not stack]");
		// Large Bandage
		ConfigHandler.largeBandageStack = config.getInt("Teir 2 Meical Item Stacksize", "Medical Items", 16, 1, 64, "Sets the Stacksize of the Large Medical Bandage!");
		ConfigHandler.largeBandageDuration = config.getInt("Teir 2 Meical Item Use Duration", "Medical Items", 4, 1, 64, "Sets how long it takes the player to apply the Large Medical Bandage!");
		ConfigHandler.largeBandageBoostTime = config.getInt("Teir 2 Meical Item Boost Time", "Medical Items", 15, 0, 120, "Sets how long the player has 2 extra hearts on the Large Medical Bandage!\n[Does not stack]");
		// Small Med kit
		ConfigHandler.smallMedHealStack = config.getInt("Teir 3 Meical Item Stacksize", "Medical Items", 16, 1, 64, "Sets the Stacksize of the Small Medical Kit!");
		ConfigHandler.smallMedDuration = config.getInt("Teir 3 Meical Item Use Duration", "Medical Items", 8, 1, 64, "Sets how long it takes the player to apply the Small Medical Kit!");
		ConfigHandler.smallMedBoostTime = config.getInt("Teir 3 Meical Item Boost Time", "Medical Items", 30, 0, 240, "Sets how long the player has 4 extra hearts on the Small Medical Kit!\n[Does not stack]");
		//Large Med kit
		ConfigHandler.LargeMedHealStack = config.getInt("Teir 4 Meical Item Stacksize", "Medical Items", 16, 1, 64, "Sets the Stacksize of the Large Medical Kit!");
		ConfigHandler.LargeMedDuration = config.getInt("Teir 4 Meical Item Use Duration", "Medical Items", 16, 1, 64, "Sets how long it takes the player to apply the Large Medical Kit!");
		ConfigHandler.largeMedBoostTime = config.getInt("Teir 4 Meical Item Boost Time", "Medical Items", 60, 0, 300, "Sets how long the player has 6 extra hearts on the Large Medical Kit!\n[Does not stack]");
		
		config.addCustomCategoryComment("Kappa Pick", "Fun Stuff\n[Not PicKappa stop asking!]");
		ConfigHandler.kappa_pick = config.getBoolean("Kappa Pick", "Kappa Pick", true, "Enable Kappa Pick?");
		ConfigHandler.kappa_level = config.getInt("Kappa Pick Mining Level", "Kappa Pick", 1, 0, 3, "Mining Level.");
		ConfigHandler.kappa_damage = config.getInt("Kappa Pick Mining Level Durability", "Kappa Pick", 31513, 100, Integer.MAX_VALUE, "Durability Level.");
		
		config.addCustomCategoryComment("Pizza", "Because Pineapple goes on Pizza! Kappa");
		ConfigHandler.bams_pizza = config.getBoolean("Bams Pizza", "Pizza", true, "Enable Bams Pizza?");
		ConfigHandler.bams_pizza_amount = config.getInt("Bams Pizza Heal Amount", "Pizza", 10, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.bams_pizza_sat = config.getFloat("Bams Pizza Saturation Amount", "Pizza", 1.0F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		
		config.addCustomCategoryComment("Succ Juice", "SUCC THE PEARLS");
		ConfigHandler.succ_juice = config.getBoolean("Pearl Juice", "Succ Juice", true, "Enable Pearl Juice?");
		ConfigHandler.succ_juice_bottle = config.getBoolean("Pearl Juice Recipe", "Succ Juice", false, "Enable Pearl Juice require a bottle in recipe?");
		
		config.addCustomCategoryComment("Sea Axe", "A Funny Thing");
		ConfigHandler.c_axe = config.getBoolean("Sea Axe", "Sea Axe", true, "Enable Sea Axe?");
		ConfigHandler.sea_axe = config.getBoolean("Sea Axe - Axe", "Sea Axe", true, "Enable Sea Axe as a Axe?\n[Axe has 11 attack damage!]\n[Only ENABLE if Sea Axe - Pickaxe is DISABLED!]\n[Sea Axe must be ENABLED for this config to work!]");
		ConfigHandler.sea_pickaxe = config.getBoolean("Sea Axe - Pickaxe", "Sea Axe", false, "Enable Sea Axe as a Pickaxe?\n[Pickaxe has 10 attack damage!]\n[Only ENABLE if Sea Axe - Axe is DISABLED!]\n[Sea Axe must be ENABLED for this config to work!]");
        
		if (config.hasChanged())
	        config.save();
	}
	
	public static void initOres()
	{
		
		File f = new File(configDir, "Ores.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
        
		config.addCustomCategoryComment("Lava Source Block Stones", "Lavastone!");
		ConfigHandler.lava_block = config.getBoolean("Lavastone", "Lava Source Block Stones", true, "Enable Lavastone?\n[Turns into a lava source block when broke]");
		ConfigHandler.lava_block_frequency = config.getInt("Lavastone Gen Frequency", "Lava Source Block Stones", 5, 1, 100, "Sets the Chance of Lavastone generating.");
		ConfigHandler.lava_block_min = config.getInt("Lavastone Gen Min", "Lava Source Block Stones", 12, 1, 255, "Sets the min Y level.");
		ConfigHandler.lava_block_max = config.getInt("Lavastone Gen Max", "Lava Source Block Stones", 32, 1, 255, "Sets the max Y level.");
		ConfigHandler.lava_block_size = config.getInt("Lavastone Gen Size", "Lava Source Block Stones", 4, 1, 100, "Sets the Lavastone Vein Size.");
		
		config.addCustomCategoryComment("Water Source Block Stones", "Waterstone!");
		ConfigHandler.water_block = config.getBoolean("Waterstone", "Water Source Block Stones", true, "Enable Waterstone?\n[Turns into a water source block when broke]");
		ConfigHandler.water_block_frequency = config.getInt("Waterstone Gen Frequency", "Water Source Block Stones", 5, 1, 100, "Sets the Chance of Waterstone generating.");
		ConfigHandler.water_block_min = config.getInt("Waterstone Gen Min", "Water Source Block Stones", 32, 1, 255, "Sets the min Y level.");
		ConfigHandler.water_block_max = config.getInt("Waterstone Gen Max", "Water Source Block Stones", 48, 1, 255, "Sets the max Y level.");
		ConfigHandler.water_block_size = config.getInt("Waterstone Gen Size", "Water Source Block Stones", 4, 1, 100, "Sets the Waterstone Vein Size.");
		
		config.addCustomCategoryComment("Ender Ore", "Might as well add this");
		ConfigHandler.ender_ore = config.getBoolean("Ender Ore", "Ender Ore", true, "Enable Ender Ore?");
		ConfigHandler.ender_mite = config.getBoolean("Endermite", "Ender Ore", true, "Enable Endermite spawn?");
		ConfigHandler.endermite_spawn = config.getInt("Endermite Spawn", "Ender Ore", 25, 0, 100, "Sets the Chance of Endermites to spawn when Ore is mined.");
		ConfigHandler.ender_ore_frequency = config.getInt("Ender Ore Frequency", "Ender Ore", 5, 1, 100, "Sets the Chance of Ender ore generating.");
		ConfigHandler.ender_ore_min = config.getInt("Ender Ore Min", "Ender Ore", 1, 1, 255, "Sets the min Y level.");
		ConfigHandler.ender_ore_max = config.getInt("Ender Ore Max", "Ender Ore", 32, 1, 255, "Sets the max Y level.");
		ConfigHandler.ender_ore_size = config.getInt("Ender Ore Size", "Ender Ore", 4, 1, 100, "Sets the Ender Ore Vein Size.");
		
		config.addCustomCategoryComment("Charcoal", "It's the little things that count right?\n[Charcoal Block must be ENABLED in Main.cfg]");
		ConfigHandler.CharcoalWorldgen = config.getBoolean("Charcoal Block Nether Worldgen", "Charcoal", true, "Enable the Charcoal Block to spawn in the nether?");
		ConfigHandler.charcoal_frequency = config.getInt("Charcoal Block Nether Worldgen Frequency", "Charcoal", 10, 1, 100, "Sets the Chance of Charcoal Block.");
		ConfigHandler.charcoal_min = config.getInt("Charcoal Block Nether Worldgen Min", "Charcoal", 1, 1, 255, "Sets the min Y level.");
		ConfigHandler.charcoal_max = config.getInt("Charcoal Block Nether Worldgen Max", "Charcoal", 128, 1, 255, "Sets the max Y level.");
		ConfigHandler.charcoal_size = config.getInt("Charcoal Block Nether Worldgen Size", "Charcoal", 10, 1, 100, "Sets the Charcoal Vein Size.");  
		
		config.addCustomCategoryComment("WUB Juice Overworld Ore", "[Requires WUB Juice to be ENABLED in the Supporters.cfg]");
		ConfigHandler.overworld_wub = config.getBoolean("Overworld Wub Ore", "WUB Juice Overworld Ore", true, "Enable Overworld Wub Ore?");
		ConfigHandler.wub_block_count = config.getInt("Overworld Wub Ore Gen Size", "WUB Juice Overworld Ore", 5, 1, 100, "Sets the Overworld Wub Ore Vein Size.");
		ConfigHandler.wub_block_frequency = config.getInt("Overworld Wub Ore Gen Chance", "WUB Juice Overworld Ore", 50, 1, 100, "Sets the Chance of Overworld Wub Ore generating.");
		ConfigHandler.wub_block_min = config.getInt("Overworld Wub Ore Gen Min", "WUB Juice Overworld Ore", 1, 1, 255, "Sets the Overworld min Y level.");
		ConfigHandler.wub_block_max = config.getInt("Overworld Wub Ore Gen Max", "WUB Juice Overworld Ore", 255, 1, 255, "Sets the Overworld max Y level.");
		
		config.addCustomCategoryComment("WUB Juice Nether Ore", "[Requires WUB Juice to be ENABLED in the Supporters.cfg]");
		ConfigHandler.nether_wub = config.getBoolean("Nether Wub Ore", "WUB Nether Juice Ore", true, "Enable Nether Wub Ore?");
		ConfigHandler.nether_wub_block_count = config.getInt("Nether Wub Ore Gen Size", "WUB Nether Juice Ore", 5, 1, 100, "Sets the Nether Wub Ore Vein Size.");
		ConfigHandler.nether_wub_block_frequency = config.getInt("Nether Wub Ore Gen Chance", "WUB Nether Juice Ore", 50, 1, 100, "Sets the Chance of Nether Wub Ore generating.");
		ConfigHandler.nether_wub_block_min = config.getInt("Nether Wub Ore Gen Min", "WUB Nether Juice Ore", 1, 1, 120, "Sets the Nether min Y level.");
		ConfigHandler.nether_wub_block_max = config.getInt("Nether Wub Ore Gen Max", "WUB Nether Juice Ore", 120, 1, 120, "Sets the Nether max Y level.");
		
		if (config.hasChanged())
	        config.save();
	}
	
	public static void initExtra()
	{
		
		File f = new File(configDir, "Extras.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
        
		config.addCustomCategoryComment("Dirt Drops", "Extra Drops");
		ConfigHandler.BoneDrops = config.getBoolean("Bone Drops", "Dirt Drops", true, "Enable Bones to drop from Dirt?");
		ConfigHandler.BoneDropsChance = config.getInt("Bone Drop Chance", "Dirt Drops", 1, 0, 100, "Sets the Chance of Bones from Dirt.");
		ConfigHandler.BoneAmount = config.getInt("Bone Drop Amount", "Dirt Drops", 1, 1, 64, "Sets the Amount of Bones Dropped from Dirt.");
		ConfigHandler.SkullDrops = config.getBoolean("Skull Drops", "Dirt Drops", true, "Enable Skulls to drop from Dirt?");
		ConfigHandler.SkullDropsChance = config.getInt("Skull Drop Chance", "Dirt Drops", 1, 0, 100, "Sets the Chance of Skulls from Dirt.");
		ConfigHandler.SkullAmount = config.getInt("Skull Drop Amount", "Dirt Drops", 1, 1, 64, "Sets the Amount of Skulls Dropped from Dirt.");
		
		config.addCustomCategoryComment("Bricks", "Because People Love Bricks");
		ConfigHandler.AndesiteBrick = config.getBoolean("Andesite Bricks", "Bricks", false, "Enable Andesite Bricks?");
		ConfigHandler.DioriteBrick = config.getBoolean("Diorite Bricks", "Bricks", false, "Enable Diorite Bricks?");
		ConfigHandler.GraniteBrick = config.getBoolean("Granite Bricks", "Bricks", false, "Enable Granite Bricks?");
		
		config.addCustomCategoryComment("Tiny Coal & Charcoal", "tiny things.");
		ConfigHandler.tiny_charcoal = config.getBoolean("Tiny Charcoal", "Tiny Coal & Charcoal", true, "Enable Tiny Charcoal?");
		FuelHandler.tiny_charcoal_burntime = config.getInt("Tiny Charcoal Burn Time", "Tiny Coal & Charcoal", 200, 0, Integer.MAX_VALUE, "Sets the burn time for Tiny Charcoal.");
		ConfigHandler.tiny_coal = config.getBoolean("Tiny Coal", "Tiny Coal & Charcoal", true, "Enable Tiny Coal?");
		FuelHandler.tiny_coal_burntime = config.getInt("Tiny Coal Burn Time", "Tiny Coal & Charcoal", 200, 0, Integer.MAX_VALUE, "Sets the burn time for Tiny Coal.");
		
		config.addCustomCategoryComment("Steel", "Used to craft the Infinity Bucket.\n[Uses oredict and works with other mods]");
		ConfigHandler.steel_ingot = config.getBoolean("Steel Ingots", "Steel", true, "Enable Steel Ingots?");
		
		config.addCustomCategoryComment("Rib", "Used for Crafting!\n[DO NOT ENABLE if Wither Armor is ENABLED.]");
		ConfigHandler.wither_rib = config.getBoolean("Wither Rib", "Rib", false, "Enable Wither Rib?");
		
		config.addCustomCategoryComment("Seeds", "Things to plant?");
		ConfigHandler.MyceliumSeeds = config.getBoolean("Mycelium Seeds", "Seeds", true, "Enable Mycelium Seeds?");
		
		config.addCustomCategoryComment("Torch", "I'll light the way!\n[Do not ENABLE if Tinkers is installed.]");
		ConfigHandler.StoneTorch = config.getBoolean("Stone Torch", "Torch", false, "Enable Stone Torch?");
		
		config.addCustomCategoryComment("Flint", "A little extra flint can help, right?\n[Do not ENABLE is Tinkers is installed.]");
		ConfigHandler.FlintRecipe = config.getBoolean("Flint Recipe", "Flint", false, "Enable 3 Gravel into Flint Recipe?");
		
		config.addCustomCategoryComment("Harder Stone", "It's the little things that count right?\n[Required for Recipes in this mod.]");
		ConfigHandler.hardened_stone = config.getBoolean("Hardened Stone", "Harder Stone", true, "Enable Hardened Stone?");
		
		config.addCustomCategoryComment("Sugar", "even the dead stuff can help!\n[Can be used as FOOD for a small amount as well.]");
		ConfigHandler.old_reed = config.getBoolean("Dead Sugar Cane", "Sugar", true, "Enable Dead Sugar Cane?");
		
		config.addCustomCategoryComment("Pouch", "More storage anyone?");
		ConfigHandler.pouch = config.getBoolean("Pouch", "Pouch", true, "Enable Pouch?");
		
		config.addCustomCategoryComment("Repair Tablet", "Need some extra durability, eh?\n[Repairs Items in Players Inventory only.]");
		ConfigHandler.repair_tablet = config.getBoolean("Repair Tablet", "Repair Tablet", true, "Enable Repair Tablet?");
		ConfigHandler.repair_tablet_cooldown = config.getInt("Repair Tablet Cooldown", "Repair Tablet", 20, 1, Integer.MAX_VALUE, "Cooldown (in ticks) between repair processes.");
		
		config.addCustomCategoryComment("Infinity", "Unlimited Water!\n[Requires Steel to be enabled.]");
		ConfigHandler.infin_bucket = config.getBoolean("Infinity Water Bucket", "Infinity", true, "Enable Infinity Water Bucket?");
		
		config.addCustomCategoryComment("Extra Tree Drops", "Extra Drops");
		ConfigHandler.extra_drops = config.getBoolean("Extra Fruit Drops", "Extra Tree Drops", true, "Enable Pears and Peaches to drop from leaves?");
		ConfigHandler.extra_drop_bottle = config.getBoolean("Extra Fruit Drops need bottle to make juice", "Extra Tree Drops", false, "Enable Bottle in recipe?");
		ConfigHandler.pearDropsChance = config.getInt("Extra Fruit Drops Pear Chance", "Extra Tree Drops", 1, 0, 100, "Sets the Chance of Pears from leaves.");
		ConfigHandler.pearDropsAmount = config.getInt("Extra Fruit Drops Pear Amount", "Extra Tree Drops", 1, 1, 64, "Sets the Amount of Pears Dropped from leaves.");
		ConfigHandler.peachDropsChance = config.getInt("Extra Fruit Drops Peach Chance", "Extra Tree Drops", 1, 0, 100, "Sets the Chance of Peaches from leaves.");
		ConfigHandler.peachDropsAmount = config.getInt("Extra Fruit Drops Peach Amount", "Extra Tree Drops", 1, 1, 64, "Sets the Amount of Peaches Dropped from leaves.");
		ConfigHandler.peachAmount = config.getInt("Extra Fruit Drops Peach Juice Heal Amount", "Extra Tree Drops", 4, 1, 20, "Sets the Heal Amount of Peach Juice.");
		ConfigHandler.peachSaturation = config.getFloat("Extra Fruit Drops Peach Juice Saturation Amount", "Extra Tree Drops", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount of Peach Juice.");
		ConfigHandler.pearAmount = config.getInt("Extra Fruit Drops Pear Juice Heal Amount", "Extra Tree Drops", 4, 1, 20, "Sets the Heal Amount of Pear Juice.");
		ConfigHandler.pearSaturation = config.getFloat("Extra Fruit Drops Pear Juice Saturation Amount", "Extra Tree Drops", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount of Pear Juice.");
		ConfigHandler.stickDropsChance = config.getInt("Extra Fruit Drops Stick Chance", "Extra Tree Drops", 1, 0, 100, "Sets the Chance of Sticks from leaves.");
		ConfigHandler.stickDropsAmount = config.getInt("Extra Fruit Drops Stick Amount", "Extra Tree Drops", 1, 1, 64, "Sets the Amount of Sticks Dropped from leaves.");
		ConfigHandler.appleDropsChance = config.getInt("Extra Fruit Drops Apple Chance", "Extra Tree Drops", 1, 0, 100, "Sets the Chance of Apple from leaves.");
		ConfigHandler.appleDropsAmount = config.getInt("Extra Fruit Drops Apple Amount", "Extra Tree Drops", 1, 1, 64, "Sets the Amount of Apple Dropped from leaves.");

		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initArmor()
	{
		
		File f = new File(configDir, "Armor.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
		
		config.addCustomCategoryComment("Armor", "Why not");
		ArmorHandler.StoneArmor = config.getBoolean("Stone Armor", "Armor", true, "Enable Stone Armor?");
		ArmorHandler.FlintArmor = config.getBoolean("Flint Armor", "Armor", true, "Enable Flint Armor?");
		ArmorHandler.BoneArmor = config.getBoolean("Bone Armor", "Armor", true, "Enable Bone Armor?");
		ArmorHandler.WoodArmor = config.getBoolean("Wooden Armor", "Armor", true, "Enable Wooden Armor?");
		ArmorHandler.emerald_amor = config.getBoolean("Emerald Armor", "Armor", true, "Enable Emerald Armor?");
		ArmorHandler.chain_armor = config.getBoolean("Chain Armor", "Armor", true, "Enable Chain Armor Recipe?");
		ArmorHandler.lava_armor = config.getBoolean("Lava Armor", "Armor", true, "Enable Lava Armor?");
		ArmorHandler.dragon_armor = config.getBoolean("Dragon Armor", "Armor", true, "Enable Dragon Armor?");
		ArmorHandler.wither_armor = config.getBoolean("Wither Armor", "Armor", true, "Enable Wither Armor?");
		ArmorHandler.lapis_armor = config.getBoolean("Lapis Armor", "Armor", true, "Enable Lapis Armor?");
		ArmorHandler.obsidian_armor = config.getBoolean("Obsidian Armor", "Armor", true, "Enable Obsidian Armor?");
		ArmorHandler.quartz_armor = config.getBoolean("Quartz Armor", "Armor", true, "Enable Quartz Armor?");
		ArmorHandler.redstone_armor = config.getBoolean("Redstone Armor", "Armor", true, "Enable Redstone Armor?");
		
		config.addCustomCategoryComment("Lava Armor", "What Armor?\n[Needs Emerald armor to be enabled]");
		ArmorHandler.lava_armor_resistance = config.getBoolean("Lava Armor Resistance", "Lava Armor", true, "Enable Lava Armor Resistance?");
		ArmorHandler.lava_armor_resistance_lvl = config.getInt("Lava Armor Resistance Level", "Lava Armor", 0, 0, 10, "Resistance Level.");
		ArmorHandler.lava_armor_fire = config.getBoolean("Lava Armor Fire Resistance", "Lava Armor", true, "Enable Lava Armor Fire Resistance?");
		ArmorHandler.lava_armor_fire_lvl = config.getInt("Lava Armor Fire Resistance Level", "Lava Armor", 0, 0, 10, "Fire Resistance Level.");
		
		config.addCustomCategoryComment("Dragon Armor", "End Game Armor");
		ArmorHandler.dragon_fly = config.getBoolean("Dragon Armor Allow Flight", "Dragon Armor", true, "Enable Dragon Armor Flight?");
		ArmorHandler.dragon_resistance = config.getBoolean("Dragon Armor Resistance", "Dragon Armor", true, "Enable Dragon Armor Resistance?");
		ArmorHandler.dragon_resistance_lvl = config.getInt("Dragon Armor Resistance Level", "Dragon Armor", 1, 0, 10, "Resistance Level.");
		ArmorHandler.dragon_fire = config.getBoolean("Dragon Armor Fire Resistance", "Dragon Armor", true, "Enable Dragon Armor Fire Resistance?");
		ArmorHandler.dragon_fire_lvl = config.getInt("Dragon Armor Fire Resistance Level", "Dragon Armor", 1, 0, 10, "Fire Resistance Level.");
		ArmorHandler.dragon_strength = config.getBoolean("Dragon Armor Strength", "Dragon Armor", true, "Enable Dragon Armor Strength?");
		ArmorHandler.dragon_strength_lvl = config.getInt("Dragon Armor Strength Level", "Dragon Armor", 1, 0, 10, "Strength Level.");
		
		config.addCustomCategoryComment("Wither Armor", "Mid Game Armor");
		ArmorHandler.wither_resistance = config.getBoolean("Wither Armor Resistance", "Wither Armor", true, "Enable Wither Armor Resistance?");
		ArmorHandler.wither_resistance_lvl = config.getInt("Wither Armor Resistance Level", "Wither Armor", 0, 0, 10, "Resistance Level.");
		ArmorHandler.wither_fire = config.getBoolean("Wither Armor Fire Resistance", "Wither Armor", true, "Enable Wither Armor Fire Resistance?");
		ArmorHandler.wither_fire_lvl = config.getInt("Wither Armor Fire Resistance Level", "Wither Armor", 0, 0, 10, "Fire Resistance Level.");
		ArmorHandler.wither_strength = config.getBoolean("Wither Armor Strength", "Wither Armor", true, "Enable Wither Armor Strength?");
		ArmorHandler.wither_strength_lvl = config.getInt("Wither Armor Strength Level", "Wither Armor", 0, 0, 10, "Strength Level.");
		
		config.addCustomCategoryComment("Lapis Armor", "Lets go under the water");
		ArmorHandler.lapis_armor_water = config.getBoolean("Lapis Armor Water Breathing", "Lapis Armor", true, "Enable Lapis Water Breathing?");
		ArmorHandler.lapis_armor_water_lvl = config.getInt("Lapis Armor Water Breathing Level", "Lapis Armor", 0, 0, 10, "Water Breathing Level.");
		
		config.addCustomCategoryComment("Obsidian Armor", "What?");
		ArmorHandler.obsidian_armor_resistance = config.getBoolean("Obsidian Armor Resistance", "Obsidian Armor", true, "Enable Obsidian Resistance?");
		ArmorHandler.obsidian_armor_resistance_lvl = config.getInt("Obsidian Armor Resistance Level", "Obsidian Armor", 0, 0, 10, "Resistance Level.");
		
		config.addCustomCategoryComment("Quartz Armor", "You went where?");
		ArmorHandler.quartz_armor_strength = config.getBoolean("Quartz Armor Strength", "Quartz Armor", true, "Enable Quartz Strength?");
		ArmorHandler.quartz_armor_strength_lvl = config.getInt("Quartz Armor Strength Level", "Quartz Armor", 0, 0, 10, "Strength Level.");
		
		config.addCustomCategoryComment("Redstone Armor", "How fast you want to go?");
		ArmorHandler.redstone_armor_speed = config.getBoolean("Redstone Armor Speed", "Redstone Armor", true, "Enable Redstone Speed?");
		ArmorHandler.redstone_armor_speed_lvl = config.getInt("Redstone Armor Speed Level", "Redstone Armor", 0, 0, 10, "Speed Level.");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initToolsWeapons()
	{
		
		File f = new File(configDir, "Tools & Weapons.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
		
		config.addCustomCategoryComment("Flint and Bone Tools & Weapons", "Cause Progression!");
		ConfigHandler.BoneTools = config.getBoolean("Bone Tools & Weapons", "Flint and Bone Tools & Weapons", true, "Enable Bone Tools & Weapons?");
		ConfigHandler.FlintTools = config.getBoolean("Flint  Tools & Weapons", "Flint and Bone Tools & Weapons", true, "Enable Flint Tools & Weapons?");
		
		config.addCustomCategoryComment("Scythes", "Because I love to farm and stuff!\n[WIP - Enable at your own risk.]\n[Known bug - May Dupe Drops with some modded crops]");
		ConfigHandler.wooden_scythe = config.getBoolean("Wooden Scythe", "Scythes", false, "Enable Wooden Scythe?");
		ConfigHandler.stone_scythe = config.getBoolean("Stone Scythe", "Scythes", false, "Enable Stone Scythe?");
		ConfigHandler.golden_scythe = config.getBoolean("Golden Scythe", "Scythes", false, "Enable Golden Scythe?");
		ConfigHandler.iron_scythe = config.getBoolean("Iron Scythe", "Scythes", false, "Enable Iron Scythe?");
		ConfigHandler.diamond_scythe = config.getBoolean("Diamond Scythe", "Scythes", false, "Enable Diamond Scythe?");
		ConfigHandler.emerald_scythe = config.getBoolean("Emerald Scythe", "Scythes", false, "Enable Emerald Scythe?");
		ConfigHandler.obsidian_scythe = config.getBoolean("Obsidian Scythe", "Scythes", false, "Enable Obsidian Scythe?");
		
		config.addCustomCategoryComment("Paxels", "Because I love weird stuff!\n[Requires Other Items in this mod.]");
		ConfigHandler.wooden_multi = config.getBoolean("Wooden Paxel", "Paxels", true, "Enable Wooden Paxel?");
		ConfigHandler.stone_multi = config.getBoolean("Stone Paxel", "Paxels", true, "Enable Stone Paxel?");
		ConfigHandler.golden_multi = config.getBoolean("Golden Paxel", "Paxels", true, "Enable Golden Paxel?");
		ConfigHandler.iron_multi = config.getBoolean("Iron Paxel", "Paxels", true, "Enable Iron Paxel?");
		ConfigHandler.diamond_multi = config.getBoolean("Diamond Paxel", "Paxels", true, "Enable Diamond Paxel?");
		ConfigHandler.emerald_multi = config.getBoolean("Emerald Paxel", "Paxels", true, "Enable Emerald Paxel?");
		ConfigHandler.obsidian_multi = config.getBoolean("Obsidian Paxel", "Paxels", true, "Enable Obsidian Paxel?");
		ConfigHandler.flint_multi = config.getBoolean("Flint Paxel", "Paxels", true, "Enable Flint Paxel?");
		
		config.addCustomCategoryComment("Spears", "Don't mess with the long arm of the LAW!");
		ConfigHandler.spear_reach = config.getInt("A Spears Extended Reach", "Spears", 7, 5, 10, "Sets the Reach of a Spear.\n[Vanilla is 5 blocks!]");
		ConfigHandler.wooden_spear = config.getBoolean("Wooden Spear", "Spears", true, "Enable Wooden Spear?");
		ConfigHandler.stone_spear = config.getBoolean("Stone Spear", "Spears", true, "Enable Stone Spear?");
		ConfigHandler.golden_spear = config.getBoolean("Golden Spear", "Spears", true, "Enable Golden Spear?");
		ConfigHandler.iron_spear = config.getBoolean("Iron Spear", "Spears", true, "Enable Iron Spear?");
		ConfigHandler.diamond_spear = config.getBoolean("Diamond Spear", "Spears", true, "Enable Diamond Spear?");
		ConfigHandler.emerald_spear = config.getBoolean("Emerald Spear", "Spears", true, "Enable Emerald Spear?");
		ConfigHandler.obsidian_spear = config.getBoolean("Obsidian Spear", "Spears", true, "Enable Obsidian Spear?");
		
		config.addCustomCategoryComment("BattleAxes", "Because BIG AXES are better for Battles!");
		ConfigHandler.wooden_battle = config.getBoolean("Wooden BattleAxe", "BattleAxes", true, "Enable Wooden BattleAxe?");
		ConfigHandler.stone_battle = config.getBoolean("Stone BattleAxe", "BattleAxes", true, "Enable Stone BattleAxe?");
		ConfigHandler.golden_battle = config.getBoolean("Golden BattleAxe", "BattleAxes", true, "Enable Golden BattleAxe?");
		ConfigHandler.iron_battle = config.getBoolean("Iron BattleAxe", "BattleAxes", true, "Enable Iron BattleAxe?");
		ConfigHandler.diamond_battle = config.getBoolean("Diamond BattleAxe", "BattleAxes", true, "Enable Diamond BattleAxe?");
		ConfigHandler.emerald_battle = config.getBoolean("Emerald BattleAxe", "BattleAxes", true, "Enable Emerald BattleAxe?");
		ConfigHandler.obsidian_battle = config.getBoolean("Obsidian BattleAxe", "BattleAxes", true, "Enable Obsidian BattleAxe?");
		
		config.addCustomCategoryComment("Obsidian", "More uses for Obsidian!\n[Required for Other Items in this mod.]");
		ConfigHandler.obsidian_axe = config.getBoolean("Obsidian Axe", "Obsidian", true, "Enable Obsidian Axe?");
		ConfigHandler.obsidian_pickaxe = config.getBoolean("Obsidian Pickaxe", "Obsidian", true, "Enable Obsidian Pickaxe?");
		ConfigHandler.obsidian_hoe = config.getBoolean("Obsidian Hoe", "Obsidian", true, "Enable Obsidian Hoe?");
		ConfigHandler.obsidian_spade = config.getBoolean("Obsidian Shovel", "Obsidian", true, "Enable Obsidian Shovel?");
		ConfigHandler.obsidian_sword = config.getBoolean("Obsidian Sword", "Obsidian", true, "Enable Obsidian Sword?");
		
		config.addCustomCategoryComment("Emerald", "More uses for Emeralds!\n[Required for Other Items in this mod.]");
		ConfigHandler.emerald_axe = config.getBoolean("Emerald Axe", "Emerald", true, "Enable Emerald Axe?");
		ConfigHandler.emerald_pickaxe = config.getBoolean("Emerald Pickaxe", "Emerald", true, "Enable Emerald Pickaxe?");
		ConfigHandler.emerald_hoe = config.getBoolean("Emerald Hoe", "Emerald", true, "Enable Emerald Hoe?");
		ConfigHandler.emerald_spade = config.getBoolean("Emerald Shovel", "Emerald", true, "Enable Emerald Shovel?");
		ConfigHandler.emerald_sword = config.getBoolean("Emerald Sword", "Emerald", true, "Enable Emerald Sword?");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initFood()
	{
		
		File f = new File(configDir, "Food & Drinks.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
		
		config.addCustomCategoryComment("Apples", "Just Because");
		ConfigHandler.EmeraldApple = config.getBoolean("Emerald Apple", "Apples", true, "Enable Emerald Apple?");
		ConfigHandler.NotchApple = config.getBoolean("Notch Apple", "Apples", true, "Bring back the Notch Apple Recipe?\n[Only Enable if you have Golden Apple Progression DISABLED.]");
		ConfigHandler.DiamondApple = config.getBoolean("Diamond Apple", "Apples", true, "Enable Diamond Apple?");
		ConfigHandler.iron_apple = config.getBoolean("Iron Apple", "Apples", true, "Enable Iron Apple?");
		ConfigHandler.redstone_apple = config.getBoolean("Redstone Apple", "Apples", true, "Enable Redstone Apple?");
		ConfigHandler.ApplePro = config.getBoolean("Golden Apple Progression", "Apples", false, "Enable Golden Apple Progression?\n[Only Enable if you have Notch Apple DISABLED.]");
		
		config.addCustomCategoryComment("Juice", "Everyone loves juice!\n[Only ENABLE one or the other.]");
		ConfigHandler.all_juices = config.getBoolean("Vanilla Juice W/O Bottles", "Juice", true, "Enable Juice W/O bottles in the recipe?");
		ConfigHandler.JuiceBottles = config.getBoolean("Vanilla Juice With Bottles", "Juice", false, "Enable Juice With bottles in the recipe?");
		
		config.addCustomCategoryComment("Juice Stats", "Everyone loves juice Stats!");
		ConfigHandler.AppleAmount = config.getInt("Apple Juice Heal Amount", "Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.AppleSaturation = config.getFloat("Apple Juice Saturation Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.CarrotAmount = config.getInt("Carrot Juice Heal Amount", "Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.CarrotSaturation = config.getFloat("Carrot Juice Saturation Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.PotatoAmount = config.getInt("Potato Juice Heal Amount", "Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.PotatoSaturation = config.getFloat("Potato Juice Saturation Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.BeetAmount = config.getInt("Beet Juice Heal Amount", "Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.BeetSaturation = config.getFloat("Beet Juice Saturation Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.CactusAmount = config.getInt("Cactus Juice Heal Amount", "Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.CactusSaturation = config.getFloat("Cactus Juice Saturation Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.SlimeAmount = config.getInt("Slime Juice Heal Amount", "Juices Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.SlimeSaturation = config.getFloat("Slime Juice Saturation Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.WheatAmount = config.getInt("Wheat Juice Heal Amount", "Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.WheatSaturation = config.getFloat("Wheat Juice Saturation Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.MelonAmount = config.getInt("Melon Juice Heal Amount", "Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.MelonSaturation = config.getFloat("Melon Juice Saturation Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.PumpkinAmount = config.getInt("Pumpkin Juice Heal Amount", "Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.PumpkinSaturation = config.getFloat("Pumpkin Juice Saturation Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		
		config.addCustomCategoryComment("Modded Juice", "Everyone loves Modded juice!\n[Only ENABLE one or the other.]");
		ConfigHandler.ExtraJuices = config.getBoolean("Extra Juice W/O Bottles", "Modded Juice", true, "Enable Juices W/O bottles in the recipe?");
		ConfigHandler.ExtraJuicesBottles = config.getBoolean("Extra Juice With Bottles", "Modded Juice", false, "Enable Juice With bottles in the recipe?");
		
		config.addCustomCategoryComment("Modded Juice Generation", "Extra Berry Plants!\n[Disable Extra Plant Generation if you want to use Naturas Berries instead!]\n[The higher the value, the more Plants are generated.]");
		ConfigHandler.ExtraPlantGen = config.getBoolean("Extra Plant Generation", "Modded Juice Generation", true, "Enable Extra Plant Generation?");
		ConfigHandler.berryPlantRarity = config.getInt("Extra Plant Generation Rarity", "Modded Juice Generation", 5, 1, Integer.MAX_VALUE, "Sets the Rarity of Berry Plants.");
		
		config.addCustomCategoryComment("Modded Juice Stats", "Everyone loves Modded juice Stats!");
		ConfigHandler.BlueberryAmount = config.getInt("Blueberry Juice Heal Amount", "Modded Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.BlueberrySaturation = config.getFloat("Blueberry Juice Saturation Amount", "Modded Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.BlackberryAmount = config.getInt("Blackberry Juice Heal Amount", "Modded Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.BlackberrySaturation = config.getFloat("Blackberry Juice Saturation Amount", "Modded Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.MaloberryAmount = config.getInt("Maloberry Juice Heal Amount", "Modded Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.MaloberrySaturation = config.getFloat("Maloberry Juice Saturation Amount", "Modded Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.RaspberryAmount = config.getInt("Raspberry Juice Heal Amount", "Modded Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.RaspberrySaturation = config.getFloat("Raspberry Juice Saturation Amount", "Modded Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		
		config.addCustomCategoryComment("Extra Food", "Want more food?");
		ConfigHandler.CookedBacon = config.getBoolean("Cooked Bacon", "Extra Food", true, "Enable Cooked Bacon?");
		ConfigHandler.MonsterJerky = config.getBoolean("Monster Jerky", "Extra Food", true, "Enable Monster jerky?");
		ConfigHandler.ToastedBread = config.getBoolean("Toasted Bread", "Extra Food", true, "Enable Toasted Bread?");
		ConfigHandler.FriedEgg = config.getBoolean("Fried Egg", "Extra Food", true, "Enable Fried Egg?");
		ConfigHandler.CookedMushrooms = config.getBoolean("Cooked Mushrooms", "Extra Food", true, "Enable Cooked Mushrooms?");
		ConfigHandler.BaconEggs = config.getBoolean("Bacon & Eggs", "Extra Food", true, "Enable Bacon & Eggs?");
		ConfigHandler.LittleCandy = config.getBoolean("Little Candy", "Extra Food", true, "Enable Little Candy?");
		ConfigHandler.Sandwiches = config.getBoolean("Sandwiches", "Extra Food", true, "Enable Sandwiches?");
		ConfigHandler.CookedApple = config.getBoolean("Cooked Apple", "Extra Food", true, "Enable Cooked Apple?");
		
		config.addCustomCategoryComment("Extra Food Stats", "Want more food Stats?\n[WIP Section]");
		ConfigHandler.ToastedAmount = config.getInt("Toasted Bread Heal Amount", "Extra Food Stats", 6, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.ToastedSaturation = config.getFloat("Toasted Bread Saturation Amount", "Extra Food Stats", 0.7F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		
		config.addCustomCategoryComment("Food Eat Duration", "How long it takes to eat food.");
		ConfigHandler.eat_timer = config.getInt("Eat Duration", "Food Eat Duration", 32, 8, Integer.MAX_VALUE, "Sets how long it takes to eat TP food.");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initReborn()
	{
		
		File f = new File(configDir, "Reborn.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
		
		config.addCustomCategoryComment("Better Sugar Cane", "Bringing back a oldie but goodie");
		ConfigHandler.bsc_rod = config.getBoolean("Better Sugar Cane Rod", "Better Sugar Cane", true, "Enable Better Sugar Cane Rod?\n[MUST be ENABLED for all Sugar Cane Tools and Weapons to work!]");
		// iron
		ConfigHandler.bsc_iron_tools_weapons = config.getBoolean("Iron Sugar Cane Tools and Weapons", "Better Sugar Cane", true, "Enable Iron Sugar Cane Tools and Weapons?\n[Better Sugar Cane Rod MUST be ENABLED!]");
		// gold
		ConfigHandler.bsc_gold_tools_weapons = config.getBoolean("Gold Sugar Cane Tools and Weapons", "Better Sugar Cane", true, "Enable Gold Sugar Cane Tools and Weapons?\n[Better Sugar Cane Rod MUST be ENABLED!]");
		// diamond
		ConfigHandler.bsc_diamond_tools_weapons = config.getBoolean("Diamond Sugar Cane Tools and Weapons", "Better Sugar Cane", true, "Enable Sugar Cane Tools and Weapons?\n[Better Sugar Cane Rod MUST be ENABLED!]");
		// cookie
		ConfigHandler.bsc_sugar_cookie = config.getBoolean("Sugar Cookie", "Better Sugar Cane", true, "Enable Sugar Cookie?");
		// sugar blocks
		ConfigHandler.bsc_sugar_compressed_blocks = config.getBoolean("Compressed Sugar", "Better Sugar Cane", true, "Enable Compressed Sugar?");
		// sugarcane blocks
		ConfigHandler.bsc_sugarcane_compressed_blocks = config.getBoolean("Compressed Sugar Cane", "Better Sugar Cane", true, "Enable Compressed Sugar Cane?");
		
		config.addCustomCategoryComment("Better Nether", "Bringing back a oldie but goodie 2");
		ConfigHandler.nether_rod = config.getBoolean("Better Nether Rod", "Better Nether", true, "Enable Better Nether Rod?\n[MUST be ENABLED for all Nether Tools and Weapons to work!]");
		// iron
		ConfigHandler.nether_iron_tools_weapons = config.getBoolean("Iron Netherrack Tools and Weapons", "Better Nether", true, "Enable Iron Netherrack Tools and Weapons?\n[Better Nether Rod MUST be ENABLED!]");
		// gold
		ConfigHandler.nether_gold_tools_weapons = config.getBoolean("Gold Netherrack Tools and Weapons", "Better Nether", true, "Enable Gold Netherrack Tools and Weapons?\n[Better Nether Rod MUST be ENABLED!]");
		// diamond
		ConfigHandler.nether_diamond_tools_weapons = config.getBoolean("Diamond Netherrack Tools and Weapons", "Better Nether", true, "Enable Diamond Netherrack Tools and Weapons?\n[Better Nether Rod MUST be ENABLED!]");
		// diamond
		ConfigHandler.nether_tools_weapons = config.getBoolean("Netherrack Tools and Weapons", "Better Nether", true, "Enable Netherrack Tools and Weapons?\n[Better Nether Rod MUST be ENABLED!]");
		// sugarcane blocks
		ConfigHandler.nether_compressed_blocks = config.getBoolean("Compressed Netherrack", "Better Nether", true, "Enable Compressed Netherrack?");
		
		if (config.hasChanged())
        config.save();
	}
}
