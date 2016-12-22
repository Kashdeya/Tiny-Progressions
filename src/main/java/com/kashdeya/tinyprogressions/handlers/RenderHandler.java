package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class RenderHandler {

    public static void initBlocks() {


        InventoryBlockRender(TechBlocks.growth_block, "growth_block");
        InventoryBlockRender(TechBlocks.growth_upgrade, "growth_upgrade");
        InventoryBlockRender(TechBlocks.cobblegen_block, "cobblegen_block");
        InventoryBlockRender(TechBlocks.iron_cobblegen_block, "iron_cobblegen_block");
        InventoryBlockRender(TechBlocks.diamond_cobblegen_block, "diamond_cobblegen_block");
        InventoryBlockRender(TechBlocks.emerald_cobblegen_block, "emerald_cobblegen_block");
        InventoryBlockRender(TechBlocks.blaze_cobblegen_block, "blaze_cobblegen_block");
        InventoryBlockRender(TechBlocks.CharcoalBlock, "CharcoalBlock");
        InventoryBlockRender(TechBlocks.FleshBlock, "FleshBlock");
        InventoryBlockRender(TechBlocks.ReinforcedGlass, "ReinforcedGlass");
        InventoryBlockRender(TechBlocks.ReinforcedObsidian, "ReinforcedObsidian");


    }

    public static void preInitBlocks() {
        if (TechBlocks.growth_upgrade != null)
            setCustomStateMap(TechBlocks.growth_upgrade, new StateMap.Builder().ignore(new IProperty[]{BlockLiquid.LEVEL}).build());
    }

    public static void initItems() {
        InventoryItemRender(TechItems.WateringCan, "WateringCan");
        InventoryItemRender(TechItems.WateringCanUpgrade, "WateringCanUpgrade");
        InventoryItemRender(TechItems.QuartzDust, "QuartzDust");
        InventoryItemRender(TechItems.QuartzKnife, "QuartzKnife");
        InventoryItemRender(TechItems.BirthdayPickaxe, "BirthdayPickaxe");
    }

    public static void initArmor() {
        InventoryItemRender(TechArmor.stoneHelmet, "stoneHelmet");
        InventoryItemRender(TechArmor.stoneChestplate, "stoneChestplate");
        InventoryItemRender(TechArmor.stoneLeggings, "stoneLeggings");
        InventoryItemRender(TechArmor.stoneBoots, "stoneBoots");
    }

    public static void InventoryBlockRender(Block block, String blockName) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + blockName, "inventory"));
    }

    public static void InventoryItemRender(Item item, String itemName) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + itemName, "inventory"));
    }

    public static void setCustomStateMap(Block block, StateMap stateMap) {
        ModelLoader.setCustomStateMapper(block, stateMap);
    }

}
