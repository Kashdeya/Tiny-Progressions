package com.kashdeya.tinyprogressions.blocks.decorations;

import java.util.Random;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class HardenedStoneSmallBricks extends Block {
	
	public HardenedStoneSmallBricks()
    {
        super(Material.ROCK);
        this.setHardness(50.0F);
        this.setHarvestLevel("pickaxe", 0);
        this.setResistance(1750.0F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setUnlocalizedName("hardened_stone_smallbricks");
    }
	
	/**
     * Get the Item that this Block should drop when harvested.
     */
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TechBlocks.hardened_stone_smallbricks);
    }
	
    /**
     * Determines if this block is can be destroyed by the specified entities normal behavior.
     *
     * @param state The current state
     * @param world The current world
     * @param pos Block position in world
     * @return True to allow the ender dragon to destroy this block
     */
    public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity)
    {
        if (entity instanceof net.minecraft.entity.boss.EntityDragon)
        {
            return this != TechBlocks.hardened_stone_smallbricks;
        }
        else if ((entity instanceof net.minecraft.entity.boss.EntityWither) ||
                 (entity instanceof net.minecraft.entity.projectile.EntityWitherSkull))
        {
            return net.minecraft.entity.boss.EntityWither.canDestroyBlock(this);
        }

        return true;
    }
	
	@Override
    public int quantityDropped(Random rand)
    {
        return 1;
    }

}
