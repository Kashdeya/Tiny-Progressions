package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class BasePickaxe extends PickaxeItem {
	
//	static {
//
//		BasePickaxe flintPickAxe =    new BasePickaxe(ItemToolModTier.FLINT, 0, 0, new Properties());
//		BasePickaxe bonePickAxe =     new BasePickaxe(ItemToolModTier.BONE, 0, 0, new Properties());
//		BasePickaxe emeraldPickAxe =  new BasePickaxe(ItemToolModTier.EMERALD, 0, 0, new Properties());
//		BasePickaxe obsidianPickAxe = new BasePickaxe(ItemToolModTier.OBSIDIAN, 0, 0, new Properties());
//		BasePickaxe wubPickAxe =      new BasePickaxe(ItemToolModTier.WUBWUB, 0, 0, new Properties());
//		
//		BasePickaxe seaIronPickAxe =  new BasePickaxe(ItemToolModTier.SEAIRON, 0, 0, new Properties());
//		
//		BasePickaxe BscDiamondPickAxe =  new BasePickaxe(ItemToolModTier.BSCDIAMOND, 0, 0, new Properties());
//		BasePickaxe BscGoldPickAxe =     new BasePickaxe(ItemToolModTier.BSCGOLD, 0, 0, new Properties());
//		BasePickaxe BscIronPickAxe =     new BasePickaxe(ItemToolModTier.BSCIRON, 0, 0, new Properties());
//		
//		BasePickaxe kappaPick = new BasePickaxe(ItemToolModTier.KAPPA, ConfigHandler.kappa_damage, 0, new Properties());
//	} 
	
	public BasePickaxe(IItemTier tier, int maxDamage, float attackSpeed, Properties prop){
		super(tier, maxDamage, attackSpeed, prop);
		prop.group(TinyProgressions.TAB)
		.maxStackSize(1);
	}
}



//public static void init(){
//// Shears
//if (ConfigHandler.wooden_shears) {
//	wooden_shears = new BaseShears().setTranslationKey("wooden_shears").setMaxDamage(59);
//}
//if (ConfigHandler.golden_shears) {
//	golden_shears = new BaseShears().setTranslationKey("golden_shears").setMaxDamage(32);
//}
//if (ConfigHandler.diamond_shears) {
//	diamond_shears = new BaseShears().setTranslationKey("diamond_shears").setMaxDamage(1561);
//}
//if (ConfigHandler.emerald_shears) {
//	emerald_shears = new BaseShears().setTranslationKey("emerald_shears").setMaxDamage(1061);
//}
//if (ConfigHandler.flint_shears) {
//	flint_shears = new BaseShears().setTranslationKey("flint_shears").setMaxDamage(81);
//}
//if (ConfigHandler.stone_shears) {
//	stone_shears = new BaseShears().setTranslationKey("stone_shears").setMaxDamage(131);
//}
//// wub extras
//if (ConfigHandler.wub_juice_tools && ConfigHandler.vasholine){
//	wub_pickaxe = new WubPickaxe(MaterialHandler.WUBWUB).setTranslationKey("wub_pickaxe");
//	wub_axe = new WubAxe(MaterialHandler.WUBWUB, 11.0F, -1.2F).setTranslationKey("wub_axe");
//	wub_spade = new WubSpade(MaterialHandler.WUBWUB).setTranslationKey("wub_spade");
//	wub_sword = new WubSword(MaterialHandler.WUBWUB).setTranslationKey("wub_sword");
//	wub_hoe = new WubHoe(MaterialHandler.WUBWUB).setTranslationKey("wub_hoe");
//	wub_paxel = new WubMulti(MaterialHandler.PWUBWUB).setTranslationKey("wub_paxel").setMaxDamage(DamageHandler.wub_multi);
//	wub_hammer = new WubHammer(MaterialHandler.PWUBWUB).setTranslationKey("wub_hammer").setMaxDamage(DamageHandler.wub_pickaxe);
//}
//// nether tools and weapons
//if (ConfigHandler.nether_rod && ConfigHandler.nether_iron_tools_weapons){
//	nether_iron_pickaxe = new BasePickaxe(Item.ToolMaterial.IRON).setTranslationKey("nether_iron_pickaxe");
//	nether_iron_axe = new BaseAxe(Item.ToolMaterial.IRON, 8.0F, -1.2F).setTranslationKey("nether_iron_axe");
//	nether_iron_spade = new BaseSpade(Item.ToolMaterial.IRON).setTranslationKey("nether_iron_spade");
//	nether_iron_sword = new BaseSword(Item.ToolMaterial.IRON).setTranslationKey("nether_iron_sword");
//	nether_iron_hoe = new BaseHoe(Item.ToolMaterial.IRON).setTranslationKey("nether_iron_hoe");
//}
//if (ConfigHandler.nether_rod && ConfigHandler.nether_gold_tools_weapons){
//	nether_gold_pickaxe = new BasePickaxe(Item.ToolMaterial.GOLD).setTranslationKey("nether_gold_pickaxe");
//	nether_gold_axe = new BaseAxe(Item.ToolMaterial.GOLD, 6.0F, -1.2F).setTranslationKey("nether_gold_axe");
//	nether_gold_spade = new BaseSpade(Item.ToolMaterial.GOLD).setTranslationKey("nether_gold_spade");
//	nether_gold_sword = new BaseSword(Item.ToolMaterial.GOLD).setTranslationKey("nether_gold_sword");
//	nether_gold_hoe = new BaseHoe(Item.ToolMaterial.GOLD).setTranslationKey("nether_gold_hoe");
//}
//if (ConfigHandler.nether_rod && ConfigHandler.nether_diamond_tools_weapons){
//	nether_diamond_pickaxe = new BasePickaxe(Item.ToolMaterial.DIAMOND).setTranslationKey("nether_diamond_pickaxe");
//	nether_diamond_axe = new BaseAxe(Item.ToolMaterial.DIAMOND, 8.0F, -1.2F).setTranslationKey("nether_diamond_axe");
//	nether_diamond_spade = new BaseSpade(Item.ToolMaterial.DIAMOND).setTranslationKey("nether_diamond_spade");
//	nether_diamond_sword = new BaseSword(Item.ToolMaterial.DIAMOND).setTranslationKey("nether_diamond_sword");
//	nether_diamond_hoe = new BaseHoe(Item.ToolMaterial.DIAMOND).setTranslationKey("nether_diamond_hoe");
//}
//if (ConfigHandler.nether_rod && ConfigHandler.nether_tools_weapons){
//	nether_pickaxe = new BasePickaxe(Item.ToolMaterial.STONE).setTranslationKey("nether_pickaxe");
//	nether_axe = new BaseAxe(Item.ToolMaterial.STONE, 8.0F, -1.2F).setTranslationKey("nether_axe");
//	nether_spade = new BaseSpade(Item.ToolMaterial.STONE).setTranslationKey("nether_spade");
//	nether_sword = new BaseSword(Item.ToolMaterial.STONE).setTranslationKey("nether_sword");
//	nether_hoe = new BaseHoe(Item.ToolMaterial.STONE).setTranslationKey("nether_hoe");
//}
//// c axe
//if (ConfigHandler.c_axe && ConfigHandler.sea_axe){
//	c_axe = new SeaIronAxe(MaterialHandler.SEAIRON, 10.0F, -1.2F).setTranslationKey("c_axe");
//}
//if (ConfigHandler.c_axe && ConfigHandler.sea_pickaxe){
//	c_axe = new SeaIronPickaxe(MaterialHandler.SEAIRON).setTranslationKey("c_axe");
//}
//// bsc tools and weapons
//if (ConfigHandler.bsc_rod && ConfigHandler.bsc_iron_tools_weapons){
//	bsc_iron_pickaxe = new BscIronPickaxe(MaterialHandler.BSCIRON).setTranslationKey("bsc_iron_pickaxe");
//	bsc_iron_axe = new BscIronAxe(MaterialHandler.BSCIRON, 8.0F, -1.2F).setTranslationKey("bsc_iron_axe");
//	bsc_iron_spade = new BscIronSpade(MaterialHandler.BSCIRON).setTranslationKey("bsc_iron_spade");
//	bsc_iron_sword = new BscIronSword(MaterialHandler.BSCIRON).setTranslationKey("bsc_iron_sword");
//	bsc_iron_hoe = new BscIronHoe(MaterialHandler.BSCIRON).setTranslationKey("bsc_iron_hoe");
//}
//if (ConfigHandler.bsc_rod && ConfigHandler.bsc_gold_tools_weapons){
//	bsc_gold_pickaxe = new BscGoldPickaxe(MaterialHandler.BSCGOLD).setTranslationKey("bsc_gold_pickaxe");
//	bsc_gold_axe = new BscGoldAxe(MaterialHandler.BSCGOLD, 6.0F, -1.2F).setTranslationKey("bsc_gold_axe");
//	bsc_gold_spade = new BscGoldSpade(MaterialHandler.BSCGOLD).setTranslationKey("bsc_gold_spade");
//	bsc_gold_sword = new BscGoldSword(MaterialHandler.BSCGOLD).setTranslationKey("bsc_gold_sword");
//	bsc_gold_hoe = new BscGoldHoe(MaterialHandler.BSCGOLD).setTranslationKey("bsc_gold_hoe");
//}
//if (ConfigHandler.bsc_rod && ConfigHandler.bsc_diamond_tools_weapons){
//	bsc_diamond_pickaxe = new BscDiamondPickaxe(MaterialHandler.BSCDIAMOND).setTranslationKey("bsc_diamond_pickaxe");
//	bsc_diamond_axe = new BscDiamondAxe(MaterialHandler.BSCDIAMOND, 8.0F, -1.2F).setTranslationKey("bsc_diamond_axe");
//	bsc_diamond_spade = new BscDiamondSpade(MaterialHandler.BSCDIAMOND).setTranslationKey("bsc_diamond_spade");
//	bsc_diamond_sword = new BscDiamondSword(MaterialHandler.BSCDIAMOND).setTranslationKey("bsc_diamond_sword");
//	bsc_diamond_hoe = new BscDiamondHoe(MaterialHandler.BSCDIAMOND).setTranslationKey("bsc_diamond_hoe");
//}
//// Flint
//if (ConfigHandler.FlintTools){
//	flint_pickaxe = new FlintPickaxe(MaterialHandler.FLINT).setTranslationKey("flint_pickaxe");
//	flint_axe = new FlintAxe(MaterialHandler.FLINT, 6.5F, -1.2F).setTranslationKey("flint_axe");
//	flint_spade = new FlintSpade(MaterialHandler.FLINT).setTranslationKey("flint_spade");
//	flint_sword = new FlintSword(MaterialHandler.FLINT).setTranslationKey("flint_sword");
//	flint_hoe = new FlintHoe(MaterialHandler.FLINT).setTranslationKey("flint_hoe");
//}
//// Bone
//if (ConfigHandler.BoneTools){
//	bone_pickaxe = new BonePickaxe(MaterialHandler.BONE).setTranslationKey("bone_pickaxe");
//	bone_axe = new BoneAxe(MaterialHandler.BONE, 5.5F, -1.2F).setTranslationKey("bone_axe");
//	bone_spade = new BoneSpade(MaterialHandler.BONE).setTranslationKey("bone_spade");
//	bone_sword = new BoneSword(MaterialHandler.BONE).setTranslationKey("bone_sword");
//	bone_hoe = new BoneHoe(MaterialHandler.BONE).setTranslationKey("bone_hoe");
//}
//// Birthday
//if (ConfigHandler.BirthdayPickaxe){
//	birthday_pickaxe = new BirthdayPickaxe(MaterialHandler.BIRTHDAY);
//}
//// Kappa Pick
//if (ConfigHandler.kappa_pick){
//	kappa_pick = new KappaPick(MaterialHandler.KAPPA).setTranslationKey("kappa_pick");
//}
//// Scythe
//if (ConfigHandler.wooden_scythe){
//	wooden_scythe = new BaseScythe(ToolMaterial.WOOD).setTranslationKey("wooden_scythe").setMaxDamage(DamageHandler.wooden_scythe);
//}
//if (ConfigHandler.stone_scythe){
//	stone_scythe = new BaseScythe(ToolMaterial.STONE).setTranslationKey("stone_scythe").setMaxDamage(DamageHandler.stone_scythe);
//}
//if (ConfigHandler.golden_scythe){
//	golden_scythe = new BaseScythe(ToolMaterial.GOLD).setTranslationKey("golden_scythe").setMaxDamage(DamageHandler.golden_scythe);
//}
//if (ConfigHandler.iron_scythe){
//	iron_scythe = new BaseScythe(ToolMaterial.IRON).setTranslationKey("iron_scythe").setMaxDamage(DamageHandler.iron_scythe);
//}
//if (ConfigHandler.diamond_scythe){
//	diamond_scythe = new BaseScythe(ToolMaterial.DIAMOND).setTranslationKey("diamond_scythe").setMaxDamage(DamageHandler.diamond_scythe);
//}
//if (ConfigHandler.emerald_scythe){
//	emerald_scythe = new EmeraldScythe(MaterialHandler.EMERALD).setTranslationKey("emerald_scythe").setMaxDamage(DamageHandler.emerald_scythe);
//}
//if (ConfigHandler.obsidian_scythe){
//	obsidian_scythe = new ObsidianScythe(MaterialHandler.OBSIDIAN).setTranslationKey("obsidian_scythe").setMaxDamage(DamageHandler.obsidian_scythe);
//}
//// Emerald
//if (ConfigHandler.emerald_axe){
//    emerald_axe = new EmeraldAxe(MaterialHandler.EMERALD, 10.0F, -1.2F).setTranslationKey("emerald_axe").setMaxDamage(DamageHandler.emerald_axe);
//}
//if (ConfigHandler.emerald_pickaxe){
//	emerald_pickaxe = new EmeraldPickaxe(MaterialHandler.EMERALD).setTranslationKey("emerald_pickaxe").setMaxDamage(DamageHandler.emerald_pickaxe);
//}
//if (ConfigHandler.emerald_spade){
//	emerald_spade = new EmeraldSpade(MaterialHandler.EMERALD).setTranslationKey("emerald_spade").setMaxDamage(DamageHandler.emerald_spade);
//}
//if (ConfigHandler.emerald_hoe){
//	emerald_hoe = new EmeraldHoe(MaterialHandler.EMERALD).setTranslationKey("emerald_hoe").setMaxDamage(DamageHandler.emerald_hoe);
//}
//if (ConfigHandler.emerald_sword){
//	emerald_sword = new EmeraldSword(MaterialHandler.EMERALD).setTranslationKey("emerald_sword").setMaxDamage(DamageHandler.emerald_sword);
//}
//// Obsidian
//if (ConfigHandler.obsidian_axe){
//    obsidian_axe = new ObsidianAxe(MaterialHandler.OBSIDIAN, 9.0F, -1.2F).setTranslationKey("obsidian_axe").setMaxDamage(DamageHandler.obsidian_axe);
//}
//if (ConfigHandler.obsidian_pickaxe){
//	obsidian_pickaxe = new ObsidianPickaxe(MaterialHandler.OBSIDIAN).setTranslationKey("obsidian_pickaxe").setMaxDamage(DamageHandler.obsidian_pickaxe);
//}
//if (ConfigHandler.obsidian_spade){
//	obsidian_spade = new ObsidianSpade(MaterialHandler.OBSIDIAN).setTranslationKey("obsidian_spade").setMaxDamage(DamageHandler.obsidian_spade);
//}
//if (ConfigHandler.obsidian_hoe){
//	obsidian_hoe = new ObsidianHoe(MaterialHandler.OBSIDIAN).setTranslationKey("obsidian_hoe").setMaxDamage(DamageHandler.obsidian_hoe);
//}
//if (ConfigHandler.obsidian_sword){
//	obsidian_sword = new ObsidianSword(MaterialHandler.OBSIDIAN).setTranslationKey("obsidian_sword").setMaxDamage(DamageHandler.obsidian_sword);
//}
//// Multi
//if (ConfigHandler.wooden_multi){
//	wooden_multi = new BasePaxel(MaterialHandler.PWOOD).setTranslationKey("wooden_multi").setMaxDamage(DamageHandler.wooden_multi);
//}
//if (ConfigHandler.flint_multi){
//	flint_multi = new FlintMulti(MaterialHandler.PFLINT).setTranslationKey("flint_multi").setMaxDamage(DamageHandler.flint_multi);
//}
//if (ConfigHandler.stone_multi){
//	stone_multi = new BasePaxel(MaterialHandler.PSTONE).setTranslationKey("stone_multi").setMaxDamage(DamageHandler.stone_multi);
//}
//if (ConfigHandler.golden_multi){
//	golden_multi = new BasePaxel(MaterialHandler.PGOLD).setTranslationKey("golden_multi").setMaxDamage(DamageHandler.golden_multi);
//}
//if (ConfigHandler.iron_multi){
//	iron_multi = new BasePaxel(MaterialHandler.PIRON).setTranslationKey("iron_multi").setMaxDamage(DamageHandler.iron_multi);
//}
//if (ConfigHandler.diamond_multi){
//	diamond_multi = new BasePaxel(MaterialHandler.PDIAMOND).setTranslationKey("diamond_multi").setMaxDamage(DamageHandler.diamond_multi);
//}
//if (ConfigHandler.emerald_multi){
//	emerald_multi = new EmeraldMulti(MaterialHandler.PEMERALD).setTranslationKey("emerald_multi").setMaxDamage(DamageHandler.emerald_multi);
//}
//if (ConfigHandler.obsidian_multi){
//	obsidian_multi = new ObsidianMulti(MaterialHandler.POBSIDIAN).setTranslationKey("obsidian_multi").setMaxDamage(DamageHandler.obsidian_multi);
//}
//// Battle
//if (ConfigHandler.wooden_battle){
//	wooden_battle = new BaseBattle(ToolMaterial.WOOD, 6.0F, -1.2F).setTranslationKey("wooden_battle").setMaxDamage(DamageHandler.wooden_battle);
//}
//if (ConfigHandler.stone_battle){
//	stone_battle = new BaseBattle(ToolMaterial.STONE, 8.0F, -1.2F).setTranslationKey("stone_battle").setMaxDamage(DamageHandler.stone_battle);
//}
//if (ConfigHandler.golden_battle){
//	golden_battle = new BaseBattle(ToolMaterial.GOLD, 6.0F, -1.2F).setTranslationKey("golden_battle").setMaxDamage(DamageHandler.golden_battle);
//}
//if (ConfigHandler.iron_battle){
//	iron_battle = new BaseBattle(ToolMaterial.IRON, 8.0F, -1.2F).setTranslationKey("iron_battle").setMaxDamage(DamageHandler.iron_battle);
//}
//if (ConfigHandler.diamond_battle){
//	diamond_battle = new BaseBattle(ToolMaterial.DIAMOND, 8.0F, -1.2F).setTranslationKey("diamond_battle").setMaxDamage(DamageHandler.diamond_battle);
//}
//if (ConfigHandler.emerald_battle){
//	emerald_battle = new EmeraldBattle(MaterialHandler.EMERALD, 10.0F, -1.2F).setTranslationKey("emerald_battle").setMaxDamage(DamageHandler.emerald_battle);
//}
//if (ConfigHandler.obsidian_battle){
//	obsidian_battle = new ObsidianBattle(MaterialHandler.OBSIDIAN, 9.0F, -1.2F).setTranslationKey("obsidian_battle").setMaxDamage(DamageHandler.obsidian_battle);
//}
//// Spear
//if (ConfigHandler.wooden_spear){
//	wooden_spear = new BaseSpear(ToolMaterial.WOOD).setTranslationKey("wooden_spear").setMaxDamage(DamageHandler.wooden_spear);
//}
//if (ConfigHandler.stone_spear){
//	stone_spear = new BaseSpear(ToolMaterial.STONE).setTranslationKey("stone_spear").setMaxDamage(DamageHandler.stone_spear);
//}
//if (ConfigHandler.golden_spear){
//	golden_spear = new BaseSpear(ToolMaterial.GOLD).setTranslationKey("golden_spear").setMaxDamage(DamageHandler.golden_spear);
//}
//if (ConfigHandler.iron_spear){
//	iron_spear = new BaseSpear(ToolMaterial.IRON).setTranslationKey("iron_spear").setMaxDamage(DamageHandler.iron_spear);
//}
//if (ConfigHandler.diamond_spear){
//	diamond_spear = new BaseSpear(ToolMaterial.DIAMOND).setTranslationKey("diamond_spear").setMaxDamage(DamageHandler.diamond_spear);
//}
//if (ConfigHandler.emerald_spear){
//	emerald_spear = new EmeraldSpear(MaterialHandler.EMERALD).setTranslationKey("emerald_spear").setMaxDamage(DamageHandler.emerald_spear);
//}
//if (ConfigHandler.obsidian_spear){
//	obsidian_spear = new ObsidianSpear(MaterialHandler.OBSIDIAN).setTranslationKey("obsidian_spear").setMaxDamage(DamageHandler.obsidian_spear);
//}
//}
//
