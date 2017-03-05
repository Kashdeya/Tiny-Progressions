package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.Reference;
import com.kashdeya.tinyprogressions.tools.axe.BoneAxe;
import com.kashdeya.tinyprogressions.tools.axe.FlintAxe;
import com.kashdeya.tinyprogressions.tools.hoe.BoneHoe;
import com.kashdeya.tinyprogressions.tools.hoe.FlintHoe;
import com.kashdeya.tinyprogressions.tools.paxels.*;
import com.kashdeya.tinyprogressions.tools.pickaxe.BonePickaxe;
import com.kashdeya.tinyprogressions.tools.pickaxe.FlintPickaxe;
import com.kashdeya.tinyprogressions.tools.spade.BoneSpade;
import com.kashdeya.tinyprogressions.tools.spade.FlintSpade;
import com.kashdeya.tinyprogressions.tools.sword.BoneSword;
import com.kashdeya.tinyprogressions.tools.sword.FlintSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TechTools {
	
	// Flint Tool & Weapon Heads
	// public static Item FlintPickaxeHead;
	// public static Item FlintAxeHead;
	// public static Item FlintSpadeHead;
	// public static Item FlintSwordHead;
	// public static Item FlintHoeHead;
	
	// Flint Tools & Weapons
	public static Item FlintPickaxe;
	public static Item FlintAxe;
	public static Item FlintSpade;
	public static Item FlintSword;
	public static Item FlintHoe;
	
	// Bone Tool & Weapon Heads
	// public static Item BonePickaxeHead;
	// public static Item BoneAxeHead;
	// public static Item BoneSpadeHead;
	// public static Item BoneSwordHead;
	// public static Item BoneHoeHead;
	
	// Bone Tools & Weapons
	public static Item BonePickaxe;
	public static Item BoneAxe;
	public static Item BoneSpade;
	public static Item BoneSword;
	public static Item BoneHoe;
	
	// Paxels
	public static Item WoodenPaxel;
	public static Item StonePaxel;
	public static Item GoldenPaxel;
	public static Item IronPaxel;
	public static Item DiamondPaxel;
	
	
	public static final Item.ToolMaterial BONE = EnumHelper.addToolMaterial("boneToolMaterial", 0, 29, 1.0F, 0.0F, 10);
	public static final Item.ToolMaterial FLINT = EnumHelper.addToolMaterial("flintToolMaterial", 0, 100, 3.0F, 0.5F, 15);
	
	public static void init(){
		
		// Flint Tools & Weapons
		if (ConfigHandler.FlintTools){
			FlintPickaxe = new FlintPickaxe(FLINT);
			registerItem(FlintPickaxe, "flint_pickaxe");
			FlintAxe = new FlintAxe(FLINT, 7.0F, -3.2F);
			registerItem(FlintAxe, "flint_axe");
			FlintSpade = new FlintSpade(FLINT);
			registerItem(FlintSpade, "flint_spade");
			FlintSword = new FlintSword(FLINT);
			registerItem(FlintSword, "flint_sword");
			FlintHoe = new FlintHoe(FLINT);
			registerItem(FlintHoe, "flint_hoe");
		}
		
		// Bone Tools & Weapons
		if (ConfigHandler.BoneTools){
			BonePickaxe = new BonePickaxe(BONE);
			registerItem(BonePickaxe, "bone_pickaxe");
			BoneAxe = new BoneAxe(BONE, 5.0F, -3.2F);
			registerItem(BoneAxe, "bone_axe");
			BoneSpade = new BoneSpade(BONE);
			registerItem(BoneSpade, "bone_spade");
			BoneSword = new BoneSword(BONE);
			registerItem(BoneSword, "bone_sword");
			BoneHoe = new BoneHoe(BONE);
			registerItem(BoneHoe, "bone_hoe");
		}
		
		if (ConfigHandler.EnablePaxels){
			WoodenPaxel = new WoodenPaxel(ToolMaterial.WOOD);
			registerItem(WoodenPaxel, "wooden_paxel");
			StonePaxel = new StonePaxel(ToolMaterial.STONE);
			registerItem(StonePaxel, "stone_paxel");
			IronPaxel = new IronPaxel(ToolMaterial.IRON);
			registerItem(IronPaxel, "iron_paxel");
			GoldenPaxel = new GoldenPaxel(ToolMaterial.GOLD);
			registerItem(GoldenPaxel, "golden_paxel");
			DiamondPaxel = new DiamondPaxel(ToolMaterial.DIAMOND);
			registerItem(DiamondPaxel, "diamond_paxel");
		}
		
		/** Flint Tool & Weapon Heads
		if (ConfigHandler.FlintTools){
			FlintPickaxeHead = new ToolHeads().setUnlocalizedName("FlintPickaxeHead");;
			registerItem(FlintPickaxeHead, "FlintPickaxeHead");
			FlintAxeHead = new ToolHeads().setUnlocalizedName("FlintAxeHead");;
			registerItem(FlintAxeHead, "FlintAxeHead");
			FlintSpadeHead = new ToolHeads().setUnlocalizedName("FlintSpadeHead");;
			registerItem(FlintSpadeHead, "FlintSpadeHead");
			FlintSwordHead = new ToolHeads().setUnlocalizedName("FlintSwordHead");;
			registerItem(FlintSwordHead, "FlintSwordHead");
			FlintHoeHead = new ToolHeads().setUnlocalizedName("FlintHoeHead");;
			registerItem(FlintHoeHead, "FlintHoeHead");
		}
		
		// Bone Tool & Weapon Heads
		if (ConfigHandler.BoneTools){
			BonePickaxeHead = new ItemBase().setUnlocalizedName("BonePickaxeHead");;
			registerItem(BonePickaxeHead, "BonePickaxeHead");
			BoneAxeHead = new ItemBase().setUnlocalizedName("BoneAxeHead");;
			registerItem(BoneAxeHead, "BoneAxeHead");
			BoneSpadeHead = new ItemBase().setUnlocalizedName("BoneSpadeHead");;
			registerItem(BoneSpadeHead, "BoneSpadeHead");
			BoneSwordHead = new ItemBase().setUnlocalizedName("BoneSwordHead");;
			registerItem(BoneSwordHead, "BoneSwordHead");
			BoneHoeHead = new ItemBase().setUnlocalizedName("BoneHoeHead");;
			registerItem(BoneHoeHead, "BoneHoeHead");
		}*/
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));

		TPMigration.addUnderscoreNameToMapUnderscorelessName(name);
	}

}
