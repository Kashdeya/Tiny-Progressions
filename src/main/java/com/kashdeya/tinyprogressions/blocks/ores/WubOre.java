package com.kashdeya.tinyprogressions.blocks.ores;

import java.util.Random;

import com.google.common.base.Predicate;
import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import javafx.geometry.Side;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WubOre extends StandardBlock implements IOreDictEntry {
	
    public WubOre()
    {
        super(Material.ROCK);
        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setTranslationKey("wub_ore");
    }
    
	@Override
	public String getOreDictName() {
		return "oreWubOre";
	}
    
    @Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
    }
    
	@Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
    
    @Override
    public int quantityDropped(Random rand) {
        return 1 + rand.nextInt(2);
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return TechItems.wub_gem;
    }
    
    @Override
    public int quantityDroppedWithBonus(int fortune, Random rand) {
    	return MathHelper.clamp(this.quantityDropped(rand) + rand.nextInt(fortune + 1), 1, 6);
    }
    

    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        return (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this)) ? (1 + RANDOM.nextInt(5)) : 0;
    }
    
    @Override
    public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, Predicate<IBlockState> target)
    {
        return false;
    }
}
