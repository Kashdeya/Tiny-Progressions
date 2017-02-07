package com.kashdeya.tinyprogressions.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.SimpleHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;

public class Recipes {
	
	public static void registerRecipes(){
		
		if (SimpleHandler.MortarPestle == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.UnfiredMortar), new Object[] {"C C", "C C", " C ", 'C', new ItemStack(Items.CLAY_BALL)});
			GameRegistry.addSmelting(TechItems.UnfiredMortar, new ItemStack(TechItems.FiredMortar), 0);
			GameRegistry.addShapelessRecipe(new ItemStack(TechItems.MortarPestle), new Object[] {new ItemStack(TechItems.FiredMortar), new ItemStack(Items.STICK)});
		}
		
		if (SimpleHandler.ItemHammer == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.ItemHammer), new Object[] {"DTI", " S ", 'I', new ItemStack(Items.IRON_INGOT), 'S', new ItemStack(Items.STICK), 'T', new ItemStack(Items.STRING), 'D', new ItemStack(Items.DIAMOND)});
		}
		
		if (SimpleHandler.ItemJuicer == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.ItemJuicer), new Object[] {"P", "S", 'S', new ItemStack(Blocks.STONE, 0, 0), 'P', new ItemStack(Blocks.STONE_PRESSURE_PLATE)});
		}
		
		if (SimpleHandler.ItemKnife == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.ItemKnife), new Object[] {"  I", " E ", "S  ",'I', new ItemStack(Items.IRON_INGOT), 'S', new ItemStack(Items.STICK), 'E', new ItemStack(Items.STRING)});
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.ItemKnife), new Object[] {"I  ", " E ", "  S",'I', new ItemStack(Items.IRON_INGOT), 'S', new ItemStack(Items.STICK), 'E', new ItemStack(Items.STRING)});
		}
		
		if (SimpleHandler.MixingBowl == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.MixingBowl), new Object[] {"B B", "BBB", 'B', new ItemStack(Items.BRICK)});
		}
		
		if (ConfigHandler.SmoothEndStone == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.SmoothEndStone, 4), "nn", "nn", 'n', "endstone"));
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.END_BRICKS, 4), new Object[] {"CC", "CC", 'C', new ItemStack(TechBlocks.SmoothEndStone)});			
		}
		
		if (ConfigHandler.FlintBlock == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.FlintBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.FLINT)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.FLINT, 9), new Object[] {new ItemStack(TechBlocks.FlintBlock)});
		}
		
		if (ConfigHandler.NetherStarBlock == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.NetherStarBlock), "nnn", "nnn", "nnn", 'n', "netherStar"));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_STAR, 9), new Object[] {new ItemStack(TechBlocks.NetherStarBlock)});
		}
		
		if (ConfigHandler.MedKit == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.MedKit), "prp", "rgr", "lrl", 'p', "paper", 'r', "dyeRed", 'g', new ItemStack(Items.SPECKLED_MELON), 'l', "leather"));
		}
		if (ConfigHandler.DiamondApple == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.DiamondApple), "ddd", "dad", "ddd", 'd', "gemDiamond", 'a', new ItemStack(Items.APPLE)));
		}
		
		if (ConfigHandler.AndesiteBrick == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.AndesiteBrick, 4), "cc", "cc", 'c', "stoneAndesitePolished"));
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 6), new Object[] {new ItemStack(TechBlocks.AndesiteBrick)});
		}
		
		if (ConfigHandler.DioriteBrick == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.DioriteBrick, 4), "cc", "cc", 'c', "stoneDioritePolished"));
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 4), new Object[] {new ItemStack(TechBlocks.DioriteBrick)});
		}
		
		if (ConfigHandler.GraniteBrick == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.GraniteBrick, 4), "cc", "cc", 'c', "stoneGranitePolished"));
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 1, 2), new Object[] {new ItemStack(TechBlocks.GraniteBrick)});
		}
		
		if (ConfigHandler.DirtyGlass == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.DirtyGlass, 4), "sgs", "gsg", "sgs", 'g', "blockGlass", 's', new ItemStack(Blocks.SOUL_SAND)));
		}
		
		if (ConfigHandler.BoneBlock == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechBlocks.BoneBlock), "bbb", "bbb", "bbb", 'b', "bone"));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.BONE, 9), new Object[] {new ItemStack(TechBlocks.BoneBlock)});
		}
		
		if (ConfigHandler.MyceliumSeeds == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.MyceliumSeeds), new Object[] {"bbb", "bsb", "bbb", 'b', new ItemStack(Items.SPIDER_EYE), 's', new ItemStack(Items.WHEAT_SEEDS)});
		}
		
		if (ConfigHandler.StoneArmor == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.stoneBoots), "s s", "s s", 's', "stone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.stoneChestplate), "s s", "sss", "sss", 's', "stone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.stoneHelmet), "sss", "s s", 's', "stone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.stoneLeggings), "sss","s s", "s s", 's', "stone"));
		}
		
		if (ConfigHandler.FlintArmor == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.flintBoots), "s s", "s s", 's', "ingotFlint"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.flintChestplate), "s s", "sss", "sss", 's', "ingotFlint"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.flintHelmet), "sss", "s s", 's', "ingotFlint"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.flintLeggings), "sss","s s", "s s", 's', "ingotFlint"));
		}
		
		if (ConfigHandler.BoneArmor == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.boneBoots), "s s", "s s", 's', "blockBone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.boneChestplate), "s s", "sss", "sss", 's', "blockBone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.boneHelmet), "sss", "s s", 's', "blockBone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechArmor.boneLeggings), "sss","s s", "s s", 's', "blockBone"));
		}
		
		if (ConfigHandler.FlintTools == true){
			GameRegistry.addRecipe(new ItemStack(TechTools.FlintAxe), "r", "s", 'r', new ItemStack(TechTools.FlintAxeHead), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.FlintHoe), "r", "s", 'r', new ItemStack(TechTools.FlintHoeHead), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.FlintSword), "r", "s", 'r', new ItemStack(TechTools.FlintSwordHead), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.FlintSpade), "r", "s", 'r', new ItemStack(TechTools.FlintSpadeHead), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.FlintPickaxe), "r", "s", 'r', new ItemStack(TechTools.FlintPickaxeHead), 's', new ItemStack(Items.STICK));
			
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.FlintAxeHead), new Object[]{"EE","E ", 'E', new ItemStack(Items.FLINT)});
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.FlintHoeHead), new Object[]{"EE", 'E', new ItemStack(Items.FLINT)});
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.FlintPickaxeHead), new Object[]{" E", "EE", 'E', new ItemStack(Items.FLINT)});
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.FlintSpadeHead), new Object[]{"E","E", 'E', new ItemStack(Items.FLINT)});
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.FlintSwordHead), new Object[]{" E","E ", 'E', new ItemStack(Items.FLINT)});
			
			GameRegistry.addSmelting(TechBlocks.FlintBlock, new ItemStack(TechItems.FlintIngot), 1.0F);
		}
		
		if (ConfigHandler.BoneTools == true){
			GameRegistry.addRecipe(new ItemStack(TechTools.BoneAxe), "r", "s", 'r', new ItemStack(TechTools.BoneAxeHead), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.BoneHoe), "r", "s", 'r', new ItemStack(TechTools.BoneHoeHead), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.BoneSword), "r", "s", 'r', new ItemStack(TechTools.BoneSwordHead), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.BoneSpade), "r", "s", 'r', new ItemStack(TechTools.BoneSpadeHead), 's', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(TechTools.BonePickaxe), "r", "s", 'r', new ItemStack(TechTools.BonePickaxeHead), 's', new ItemStack(Items.STICK));
			
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.BoneAxeHead), new Object[]{"EE","E ", 'E', new ItemStack(Items.BONE)});
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.BoneHoeHead), new Object[]{"EE", 'E', new ItemStack(Items.BONE)});
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.BonePickaxeHead), new Object[]{" E","EE", 'E', new ItemStack(Items.BONE)});
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.BoneSpadeHead), new Object[]{"E","E", 'E', new ItemStack(Items.BONE)});
			GameRegistry.addShapedRecipe(new ItemStack(TechTools.BoneSwordHead), new Object[]{" E","E ", 'E', new ItemStack(Items.BONE)});
		}
		
		if (ConfigHandler.FleshBlock == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.FleshBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.ROTTEN_FLESH)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH, 9), new Object[] {new ItemStack(TechBlocks.FleshBlock)});
		}
		
		if (ConfigHandler.NotchApple == true){
			GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[] {"ggg", "gag", "ggg", 'a', new ItemStack(Items.APPLE), 'g', new ItemStack(Blocks.GOLD_BLOCK)});
		}
		
		if (ConfigHandler.CharcoalBlock == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.CharcoalBlock), new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.COAL, 1, 1)});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 9, 1), new Object[] {new ItemStack(TechBlocks.CharcoalBlock)});
		}
		
		if (ConfigHandler.BirthdayPickaxe == true){
			ItemStack BirthdayPickaxe;
			BirthdayPickaxe  = new ItemStack(TechItems.BirthdayPickaxe);
			BirthdayPickaxe.addEnchantment(Enchantments.MENDING, 1);
			GameRegistry.addShapedRecipe(BirthdayPickaxe, new Object[] {"rdr", " i ", " i ", 'r', new ItemStack(TechBlocks.ReinforcedObsidian), 'i', new ItemStack(Items.STICK), 'd', new ItemStack(Items.DIAMOND)});
		}
		
		if (ConfigHandler.ReinforcedGlass == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.ReinforcedGlass, 4), "ogo", "gog", "ogo", 'g', new ItemStack(TechBlocks.DirtyGlass), 'o', new ItemStack(Blocks.OBSIDIAN));
		}
		
		if (ConfigHandler.ReinforcedObsidian == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.ReinforcedObsidian, 4), "ioi", "oio", "ioi", 'o', new ItemStack(Blocks.OBSIDIAN), 'i', new ItemStack(Blocks.IRON_BARS));
		}
		
		if (ConfigHandler.QuartzKnife == true){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.QuartzKnife), "  s", " s ", "q  ", 's', "stickWood", 'q', "gemQuartz"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TechItems.QuartzDust), "s", "q",  's', new ItemStack(TechItems.QuartzKnife), 'q', "gemQuartz"));
		}
		
		if (ConfigHandler.WateringCan == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.WateringCan), new Object[]{"ID ", "IWI", " I ", 'I', new ItemStack(Items.IRON_INGOT), 'D', new ItemStack(Items.DYE, 1, 15), 'W', new ItemStack(Items.WATER_BUCKET)});
		}
		
		if (ConfigHandler.WateringCanUpgrade == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechItems.WateringCanUpgrade), new Object[]{"ON ", "OWO", " O ", 'O', new ItemStack(Blocks.OBSIDIAN), 'W', new ItemStack(TechItems.WateringCan), 'N', new ItemStack(Items.NETHER_STAR)});
		}
		
		if (ConfigHandler.BlockGrowth == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.growth_block), new Object[] {"IBI", "DED", "IBI", 'I', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(TechBlocks.BoneBlock), 'E', new ItemStack(Blocks.SEA_LANTERN), 'D', new ItemStack(TechBlocks.DirtyGlass)});
		}
		
		if (ConfigHandler.BlockGrowthUpgrade == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.growth_upgrade), new Object[] {"CWC", "SES", "CNC", 'W', new ItemStack(TechItems.WateringCanUpgrade), 'N', new ItemStack(TechBlocks.NetherStarBlock), 'C', new ItemStack(TechBlocks.ReinforcedObsidian), 'S', new ItemStack(Items.END_CRYSTAL), 'E', new ItemStack(TechBlocks.growth_block)});
		}
		
		if (ConfigHandler.BlockGrowthUpgradeTwo == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.growth_upgrade_two), new Object[] {" g ", "gdg", " g ", 'g', new ItemStack(TechBlocks.growth_upgrade), 'd', new ItemStack(Blocks.DRAGON_EGG)});
		}
		
		if (ConfigHandler.Cobblegen == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.cobblegen_block), new Object[] {"CCC", "WGL", "CCC", 'C', new ItemStack(Blocks.COBBLESTONE), 'G', new ItemStack(Blocks.GLASS), 'W', new ItemStack(Items.WATER_BUCKET), 'L', new ItemStack(Items.LAVA_BUCKET)});
		}
		
		if (ConfigHandler.IronCobblegen == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.iron_cobblegen_block), new Object[] {"III", "IGI", "III", 'I', new ItemStack(Items.IRON_INGOT), 'G', new ItemStack(TechBlocks.cobblegen_block)});
		}
		
		if (ConfigHandler.DiamondCobblegen == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.diamond_cobblegen_block), new Object[] {"DDD", "DGD", "DDD", 'D', new ItemStack(Items.DIAMOND), 'G', new ItemStack(TechBlocks.iron_cobblegen_block)});
		}
		
		if (ConfigHandler.BlazeCobblegen == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.blaze_cobblegen_block), new Object[] {"DDD", "DGD", "DDD", 'D', new ItemStack(Items.BLAZE_ROD), 'G', new ItemStack(TechBlocks.diamond_cobblegen_block)});
		}
		
		if (ConfigHandler.EmeraldCobblegen == true){
			GameRegistry.addShapedRecipe(new ItemStack(TechBlocks.emerald_cobblegen_block), new Object[] {"DDD", "DGD", "DDD", 'D', new ItemStack(Items.EMERALD), 'G', new ItemStack(TechBlocks.blaze_cobblegen_block)});
		}
	}

}
