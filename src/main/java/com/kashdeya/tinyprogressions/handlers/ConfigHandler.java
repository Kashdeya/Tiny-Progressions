package com.kashdeya.tinyprogressions.handlers;

public class ConfigHandler {
	// Watering cans
	public static boolean WateringCan = true;
	public static int WateringCanChance = 25;
	public static boolean WateringCanUpgrade = true;
	public static int WateringCanUpgradeChance = 75;
	
	//Armor
	public static boolean wither_armor = true;
	public static boolean dragon_armor = true;
	public static boolean obsidian_armor = true;
	public static boolean StoneArmor = true;
	public static boolean FlintArmor = true;
	public static boolean BoneArmor = true;
	public static boolean WoodArmor = true;
	
	// Iron Apple
	public static boolean iron_apple = true;
	
	// Redstone Apple
	public static boolean redstone_apple = true;
	
	// Lava
	public static boolean lava_ore = true;
	public static int lava_ore_frequency = 5;
	public static int lava_ore_min = 1;
	public static int lava_ore_max = 32;
	public static int lava_ore_size = 2;
	
	// Birthday Pickaxe
	public static boolean BirthdayPickaxe = true;
	
	// Flint Recipe
	public static boolean FlintRecipe = true;
	
	// Stone Dust
	public static boolean StoneDust = true;
	
	// Stone Torch
	public static boolean StoneTorch = true;
	
	// Cobblegens
	public static boolean Cobblegen = true;
	public static boolean IronCobblegen = true;
	public static boolean DiamondCobblegen = true;
	public static boolean EmeraldCobblegen = true;
	public static boolean BlazeCobblegen = true;
	
	// Growth Crystals
	public static boolean BlockGrowth = true;
	public static boolean ParticalTicks = true;
	public static int BlockGrowthTicks = 30;
	public static int GrowthParticalTicks = 750;
	public static boolean BlockGrowthUpgrade = true;
	public static int BlockGrowthUpgradeTicks = 40;
	public static int GrowthUpgradeParticalTicks = 750;
	public static boolean BlockGrowthUpgradeTwo = true;
	public static int BlockGrowthUpgradeTwoTicks = 30;
	public static int GrowthUpgradeTwoParticalTicks = 750;
	
	// Quartz Dust & Knife
	public static boolean QuartzKnife = true;
	public static int QuartzKnifeDamage = 128;
	
	// Deco Blocks
	public static boolean CharcoalBlock = true;
	public static boolean DirtyGlass = true;
	public static boolean AndesiteBrick = true;
	public static boolean DioriteBrick = true;
	public static boolean GraniteBrick = true;
	public static boolean SmoothEndStone = true;
	
	// Reinforced Blocks
	public static boolean ReinforcedGlass = true;
	public static boolean ReinforcedObsidian =  true;
	
	// Compressed Blocks
	public static boolean FleshBlock = true;
	public static boolean NetherStarBlock = true;
	
	// Notch Apple
	public static boolean NotchApple = true;
	
	// Golden Apple Progression
	public static boolean ApplePro = true;
	
	// Drops
	public static boolean BoneDrops = true;
	public static float BoneDropsChance = 1.0F;
	public static int BoneAmmount = 1;
	public static boolean SkullDrops = true;
	public static float SkullDropsChance = 1.0F;
	public static int SkullAmmount = 1;
	public static boolean stickDrops = true;
	public static float stickDropsChance = 1.0F;
	public static int stickDropsAmmount = 1;
	
	// MISC
	public static boolean AllowRightClick = true;
	public static boolean MyceliumSeeds = true;
	public static boolean DiamondApple = true;
	public static boolean EmeraldApple = true;
	public static boolean MedKit = true;
	public static int healDuration = 300;
	
	// Flint Items & More
	public static boolean FlintTools = true;
	public static boolean FlintBlock = true;
	
	// Flint Knife
	public static boolean FlintKnife = true;
	public static int FlintKnifeDamage = 128;
	
	// Bone Items & More
	public static boolean BoneTools = true;
	public static boolean BoneBlock = true;
	
	// Remove Items
	public static boolean RemoveItems = true;
	
	// Emerald
	public static boolean emerald_axe = true;
	public static boolean emerald_pickaxe = true;
	public static boolean emerald_spade = true;
	public static boolean emerald_hoe = true;
	public static boolean emerald_sword = true;
	
	// Obsidian
	public static boolean obsidian_axe = true;
	public static boolean obsidian_pickaxe = true;
	public static boolean obsidian_spade = true;
	public static boolean obsidian_hoe = true;
	public static boolean obsidian_sword = true;
	
	// Scythe
	public static boolean wooden_scythe = true;
	public static boolean stone_scythe = true;
	public static boolean golden_scythe = true;
	public static boolean iron_scythe = true;
	public static boolean emerald_scythe = true;
	public static boolean diamond_scythe = true;
	public static boolean obsidian_scythe = true;
	
	// Multi
	public static boolean wooden_multi = true;
	public static boolean stone_multi = true;
	public static boolean golden_multi = true;
	public static boolean iron_multi = true;
	public static boolean emerald_multi = true;
	public static boolean diamond_multi = true;
	public static boolean obsidian_multi = true;
	
	// Battle
	public static boolean wooden_battle = true;
	public static boolean stone_battle = true;
	public static boolean golden_battle = true;
	public static boolean iron_battle = true;
	public static boolean emerald_battle = true;
	public static boolean diamond_battle = true;
	public static boolean obsidian_battle = true;
	
	// Spear
	public static boolean wooden_spear = true;
	public static boolean stone_spear = true;
	public static boolean golden_spear = true;
	public static boolean iron_spear = true;
	public static boolean emerald_spear = true;
	public static boolean diamond_spear = true;
	public static boolean obsidian_spear = true;
	public static float spear_reach = 7.0F;
	
	// Ender Ore
	public static boolean ender_ore = true;
	public static boolean ender_mite = true;
	public static float endermite_spawn = 0.25F;
	public static int ender_ore_frequency = 5;
	public static int ender_ore_min = 1;
	public static int ender_ore_max = 32;
	public static int ender_ore_size = 7;
	
	// Pouch
	public static boolean pouch = true;
	
	public static boolean parse(String key)
	{
		Object value = false;
		
		try
		{
			value = ConfigHandler.class.getField(key).get(null);
		}
		catch(Exception e)
		{
		}
		
		try
		{
			return (boolean)value;
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
