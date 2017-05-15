package com.kashdeya.tinyprogressions.blocks.glowstone;

import java.util.Random;

import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;

public class Red extends Block
{
    public Red()
    {
        super(Material.GLASS);
        this.setHardness(0.3F);
        this.setSoundType(blockSoundType.GLASS);
        this.setLightLevel(1.0F);
        this.setCreativeTab(tinyprogressions.tabTP);
        this.setUnlocalizedName("red_glowstone");
    }
    
	@Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
		return false;
    }
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

	@Override
    protected boolean canSilkHarvest()
    {
        return true;
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return MathHelper.clamp_int(this.quantityDropped(random) + random.nextInt(fortune + 1), 1, 4);
    }

    @Override
    public int quantityDropped(Random random)
    {
        return 2 + random.nextInt(3);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return TechItems.red_dust;
    }

    @Override
    public MapColor getMapColor(IBlockState state)
    {
        return MapColor.RED;
    }
}
