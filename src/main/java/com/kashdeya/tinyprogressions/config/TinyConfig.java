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
		
		config.addCustomCategoryComment(" Growth Crystal", "These like to grow things!");
		ConfigHandler.BlockGrowth = config.getBoolean("Growth Crystal Tier 1", " Growth Crystal", true, "Enable Growth Crystal Tier 1?");
		ConfigHandler.BlockGrowthTicks = config.getInt("Growth Crystal Tier 1 Speed", " Growth Crystal", 60, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 40 Ticks or 2 Seconds]\n[Default*40=1200 Ticks]");
		ConfigHandler.GrowthParticalTicks = config.getInt("Growth Crystal Tier 1 Particles", " Growth Crystal", 1000, 50, 1000, "Lower Number gives more Particles");
		ConfigHandler.BlockGrowthUpgrade = config.getBoolean("Growth Crystal Tier 2", " Growth Crystal", true, "Enable Growth Crystal Tier 2?\n[Requires Tier 1 to be Enabled]");
		ConfigHandler.BlockGrowthUpgradeTicks = config.getInt("Growth Crystal Tier 2 Speed", " Growth Crystal", 30, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 20 Ticks or 1 Second]\n[Default*20=800 Ticks]");
		ConfigHandler.GrowthUpgradeParticalTicks = config.getInt("Growth Crystal Tier 2 Particles", " Growth Crystal", 1000, 50, 1000, "Lower Number gives more Particles");
		ConfigHandler.BlockGrowthUpgradeTwo = config.getBoolean("Growth Crystal Tier 3", " Growth Crystal", true, "Enable Growth Crystal Tier 3?\n[Requires Tier 2 to be Enabled]");
		ConfigHandler.BlockGrowthUpgradeTwoTicks = config.getInt("Growth Crystal Tier 3 Speed", " Growth Crystal", 30, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 10 Ticks or 1/2 a Second]\n[Default*10=400 Ticks]");
		ConfigHandler.GrowthUpgradeTwoParticalTicks = config.getInt("Growth Crystal Tier 3 Particles", " Growth Crystal", 1000, 50, 1000, "Lower Number gives more Particles");
		ConfigHandler.ParticalTicks = config.getBoolean("Growth Crystal Particals", " Growth Crystal", false, "Enable Growth Crystal Particals?");
		
		config.addCustomCategoryComment(" Watering Cans", "Remember to water those plants!");
		ConfigHandler.WateringCan = config.getBoolean("Watering Can", " Watering Cans", true, "Enable Watering Can?");
		ConfigHandler.WateringCanChance = config.getInt("Watering Can Chance", " Watering Cans", 50, 1, 50, "Chance out of 50 that the Watering Can will tick the plant!");
		ConfigHandler.WateringCanUpgrade = config.getBoolean("Watering Can Reinforced", " Watering Cans", true, "Enable Reinforced Watering Can?\n[Requires Watering Can to be Enabled]");
		ConfigHandler.WateringCanUpgradeChance = config.getInt("Watering Can Reinforced Chance", " Watering Cans", 100, 50, 100, "Chance out of 100 that the Watering Can will tick the plant!");
		
		config.addCustomCategoryComment(" Cobblegen Crystals", "Everyone needs a little cobblestone!");
		ConfigHandler.Cobblegen = config.getBoolean("Cobblegen Crystal Tier 1", " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 1?");
		ConfigHandler.IronCobblegen = config.getBoolean("Cobblegen Crystal Tier 2", " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 2?\n[Requires Cobblegen Crystal Tier 1 to be Enabled for recipe]");
		ConfigHandler.DiamondCobblegen = config.getBoolean("Cobblegen Crystal Tier 3", " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 3?\n[Requires Cobblegen Crystal Tier 2 to be Enabled for recipe]");
		ConfigHandler.BlazeCobblegen = config.getBoolean("Cobblegen Crystal Tier 4", " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 4?\n[Requires Cobblegen Crystal Tier 3 to be Enabled for recipe]");
		ConfigHandler.EmeraldCobblegen = config.getBoolean("Cobblegen Crystal Tier 5", " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 5?\n[Requires Cobblegen Crystal Tier 4 to be Enabled for recipe]");
		
		config.addCustomCategoryComment(" Tree Drops", "Extra Drops");
		ConfigHandler.stickDrops = config.getBoolean("Stick Drops", " Tree Drops", true, "Enable Sticks to drop from leaves?");
		ConfigHandler.stickDropsChance = config.getFloat("Stick Drop Chance", " Tree Drops", 0.01F, 0.0F, 1.0F, "Sets the Chance of Sticks from leaves.");
		ConfigHandler.stickDropsAmmount = config.getInt("Stick Drop Ammount", " Tree Drops", 1, 1, 64, "Sets the Ammount of Sticks Dropped from leaves.");
		ConfigHandler.appleDrops = config.getBoolean("Apple Drops", " Tree Drops", true, "Enable Apple to drop from leaves?");
		ConfigHandler.appleDropsChance = config.getFloat("Apple Drop Chance", " Tree Drops", 0.01F, 0.0F, 1.0F, "Sets the Chance of Apple from leaves.");
		ConfigHandler.appleDropsAmmount = config.getInt("Apple Drop Ammount", " Tree Drops", 1, 1, 64, "Sets the Ammount of Apple Dropped from leaves.");
		
		config.addCustomCategoryComment(" Dirt Drops", "Extra Drops");
		ConfigHandler.BoneDrops = config.getBoolean("Bone Drops", " Dirt Drops", true, "Enable Bones to drop from Dirt?");
		ConfigHandler.BoneDropsChance = config.getFloat("Bone Drop Chance", " Dirt Drops", 0.01F, 0.0F, 1.0F, "Sets the Chance of Bones from Dirt.");
		ConfigHandler.BoneAmmount = config.getInt("Bone Drop Ammount", " Dirt Drops", 1, 1, 64, "Sets the Ammount of Bones Dropped from Dirt.");
		ConfigHandler.SkullDrops = config.getBoolean("Skull Drops", " Dirt Drops", true, "Enable Skulls to drop from Dirt?");
		ConfigHandler.SkullDropsChance = config.getFloat("Skull Drop Chance", " Dirt Drops", 0.01F, 0.0F, 1.0F, "Sets the Chance of Skulls from Dirt.");
		ConfigHandler.SkullAmmount = config.getInt("Skull Drop Ammount", " Dirt Drops", 1, 1, 64, "Sets the Ammount of Skulls Dropped from Dirt.");
		
		config.addCustomCategoryComment(" Reinforced Blocks", "True or False\n[Required for Other Items in this mod.]");
		ConfigHandler.ReinforcedGlass = config.getBoolean("Reinforced Glass Block", " Reinforced Blocks", true, "Enable Reinforced Glass Block?");
		ConfigHandler.ReinforcedObsidian = config.getBoolean("Reinforced Obsidian Block", " Reinforced Blocks", true, "Enable Reinforced Obsidian Block?");
		
		config.addCustomCategoryComment(" Compressed Blocks", "These blocks are required for Other Items in this mod.");
		ConfigHandler.BoneBlock = config.getBoolean("Compressed Bone Block", " Compressed Blocks", true, "Enable Compressed Bone Block?");
		ConfigHandler.FleshBlock = config.getBoolean("Compressed Flesh Block", " Compressed Blocks", true, "Enable Compressed Flesh Block?");
		ConfigHandler.NetherStarBlock = config.getBoolean("Compressed Nether Star Block", " Compressed Blocks", true, "Enable Compressed Nether Star Block?");
		ConfigHandler.FlintBlock = config.getBoolean("Compressed Flint Block", " Compressed Blocks", true, "Enable Compressed Flint Block?");
		
		config.addCustomCategoryComment(" Dirty Glass", "Just a little dirty!");
		ConfigHandler.DirtyGlass = config.getBoolean("Dirty Glass Block", " Dirty Glass", true, "Enable Dirty Glass Block?\n[Required for Other Items in this mod.]");
		
		config.addCustomCategoryComment(" Charcoal", "It's the little things that count right?");
		ConfigHandler.CharcoalBlock = config.getBoolean("Charcoal Block", " Charcoal", true, "Enable the Charcoal Block?");
		FuelHandler.CharcoalBlockBurn = config.getInt("Charcoal Block Burn Time", " Charcoal", 16000, 0, Integer.MAX_VALUE, "Sets the burn time for the Charcoal Block.");
		
		config.addCustomCategoryComment(" Lava Infused Stone", "Makes Obsidian and Cobblestone when Water is place around it.");
		ConfigHandler.lava_infused_stone = config.getBoolean("Lava Infused Stone", " Lava Infused Stone", true, "Enable Lava Infused Stone?");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initOres()
	{
		
		File f = new File(configDir, "Ores.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
        
		config.addCustomCategoryComment(" Lava Source Block Stones", "Lavastone!");
		ConfigHandler.lava_block = config.getBoolean("Lavastone", " Lava Source Block Stones", true, "Enable Lavastone?\n[Turns into a lava source block when broke]");
		ConfigHandler.lava_block_frequency = config.getInt("Lavastone Gen Frequency", " Lava Source Block Stones", 5, 1, 100, "Sets the Chance of Lavastone.");
		ConfigHandler.lava_block_min = config.getInt("Lavastone Gen Min", " Lava Source Block Stones", 16, 1, 255, "Sets the min Y level.");
		ConfigHandler.lava_block_max = config.getInt("Lavastone Gen Max", " Lava Source Block Stones", 32, 1, 255, "Sets the max Y level.");
		ConfigHandler.lava_block_size = config.getInt("Lavastone Gen Size", " Lava Source Block Stones", 3, 1, 100, "Sets the Lavastone Vein Size.");
		
		config.addCustomCategoryComment(" Water Source Block Stones", "Waterstone!");
		ConfigHandler.water_block = config.getBoolean("Waterstone", " Water Source Block Stones", true, "Enable Waterstone?\n[Turns into a water source block when broke]");
		ConfigHandler.water_block_frequency = config.getInt("Waterstone Gen Frequency", " Water Source Block Stones", 5, 1, 100, "Sets the Chance of Waterstone.");
		ConfigHandler.water_block_min = config.getInt("Waterstone Gen Min", " Water Source Block Stones", 32, 1, 255, "Sets the min Y level.");
		ConfigHandler.water_block_max = config.getInt("Waterstone Gen Max", " Water Source Block Stones", 48, 1, 255, "Sets the max Y level.");
		ConfigHandler.water_block_size = config.getInt("Waterstone Gen Size", " Water Source Block Stones", 3, 1, 100, "Sets the Waterstone Vein Size.");
		
		config.addCustomCategoryComment(" Ender Ore", "Might as well add this");
		ConfigHandler.ender_ore = config.getBoolean("Ender Ore", " Ender Ore", true, "Enable Ender Ore?");
		ConfigHandler.ender_mite = config.getBoolean("Endermite", " Ender Ore", true, "Enable Endermite spawn?");
		ConfigHandler.endermite_spawn = config.getFloat("Endermite Spawn", " Ender Ore", 0.25F, 0.0F, 1.0F, "Sets the Chance of Endermites to spawn when Ore is mined.");
		ConfigHandler.ender_ore_frequency = config.getInt("Ender Ore Frequency", " Ender Ore", 5, 1, 100, "Sets the Chance of Ender ore.");
		ConfigHandler.ender_ore_min = config.getInt("Ender Ore Min", " Ender Ore", 1, 1, 255, "Sets the min Y level.");
		ConfigHandler.ender_ore_max = config.getInt("Ender Ore Max", " Ender Ore", 32, 1, 255, "Sets the max Y level.");
		ConfigHandler.ender_ore_size = config.getInt("Ender Ore Size", " Ender Ore", 5, 1, 100, "Sets the Ender Ore Vein Size.");
		
		config.addCustomCategoryComment(" Charcoal", "It's the little things that count right?\n[Charcoal Block must be ENABLED in Main.cfg]");
		ConfigHandler.CharcoalWorldgen = config.getBoolean("Charcoal Block Nether Worldgen", " Charcoal", true, "Enable the Charcoal Block to spawn in the nether?");
		ConfigHandler.charcoal_frequency = config.getInt("Charcoal Block Nether Worldgen Frequency", " Charcoal", 10, 1, 100, "Sets the Chance of Charcoal Block.");
		ConfigHandler.charcoal_min = config.getInt("Charcoal Block Nether Worldgen Min", " Charcoal", 1, 1, 255, "Sets the min Y level.");
		ConfigHandler.charcoal_max = config.getInt("Charcoal Block Nether Worldgen Max", " Charcoal", 128, 1, 255, "Sets the max Y level.");
		ConfigHandler.charcoal_size = config.getInt("Charcoal Block Nether Worldgen Size", " Charcoal", 20, 1, 100, "Sets the Charcoal Vein Size.");        
		
		if (config.hasChanged())
	        config.save();
	}
	
	public static void initExtra()
	{
		
		File f = new File(configDir, "Extras.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
		
		config.addCustomCategoryComment(" Bricks", "Because People Love Bricks");
		ConfigHandler.AndesiteBrick = config.getBoolean("Andesite Bricks", " Bricks", false, "Enable Andesite Bricks?");
		ConfigHandler.DioriteBrick = config.getBoolean("Diorite Bricks", " Bricks", false, "Enable Diorite Bricks?");
		ConfigHandler.GraniteBrick = config.getBoolean("Granite Bricks", " Bricks", false, "Enable Granite Bricks?");
		
		config.addCustomCategoryComment(" Tiny Coal & Charcoal", "tiny things. Used to make Steel Ingots, Infinity Water Bucket and Artifact Rings");
		ConfigHandler.tiny_charcoal = config.getBoolean("Tiny Charcoal", " Tiny Coal & Charcoal", true, "Enable Tiny Charcoal?");
		FuelHandler.tiny_charcoal_burntime = config.getInt("Tiny Charcoal Burn Time", " Tiny Coal & Charcoal", 200, 0, Integer.MAX_VALUE, "Sets the burn time for Tiny Charcoal.");
		ConfigHandler.tiny_coal = config.getBoolean("Tiny Coal", " Tiny Coal & Charcoal", true, "Enable Tiny Coal?");
		FuelHandler.tiny_coal_burntime = config.getInt("Tiny Coal Burn Time", " Tiny Coal & Charcoal", 200, 0, Integer.MAX_VALUE, "Sets the burn time for Tiny Coal.");
		
		config.addCustomCategoryComment(" Steel", "Used to make Artifact Rings and Deco Block.");
		ConfigHandler.steel_ingot = config.getBoolean("Steel Ingots", " Steel", true, "Enable Steel Ingots?");
		
		config.addCustomCategoryComment(" Rib", "Used for Crafting!");
		ConfigHandler.wither_rib = config.getBoolean("Wither Rib", " Rib", true, "Enable Wither Rib?");
		
		config.addCustomCategoryComment(" Artifact Rings", "Needs Steel Enabled to be able to use!");
		ConfigHandler.artifact_rings = config.getBoolean("Artifact Rings", " Artifact Rings", true, "Enable Artifact Rings?");
		
		config.addCustomCategoryComment(" Seeds", "Things to plant?");
		ConfigHandler.MyceliumSeeds = config.getBoolean("Mycelium Seeds", " Seeds", true, "Enable Mycelium Seeds?");
		
		config.addCustomCategoryComment(" Medical Kit", "Need a little healing?");
		ConfigHandler.MedKit = config.getBoolean("Medkit", " Medical Kit", true, "Enable Medkit?");
		ConfigHandler.enableRegeneration = config.getBoolean("Medkit Regeneration", " Medical Kit", true, "Enable Regeneration?");
		ConfigHandler.healDuration = config.getInt("Medkit Regeneration Duration", " Medical Kit", 15, 1, Integer.MAX_VALUE, "How many ticks. (1 = 1 Tick)");
		ConfigHandler.healLevel = config.getInt("Medkit Regeneration Level", " Medical Kit", 2, 0, 2, "Sets the level of Regen!");
		ConfigHandler.healStack = config.getInt("Medkit Stacksize", " Medical Kit", 32, 1, 64, "Sets the Stacksize of the Medkit!");
		ConfigHandler.healinstant = config.getBoolean("Medkit Instant heal", " Medical Kit", false, "Enable Medkit Instant Heal?");
		ConfigHandler.useDuration = config.getInt("Medkit Use Duration", " Medical Kit", 32, 1, 128, "Sets how long it takes the player to apply the medkit!");
		
		config.addCustomCategoryComment(" Torch", "I'll light the way!");
		ConfigHandler.StoneTorch = config.getBoolean("Stone Torch", " Torch", true, "Enable Stone Torch?\n[Do not ENABLE if Tinkers is installed.]");
		
		config.addCustomCategoryComment(" Flint", "A little extra flint can help, right?");
		ConfigHandler.FlintRecipe = config.getBoolean("Flint Recipe", " Flint", true, "Enable 3 Gravel into Flint Recipe?\n[Do not ENABLE is Tinkers is installed.]");
		
		config.addCustomCategoryComment(" Harder Stone", "It's the little things that count right?\n[Required for Other Items in this mod.]");
		ConfigHandler.hardened_stone = config.getBoolean("Hardened Stone", " Harder Stone", true, "Enable Hardened Stone?");
		
		config.addCustomCategoryComment(" Sugar", "even the dead stuff can help!");
		ConfigHandler.old_reed = config.getBoolean("Dead Sugar Cane", " Sugar", true, "Enable Dead Sugar Cane?");
		
		config.addCustomCategoryComment(" Pouch", "More storage anyone?");
		ConfigHandler.pouch = config.getBoolean("Pouch", " Pouch", true, "Enable Pouch?");
		
		config.addCustomCategoryComment(" bamInati T-Shirt", "Cause it looks freaking AWESOME");
		ArmorHandler.bam_tshirt = config.getBoolean("bamInati T-Shirt", " bamInati T-Shirt", true, "Enable bamInati T-Shirt?");
		
		config.addCustomCategoryComment(" Floaty Block", "May save you from certain death!");
		ConfigHandler.angel_block = config.getBoolean("Floaty McFloaty Block", " Floaty Block", true, "Enable Floaty McFloaty Block?");
		
		config.addCustomCategoryComment(" Withered Bedrock", "Sink Into Madness Block");
		ConfigHandler.WitheredBlock = config.getBoolean("Withered Bedrock", " Withered Bedrock", false, "Enable Withered Bedrock?\n[This item is not a Craftable Block.]\n[To be used with Bedrock Replacer Mod]\n[MAY CAUSE SERVER LAG NEEDS MORE TESTING]");
		ConfigHandler.WitheredBlockParticals = config.getBoolean("Withered Particals", " Withered Bedrock", false, "Enable Player Withered Particals?");
		ConfigHandler.WitheredBlockTime = config.getInt("Withered Time", " Withered Bedrock", 3, 1, Integer.MAX_VALUE, "Sets the Time a player is Withered from standing on Withered Bedrock.\n[1 = 20Ticks]");
		
		config.addCustomCategoryComment(" Repair Tablet", "Need some extra durability, eh?");
		ConfigHandler.repair_tablet = config.getBoolean("Repair Tablet", " Repair Tablet", true, "Enable Repair Tablet?\n[Repairs in Players Inventory only.]");
		ConfigHandler.repair_tablet_cooldown = config.getInt("Repair Tablet Cooldown", " Repair Tablet", 20, 1, Integer.MAX_VALUE, "Cooldown (in ticks) between repair processes.");
		
		config.addCustomCategoryComment(" Quartz", "Added for Sky Factory 3 - If you enable please make a recipe for it, Other wise it does nothing.");
		ConfigHandler.QuartzKnife = config.getBoolean("Quartz Knife", " Quartz", false, "Enable the Quartz Knife and Dust Recipe?");
		ConfigHandler.QuartzKnifeDamage = config.getInt("Quartz Knife Durability", " Quartz", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		
		config.addCustomCategoryComment(" CUS", "Added for Can_U_Survive - If you enable please make a recipe for them, Other wise they do nothing.");
		ConfigHandler.FlintKnife = config.getBoolean("Flint Knife", " CUS", false, "Enable Flint Knife?");
		ConfigHandler.FlintKnifeDamage = config.getInt("Flint Knife Durability", " CUS", 100, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.StoneDust = config.getBoolean("Stone Dust", " CUS", false, "Enable Stone Dust?");
		
		config.addCustomCategoryComment(" WUB Juice", "WUB WUB WUB!");
		ConfigHandler.vasholine = config.getBoolean("WUB Juice", " WUB Juice", true, "Enable WUB Juice?");
		ConfigHandler.vasholine_heal_amount = config.getFloat("WUB Juice Heal Amount", " WUB Juice", 0.25F, 0.0F, 1.0F, "Sets the amount of heal Wub Juice does per tick.");
		ConfigHandler.vasholine_mobs = config.getBoolean("WUB Juice Hurts Mobs", " WUB Juice", false, "Enable mobs getting hurt?");	
		ConfigHandler.vasholine_mobs_amount = config.getFloat("WUB Juice Hurts Mobs Amount", " WUB Juice", 0.01F, 0.0F, 1.0F, "Sets the amount mobs get hurt.");
		
		config.addCustomCategoryComment(" Infinity", "Unlimited Water! Requires Steel to be enabled.");
		ConfigHandler.infin_bucket = config.getBoolean("Infinity Water Bucket", " Infinity", true, "Enable Infinity Water Bucket?");
		
		config.addCustomCategoryComment(" Extra Tree Drops", "Extra Fruit Drops");
		ConfigHandler.extra_drops = config.getBoolean("Extra Fruit Drops", " Extra Tree Drops", true, "Enable Pears and Peaches to drop from leaves?");
		ConfigHandler.extra_drop_bottle = config.getBoolean("Extra Fruit Drops need bottle to make juice", " Extra Tree Drops", false, "Enable Bottle in recipe?");
		ConfigHandler.pearDropsChance = config.getFloat("Pear Drop Chance", " Extra Tree Drops", 0.01F, 0.0F, 1.0F, "Sets the Chance of Pears from leaves.");
		ConfigHandler.pearDropsAmmount = config.getInt("Pear Drop Ammount", " Extra Tree Drops", 1, 1, 64, "Sets the Ammount of Pears Dropped from leaves.");
		ConfigHandler.peachDropsChance = config.getFloat("Peach Drop Chance", " Extra Tree Drops", 0.01F, 0.0F, 1.0F, "Sets the Chance of Peaches from leaves.");
		ConfigHandler.peachDropsAmmount = config.getInt("Peach Drop Ammount", " Extra Tree Drops", 1, 1, 64, "Sets the Ammount of Peaches Dropped from leaves.");
		ConfigHandler.peachAmount = config.getInt("Peach Juice Heal Amount", " Extra Tree Drops", 3, 1, 20, "Sets the Heal Amount of Peache Juice.");
		ConfigHandler.peachSaturation = config.getFloat("Peach Juice Saturation Amount", " Extra Tree Drops", 0.08F, 0.0F, 1.0F, "Sets the Saturation Amount of Peache Juice.");
		ConfigHandler.pearAmount = config.getInt("Pear Juice Heal Amount", " Extra Tree Drops", 3, 1, 20, "Sets the Heal Amount of Pear Juice.");
		ConfigHandler.pearSaturation = config.getFloat("Pear Juice Saturation Amount", " Extra Tree Drops", 0.08F, 0.0F, 1.0F, "Sets the Saturation Amount of Pear Juice.");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initArmor()
	{
		
		File f = new File(configDir, "Armor.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
		
		config.addCustomCategoryComment(" Armor", "Why not");
		ArmorHandler.StoneArmor = config.getBoolean("Stone Armor", " Armor", true, "Enable Stone Armor?");
		ArmorHandler.FlintArmor = config.getBoolean("Flint Armor", " Armor", true, "Enable Flint Armor?");
		ArmorHandler.BoneArmor = config.getBoolean("Bone Armor", " Armor", true, "Enable Bone Armor?");
		ArmorHandler.WoodArmor = config.getBoolean("Wooden Armor", " Armor", true, "Enable Wooden Armor?");
		ArmorHandler.emerald_amor = config.getBoolean("Emerald Armor", " Armor", true, "Enable Emerald Armor?");
		ArmorHandler.chain_armor = config.getBoolean("Chain Armor", " Armor", true, "Enable Chain Armor Recipe?");
		
		config.addCustomCategoryComment(" Lava Armor", "What Armor?");
		ArmorHandler.lava_armor = config.getBoolean("Lava Armor", " Lava Armor", true, "Enable Lava Armor?");
		ArmorHandler.lava_armor_resistance = config.getBoolean("Lava Armor Resistance", " Lava Armor", true, "Enable Lava Armor Resistance?");
		ArmorHandler.lava_armor_resistance_lvl = config.getInt("Lava Armor Resistance Level", " Lava Armor", 0, 0, 10, "Resistance Level.");
		ArmorHandler.lava_armor_fire = config.getBoolean("Lava Armor Fire Resistance", " Lava Armor", true, "Enable Lava Armor Fire Resistance?");
		ArmorHandler.lava_armor_fire_lvl = config.getInt("Lava Armor Fire Resistance Level", " Lava Armor", 0, 0, 10, "Fire Resistance Level.");
		
		config.addCustomCategoryComment(" Dragon Armor", "End Game Armor");
		ArmorHandler.dragon_armor = config.getBoolean("Dragon Armor", " Dragon Armor", true, "Enable Dragon Armor?");
		ArmorHandler.dragon_fly = config.getBoolean("Dragon Armor Allow Flight", " Dragon Armor", true, "Enable Dragon Armor Flight?");
		ArmorHandler.dragon_resistance = config.getBoolean("Dragon Armor Resistance", " Dragon Armor", true, "Enable Dragon Armor Resistance?");
		ArmorHandler.dragon_resistance_lvl = config.getInt("Dragon Armor Resistance Level", " Dragon Armor", 1, 0, 10, "Resistance Level.");
		ArmorHandler.dragon_fire = config.getBoolean("Dragon Armor Fire Resistance", " Dragon Armor", true, "Enable Dragon Armor Fire Resistance?");
		ArmorHandler.dragon_fire_lvl = config.getInt("Dragon Armor Fire Resistance Level", " Dragon Armor", 1, 0, 10, "Fire Resistance Level.");
		ArmorHandler.dragon_strength = config.getBoolean("Dragon Armor Strength", " Dragon Armor", true, "Enable Dragon Armor Strength?");
		ArmorHandler.dragon_strength_lvl = config.getInt("Dragon Armor Strength Level", " Dragon Armor", 1, 0, 10, "Strength Level.");
		
		config.addCustomCategoryComment(" Wither Armor", "Mid Game Armor");
		ArmorHandler.wither_armor = config.getBoolean("Wither Armor", " Wither Armor", true, "Enable Wither Armor?");
		ArmorHandler.wither_resistance = config.getBoolean("Wither Armor Resistance", " Wither Armor", true, "Enable Wither Armor Resistance?");
		ArmorHandler.wither_resistance_lvl = config.getInt("Wither Armor Resistance Level", " Wither Armor", 0, 0, 10, "Resistance Level.");
		ArmorHandler.wither_fire = config.getBoolean("Wither Armor Fire Resistance", " Wither Armor", true, "Enable Wither Armor Fire Resistance?");
		ArmorHandler.wither_fire_lvl = config.getInt("Wither Armor Fire Resistance Level", " Wither Armor", 0, 0, 10, "Fire Resistance Level.");
		ArmorHandler.wither_strength = config.getBoolean("Wither Armor Strength", " Wither Armor", true, "Enable Wither Armor Strength?");
		ArmorHandler.wither_strength_lvl = config.getInt("Wither Armor Strength Level", " Wither Armor", 0, 0, 10, "Strength Level.");
		
		config.addCustomCategoryComment(" Lapis Armor", "Lets go under the water");
		ArmorHandler.lapis_armor = config.getBoolean("Lapis Armor", " Lapis Armor", true, "Enable Wither Armor?");
		ArmorHandler.lapis_armor_water = config.getBoolean("Lapis Armor Water Breathing", " Lapis Armor", true, "Enable Wither Water Breathing?");
		ArmorHandler.lapis_armor_water_lvl = config.getInt("Lapis Armor Water Breathing Level", " Lapis Armor", 0, 0, 10, "Water Breathing Level.");
		
		config.addCustomCategoryComment(" Obsidian Armor", "What?");
		ArmorHandler.obsidian_armor = config.getBoolean("Obsidian Armor", " Obsidian Armor", true, "Enable Obsidian Armor?");
		ArmorHandler.obsidian_armor_resistance = config.getBoolean("Obsidian Armor Resistance", " Obsidian Armor", true, "Enable Obsidian Resistance?");
		ArmorHandler.obsidian_armor_resistance_lvl = config.getInt("Obsidian Armor Resistance Level", " Obsidian Armor", 0, 0, 10, "Resistance Level.");
		
		config.addCustomCategoryComment(" Quartz Armor", "You went where?");
		ArmorHandler.quartz_armor = config.getBoolean("Quartz Armor", " Quartz Armor", true, "Enable Quartz Armor?");
		ArmorHandler.quartz_armor_strength = config.getBoolean("Quartz Armor Strength", " Quartz Armor", true, "Enable Quartz Strength?");
		ArmorHandler.quartz_armor_strength_lvl = config.getInt("Quartz Armor Strength Level", " Quartz Armor", 0, 0, 10, "Strength Level.");
		
		config.addCustomCategoryComment(" Redstone Armor", "How fast you want to go?");
		ArmorHandler.redstone_armor = config.getBoolean("Redstone Armor", " Redstone Armor", true, "Enable Redstone Armor?");
		ArmorHandler.redstone_armor_speed = config.getBoolean("Redstone Armor Speed", " Redstone Armor", true, "Enable Redstone Speed?");
		ArmorHandler.redstone_armor_speed_lvl = config.getInt("Redstone Armor Speed Level", " Redstone Armor", 0, 0, 10, "Speed Level.");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initToolsWeapons()
	{
		
		File f = new File(configDir, "Tools & Weapons.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
		
		config.addCustomCategoryComment(" Happy Birthday Darkosto", "Fun Stuff");
		ConfigHandler.BirthdayPickaxe = config.getBoolean("Party Pickaxe", " Happy Birthday Darkosto", true, "Enable Party Pickaxe?");
		
		config.addCustomCategoryComment(" 5-Head Kappa Pick", "Fun Stuff");
		ConfigHandler.kappa_pick = config.getBoolean("Kappa Pick", " 5-Head Kappa Pick", true, "Enable Kappa Pick?");
		ConfigHandler.kappa_level = config.getInt("Kappa Pick Mining Level", " 5-Head Kappa Pick", 1, 0, 3, "Mining Level.");
		ConfigHandler.kappa_damage = config.getInt("Kappa Pick Mining Level Durability", " 5-Head Kappa Pick", 31513, 100, Integer.MAX_VALUE, "Durability Level.");
		
		config.addCustomCategoryComment(" Sea Axe", "A Funny Thing");
		ConfigHandler.c_axe = config.getBoolean("Sea Axe", " Sea Axe", true, "Enable Sea Axe?");
		ConfigHandler.sea_axe = config.getBoolean("Sea Axe - Axe", " Sea Axe", true, "Enable Sea Axe as a Axe?\n[Axe has 11 attack damage!]\n[Only ENABLE if Sea Axe - Pickaxe is DISABLED!]\n[Sea Axe must be ENABLED for this config to work!]");
		ConfigHandler.sea_pickaxe = config.getBoolean("Sea Axe - Pickaxe", " Sea Axe", false, "Enable Sea Axe as a Pickaxe?\n[Pickaxe has 10 attack damage!]\n[Only ENABLE if Sea Axe - Axe is DISABLED!]\n[Sea Axe must be ENABLED for this config to work!]");
		
		config.addCustomCategoryComment(" Flint and Bone Tools & Weapons", "Cause Progression!");
		ConfigHandler.BoneTools = config.getBoolean("Bone Tools & Weapons", " Flint and Bone Tools & Weapons", true, "Enable Bone Tools & Weapons?");
		ConfigHandler.FlintTools = config.getBoolean("Flint  Tools & Weapons", " Flint and Bone Tools & Weapons", true, "Enable Flint Tools & Weapons?");
		
		config.addCustomCategoryComment(" Scythes", "Because I love to farm and stuff!\n[WIP - Enable at your own risk.]");
		ConfigHandler.wooden_scythe = config.getBoolean("Wooden Scythe", " Scythes", false, "Enable Wooden Scythe?");
		ConfigHandler.stone_scythe = config.getBoolean("Stone Scythe", " Scythes", false, "Enable Stone Scythe?");
		ConfigHandler.golden_scythe = config.getBoolean("Golden Scythe", " Scythes", false, "Enable Golden Scythe?");
		ConfigHandler.iron_scythe = config.getBoolean("Iron Scythe", " Scythes", false, "Enable Iron Scythe?");
		ConfigHandler.diamond_scythe = config.getBoolean("Diamond Scythe", " Scythes", true, "Enable Diamond Scythe?");
		ConfigHandler.emerald_scythe = config.getBoolean("Emerald Scythe", " Scythes", false, "Enable Emerald Scythe?");
		ConfigHandler.obsidian_scythe = config.getBoolean("Obsidian Scythe", " Scythes", false, "Enable Obsidian Scythe?");
		
		config.addCustomCategoryComment(" MultiTools", "Because I love weird stuff!\n[Requires Other Items in this mod.]");
		ConfigHandler.wooden_multi = config.getBoolean("Wooden Paxel", " MultiTools", true, "Enable Wooden MultiTool?");
		ConfigHandler.stone_multi = config.getBoolean("Stone Paxel", " MultiTools", true, "Enable Stone MultiTool?");
		ConfigHandler.golden_multi = config.getBoolean("Golden Paxel", " MultiTools", true, "Enable Golden MultiTool?");
		ConfigHandler.iron_multi = config.getBoolean("Iron Paxel", " MultiTools", true, "Enable Iron MultiTool?");
		ConfigHandler.diamond_multi = config.getBoolean("Diamond Paxel", " MultiTools", true, "Enable Diamond MultiTool?");
		ConfigHandler.emerald_multi = config.getBoolean("Emerald Paxel", " MultiTools", true, "Enable Emerald MultiTool?");
		ConfigHandler.obsidian_multi = config.getBoolean("Obsidian Paxel", " MultiTools", true, "Enable Obsidian MultiTool?");
		
		config.addCustomCategoryComment(" Spears", "Because I love weird stuff!");
		ConfigHandler.spear_reach = config.getInt("A Spears Extended Reach", " Spears", 7, 5, 10, "Sets the Reach of a Spear.\n[Vanilla is 5 blocks!]");
		ConfigHandler.wooden_spear = config.getBoolean("Wooden Spear", " Spears", true, "Enable Wooden Spear?");
		ConfigHandler.stone_spear = config.getBoolean("Stone Spear", " Spears", true, "Enable Stone Spear?");
		ConfigHandler.golden_spear = config.getBoolean("Golden Spear", " Spears", true, "Enable Golden Spear?");
		ConfigHandler.iron_spear = config.getBoolean("Iron Spear", " Spears", true, "Enable Iron Spear?");
		ConfigHandler.diamond_spear = config.getBoolean("Diamond Spear", " Spears", true, "Enable Diamond Spear?");
		ConfigHandler.emerald_spear = config.getBoolean("Emerald Spear", " Spears", true, "Enable Emerald Spear?");
		ConfigHandler.obsidian_spear = config.getBoolean("Obsidian Spear", " Spears", true, "Enable Obsidian Spear?");
		
		config.addCustomCategoryComment(" BattleAxes", "Because I love weird stuff!");
		ConfigHandler.wooden_battle = config.getBoolean("Wooden BattleAxe", " BattleAxes", true, "Enable Wooden BattleAxe?");
		ConfigHandler.stone_battle = config.getBoolean("Stone BattleAxe", " BattleAxes", true, "Enable Stone BattleAxe?");
		ConfigHandler.golden_battle = config.getBoolean("Golden BattleAxe", " BattleAxes", true, "Enable Golden BattleAxe?");
		ConfigHandler.iron_battle = config.getBoolean("Iron BattleAxe", " BattleAxes", true, "Enable Iron BattleAxe?");
		ConfigHandler.diamond_battle = config.getBoolean("Diamond BattleAxe", " BattleAxes", true, "Enable Diamond BattleAxe?");
		ConfigHandler.emerald_battle = config.getBoolean("Emerald BattleAxe", " BattleAxes", true, "Enable Emerald BattleAxe?");
		ConfigHandler.obsidian_battle = config.getBoolean("Obsidian BattleAxe", " BattleAxes", true, "Enable Obsidian BattleAxe?");
		
		config.addCustomCategoryComment(" Obsidian", "Because I love weird stuff!\n[Required for Other Items in this mod.]");
		ConfigHandler.obsidian_axe = config.getBoolean("Obsidian Axe", " Obsidian", true, "Enable Obsidian Axe?");
		ConfigHandler.obsidian_pickaxe = config.getBoolean("Obsidian Pickaxe", " Obsidian", true, "Enable Obsidian Pickaxe?");
		ConfigHandler.obsidian_hoe = config.getBoolean("Obsidian Hoe", " Obsidian", true, "Enable Obsidian Hoe?");
		ConfigHandler.obsidian_spade = config.getBoolean("Obsidian Shovel", " Obsidian", true, "Enable Obsidian Shovel?");
		ConfigHandler.obsidian_sword = config.getBoolean("Obsidian Sword", " Obsidian", true, "Enable Obsidian Sword?");
		
		config.addCustomCategoryComment(" Emerald", "Because I love weird stuff!\n[Required for Other Items in this mod.]");
		ConfigHandler.emerald_axe = config.getBoolean("Emerald Axe", " Emerald", true, "Enable Emerald Axe?");
		ConfigHandler.emerald_pickaxe = config.getBoolean("Emerald Pickaxe", " Emerald", true, "Enable Emerald Pickaxe?");
		ConfigHandler.emerald_hoe = config.getBoolean("Emerald Hoe", " Emerald", true, "Enable Emerald Hoe?");
		ConfigHandler.emerald_spade = config.getBoolean("Emerald Shovel", " Emerald", true, "Enable Emerald Shovel?");
		ConfigHandler.emerald_sword = config.getBoolean("Emerald Sword", " Emerald", true, "Enable Emerald Sword?");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initFood()
	{
		
		File f = new File(configDir, "Food & Drinks.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
		
		config.addCustomCategoryComment(" Apples", "Just Because");
		ConfigHandler.EmeraldApple = config.getBoolean("Emerald Apple", " Apples", true, "Enable Emerald Apple?");
		ConfigHandler.NotchApple = config.getBoolean("Notch Apple", " Apples", true, "Bring back the Notch Apple Recipe?\n[Only Enable if you have Golden Apple Progression DISABLED.]");
		ConfigHandler.DiamondApple = config.getBoolean("Diamond Apple", " Apples", true, "Enable Diamond Apple?");
		ConfigHandler.iron_apple = config.getBoolean("Iron Apple", " Apples", true, "Enable Iron Apple?");
		ConfigHandler.redstone_apple = config.getBoolean("Redstone Apple", " Apples", true, "Enable Redstone Apple?");
		ConfigHandler.ApplePro = config.getBoolean("Golden Apple Progression", " Apples", false, "Enable Golden Apple Progression?\n[Only Enable if you have Notch Apple DISABLED.]");
		
		config.addCustomCategoryComment(" Juices", "Everyone loves juice!\n[Only ENABLE one or the other.]");
		ConfigHandler.all_juices = config.getBoolean("Vanilla Juices W/O Bottles", " Juices", true, "Enable Juices With out bottles in the recipe?");
		ConfigHandler.JuiceBottles = config.getBoolean("Vanilla Juices With Bottles", " Juices", false, "Enable Juices With bottles in the recipe?");
		
		config.addCustomCategoryComment(" Juices Stats", "Everyone loves juice Stats!");
		ConfigHandler.AppleAmount = config.getInt("Apple Juice Heal Amount", " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.AppleSaturation = config.getFloat("Apple Juice Saturation Amount", " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.CarrotAmount = config.getInt("Carrot Juice Heal Amount", " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.CarrotSaturation = config.getFloat("Carrot Juice Saturation Amount", " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.PotatoAmount = config.getInt("Potato Juice Heal Amount", " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.PotatoSaturation = config.getFloat("Potato Juice Saturation Amount", " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.BeetAmount = config.getInt("Beet Juice Heal Amount", " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.BeetSaturation = config.getFloat("Beet Juice Saturation Amount", " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.CactusAmount = config.getInt("Cactus Juice Heal Amount", " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.CactusSaturation = config.getFloat("Cactus Juice Saturation Amount", " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.SlimeAmount = config.getInt("Slime Juice Heal Amount", " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.SlimeSaturation = config.getFloat("Slime Juice Saturation Amount", " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.WheatAmount = config.getInt("Wheat Juice Heal Amount", " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.WheatSaturation = config.getFloat("Wheat Juice Saturation Amount", " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.MelonAmount = config.getInt("Melon Juice Heal Amount", " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.MelonSaturation = config.getFloat("Melon Juice Saturation Amount", " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.PumpkinAmount = config.getInt("Pumpkin Juice Heal Amount", " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.PumpkinSaturation = config.getFloat("Pumpkin Juice Saturation Amount", " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		
		config.addCustomCategoryComment(" Juices Extra", "Everyone loves juice!\n[Only ENABLE one or the other.]");
		ConfigHandler.ExtraPlantGen = config.getBoolean("Extra Plant Generation", " Juices Extra", true, "Enable Extra Plant Generation?\n[Disable Extra Plant Generation if you want to use Naturas Berries only!]");
		ConfigHandler.berryPlantRarity = config.getInt("Extra Plant Generation Rarity", " Juices Extra", 5, 1, Integer.MAX_VALUE, "Sets the Rarity of Berry Plants.\n[The higher the value, the more Plants are generated.]");
		ConfigHandler.ExtraJuices = config.getBoolean("Extra Juices W/O Bottles", " Juices Extra", true, "Enable Juices With out bottles in the recipe?");
		ConfigHandler.ExtraJuicesBottles = config.getBoolean("Extra Juices With Bottles", " Juices Extra", false, "Enable Juices With bottles in the recipe?");
		
		config.addCustomCategoryComment(" Juices Extra Stats", "Everyone loves juice Stats!");
		ConfigHandler.BlueberryAmount = config.getInt("Blueberry Juice Heal Amount", " Juices Extra Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.BlueberrySaturation = config.getFloat("Blueberry Juice Saturation Amount", " Juices Extra Stats", 0.08F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.BlackberryAmount = config.getInt("Blackberry Juice Heal Amount", " Juices Extra Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.BlackberrySaturation = config.getFloat("Blackberry Juice Saturation Amount", " Juices Extra Stats", 0.08F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.MaloberryAmount = config.getInt("Maloberry Juice Heal Amount", " Juices Extra Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.MaloberrySaturation = config.getFloat("Maloberry Juice Saturation Amount", " Juices Extra Stats", 0.08F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.RaspberryAmount = config.getInt("Raspberry Juice Heal Amount", " Juices Extra Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.RaspberrySaturation = config.getFloat("Raspberry Juice Saturation Amount", " Juices Extra Stats", 0.08F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		
		config.addCustomCategoryComment(" Extra Food", "Want more food?");
		ConfigHandler.bams_pizza = config.getBoolean("Bams Pizza", " Extra Food", true, "Enable Bams Pizza?");
		ConfigHandler.CookedBacon = config.getBoolean("Cooked Bacon", " Extra Food", true, "Enable Cooked Bacon?");
		ConfigHandler.MonsterJerky = config.getBoolean("Monster Jerky", " Extra Food", true, "Enable Monster jerky?");
		ConfigHandler.ToastedBread = config.getBoolean("Toasted Bread", " Extra Food", true, "Enable Toasted Bread?");
		ConfigHandler.FriedEgg = config.getBoolean("Fried Egg", " Extra Food", true, "Enable Fried Egg?");
		ConfigHandler.CookedMushrooms = config.getBoolean("Cooked Mushrooms", " Extra Food", true, "Enable Cooked Mushrooms?");
		ConfigHandler.BaconEggs = config.getBoolean("Bacon & Eggs", " Extra Food", true, "Enable Bacon & Eggs?");
		ConfigHandler.LittleCandy = config.getBoolean("Little Candy", " Extra Food", true, "Enable Little Candy?");
		ConfigHandler.Sandwiches = config.getBoolean("Sandwiches", " Extra Food", true, "Enable Sandwiches?");
		ConfigHandler.CookedApple = config.getBoolean("Cooked Apple", " Extra Food", true, "Enable Cooked Apple?");
		
		config.addCustomCategoryComment(" Extra Food Stats", "Want more food Stats?\n[WIP Section]");
		ConfigHandler.bams_pizza_amount = config.getInt("Bams Pizza Heal Amount", " Extra Food Stats", 10, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.bams_pizza_sat = config.getFloat("Bams Pizza Saturation Amount", " Extra Food Stats", 1.0F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.ToastedAmount = config.getInt("Toasted Bread Heal Amount", " Extra Food Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.ToastedSaturation = config.getFloat("Toasted Bread Saturation Amount", " Extra Food Stats", 0.5F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		
		config.addCustomCategoryComment(" Food Eat Duration", "How long it takes to eat food.");
		ConfigHandler.eat_timer = config.getInt("Eat Duration", " Food Eat Duration", 32, 8, Integer.MAX_VALUE, "Sets how long it takes to eat TP food.");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initReborn()
	{
		
		File f = new File(configDir, "Reborn.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
		
		config.addCustomCategoryComment(" Better Sugar Cane", "Bringing back a oldie but goodie");
		ConfigHandler.bsc_rod = config.getBoolean("Better Sugar Cane Rod", " Better Sugar Cane", true, "Enable Better Sugar Cane Rod?\n[MUST be ENABLED for all Sugar Cane Tools and Weapons to work!]");
		// iron
		ConfigHandler.bsc_iron_tools_weapons = config.getBoolean("Iron Sugar Cane Tools and Weapons", " Better Sugar Cane", true, "Enable Iron Sugar Cane Tools and Weapons?\n[Better Sugar Cane Rod MUST be ENABLED!]");
		// gold
		ConfigHandler.bsc_gold_tools_weapons = config.getBoolean("Gold Sugar Cane Tools and Weapons", " Better Sugar Cane", true, "Enable Gold Sugar Cane Tools and Weapons?\n[Better Sugar Cane Rod MUST be ENABLED!]");
		// diamond
		ConfigHandler.bsc_diamond_tools_weapons = config.getBoolean("Diamond Sugar Cane Tools and Weapons", " Better Sugar Cane", true, "Enable Sugar Cane Tools and Weapons?\n[Better Sugar Cane Rod MUST be ENABLED!]");
		// cookie
		ConfigHandler.bsc_sugar_cookie = config.getBoolean("Sugar Cookie", " Better Sugar Cane", true, "Enable Sugar Cookie?");
		// sugar blocks
		ConfigHandler.bsc_sugar_compressed_blocks = config.getBoolean("Compressed Sugar", " Better Sugar Cane", true, "Enable Compressed Sugar?");
		// sugarcane blocks
		ConfigHandler.bsc_sugarcane_compressed_blocks = config.getBoolean("Compressed Sugar Cane", " Better Sugar Cane", true, "Enable Compressed Sugar Cane?");
		
		config.addCustomCategoryComment(" Better Nether", "Bringing back a oldie but goodie 2");
		ConfigHandler.nether_rod = config.getBoolean("Better Nether Rod", " Better Nether", true, "Enable Better Nether Rod?\n[MUST be ENABLED for all Nether Tools and Weapons to work!]");
		// iron
		ConfigHandler.nether_iron_tools_weapons = config.getBoolean("Iron Netherrack Tools and Weapons", " Better Nether", true, "Enable Iron Netherrack Tools and Weapons?\n[Better Nether Rod MUST be ENABLED!]");
		// gold
		ConfigHandler.nether_gold_tools_weapons = config.getBoolean("Gold Netherrack Tools and Weapons", " Better Nether", true, "Enable Gold Netherrack Tools and Weapons?\n[Better Nether Rod MUST be ENABLED!]");
		// diamond
		ConfigHandler.nether_diamond_tools_weapons = config.getBoolean("Diamond Netherrack Tools and Weapons", " Better Nether", true, "Enable Diamond Netherrack Tools and Weapons?\n[Better Nether Rod MUST be ENABLED!]");
		// diamond
		ConfigHandler.nether_tools_weapons = config.getBoolean("Netherrack Tools and Weapons", " Better Nether", true, "Enable Netherrack Tools and Weapons?\n[Better Nether Rod MUST be ENABLED!]");
		// sugarcane blocks
		ConfigHandler.nether_compressed_blocks = config.getBoolean("Compressed Netherrack", " Better Nether", true, "Enable Compressed Netherrack?");
		
		if (config.hasChanged())
        config.save();
	}
}
