package com.kashdeya.tinyprogressions.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.world.Explosion;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class CharcoalBlock extends Block{
	
	public CharcoalBlock()
	{
		super(Material.ROCK);
	    this.setHardness(1F);
		this.setResistance(10.0F);
		this.setHarvestLevel("pickaxe", 0);
		this.setSoundType(blockSoundType.STONE);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("charcoal_block");
	}
	
	/**
     * Get the Item that this Block should drop when harvested.
     */
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TechBlocks.CharcoalBlock);
    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }
	
}