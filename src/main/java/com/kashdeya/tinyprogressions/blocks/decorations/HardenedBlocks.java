package com.kashdeya.tinyprogressions.blocks.decorations;

import java.util.Random;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class HardenedBlocks extends Block{
	
	private int meta;
	private int least_quantity;
	private int most_quantity;
	
	private HardenedBlocks(String unlocalizedName, Material mat, Block drop, int meta, int least_quantity, int most_quantity) {
		super(mat);
		this.meta = meta;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
		this.setHardness(50.0f);
		this.setUnlocalizedName(unlocalizedName);
		this.setHarvestLevel("pickaxe", 1);
        this.setResistance(2000.0F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(TinyProgressions.tabTP);
	}
	
	public HardenedBlocks(String unlocalizedName, Material mat, Block drop, int least_quantity, int most_quantity) {
		this(unlocalizedName, mat, drop, 0, least_quantity, most_quantity);
	}

	protected HardenedBlocks(String unlocalizedName, Material mat, Block drop) {
		this(unlocalizedName, mat, drop, 1, 1);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

	@Override
	public int damageDropped(IBlockState blockstate) {
		return this.meta;
	}

	@Override
	public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
		if (this.least_quantity >= this.most_quantity)
			return this.least_quantity;
		return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}
	
	@Override
    public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity)
    {
      return !(entity instanceof EntityCreeper);
    }
    
    @Override
    public void onBlockExploded(World world, BlockPos pos, Explosion explosion) {}
    
    @Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
      return false;
    }

}
