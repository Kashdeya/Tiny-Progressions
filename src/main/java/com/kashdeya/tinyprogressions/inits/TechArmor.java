package com.kashdeya.tinyprogressions.inits;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.armor.AmethystArmor;
import com.kashdeya.tinyprogressions.armor.BoneArmor;
import com.kashdeya.tinyprogressions.armor.DragonArmour;
import com.kashdeya.tinyprogressions.armor.EmeraldArmor;
import com.kashdeya.tinyprogressions.armor.FlintArmor;
import com.kashdeya.tinyprogressions.armor.LapisArmour;
import com.kashdeya.tinyprogressions.armor.LavaArmour;
import com.kashdeya.tinyprogressions.armor.ObsidianArmour;
import com.kashdeya.tinyprogressions.armor.RedstoneArmour;
import com.kashdeya.tinyprogressions.armor.ReinforcedArmour;
import com.kashdeya.tinyprogressions.armor.RubyArmor;
import com.kashdeya.tinyprogressions.armor.SapphireArmor;
import com.kashdeya.tinyprogressions.armor.StoneArmor;
import com.kashdeya.tinyprogressions.armor.WitherArmour;
import com.kashdeya.tinyprogressions.armor.WoodArmor;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.MaterialHandler;
import com.kashdeya.tinyprogressions.main.Reference;

public class TechArmor {
	
	// Stone Armor
	public static ItemArmor stone_helmet;
	public static ItemArmor stone_chestplate;
	public static ItemArmor stone_leggings;
	public static ItemArmor stone_boots;
	
	// Flint Armor
	public static ItemArmor flint_helmet;
	public static ItemArmor flint_chestplate;
	public static ItemArmor flint_leggings;
	public static ItemArmor flint_boots;
	
	// Bone Armor
	public static ItemArmor bone_helmet;
	public static ItemArmor bone_chestplate;
	public static ItemArmor bone_leggings;
	public static ItemArmor bone_boots;
	
	// Wood Armor
	public static ItemArmor wooden_helmet;
	public static ItemArmor wooden_chestplate;
	public static ItemArmor wooden_leggings;
	public static ItemArmor wooden_boots;
	
	// Emerald
	public static ItemArmor emerald_helmet;
	public static ItemArmor emerald_chestplate;
	public static ItemArmor emerald_leggings;
	public static ItemArmor emerald_boots;
	
	// Redstone
	public static ItemArmor redstone_helmet;
	public static ItemArmor redstone_chestplate;
	public static ItemArmor redstone_leggings;
	public static ItemArmor redstone_boots;
	
	// Lapis
	public static ItemArmor lapis_helmet;
	public static ItemArmor lapis_chestplate;
	public static ItemArmor lapis_leggings;
	public static ItemArmor lapis_boots;
	
	// Obsidian
	public static ItemArmor obsidian_helmet;
	public static ItemArmor obsidian_chestplate;
	public static ItemArmor obsidian_leggings;
	public static ItemArmor obsidian_boots;
	
	// Reinforced
	public static ItemArmor reinforced_helmet;
	public static ItemArmor reinforced_chestplate;
	public static ItemArmor reinforced_leggings;
	public static ItemArmor reinforced_boots;
	
	// Lava
	public static ItemArmor lava_helmet;
	public static ItemArmor lava_chestplate;
	public static ItemArmor lava_leggings;
	public static ItemArmor lava_boots;
	
	// Wither
	public static ItemArmor wither_helmet;
	public static ItemArmor wither_chestplate;
	public static ItemArmor wither_leggings;
	public static ItemArmor wither_boots;
	
	// Dragon
	public static ItemArmor dragon_helmet;
	public static ItemArmor dragon_chestplate;
	public static ItemArmor dragon_leggings;
	public static ItemArmor dragon_boots;
	
	// Amethyst
	public static ItemArmor amethyst_helmet;
	public static ItemArmor amethyst_chestplate;
	public static ItemArmor amethyst_leggings;
	public static ItemArmor amethyst_boots;
	
	// Ruby
	public static ItemArmor ruby_helmet;
	public static ItemArmor ruby_chestplate;
	public static ItemArmor ruby_leggings;
	public static ItemArmor ruby_boots;
	
	// Sapphire
	public static ItemArmor sapphire_helmet;
	public static ItemArmor sapphire_chestplate;
	public static ItemArmor sapphire_leggings;
	public static ItemArmor sapphire_boots;
	
	public static void init(){
		// Stone Armor
		if (ConfigHandler.StoneArmor){
			stone_helmet = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("stone_helmet");
			registerItem(stone_helmet, "stone_helmet");
			stone_chestplate = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("stone_chestplate");
			registerItem(stone_chestplate, "stone_chestplate");
			stone_leggings = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("stone_leggings");
			registerItem(stone_leggings, "stone_leggings");
			stone_boots = (ItemArmor) new StoneArmor(MaterialHandler.stoneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("stone_boots");
			registerItem(stone_boots, "stone_boots");
		}
		
		// Flint Armor
		if (ConfigHandler.FlintArmor){
			flint_helmet = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("flint_helmet");
			registerItem(flint_helmet, "flint_helmet");
			flint_chestplate = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("flint_chestplate");
			registerItem(flint_chestplate, "flint_chestplate");
			flint_leggings = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("flint_leggings");
			registerItem(flint_leggings, "flint_leggings");
			flint_boots = (ItemArmor) new FlintArmor(MaterialHandler.flintArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("flint_boots");
			registerItem(flint_boots, "flint_boots");
		}
		
		// Flint Armor
		if (ConfigHandler.BoneArmor){
			bone_helmet = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("bone_helmet");
			registerItem(bone_helmet, "bone_helmet");
			bone_chestplate = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("bone_chestplate");
			registerItem(bone_chestplate, "bone_chestplate");
			bone_leggings = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("bone_leggings");
			registerItem(bone_leggings, "bone_leggings");
			bone_boots = (ItemArmor) new BoneArmor(MaterialHandler.boneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("bone_boots");
			registerItem(bone_boots, "bone_boots");
		}
		
		// Flint Armor
		if (ConfigHandler.WoodArmor){
			wooden_helmet = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("wooden_helmet");
			registerItem(wooden_helmet, "wooden_helmet");
			wooden_chestplate = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("wooden_chestplate");
			registerItem(wooden_chestplate, "wooden_chestplate");
			wooden_leggings = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("wooden_leggings");
			registerItem(wooden_leggings, "wooden_leggings");
			wooden_boots = (ItemArmor) new WoodArmor(MaterialHandler.woodArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("wooden_boots");
			registerItem(wooden_boots, "wooden_boots");
		}
		
		// Emerald
		if (ConfigHandler.EmeraldArmor){
			emerald_helmet = (ItemArmor) new EmeraldArmor(MaterialHandler.emeraldArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("emerald_helmet");
			registerItem(emerald_helmet, "emerald_helmet");
			emerald_chestplate = (ItemArmor) new EmeraldArmor(MaterialHandler.emeraldArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("emerald_chestplate");
			registerItem(emerald_chestplate, "emerald_chestplate");
			emerald_leggings = (ItemArmor) new EmeraldArmor(MaterialHandler.emeraldArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("emerald_leggings");
			registerItem(emerald_leggings, "emerald_leggings");
			emerald_boots = (ItemArmor) new EmeraldArmor(MaterialHandler.emeraldArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("emerald_boots");
			registerItem(emerald_boots, "emerald_boots");
		}
	    
	    // Redstone
		if (ConfigHandler.RedstoneArmor){
			redstone_helmet = (ItemArmor) new RedstoneArmour(MaterialHandler.redstoneArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("redstone_helmet");
	    	registerItem(redstone_helmet, "redstone_helmet");
	    	redstone_chestplate = (ItemArmor) new RedstoneArmour(MaterialHandler.redstoneArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("redstone_chestplate");
	    	registerItem(redstone_chestplate, "redstone_chestplate");
	    	redstone_leggings = (ItemArmor) new RedstoneArmour(MaterialHandler.redstoneArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("redstone_leggings");
	    	registerItem(redstone_leggings, "redstone_leggings");
	    	redstone_boots = (ItemArmor) new RedstoneArmour(MaterialHandler.redstoneArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("redstone_boots");
	    	registerItem(redstone_boots, "redstone_boots");
		}
	    
	    // Lapis
		if (ConfigHandler.LapisArmor){
			lapis_helmet = (ItemArmor) new LapisArmour(MaterialHandler.lapisArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("lapis_helmet");
	    	registerItem(lapis_helmet, "lapis_helmet");
	    	lapis_chestplate = (ItemArmor) new LapisArmour(MaterialHandler.lapisArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("lapis_chestplate");
	    	registerItem(lapis_chestplate, "lapis_chestplate");
	    	lapis_leggings = (ItemArmor) new LapisArmour(MaterialHandler.lapisArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("lapis_leggings");
	    	registerItem(lapis_leggings, "lapis_leggings");
	    	lapis_boots = (ItemArmor) new LapisArmour(MaterialHandler.lapisArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("lapis_boots");
	    	registerItem(lapis_boots, "lapis_boots");
		}
	    
	    // Obsidian
		if (ConfigHandler.ObsidianArmor){
			obsidian_helmet = (ItemArmor) new ObsidianArmour(MaterialHandler.obsidianArmorMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("obsidian_helmet");
	    	registerItem(obsidian_helmet, "obsidian_helmet");
	    	obsidian_chestplate = (ItemArmor) new ObsidianArmour(MaterialHandler.obsidianArmorMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("obsidian_chestplate");
	    	registerItem(obsidian_chestplate, "obsidian_chestplate");
	    	obsidian_leggings = (ItemArmor) new ObsidianArmour(MaterialHandler.obsidianArmorMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("obsidian_leggings");
	    	registerItem(obsidian_leggings, "obsidian_leggings");
	    	obsidian_boots = (ItemArmor) new ObsidianArmour(MaterialHandler.obsidianArmorMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("obsidian_boots");
	    	registerItem(obsidian_boots, "obsidian_boots");
		}
	    
	    // Reinforced
		if (ConfigHandler.ReinforcedArmor){
			reinforced_helmet = (ItemArmor) new ReinforcedArmour(MaterialHandler.reinforcedArmorMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("reinforced_helmet");
	    	registerItem(reinforced_helmet, "reinforced_helmet");
	    	reinforced_chestplate = (ItemArmor) new ReinforcedArmour(MaterialHandler.reinforcedArmorMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("reinforced_chestplate");
	    	registerItem(reinforced_chestplate, "reinforced_chestplate");
	    	reinforced_leggings = (ItemArmor) new ReinforcedArmour(MaterialHandler.reinforcedArmorMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("reinforced_leggings");
	    	registerItem(reinforced_leggings, "reinforced_leggings");
	    	reinforced_boots = (ItemArmor) new ReinforcedArmour(MaterialHandler.reinforcedArmorMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("reinforced_boots");
	    	registerItem(reinforced_boots, "reinforced_boots");
		}
	    
	    // Lava
		if (ConfigHandler.LavaArmor){
			lava_helmet = (ItemArmor) new LavaArmour(MaterialHandler.lavaArmorMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("lava_helmet");
	    	registerItem(lava_helmet, "lava_helmet");
	    	lava_chestplate = (ItemArmor) new LavaArmour(MaterialHandler.lavaArmorMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("lava_chestplate");
	    	registerItem(lava_chestplate, "lava_chestplate");
	    	lava_leggings = (ItemArmor) new LavaArmour(MaterialHandler.lavaArmorMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("lava_leggings");
	    	registerItem(lava_leggings, "lava_leggings");
	    	lava_boots = (ItemArmor) new LavaArmour(MaterialHandler.lavaArmorMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("lava_boots");
	    	registerItem(lava_boots, "lava_boots");
		}
	    
	    // Wither
		if (ConfigHandler.WitherArmor){
			wither_helmet = (ItemArmor) new WitherArmour(MaterialHandler.witherArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("wither_helmet");
	    	registerItem(wither_helmet, "wither_helmet");
	    	wither_chestplate = (ItemArmor) new WitherArmour(MaterialHandler.witherArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("wither_chestplate");
	    	registerItem(wither_chestplate, "wither_chestplate");
	    	wither_leggings = (ItemArmor) new WitherArmour(MaterialHandler.witherArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("wither_leggings");
	    	registerItem(wither_leggings, "wither_leggings");
	    	wither_boots = (ItemArmor) new WitherArmour(MaterialHandler.witherArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("wither_boots");
	    	registerItem(wither_boots, "wither_boots");
		}
	    
	    // Dragon
		if (ConfigHandler.DragonArmor){
			dragon_helmet = (ItemArmor) new DragonArmour(MaterialHandler.dragonArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("dragon_helmet");
	    	registerItem(dragon_helmet, "dragon_helmet");
	    	dragon_chestplate = (ItemArmor) new DragonArmour(MaterialHandler.dragonArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("dragon_chestplate");
	    	registerItem(dragon_chestplate, "dragon_chestplate");
	    	dragon_leggings = (ItemArmor) new DragonArmour(MaterialHandler.dragonArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("dragon_leggings");
	    	registerItem(dragon_leggings, "dragon_leggings");
	    	dragon_boots = (ItemArmor) new DragonArmour(MaterialHandler.dragonArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("dragon_boots");
	    	registerItem(dragon_boots, "dragon_boots");
		}
	    
	    // Amethyst
		if (ConfigHandler.AmethystOre){
			amethyst_helmet = (ItemArmor) new AmethystArmor(MaterialHandler.amethystArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("amethyst_helmet");
	    	registerItem(amethyst_helmet, "amethyst_helmet");
	    	amethyst_chestplate = (ItemArmor) new AmethystArmor(MaterialHandler.amethystArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("amethyst_chestplate");
	    	registerItem(amethyst_chestplate, "amethyst_chestplate");
	    	amethyst_leggings = (ItemArmor) new AmethystArmor(MaterialHandler.amethystArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("amethyst_leggings");
	    	registerItem(amethyst_leggings, "amethyst_leggings");
	    	amethyst_boots = (ItemArmor) new AmethystArmor(MaterialHandler.amethystArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("amethyst_boots");
	    	registerItem(amethyst_boots, "amethyst_boots");
		}
	    
	    // Ruby
		if (ConfigHandler.RubyOre){
			ruby_helmet = (ItemArmor) new RubyArmor(MaterialHandler.rubyArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("ruby_helmet");
	    	registerItem(ruby_helmet, "ruby_helmet");
	    	ruby_chestplate = (ItemArmor) new RubyArmor(MaterialHandler.rubyArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("ruby_chestplate");
	    	registerItem(ruby_chestplate, "ruby_chestplate");
	    	ruby_leggings = (ItemArmor) new RubyArmor(MaterialHandler.rubyArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("ruby_leggings");
	    	registerItem(ruby_leggings, "ruby_leggings");
	    	ruby_boots = (ItemArmor) new RubyArmor(MaterialHandler.rubyArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("ruby_boots");
	    	registerItem(ruby_boots, "ruby_boots");
		}
	    
	    // Sapphire
		if (ConfigHandler.SapphireOre){
			sapphire_helmet = (ItemArmor) new SapphireArmor(MaterialHandler.sapphireArmourMaterial, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("sapphire_helmet");
	    	registerItem(sapphire_helmet, "sapphire_helmet");
	    	sapphire_chestplate = (ItemArmor) new SapphireArmor(MaterialHandler.sapphireArmourMaterial, 1, EntityEquipmentSlot.CHEST).setUnlocalizedName("sapphire_chestplate");
	    	registerItem(sapphire_chestplate, "sapphire_chestplate");
	    	sapphire_leggings = (ItemArmor) new SapphireArmor(MaterialHandler.sapphireArmourMaterial, 2, EntityEquipmentSlot.LEGS).setUnlocalizedName("sapphire_leggings");
	    	registerItem(sapphire_leggings, "sapphire_leggings");
	    	sapphire_boots = (ItemArmor) new SapphireArmor(MaterialHandler.sapphireArmourMaterial, 1, EntityEquipmentSlot.FEET).setUnlocalizedName("sapphire_boots");
	    	registerItem(sapphire_boots, "sapphire_boots");
		}
	}
	
	static void registerItem(ItemArmor item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}
}
