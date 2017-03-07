package com.kashdeya.tinyprogressions.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class ReinforcedObsidian extends Block {
	
	public ReinforcedObsidian()
    {
        super(Material.ANVIL);
        this.setHardness(30.0F);
        this.setResistance(2000.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setSoundType(blockSoundType.ANVIL);
        this.setCreativeTab(tinyprogressions.tabTP);
        this.setUnlocalizedName("reinforced_obsidian");
    }
	
	@Override
	public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity)
    {
      return !(entity instanceof EntityWither);
    }
	
	@Override
	public void onBlockExploded(World world, BlockPos pos, Explosion explosion) {}
	  
	@Override
	public boolean canDropFromExplosion(Explosion explosionIn)
	{
		return false;	
	}

    /**
     * Get the MapColor for this Block and the given BlockState
     */
    @Override
    public MapColor getMapColor(IBlockState state)
    {
        return MapColor.BLACK;
    }
    
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag)
    {
		list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.obsidian_1").getFormattedText());
    }

}
