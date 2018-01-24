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
        
		String category;
		
		category = "Tiny Progressions";
		
		config.addCustomCategoryComment(category + " Growth Crystal", "These like to grow things!");
		ConfigHandler.BlockGrowth = config.getBoolean("Growth Crystal Tier 1", category + " Growth Crystal", true, "Enable Growth Crystal Tier 1?");
		ConfigHandler.BlockGrowthTicks = config.getInt("Growth Crystal Tier 1 Speed", category + " Growth Crystal", 30, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 40 Ticks or 2 Seconds]\n[Default*40=1200 Ticks]");
		ConfigHandler.GrowthParticalTicks = config.getInt("Growth Crystal Tier 1 Particles", category + " Growth Crystal", 1000, 50, 1000, "Lower Number gives more Particles");
		ConfigHandler.BlockGrowthUpgrade = config.getBoolean("Growth Crystal Tier 2", category + " Growth Crystal", true, "Enable Growth Crystal Tier 2?\n[Requires Tier 1 to be Enabled]");
		ConfigHandler.BlockGrowthUpgradeTicks = config.getInt("Growth Crystal Tier 2 Speed", category + " Growth Crystal", 40, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 20 Ticks or 1 Second]\n[Default*20=800 Ticks]");
		ConfigHandler.GrowthUpgradeParticalTicks = config.getInt("Growth Crystal Tier 2 Particles", category + " Growth Crystal", 1000, 50, 1000, "Lower Number gives more Particles");
		ConfigHandler.BlockGrowthUpgradeTwo = config.getBoolean("Growth Crystal Tier 3", category + " Growth Crystal", true, "Enable Growth Crystal Tier 3?\n[Requires Tier 2 to be Enabled]");
		ConfigHandler.BlockGrowthUpgradeTwoTicks = config.getInt("Growth Crystal Tier 3 Speed", category + " Growth Crystal", 30, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 10 Ticks or 1/2 a Second]\n[Default*10=400 Ticks]");
		ConfigHandler.GrowthUpgradeTwoParticalTicks = config.getInt("Growth Crystal Tier 3 Particles", category + " Growth Crystal", 1000, 50, 1000, "Lower Number gives more Particles");
		ConfigHandler.ParticalTicks = config.getBoolean("Growth Crystal Particals", category + " Growth Crystal", false, "Enable Growth Crystal Particals?");
		
		config.addCustomCategoryComment(category + " Watering Cans", "Remember to water those plants!");
		ConfigHandler.WateringCan = config.getBoolean("Watering Can", category + " Watering Cans", true, "Enable Watering Can?");
		ConfigHandler.WateringCanChance = config.getInt("Watering Can Chance", category + " Watering Cans", 50, 1, 50, "Chance out of 50 that the Watering Can will tick the plant!");
		ConfigHandler.WateringCanUpgrade = config.getBoolean("Watering Can Reinforced", category + " Watering Cans", true, "Enable Reinforced Watering Can?\n[Requires Watering Can to be Enabled]");
		ConfigHandler.WateringCanUpgradeChance = config.getInt("Watering Can Reinforced Chance", category + " Watering Cans", 100, 50, 100, "Chance out of 100 that the Watering Can will tick the plant!");
		
		config.addCustomCategoryComment(category + " Cobblegen Crystals", "Everyone needs a little cobblestone!");
		ConfigHandler.Cobblegen = config.getBoolean("Cobblegen Crystal Tier 1", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 1?");
		ConfigHandler.IronCobblegen = config.getBoolean("Cobblegen Crystal Tier 2", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 2?\n[Requires Cobblegen Crystal Tier 1 to be Enabled for recipe]");
		ConfigHandler.DiamondCobblegen = config.getBoolean("Cobblegen Crystal Tier 3", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 3?\n[Requires Cobblegen Crystal Tier 2 to be Enabled for recipe]");
		ConfigHandler.BlazeCobblegen = config.getBoolean("Cobblegen Crystal Tier 4", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 4?\n[Requires Cobblegen Crystal Tier 3 to be Enabled for recipe]");
		ConfigHandler.EmeraldCobblegen = config.getBoolean("Cobblegen Crystal Tier 5", category + " Cobblegen Crystals", true, "Enable Cobblegen Crystal Tier 5?\n[Requires Cobblegen Crystal Tier 4 to be Enabled for recipe]");
		
		config.addCustomCategoryComment(category + " Tree Drops", "Extra Drops");
		ConfigHandler.stickDrops = config.getBoolean("Stick Drops", category + " Tree Drops", true, "Enable Sticks to drop from leaves?");
		ConfigHandler.stickDropsChance = config.getFloat("Stick Drop Chance", category + " Tree Drops", 0.1F, 0, 1.0F, "Sets the Chance of Sticks from leaves.");
		ConfigHandler.stickDropsAmmount = config.getInt("Stick Drop Ammount", category + " Tree Drops", 1, 1, 64, "Sets the Ammount of Sticks Dropped from leaves.");
		ConfigHandler.appleDrops = config.getBoolean("Apple Drops", category + " Tree Drops", true, "Enable Apple to drop from leaves?");
		ConfigHandler.appleDropsChance = config.getFloat("Apple Drop Chance", category + " Tree Drops", 0.1F, 0, 1.0F, "Sets the Chance of Apple from leaves.");
		ConfigHandler.appleDropsAmmount = config.getInt("Apple Drop Ammount", category + " Tree Drops", 1, 1, 64, "Sets the Ammount of Apple Dropped from leaves.");
		
		config.addCustomCategoryComment(category + " Dirt Drops", "Extra Drops");
		ConfigHandler.BoneDrops = config.getBoolean("Bone Drops", category + " Dirt Drops", true, "Enable Bones to drop from Dirt?");
		ConfigHandler.BoneDropsChance = config.getFloat("Bone Drop Chance", category + " Dirt Drops", 0.01F, 0, 1.0F, "Sets the Chance of Bones from Dirt.");
		ConfigHandler.BoneAmmount = config.getInt("Bone Drop Ammount", category + " Dirt Drops", 1, 1, 64, "Sets the Ammount of Bones Dropped from Dirt.");
		ConfigHandler.SkullDrops = config.getBoolean("Skull Drops", category + " Dirt Drops", true, "Enable Skulls to drop from Dirt?");
		ConfigHandler.SkullDropsChance = config.getFloat("Skull Drop Chance", category + " Dirt Drops", 0.01F, 0, 1.0F, "Sets the Chance of Skulls from Dirt.");
		ConfigHandler.SkullAmmount = config.getInt("Skull Drop Ammount", category + " Dirt Drops", 1, 1, 64, "Sets the Ammount of Skulls Dropped from Dirt.");
		
		config.addCustomCategoryComment(category + " Reinforced Blocks", "True or False\n[Required for Other Items in this mod.]");
		ConfigHandler.ReinforcedGlass = config.getBoolean("Reinforced Glass Block", category + " Reinforced Blocks", true, "Enable Reinforced Glass Block?");
		ConfigHandler.ReinforcedObsidian = config.getBoolean("Reinforced Obsidian Block", category + " Reinforced Blocks", true, "Enable Reinforced Obsidian Block?");
		
		config.addCustomCategoryComment(category + " Compressed Blocks", "These blocks are required for Other Items in this mod.");
		ConfigHandler.BoneBlock = config.getBoolean("Compressed Bone Block", category + " Compressed Blocks", true, "Enable Compressed Bone Block?");
		ConfigHandler.FleshBlock = config.getBoolean("Compressed Flesh Block", category + " Compressed Blocks", true, "Enable Compressed Flesh Block?");
		ConfigHandler.NetherStarBlock = config.getBoolean("Compressed Nether Star Block", category + " Compressed Blocks", true, "Enable Compressed Nether Star Block?");
		ConfigHandler.FlintBlock = config.getBoolean("Compressed Flint Block", category + " Compressed Blocks", true, "Enable Compressed Flint Block?");
		
		config.addCustomCategoryComment(category + " Ender Ore", "Might as well add this");
		ConfigHandler.ender_ore = config.getBoolean("Ender Ore", category + " Ender Ore", true, "Enable Ender Ore?");
		ConfigHandler.ender_mite = config.getBoolean("Endermite", category + " Ender Ore", true, "Enable Endermite spawn?");
		ConfigHandler.endermite_spawn = config.getFloat("Endermite Spawn", category + " Ender Ore", 0.25F, 0.0F, 1.0F, "Sets the Chance of Endermites to spawn when Ore is mined.");
		ConfigHandler.ender_ore_frequency = config.getInt("Ender Ore Frequency", category + " Ender Ore", 15, 1, 100, "Sets the Chance of Ender ore.");
		ConfigHandler.ender_ore_min = config.getInt("Ender Ore Min", category + " Ender Ore", 1, 1, 255, "Sets the min Y level.");
		ConfigHandler.ender_ore_max = config.getInt("Ender Ore Max", category + " Ender Ore", 32, 1, 255, "Sets the max Y level.");
		ConfigHandler.ender_ore_size = config.getInt("Ender Ore Size", category + " Ender Ore", 10, 5, 100, "Sets the Ender Ore Vein Size.");
		
		config.addCustomCategoryComment(category + " Lava Source Block Stones", "Lavastone!");
		ConfigHandler.lava_block = config.getBoolean("Lavastone", category + " Lava Source Block Stones", true, "Enable Lavastone?\n[Turns into a lava source block when broke]");
		ConfigHandler.lava_block_frequency = config.getInt("Lavastone Gen Chance", category + " Lava Source Block Stones", 15, 1, 100, "Sets the Chance of Lavastone.");
		ConfigHandler.lava_block_min = config.getInt("Lavastone Gen Min", category + " Lava Source Block Stones", 1, 1, 255, "Sets the min Y level.");
		ConfigHandler.lava_block_max = config.getInt("Lavastone Gen Max", category + " Lava Source Block Stones", 64, 1, 255, "Sets the max Y level.");
		ConfigHandler.lava_block_size = config.getInt("Lavastone Gen Size", category + " Lava Source Block Stones", 10, 5, 100, "Sets the Lavastone Vein Size.");
		ConfigHandler.lava_block_recipe = config.getBoolean("Lavastone Silktouch", category + " Lava Source Block Stones", true, "Enable Lava bucket recipe?\n[If picked up with Silktouch you can use to craft a lava bucket.]");
		FuelHandler.lava_block_burntime = config.getInt("Lavastone Silktouch Burn-Time", category + " Lava Source Block Stones", 20000, 0, Integer.MAX_VALUE, "If Silktouch is Enbled you can use Lavastone as a fuel source as well.");
		
		config.addCustomCategoryComment(category + " Water Source Block Stones", "Waterstone!");
		ConfigHandler.water_block = config.getBoolean("Waterstone", category + " Water Source Block Stones", true, "Enable Waterstone?\n[Turns into a water source block when broke]");
		ConfigHandler.water_block_frequency = config.getInt("Waterstone Gen Chance", category + " Water Source Block Stones", 15, 1, 100, "Sets the Chance of Waterstone.");
		ConfigHandler.water_block_min = config.getInt("Waterstone Gen Min", category + " Water Source Block Stones", 1, 1, 255, "Sets the min Y level.");
		ConfigHandler.water_block_max = config.getInt("Waterstone Gen Max", category + " Water Source Block Stones", 64, 1, 255, "Sets the max Y level.");
		ConfigHandler.water_block_size = config.getInt("Waterstone Gen Size", category + " Water Source Block Stones", 10, 5, 100, "Sets the Waterstone Vein Size.");
		ConfigHandler.water_block_recipe = config.getBoolean("Waterstone Silktouch", category + " Water Source Block Stones", true, "Enable Water bucket recipe?\n[If picked up with Silktouch you can use to craft a Water bucket.]");
		
		config.addCustomCategoryComment(category + " Dirty Glass", "Just a little dirty!");
		ConfigHandler.DirtyGlass = config.getBoolean("Dirty Glass Block", category + " Dirty Glass", true, "Enable Dirty Glass Block?\n[Required for Other Items in this mod.]");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initExtra()
	{
		
		File f = new File(configDir, "Extras.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
        
		String category;
		
		category = "Tiny Progressions";
		
		config.addCustomCategoryComment(category + " Water Infused Stone", "Makes Obsidian and Cobblestone when lava is place around it.");
		ConfigHandler.water_infused_stone = config.getBoolean("Water Infused Stone", category + " Water Infused Stone", true, "Enable Water Infused Stone?");
		
		config.addCustomCategoryComment(category + " Lava Crystal", "if Lava armor is disabled ENABLE this to craft the Fire Ring.");
		ConfigHandler.lava_crystal = config.getBoolean("Lava Crystal", category + " Lava Crystal", true, "Enable Lava Crystal Recipe?");
		
		config.addCustomCategoryComment(category + " Bricks", "Because People Love Bricks");
		ConfigHandler.AndesiteBrick = config.getBoolean("Andesite Bricks", category + " Bricks", true, "Enable Andesite Bricks?");
		ConfigHandler.DioriteBrick = config.getBoolean("Diorite Bricks", category + " Bricks", true, "Enable Diorite Bricks?");
		ConfigHandler.GraniteBrick = config.getBoolean("Granite Bricks", category + " Bricks", true, "Enable Granite Bricks?");
		
		config.addCustomCategoryComment(category + " Charcoal", "It's the little things that count right?");
		ConfigHandler.CharcoalBlock = config.getBoolean("Charcoal Block", category + " Charcoal", true, "Enable the Charcoal Block?");
		FuelHandler.CharcoalBlockBurn = config.getInt("Charcoal Block Burn Time", category + " Charcoal", 16000, 0, Integer.MAX_VALUE, "Sets the burn time for the Charcoal Block.");
		ConfigHandler.CharcoalWorldgen = config.getBoolean("Charcoal Block Nether Worldgen", category + " Charcoal", true, "Enable the Charcoal Block to spawn in the nether?");
		
		config.addCustomCategoryComment(category + " Tiny Coal & Charcoal", "tiny things. Used to make Steel Ingots");
		ConfigHandler.tiny_charcoal = config.getBoolean("Tiny Charcoal", category + " Tiny Coal & Charcoal", true, "Enable Tiny Charcoal?");
		FuelHandler.tiny_charcoal_burntime = config.getInt("Tiny Charcoal Burn Time", category + " Tiny Coal & Charcoal", 200, 0, Integer.MAX_VALUE, "Sets the burn time for Tiny Charcoal.");
		ConfigHandler.tiny_coal = config.getBoolean("Tiny Coal", category + " Tiny Coal & Charcoal", true, "Enable Tiny Coal?");
		FuelHandler.tiny_coal_burntime = config.getInt("Tiny Coal Burn Time", category + " Tiny Coal & Charcoal", 200, 0, Integer.MAX_VALUE, "Sets the burn time for Tiny Coal.");
		
		config.addCustomCategoryComment(category + " Steel", "Used to make Rings and Deco Block.");
		ConfigHandler.steel_ingot = config.getBoolean("Steel Ingots", category + " Steel", true, "Enable Steel Ingots?");
		
		config.addCustomCategoryComment(category + " Rib", "If Wither armor is disabled ENABLE this to craft the Wither Ring.");
		ConfigHandler.wither_rib = config.getBoolean("Wither Rib", category + " Rib", false, "Enable Wither Rib?");
		
		config.addCustomCategoryComment(category + " Rings", "Needs Steel, Tiny Coal, Tiny Charcoal, Wither Rib, MedKit and Lava Crystals Enabled!");
		ConfigHandler.wither_ring = config.getBoolean("Wither Ring", category + " Rings", true, "Enable Wither Ring?");
		ConfigHandler.fire_ring = config.getBoolean("Fire Ring", category + " Rings", true, "Enable Fire Ring?");
		ConfigHandler.posion_ring = config.getBoolean("Posion Ring", category + " Rings", true, "Enable Posion Ring?");
		ConfigHandler.nausea_ring = config.getBoolean("Nausea Ring", category + " Rings", true, "Enable Nausea Ring?");
		ConfigHandler.master_ring = config.getBoolean("Master Ring", category + " Rings", true, "Enable Master Ring?\n[All other rings need to be enabled to craft this one.]");
		
		config.addCustomCategoryComment(category + " Seeds", "Things to plant?");
		ConfigHandler.MyceliumSeeds = config.getBoolean("Mycelium Seeds", category + " Seeds", true, "Enable Mycelium Seeds?");
		
		config.addCustomCategoryComment(category + " Medical Kit", "Need a little healing?");
		ConfigHandler.MedKit = config.getBoolean("Medkit", category + " Medical Kit", true, "Enable Medkit?");
		ConfigHandler.healDuration = config.getInt("Medkit Heal Duration", category + " Medical Kit", 30, 1, Integer.MAX_VALUE, "How many ticks. (1 = 1 Tick)");
		ConfigHandler.healLevel = config.getInt("Medkit Heal Level", category + " Medical Kit", 2, 0, 2, "Sets the level of Regen!");
		ConfigHandler.healStack = config.getInt("Medkit Heal Stacksize", category + " Medical Kit", 32, 1, 64, "Sets the Stacksize of the Medkit!");
		ConfigHandler.healinstant = config.getBoolean("Medkit Instant heal", category + " Medical Kit", false, "Enable Medkit Instant Heal?");
		
		config.addCustomCategoryComment(category + " Torch", "I'll light the way!");
		ConfigHandler.StoneTorch = config.getBoolean("Stone Torch", category + " Torch", true, "Enable Stone Torch?\n[Do not ENABLE if Tinkers is installed.]");
		
		config.addCustomCategoryComment(category + " Flint", "A little extra flint can help, right?");
		ConfigHandler.FlintRecipe = config.getBoolean("Flint Recipe", category + " Flint", true, "Enable 3 Gravel into Flint Recipe?\n[Do not ENABLE is Tinkers is installed.]");
		
		config.addCustomCategoryComment(category + " Harder Stone", "It's the little things that count right?");
		ConfigHandler.hardened_stone = config.getBoolean("Hardened Stone", category + " Harder Stone", true, "Enable Hardened Stone?");
		
		config.addCustomCategoryComment(category + " Sugar", "even the dead stuff can help!");
		ConfigHandler.old_reed = config.getBoolean("Dead Sugar Cane", category + " Sugar", true, "Enable Dead Sugar Cane?");
		
		config.addCustomCategoryComment(category + " Pouch", "More storage anyone?");
		ConfigHandler.pouch = config.getBoolean("Pouch", category + " Pouch", true, "Enable Pouch?");
		
		config.addCustomCategoryComment(category + " bamInati T-Shirt", "Cause it looks freaking AWESOME");
		ArmorHandler.bam_tshirt = config.getBoolean("bamInati T-Shirt", category + " bamInati T-Shirt", true, "Enable bamInati T-Shirt?");
		
		config.addCustomCategoryComment(category + " Floaty Block", "May save you from certain death!");
		ConfigHandler.angel_block = config.getBoolean("Floaty McFloaty Block", category + " Floaty Block", true, "Enable Floaty McFloaty Block?");
		
		config.addCustomCategoryComment(category + " Moist", "Change when the first rains on a world are due.");
		ConfigHandler.custom_moist_timer = config.getBoolean("Enable Custom Moist Timer", category + " Moist", false, "Enable the ability to change how long it takes for the first rain of a world.");
		ConfigHandler.moist_time = config.getFloat("Moist Timer", category + " Moist", 1, 0, Float.MAX_VALUE, "How long (in days) until the first rainfall");
		
		config.addCustomCategoryComment(category + " Withered Bedrock", "Sink Into Madness Block");
		ConfigHandler.WitheredBlock = config.getBoolean("Withered Bedrock", category + " Withered Bedrock", false, "Enable Withered Bedrock?\n[This item is not a Craftable Block.]\n[To be used with Bedrock Replacer Mod]\n[MAY CAUSE SERVER LAG NEEDS MORE TESTING]");
		ConfigHandler.WitheredBlockParticals = config.getBoolean("Withered Particals", category + " Withered Bedrock", false, "Enable Player Withered Particals?");
		ConfigHandler.WitheredBlockTime = config.getInt("Withered Time", category + " Withered Bedrock", 3, 1, Integer.MAX_VALUE, "Sets the Time a player is Withered from standing on Withered Bedrock.\n[1 = 20Ticks]");
		
		config.addCustomCategoryComment(category + " Repair Tablet", "Need some extra durability, eh?");
		ConfigHandler.repair_tablet = config.getBoolean("Repair Tablet", category + " Repair Tablet", true, "Enable Repair Tablet?\n[Repairs in Players Inventory only.]");
		ConfigHandler.repair_tablet_cooldown = config.getInt("Repair Tablet Cooldown", category + " Repair Tablet", 20, 1, Integer.MAX_VALUE, "Cooldown (in ticks) between repair processes.");
		
		config.addCustomCategoryComment(category + " Quartz", "Added for Sky Factory 3 - If you enable please make a recipe for it, Other wise it does nothing.");
		ConfigHandler.QuartzKnife = config.getBoolean("Quartz Knife", category + " Quartz", false, "Enable the Quartz Knife and Dust Recipe?");
		ConfigHandler.QuartzKnifeDamage = config.getInt("Quartz Knife Durability", category + " Quartz", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		
		config.addCustomCategoryComment(category + " CUS", "Added for Can_U_Survive - If you enable please make a recipe for them, Other wise they do nothing.");
		ConfigHandler.FlintKnife = config.getBoolean("Flint Knife", category + " CUS", false, "Enable Flint Knife?");
		ConfigHandler.FlintKnifeDamage = config.getInt("Flint Knife Durability", category + " CUS", 100, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.StoneDust = config.getBoolean("Stone Dust", category + " CUS", false, "Enable Stone Dust?");
		
		config.addCustomCategoryComment(category + " Vasholine", "WUB WUB WUB!");
		ConfigHandler.vasholine = config.getBoolean("Vasholine Juice", category + " Vasholine", true, "Enable Vasholine?");
		ConfigHandler.vasholine_mobs = config.getBoolean("Vasholine Juice Hurts Mobs", category + " Vasholine", true, "Enable mobs getting hurt?");	
		ConfigHandler.vasholine_mobs_amount = config.getFloat("Vasholine Juice Hurts Mobs Amount", category + " Vasholine", 1.0F, 0.0F, 1.0F, "Sets the amount mobs get hurt.");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initArmor()
	{
		
		File f = new File(configDir, "Armor.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
        
		String category;
		
		category = "Tiny Progressions";
		
		config.addCustomCategoryComment(category + " Armor", "Why not");
		ArmorHandler.StoneArmor = config.getBoolean("Stone Armor", category + " Armor", true, "Enable Stone Armor?");
		ArmorHandler.FlintArmor = config.getBoolean("Flint Armor", category + " Armor", true, "Enable Flint Armor?");
		ArmorHandler.BoneArmor = config.getBoolean("Bone Armor", category + " Armor", true, "Enable Bone Armor?");
		ArmorHandler.WoodArmor = config.getBoolean("Wooden Armor", category + " Armor", true, "Enable Wooden Armor?");
		ArmorHandler.emerald_amor = config.getBoolean("Emerald Armor", category + " Armor", true, "Enable Emerald Armor?");
		ArmorHandler.chain_armor = config.getBoolean("Chain Armor", category + " Armor", true, "Enable Chain Armor Recipe?");
		
		config.addCustomCategoryComment(category + " Lava Armor", "What Armor?");
		ArmorHandler.lava_armor = config.getBoolean("Lava Armor", category + " Lava Armor", true, "Enable Lava Armor?");
		ArmorHandler.lava_armor_resistance = config.getBoolean("Lava Armor Resistance", category + " Lava Armor", true, "Enable Lava Armor Resistance?");
		ArmorHandler.lava_armor_resistance_lvl = config.getInt("Lava Armor Resistance Level", category + " Lava Armor", 0, 0, 10, "Resistance Level.");
		ArmorHandler.lava_armor_fire = config.getBoolean("Lava Armor Fire Resistance", category + " Lava Armor", true, "Enable Lava Armor Fire Resistance?");
		ArmorHandler.lava_armor_fire_lvl = config.getInt("Lava Armor Fire Resistance Level", category + " Lava Armor", 0, 0, 10, "Fire Resistance Level.");
		
		config.addCustomCategoryComment(category + " Dragon Armor", "End Game Armor");
		ArmorHandler.dragon_armor = config.getBoolean("Dragon Armor", category + " Dragon Armor", true, "Enable Dragon Armor?");
		ArmorHandler.dragon_fly = config.getBoolean("Dragon Armor Allow Flight", category + " Dragon Armor", true, "Enable Dragon Armor Flight?");
		ArmorHandler.dragon_resistance = config.getBoolean("Dragon Armor Resistance", category + " Dragon Armor", true, "Enable Dragon Armor Resistance?");
		ArmorHandler.dragon_resistance_lvl = config.getInt("Dragon Armor Resistance Level", category + " Dragon Armor", 1, 0, 10, "Resistance Level.");
		ArmorHandler.dragon_fire = config.getBoolean("Dragon Armor Fire Resistance", category + " Dragon Armor", true, "Enable Dragon Armor Fire Resistance?");
		ArmorHandler.dragon_fire_lvl = config.getInt("Dragon Armor Fire Resistance Level", category + " Dragon Armor", 1, 0, 10, "Fire Resistance Level.");
		ArmorHandler.dragon_strength = config.getBoolean("Dragon Armor Strength", category + " Dragon Armor", true, "Enable Dragon Armor Strength?");
		ArmorHandler.dragon_strength_lvl = config.getInt("Dragon Armor Strength Level", category + " Dragon Armor", 1, 0, 10, "Strength Level.");
		
		config.addCustomCategoryComment(category + " Wither Armor", "Mid Game Armor");
		ArmorHandler.wither_armor = config.getBoolean("Wither Armor", category + " Wither Armor", true, "Enable Wither Armor?");
		ArmorHandler.wither_resistance = config.getBoolean("Wither Armor Resistance", category + " Wither Armor", true, "Enable Wither Armor Resistance?");
		ArmorHandler.wither_resistance_lvl = config.getInt("Wither Armor Resistance Level", category + " Wither Armor", 0, 0, 10, "Resistance Level.");
		ArmorHandler.wither_fire = config.getBoolean("Wither Armor Fire Resistance", category + " Wither Armor", true, "Enable Wither Armor Fire Resistance?");
		ArmorHandler.wither_fire_lvl = config.getInt("Wither Armor Fire Resistance Level", category + " Wither Armor", 0, 0, 10, "Fire Resistance Level.");
		ArmorHandler.wither_strength = config.getBoolean("Wither Armor Strength", category + " Wither Armor", true, "Enable Wither Armor Strength?");
		ArmorHandler.wither_strength_lvl = config.getInt("Wither Armor Strength Level", category + " Wither Armor", 0, 0, 10, "Strength Level.");
		
		config.addCustomCategoryComment(category + " Lapis Armor", "Lets go under the water");
		ArmorHandler.lapis_armor = config.getBoolean("Lapis Armor", category + " Lapis Armor", true, "Enable Wither Armor?");
		ArmorHandler.lapis_armor_water = config.getBoolean("Lapis Armor Water Breathing", category + " Lapis Armor", true, "Enable Wither Water Breathing?");
		ArmorHandler.lapis_armor_water_lvl = config.getInt("Lapis Armor Water Breathing Level", category + " Lapis Armor", 0, 0, 10, "Water Breathing Level.");
		
		config.addCustomCategoryComment(category + " Obsidian Armor", "What?");
		ArmorHandler.obsidian_armor = config.getBoolean("Obsidian Armor", category + " Obsidian Armor", true, "Enable Obsidian Armor?");
		ArmorHandler.obsidian_armor_resistance = config.getBoolean("Obsidian Armor Resistance", category + " Obsidian Armor", true, "Enable Obsidian Resistance?");
		ArmorHandler.obsidian_armor_resistance_lvl = config.getInt("Obsidian Armor Resistance Level", category + " Obsidian Armor", 0, 0, 10, "Resistance Level.");
		
		config.addCustomCategoryComment(category + " Quartz Armor", "You went where?");
		ArmorHandler.quartz_armor = config.getBoolean("Quartz Armor", category + " Quartz Armor", true, "Enable Quartz Armor?");
		ArmorHandler.quartz_armor_strength = config.getBoolean("Quartz Armor Strength", category + " Quartz Armor", true, "Enable Quartz Strength?");
		ArmorHandler.quartz_armor_strength_lvl = config.getInt("Quartz Armor Strength Level", category + " Quartz Armor", 0, 0, 10, "Strength Level.");
		
		config.addCustomCategoryComment(category + " Redstone Armor", "How fast you want to go?");
		ArmorHandler.redstone_armor = config.getBoolean("Redstone Armor", category + " Redstone Armor", true, "Enable Redstone Armor?");
		ArmorHandler.redstone_armor_speed = config.getBoolean("Redstone Armor Speed", category + " Redstone Armor", true, "Enable Redstone Speed?");
		ArmorHandler.redstone_armor_speed_lvl = config.getInt("Redstone Armor Speed Level", category + " Redstone Armor", 0, 0, 10, "Speed Level.");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initToolsWeapons()
	{
		
		File f = new File(configDir, "Tools & Weapons.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
        
		String category;
		
		category = "Tiny Progressions";
		
		config.addCustomCategoryComment(category + " Happy Birthday Darkosto", "Fun Stuff");
		ConfigHandler.BirthdayPickaxe = config.getBoolean("Party Pickaxe", category + " Happy Birthday Darkosto", true, "Enable Party Pickaxe?");
		
		config.addCustomCategoryComment(category + " 5-Head Kappa Pick", "Fun Stuff");
		ConfigHandler.kappa_pick = config.getBoolean("Kappa Pick", category + " 5-Head Kappa Pick", true, "Enable Kappa Pick?");
		ConfigHandler.kappa_level = config.getInt("Kappa Pick Mining Level", category + " 5-Head Kappa Pick", 1, 0, 3, "Mining Level.");
		ConfigHandler.kappa_damage = config.getInt("Kappa Pick Mining Level Durability", category + " 5-Head Kappa Pick", 31513, 100, Integer.MAX_VALUE, "Durability Level.");
		
		config.addCustomCategoryComment(category + " Sea Axe", "A Funny Thing");
		ConfigHandler.c_axe = config.getBoolean("Sea Axe", category + " Sea Axe", true, "Enable Sea Axe?");
		ConfigHandler.sea_axe = config.getBoolean("Sea Axe - Axe", category + " Sea Axe", true, "Enable Sea Axe as a Axe?\n[Axe has 11 attack damage!]\n[Only ENABLE if Sea Axe - Pickaxe is DISABLED!]\n[Sea Axe must be ENABLED for this config to work!]");
		ConfigHandler.sea_pickaxe = config.getBoolean("Sea Axe - Pickaxe", category + " Sea Axe", false, "Enable Sea Axe as a Pickaxe?\n[Pickaxe has 10 attack damage!]\n[Only ENABLE if Sea Axe - Axe is DISABLED!]\n[Sea Axe must be ENABLED for this config to work!]");
		
		config.addCustomCategoryComment(category + " Flint and Bone Tools & Weapons", "Cause Progression!");
		ConfigHandler.BoneTools = config.getBoolean("Bone Tools & Weapons", category + " Flint and Bone Tools & Weapons", true, "Enable Bone Tools & Weapons?");
		ConfigHandler.FlintTools = config.getBoolean("Flint  Tools & Weapons", category + " Flint and Bone Tools & Weapons", true, "Enable Flint Tools & Weapons?");
		ConfigHandler.RemoveItems = config.getBoolean("Remove Wooden Tools & Weapons", category + " Flint and Bone Tools & Weapons", false, "Remove Wooden Tools & Weapons?");
		
		config.addCustomCategoryComment(category + " Scythes", "Because I love to farm and stuff");
		ConfigHandler.wooden_scythe = config.getBoolean("Wooden Scythe", category + " Scythes", false, "Enable Wooden Scythe?");
		ConfigHandler.stone_scythe = config.getBoolean("Stone Scythe", category + " Scythes", false, "Enable Stone Scythe?");
		ConfigHandler.golden_scythe = config.getBoolean("Golden Scythe", category + " Scythes", false, "Enable Golden Scythe?");
		ConfigHandler.iron_scythe = config.getBoolean("Iron Scythe", category + " Scythes", false, "Enable Iron Scythe?");
		ConfigHandler.diamond_scythe = config.getBoolean("Diamond Scythe", category + " Scythes", false, "Enable Diamond Scythe?");
		ConfigHandler.emerald_scythe = config.getBoolean("Emerald Scythe", category + " Scythes", false, "Enable Emerald Scythe?");
		ConfigHandler.obsidian_scythe = config.getBoolean("Obsidian Scythe", category + " Scythes", false, "Enable Obsidian Scythe?");
		
		config.addCustomCategoryComment(category + " MultiTools", "Because I love weird stuff\n[Requires Other Items in this mod.]");
		ConfigHandler.wooden_multi = config.getBoolean("Wooden Paxel", category + " MultiTools", true, "Enable Wooden MultiTool?");
		ConfigHandler.stone_multi = config.getBoolean("Stone Paxel", category + " MultiTools", true, "Enable Stone MultiTool?");
		ConfigHandler.golden_multi = config.getBoolean("Golden Paxel", category + " MultiTools", true, "Enable Golden MultiTool?");
		ConfigHandler.iron_multi = config.getBoolean("Iron Paxel", category + " MultiTools", true, "Enable Iron MultiTool?");
		ConfigHandler.diamond_multi = config.getBoolean("Diamond Paxel", category + " MultiTools", true, "Enable Diamond MultiTool?");
		ConfigHandler.emerald_multi = config.getBoolean("Emerald Paxel", category + " MultiTools", true, "Enable Emerald MultiTool?");
		ConfigHandler.obsidian_multi = config.getBoolean("Obsidian Paxel", category + " MultiTools", true, "Enable Obsidian MultiTool?");
		
		config.addCustomCategoryComment(category + " Spears", "Because I love weird stuff");
		ConfigHandler.spear_reach = config.getInt("A Spears Extended Reach", category + " Spears", 7, 5, 10, "Sets the Reach of a Spear.\n[Vanilla is 5 blocks!]");
		ConfigHandler.wooden_spear = config.getBoolean("Wooden Spear", category + " Spears", true, "Enable Wooden Spear?");
		ConfigHandler.stone_spear = config.getBoolean("Stone Spear", category + " Spears", true, "Enable Stone Spear?");
		ConfigHandler.golden_spear = config.getBoolean("Golden Spear", category + " Spears", true, "Enable Golden Spear?");
		ConfigHandler.iron_spear = config.getBoolean("Iron Spear", category + " Spears", true, "Enable Iron Spear?");
		ConfigHandler.diamond_spear = config.getBoolean("Diamond Spear", category + " Spears", true, "Enable Diamond Spear?");
		ConfigHandler.emerald_spear = config.getBoolean("Emerald Spear", category + " Spears", true, "Enable Emerald Spear?");
		ConfigHandler.obsidian_spear = config.getBoolean("Obsidian Spear", category + " Spears", true, "Enable Obsidian Spear?");
		
		config.addCustomCategoryComment(category + " BattleAxes", "Because I love weird stuff");
		ConfigHandler.wooden_battle = config.getBoolean("Wooden BattleAxe", category + " BattleAxes", true, "Enable Wooden BattleAxe?");
		ConfigHandler.stone_battle = config.getBoolean("Stone BattleAxe", category + " BattleAxes", true, "Enable Stone BattleAxe?");
		ConfigHandler.golden_battle = config.getBoolean("Golden BattleAxe", category + " BattleAxes", true, "Enable Golden BattleAxe?");
		ConfigHandler.iron_battle = config.getBoolean("Iron BattleAxe", category + " BattleAxes", true, "Enable Iron BattleAxe?");
		ConfigHandler.diamond_battle = config.getBoolean("Diamond BattleAxe", category + " BattleAxes", true, "Enable Diamond BattleAxe?");
		ConfigHandler.emerald_battle = config.getBoolean("Emerald BattleAxe", category + " BattleAxes", true, "Enable Emerald BattleAxe?");
		ConfigHandler.obsidian_battle = config.getBoolean("Obsidian BattleAxe", category + " BattleAxes", true, "Enable Obsidian BattleAxe?");
		
		config.addCustomCategoryComment(category + " Obsidian", "Because I love weird stuff\n[Required for Other Items in this mod.]");
		ConfigHandler.obsidian_axe = config.getBoolean("Obsidian Axe", category + " Obsidian", true, "Enable Obsidian Axe?");
		ConfigHandler.obsidian_pickaxe = config.getBoolean("Obsidian Pickaxe", category + " Obsidian", true, "Enable Obsidian Pickaxe?");
		ConfigHandler.obsidian_hoe = config.getBoolean("Obsidian Hoe", category + " Obsidian", true, "Enable Obsidian Hoe?");
		ConfigHandler.obsidian_spade = config.getBoolean("Obsidian Shovel", category + " Obsidian", true, "Enable Obsidian Shovel?");
		ConfigHandler.obsidian_sword = config.getBoolean("Obsidian Sword", category + " Obsidian", true, "Enable Obsidian Sword?");
		
		config.addCustomCategoryComment(category + " Emerald", "Because I love weird stuff\n[Required for Other Items in this mod.]");
		ConfigHandler.emerald_axe = config.getBoolean("Emerald Axe", category + " Emerald", true, "Enable Emerald Axe?");
		ConfigHandler.emerald_pickaxe = config.getBoolean("Emerald Pickaxe", category + " Emerald", true, "Enable Emerald Pickaxe?");
		ConfigHandler.emerald_hoe = config.getBoolean("Emerald Hoe", category + " Emerald", true, "Enable Emerald Hoe?");
		ConfigHandler.emerald_spade = config.getBoolean("Emerald Shovel", category + " Emerald", true, "Enable Emerald Shovel?");
		ConfigHandler.emerald_sword = config.getBoolean("Emerald Sword", category + " Emerald", true, "Enable Emerald Sword?");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initFood()
	{
		
		File f = new File(configDir, "Food & Drinks.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
        
		String category;
		
		category = "Tiny Progressions";
		
		config.addCustomCategoryComment(category + " Apples", "Just Because");
		ConfigHandler.EmeraldApple = config.getBoolean("Emerald Apple", category + " Apples", true, "Enable Emerald Apple?");
		ConfigHandler.NotchApple = config.getBoolean("Notch Apple", category + " Apples", true, "Bring back the Notch Apple Recipe?\n[Only Enable if you have Golden Apple Progression DISABLED.]");
		ConfigHandler.DiamondApple = config.getBoolean("Diamond Apple", category + " Apples", true, "Enable Diamond Apple?");
		ConfigHandler.iron_apple = config.getBoolean("Iron Apple", category + " Apples", true, "Enable Iron Apple?");
		ConfigHandler.redstone_apple = config.getBoolean("Redstone Apple", category + " Apples", true, "Enable Redstone Apple?");
		ConfigHandler.ApplePro = config.getBoolean("Golden Apple Progression", category + " Apples", false, "Enable Golden Apple Progression?\n[Only Enable if you have Notch Apple DISABLED.]");
		
		config.addCustomCategoryComment(category + " Juices", "Everyone loves juice!\n[Only ENABLE one or the other.]");
		ConfigHandler.all_juices = config.getBoolean("Vanilla Juices W/O Bottles", category + " Juices", true, "Enable Juices With out bottles in the recipe?");
		ConfigHandler.JuiceBottles = config.getBoolean("Vanilla Juices With Bottles", category + " Juices", false, "Enable Juices With bottles in the recipe?");
		
		config.addCustomCategoryComment(category + " Juices Stats", "Everyone loves juice Stats!");
		ConfigHandler.AppleAmount = config.getInt("Apple Juice Heal Amount", category + " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.AppleSaturation = config.getFloat("Apple Juice Saturation Amount", category + " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.CarrotAmount = config.getInt("Carrot Juice Heal Amount", category + " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.CarrotSaturation = config.getFloat("Carrot Juice Saturation Amount", category + " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.PotatoAmount = config.getInt("Potato Juice Heal Amount", category + " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.PotatoSaturation = config.getFloat("Potato Juice Saturation Amount", category + " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.BeetAmount = config.getInt("Beet Juice Heal Amount", category + " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.BeetSaturation = config.getFloat("Beet Juice Saturation Amount", category + " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.CactusAmount = config.getInt("Cactus Juice Heal Amount", category + " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.CactusSaturation = config.getFloat("Cactus Juice Saturation Amount", category + " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.SlimeAmount = config.getInt("Slime Juice Heal Amount", category + " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.SlimeSaturation = config.getFloat("Slime Juice Saturation Amount", category + " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.WheatAmount = config.getInt("Wheat Juice Heal Amount", category + " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.WheatSaturation = config.getFloat("Wheat Juice Saturation Amount", category + " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.MelonAmount = config.getInt("Melon Juice Heal Amount", category + " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.MelonSaturation = config.getFloat("Melon Juice Saturation Amount", category + " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.PumpkinAmount = config.getInt("Pumpkin Juice Heal Amount", category + " Juices Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.PumpkinSaturation = config.getFloat("Pumpkin Juice Saturation Amount", category + " Juices Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		
		config.addCustomCategoryComment(category + " Juices Extra", "Everyone loves juice!\n[Only ENABLE one or the other.]");
		ConfigHandler.ExtraPlantGen = config.getBoolean("Extra Plant Generation", category + " Juices Extra", true, "Enable Extra Plant Generation?\n[Disable Extra Plant Generation if you want to use Naturas Berries only!]");
		ConfigHandler.ExtraJuices = config.getBoolean("Extra Juices W/O Bottles", category + " Juices Extra", true, "Enable Juices With out bottles in the recipe?");
		ConfigHandler.ExtraJuicesBottles = config.getBoolean("Extra Juices With Bottles", category + " Juices Extra", false, "Enable Juices With bottles in the recipe?");
		
		config.addCustomCategoryComment(category + " Juices Extra Stats", "Everyone loves juice Stats!");
		ConfigHandler.BlueberryAmount = config.getInt("Blueberry Juice Heal Amount", category + " Juices Extra Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.BlueberrySaturation = config.getFloat("Blueberry Juice Saturation Amount", category + " Juices Extra Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.BlackberryAmount = config.getInt("Blackberry Juice Heal Amount", category + " Juices Extra Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.BlackberrySaturation = config.getFloat("Blackberry Juice Saturation Amount", category + " Juices Extra Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.MaloberryAmount = config.getInt("Maloberry Juice Heal Amount", category + " Juices Extra Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.MaloberrySaturation = config.getFloat("Maloberry Juice Saturation Amount", category + " Juices Extra Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.RaspberryAmount = config.getInt("Raspberry Juice Heal Amount", category + " Juices Extra Stats", 3, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.RaspberrySaturation = config.getFloat("Raspberry Juice Saturation Amount", category + " Juices Extra Stats", 0.8F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		
		config.addCustomCategoryComment(category + " Extra Food", "Want more food?");
		ConfigHandler.bams_pizza = config.getBoolean("Bams Pizza", category + " Extra Food", true, "Enable Bams Pizza?");
		ConfigHandler.CookedBacon = config.getBoolean("Cooked Bacon", category + " Extra Food", true, "Enable Cooked Bacon?");
		ConfigHandler.MonsterJerky = config.getBoolean("Monster Jerky", category + " Extra Food", true, "Enable Monster jerky?");
		ConfigHandler.ToastedBread = config.getBoolean("Toasted Bread", category + " Extra Food", true, "Enable Toasted Bread?");
		ConfigHandler.FriedEgg = config.getBoolean("Fried Egg", category + " Extra Food", true, "Enable Fried Egg?");
		ConfigHandler.CookedMushrooms = config.getBoolean("Cooked Mushrooms", category + " Extra Food", true, "Enable Cooked Mushrooms?");
		ConfigHandler.BaconEggs = config.getBoolean("Bacon & Eggs", category + " Extra Food", true, "Enable Bacon & Eggs?");
		ConfigHandler.LittleCandy = config.getBoolean("Little Candy", category + " Extra Food", true, "Enable Little Candy?");
		ConfigHandler.Sandwiches = config.getBoolean("Sandwiches", category + " Extra Food", true, "Enable Sandwiches?");
		ConfigHandler.CookedApple = config.getBoolean("Cooked Apple", category + " Extra Food", true, "Enable Cooked Apple?");
		
		config.addCustomCategoryComment(category + " Extra Food Stats", "Want more food Stats?\n[WIP Section]");
		ConfigHandler.bams_pizza_amount = config.getInt("Bams Pizza Heal Amount", category + " Extra Food Stats", 10, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.bams_pizza_sat = config.getFloat("Bams Pizza Saturation Amount", category + " Extra Food Stats", 1.0F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		ConfigHandler.ToastedAmount = config.getInt("Toasted Bread Heal Amount", category + " Extra Food Stats", 4, 1, 20, "Sets the Heal Amount.");
		ConfigHandler.ToastedSaturation = config.getFloat("Toasted Bread Saturation Amount", category + " Extra Food Stats", 1.0F, 0.0F, 1.0F, "Sets the Saturation Amount.");
		
		config.addCustomCategoryComment(category + " Food Eat Duration", "How long it takes to eat food.");
		ConfigHandler.eat_timer = config.getInt("Eat Duration", category + " Food Eat Duration", 64, 16, Integer.MAX_VALUE, "Sets how long it takes to eat TP food.");
		
		if (config.hasChanged())
        config.save();
	}
	
	public static void initReborn()
	{
		
		File f = new File(configDir, "Reborn.cfg");
        config = new Configuration(f, configVersion);
        
        config.load();
        
		String category;
		
		category = "Tiny Progressions";
		
		config.addCustomCategoryComment(category + " Better Sugar Cane", "Bringing back a oldie but goodie");
		ConfigHandler.bsc_rod = config.getBoolean("Better Sugar Cane Rod", category + " Better Sugar Cane", true, "Enable Better Sugar Cane Rod?\n[MUST be ENABLED for all Sugar Cane Tools and Weapons to work!]");
		// iron
		ConfigHandler.bsc_iron_tools_weapons = config.getBoolean("Iron Sugar Cane Tools and Weapons", category + " Better Sugar Cane", true, "Enable Iron Sugar Cane Tools and Weapons?\n[Better Sugar Cane Rod MUST be ENABLED!]");
		// gold
		ConfigHandler.bsc_gold_tools_weapons = config.getBoolean("Gold Sugar Cane Tools and Weapons", category + " Better Sugar Cane", true, "Enable Gold Sugar Cane Tools and Weapons?\n[Better Sugar Cane Rod MUST be ENABLED!]");
		// diamond
		ConfigHandler.bsc_diamond_tools_weapons = config.getBoolean("Diamond Sugar Cane Tools and Weapons", category + " Better Sugar Cane", true, "Enable Sugar Cane Tools and Weapons?\n[Better Sugar Cane Rod MUST be ENABLED!]");
		// cookie
		ConfigHandler.bsc_sugar_cookie = config.getBoolean("Sugar Cookie", category + " Better Sugar Cane", true, "Enable Sugar Cookie?");
		// sugar blocks
		ConfigHandler.bsc_sugar_compressed_blocks = config.getBoolean("Compressed Sugar", category + " Better Sugar Cane", true, "Enable Compressed Sugar?");
		// sugarcane blocks
		ConfigHandler.bsc_sugarcane_compressed_blocks = config.getBoolean("Compressed Sugar Cane", category + " Better Sugar Cane", true, "Enable Compressed Sugar Cane?");
		
		config.addCustomCategoryComment(category + " Better Nether", "Bringing back a oldie but goodie 2");
		ConfigHandler.nether_rod = config.getBoolean("Better Nether Rod", category + " Better Nether", true, "Enable Better Nether Rod?\n[MUST be ENABLED for all Nether Tools and Weapons to work!]");
		// iron
		ConfigHandler.nether_iron_tools_weapons = config.getBoolean("Iron Netherrack Tools and Weapons", category + " Better Nether", true, "Enable Iron Netherrack Tools and Weapons?\n[Better Nether Rod MUST be ENABLED!]");
		// gold
		ConfigHandler.nether_gold_tools_weapons = config.getBoolean("Gold Netherrack Tools and Weapons", category + " Better Nether", true, "Enable Gold Netherrack Tools and Weapons?\n[Better Nether Rod MUST be ENABLED!]");
		// diamond
		ConfigHandler.nether_diamond_tools_weapons = config.getBoolean("Diamond Netherrack Tools and Weapons", category + " Better Nether", true, "Enable Diamond Netherrack Tools and Weapons?\n[Better Nether Rod MUST be ENABLED!]");
		// diamond
		ConfigHandler.nether_tools_weapons = config.getBoolean("Netherrack Tools and Weapons", category + " Better Nether", true, "Enable Netherrack Tools and Weapons?\n[Better Nether Rod MUST be ENABLED!]");
		// sugarcane blocks
		ConfigHandler.nether_compressed_blocks = config.getBoolean("Compressed Netherrack", category + " Better Nether", true, "Enable Compressed Netherrack?");
		
		if (config.hasChanged())
        config.save();
	}
}
