package com.kashdeya.tinyprogressions.blocks.compressed;

import java.util.Random;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BoneBlock extends Block implements IOreDictEntry{
	
	public BoneBlock()
	{
		super(Material.GROUND);
		this.setHardness(0.5F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.GROUND);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setUnlocalizedName("bone_block");
	}
	
	@Override
	public String getOreDictName() {
		return "blockBone";
	}
	
	/**
     * Get the Item that this Block should drop when harvested.
     */
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TechBlocks.bone_block);
    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }
	
	@Override
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.fall(fallDistance, 3.0F);
    }
}
