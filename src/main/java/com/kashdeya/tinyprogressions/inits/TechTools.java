package com.kashdeya.tinyprogressions.inits;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.MaterialHandler;
import com.kashdeya.tinyprogressions.items.BirthdayPickaxe;
import com.kashdeya.tinyprogressions.main.Reference;
import com.kashdeya.tinyprogressions.tools.axe.BoneAxe;
import com.kashdeya.tinyprogressions.tools.axe.FlintAxe;
import com.kashdeya.tinyprogressions.tools.hoe.BoneHoe;
import com.kashdeya.tinyprogressions.tools.hoe.FlintHoe;
import com.kashdeya.tinyprogressions.tools.pickaxe.BonePickaxe;
import com.kashdeya.tinyprogressions.tools.pickaxe.FlintPickaxe;
import com.kashdeya.tinyprogressions.tools.spade.BoneSpade;
import com.kashdeya.tinyprogressions.tools.spade.FlintSpade;
import com.kashdeya.tinyprogressions.tools.sword.BoneSword;
import com.kashdeya.tinyprogressions.tools.sword.FlintSword;

public class TechTools {
	
	// Flint Tools & Weapons
	public static Item FlintPickaxe;
	public static Item FlintAxe;
	public static Item FlintSpade;
	public static Item FlintSword;
	public static Item FlintHoe;
	// Bone Tools & Weapons
	public static Item BonePickaxe;
	public static Item BoneAxe;
	public static Item BoneSpade;
	public static Item BoneSword;
	public static Item BoneHoe;
	// Pickaxe
	public static Item BirthdayPickaxe;
	
	public static void init(){
		
		// Flint Tools & Weapons
		if (ConfigHandler.FlintTools){
			FlintPickaxe = new FlintPickaxe(MaterialHandler.FLINT);
			registerItem(FlintPickaxe, "FlintPickaxe");
			FlintAxe = new FlintAxe(MaterialHandler.FLINT, 7.0F, -3.2F);
			registerItem(FlintAxe, "FlintAxe");
			FlintSpade = new FlintSpade(MaterialHandler.FLINT);
			registerItem(FlintSpade, "FlintSpade");
			FlintSword = new FlintSword(MaterialHandler.FLINT);
			registerItem(FlintSword, "FlintSword");
			FlintHoe = new FlintHoe(MaterialHandler.FLINT);
			registerItem(FlintHoe, "FlintHoe");
		}
		
		// Bone Tools & Weapons
		if (ConfigHandler.BoneTools){
			BonePickaxe = new BonePickaxe(MaterialHandler.BONE);
			registerItem(BonePickaxe, "BonePickaxe");
			BoneAxe = new BoneAxe(MaterialHandler.BONE, 5.0F, -3.2F);
			registerItem(BoneAxe, "BoneAxe");
			BoneSpade = new BoneSpade(MaterialHandler.BONE);
			registerItem(BoneSpade, "BoneSpade");
			BoneSword = new BoneSword(MaterialHandler.BONE);
			registerItem(BoneSword, "BoneSword");
			BoneHoe = new BoneHoe(MaterialHandler.BONE);
			registerItem(BoneHoe, "BoneHoe");
		}
		
		// Pickaxe
	    if (ConfigHandler.BirthdayPickaxe){
	    	BirthdayPickaxe = new BirthdayPickaxe(MaterialHandler.BIRTHDAY);
			registerItem(BirthdayPickaxe, "BirthdayPickaxe");
		}
	    
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}

}
