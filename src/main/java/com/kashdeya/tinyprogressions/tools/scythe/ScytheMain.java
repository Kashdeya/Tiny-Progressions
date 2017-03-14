package com.kashdeya.tinyprogressions.tools.scythe;

import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class ScytheMain extends ItemSword {
	
	public ScytheMain(ToolMaterial material){
		super(material);
		this.setCreativeTab(tinyprogressions.tabTP);
		this.setMaxStackSize(1);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	  {
	    for (int i = -1; i < 2; i++) {
	      for (int j = -1; j < 2; j++)
	      {
	        BlockPos blockState = new BlockPos(pos.add(i, 0, j));
	        if ((worldIn.getBlockState(blockState).getBlock() instanceof IGrowable))
	        {
	          IGrowable cropBlock = (IGrowable)worldIn.getBlockState(blockState).getBlock();
	          IBlockState cropState = worldIn.getBlockState(blockState);
	          if (!cropBlock.canGrow(worldIn, blockState, cropState, false))
	          {
	            worldIn.destroyBlock(blockState, true);
	            worldIn.setBlockState(blockState, cropState.getBlock().getDefaultState());
	            stack.setItemDamage(stack.getItemDamage() + 1);
	            if (stack.getItemDamage() >= stack.getMaxDamage())
	            {
	              playerIn.setHeldItem(hand, null);
	              return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	            }
	          }
	        }
	      }
	    }
	    return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	  }
}
