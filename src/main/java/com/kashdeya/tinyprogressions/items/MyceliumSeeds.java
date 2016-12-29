package com.kashdeya.tinyprogressions.items;

import java.util.List;

import com.kashdeya.tinyprogressions.main.tinyprogressions;
import com.kashdeya.tinyprogressions.util.InventoryHelper;

import net.minecraft.block.BlockDirt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MyceliumSeeds extends Item {
	
	public MyceliumSeeds(){
		super();
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setUnlocalizedName("MyceliumSeeds");
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		if (worldIn.getBlockState(pos).getBlock() == Blocks.DIRT && worldIn.getBlockState(pos).getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.DIRT) {
			worldIn.setBlockState(pos, Blocks.MYCELIUM.getDefaultState(), 2);
			worldIn.playSound(null, pos, SoundEvents.BLOCK_GRASS_HIT, SoundCategory.BLOCKS, 0.3f, 1.5f);
			InventoryHelper.consumeItem(playerIn, stack);
			return EnumActionResult.SUCCESS;
		}
		return EnumActionResult.PASS;
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced){
      tooltip.add("Right Click on Dirt!");
      super.addInformation(stack, player, tooltip, advanced);
    }

}
