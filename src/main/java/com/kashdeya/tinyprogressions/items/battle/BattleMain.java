package com.kashdeya.tinyprogressions.items.battle;

import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class BattleMain extends ItemTool {

	protected static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

    public BattleMain(ToolMaterial material, float damage, float speed)
    {
        super(material, EFFECTIVE_ON);
        this.attackDamage = damage;
        this.attackSpeed = speed;
        this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
    }
}
