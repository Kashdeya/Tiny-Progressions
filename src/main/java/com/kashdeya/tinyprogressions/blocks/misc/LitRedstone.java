package com.kashdeya.tinyprogressions.blocks.misc;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class LitRedstone extends Block{
	
	public LitRedstone(){
		super(Material.REDSTONE_LIGHT);
		this.setHardness(1.5F);
        this.setSoundType(blockSoundType.GLASS);
        this.setLightLevel(1.0F);
        this.setCreativeTab(tinyprogressions.tabTP);
        this.setUnlocalizedName("lit_redstone_lamp");
		
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TechBlocks.lit_redstone_lamp);
    }
	
	@Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(TechBlocks.lit_redstone_lamp);
    }
	
	@Override
    protected ItemStack createStackedBlock(IBlockState state)
    {
        return new ItemStack(TechBlocks.lit_redstone_lamp);
    }
    
    @Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }
    
    @Override
    public boolean canSilkHarvest()
    {
        return true;
    }
}
