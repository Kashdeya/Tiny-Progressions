package com.kashdeya.tinyprogressions.config;

import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.FuelHandler;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.common.ForgeConfigSpec.DoubleValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig.Loading;
import net.minecraftforge.fml.config.ModConfig.ModConfigEvent;
import net.minecraftforge.fml.config.ModConfig.Type;

@SuppressWarnings({ "unused" })
public class TinyConfig {

	public static final ForgeConfigSpec commonSpec;
	public static final ForgeConfigSpec clientSpec;

	public static final ConfigCommon COMMON;
	public static final ConfigClient CLIENT;

	static {
		final Pair<ConfigClient, ForgeConfigSpec> clientSpecPair = new ForgeConfigSpec.Builder()
				.configure(ConfigClient::new);
		clientSpec = clientSpecPair.getRight();
		CLIENT = clientSpecPair.getLeft();

		final Pair<ConfigCommon, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder()
				.configure(ConfigCommon::new);
		commonSpec = commonSpecPair.getRight();
		COMMON = commonSpecPair.getLeft();

	}

	public static class ConfigCommon {

		private final IntValue BlockGrowthTicks, GrowthParticalTicks, BlockGrowthUpgradeTicks, GrowthUpgradeParticalTicks,
				BlockGrowthUpgradeTwoTicks, GrowthUpgradeTwoParticalTicks;
		private final BooleanValue ParticalTicks;
		private final IntValue WateringCanChance, WateringCanUpgradeChance;
		private final IntValue CharcoalBlockBurn, FlintKnifeDamage, QuartzKnifeDamage;
		private final DoubleValue vasholine_heal_amount, vasholine_mobs_amount, mob_heal_amount;
		private final BooleanValue vasholine_mobs, wub_heal_mobs, wub_weakness, wub_blindness, wub_fatigue;
		private final IntValue smallBandageHealStack, smallBandageRegen, largeBandageStack, largeBandageDuration,
				largeBandageBoostTime, smallMedHealStack, smallMedDuration, smallMedBoostTime, LargeMedHealStack,
				LargeMedDuration, largeMedBoostTime, kappa_level, kappa_damage, bams_pizza_amount;
		private final DoubleValue bams_pizza_sat;
		private final BooleanValue sea_axe, sea_pickaxe;
		private final IntValue lava_block_frequency, lava_block_min, lava_block_max, lava_block_size;
		private final IntValue nether_lava_block_frequency, nether_lava_block_min, nether_lava_block_max, nether_lava_block_size;
		private final IntValue water_block_frequency, water_block_min, water_block_max, water_block_size;
		private final BooleanValue ender_ore, ender_mite;
		private final IntValue endermite_spawn, ender_ore_frequency, ender_ore_min, ender_ore_max, ender_ore_size, charcoal_size, 
						charcoal_max, charcoal_min, charcoal_frequency;
		private final BooleanValue CharcoalWorldgen, overworld_wub;
		private final IntValue wub_block_count, wub_block_frequency, wub_block_min, wub_block_max;
		private final BooleanValue nether_wub;
		private final IntValue nether_wub_block_count, nether_wub_block_frequency, nether_wub_block_min, nether_wub_block_max,
				tiny_charcoal_burntime, tiny_coal_burntime, repair_tablet_cooldown;
		private final BooleanValue lava_armor_resistance, lava_armor_fire;;
		private final IntValue lava_armor_resistance_lvl, lava_armor_fire_lvl;
		private final BooleanValue dragon_fly, dragon_resistance, dragon_fire, dragon_strength;
		private final IntValue dragon_fire_lvl, dragon_resistance_lvl, dragon_strength_lvl;
		private final BooleanValue wither_resistance, wither_fire, wither_strength;
		private final IntValue wither_resistance_lvl, wither_fire_lvl, wither_strength_lvl;
		private final BooleanValue lapis_armor_water;
		private final IntValue lapis_armor_water_lvl;
		private final BooleanValue obsidian_armor_resistance;
		private final IntValue obsidian_armor_resistance_lvl;
		private final BooleanValue quartz_armor_strength;
		private final IntValue quartz_armor_strength_lvl;
		private final BooleanValue redstone_armor_speed;
		private final IntValue redstone_armor_speed_lvl;
		private final DoubleValue spear_reach;
		private final IntValue AppleAmount, CarrotAmount, PotatoAmount, BeetAmount, CactusAmount, SlimeAmount, WheatAmount, MelonAmount, PumpkinAmount;
		private final DoubleValue AppleSaturation, CarrotSaturation, PotatoSaturation, BeetSaturation, CactusSaturation, SlimeSaturation, WheatSaturation, MelonSaturation, PumpkinSaturation;
		private final BooleanValue ExtraPlantGen;
		private final IntValue berryPlantRarity, BlueberryAmount, BlackberryAmount, MaloberryAmount, RaspberryAmount, ToastedAmount, eat_timer;
		private final DoubleValue BlueberrySaturation, BlackberrySaturation, MaloberrySaturation, RaspberrySaturation, ToastedSaturation;
		private BooleanValue quick_sand_generation, berry_bushes_generation, wub_ore_generation, charcoal_ore_generation, ender_ore_generation, lava_block_generation, water_block_generation;

		
		private ConfigCommon(Builder builder) {
			builder.push("Main");
				builder.push("Growth Crystal").comment("These like to grow things!");
					builder.push("Tier 1");
						BlockGrowthTicks = lazyInt(builder, "Growth Crystal Tier 1 Speed", 60, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 40 Ticks or 2 Seconds]\n[Default*40=1200 Ticks]");
						GrowthParticalTicks = lazyInt(builder, "Growth Crystal Tier 1 Particles", 1000, 50, 1000, "Lower Number gives more Particles");
					builder.pop();
					builder.push("Tier 2");
						BlockGrowthUpgradeTicks = lazyInt(builder, "Growth Crystal Tier 2 Speed", 30, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 20 Ticks or 1 Second]\n[Default*20=800 Ticks]");
						GrowthUpgradeParticalTicks = lazyInt(builder, "Growth Crystal Tier 2 Particles", 1000, 50, 1000, "Lower Number gives more Particles");
					builder.pop();
					builder.push("Tier 3");
						BlockGrowthUpgradeTwoTicks = lazyInt(builder, "Growth Crystal Tier 3 Speed", 30, 1, 100, "Number of Ticks between Growth Ticks.\n[1 = 10 Ticks or 1/2 a Second]\n[Default*10=400 Ticks]");
						GrowthUpgradeTwoParticalTicks = lazyInt(builder, "Growth Crystal Tier 3 Particles", 1000, 50, 1000,	"Lower Number gives more Particles");
					builder.pop();
					ParticalTicks = lazyBool(builder, "Growth Crystal Particles", false, "Enable Growth Crystal Particles?");
				builder.pop();
	
				builder.comment("Remember to water those plants!").push("Watering Cans");
					WateringCanChance = lazyInt(builder, "Watering Can Chance", 50, 1, 50, "Chance out of 50 that the Watering Can will tick the plant!");
					WateringCanUpgradeChance = lazyInt(builder, "Watering Can Reinforced Chance", 100, 50, 100,	"Chance out of 100 that the Watering Can will tick the plant!");
				builder.pop();
	
				builder.comment("It's the little things that count right?").push("Charcoal");
					CharcoalBlockBurn = lazyInt(builder, "Charcoal Block Burn Time", 16000, 0, Integer.MAX_VALUE, "Sets the burn time for the Charcoal Block.");
				builder.pop();
			builder.pop();

			builder.push("Supporters");
				builder.push("Custom Packs").comment("Added for Custom Packs!\n[If you enable please make a recipe for them, Other wise they do nothing.]");
					FlintKnifeDamage = lazyInt(builder, "Flint Knife Durability", 100, 0, Integer.MAX_VALUE, "Sets the amount of Durability.");
					QuartzKnifeDamage = lazyInt(builder, "Quartz Knife Durability", 128, 0, Integer.MAX_VALUE, "Sets the amount of Durability.");
				builder.pop();
	
				builder.comment("WUB WUB WUB!").push("WUB Juice");
					vasholine_heal_amount = lazyDouble(builder, "WUB Juice Heal Amount", 0.25D, 0.0D, 1.0D,	"Sets the amount of heal Wub Juice does per tick.");
					vasholine_mobs = lazyBool(builder, "WUB Juice Hurts Mobs", true, "Enable mobs getting hurt?");
					vasholine_mobs_amount = lazyDouble(builder, "WUB Juice Hurts Mobs Amount", 0.01D, 0.0D, 1.0D,"Sets the amount mobs get hurt.");
					wub_heal_mobs = lazyBool(builder, "WUB Juice Heals Mobs", false, "Enable mobs getting healed?");
					mob_heal_amount = lazyDouble(builder, "WUB Juice Heals Mobs Amount", 0.01D, 0.0F, 1.0D,	"Sets the amount mobs get healed.");
					wub_weakness = lazyBool(builder, "WUB Juice Side Effect Weakness", true, "Enable Weakness while being healed?");
					wub_blindness = lazyBool(builder, "WUB Juice Side Effect Blindness", true, "Enable Blindness while being healed?");
					wub_fatigue = lazyBool(builder, "WUB Juice Side Effect Mining Fatigue", true, "Enable Mining Fatigue while being healed?");
				builder.pop();
	
				// builder.comment("Sink Into Madness Block!\n[This item is not a Craftable
				// Block.]\n[To be used with Bedrock Replacer Mod]\n[MAY CAUSE SERVER LAG NEEDS
				// MORE TESTING]").push("Withered Bedrock");
				// ConfigHandler.WitheredBlock = config.getBoolean("Withered Bedrock", "Withered
				// Bedrock", false, "Enable Withered Bedrock?");
				// ConfigHandler.WitheredBlockParticals = config.getBoolean("Withered
				// Particles", "Withered Bedrock", false, "Enable Player Withered Particles?");
				// ConfigHandler.WitheredBlockTime = config.getInt("Withered Time", "Withered
				// Bedrock", 3, 1, Integer.MAX_VALUE, "Sets the Time a player is Withered from
				// standing on Withered Bedrock.\n[1 = 20Ticks]");
	
				builder.comment("Need a little healing?\n[Each teir requires the lower teir for crafting!]\n[Medical Items can now only be used if player is hurt!]").push("Medical Items");
					// Small Bandage
					smallBandageHealStack = lazyInt(builder, "Teir 1 Meical Item Stacksize", 8, 1, 64, "Sets the Stacksize of the Small Medical Bandage!");
					smallBandageRegen = lazyInt(builder, "Teir 1 Meical Item Regen Time", 5, 1, 30,	"Sets the length of regen of the Small Medical Bandage!\n[Does not stack]");
					// Large Bandage
					largeBandageStack = lazyInt(builder, "Teir 2 Meical Item Stacksize", 16, 1, 64,	"Sets the Stacksize of the Large Medical Bandage!");
					largeBandageDuration = lazyInt(builder, "Teir 2 Meical Item Use Duration", 4, 1, 64, "Sets how long it takes the player to apply the Large Medical Bandage!");
					largeBandageBoostTime = lazyInt(builder, "Teir 2 Meical Item Boost Time", 15, 0, 120, "Sets how long the player has 2 extra hearts on the Large Medical Bandage!\n[Does not stack]");
					// Small Med kit
					smallMedHealStack = lazyInt(builder, "Teir 3 Meical Item Stacksize", 16, 1, 64,	 "Sets the Stacksize of the Small Medical Kit!");
					smallMedDuration = lazyInt(builder, "Teir 3 Meical Item Use Duration", 8, 1, 64, "Sets how long it takes the player to apply the Small Medical Kit!");
					smallMedBoostTime = lazyInt(builder, "Teir 3 Meical Item Boost Time", 30, 0, 240,"Sets how long the player has 4 extra hearts on the Small Medical Kit!\n[Does not stack]");
					// Large Med kit
					LargeMedHealStack = lazyInt(builder, "Teir 4 Meical Item Stacksize", 16, 1, 64,	"Sets the Stacksize of the Large Medical Kit!");
					LargeMedDuration = lazyInt(builder, "Teir 4 Meical Item Use Duration", 16, 1, 64, "Sets how long it takes the player to apply the Large Medical Kit!");
					largeMedBoostTime = lazyInt(builder, "Teir 4 Meical Item Boost Time", 60, 0, 300, "Sets how long the player has 6 extra hearts on the Large Medical Kit!\n[Does not stack]");
				builder.pop();
	
				builder.comment("Fun Stuff\n[Not PicKappa stop asking!]").push("Kappa Pick");
					kappa_level = lazyInt(builder, "Kappa Pick Mining Level", 1, 0, 3, "Mining Level.");
					kappa_damage = lazyInt(builder, "Kappa Pick Mining Level Durability", 31513, 100, Integer.MAX_VALUE, "Durability Level.");
				builder.pop();
	
				builder.comment("Because Pineapple goes on Pizza! Kappa").push("Pizza");
					bams_pizza_amount = lazyInt(builder, "Bams Pizza Heal Amount", 10, 1, 20, "Sets the Heal Amount.");
					bams_pizza_sat = lazyDouble(builder, "Bams Pizza Saturation Amount", 1.0D, 0.0D, 1.0D, "Sets the Saturation Amount.");
				builder.pop();
	
	//			builder.comment("SUCC THE PEARLS").push("Succ Juice");
	//				succ_juice_bottle = lazyBool(builder, "Pearl Juice Recipe", false,	"Enable Pearl Juice require a bottle in recipe?");
	//			builder.pop();
	
				builder.comment("A Funny Thing").push("Sea Axe");
					sea_axe = lazyBool(builder, "Sea Axe - Axe", true,	"Enable Sea Axe as a Axe?\n[Axe has 11 attack damage!]\n[Only ENABLE if Sea Axe - Pickaxe is DISABLED!]\n[Sea Axe must be ENABLED for this config to work!]");
					sea_pickaxe = lazyBool(builder, "Sea Axe - Pickaxe", false,	"Enable Sea Axe as a Pickaxe?\n[Pickaxe has 10 attack damage!]\n[Only ENABLE if Sea Axe - Axe is DISABLED!]\n[Sea Axe must be ENABLED for this config to work!]");
				builder.pop();
			builder.pop();
			
			builder.push("Ores");
				builder.comment("Lavastone!").push("Lava Source Block Stones");		
					lava_block_frequency = lazyInt(builder, "Lavastone Gen Frequency", 5, 1, 100, "Sets the Chance of Lavastone generating.");
					lava_block_min = lazyInt(builder,"Lavastone Gen Min", 12, 1, 255, "Sets the min Y level.");
					lava_block_max = lazyInt(builder, "Lavastone Gen Max", 32, 1, 255, "Sets the max Y level.");
					lava_block_size = lazyInt(builder, "Lavastone Gen Size", 4, 1, 100, "Sets the Lavastone Vein Size.");
				builder.pop();
				
				builder.comment("Nether Lavastone!").push("Nether Lava Source Block Stones");	
					nether_lava_block_frequency = lazyInt(builder, "Nether Lavastone Gen Frequency",  5, 1, 100, "Sets the Chance of Nether Lavastone generating.");
					nether_lava_block_min = lazyInt(builder, "Nether Lavastone Gen Min", 12, 1, 255, "Sets the min Y level.");
					nether_lava_block_max = lazyInt(builder, "Nether Lavastone Gen Max", 32, 1, 255, "Sets the max Y level.");
					nether_lava_block_size = lazyInt(builder, "Nether Lavastone Gen Size", 4, 1, 100, "Sets the Nether Lavastone Vein Size.");
				builder.pop();
				
				builder.comment("Waterstone!").push("Water Source Block Stones");	
					water_block_frequency = lazyInt(builder,"Waterstone Gen Frequency", 5, 1, 100, "Sets the Chance of Waterstone generating.");
					water_block_min = lazyInt(builder,"Waterstone Gen Min", 32, 1, 255, "Sets the min Y level.");
					water_block_max = lazyInt(builder,"Waterstone Gen Max", 48, 1, 255, "Sets the max Y level.");
					water_block_size = lazyInt(builder,"Waterstone Gen Size", 4, 1, 100, "Sets the Waterstone Vein Size.");
				builder.pop();
				
				builder.comment("Might as well add this!").push("Ender Ore");	
					ender_ore = lazyBool(builder,"Ender Ore", true, "World Generate Ender Ore?");
					ender_mite = lazyBool(builder,"Endermite", true, "Enable Endermite spawn?");
					endermite_spawn = lazyInt(builder,"Endermite Spawn", 25, 0, 100, "Sets the Chance of Endermites to spawn when Ore is mined.");
					ender_ore_frequency = lazyInt(builder,"Ender Ore Frequency",  5, 1, 100, "Sets the Chance of Ender ore generating.");
					ender_ore_min = lazyInt(builder,"Ender Ore Min", 1, 1, 255, "Sets the min Y level.");
					ender_ore_max = lazyInt(builder,"Ender Ore Max", 32, 1, 255, "Sets the max Y level.");
					ender_ore_size = lazyInt(builder,"Ender Ore Size", 4, 1, 100, "Sets the Ender Ore Vein Size.");
				builder.pop();
				
				builder.comment("It's the little things that count right?!").push("Charcoal");	
					CharcoalWorldgen = lazyBool(builder, "Charcoal Block Nether Worldgen", true, "Enable the Charcoal Block to spawn in the nether?");
					charcoal_frequency = lazyInt(builder,"Charcoal Block Nether Worldgen Frequency",  10, 1, 100, "Sets the Chance of Charcoal Block.");
					charcoal_min = lazyInt(builder,"Charcoal Block Nether Worldgen Min", 1, 1, 255, "Sets the min Y level.");
					charcoal_max = lazyInt(builder,"Charcoal Block Nether Worldgen Max",  128, 1, 255, "Sets the max Y level.");
					charcoal_size = lazyInt(builder,"Charcoal Block Nether Worldgen Size",  10, 1, 100, "Sets the Charcoal Vein Size.");  
				builder.pop();
				
				builder.push("WUB Juice Overworld Ore");
					overworld_wub = lazyBool(builder, "Overworld Wub Ore", true, "Enable Overworld Wub Ore?");
					wub_block_count = lazyInt(builder,"Overworld Wub Ore Gen Size", 5, 1, 100, "Sets the Overworld Wub Ore Vein Size.");
					wub_block_frequency = lazyInt(builder,"Overworld Wub Ore Gen Chance", 50, 1, 100, "Sets the Chance of Overworld Wub Ore generating.");
					wub_block_min = lazyInt(builder,"Overworld Wub Ore Gen Min", 1, 1, 255, "Sets the Overworld min Y level.");
					wub_block_max = lazyInt(builder,"Overworld Wub Ore Gen Max", 255, 1, 255, "Sets the Overworld max Y level.");
				builder.pop();
				
				builder.push("WUB Juice Nether Ore");
					nether_wub = lazyBool(builder,"Nether Wub Ore", true, "WorldGen Nether Wub Ore?");
					nether_wub_block_count =lazyInt(builder,"Nether Wub Ore Gen Size", 5, 1, 100, "Sets the Nether Wub Ore Vein Size.");
					nether_wub_block_frequency =lazyInt(builder,"Nether Wub Ore Gen Chance", 50, 1, 100, "Sets the Chance of Nether Wub Ore generating.");
					nether_wub_block_min = lazyInt(builder,"Nether Wub Ore Gen Min", 1, 1, 120, "Sets the Nether min Y level.");
					nether_wub_block_max = lazyInt(builder,"Nether Wub Ore Gen Max", 120, 1, 120, "Sets the Nether max Y level.");
				builder.pop();
			builder.pop();
			
			builder.push("Extras");
			
			//TODO drops???
//				ConfigHandler.BoneDrops = config.getBoolean("Bone Drops", "Dirt Drops", true, "Enable Bones to drop from Dirt?");
//				ConfigHandler.BoneDropsChance = config.getInt("Bone Drop Chance", "Dirt Drops", 1, 0, 100, "Sets the Chance of Bones from Dirt.");
//				ConfigHandler.BoneAmount = config.getInt("Bone Drop Amount", "Dirt Drops", 1, 1, 64, "Sets the Amount of Bones Dropped from Dirt.");
//				ConfigHandler.SkullDrops = config.getBoolean("Skull Drops", "Dirt Drops", true, "Enable Skulls to drop from Dirt?");
//				ConfigHandler.SkullDropsChance = config.getInt("Skull Drop Chance", "Dirt Drops", 1, 0, 100, "Sets the Chance of Skulls from Dirt.");
//				ConfigHandler.SkullAmount = config.getInt("Skull Drop Amount", "Dirt Drops", 1, 1, 64, "Sets the Amount of Skulls Dropped from Dirt.");
			
//				config.addCustomCategoryComment("Extra Tree Drops", "Extra Drops");
//				ConfigHandler.extra_drops = config.getBoolean("Extra Fruit Drops", "Extra Tree Drops", true, "Enable Pears and Peaches to drop from leaves?");
//				ConfigHandler.extra_drop_bottle = config.getBoolean("Extra Fruit Drops need bottle to make juice", "Extra Tree Drops", false, "Enable Bottle in recipe?");
//				ConfigHandler.pearDropsChance = config.getInt("Extra Fruit Drops Pear Chance", "Extra Tree Drops", 1, 0, 100, "Sets the Chance of Pears from leaves.");
//				ConfigHandler.pearDropsAmount = config.getInt("Extra Fruit Drops Pear Amount", "Extra Tree Drops", 1, 1, 64, "Sets the Amount of Pears Dropped from leaves.");
//				ConfigHandler.peachDropsChance = config.getInt("Extra Fruit Drops Peach Chance", "Extra Tree Drops", 1, 0, 100, "Sets the Chance of Peaches from leaves.");
//				ConfigHandler.peachDropsAmount = config.getInt("Extra Fruit Drops Peach Amount", "Extra Tree Drops", 1, 1, 64, "Sets the Amount of Peaches Dropped from leaves.");
//				ConfigHandler.peachAmount = config.getInt("Extra Fruit Drops Peach Juice Heal Amount", "Extra Tree Drops", 4, 1, 20, "Sets the Heal Amount of Peach Juice.");
//				ConfigHandler.peachSaturation = config.getFloat("Extra Fruit Drops Peach Juice Saturation Amount", "Extra Tree Drops", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount of Peach Juice.");
//				ConfigHandler.pearAmount = config.getInt("Extra Fruit Drops Pear Juice Heal Amount", "Extra Tree Drops", 4, 1, 20, "Sets the Heal Amount of Pear Juice.");
//				ConfigHandler.pearSaturation = config.getFloat("Extra Fruit Drops Pear Juice Saturation Amount", "Extra Tree Drops", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount of Pear Juice.");
			
//				config.addCustomCategoryComment("Extra Tree Drops Vanilla", "Extra Drops Vanilla");
//				ConfigHandler.extra_drops_vanilla = config.getBoolean("Extra Tree Drops Vanilla", "Extra Tree Drops Vanilla", true, "Enable Extra Sticks and Apples to drop from leaves?");
//				ConfigHandler.stickDropsChance = config.getInt("Extra Tree Drops Stick Chance", "Extra Tree Drops Vanilla", 1, 0, 100, "Sets the Chance of Sticks from leaves.");
//				ConfigHandler.stickDropsAmount = config.getInt("Extra Tree Drops Stick Amount", "Extra Tree Drops Vanilla", 1, 1, 64, "Sets the Amount of Sticks Dropped from leaves.");
//				ConfigHandler.appleDropsChance = config.getInt("Extra Tree Drops Apple Chance", "Extra Tree Drops Vanilla", 1, 0, 100, "Sets the Chance of Apple from leaves.");
//				ConfigHandler.appleDropsAmount = config.getInt("Extra Tree Drops Apple Amount", "Extra Tree Drops Vanilla", 1, 1, 64, "Sets the Amount of Apple Dropped from leaves.");
			
				builder.push("Tiny Coal & Charcoal");
					tiny_charcoal_burntime = lazyInt(builder,"Tiny Charcoal Burn Time", 200, 0, Integer.MAX_VALUE, "Sets the burn time for Tiny Charcoal.");
					tiny_coal_burntime = lazyInt(builder,"Tiny Coal Burn Time", 200, 0, Integer.MAX_VALUE, "Sets the burn time for Tiny Coal.");
				builder.pop();
				
				builder.comment("Need some extra durability, eh?\n[Repairs Items in Players Inventory only.]").push("Repair Tablet");
					repair_tablet_cooldown = lazyInt(builder,"Repair Tablet Cooldown", 20, 1, Integer.MAX_VALUE, "Cooldown (in ticks) between repair processes.");
				builder.pop();
			builder.pop();
			
			builder.push("Armor");
				builder.comment("What Armor?").push("Lava Armor");
					lava_armor_resistance = lazyBool(builder,"Lava Armor Resistance", true, "Enable Lava Armor Resistance?");
					lava_armor_resistance_lvl = lazyInt(builder,"Lava Armor Resistance Level",  0, 0, 10, "Resistance Level.");
					lava_armor_fire = lazyBool(builder,"Lava Armor Fire Resistance", true, "Enable Lava Armor Fire Resistance?");
					lava_armor_fire_lvl = lazyInt(builder,"Lava Armor Fire Resistance Level", 0, 0, 10, "Fire Resistance Level.");
				builder.pop();
				
				builder.comment("End Game Armor").push("Dragon Armor");
					dragon_fly = lazyBool(builder,"Dragon Armor Allow Flight", true, "Enable Dragon Armor Flight?");
					dragon_resistance = lazyBool(builder, "Dragon Armor Resistance",  true, "Enable Dragon Armor Resistance?");
					dragon_resistance_lvl = lazyInt(builder,"Dragon Armor Resistance Level",  1, 0, 10, "Resistance Level.");
					dragon_fire = lazyBool(builder,"Dragon Armor Fire Resistance",  true, "Enable Dragon Armor Fire Resistance?");
					dragon_fire_lvl = lazyInt(builder,"Dragon Armor Fire Resistance Level",  1, 0, 10, "Fire Resistance Level.");
					dragon_strength = lazyBool(builder,"Dragon Armor Strength", true, "Enable Dragon Armor Strength?");
					dragon_strength_lvl = lazyInt(builder,"Dragon Armor Strength Level",  1, 0, 10, "Strength Level.");
				builder.pop();
				
				builder.comment("Mid Game Armor").push("Wither Armor");
					wither_resistance = lazyBool(builder,"Wither Armor Resistance", true, "Enable Wither Armor Resistance?");
					wither_resistance_lvl = lazyInt(builder,"Wither Armor Resistance Level", 0, 0, 10, "Resistance Level.");
					wither_fire = lazyBool(builder,"Wither Armor Fire Resistance", true, "Enable Wither Armor Fire Resistance?");
					wither_fire_lvl = lazyInt(builder,"Wither Armor Fire Resistance Level",  0, 0, 10, "Fire Resistance Level.");
					wither_strength = lazyBool(builder,"Wither Armor Strength",  true, "Enable Wither Armor Strength?");
					wither_strength_lvl = lazyInt(builder,"Wither Armor Strength Level", 0, 0, 10, "Strength Level.");
				builder.pop();
				
				builder.comment("Lets go under the water").push("Lapis Armor");
					lapis_armor_water = lazyBool(builder, "Lapis Armor Water Breathing", true, "Enable Lapis Water Breathing?");
					lapis_armor_water_lvl = lazyInt(builder, "Lapis Armor Water Breathing Level", 0, 0, 10, "Water Breathing Level.");
				builder.pop();
				
				builder.comment("What?").push("Obsidian Armor");
					obsidian_armor_resistance = lazyBool(builder,"Obsidian Armor Resistance", true, "Enable Obsidian Resistance?");
					obsidian_armor_resistance_lvl = lazyInt(builder, "Obsidian Armor Resistance Level", 0, 0, 10, "Resistance Level.");
				builder.pop();
				
				builder.comment("You went where?").push("Quartz Armor");
					quartz_armor_strength = lazyBool(builder,"Quartz Armor Strength", true, "Enable Quartz Strength?");
					quartz_armor_strength_lvl = lazyInt(builder,"Quartz Armor Strength Level",  0, 0, 10, "Strength Level.");
				builder.pop();
				
				builder.comment("How fast you want to go?").push("Redstone Armor");
					redstone_armor_speed = lazyBool(builder,"Redstone Armor Speed", true, "Enable Redstone Speed?");
					redstone_armor_speed_lvl = lazyInt(builder,"Redstone Armor Speed Level", 0, 0, 10, "Speed Level.");
				builder.pop();
			builder.pop();
			
			builder.push("Tools & Weapons");
				builder.push("Spears");
					spear_reach = lazyDouble(builder, "A Spears Extended Reach", 7D, 5D, 10D, "Sets the Reach of a Spear.\n[Vanilla is 5 blocks!]");
				builder.pop();
			builder.pop();
			
			builder.push("Terrain Generation");
					quick_sand_generation = lazyBool(builder, "Quick Sand Gen", true, "Spawn quick sand traps in the overworld");
					berry_bushes_generation = lazyBool(builder, "Berry Bush Gen", true, "Spawn berry bushes in the overworld");
			builder.pop();

			builder.push("Ore Generation");
				wub_ore_generation =      lazyBool(builder, "Wub Ore Gen", true,      "Add Wub Ore to World Generation");
				charcoal_ore_generation = lazyBool(builder, "Charcoal Ore Gen", true, "Add Charcoal Ore to World Generation");
				ender_ore_generation =    lazyBool(builder, "Ender Ore Gen", true,    "Add Ender Ore to World Generation");
				lava_block_generation =   lazyBool(builder, "Lava Block Gen", true,   "Add Lava Block to World Generation");
				water_block_generation =  lazyBool(builder, "Water Block Gen", true,  "Add Water Block to World Generation");
			builder.pop();			
			
			builder.push("Food & Drinks");
				builder.comment("Everyone loves juice Stats!").push("Juice Stats");
					AppleAmount = lazyInt(builder,"Apple Juice Heal Amount", 4, 1, 20, "Sets the Heal Amount.");
					AppleSaturation = lazyDouble(builder, "Apple Juice Saturation Amount", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
					CarrotAmount = lazyInt(builder,"Carrot Juice Heal Amount", 4, 1, 20, "Sets the Heal Amount.");
					CarrotSaturation = lazyDouble(builder,"Carrot Juice Saturation Amount", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
					PotatoAmount = lazyInt(builder,"Potato Juice Heal Amount", 4, 1, 20, "Sets the Heal Amount.");
					PotatoSaturation = lazyDouble(builder, "Potato Juice Saturation Amount", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
					BeetAmount = lazyInt(builder,"Beet Juice Heal Amount", 4, 1, 20, "Sets the Heal Amount.");
					BeetSaturation = lazyDouble(builder, "Beet Juice Saturation Amount", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
					CactusAmount = lazyInt(builder,"Cactus Juice Heal Amount", 4, 1, 20, "Sets the Heal Amount.");
					CactusSaturation = lazyDouble(builder, "Cactus Juice Saturation Amount", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
					SlimeAmount = lazyInt(builder,"Slime Juice Heal Amount", 4, 1, 20, "Sets the Heal Amount.");
					SlimeSaturation = lazyDouble(builder, "Slime Juice Saturation Amount", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
					WheatAmount = lazyInt(builder,"Wheat Juice Heal Amount", 4, 1, 20, "Sets the Heal Amount.");
					WheatSaturation = lazyDouble(builder, "Wheat Juice Saturation Amount", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
					MelonAmount = lazyInt(builder,"Melon Juice Heal Amount", 4, 1, 20, "Sets the Heal Amount.");
					MelonSaturation = lazyDouble(builder, "Melon Juice Saturation Amount", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
					PumpkinAmount = lazyInt(builder,"Pumpkin Juice Heal Amount", 4, 1, 20, "Sets the Heal Amount.");
					PumpkinSaturation = lazyDouble(builder, "Pumpkin Juice Saturation Amount", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
				builder.pop();
				
				builder.comment("Extra Berry Plants!\n[Disable Extra Plant Generation if you want to use Naturas Berries instead!]\n[The higher the value, the more Plants are generated.]").push("Modded Juice Generation");
					ExtraPlantGen = lazyBool(builder,"Extra Plant Generation", true, "Enable Extra Plant Generation?");
					berryPlantRarity = lazyInt(builder,"Extra Plant Generation Rarity", 5, 1, Integer.MAX_VALUE, "Sets the Rarity of Berry Plants.");
				builder.pop();
				
				builder.comment("Everyone loves juice Stats!").push("Juice Stats");
					BlueberryAmount = lazyInt(builder,"Blueberry Juice Heal Amount", 4, 1, 20, "Sets the Heal Amount.");
					BlueberrySaturation = lazyDouble(builder, "Blueberry Juice Saturation Amount", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
					BlackberryAmount = lazyInt(builder,"Blackberry Juice Heal Amount", 4, 1, 20, "Sets the Heal Amount.");
					BlackberrySaturation = lazyDouble(builder, "Blackberry Juice Saturation Amount", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
					MaloberryAmount = lazyInt(builder,"Maloberry Juice Heal Amount", 4, 1, 20, "Sets the Heal Amount.");
					MaloberrySaturation = lazyDouble(builder, "Maloberry Juice Saturation Amount", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
					RaspberryAmount = lazyInt(builder,"Raspberry Juice Heal Amount", 4, 1, 20, "Sets the Heal Amount.");
					RaspberrySaturation = lazyDouble(builder, "Raspberry Juice Saturation Amount", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
				builder.pop();
				
				builder.comment("Want more food Stats?\n[WIP Section]").push("Extra Food Stats");
					ToastedAmount = lazyInt(builder,"Toasted Bread Heal Amount", 6, 1, 20, "Sets the Heal Amount.");
					ToastedSaturation = lazyDouble(builder, "Toasted Bread Saturation Amount", 0.7F, 0.0F, 1.0F, "Sets the Saturation Amount.");
				builder.pop();
				
				builder.comment( "How long it takes to eat food.").push("Food Eat Duration");
					eat_timer = lazyInt(builder,"Eat Duration", 32, 8, Integer.MAX_VALUE, "Sets how long it takes to eat TP food.");
				builder.pop();
				
			builder.pop();
		}

		private void apply() {
			ConfigHandler.BlockGrowthTicks = BlockGrowthTicks.get();
			ConfigHandler.GrowthParticalTicks = GrowthParticalTicks.get();
			ConfigHandler.BlockGrowthUpgradeTicks = BlockGrowthUpgradeTicks.get();
			ConfigHandler.GrowthUpgradeParticalTicks = GrowthUpgradeParticalTicks.get();
			ConfigHandler.BlockGrowthUpgradeTwoTicks = BlockGrowthUpgradeTwoTicks.get();
			ConfigHandler.GrowthUpgradeTwoParticalTicks = GrowthUpgradeTwoParticalTicks.get();
			ConfigHandler.ParticalTicks = ParticalTicks.get();

			ConfigHandler.WateringCanChance = WateringCanChance.get();
			ConfigHandler.WateringCanUpgradeChance = WateringCanUpgradeChance.get();

			FuelHandler.CharcoalBlockBurn = CharcoalBlockBurn.get();

			ConfigHandler.FlintKnifeDamage = FlintKnifeDamage.get();
			ConfigHandler.QuartzKnifeDamage = QuartzKnifeDamage.get();

			ConfigHandler.vasholine_heal_amount = vasholine_heal_amount.get().floatValue();
			ConfigHandler.vasholine_mobs = vasholine_mobs.get();
			ConfigHandler.vasholine_mobs_amount = vasholine_mobs_amount.get().floatValue();
			ConfigHandler.wub_heal_mobs = wub_heal_mobs.get();
			ConfigHandler.mob_heal_amount = mob_heal_amount.get().floatValue();
			ConfigHandler.wub_weakness = wub_weakness.get();
			ConfigHandler.wub_blindness = wub_blindness.get();
			ConfigHandler.wub_fatigue = wub_fatigue.get();

			// Small Bandage
			ConfigHandler.smallBandageHealStack = smallBandageHealStack.get();
			ConfigHandler.smallBandageRegen = smallBandageRegen.get();
			// Large Bandage
			ConfigHandler.largeBandageStack = largeBandageStack.get();
			ConfigHandler.largeBandageDuration = largeBandageDuration.get();
			ConfigHandler.largeBandageBoostTime = largeBandageBoostTime.get();
			// Small Med kit
			ConfigHandler.smallMedHealStack = smallMedHealStack.get();
			ConfigHandler.smallMedDuration = smallMedDuration.get();
			ConfigHandler.smallMedBoostTime = smallMedBoostTime.get();
			// Large Med kit
			ConfigHandler.LargeMedHealStack = LargeMedHealStack.get();
			ConfigHandler.LargeMedDuration = LargeMedDuration.get();
			ConfigHandler.largeMedBoostTime = largeMedBoostTime.get();

			ConfigHandler.kappa_level = kappa_level.get();
			ConfigHandler.kappa_damage = kappa_damage.get();

			ConfigHandler.bams_pizza_amount = bams_pizza_amount.get();
			ConfigHandler.bams_pizza_sat = bams_pizza_sat.get().floatValue();

//			ConfigHandler.succ_juice_bottle = succ_juice_bottle.get();

			ConfigHandler.sea_axe = sea_axe.get();
			ConfigHandler.sea_pickaxe = sea_pickaxe.get();
			
			ConfigHandler.lava_block_frequency = lava_block_frequency.get();
			ConfigHandler.lava_block_min = lava_block_min.get();
			ConfigHandler.lava_block_max = lava_block_max.get();
			ConfigHandler.lava_block_size = lava_block_size.get();
			
			ConfigHandler.nether_lava_block_frequency = nether_lava_block_frequency.get();
			ConfigHandler.nether_lava_block_min = nether_lava_block_min.get();
			ConfigHandler.nether_lava_block_max = nether_lava_block_max.get();
			ConfigHandler.nether_lava_block_size = nether_lava_block_size.get();
			
			ConfigHandler.water_block_frequency = water_block_frequency.get();
			ConfigHandler.water_block_min = water_block_min.get();
			ConfigHandler.water_block_max = water_block_max.get();
			ConfigHandler.water_block_size = water_block_size.get();

			ConfigHandler.ender_ore = ender_ore.get();
			ConfigHandler.ender_mite = ender_mite.get();
			ConfigHandler.endermite_spawn = endermite_spawn.get();
			ConfigHandler.ender_ore_frequency = ender_ore_frequency.get();
			ConfigHandler.ender_ore_min = ender_ore_min.get();
			ConfigHandler.ender_ore_max = ender_ore_max.get();
			ConfigHandler.ender_ore_size = ender_ore_size.get();
			
			ConfigHandler.CharcoalWorldgen = CharcoalWorldgen.get();
			ConfigHandler.charcoal_frequency = charcoal_frequency.get();
			ConfigHandler.charcoal_min = charcoal_min.get();
			ConfigHandler.charcoal_max = charcoal_max.get();
			ConfigHandler.charcoal_size =charcoal_size.get();
			
			ConfigHandler.overworld_wub = overworld_wub.get();
			ConfigHandler.wub_block_count = wub_block_count.get();
			ConfigHandler.wub_block_frequency = wub_block_frequency.get();
			ConfigHandler.wub_block_min = wub_block_min.get();
			ConfigHandler.wub_block_max = wub_block_max.get();
			
			ConfigHandler.nether_wub = nether_wub.get();
			ConfigHandler.nether_wub_block_count =nether_wub_block_count.get();
			ConfigHandler.nether_wub_block_frequency =nether_wub_block_count.get();
			ConfigHandler.nether_wub_block_min = nether_wub_block_min.get();
			ConfigHandler.nether_wub_block_max = nether_wub_block_max.get();
			
			FuelHandler.tiny_charcoal_burntime = tiny_charcoal_burntime.get();
			FuelHandler.tiny_coal_burntime = tiny_coal_burntime.get();
			
			ConfigHandler.repair_tablet_cooldown = repair_tablet_cooldown.get();
			
			//ARMOR
			ArmorHandler.lava_armor_resistance = lava_armor_resistance.get();
			ArmorHandler.lava_armor_resistance_lvl = lava_armor_resistance_lvl.get();
			ArmorHandler.lava_armor_fire = lava_armor_fire.get();
			ArmorHandler.lava_armor_fire_lvl = lava_armor_fire_lvl.get();
			
			ArmorHandler.dragon_fly = dragon_fly.get();
			ArmorHandler.dragon_resistance = dragon_resistance.get();
			ArmorHandler.dragon_resistance_lvl = dragon_resistance_lvl.get();
			ArmorHandler.dragon_fire = dragon_fire.get();
			ArmorHandler.dragon_fire_lvl = dragon_fire_lvl.get();
			ArmorHandler.dragon_strength = dragon_strength.get();
			ArmorHandler.dragon_strength_lvl = dragon_strength_lvl.get();
			
			ArmorHandler.wither_resistance = wither_resistance.get();
			ArmorHandler.wither_resistance_lvl = wither_resistance_lvl.get();
			ArmorHandler.wither_fire = wither_fire.get();
			ArmorHandler.wither_fire_lvl = wither_fire_lvl.get();
			ArmorHandler.wither_strength = wither_strength.get();
			ArmorHandler.wither_strength_lvl = wither_strength_lvl.get();
			
			ArmorHandler.lapis_armor_water = lapis_armor_water.get();
			ArmorHandler.lapis_armor_water_lvl = lapis_armor_water_lvl.get();
			
			ArmorHandler.obsidian_armor_resistance = obsidian_armor_resistance.get();
			ArmorHandler.obsidian_armor_resistance_lvl = obsidian_armor_resistance_lvl.get();
			
			ArmorHandler.quartz_armor_strength = quartz_armor_strength.get();
			ArmorHandler.quartz_armor_strength_lvl = quartz_armor_strength_lvl.get();
			
			ArmorHandler.redstone_armor_speed = redstone_armor_speed.get();
			ArmorHandler.redstone_armor_speed_lvl = redstone_armor_speed_lvl.get();
			
			ConfigHandler.spear_reach = spear_reach.get().floatValue();
			
			ConfigHandler.AppleAmount = AppleAmount.get();
			ConfigHandler.AppleSaturation = AppleSaturation.get().floatValue();
			ConfigHandler.CarrotAmount = CarrotAmount.get();
			ConfigHandler.CarrotSaturation = CarrotSaturation.get().floatValue();
			ConfigHandler.PotatoAmount = PotatoAmount.get();
			ConfigHandler.PotatoSaturation = PotatoSaturation.get().floatValue();
			ConfigHandler.BeetAmount = BeetAmount.get();
			ConfigHandler.BeetSaturation = BeetSaturation.get().floatValue();
			ConfigHandler.CactusAmount = CactusAmount.get();
			ConfigHandler.CactusSaturation = CactusSaturation.get().floatValue();
			ConfigHandler.SlimeAmount = SlimeAmount.get();
			ConfigHandler.SlimeSaturation = SlimeSaturation.get().floatValue();
			ConfigHandler.WheatAmount = WheatAmount.get();
			ConfigHandler.WheatSaturation = WheatSaturation.get().floatValue();
			ConfigHandler.MelonAmount = MelonAmount.get();
			ConfigHandler.MelonSaturation = MelonSaturation.get().floatValue();
			ConfigHandler.PumpkinAmount = PumpkinAmount.get();
			ConfigHandler.PumpkinSaturation = PumpkinSaturation.get().floatValue();

			ConfigHandler.ExtraPlantGen = ExtraPlantGen.get();
			ConfigHandler.berryPlantRarity =berryPlantRarity.get();

			ConfigHandler.BlueberryAmount = BlueberryAmount.get();
			ConfigHandler.BlueberrySaturation = BlueberrySaturation.get().floatValue();
			ConfigHandler.BlackberryAmount = BlackberryAmount.get();
			ConfigHandler.BlackberrySaturation = BlackberrySaturation.get().floatValue();
			ConfigHandler.MaloberryAmount = MaloberryAmount.get();
			ConfigHandler.MaloberrySaturation = MaloberrySaturation.get().floatValue();
			ConfigHandler.RaspberryAmount = RaspberryAmount.get();
			ConfigHandler.RaspberrySaturation = RaspberrySaturation.get().floatValue();

			ConfigHandler.ToastedAmount = ToastedAmount.get();
			ConfigHandler.ToastedSaturation = ToastedSaturation.get().floatValue();

			ConfigHandler.eat_timer = eat_timer.get();
			
			
			ConfigHandler.should_gen_quick_sand = quick_sand_generation.get();
			ConfigHandler.bushes_terrain_gen = berry_bushes_generation.get();
			ConfigHandler.wub_ore_gen = wub_ore_generation.get();
			ConfigHandler.charcoal_ore_gen = charcoal_ore_generation.get();
			ConfigHandler.ender_ore_gen =  ender_ore_generation.get();
			ConfigHandler.lava_block_gen = lava_block_generation.get();
			ConfigHandler.water_block_gen = water_block_generation.get();

		}
	}

	
	// Not being used atm
	public static class ConfigClient {
		private ConfigClient(ForgeConfigSpec.Builder builder) {
			builder.push("client");
			builder.pop();
		}
		private void apply() {
		}
	}

	private static IntValue lazyInt(Builder builder, String var, int def, int min, int max, String com) {
		builder.comment(com);
		builder.translation(Reference.MOD_ID + ".config." + var.replaceAll(" ", "_"));
		return builder.defineInRange(var, def, min, max);
	}

	private static DoubleValue lazyDouble(Builder builder, String var, double def, double min, double max, String com) {
		builder.comment(com);
		builder.translation(Reference.MOD_ID + ".config." + var.replaceAll(" ", "_"));
		return builder.defineInRange(var, def, min, max);
	}

	private static BooleanValue lazyBool(Builder builder, String var, boolean def, String com) {
		builder.comment(com);
		builder.translation(Reference.MOD_ID + ".config." + var.replaceAll(" ", "_"));
		return builder.define(var, def);
	}

	private static ConfigValue<String> lazyString(Builder builder, String var, String def, String com) {
		builder.comment(com);
		builder.translation(Reference.MOD_ID + ".config." + var.replaceAll(" ", "_"));
		return builder.define(var, def);
	}

	private static ConfigValue<List<? extends String>> lazyList(Builder builder, String var, List<String> def,
			String com) {
		builder.comment(com);
		builder.translation(Reference.MOD_ID + ".config." + var.replaceAll(" ", "_"));
		return builder.defineList(var, def, (o) -> o instanceof String);
	}

	@SubscribeEvent
	public static void onLoad(final Loading event) {
		if (Reference.MOD_ID.equalsIgnoreCase(event.getConfig().getModId())) {
			if (event.getConfig().getType() == Type.CLIENT) {
				CLIENT.apply();
			} else if (event.getConfig().getType() == Type.COMMON) {
				COMMON.apply();
				loadJsonFiles();
			}
		}
	}

	@SubscribeEvent
	public static void onFileChanged(ModConfigEvent event) {
		if (Reference.MOD_ID.equalsIgnoreCase(event.getConfig().getModId())) {
			if (event.getConfig().getType() == Type.CLIENT)
				CLIENT.apply();
			else if (event.getConfig().getType() == Type.COMMON) {
				COMMON.apply();
				loadJsonFiles();
			}
		}
	}

	private static void loadJsonFiles() {

	}

}
