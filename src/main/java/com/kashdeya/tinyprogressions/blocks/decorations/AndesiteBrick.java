package com.kashdeya.tinyprogressions.blocks.decorations;

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
import net.minecraftforge.common.ToolType;

public class AndesiteBrick extends Block implements IOreDictEntry {
	
	public AndesiteBrick()
    {
        super(Properties.create(Material.ROCK)
        		.hardnessAndResistance(1.5F, 10F)
        		.harvestLevel(1)
        		.harvestTool(ToolType.PICKAXE)
        		.sound(SoundType.STONE));
        
//        this.setCreativeTab(TinyProgressions.tabTP);
//        this.setTranslationKey("andesite_brick");
    }
	
	@Override
	public String getOreDictName() {
		return "stoneAndesiteBrick";
	}
	
	/**
     * Get the Item that this Block should drop when harvested.
     */
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TechBlocks.andesite_brick);
    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }
	
	@Override
    public int quantityDropped(Random rand)
    {
        return 1;
    }
	
	@Override
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.fall(fallDistance, 3.0F);
    }

}
