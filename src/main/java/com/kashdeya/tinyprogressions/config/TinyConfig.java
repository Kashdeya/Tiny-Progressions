package com.kashdeya.tinyprogressions.config;

import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

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

@SuppressWarnings({ "WeakerAccess", "SameParameterValue", "unused" })
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

		private IntValue BlockGrowthTicks, GrowthParticalTicks, BlockGrowthUpgradeTicks, GrowthUpgradeParticalTicks,
				BlockGrowthUpgradeTwoTicks, GrowthUpgradeTwoParticalTicks;
		private BooleanValue ParticalTicks;
		private IntValue WateringCanChance, WateringCanUpgradeChance;
		private IntValue CharcoalBlockBurn, FlintKnifeDamage, QuartzKnifeDamage;
		private DoubleValue vasholine_heal_amount, vasholine_mobs_amount, mob_heal_amount;
		private BooleanValue vasholine_mobs, wub_heal_mobs, wub_weakness, wub_blindness, wub_fatigue;
		private IntValue smallBandageHealStack, smallBandageRegen, largeBandageStack, largeBandageDuration,
				largeBandageBoostTime, smallMedHealStack, smallMedDuration, smallMedBoostTime, LargeMedHealStack,
				LargeMedDuration, largeMedBoostTime, kappa_level, kappa_damage, bams_pizza_amount;
		private DoubleValue bams_pizza_sat;
		private BooleanValue succ_juice_bottle, sea_axe, sea_pickaxe;
		private IntValue lava_block_frequency, lava_block_min, lava_block_max, lava_block_size;
		private IntValue nether_lava_block_frequency, nether_lava_block_min, nether_lava_block_max, nether_lava_block_size;
		private IntValue water_block_frequency;
		private IntValue water_block_min;
		private IntValue water_block_max;
		private IntValue water_block_size;

		private ConfigCommon(Builder builder) {

			builder.comment("These like to grow things!").push("Growth Crystal");
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

			builder.comment("Added for Custom Packs!\n[If you enable please make a recipe for them, Other wise they do nothing.]").push("Custom Packs");
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

			builder.comment(
					"Need a little healing?\n[Each teir requires the lower teir for crafting!]\n[Medical Items can now only be used if player is hurt!]")
					.push("Medical Items");
			// Small Bandage
			smallBandageHealStack = lazyInt(builder, "Teir 1 Meical Item Stacksize", 8, 1, 64,
					"Sets the Stacksize of the Small Medical Bandage!");
			smallBandageRegen = lazyInt(builder, "Teir 1 Meical Item Regen Time", 5, 1, 30,
					"Sets the length of regen of the Small Medical Bandage!\n[Does not stack]");
			// Large Bandage
			largeBandageStack = lazyInt(builder, "Teir 2 Meical Item Stacksize", 16, 1, 64,
					"Sets the Stacksize of the Large Medical Bandage!");
			largeBandageDuration = lazyInt(builder, "Teir 2 Meical Item Use Duration", 4, 1, 64,
					"Sets how long it takes the player to apply the Large Medical Bandage!");
			largeBandageBoostTime = lazyInt(builder, "Teir 2 Meical Item Boost Time", 15, 0, 120,
					"Sets how long the player has 2 extra hearts on the Large Medical Bandage!\n[Does not stack]");
			// Small Med kit
			smallMedHealStack = lazyInt(builder, "Teir 3 Meical Item Stacksize", 16, 1, 64,
					"Sets the Stacksize of the Small Medical Kit!");
			smallMedDuration = lazyInt(builder, "Teir 3 Meical Item Use Duration", 8, 1, 64,
					"Sets how long it takes the player to apply the Small Medical Kit!");
			smallMedBoostTime = lazyInt(builder, "Teir 3 Meical Item Boost Time", 30, 0, 240,
					"Sets how long the player has 4 extra hearts on the Small Medical Kit!\n[Does not stack]");
			// Large Med kit
			LargeMedHealStack = lazyInt(builder, "Teir 4 Meical Item Stacksize", 16, 1, 64,
					"Sets the Stacksize of the Large Medical Kit!");
			LargeMedDuration = lazyInt(builder, "Teir 4 Meical Item Use Duration", 16, 1, 64,
					"Sets how long it takes the player to apply the Large Medical Kit!");
			largeMedBoostTime = lazyInt(builder, "Teir 4 Meical Item Boost Time", 60, 0, 300,
					"Sets how long the player has 6 extra hearts on the Large Medical Kit!\n[Does not stack]");
			builder.pop();

			builder.comment("Fun Stuff\n[Not PicKappa stop asking!]").push("Kappa Pick");
			kappa_level = lazyInt(builder, "Kappa Pick Mining Level", 1, 0, 3, "Mining Level.");
			kappa_damage = lazyInt(builder, "Kappa Pick Mining Level Durability", 31513, 100, Integer.MAX_VALUE,
					"Durability Level.");
			builder.pop();

			builder.comment("Because Pineapple goes on Pizza! Kappa").push("Pizza");
			bams_pizza_amount = lazyInt(builder, "Bams Pizza Heal Amount", 10, 1, 20, "Sets the Heal Amount.");
			bams_pizza_sat = lazyDouble(builder, "Bams Pizza Saturation Amount", 1.0D, 0.0D, 1.0D,
					"Sets the Saturation Amount.");
			builder.pop();

			builder.comment("SUCC THE PEARLS").push("Succ Juice");
			succ_juice_bottle = lazyBool(builder, "Pearl Juice Recipe", false,
					"Enable Pearl Juice require a bottle in recipe?");
			builder.pop();

			builder.comment("A Funny Thing").push("Sea Axe");
			sea_axe = lazyBool(builder, "Sea Axe - Axe", true,
					"Enable Sea Axe as a Axe?\n[Axe has 11 attack damage!]\n[Only ENABLE if Sea Axe - Pickaxe is DISABLED!]\n[Sea Axe must be ENABLED for this config to work!]");
			sea_pickaxe = lazyBool(builder, "Sea Axe - Pickaxe", false,
					"Enable Sea Axe as a Pickaxe?\n[Pickaxe has 10 attack damage!]\n[Only ENABLE if Sea Axe - Axe is DISABLED!]\n[Sea Axe must be ENABLED for this config to work!]");
			builder.pop();
			
			
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
			 
			 builder.comment("Waterstone!").push("Water Source Block Stones");	
			 water_block_frequency = lazyInt(builder,"Waterstone Gen Frequency", 5, 1, 100, "Sets the Chance of Waterstone generating.");
			 water_block_min = lazyInt(builder,"Waterstone Gen Min", 32, 1, 255, "Sets the min Y level.");
			 water_block_max = lazyInt(builder,"Waterstone Gen Max", 48, 1, 255, "Sets the max Y level.");
			 water_block_size = lazyInt(builder,"Waterstone Gen Size", 4, 1, 100, "Sets the Waterstone Vein Size.");
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

			ConfigHandler.succ_juice_bottle = succ_juice_bottle.get();

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

		}
	}

	public static class ConfigClient {
		// public final IntValue mineMode;
		// public final BooleanValue mustHold;
		// public final BooleanValue useSideHit;

		private ConfigClient(ForgeConfigSpec.Builder builder) {
			builder.push("client");

			// mineMode = lazyInt(builder, "Mode", 0, -1, 2, "Excavation mode (-1 Disabled,
			// 0 = Keybind, 1 = Sneak, 2 = Always)");
			// mustHold = lazyBool(builder, "Must Hold", true, "Allows players to cancel
			// excavation by releasing the keys");
			// useSideHit = lazyBool(builder, "Use Side Hit", true, "Use the side of the
			// block hit to determine shape mining direction");
			//
			builder.pop();
		}

		private void apply() {
			// ExcavationSettings.mineMode = mineMode.get();
			// ExcavationSettings.mustHold = mustHold.get();
			// ExcavationSettings.useSideHit = useSideHit.get();
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

	//
	// public static void initOres()
	// {
	//
	// File f = new File(configDir, "Ores.cfg");
	// config = new Configuration(f, configVersion);
	//
	// config.load();
	//
	//
	// config.addCustomCategoryComment("Ender Ore", "Might as well add this");
	// ConfigHandler.ender_ore = config.getBoolean("Ender Ore", "Ender Ore", true,
	// "Enable Ender Ore?");
	// ConfigHandler.ender_mite = config.getBoolean("Endermite", "Ender Ore", true,
	// "Enable Endermite spawn?");
	// ConfigHandler.endermite_spawn = config.getInt("Endermite Spawn", "Ender Ore",
	// 25, 0, 100, "Sets the Chance of Endermites to spawn when Ore is mined.");
	// ConfigHandler.ender_ore_frequency = config.getInt("Ender Ore Frequency",
	// "Ender Ore", 5, 1, 100, "Sets the Chance of Ender ore generating.");
	// ConfigHandler.ender_ore_min = config.getInt("Ender Ore Min", "Ender Ore", 1,
	// 1, 255, "Sets the min Y level.");
	// ConfigHandler.ender_ore_max = config.getInt("Ender Ore Max", "Ender Ore", 32,
	// 1, 255, "Sets the max Y level.");
	// ConfigHandler.ender_ore_size = config.getInt("Ender Ore Size", "Ender Ore",
	// 4, 1, 100, "Sets the Ender Ore Vein Size.");
	//
	// config.addCustomCategoryComment("Charcoal", "It's the little things that
	// count right?\n[Charcoal Block must be ENABLED in Main.cfg]");
	// ConfigHandler.CharcoalWorldgen = config.getBoolean("Charcoal Block Nether
	// Worldgen", "Charcoal", true, "Enable the Charcoal Block to spawn in the
	// nether?");
	// ConfigHandler.charcoal_frequency = config.getInt("Charcoal Block Nether
	// Worldgen Frequency", "Charcoal", 10, 1, 100, "Sets the Chance of Charcoal
	// Block.");
	// ConfigHandler.charcoal_min = config.getInt("Charcoal Block Nether Worldgen
	// Min", "Charcoal", 1, 1, 255, "Sets the min Y level.");
	// ConfigHandler.charcoal_max = config.getInt("Charcoal Block Nether Worldgen
	// Max", "Charcoal", 128, 1, 255, "Sets the max Y level.");
	// ConfigHandler.charcoal_size = config.getInt("Charcoal Block Nether Worldgen
	// Size", "Charcoal", 10, 1, 100, "Sets the Charcoal Vein Size.");
	//
	// config.addCustomCategoryComment("WUB Juice Overworld Ore", "[Requires WUB
	// Juice to be ENABLED in the Supporters.cfg]");
	// ConfigHandler.overworld_wub = config.getBoolean("Overworld Wub Ore", "WUB
	// Juice Overworld Ore", true, "Enable Overworld Wub Ore?");
	// ConfigHandler.wub_block_count = config.getInt("Overworld Wub Ore Gen Size",
	// "WUB Juice Overworld Ore", 5, 1, 100, "Sets the Overworld Wub Ore Vein
	// Size.");
	// ConfigHandler.wub_block_frequency = config.getInt("Overworld Wub Ore Gen
	// Chance", "WUB Juice Overworld Ore", 50, 1, 100, "Sets the Chance of Overworld
	// Wub Ore generating.");
	// ConfigHandler.wub_block_min = config.getInt("Overworld Wub Ore Gen Min", "WUB
	// Juice Overworld Ore", 1, 1, 255, "Sets the Overworld min Y level.");
	// ConfigHandler.wub_block_max = config.getInt("Overworld Wub Ore Gen Max", "WUB
	// Juice Overworld Ore", 255, 1, 255, "Sets the Overworld max Y level.");
	//
	// config.addCustomCategoryComment("WUB Juice Nether Ore", "[Requires WUB Juice
	// to be ENABLED in the Supporters.cfg]");
	// ConfigHandler.nether_wub = config.getBoolean("Nether Wub Ore", "WUB Juice
	// Nether Ore", true, "Enable Nether Wub Ore?");
	// ConfigHandler.nether_wub_block_count = config.getInt("Nether Wub Ore Gen
	// Size", "WUB Juice Nether Ore", 5, 1, 100, "Sets the Nether Wub Ore Vein
	// Size.");
	// ConfigHandler.nether_wub_block_frequency = config.getInt("Nether Wub Ore Gen
	// Chance", "WUB Juice Nether Ore", 50, 1, 100, "Sets the Chance of Nether Wub
	// Ore generating.");
	// ConfigHandler.nether_wub_block_min = config.getInt("Nether Wub Ore Gen Min",
	// "WUB Juice Nether Ore", 1, 1, 120, "Sets the Nether min Y level.");
	// ConfigHandler.nether_wub_block_max = config.getInt("Nether Wub Ore Gen Max",
	// "WUB Juice Nether Ore", 120, 1, 120, "Sets the Nether max Y level.");
	//
	// if (config.hasChanged())
	// config.save();
	// }
	//
	// public static void initExtra()
	// {
	//
	// File f = new File(configDir, "Extras.cfg");
	// config = new Configuration(f, configVersion);
	//
	// config.load();
	//
	// config.addCustomCategoryComment("Dirt Drops", "Extra Drops");
	// ConfigHandler.BoneDrops = config.getBoolean("Bone Drops", "Dirt Drops", true,
	// "Enable Bones to drop from Dirt?");
	// ConfigHandler.BoneDropsChance = config.getInt("Bone Drop Chance", "Dirt
	// Drops", 1, 0, 100, "Sets the Chance of Bones from Dirt.");
	// ConfigHandler.BoneAmount = config.getInt("Bone Drop Amount", "Dirt Drops", 1,
	// 1, 64, "Sets the Amount of Bones Dropped from Dirt.");
	// ConfigHandler.SkullDrops = config.getBoolean("Skull Drops", "Dirt Drops",
	// true, "Enable Skulls to drop from Dirt?");
	// ConfigHandler.SkullDropsChance = config.getInt("Skull Drop Chance", "Dirt
	// Drops", 1, 0, 100, "Sets the Chance of Skulls from Dirt.");
	// ConfigHandler.SkullAmount = config.getInt("Skull Drop Amount", "Dirt Drops",
	// 1, 1, 64, "Sets the Amount of Skulls Dropped from Dirt.");
	//
	// config.addCustomCategoryComment("Bricks", "Because People Love Bricks");
	// ConfigHandler.AndesiteBrick = config.getBoolean("Andesite Bricks", "Bricks",
	// false, "Enable Andesite Bricks?");
	// ConfigHandler.DioriteBrick = config.getBoolean("Diorite Bricks", "Bricks",
	// false, "Enable Diorite Bricks?");
	// ConfigHandler.GraniteBrick = config.getBoolean("Granite Bricks", "Bricks",
	// false, "Enable Granite Bricks?");
	//
	// config.addCustomCategoryComment("Tiny Coal & Charcoal", "tiny things.");
	// ConfigHandler.tiny_charcoal = config.getBoolean("Tiny Charcoal", "Tiny Coal &
	// Charcoal", true, "Enable Tiny Charcoal?");
	// FuelHandler.tiny_charcoal_burntime = config.getInt("Tiny Charcoal Burn Time",
	// "Tiny Coal & Charcoal", 200, 0, Integer.MAX_VALUE, "Sets the burn time for
	// Tiny Charcoal.");
	// ConfigHandler.tiny_coal = config.getBoolean("Tiny Coal", "Tiny Coal &
	// Charcoal", true, "Enable Tiny Coal?");
	// FuelHandler.tiny_coal_burntime = config.getInt("Tiny Coal Burn Time", "Tiny
	// Coal & Charcoal", 200, 0, Integer.MAX_VALUE, "Sets the burn time for Tiny
	// Coal.");
	//
	// config.addCustomCategoryComment("Steel", "Used to craft the Infinity
	// Bucket.\n[Uses oredict and works with other mods]");
	// ConfigHandler.steel_ingot = config.getBoolean("Steel Ingots", "Steel", true,
	// "Enable Steel Ingots?");
	//
	// config.addCustomCategoryComment("Rib", "Used for Crafting!\n[DO NOT ENABLE if
	// Wither Armor is ENABLED.]");
	// ConfigHandler.wither_rib = config.getBoolean("Wither Rib", "Rib", false,
	// "Enable Wither Rib?");
	//
	// config.addCustomCategoryComment("Seeds", "Things to plant?");
	// ConfigHandler.MyceliumSeeds = config.getBoolean("Mycelium Seeds", "Seeds",
	// true, "Enable Mycelium Seeds?");
	//
	// config.addCustomCategoryComment("Torch", "I'll light the way!\n[Do not ENABLE
	// if Tinkers is installed.]");
	// ConfigHandler.StoneTorch = config.getBoolean("Stone Torch", "Torch", false,
	// "Enable Stone Torch?");
	//
	// config.addCustomCategoryComment("Flint", "A little extra flint can help,
	// right?\n[Do not ENABLE is Tinkers is installed.]");
	// ConfigHandler.FlintRecipe = config.getBoolean("Flint Recipe", "Flint", false,
	// "Enable 3 Gravel into Flint Recipe?");
	//
	// config.addCustomCategoryComment("Harder Stone", "It's the little things that
	// count right?\n[Required for Recipes in this mod.]");
	// ConfigHandler.hardened_stone = config.getBoolean("Hardened Stone", "Harder
	// Stone", true, "Enable Hardened Stone?");
	//
	// config.addCustomCategoryComment("Sugar", "even the dead stuff can help!\n[Can
	// be used as FOOD for a small amount as well.]");
	// ConfigHandler.old_reed = config.getBoolean("Dead Sugar Cane", "Sugar", true,
	// "Enable Dead Sugar Cane?");
	//
	// config.addCustomCategoryComment("Pouch", "More storage anyone?");
	// ConfigHandler.pouch = config.getBoolean("Pouch", "Pouch", true, "Enable
	// Pouch?");
	//
	// config.addCustomCategoryComment("Repair Tablet", "Need some extra durability,
	// eh?\n[Repairs Items in Players Inventory only.]");
	// ConfigHandler.repair_tablet = config.getBoolean("Repair Tablet", "Repair
	// Tablet", true, "Enable Repair Tablet?");
	// ConfigHandler.repair_tablet_cooldown = config.getInt("Repair Tablet
	// Cooldown", "Repair Tablet", 20, 1, Integer.MAX_VALUE, "Cooldown (in ticks)
	// between repair processes.");
	//
	// config.addCustomCategoryComment("Infinity", "Unlimited Water!\n[Requires
	// Steel to be enabled.]");
	// ConfigHandler.infin_bucket = config.getBoolean("Infinity Water Bucket",
	// "Infinity", true, "Enable Infinity Water Bucket?");
	//
	// config.addCustomCategoryComment("Extra Tree Drops", "Extra Drops");
	// ConfigHandler.extra_drops = config.getBoolean("Extra Fruit Drops", "Extra
	// Tree Drops", true, "Enable Pears and Peaches to drop from leaves?");
	// ConfigHandler.extra_drop_bottle = config.getBoolean("Extra Fruit Drops need
	// bottle to make juice", "Extra Tree Drops", false, "Enable Bottle in
	// recipe?");
	// ConfigHandler.pearDropsChance = config.getInt("Extra Fruit Drops Pear
	// Chance", "Extra Tree Drops", 1, 0, 100, "Sets the Chance of Pears from
	// leaves.");
	// ConfigHandler.pearDropsAmount = config.getInt("Extra Fruit Drops Pear
	// Amount", "Extra Tree Drops", 1, 1, 64, "Sets the Amount of Pears Dropped from
	// leaves.");
	// ConfigHandler.peachDropsChance = config.getInt("Extra Fruit Drops Peach
	// Chance", "Extra Tree Drops", 1, 0, 100, "Sets the Chance of Peaches from
	// leaves.");
	// ConfigHandler.peachDropsAmount = config.getInt("Extra Fruit Drops Peach
	// Amount", "Extra Tree Drops", 1, 1, 64, "Sets the Amount of Peaches Dropped
	// from leaves.");
	// ConfigHandler.peachAmount = config.getInt("Extra Fruit Drops Peach Juice Heal
	// Amount", "Extra Tree Drops", 4, 1, 20, "Sets the Heal Amount of Peach
	// Juice.");
	// ConfigHandler.peachSaturation = config.getFloat("Extra Fruit Drops Peach
	// Juice Saturation Amount", "Extra Tree Drops", 0.3F, 0.0F, 1.0F, "Sets the
	// Saturation Amount of Peach Juice.");
	// ConfigHandler.pearAmount = config.getInt("Extra Fruit Drops Pear Juice Heal
	// Amount", "Extra Tree Drops", 4, 1, 20, "Sets the Heal Amount of Pear
	// Juice.");
	// ConfigHandler.pearSaturation = config.getFloat("Extra Fruit Drops Pear Juice
	// Saturation Amount", "Extra Tree Drops", 0.3F, 0.0F, 1.0F, "Sets the
	// Saturation Amount of Pear Juice.");
	//
	// config.addCustomCategoryComment("Extra Tree Drops Vanilla", "Extra Drops
	// Vanilla");
	// ConfigHandler.extra_drops_vanilla = config.getBoolean("Extra Tree Drops
	// Vanilla", "Extra Tree Drops Vanilla", true, "Enable Extra Sticks and Apples
	// to drop from leaves?");
	// ConfigHandler.stickDropsChance = config.getInt("Extra Tree Drops Stick
	// Chance", "Extra Tree Drops Vanilla", 1, 0, 100, "Sets the Chance of Sticks
	// from leaves.");
	// ConfigHandler.stickDropsAmount = config.getInt("Extra Tree Drops Stick
	// Amount", "Extra Tree Drops Vanilla", 1, 1, 64, "Sets the Amount of Sticks
	// Dropped from leaves.");
	// ConfigHandler.appleDropsChance = config.getInt("Extra Tree Drops Apple
	// Chance", "Extra Tree Drops Vanilla", 1, 0, 100, "Sets the Chance of Apple
	// from leaves.");
	// ConfigHandler.appleDropsAmount = config.getInt("Extra Tree Drops Apple
	// Amount", "Extra Tree Drops Vanilla", 1, 1, 64, "Sets the Amount of Apple
	// Dropped from leaves.");
	//
	// config.addCustomCategoryComment("Extra Shears", "Because people love more
	// shears!");
	// ConfigHandler.wooden_shears = config.getBoolean("Wooden Shears", "Extra
	// Shears", true, "Enable Wooden Shears?");
	// ConfigHandler.golden_shears = config.getBoolean("Golden Shears", "Extra
	// Shears", true, "Enable Golden Shears?");
	// ConfigHandler.diamond_shears = config.getBoolean("Diamond Shears", "Extra
	// Shears", true, "Enable Diamond Shears?");
	// ConfigHandler.emerald_shears = config.getBoolean("Emerald Shears", "Extra
	// Shears", true, "Enable Emerald Shears?");
	// ConfigHandler.flint_shears = config.getBoolean("Flint Shears", "Extra
	// Shears", true, "Enable Flint Shears?");
	// ConfigHandler.stone_shears = config.getBoolean("Stone Shears", "Extra
	// Shears", true, "Enable Stone Shears?");
	//
	//
	// if (config.hasChanged())
	// config.save();
	// }
	//
	// public static void initArmor()
	// {
	//
	// File f = new File(configDir, "Armor.cfg");
	// config = new Configuration(f, configVersion);
	//
	// config.load();
	//
	// config.addCustomCategoryComment("Armor", "Why not");
	// ArmorHandler.StoneArmor = config.getBoolean("Stone Armor", "Armor", true,
	// "Enable Stone Armor?");
	// ArmorHandler.FlintArmor = config.getBoolean("Flint Armor", "Armor", true,
	// "Enable Flint Armor?");
	// ArmorHandler.BoneArmor = config.getBoolean("Bone Armor", "Armor", true,
	// "Enable Bone Armor?");
	// ArmorHandler.WoodArmor = config.getBoolean("Wooden Armor", "Armor", true,
	// "Enable Wooden Armor?");
	// ArmorHandler.emerald_amor = config.getBoolean("Emerald Armor", "Armor", true,
	// "Enable Emerald Armor?");
	// ArmorHandler.chain_armor = config.getBoolean("Chain Armor", "Armor", true,
	// "Enable Chain Armor Recipe?");
	// ArmorHandler.lava_armor = config.getBoolean("Lava Armor", "Armor", true,
	// "Enable Lava Armor?");
	// ArmorHandler.dragon_armor = config.getBoolean("Dragon Armor", "Armor", true,
	// "Enable Dragon Armor?");
	// ArmorHandler.wither_armor = config.getBoolean("Wither Armor", "Armor", true,
	// "Enable Wither Armor?");
	// ArmorHandler.lapis_armor = config.getBoolean("Lapis Armor", "Armor", true,
	// "Enable Lapis Armor?");
	// ArmorHandler.obsidian_armor = config.getBoolean("Obsidian Armor", "Armor",
	// true, "Enable Obsidian Armor?");
	// ArmorHandler.quartz_armor = config.getBoolean("Quartz Armor", "Armor", true,
	// "Enable Quartz Armor?");
	// ArmorHandler.redstone_armor = config.getBoolean("Redstone Armor", "Armor",
	// true, "Enable Redstone Armor?");
	//
	// config.addCustomCategoryComment("Lava Armor", "What Armor?\n[Needs Emerald
	// armor to be enabled]");
	// ArmorHandler.lava_armor_resistance = config.getBoolean("Lava Armor
	// Resistance", "Lava Armor", true, "Enable Lava Armor Resistance?");
	// ArmorHandler.lava_armor_resistance_lvl = config.getInt("Lava Armor Resistance
	// Level", "Lava Armor", 0, 0, 10, "Resistance Level.");
	// ArmorHandler.lava_armor_fire = config.getBoolean("Lava Armor Fire
	// Resistance", "Lava Armor", true, "Enable Lava Armor Fire Resistance?");
	// ArmorHandler.lava_armor_fire_lvl = config.getInt("Lava Armor Fire Resistance
	// Level", "Lava Armor", 0, 0, 10, "Fire Resistance Level.");
	//
	// config.addCustomCategoryComment("Dragon Armor", "End Game Armor");
	// ArmorHandler.dragon_fly = config.getBoolean("Dragon Armor Allow Flight",
	// "Dragon Armor", true, "Enable Dragon Armor Flight?");
	// ArmorHandler.dragon_resistance = config.getBoolean("Dragon Armor Resistance",
	// "Dragon Armor", true, "Enable Dragon Armor Resistance?");
	// ArmorHandler.dragon_resistance_lvl = config.getInt("Dragon Armor Resistance
	// Level", "Dragon Armor", 1, 0, 10, "Resistance Level.");
	// ArmorHandler.dragon_fire = config.getBoolean("Dragon Armor Fire Resistance",
	// "Dragon Armor", true, "Enable Dragon Armor Fire Resistance?");
	// ArmorHandler.dragon_fire_lvl = config.getInt("Dragon Armor Fire Resistance
	// Level", "Dragon Armor", 1, 0, 10, "Fire Resistance Level.");
	// ArmorHandler.dragon_strength = config.getBoolean("Dragon Armor Strength",
	// "Dragon Armor", true, "Enable Dragon Armor Strength?");
	// ArmorHandler.dragon_strength_lvl = config.getInt("Dragon Armor Strength
	// Level", "Dragon Armor", 1, 0, 10, "Strength Level.");
	//
	// config.addCustomCategoryComment("Wither Armor", "Mid Game Armor");
	// ArmorHandler.wither_resistance = config.getBoolean("Wither Armor Resistance",
	// "Wither Armor", true, "Enable Wither Armor Resistance?");
	// ArmorHandler.wither_resistance_lvl = config.getInt("Wither Armor Resistance
	// Level", "Wither Armor", 0, 0, 10, "Resistance Level.");
	// ArmorHandler.wither_fire = config.getBoolean("Wither Armor Fire Resistance",
	// "Wither Armor", true, "Enable Wither Armor Fire Resistance?");
	// ArmorHandler.wither_fire_lvl = config.getInt("Wither Armor Fire Resistance
	// Level", "Wither Armor", 0, 0, 10, "Fire Resistance Level.");
	// ArmorHandler.wither_strength = config.getBoolean("Wither Armor Strength",
	// "Wither Armor", true, "Enable Wither Armor Strength?");
	// ArmorHandler.wither_strength_lvl = config.getInt("Wither Armor Strength
	// Level", "Wither Armor", 0, 0, 10, "Strength Level.");
	//
	// config.addCustomCategoryComment("Lapis Armor", "Lets go under the water");
	// ArmorHandler.lapis_armor_water = config.getBoolean("Lapis Armor Water
	// Breathing", "Lapis Armor", true, "Enable Lapis Water Breathing?");
	// ArmorHandler.lapis_armor_water_lvl = config.getInt("Lapis Armor Water
	// Breathing Level", "Lapis Armor", 0, 0, 10, "Water Breathing Level.");
	//
	// config.addCustomCategoryComment("Obsidian Armor", "What?");
	// ArmorHandler.obsidian_armor_resistance = config.getBoolean("Obsidian Armor
	// Resistance", "Obsidian Armor", true, "Enable Obsidian Resistance?");
	// ArmorHandler.obsidian_armor_resistance_lvl = config.getInt("Obsidian Armor
	// Resistance Level", "Obsidian Armor", 0, 0, 10, "Resistance Level.");
	//
	// config.addCustomCategoryComment("Quartz Armor", "You went where?");
	// ArmorHandler.quartz_armor_strength = config.getBoolean("Quartz Armor
	// Strength", "Quartz Armor", true, "Enable Quartz Strength?");
	// ArmorHandler.quartz_armor_strength_lvl = config.getInt("Quartz Armor Strength
	// Level", "Quartz Armor", 0, 0, 10, "Strength Level.");
	//
	// config.addCustomCategoryComment("Redstone Armor", "How fast you want to
	// go?");
	// ArmorHandler.redstone_armor_speed = config.getBoolean("Redstone Armor Speed",
	// "Redstone Armor", true, "Enable Redstone Speed?");
	// ArmorHandler.redstone_armor_speed_lvl = config.getInt("Redstone Armor Speed
	// Level", "Redstone Armor", 0, 0, 10, "Speed Level.");
	//
	// if (config.hasChanged())
	// config.save();
	// }
	//
	// public static void initToolsWeapons()
	// {
	//
	// File f = new File(configDir, "Tools & Weapons.cfg");
	// config = new Configuration(f, configVersion);
	//
	// config.load();
	//
	// config.addCustomCategoryComment("Flint and Bone Tools & Weapons", "Cause
	// Progression!");
	// ConfigHandler.BoneTools = config.getBoolean("Bone Tools & Weapons", "Flint
	// and Bone Tools & Weapons", true, "Enable Bone Tools & Weapons?");
	// ConfigHandler.FlintTools = config.getBoolean("Flint Tools & Weapons", "Flint
	// and Bone Tools & Weapons", true, "Enable Flint Tools & Weapons?");
	//
	// config.addCustomCategoryComment("Scythes", "Because I love to farm and
	// stuff!\n[WIP - Enable at your own risk.]\n[Known bug - May Dupe Drops with
	// some modded crops]");
	// ConfigHandler.wooden_scythe = config.getBoolean("Wooden Scythe", "Scythes",
	// false, "Enable Wooden Scythe?");
	// ConfigHandler.stone_scythe = config.getBoolean("Stone Scythe", "Scythes",
	// false, "Enable Stone Scythe?");
	// ConfigHandler.golden_scythe = config.getBoolean("Golden Scythe", "Scythes",
	// false, "Enable Golden Scythe?");
	// ConfigHandler.iron_scythe = config.getBoolean("Iron Scythe", "Scythes",
	// false, "Enable Iron Scythe?");
	// ConfigHandler.diamond_scythe = config.getBoolean("Diamond Scythe", "Scythes",
	// false, "Enable Diamond Scythe?");
	// ConfigHandler.emerald_scythe = config.getBoolean("Emerald Scythe", "Scythes",
	// false, "Enable Emerald Scythe?");
	// ConfigHandler.obsidian_scythe = config.getBoolean("Obsidian Scythe",
	// "Scythes", false, "Enable Obsidian Scythe?");
	//
	// config.addCustomCategoryComment("Paxels", "Because I love weird
	// stuff!\n[Requires Other Items in this mod.]");
	// ConfigHandler.wooden_multi = config.getBoolean("Wooden Paxel", "Paxels",
	// true, "Enable Wooden Paxel?");
	// ConfigHandler.stone_multi = config.getBoolean("Stone Paxel", "Paxels", true,
	// "Enable Stone Paxel?");
	// ConfigHandler.golden_multi = config.getBoolean("Golden Paxel", "Paxels",
	// true, "Enable Golden Paxel?");
	// ConfigHandler.iron_multi = config.getBoolean("Iron Paxel", "Paxels", true,
	// "Enable Iron Paxel?");
	// ConfigHandler.diamond_multi = config.getBoolean("Diamond Paxel", "Paxels",
	// true, "Enable Diamond Paxel?");
	// ConfigHandler.emerald_multi = config.getBoolean("Emerald Paxel", "Paxels",
	// true, "Enable Emerald Paxel?");
	// ConfigHandler.obsidian_multi = config.getBoolean("Obsidian Paxel", "Paxels",
	// true, "Enable Obsidian Paxel?");
	// ConfigHandler.flint_multi = config.getBoolean("Flint Paxel", "Paxels", true,
	// "Enable Flint Paxel?");
	//
	// config.addCustomCategoryComment("Spears", "Don't mess with the long arm of
	// the LAW!");
	// ConfigHandler.spear_reach = config.getInt("A Spears Extended Reach",
	// "Spears", 7, 5, 10, "Sets the Reach of a Spear.\n[Vanilla is 5 blocks!]");
	// ConfigHandler.wooden_spear = config.getBoolean("Wooden Spear", "Spears",
	// true, "Enable Wooden Spear?");
	// ConfigHandler.stone_spear = config.getBoolean("Stone Spear", "Spears", true,
	// "Enable Stone Spear?");
	// ConfigHandler.golden_spear = config.getBoolean("Golden Spear", "Spears",
	// true, "Enable Golden Spear?");
	// ConfigHandler.iron_spear = config.getBoolean("Iron Spear", "Spears", true,
	// "Enable Iron Spear?");
	// ConfigHandler.diamond_spear = config.getBoolean("Diamond Spear", "Spears",
	// true, "Enable Diamond Spear?");
	// ConfigHandler.emerald_spear = config.getBoolean("Emerald Spear", "Spears",
	// true, "Enable Emerald Spear?");
	// ConfigHandler.obsidian_spear = config.getBoolean("Obsidian Spear", "Spears",
	// true, "Enable Obsidian Spear?");
	//
	// config.addCustomCategoryComment("BattleAxes", "Because BIG AXES are better
	// for Battles!");
	// ConfigHandler.wooden_battle = config.getBoolean("Wooden BattleAxe",
	// "BattleAxes", true, "Enable Wooden BattleAxe?");
	// ConfigHandler.stone_battle = config.getBoolean("Stone BattleAxe",
	// "BattleAxes", true, "Enable Stone BattleAxe?");
	// ConfigHandler.golden_battle = config.getBoolean("Golden BattleAxe",
	// "BattleAxes", true, "Enable Golden BattleAxe?");
	// ConfigHandler.iron_battle = config.getBoolean("Iron BattleAxe", "BattleAxes",
	// true, "Enable Iron BattleAxe?");
	// ConfigHandler.diamond_battle = config.getBoolean("Diamond BattleAxe",
	// "BattleAxes", true, "Enable Diamond BattleAxe?");
	// ConfigHandler.emerald_battle = config.getBoolean("Emerald BattleAxe",
	// "BattleAxes", true, "Enable Emerald BattleAxe?");
	// ConfigHandler.obsidian_battle = config.getBoolean("Obsidian BattleAxe",
	// "BattleAxes", true, "Enable Obsidian BattleAxe?");
	//
	// config.addCustomCategoryComment("Obsidian", "More uses for
	// Obsidian!\n[Required for Other Items in this mod.]");
	// ConfigHandler.obsidian_axe = config.getBoolean("Obsidian Axe", "Obsidian",
	// true, "Enable Obsidian Axe?");
	// ConfigHandler.obsidian_pickaxe = config.getBoolean("Obsidian Pickaxe",
	// "Obsidian", true, "Enable Obsidian Pickaxe?");
	// ConfigHandler.obsidian_hoe = config.getBoolean("Obsidian Hoe", "Obsidian",
	// true, "Enable Obsidian Hoe?");
	// ConfigHandler.obsidian_spade = config.getBoolean("Obsidian Shovel",
	// "Obsidian", true, "Enable Obsidian Shovel?");
	// ConfigHandler.obsidian_sword = config.getBoolean("Obsidian Sword",
	// "Obsidian", true, "Enable Obsidian Sword?");
	//
	// config.addCustomCategoryComment("Emerald", "More uses for
	// Emeralds!\n[Required for Other Items in this mod.]");
	// ConfigHandler.emerald_axe = config.getBoolean("Emerald Axe", "Emerald", true,
	// "Enable Emerald Axe?");
	// ConfigHandler.emerald_pickaxe = config.getBoolean("Emerald Pickaxe",
	// "Emerald", true, "Enable Emerald Pickaxe?");
	// ConfigHandler.emerald_hoe = config.getBoolean("Emerald Hoe", "Emerald", true,
	// "Enable Emerald Hoe?");
	// ConfigHandler.emerald_spade = config.getBoolean("Emerald Shovel", "Emerald",
	// true, "Enable Emerald Shovel?");
	// ConfigHandler.emerald_sword = config.getBoolean("Emerald Sword", "Emerald",
	// true, "Enable Emerald Sword?");
	//
	// if (config.hasChanged())
	// config.save();
	// }
	//
	// public static void initFood()
	// {
	//
	// File f = new File(configDir, "Food & Drinks.cfg");
	// config = new Configuration(f, configVersion);
	//
	// config.load();
	//
	// config.addCustomCategoryComment("Apples", "Just Because");
	// ConfigHandler.EmeraldApple = config.getBoolean("Emerald Apple", "Apples",
	// true, "Enable Emerald Apple?");
	// ConfigHandler.NotchApple = config.getBoolean("Notch Apple", "Apples", true,
	// "Bring back the Notch Apple Recipe?\n[Only Enable if you have Golden Apple
	// Progression DISABLED.]");
	// ConfigHandler.DiamondApple = config.getBoolean("Diamond Apple", "Apples",
	// true, "Enable Diamond Apple?");
	// ConfigHandler.iron_apple = config.getBoolean("Iron Apple", "Apples", true,
	// "Enable Iron Apple?");
	// ConfigHandler.redstone_apple = config.getBoolean("Redstone Apple", "Apples",
	// true, "Enable Redstone Apple?");
	// ConfigHandler.ApplePro = config.getBoolean("Golden Apple Progression",
	// "Apples", false, "Enable Golden Apple Progression?\n[Only Enable if you have
	// Notch Apple DISABLED.]");
	//
	// config.addCustomCategoryComment("Juice", "Everyone loves juice!\n[Only ENABLE
	// one or the other.]");
	// ConfigHandler.all_juices = config.getBoolean("Vanilla Juice W/O Bottles",
	// "Juice", true, "Enable Juice W/O bottles in the recipe?");
	// ConfigHandler.JuiceBottles = config.getBoolean("Vanilla Juice With Bottles",
	// "Juice", false, "Enable Juice With bottles in the recipe?");
	//
	// config.addCustomCategoryComment("Juice Stats", "Everyone loves juice
	// Stats!");
	// ConfigHandler.AppleAmount = config.getInt("Apple Juice Heal Amount", "Juice
	// Stats", 4, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.AppleSaturation = config.getFloat("Apple Juice Saturation
	// Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
	// ConfigHandler.CarrotAmount = config.getInt("Carrot Juice Heal Amount", "Juice
	// Stats", 4, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.CarrotSaturation = config.getFloat("Carrot Juice Saturation
	// Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
	// ConfigHandler.PotatoAmount = config.getInt("Potato Juice Heal Amount", "Juice
	// Stats", 4, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.PotatoSaturation = config.getFloat("Potato Juice Saturation
	// Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
	// ConfigHandler.BeetAmount = config.getInt("Beet Juice Heal Amount", "Juice
	// Stats", 4, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.BeetSaturation = config.getFloat("Beet Juice Saturation
	// Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
	// ConfigHandler.CactusAmount = config.getInt("Cactus Juice Heal Amount", "Juice
	// Stats", 4, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.CactusSaturation = config.getFloat("Cactus Juice Saturation
	// Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
	// ConfigHandler.SlimeAmount = config.getInt("Slime Juice Heal Amount", "Juices
	// Stats", 4, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.SlimeSaturation = config.getFloat("Slime Juice Saturation
	// Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
	// ConfigHandler.WheatAmount = config.getInt("Wheat Juice Heal Amount", "Juice
	// Stats", 4, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.WheatSaturation = config.getFloat("Wheat Juice Saturation
	// Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
	// ConfigHandler.MelonAmount = config.getInt("Melon Juice Heal Amount", "Juice
	// Stats", 4, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.MelonSaturation = config.getFloat("Melon Juice Saturation
	// Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
	// ConfigHandler.PumpkinAmount = config.getInt("Pumpkin Juice Heal Amount",
	// "Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.PumpkinSaturation = config.getFloat("Pumpkin Juice Saturation
	// Amount", "Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the Saturation Amount.");
	//
	// config.addCustomCategoryComment("Modded Juice", "Everyone loves Modded
	// juice!\n[Only ENABLE one or the other.]");
	// ConfigHandler.ExtraJuices = config.getBoolean("Extra Juice W/O Bottles",
	// "Modded Juice", true, "Enable Juices W/O bottles in the recipe?");
	// ConfigHandler.ExtraJuicesBottles = config.getBoolean("Extra Juice With
	// Bottles", "Modded Juice", false, "Enable Juice With bottles in the recipe?");
	//
	// config.addCustomCategoryComment("Modded Juice Generation", "Extra Berry
	// Plants!\n[Disable Extra Plant Generation if you want to use Naturas Berries
	// instead!]\n[The higher the value, the more Plants are generated.]");
	// ConfigHandler.ExtraPlantGen = config.getBoolean("Extra Plant Generation",
	// "Modded Juice Generation", true, "Enable Extra Plant Generation?");
	// ConfigHandler.berryPlantRarity = config.getInt("Extra Plant Generation
	// Rarity", "Modded Juice Generation", 5, 1, Integer.MAX_VALUE, "Sets the Rarity
	// of Berry Plants.");
	//
	// config.addCustomCategoryComment("Modded Juice Stats", "Everyone loves Modded
	// juice Stats!");
	// ConfigHandler.BlueberryAmount = config.getInt("Blueberry Juice Heal Amount",
	// "Modded Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.BlueberrySaturation = config.getFloat("Blueberry Juice
	// Saturation Amount", "Modded Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the
	// Saturation Amount.");
	// ConfigHandler.BlackberryAmount = config.getInt("Blackberry Juice Heal
	// Amount", "Modded Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.BlackberrySaturation = config.getFloat("Blackberry Juice
	// Saturation Amount", "Modded Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the
	// Saturation Amount.");
	// ConfigHandler.MaloberryAmount = config.getInt("Maloberry Juice Heal Amount",
	// "Modded Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.MaloberrySaturation = config.getFloat("Maloberry Juice
	// Saturation Amount", "Modded Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the
	// Saturation Amount.");
	// ConfigHandler.RaspberryAmount = config.getInt("Raspberry Juice Heal Amount",
	// "Modded Juice Stats", 4, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.RaspberrySaturation = config.getFloat("Raspberry Juice
	// Saturation Amount", "Modded Juice Stats", 0.3F, 0.0F, 1.0F, "Sets the
	// Saturation Amount.");
	//
	// config.addCustomCategoryComment("Extra Food", "Want more food?");
	// ConfigHandler.CookedBacon = config.getBoolean("Cooked Bacon", "Extra Food",
	// true, "Enable Cooked Bacon?");
	// ConfigHandler.MonsterJerky = config.getBoolean("Monster Jerky", "Extra Food",
	// true, "Enable Monster jerky?");
	// ConfigHandler.ToastedBread = config.getBoolean("Toasted Bread", "Extra Food",
	// true, "Enable Toasted Bread?");
	// ConfigHandler.FriedEgg = config.getBoolean("Fried Egg", "Extra Food", true,
	// "Enable Fried Egg?");
	// ConfigHandler.CookedMushrooms = config.getBoolean("Cooked Mushrooms", "Extra
	// Food", true, "Enable Cooked Mushrooms?");
	// ConfigHandler.BaconEggs = config.getBoolean("Bacon & Eggs", "Extra Food",
	// true, "Enable Bacon & Eggs?");
	// ConfigHandler.LittleCandy = config.getBoolean("Little Candy", "Extra Food",
	// true, "Enable Little Candy?");
	// ConfigHandler.Sandwiches = config.getBoolean("Sandwiches", "Extra Food",
	// true, "Enable Sandwiches?");
	// ConfigHandler.CookedApple = config.getBoolean("Cooked Apple", "Extra Food",
	// true, "Enable Cooked Apple?");
	//
	// config.addCustomCategoryComment("Extra Food Stats", "Want more food
	// Stats?\n[WIP Section]");
	// ConfigHandler.ToastedAmount = config.getInt("Toasted Bread Heal Amount",
	// "Extra Food Stats", 6, 1, 20, "Sets the Heal Amount.");
	// ConfigHandler.ToastedSaturation = config.getFloat("Toasted Bread Saturation
	// Amount", "Extra Food Stats", 0.7F, 0.0F, 1.0F, "Sets the Saturation
	// Amount.");
	//
	// config.addCustomCategoryComment("Food Eat Duration", "How long it takes to
	// eat food.");
	// ConfigHandler.eat_timer = config.getInt("Eat Duration", "Food Eat Duration",
	// 32, 8, Integer.MAX_VALUE, "Sets how long it takes to eat TP food.");
	//
	// if (config.hasChanged())
	// config.save();
	// }
	//
	// public static void initReborn()
	// {
	//
	// File f = new File(configDir, "Reborn.cfg");
	// config = new Configuration(f, configVersion);
	//
	// config.load();
	//
	// config.addCustomCategoryComment("Better Sugar Cane", "Bringing back a oldie
	// but goodie");
	// ConfigHandler.bsc_rod = config.getBoolean("Better Sugar Cane Rod", "Better
	// Sugar Cane", true, "Enable Better Sugar Cane Rod?\n[MUST be ENABLED for all
	// Sugar Cane Tools and Weapons to work!]");
	// // iron
	// ConfigHandler.bsc_iron_tools_weapons = config.getBoolean("Iron Sugar Cane
	// Tools and Weapons", "Better Sugar Cane", true, "Enable Iron Sugar Cane Tools
	// and Weapons?\n[Better Sugar Cane Rod MUST be ENABLED!]");
	// // gold
	// ConfigHandler.bsc_gold_tools_weapons = config.getBoolean("Gold Sugar Cane
	// Tools and Weapons", "Better Sugar Cane", true, "Enable Gold Sugar Cane Tools
	// and Weapons?\n[Better Sugar Cane Rod MUST be ENABLED!]");
	// // diamond
	// ConfigHandler.bsc_diamond_tools_weapons = config.getBoolean("Diamond Sugar
	// Cane Tools and Weapons", "Better Sugar Cane", true, "Enable Sugar Cane Tools
	// and Weapons?\n[Better Sugar Cane Rod MUST be ENABLED!]");
	// // cookie
	// ConfigHandler.bsc_sugar_cookie = config.getBoolean("Sugar Cookie", "Better
	// Sugar Cane", true, "Enable Sugar Cookie?");
	// // sugar blocks
	// ConfigHandler.bsc_sugar_compressed_blocks = config.getBoolean("Compressed
	// Sugar", "Better Sugar Cane", true, "Enable Compressed Sugar?");
	// // sugarcane blocks
	// ConfigHandler.bsc_sugarcane_compressed_blocks = config.getBoolean("Compressed
	// Sugar Cane", "Better Sugar Cane", true, "Enable Compressed Sugar Cane?");
	//
	// config.addCustomCategoryComment("Better Nether", "Bringing back a oldie but
	// goodie 2");
	// ConfigHandler.nether_rod = config.getBoolean("Better Nether Rod", "Better
	// Nether", true, "Enable Better Nether Rod?\n[MUST be ENABLED for all Nether
	// Tools and Weapons to work!]");
	// // iron
	// ConfigHandler.nether_iron_tools_weapons = config.getBoolean("Iron Netherrack
	// Tools and Weapons", "Better Nether", true, "Enable Iron Netherrack Tools and
	// Weapons?\n[Better Nether Rod MUST be ENABLED!]");
	// // gold
	// ConfigHandler.nether_gold_tools_weapons = config.getBoolean("Gold Netherrack
	// Tools and Weapons", "Better Nether", true, "Enable Gold Netherrack Tools and
	// Weapons?\n[Better Nether Rod MUST be ENABLED!]");
	// // diamond
	// ConfigHandler.nether_diamond_tools_weapons = config.getBoolean("Diamond
	// Netherrack Tools and Weapons", "Better Nether", true, "Enable Diamond
	// Netherrack Tools and Weapons?\n[Better Nether Rod MUST be ENABLED!]");
	// // diamond
	// ConfigHandler.nether_tools_weapons = config.getBoolean("Netherrack Tools and
	// Weapons", "Better Nether", true, "Enable Netherrack Tools and
	// Weapons?\n[Better Nether Rod MUST be ENABLED!]");
	// // sugarcane blocks
	// ConfigHandler.nether_compressed_blocks = config.getBoolean("Compressed
	// Netherrack", "Better Nether", true, "Enable Compressed Netherrack?");
	//
	// if (config.hasChanged())
	// config.save();
	// }
}
