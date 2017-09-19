package com.kashdeya.tinyprogressions.blocks.decorations;

import java.util.Random;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.tiles.TileEntityWithered;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WitheredBlock extends Block {
	
    public WitheredBlock()
    {
        super(Material.ROCK);
        this.setBlockUnbreakable();
        this.setResistance(6000000.0F);
        this.setSoundType(blockSoundType.STONE);
        this.setCreativeTab(TinyProgressions.tabTP);
        this.setUnlocalizedName("withered_block");
        this.disableStats();
    }
    
    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        return new TileEntityWithered();
    }
    
    @Override
    public int quantityDropped(Random random)
    {
        return 0;
    }

    @Override
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return null;
    }
    
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {    	
        if (entityIn instanceof EntityPlayer)
        {
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.WITHER, 120, 0, true, true));
        }

        super.onEntityWalk(worldIn, pos, entityIn);
    }
    
    @Override
	public boolean canCreatureSpawn(IBlockState state, IBlockAccess world, BlockPos pos, EntityLiving.SpawnPlacementType type) {
		return true;
	}
    
}
