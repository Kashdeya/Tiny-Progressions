package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Foods {
		// Apples
		public static Food GOLDEN_APPLE  = (new Food.Builder()).hunger(4).saturation(1F).setAlwaysEdible()
				.effect(() -> new EffectInstance(Effects.RESISTANCE, 3000, 0), 1F)
				.effect(() -> new EffectInstance(Effects.REGENERATION, 225, 0), 1F)
				.effect(() -> new EffectInstance(Effects.ABSORPTION, 2400, 0), 1F)
				.build();  
		public static Food DIAMOND_APPLE = (new Food.Builder()).hunger(4).saturation(1F).setAlwaysEdible()
				.effect(() -> new EffectInstance(Effects.RESISTANCE, 1200, 0), 1F)
				.effect(() -> new EffectInstance(Effects.REGENERATION, 300, 0), 1F)
				.effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 300, 0), 1F)
				.effect(() -> new EffectInstance(Effects.SPEED, 1200, 0), 1F)
				.build();  
		public static Food EMERALD_APPLE = (new Food.Builder()).hunger(4).saturation(1F).setAlwaysEdible()
				.effect(() -> new EffectInstance(Effects.ABSORPTION, 300, 0), 1F)
				.effect(() -> new EffectInstance(Effects.SPEED, 300, 0), 1F)
				.effect(() -> new EffectInstance(Effects.SATURATION, 120, 0), 1F)
				.build();  
		public static Food IRON_APPLE    = (new Food.Builder()).hunger(4).saturation(1F).setAlwaysEdible()
				.effect(() -> new EffectInstance(Effects.RESISTANCE, 300, 2), 1F)
				.build();  
		public static Food REDSTON_APPLE = (new Food.Builder()).hunger(4).saturation(1F).setAlwaysEdible()
				.effect(() -> new EffectInstance(Effects.HASTE, 300, 0), 1F)
				.build();  
		
		// Juices
		public static Food APPLE_JUICE 	 = (new Food.Builder()).hunger(ConfigHandler.AppleAmount).saturation(ConfigHandler.AppleSaturation).build();  
		public static Food CARROT_JUICE  = (new Food.Builder()).hunger(ConfigHandler.CarrotAmount).saturation(ConfigHandler.CarrotSaturation).build();  
		public static Food POTATOE_JUICE = (new Food.Builder()).hunger(ConfigHandler.PotatoAmount).saturation(ConfigHandler.PotatoSaturation).build();  
		public static Food BEET_JUICE 	 = (new Food.Builder()).hunger(ConfigHandler.BeetAmount).saturation(ConfigHandler.BeetSaturation).build();  
		public static Food CACTUS_JUICE  = (new Food.Builder()).hunger(ConfigHandler.CactusAmount).saturation(ConfigHandler.CactusSaturation).build();  
		public static Food SLIME_JUICE   = (new Food.Builder()).hunger(ConfigHandler.SlimeAmount).saturation(ConfigHandler.SlimeSaturation).build();  
		public static Food WHEAT_JUICE   = (new Food.Builder()).hunger(ConfigHandler.WheatAmount).saturation(ConfigHandler.WheatSaturation).build();  
		public static Food MELON_JUICE   = (new Food.Builder()).hunger(ConfigHandler.MelonAmount).saturation(ConfigHandler.MelonSaturation).build();  
		public static Food PUMPKIN_JUICE = (new Food.Builder()).hunger(ConfigHandler.PumpkinAmount).saturation(ConfigHandler.PumpkinSaturation).build();  
		public static Food PEACH_JUICE   = (new Food.Builder()).hunger(ConfigHandler.pearAmount).saturation(ConfigHandler.pearSaturation).build();  
		public static Food PEAR_JUICE    = (new Food.Builder()).hunger(ConfigHandler.peachAmount).saturation(ConfigHandler.peachSaturation).build();  
		// MISC
		public static Food RAW_BACON             =  (new Food.Builder()).hunger(1).saturation(0.1F).meat().build(); 
		public static Food COOKED_BACON          =  (new Food.Builder()).hunger(3).saturation(0.3F).meat().build(); 
		public static Food MONSTER_JERKEY 		 =  (new Food.Builder()).hunger(4).saturation(0.5F).meat().build(); 
		public static Food TOASTED_BREAD		 =  (new Food.Builder()).hunger(ConfigHandler.ToastedAmount).saturation(ConfigHandler.ToastedSaturation).meat().build(); 
		public static Food FRIED_EGG			 =  (new Food.Builder()).hunger(4).saturation(0.6F).meat().build();
		public static Food COOKED_MUSHROOM_BROWN =  (new Food.Builder()).hunger(2).saturation(0.3F).build();
		public static Food COOKED_MUSHROOM_RED  =  (new Food.Builder()).hunger(2).saturation(0.3F).build();
		public static Food BACON_EGGS            =  (new Food.Builder()).hunger(2).saturation(0.3F).meat().build();
		public static Food LITTLE_CANDYS         =  (new Food.Builder()).hunger(1).saturation(0.6F).build();
		public static Food BACON_SANDWICH       =  (new Food.Builder()).hunger(6).saturation(1F).meat().build();
		public static Food BEEF_SANDWICH         =  (new Food.Builder()).hunger(10).saturation(1F).meat().build();
		public static Food BREAD_SLICE           =  (new Food.Builder()).hunger(1).saturation(0.1F).build();
		public static Food CHICKEN_SANDWICH      =  (new Food.Builder()).hunger(8).saturation(1F).meat().build();
		public static Food COOKED_APPLE          =  (new Food.Builder()).hunger(8).saturation(0.75F).build();
		public static Food RABBIT_SANDWICH       =  (new Food.Builder()).hunger(8).saturation(1F).meat().build();
		public static Food BACON_EGGS_SANDWICH   =  (new Food.Builder()).hunger(9).saturation(1F).meat().build();
		// Extra Juices
		public static Food RASPBERRY_JUICE  = (new Food.Builder()).hunger(ConfigHandler.RaspberryAmount).saturation(ConfigHandler.RaspberrySaturation).build();  
		public static Food BLUEBERRY_JUICE  = (new Food.Builder()).hunger(ConfigHandler.BlueberryAmount).saturation(ConfigHandler.BlueberrySaturation).build();  
		public static Food BLACBERRY_JUICE  = (new Food.Builder()).hunger(ConfigHandler.BlackberryAmount).saturation(ConfigHandler.BlackberrySaturation).build();  
		public static Food MALOBERRY_JUICE  = (new Food.Builder()).hunger(ConfigHandler.MaloberryAmount).saturation(ConfigHandler.MaloberryAmount).build();  
		public static Food RASPBERRY_BEERY  = (new Food.Builder()).hunger(3).saturation(0.15F).build();  
		public static Food BLUEBERRY_BEERY  = (new Food.Builder()).hunger(3).saturation(0.15F).build();  
		public static Food BLACKBEERY_BEERY = (new Food.Builder()).hunger(3).saturation(0.15F).build();  
		public static Food MALOBERRY_BERRY  = (new Food.Builder()).hunger(3).saturation(0.15F).build();  
		// bsc cookie
		public static Food BSC_SUGAR_COOKIE = (new Food.Builder()).hunger(1).saturation(1F).build();  
		// Bams Pizza
		public static Food BAMS_PIZZA  = (new Food.Builder()).hunger(ConfigHandler.bams_pizza_amount).saturation(ConfigHandler.bams_pizza_sat).meat().build();  ;
		// Extra Drops
		public static Food PLUMP_PEAR  = (new Food.Builder()).hunger(3).saturation(0.25F).build();
		public static Food PLUMP_PEACH = (new Food.Builder()).hunger(3).saturation(0.25F).build();
		//Succ The Pearls
		public static Food SUCC_PEARLS = (new Food.Builder()).hunger(3).saturation(0.15F).build();
		
		public static Food DEAD_REEDS = (new Food.Builder()).hunger(1).saturation(0.15F).build();
		
}
