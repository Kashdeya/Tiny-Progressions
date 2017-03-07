package com.kashdeya.tinyprogressions.inits;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.MaterialHandler;
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
			registerItem(FlintPickaxe, "flint_pickaxe");
			FlintAxe = new FlintAxe(MaterialHandler.FLINT, 7.0F, -3.2F);
			registerItem(FlintAxe, "flint_axe");
			FlintSpade = new FlintSpade(MaterialHandler.FLINT);
			registerItem(FlintSpade, "flint_spade");
			FlintSword = new FlintSword(MaterialHandler.FLINT);
			registerItem(FlintSword, "flint_sword");
			FlintHoe = new FlintHoe(MaterialHandler.FLINT);
			registerItem(FlintHoe, "flint_hoe");
		}
		
		// Bone Tools & Weapons
		if (ConfigHandler.BoneTools){
			BonePickaxe = new BonePickaxe(MaterialHandler.BONE);
			registerItem(BonePickaxe, "bone_pickaxe");
			BoneAxe = new BoneAxe(MaterialHandler.BONE, 5.0F, -3.2F);
			registerItem(BoneAxe, "bone_axe");
			BoneSpade = new BoneSpade(MaterialHandler.BONE);
			registerItem(BoneSpade, "bone_spade");
			BoneSword = new BoneSword(MaterialHandler.BONE);
			registerItem(BoneSword, "bone_sword");
			BoneHoe = new BoneHoe(MaterialHandler.BONE);
			registerItem(BoneHoe, "bone_hoe");
		}
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));

		TPMigration.addUnderscoreNameToMapUnderscorelessName(name);
	}

}
