package com.kashdeya.tinyprogressions.blocks.integration;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class MoltendirtBlock extends Block{
	
	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
	
    public MoltendirtBlock()
    {
        super(Material.GROUND);
        this.setHardness(1.0F);
        this.setResistance(0.05F);
        this.setTickRandomly(true);
        this.setCreativeTab(tinyprogressions.tabTP);
        this.setSoundType(blockSoundType.STONE);
    }
    
    @SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}
	
	@Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }
    
    @Override
    public boolean canSilkHarvest()
    {
        return false;
    }
    
    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te, ItemStack stack)
    {
        player.addStat(StatList.getBlockStats(this));
        player.addExhaustion(0.025F);
        
        super.breakBlock(worldIn, pos, state);
        Block b = Block.getBlockFromName("tconstruct:molten_dirt");
        b = b != null? b : Blocks.DIRT;
        worldIn.setBlockState(pos, b.getDefaultState());
        
    }
    
    @Override
    public int quantityDropped(Random random)
    {
        return 0;
    }
    
    @Override
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.fall(fallDistance, 3.0F);
    }
    
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
    	entityIn.motionX *= 0.8D;
        entityIn.motionZ *= 0.8D;
        entityIn.setFire(5);
    }
    
    @Override
    public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, com.google.common.base.Predicate<IBlockState> target)
    {
        return false;
    }
}