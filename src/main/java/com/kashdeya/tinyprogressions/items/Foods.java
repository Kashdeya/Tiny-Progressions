package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Foods {
		// Apples
		public static Food GOLDEN_APPLE  = (new Food.Builder()).nutrition(4).saturationMod(1F).alwaysEat()
				.effect(() -> new EffectInstance(Effects.DAMAGE_RESISTANCE, 3000, 0), 1F)
				.effect(() -> new EffectInstance(Effects.REGENERATION, 225, 0), 1F)
				.effect(() -> new EffectInstance(Effects.ABSORPTION, 2400, 0), 1F)
				.build();  
		public static Food DIAMOND_APPLE = (new Food.Builder()).nutrition(4).saturationMod(1F).alwaysEat()
				.effect(() -> new EffectInstance(Effects.DAMAGE_RESISTANCE, 1200, 0), 1F)
				.effect(() -> new EffectInstance(Effects.REGENERATION, 300, 0), 1F)
				.effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 300, 0), 1F)
				.effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 1200, 0), 1F)
				.build();  
		public static Food EMERALD_APPLE = (new Food.Builder()).nutrition(4).saturationMod(1F).alwaysEat()
				.effect(() -> new EffectInstance(Effects.ABSORPTION, 300, 0), 1F)
				.effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 300, 0), 1F)
				.effect(() -> new EffectInstance(Effects.SATURATION, 120, 0), 1F)
				.build();  
		public static Food IRON_APPLE    = (new Food.Builder()).nutrition(4).saturationMod(1F).alwaysEat()
				.effect(() -> new EffectInstance(Effects.DAMAGE_RESISTANCE, 300, 2), 1F)
				.build();  
		public static Food REDSTON_APPLE = (new Food.Builder()).nutrition(4).saturationMod(1F).alwaysEat()
				.effect(() -> new EffectInstance(Effects.DIG_SPEED, 300, 0), 1F)
				.build();  
		
		// Juices
		public static Food APPLE_JUICE 	 = (new Food.Builder()).nutrition(ConfigHandler.AppleAmount).saturationMod(ConfigHandler.AppleSaturation).build();  
		public static Food CARROT_JUICE  = (new Food.Builder()).nutrition(ConfigHandler.CarrotAmount).saturationMod(ConfigHandler.CarrotSaturation).build();  
		public static Food POTATOE_JUICE = (new Food.Builder()).nutrition(ConfigHandler.PotatoAmount).saturationMod(ConfigHandler.PotatoSaturation).build();  
		public static Food BEET_JUICE 	 = (new Food.Builder()).nutrition(ConfigHandler.BeetAmount).saturationMod(ConfigHandler.BeetSaturation).build();  
		public static Food CACTUS_JUICE  = (new Food.Builder()).nutrition(ConfigHandler.CactusAmount).saturationMod(ConfigHandler.CactusSaturation).build();  
		public static Food SLIME_JUICE   = (new Food.Builder()).nutrition(ConfigHandler.SlimeAmount).saturationMod(ConfigHandler.SlimeSaturation).build();  
		public static Food WHEAT_JUICE   = (new Food.Builder()).nutrition(ConfigHandler.WheatAmount).saturationMod(ConfigHandler.WheatSaturation).build();  
		public static Food MELON_JUICE   = (new Food.Builder()).nutrition(ConfigHandler.MelonAmount).saturationMod(ConfigHandler.MelonSaturation).build();  
		public static Food PUMPKIN_JUICE = (new Food.Builder()).nutrition(ConfigHandler.PumpkinAmount).saturationMod(ConfigHandler.PumpkinSaturation).build();  
		public static Food PEACH_JUICE   = (new Food.Builder()).nutrition(ConfigHandler.pearAmount).saturationMod(ConfigHandler.peachSaturation).build();  
		public static Food PEAR_JUICE    = (new Food.Builder()).nutrition(ConfigHandler.peachAmount).saturationMod(ConfigHandler.pearSaturation).build();  
		// MISC
		public static Food RAW_BACON             =  (new Food.Builder()).nutrition(1).saturationMod(0.1F).meat().build(); 
		public static Food COOKED_BACON          =  (new Food.Builder()).nutrition(3).saturationMod(0.3F).meat().build(); 
		public static Food MONSTER_JERKEY 		 =  (new Food.Builder()).nutrition(4).saturationMod(0.5F).meat().build(); 
		public static Food TOASTED_BREAD		 =  (new Food.Builder()).nutrition(ConfigHandler.ToastedAmount).saturationMod(ConfigHandler.ToastedSaturation).meat().build(); 
		public static Food FRIED_EGG			 =  (new Food.Builder()).nutrition(4).saturationMod(0.6F).meat().build();
		public static Food COOKED_MUSHROOM_BROWN =  (new Food.Builder()).nutrition(2).saturationMod(0.3F).build();
		public static Food COOKED_MUSHROOM_RED  =  (new Food.Builder()).nutrition(2).saturationMod(0.3F).build();
		public static Food BACON_EGGS            =  (new Food.Builder()).nutrition(2).saturationMod(0.3F).meat().build();
		public static Food LITTLE_CANDYS         =  (new Food.Builder()).nutrition(1).saturationMod(0.6F).build();
		public static Food BACON_SANDWICH       =  (new Food.Builder()).nutrition(6).saturationMod(1F).meat().build();
		public static Food BEEF_SANDWICH         =  (new Food.Builder()).nutrition(10).saturationMod(1F).meat().build();
		public static Food BREAD_SLICE           =  (new Food.Builder()).nutrition(1).saturationMod(0.1F).build();
		public static Food CHICKEN_SANDWICH      =  (new Food.Builder()).nutrition(8).saturationMod(1F).meat().build();
		public static Food COOKED_APPLE          =  (new Food.Builder()).nutrition(8).saturationMod(0.75F).build();
		public static Food RABBIT_SANDWICH       =  (new Food.Builder()).nutrition(8).saturationMod(1F).meat().build();
		public static Food BACON_EGGS_SANDWICH   =  (new Food.Builder()).nutrition(9).saturationMod(1F).meat().build();
		// Extra Juices
		public static Food RASPBERRY_JUICE  = (new Food.Builder()).nutrition(ConfigHandler.RaspberryAmount).saturationMod(ConfigHandler.RaspberrySaturation).build();  
		public static Food BLUEBERRY_JUICE  = (new Food.Builder()).nutrition(ConfigHandler.BlueberryAmount).saturationMod(ConfigHandler.BlueberrySaturation).build();  
		public static Food BLACBERRY_JUICE  = (new Food.Builder()).nutrition(ConfigHandler.BlackberryAmount).saturationMod(ConfigHandler.BlackberrySaturation).build();  
		public static Food MALOBERRY_JUICE  = (new Food.Builder()).nutrition(ConfigHandler.MaloberryAmount).saturationMod(ConfigHandler.MaloberryAmount).build();  
		public static Food RASPBERRY_BEERY  = (new Food.Builder()).nutrition(3).saturationMod(0.15F).build();  
		public static Food BLUEBERRY_BEERY  = (new Food.Builder()).nutrition(3).saturationMod(0.15F).build();  
		public static Food BLACKBEERY_BEERY = (new Food.Builder()).nutrition(3).saturationMod(0.15F).build();  
		public static Food MALOBERRY_BERRY  = (new Food.Builder()).nutrition(3).saturationMod(0.15F).build();  
		// bsc cookie
		public static Food BSC_SUGAR_COOKIE = (new Food.Builder()).nutrition(1).saturationMod(1F).build();  
		// Bams Pizza
		public static Food BAMS_PIZZA  = (new Food.Builder()).nutrition(ConfigHandler.bams_pizza_amount).saturationMod(ConfigHandler.bams_pizza_sat).meat().build();  ;
		// Extra Drops
		public static Food PLUMP_PEAR  = (new Food.Builder()).nutrition(3).saturationMod(0.25F).build();
		public static Food PLUMP_PEACH = (new Food.Builder()).nutrition(3).saturationMod(0.25F).build();
		//Succ The Pearls
		public static Food SUCC_PEARLS = (new Food.Builder()).nutrition(3).saturationMod(0.15F).build();
		
		public static Food DEAD_REEDS = (new Food.Builder()).nutrition(1).saturationMod(0.15F).build();
		
}
