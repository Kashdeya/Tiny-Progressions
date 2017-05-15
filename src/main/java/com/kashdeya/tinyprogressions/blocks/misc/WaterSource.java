package com.kashdeya.tinyprogressions.blocks.misc;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WaterSource extends Block {
	
	public WaterSource()
    {
        super(Material.IRON);
        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setSoundType(blockSoundType.METAL);
        this.setCreativeTab(tinyprogressions.tabTP);
        this.setUnlocalizedName("water_source");
    }
    
    @SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	@Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
    }
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

		if(heldItem == null) {
			return true;
		}
		else {

			Item item = heldItem.getItem();

			if(item == Items.BUCKET) {

				heldItem.stackSize -= 1;

				if(heldItem.stackSize == 0) {
					playerIn.setHeldItem(hand, new ItemStack(Items.WATER_BUCKET));
				}
				else if(!playerIn.inventory.addItemStackToInventory(new ItemStack(Items.WATER_BUCKET))) {
					playerIn.dropItem(new ItemStack(Items.WATER_BUCKET), false);
				}

				return true;
			}

			return false;
		}
	}
}
