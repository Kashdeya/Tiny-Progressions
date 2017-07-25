package com.kashdeya.tinyprogressions.blocks.compressed;

import java.util.List;
import java.util.Random;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NetherStarBlock extends Block {
	
	
	public NetherStarBlock()
	{
		super(Material.IRON);
		this.setHardness(2.0F);
	    this.setHarvestLevel("pickaxe", 0);
	    this.setResistance(2000.0F);
		this.setLightOpacity(1);
		this.setSoundType(blockSoundType.STONE);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setUnlocalizedName("netherstar_block");
	}
	
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT_MIPPED;
	}
	
	@Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
    }
	
	@Override
	public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon)
    {
        return true; 
    }
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TechBlocks.netherstar_block);
    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return true;
    }
	
	@Override
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        entityIn.fall(fallDistance, 3.0F);
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag)
    {
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.netherstar_1").getFormattedText());
    }

}
