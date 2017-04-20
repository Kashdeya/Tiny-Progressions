package com.kashdeya.tinyprogressions.items.battle;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class BattleMain extends ItemTool {

	protected static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] { Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE });

    public BattleMain(ToolMaterial material, float damage, float speed)
    {
        super(material, EFFECTIVE_ON);
        this.damageVsEntity = damage;
        this.attackSpeed = speed;
        this.setCreativeTab(tinyprogressions.tabTP);
		this.setMaxStackSize(1);
    }

	public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }
}
