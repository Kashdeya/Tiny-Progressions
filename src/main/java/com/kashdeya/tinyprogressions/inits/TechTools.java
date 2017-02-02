package com.kashdeya.tinyprogressions.inits;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.Itembase;
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
	
	// Flint Tool & Weapon Heads
	public static Item FlintPickaxeHead;
	public static Item FlintAxeHead;
	public static Item FlintSpadeHead;
	public static Item FlintSwordHead;
	public static Item FlintHoeHead;
	
	// Flint Tools & Weapons
	public static Item FlintPickaxe;
	public static Item FlintAxe;
	public static Item FlintSpade;
	public static Item FlintSword;
	public static Item FlintHoe;
	
	// Bone Tool & Weapon Heads
	public static Item BonePickaxeHead;
	public static Item BoneAxeHead;
	public static Item BoneSpadeHead;
	public static Item BoneSwordHead;
	public static Item BoneHoeHead;
	
	// Bone Tools & Weapons
	public static Item BonePickaxe;
	public static Item BoneAxe;
	public static Item BoneSpade;
	public static Item BoneSword;
	public static Item BoneHoe;
	
	public static final Item.ToolMaterial BONE = EnumHelper.addToolMaterial("boneToolMaterial", 0, 29, 1.0F, 0.0F, 10);
	public static final Item.ToolMaterial FLINT = EnumHelper.addToolMaterial("flintToolMaterial", 0, 100, 3.0F, 0.5F, 15);
	
	public static void init(){
		
		// Flint Tools & Weapons
		if (ConfigHandler.FlintTools){
			FlintPickaxe = new FlintPickaxe(FLINT);
			registerItem(FlintPickaxe, "FlintPickaxe");
			FlintAxe = new FlintAxe(FLINT, 7.0F, -3.2F);
			registerItem(FlintAxe, "FlintAxe");
			FlintSpade = new FlintSpade(FLINT);
			registerItem(FlintSpade, "FlintSpade");
			FlintSword = new FlintSword(FLINT);
			registerItem(FlintSword, "FlintSword");
			FlintHoe = new FlintHoe(FLINT);
			registerItem(FlintHoe, "FlintHoe");
		}
		
		// Bone Tools & Weapons
		if (ConfigHandler.BoneTools){
			BonePickaxe = new BonePickaxe(BONE);
			registerItem(BonePickaxe, "BonePickaxe");
			BoneAxe = new BoneAxe(BONE, 5.0F, -3.2F);
			registerItem(BoneAxe, "BoneAxe");
			BoneSpade = new BoneSpade(BONE);
			registerItem(BoneSpade, "BoneSpade");
			BoneSword = new BoneSword(BONE);
			registerItem(BoneSword, "BoneSword");
			BoneHoe = new BoneHoe(BONE);
			registerItem(BoneHoe, "BoneHoe");
		}
		
		// Flint Tool & Weapon Heads
		if (ConfigHandler.FlintTools){
			FlintPickaxeHead = new Itembase().setUnlocalizedName("FlintPickaxeHead");;
			registerItem(FlintPickaxeHead, "FlintPickaxeHead");
			FlintAxeHead = new Itembase().setUnlocalizedName("FlintAxeHead");;
			registerItem(FlintAxeHead, "FlintAxeHead");
			FlintSpadeHead = new Itembase().setUnlocalizedName("FlintSpadeHead");;
			registerItem(FlintSpadeHead, "FlintSpadeHead");
			FlintSwordHead = new Itembase().setUnlocalizedName("FlintSwordHead");;
			registerItem(FlintSwordHead, "FlintSwordHead");
			FlintHoeHead = new Itembase().setUnlocalizedName("FlintHoeHead");;
			registerItem(FlintHoeHead, "FlintHoeHead");
		}
		
		// Bone Tool & Weapon Heads
		if (ConfigHandler.BoneTools){
			BonePickaxeHead = new Itembase().setUnlocalizedName("BonePickaxeHead");;
			registerItem(BonePickaxeHead, "BonePickaxeHead");
			BoneAxeHead = new Itembase().setUnlocalizedName("BoneAxeHead");;
			registerItem(BoneAxeHead, "BoneAxeHead");
			BoneSpadeHead = new Itembase().setUnlocalizedName("BoneSpadeHead");;
			registerItem(BoneSpadeHead, "BoneSpadeHead");
			BoneSwordHead = new Itembase().setUnlocalizedName("BoneSwordHead");;
			registerItem(BoneSwordHead, "BoneSwordHead");
			BoneHoeHead = new Itembase().setUnlocalizedName("BoneHoeHead");;
			registerItem(BoneHoeHead, "BoneHoeHead");
		}
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}

}
